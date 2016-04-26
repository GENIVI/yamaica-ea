/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.franca

import de.bmw.yamaica.ea.core.containers.EAElementContainer
import de.bmw.yamaica.ea.core.containers.EAPackageContainer
import de.bmw.yamaica.ea.core.franca.exceptions.DataTypeParentException
import de.bmw.yamaica.ea.core.franca.exceptions.InterfaceParentException

import static extension de.bmw.yamaica.ea.core.franca.EAContainerExtensions.*

class EAModelValidator
{
    static val INVALID_CLASS_ELEMENT_MESSAGE = "The element has no valid stereotype (%s)! Adding stereotype «nofidl» is recommended."
    static val INVALID_INTERFACE_PARENT_MESSAGE = "The element must be a child of a «fidl» package!"
    static val INVALID_DATA_TYPE_PARENT_MESSAGE = "The element must be a child of either an interface, a «fidl» package or a package " +
        "within a «fidl» package with no \"FIDL-Namespace-Prefix\" tagged value!"

    extension EAIssueLogger logger
    extension EA2FrancaUtils transformationUtils

    new(EAIssueLogger logger, EA2FrancaUtils transformationUtils)
    {
        this.logger = logger
        this.transformationUtils = transformationUtils
    }

    def boolean isValidElement(EAElementContainer element)
    {
        switch element
        {
            case element.type.equals(EAElementContainer.Type.CLASS): return element.isValidDataType
            case element.type.equals(EAElementContainer.Type.INTERFACE): return element.isValidInterface
        }
        return false
    }

    def boolean isValidDataType(EAElementContainer element)
    {
        if(element.francaDataType.equals(EAFrancaDataType.UNDEFINED))
        {
            addIssue(null, element, INVALID_CLASS_ELEMENT_MESSAGE, element.stereotypes.toString())
            return false
        }

        val parent = element.parent

        switch parent
        {
            EAElementContainer: return element.isValidDataTypeWithinInterface(parent)
            EAPackageContainer: return element.isValidDataTypeWithinTypeCollection(parent)
        }
        return false
    }

    def boolean isValidInterface(EAElementContainer element)
    {
        if(!element.parent.equals(element.fidlPackage))
        {
            addIssue(typeof(InterfaceParentException), element, INVALID_INTERFACE_PARENT_MESSAGE)
            return false;
        }
        return true
    }

    //
    // Internal validation methods.
    //
    def private boolean isValidDataTypeWithinInterface(EAElementContainer element, EAElementContainer parentElement)
    {
        if(!parentElement.type.equals(EAElementContainer.Type.INTERFACE))
        {
            addIssue(typeof(DataTypeParentException), element, INVALID_DATA_TYPE_PARENT_MESSAGE, element.namespace)
            return false
        }
        return true
    }

    def private boolean isValidDataTypeWithinTypeCollection(EAElementContainer element, EAPackageContainer parentPackage)
    {
        if(!parentPackage.isFidlPackage && !parentPackage.isTypeCollectionPackage)
        {
            addIssue(typeof(DataTypeParentException), element, INVALID_DATA_TYPE_PARENT_MESSAGE)
            return false
        }
        return true
    }
}
