/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.franca

import de.bmw.yamaica.ea.core.containers.EAContainerWithElements
import de.bmw.yamaica.ea.core.containers.EAElementContainer
import de.bmw.yamaica.ea.core.containers.EAPackageContainer
import de.bmw.yamaica.ea.core.franca.exceptions.AutoImportException
import java.util.Collection
import java.util.LinkedHashSet

import static extension de.bmw.yamaica.ea.core.franca.EAContainerExtensions.*

class EADependencyDiscoverer
{
    public static val AUTO_IMPORT_MESSAGE = "The element \"%s\" which should be imported is not inside of a package with stereotype «fidl»!"

    extension EAIssueLogger logger
    extension EA2FrancaUtils transformationUtils
    extension EAModelValidator modelValidator

    new(EAIssueLogger logger, EA2FrancaUtils transformationUtils)
    {
        this.logger = logger
        this.transformationUtils = transformationUtils
        this.modelValidator = new EAModelValidator(logger, transformationUtils)
    }

    /**
     * Returns a list with all elements within a package or an element (search is done recursively). Recursion
     * stops if child package has stereotype fidl or nofidl. Elements (and its child elements) are ignored too if
     * it has stereotype nofidl.
     */
    def Collection<EAElementContainer> getPackageElements(EAContainerWithElements container2Scan)
    {
        val elements = new LinkedHashSet<EAElementContainer>

        container2Scan.elements.filter [
            !hasStereotype(EAFrancaConstants.STEREOTYPE_NO_FIDL) && isValidElement
        ].forEach [
            elements.add(it)
            elements.addAll(packageElements)
        ]

        if(container2Scan instanceof EAPackageContainer)
        {
            container2Scan.packages.filter [
                !hasStereotype(EAFrancaConstants.STEREOTYPE_NO_FIDL) && !hasStereotype(EAFrancaConstants.STEREOTYPE_FIDL)
            ].forEach [
                elements.addAll(packageElements)
            ]
        }
        return elements
    }

    /**
     * Returns a list with all elements which are needed by the referred package but are not a member of the
     * referred package (e.g. base classes or base interfaces).
     */
    def Collection<EAElementContainer> getExternalPackageElements(EAPackageContainer fidlPackage2Scan)
    {
        val externalElements = new LinkedHashSet<EAElementContainer>

        fidlPackage2Scan.packageElements.forEach [ packageElement |
            switch packageElement
            {
                case packageElement.type.equals(EAElementContainer.Type.CLASS):
                    externalElements.addExternalTypeElements(packageElement, fidlPackage2Scan)
                case packageElement.type.equals(EAElementContainer.Type.INTERFACE):
                    externalElements.addExternalInterfaceElements(packageElement, fidlPackage2Scan)
            }
        ]
        return externalElements
    }

    def private void addExternalTypeElements(Collection<EAElementContainer> externalElements, EAElementContainer element2Scan,
        EAPackageContainer fidlPackage2Scan)
    {
        switch element2Scan.francaDataType
        {
            case EAFrancaDataType.TYPEDEF: externalElements.addExternalTypeDefElements(element2Scan, fidlPackage2Scan)
            case EAFrancaDataType.ARRAY: externalElements.addExternalArrayTypeElements(element2Scan, fidlPackage2Scan)
            case EAFrancaDataType.ENUMERATION: externalElements.addExternalEnumerationTypeElements(element2Scan, fidlPackage2Scan)
            case EAFrancaDataType.STRUCT: externalElements.addExternalStructTypeElements(element2Scan, fidlPackage2Scan)
            case EAFrancaDataType.UNION: externalElements.addExternalUnionTypeElements(element2Scan, fidlPackage2Scan)
            case EAFrancaDataType.MAP: externalElements.addExternalMapTypeElements(element2Scan, fidlPackage2Scan)
            case UNDEFINED: {}
        }
    }

    def private void addExternalTypeDefElements(Collection<EAElementContainer> externalElements, EAElementContainer element2Scan,
        EAPackageContainer fidlPackage2Scan)
    {
        externalElements.addExternalBaseTypeElement(element2Scan, fidlPackage2Scan)
    }

    def private void addExternalArrayTypeElements(Collection<EAElementContainer> externalElements, EAElementContainer element2Scan,
        EAPackageContainer fidlPackage2Scan)
    {
        externalElements.addExternalElement(element2Scan.arrayTypeElement, fidlPackage2Scan)
    }

    def private void addExternalEnumerationTypeElements(Collection<EAElementContainer> externalElements, EAElementContainer element2Scan,
        EAPackageContainer fidlPackage2Scan)
    {
        externalElements.addExternalBaseTypeElement(element2Scan, fidlPackage2Scan)
    }

    def private void addExternalStructTypeElements(Collection<EAElementContainer> externalElements, EAElementContainer element2Scan,
        EAPackageContainer fidlPackage2Scan)
    {
        externalElements.addExternalBaseTypeElement(element2Scan, fidlPackage2Scan)
        externalElements.addExternalAttributeElements(element2Scan, fidlPackage2Scan)
    }

    def private void addExternalUnionTypeElements(Collection<EAElementContainer> externalElements, EAElementContainer element2Scan,
        EAPackageContainer fidlPackage2Scan)
    {
        externalElements.addExternalBaseTypeElement(element2Scan, fidlPackage2Scan)
        externalElements.addExternalAttributeElements(element2Scan, fidlPackage2Scan)
    }

    def private void addExternalMapTypeElements(Collection<EAElementContainer> externalElements, EAElementContainer element2Scan,
        EAPackageContainer fidlPackage2Scan)
    {
        externalElements.addExternalAttributeElements(element2Scan, fidlPackage2Scan)
    }

    def private void addExternalInterfaceElements(Collection<EAElementContainer> externalElements, EAElementContainer element2Scan,
        EAPackageContainer fidlPackage2Scan)
    {
        externalElements.addExternalBaseInterfaceElement(element2Scan, fidlPackage2Scan)
        externalElements.addExternalAttributeElements(element2Scan, fidlPackage2Scan)
        externalElements.addExternalMethodElements(element2Scan, fidlPackage2Scan)
    }

    def private void addExternalMethodElements(Collection<EAElementContainer> externalElements, EAElementContainer element2Scan,
        EAPackageContainer fidlPackage2Scan)
    {
        element2Scan.methods.forEach [ method |
            method.parameters.map[typeElement].forEach[typeElement|externalElements.addExternalElement(typeElement, fidlPackage2Scan)]
            externalElements.addExternalElement(method.returnTypeElement, fidlPackage2Scan)
        ]
    }

    def private void addExternalAttributeElements(Collection<EAElementContainer> externalElements, EAElementContainer element2Scan,
        EAPackageContainer fidlPackage2Scan)
    {
        element2Scan.attributes.map[typeElement].forEach[typeElement|externalElements.addExternalElement(typeElement, fidlPackage2Scan)]
    }

    def private void addExternalBaseTypeElement(Collection<EAElementContainer> externalElements, EAElementContainer element2Scan,
        EAPackageContainer fidlPackage2Scan)
    {
        externalElements.addExternalElement(element2Scan.baseElement, fidlPackage2Scan)
    }

    def private void addExternalBaseInterfaceElement(Collection<EAElementContainer> externalElements, EAElementContainer element2Scan,
        EAPackageContainer fidlPackage2Scan)
    {
        element2Scan.baseElement => [ baseElement |
            if(null != baseElement)
            {
                if(!baseElement.isClientFrancaInterfaceElement)
                {
                    externalElements.addExternalElement(baseElement, fidlPackage2Scan)
                }
                else
                {
                    externalElements.addExternalElement(baseElement.oppositeFrancaInterfaceElement, fidlPackage2Scan)
                }
            }
        ]
    }

    def private void addExternalElement(Collection<EAElementContainer> externalElements, EAElementContainer element2Add,
        EAPackageContainer fidlPackage2Scan)
    {
        if(null != element2Add)
        {
            val fidlPackageOfElement2Scan = element2Add.fidlPackage

            if(null == fidlPackageOfElement2Scan)
            {
                addIssue(typeof(AutoImportException), fidlPackage2Scan, AUTO_IMPORT_MESSAGE, element2Add.namespace)
            }

            if(fidlPackage2Scan.equals(fidlPackageOfElement2Scan) == false)
            {
                externalElements.add(element2Add)
            }
        }
    }
}
