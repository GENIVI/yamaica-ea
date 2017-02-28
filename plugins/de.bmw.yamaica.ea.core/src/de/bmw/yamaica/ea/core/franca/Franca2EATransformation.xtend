/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.franca

import de.bmw.yamaica.ea.core.EAConstants
import de.bmw.yamaica.ea.core.containers.EAAttributeContainer
import de.bmw.yamaica.ea.core.containers.EAConnectorContainer
import de.bmw.yamaica.ea.core.containers.EAContainerWithElements
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace
import de.bmw.yamaica.ea.core.containers.EADiagramContainer
import de.bmw.yamaica.ea.core.containers.EAElementContainer
import de.bmw.yamaica.ea.core.containers.EAMethodContainer
import de.bmw.yamaica.ea.core.containers.EAPackageContainer
import de.bmw.yamaica.ea.core.containers.EAParameterContainer
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer
import java.util.Collection
import java.util.LinkedHashMap
import java.util.List
import java.util.Map
import java.util.Set
import java.util.logging.Level
import java.util.logging.Logger
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path
import org.franca.core.franca.FAnnotationBlock
import org.franca.core.franca.FAnnotationType
import org.franca.core.franca.FArgument
import org.franca.core.franca.FArrayType
import org.franca.core.franca.FAttribute
import org.franca.core.franca.FBasicTypeId
import org.franca.core.franca.FBroadcast
import org.franca.core.franca.FEnumerationType
import org.franca.core.franca.FEnumerator
import org.franca.core.franca.FField
import org.franca.core.franca.FInterface
import org.franca.core.franca.FMapType
import org.franca.core.franca.FMethod
import org.franca.core.franca.FModel
import org.franca.core.franca.FStructType
import org.franca.core.franca.FType
import org.franca.core.franca.FTypeCollection
import org.franca.core.franca.FTypeDef
import org.franca.core.franca.FTypeRef
import org.franca.core.franca.FUnionType
import org.franca.core.franca.FVersion

import static extension de.bmw.yamaica.ea.core.franca.EAContainerExtensions.*
import static extension de.bmw.yamaica.franca.common.core.FrancaUtils.*
import java.util.HashMap

class Franca2EATransformation
{
    private val static Logger      LOGGER                      = Logger.getLogger(typeof(Franca2EATransformation).name)

    val models = new LinkedHashMap<FModel, EAPackageContainer>
    val dataTypes = new LinkedHashMap<FType, EAElementContainer>
    val interfaces = new LinkedHashMap<FInterface, EAElementContainer>
    val clientInterfaces = new LinkedHashMap<FInterface, EAElementContainer>
    val EARepositoryContainer repository
    val EAPackageContainer prefixPackage
    val Map<String, String> fileNameCache = new HashMap<String, String>
    var Map<FModel, String> modelfileNameCache


    // GLIPCI-307 / GLIPCI-417 related. Required to deleted outdated interfaces/typeCollections.
    // Could probably be replaced by existing maps?
    val Set<EAElementContainer> uniqueInterfaces = newHashSet()
    val Set<EAPackageContainer> uniqueTypeCollections = newHashSet()

    new(Collection<FModel> models, EARepositoryContainer repository, IPath namespacePrefix)
    {
        models.forEach[
            val fileNameWithoutFileExt = eResource.URI.trimFileExtension.lastSegment
            fileNameCache.put(fileNameWithoutFileExt.toLowerCase(), fileNameWithoutFileExt)
        ]

        modelfileNameCache = new HashMap<FModel, String>
        models.forEach[
            val fileNameWithoutFileExt = eResource.URI.trimFileExtension.lastSegment
            modelfileNameCache.put(it, fileNameWithoutFileExt)
        ]

        models.forEach[model|this.models.put(model, null)]
        this.repository = repository
        this.prefixPackage = transformNamespace(namespacePrefix)
    }

    def void transformModels()
    {
        LOGGER.log(Level.FINEST, "Start transforming models..")

        models.entrySet.forEach[entry|entry.value = entry.key.transformModel]
    }

    def void transformDataTypes()
    {
        LOGGER.log(Level.FINEST, "Start transforming data types..")

        models.forEach [ francaModel, eaPackage |
            francaModel.typeCollections.forEach[typeCollection|
                val current = eaPackage.transformTypeCollection(typeCollection, francaModel)
                if(!uniqueTypeCollections.contains(current)) {
                    uniqueTypeCollections.add(current)
                }
            ]
            francaModel.interfaces.forEach[interface_|
                val current = eaPackage.transformInterface(interface_)
                if(!uniqueInterfaces.contains(current)) {
                    uniqueInterfaces.add(current)
                }
                interfaces.put(interface_, current)
            ]
        ]

        val Set<EAContainerWithNamespace> files = newHashSet
        uniqueInterfaces.forEach[inf|files.add(inf.parent)]
        uniqueTypeCollections.forEach[tc|files.add(tc)]

        // In case of current package does not hold the STEREOTYPE_FIDL: Add parent package as well!
        val Set<EAContainerWithNamespace> tmp = newHashSet
        files.filter[!stereotypes.contains(EAFrancaConstants.STEREOTYPE_FIDL)].forEach[tmp.add(it.parent)]
        files.addAll(tmp)

        // Clean up: Removing outdated/previous data.
        files.forEach[if(it instanceof EAPackageContainer) cleanUp]

        LOGGER.log(Level.FINER, "Finished with clean up!")
    }

    // Probably there exist a deletion problem: If type (e.g. typedef) will be removed before referenced types (e.g. methods using this typedef). May raise the following message:
    // "This is probably due the fact that the database of Enterprise Architect is inconsistent. A possible solution is to reset all  references to other UML elements of this element."
    private def void cleanUp(EAPackageContainer parent) {
        LOGGER.log(Level.FINER, "Cleaning up: " + parent)
        parent.elements.forEach[
            LOGGER.log(Level.FINER, "element: " + it.name)
            if(!uniqueInterfaces.contains(it)) {
                // Deleting outdated elements (types of anonymous typeCollection, interfaces and client-interfaces)
                LOGGER.log(Level.FINER, "Deleting outdated element: " + it.name)
                it.delete
            }
        ]
        parent.packages.forEach[
            LOGGER.log(Level.FINER, "package: " + it.name)
            if(!uniqueTypeCollections.contains(it)) {
                LOGGER.log(Level.FINER, "Deleting outdated package: " + it.name)
                it.delete
            }
        ]
    }

    def void transformCrossReferences()
    {
        LOGGER.log(Level.FINEST, "Start transforming cross references..")

        dataTypes.keySet.forEach[francaType|francaType.transformDataTypeCrossReferences]
        interfaces.keySet.forEach[francaInterface|francaInterface.transformInterfaceCrossReferences]
        clientInterfaces.keySet.forEach[francaInterface|francaInterface.transformClientInterfaceCrossReferences]
    }

    def void generateDiagrams()
    {
        LOGGER.log(Level.FINEST, "Start generating of diagrams..")

        models.values.toSet.forEach [ eaPackage |
            val diagram = eaPackage.getOrCreateDiagram(eaPackage.name, EADiagramContainer.Type.CLASS)
            eaPackage.elements.forEach [ element |
                diagram.getOrCreateDiagramObject(element)
            ]
            eaPackage.elements.filter[type.equals(EAElementContainer.Type.INTERFACE)].forEach [ interfaces |
                interfaces.elements.forEach [ element |
                    diagram.getOrCreateDiagramObject(element)
                ]
            ]
            eaPackage.packages.filter[isTypeCollectionPackage].forEach [ typeCollections |
                typeCollections.elements.forEach [ element |
                    diagram.getOrCreateDiagramObject(element)
                ]
            ]
            diagram.layout
        ]
    }

    // Special case produced by GLIPCI-655:
    // If we got FModel with exact one named typeCollection (without interfaces) and the name of the typeCollection is equals (case sensitive!) the file name:
    // Switch the stereotype FIDL of to its child package!
    // TODO: RENAME!
    private def String getSingleNamedTypeCollection(FModel model) {
        val allTypeCollection = model.typeCollections
        if(allTypeCollection.size == 1 && !allTypeCollection.get(0).name.isNullOrEmpty && model.interfaces.isEmpty) {
            val namedTypeCollection = allTypeCollection.get(0).name.toString
            val originFileName = fileNameCache.get(namedTypeCollection.toLowerCase)
            if(namedTypeCollection.equals(originFileName)) {
                LOGGER.log(Level.FINEST, String.format("Convert named typeCollection to anonymous typeCollection! namedTypeCollection: %s, originFileName: %s", namedTypeCollection, originFileName))
                return namedTypeCollection
            }
        }
        return null
    }

    //
    // Internal transformation methods.
    //
    private def EAPackageContainer transformModel(FModel model)
    {
        var IPath modelPackagePathOrigin = new Path(model.name.namespace2PathString)

        val namedTypeCollection = model.getSingleNamedTypeCollection
        if(!namedTypeCollection.isNullOrEmpty) {
            modelPackagePathOrigin = modelPackagePathOrigin.append(namedTypeCollection)
        }

        val originalFileName = if (modelfileNameCache != null) modelfileNameCache.get(model) else null

        // Removing last segment. Lower casing the whole path and append last segment afterwards.
        var lastSegment = modelPackagePathOrigin.lastSegment
        if (isChangePackageName(lastSegment, originalFileName))
            lastSegment = originalFileName
        val modelPackagePath =new Path(modelPackagePathOrigin.removeLastSegments(1).toString.toLowerCase).append(lastSegment)

        if(modelPackagePath.segmentCount == 1)
        {
            return prefixPackage.transformNamespace(modelPackagePath, false) => [
                stereotypes = #[EAFrancaConstants.STEREOTYPE_ROOT, EAFrancaConstants.STEREOTYPE_FIDL]
                isNamespaceRoot = true
                name = name
            ]
        }
        else
        {
            return (prefixPackage.transformNamespace(modelPackagePath.uptoSegment(1), true) => [
            	stereotypes = EAFrancaConstants.STEREOTYPE_ROOT
            	isNamespaceRoot = true
            ]).transformNamespace(modelPackagePath.removeFirstSegments(1), false) => [
                stereotypes = EAFrancaConstants.STEREOTYPE_FIDL
                if (isChangePackageName(name, originalFileName))
                    name = originalFileName
                else
                    name = name
            ]
        }
    }

    private def boolean isChangePackageName(String packageName, String originalFileName)
    {
        return originalFileName != null && !originalFileName.equals(packageName) && originalFileName.equalsIgnoreCase(packageName);
    }

    private def EAPackageContainer transformNamespace(IPath namespace)
    {
        if(namespace.segmentCount() > 0)
        {
            return repository.getOrCreateModel(EA2FrancaUtils.lastNamespaceSegmentNaming(fileNameCache, namespace)).transformNamespace(namespace.removeFirstSegments(1), true)
        }
        return null
    }

    private def EAPackageContainer transformNamespace(EAPackageContainer eaPackage, IPath namespace, boolean root)
    {
        if(!root && namespace.segmentCount() == 1) {
            // Capitalize the name. Must be created correctly due to getOrCreateMethod wouldn't detect overloading methods.
            return eaPackage.getOrCreatePackage(EA2FrancaUtils.lastNamespaceSegmentNaming(fileNameCache, namespace).toFirstUpper) => [
                version = null
                author = null
            ]
        }
        else if(namespace.segmentCount() > 0)
        {
            return eaPackage.getOrCreatePackage(EA2FrancaUtils.lastNamespaceSegmentNaming(fileNameCache, namespace)).transformNamespace(namespace.removeFirstSegments(1), root) => [
                version = null
                author = null
            ]
        }
        return eaPackage
    }

    private def EAPackageContainer transformTypeCollection(EAPackageContainer parent, FTypeCollection typeCollection, FModel fmodel)
    {
        // Anonymous typeCollection in case of unset name OR produced by FIDL-Anonymous-TypeCollection=False.
        return (if(typeCollection.name.isNullOrEmpty || !fmodel.singleNamedTypeCollection.isNullOrEmpty) parent else parent.getOrCreatePackage(typeCollection.name)) => [
            typeCollection.types.forEach[type|
                val transformedDataType = transformDataType(type)
                uniqueInterfaces.add(transformedDataType)
                dataTypes.put(type,transformedDataType)
            ]
            version = typeCollection.version.transformVersion
            author = typeCollection.comment.transformAnnotation(FAnnotationType.AUTHOR)
            notes = typeCollection.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
        ]
    }

    private def EAElementContainer transformInterface(EAPackageContainer parent, FInterface francaInterface)
    {
        return parent.getOrCreateElement(francaInterface.name, EAElementContainer.Type.INTERFACE) => [
            // Clean up first.
            LOGGER.log(Level.FINER, "Deleting all elements of: " + name);

            // Transforming all datatypes and adding to the dataTypes-map.
            francaInterface.types.forEach[type|dataTypes.put(type, transformDataType(type))]
            stereotypes = EAFrancaConstants.STEREOTYPE_FRANCA_SERVICE_INTERFACE
            version = francaInterface.version.transformVersion
            author = francaInterface.comment.transformAnnotation(FAnnotationType.AUTHOR)
            notes = francaInterface.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
            // Either broadcasts or no noSubscriptions attributes (same filter as in 'transformClientInterfaceCrossReferences') must be available.
            if(!francaInterface.broadcasts.isEmpty || !francaInterface.attributes.filter[attribute|!attribute.noSubscriptions].isEmpty)
            {
                val clientInterface = parent.transformClientInterface(francaInterface)
                uniqueInterfaces.add(clientInterface)
                val clientInterfaceConnector = clientInterface.getOrCreateConnector("", EAConnectorContainer.Type.ASSOCIATION, it)
                clientInterfaceConnector.stereotypes = EAFrancaConstants.STEREOTYPE_FRANCA_INTERFACE
                clientInterfaceConnector.direction = EAConnectorContainer.Direction.UNSPECIFIED

                clientInterfaces.put(francaInterface, clientInterface)
            }
        ]
    }

    private def EAElementContainer transformClientInterface(EAPackageContainer parent, FInterface francaInterface)
    {
        return parent.getOrCreateElement(francaInterface.name + EAFrancaConstants.CLIENT_INTERFACE_NAME_SUFFIX,
            EAElementContainer.Type.INTERFACE) => [
            stereotypes = EAFrancaConstants.STEREOTYPE_FRANCA_CLIENT_INTERFACE
            version = francaInterface.version.transformVersion
            author = francaInterface.comment.transformAnnotation(FAnnotationType.AUTHOR)
            notes = francaInterface.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
        ]
    }

    private def void transformInterfaceCrossReferences(FInterface francaInterface)
    {
        interfaces.get(francaInterface) => [
            // Memorizing all actual added methods/attributes.
            val List<EAMethodContainer> actualAddedMethods = newArrayList()
            val List<EAAttributeContainer> actualAddedAttributes = newArrayList()

            francaInterface.methods.forEach[method|actualAddedMethods.add(transformMethod(method))]
            francaInterface.attributes.forEach[attribute|actualAddedAttributes.add(transformAttribute(attribute))]
            baseElement = interfaces.get(francaInterface.base)

            // Delete old methods and attributes.
            methods.filter[method|!actualAddedMethods.contains(method)].forEach[method|LOGGER.log(Level.FINER, "Deleting method: " + method.name); method.delete]
            attributes.filter[attr|!actualAddedAttributes.contains(attr)].forEach[attr|LOGGER.log(Level.FINER, "Deleting attribute: " + attr.name); attr.delete]

            // Each interface may manages any number of interfaces.
            francaInterface.managedInterfaces.filter[interfaces.containsKey(it)].forEach[managedInterface|
                val connector = getOrCreateConnector("", EAConnectorContainer.Type.ASSOCIATION, interfaces.get(managedInterface))
                connector.stereotypes = EAFrancaConstants.STEREOTYPE_MANAGES
                connector.direction = EAConnectorContainer.Direction.SOURCE_TO_DESTINATION

                // Switch client and supplier.
                val tmp = connector.client
                connector.client = connector.supplier
                connector.supplier = tmp
            ]
        ]
    }

    private def void transformClientInterfaceCrossReferences(FInterface francaInterface)
    {
        clientInterfaces.get(francaInterface) => [
            // Clean up first.
            LOGGER.log(Level.FINER, "Deleting all attributes and methods of: " + name);
            deleteAllAttributes
            deleteAllMethods

            francaInterface.broadcasts.forEach[broadcast|transformBroadcast(broadcast)]

            // Each attribute will be transformed to a callback method (skip all 'noSubscriptions' attributes. Using the same filter as in 'transformInterface').
            francaInterface.attributes.filter[attribute|!attribute.noSubscriptions].forEach[attribute|transformAttributeToCallbackMethod(attribute)]
            baseElement = clientInterfaces.get(francaInterface.base)
        ]
    }

    private def EAElementContainer transformDataType(EAContainerWithElements parent, FType francaType)
    {
        switch francaType
        {
            FTypeDef: return parent.transformTypeDef(francaType)
            FArrayType: return parent.transformArrayType(francaType)
            FEnumerationType: return parent.transformEnumerationType(francaType)
            FStructType: return parent.transformStructType(francaType)
            FUnionType: return parent.transformUnionType(francaType)
            FMapType: return parent.transformMapType(francaType)
        }
    }

    private def void transformDataTypeCrossReferences(FType francaType)
    {
        switch francaType
        {
            FTypeDef: transformTypeDefCrossReferences(francaType)
            FArrayType: transformArrayTypeCrossReferences(francaType)
            FEnumerationType: transformEnumerationTypeCrossReferences(francaType)
            FStructType: transformStructTypeCrossReferences(francaType)
            FUnionType: transformUnionTypeCrossReferences(francaType)
            FMapType: transformMapTypeCrossReferences(francaType)
        }
    }

    private def EAElementContainer transformTypeDef(EAContainerWithElements parent, FTypeDef typeDef)
    {
        return parent.getOrCreateElement(typeDef.name, EAElementContainer.Type.CLASS) => [
            stereotypes = EAFrancaConstants.STEREOTYPE_TYPEDEF
            version = null
            author = null
            notes = typeDef.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
        ]
    }

    private def void transformTypeDefCrossReferences(FTypeDef typeDef)
    {
        dataTypes.get(typeDef) => [
            val francaTypeRef = typeDef.actualType
            val eaElement = dataTypes.get(francaTypeRef.derived)
            if(null != eaElement)
            {
                baseElement = eaElement
            }
            else
            {
                genlinks = francaTypeRef.predefined.createGenLinksString
            }
        ]
    }

    private def EAElementContainer transformArrayType(EAContainerWithElements parent, FArrayType arrayType)
    {
        return parent.getOrCreateElement(arrayType.name, EAElementContainer.Type.CLASS) => [
            stereotypes = EAFrancaConstants.STEREOTYPE_ARRAY
            version = null
            author = null
            notes = arrayType.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
        ]
    }

    private def void transformArrayTypeCrossReferences(FArrayType arrayType)
    {
        dataTypes.get(arrayType) => [
            val francaTypeRef = arrayType.elementType
            val eaElement = dataTypes.get(francaTypeRef.derived)
            if(null != eaElement)
            {
                eaElement.getOrCreateConnector("", EAConnectorContainer.Type.ASSOCIATION, it) => [
                    stereotypes = EAFrancaConstants.STEREOTYPE_ARRAF_OF
                    direction = EAConnectorContainer.Direction.SOURCE_TO_DESTINATION
                ]
            }
            else
            {
                genlinks = francaTypeRef.predefined.createGenLinksString
            }
        ]
    }

    private def EAElementContainer transformEnumerationType(EAContainerWithElements parent, FEnumerationType enumerationType)
    {
        return parent.getOrCreateElement(enumerationType.name, EAElementContainer.Type.CLASS) => [
            stereotypes = EAFrancaConstants.STEREOTYPE_FRANCA_ENUM
            version = null
            author = null
            notes = enumerationType.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
        ]
    }

    private def void transformEnumerationTypeCrossReferences(FEnumerationType enumerationType)
    {
        dataTypes.get(enumerationType) => [
            // Clean up first.
            LOGGER.log(Level.FINER, "Deleting all attributes of: " + name);
            deleteAllAttributes;

            enumerationType.enumerators.forEach[francaEnumerator|transformEnumerator(francaEnumerator)]
            baseElement = dataTypes.get(enumerationType.base)
        ]
    }

    private def EAElementContainer transformStructType(EAContainerWithElements parent, FStructType structType)
    {
        return parent.getOrCreateElement(structType.name, EAElementContainer.Type.CLASS) => [
            stereotypes = if(structType.isPolymorphic) EAFrancaConstants.STEREOTYPE_POLYMORPHIC_STRUCT else EAFrancaConstants.STEREOTYPE_STRUCT
            version = null
            author = null
            notes = structType.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
        ]
    }

    private def void transformStructTypeCrossReferences(FStructType structType)
    {
        dataTypes.get(structType) => [
            // Clean up first.
            LOGGER.log(Level.FINER, "Deleting all attributes of: " + name);
            deleteAllAttributes;

            structType.elements.forEach[francaField|transformField(francaField)]
            baseElement = dataTypes.get(structType.base)
        ]
    }

    private def EAElementContainer transformUnionType(EAContainerWithElements parent, FUnionType unionType)
    {
        return parent.getOrCreateElement(unionType.name, EAElementContainer.Type.CLASS) => [
            stereotypes = EAFrancaConstants.STEREOTYPE_UNION
            version = null
            author = null
            notes = unionType.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
        ]
    }

    private def void transformUnionTypeCrossReferences(FUnionType unionType)
    {
        dataTypes.get(unionType) => [
            // Clean up first.
            LOGGER.log(Level.FINER, "Deleting all attributes of: " + name);
            deleteAllAttributes;

            unionType.elements.forEach[francaField|transformField(francaField)]
            baseElement = dataTypes.get(unionType.base)
        ]
    }

    private def EAElementContainer transformMapType(EAContainerWithElements parent, FMapType mapType)
    {
        return parent.getOrCreateElement(mapType.name, EAElementContainer.Type.CLASS) => [
            stereotypes = EAFrancaConstants.STEREOTYPE_MAP
            version = null
            author = null
            notes = mapType.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
        ]
    }

    private def void transformMapTypeCrossReferences(FMapType mapType)
    {
        dataTypes.get(mapType) => [
            // Clean up first.
            LOGGER.log(Level.FINER, "Deleting all attributes of: " + name);
            deleteAllAttributes;

            getOrCreateAttribute(EAFrancaConstants.STEREOTYPE_KEY) => [
                stereotypes = EAFrancaConstants.STEREOTYPE_KEY
                type = mapType.keyType.typeName
                typeElement = mapType.keyType.EAElementContainer
            ]
            getOrCreateAttribute(EAFrancaConstants.STEREOTYPE_VALUE) => [
                stereotypes = EAFrancaConstants.STEREOTYPE_VALUE
                type = mapType.valueType.typeName
                typeElement = mapType.valueType.EAElementContainer
            ]
        ]
    }

    private def EAAttributeContainer transformEnumerator(EAElementContainer parent, FEnumerator enumerator)
    {
        LOGGER.log(Level.FINEST, String.format("Get or create attribute: %s", enumerator.name))

        return parent.getOrCreateAttribute(enumerator.name) => [
            type = FBasicTypeId.STRING.literal
            LOGGER.log(Level.FINEST, String.format("^default: %s, enumerator.value.enumeratorValue: %s", ^default, enumerator.value.enumeratorValue))
            ^default = enumerator.value.enumeratorValue
            notes = enumerator.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
        ]
    }

    private def EAAttributeContainer transformField(EAElementContainer parent, FField field)
    {
        return parent.getOrCreateAttribute(field.name) => [
            type = field.type.typeName
            typeElement = field.type.EAElementContainer
            notes = field.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
            isCollection = field.array
        ]
    }

    private def EAAttributeContainer transformAttribute(EAElementContainer parent, FAttribute attribute)
    {
        return parent.getOrCreateAttribute(attribute.name) => [
            stereotypes = attribute.stereotype
            type = attribute.type.typeName
            typeElement = attribute.type.EAElementContainer
            notes = attribute.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
            isCollection = attribute.array
        ]
    }

    // Transforming attribute to callback method (skip all 'noSubscriptions' attributes).
    private def EAMethodContainer transformAttributeToCallbackMethod(EAElementContainer parent, FAttribute attribute)
    {
        val method =  parent.getOrCreateMethod(attribute.name + EAFrancaConstants.CALLBACK_METHOD_NAME_SUFFIX) => [
            stereotypes = EAFrancaConstants.STEREOTYPE_CALLBACK
            notes = attribute.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
        ]

        method.getOrCreateParameter(attribute.name) => [
                stereotypes = if(attribute.array) EAFrancaConstants.STEREOTYPE_ARRAY else null
                kind = EAParameterContainer.Kind.IN
                type = attribute.type.typeName
                typeElement = attribute.type.EAElementContainer
                notes = attribute.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
            ]
        return method
    }

    private def void setEAParameter(EAMethodContainer eaMethod, FMethod fmethod) {

        // May differs:
            // - notes
            // - name of parameters (in / out)
            // - error
        eaMethod.notes = fmethod.comment.transformAnnotation(FAnnotationType.DESCRIPTION)

        val lambdaInput = compareParameter(EAParameterContainer.Kind.IN)

        fmethod.inArgs.forEach[fInputPara, index|
            eaMethod.parameters.exists[eaPara|
                val boolean exists = lambdaInput.apply(fInputPara, eaPara) && index == eaPara.position
                if(exists) {
                    eaPara.setEAParameters(EAParameterContainer.Kind.IN, fInputPara)
                }
                exists
            ]
        ]
        val lambdaOutput = compareParameter(EAParameterContainer.Kind.OUT)

        fmethod.outArgs.forEach[fOutputPara, index|
            eaMethod.parameters.exists[eaPara|
                val boolean exists = lambdaOutput.apply(fOutputPara, eaPara) && index == eaPara.position
                if(exists) {
                    eaPara.setEAParameters(EAParameterContainer.Kind.OUT, fOutputPara)
                }
                exists
            ]
        ]
    }

    private def void setEAParameter(EAMethodContainer eaMethod, FBroadcast fbroadcast) {

        eaMethod.notes = fbroadcast.comment.transformAnnotation(FAnnotationType.DESCRIPTION)

        val lambda = compareParameter(EAParameterContainer.Kind.IN)

        fbroadcast.outArgs.forEach[fOutputPara, index|
            eaMethod.parameters.exists[eaPara|
                val exists = lambda.apply(fOutputPara, eaPara) && index == eaPara.position
                if(exists) {
                    eaPara.setEAParameters(EAParameterContainer.Kind.IN, fOutputPara)
                }
                exists
            ]
        ]
    }

    private def boolean compareInput(FMethod fmethod, EAMethodContainer eaMethod) {
        // In case both are empty.
        if(fmethod.inArgs.isEmpty && eaMethod.parameters.filter[eaPara|eaPara.isEAParameter(EAParameterContainer.Kind.IN)].isEmpty) {
            return true
        }
        val eaParaInner = eaMethod.parameters
        val eaParaOuter = eaMethod.parameters.filter[kind == EAParameterContainer.Kind.IN]

        return compareParameters(fmethod.inArgs, eaParaInner, eaParaOuter, EAParameterContainer.Kind.IN)
    }

    private def boolean compareParameters(List<FArgument> francaArguments, Iterable<EAParameterContainer> eaParaInner, Iterable<EAParameterContainer> eaParaOuter, EAParameterContainer.Kind direction ) {

        val paraCompare = compareParameter(direction)

        val Map<FArgument, Integer> francaArgsMap = new LinkedHashMap
        francaArguments.forEach[fOutputPara, index|francaArgsMap.put(fOutputPara, index)]

        // Each inArgs-FMethod parameter shall be existing in EAMethod.
        val findingFrancaArgsInEA = francaArgsMap.filter[fOutputPara, index|
            // DO NOT FILTER! Problem: If one method will be extended by another there will be two finds!
            val foundExisting = eaParaInner.filter[eaPara|paraCompare.apply(fOutputPara, eaPara)]
            if(foundExisting.isEmpty) {
                true
            } else {
                if(foundExisting.length == 1) {
                    foundExisting.head.position != index
                } else {
                    foundExisting.filter[index == position].length != 1
                }
            }
        ]

        if(!findingFrancaArgsInEA.isEmpty) {
            return false
        }

        // Each input-EAMethod parameter shall be existing in inArgs-FMethod.
        // Must be prefiltered due to broadcast parameters does have the direction IN as well.
        val findingEAParaInFranca = eaParaOuter.filter[eaPara|
            // DO NOT FILTER! Problem: If one method will be extended by another there will be two findings!
            val foundExisting = francaArgsMap.filter[fOutputPara, index|paraCompare.apply(fOutputPara, eaPara)]
            if(foundExisting.isEmpty) {
                true
            } else {
                if(foundExisting.size == 1) {
                    foundExisting.entrySet.get(0).value != eaPara.position
                } else {
                    foundExisting.filter[fOutputPara, index|index == eaPara.position].size != 1
                }
            }
        ]
        return findingEAParaInFranca.isEmpty
    }

    // Comparing condition for comparing EA parameter with Franca parameter.
    // Does not compare parameter names due to probably have been changed.
    private def compareParameter(EAParameterContainer.Kind direction) {
        [FArgument fPara, EAParameterContainer eaPara|
            // - eaPara.position
            eaPara.isEAParameter(direction) && fPara.type.typeName.equals(eaPara.type) && fPara.array == eaPara.hasStereotype(EAFrancaConstants.STEREOTYPE_ARRAY)
        ]
    }

    private def boolean compareOutput(FMethod fmethod, EAMethodContainer eaMethod) {
        // In case both is empty.
        if(fmethod.outArgs.isEmpty && eaMethod.parameters.filter[isEAParameter(EAParameterContainer.Kind.OUT)].isEmpty) {
            return true
        }

        val eaParaInner = eaMethod.parameters
        val eaParaOuter = eaMethod.parameters.filter[kind == EAParameterContainer.Kind.OUT && !stereotypes.contains(EAFrancaConstants.STEREOTYPE_ERROR)]

        return compareParameters(fmethod.outArgs, eaParaInner, eaParaOuter, EAParameterContainer.Kind.OUT)
    }

    private def boolean isEAParameter(EAParameterContainer eaPara, EAParameterContainer.Kind direction) {
        eaPara.kind == direction && eaPara.stereotypes.hasValidParamterStereotypes
    }

    private def boolean compareBroadcast(FBroadcast fbroadcast, EAMethodContainer eaMethod) {
         val eaOutPara = eaMethod.parameters.filter[isEAParameter(EAParameterContainer.Kind.IN)]

        // In case both is empty.
        if(fbroadcast.outArgs.isEmpty && eaOutPara.isEmpty) {
            return true
        }

        val allEAParamters = eaMethod.parameters
        return compareParameters(fbroadcast.outArgs, allEAParamters, allEAParamters, EAParameterContainer.Kind.IN)
    }

    // Finding already existing method (comparing input, output and error parameter).
    private def EAMethodContainer findExistingEAMethodContainer(EAElementContainer parent, FMethod fmethod) {
        // Filter all EA methods by name, methods stereotype (could be STEREOTYPE_METHOD_FIRE_AND_FORGET or STEREOTYPE_METHOD),
        // And searching for methods with identically parameters (in and out)!
        // Comparing errors is not necessary!
        val existingMethods = parent.methods.filter[eaMethod|
            eaMethod.name.equals(fmethod.name) && eaMethod.stereotypes.contains(fmethod.stereotype) && fmethod.compareInput(eaMethod) && fmethod.compareOutput(eaMethod)
        ]

        if(!existingMethods.isEmpty) {
            // Several appearances already exist.
            if(existingMethods.length > 1) {
                LOGGER.log(Level.WARNING, String.format("Transformed method (%s) does already exist several times. Expected exact one appearance. %s", fmethod.fullyQualifiedName, existingMethods.map[myToString]))
                return null // Shall not happen. Export method multiply times!
            }
            return existingMethods.head
        }
        return null
    }

    // Finding already existing broadcast (comparing output parameter).
    private def EAMethodContainer findExistingEABroadcastContainer(EAElementContainer parent, FBroadcast fbroadcast) {
        // Filter all EA methods by name,  methods stereotype (could be STEREOTYPE_BROADCAST_SELECTIVE or STEREOTYPE_BROADCAST)
        // and search for broadcasts with identically output parameters (remember: Defined as INPUT in EA!))!
        val existingBroadcasts = parent.methods.filter[eaMethods|
            eaMethods.name.equals(fbroadcast.name) && eaMethods.stereotypes.contains(fbroadcast.stereotype) && fbroadcast.compareBroadcast(eaMethods)
        ]

        if(!existingBroadcasts.isEmpty) {
            // Several appearances already exist.
            if(existingBroadcasts.length > 1) {
                LOGGER.log(Level.WARNING, String.format("Transformed broadcast (%s) does already exist several times. Expected exact one appearance. %s", fbroadcast.fullyQualifiedName, existingBroadcasts.map[myToString]))
                return null // Shall not happen. Export broadcast multiply times!
            }
            return existingBroadcasts.head
        }
        return null
    }

    private def EAMethodContainer transformMethod(EAElementContainer parent, FMethod method)
    {
        // Search for already existing method.
        val existingMethod = parent.findExistingEAMethodContainer(method)
        if(existingMethod != null) {
            existingMethod.setEAParameter = method

            // Delete if method contains errors.
            try {
                val list = existingMethod.parameters.filter[stereotypes.contains(EAFrancaConstants.STEREOTYPE_ERROR)]
                if(list.isEmpty) {
                    // EA does not contain error definition yet. Check if Franca files defines any.
                    if(null != method.errors)
                    {
                        method.errors.enumerators.forEach[enumerator|existingMethod.transformErrorParamenter(enumerator)]

                        val errorBaseEnum = method.errors.base
                        if(null != errorBaseEnum)
                        {
                            existingMethod.transformErrorParamenter(errorBaseEnum)
                        }
                    }
                    val errorEnum = method.errorEnum
                    if(null != errorEnum)
                    {
                        existingMethod.transformErrorParamenter(errorEnum)
                    }
                    return existingMethod
                }
                // Contains errors. Try to delete and create new one!
                parent.deleteMethod(existingMethod)
            }
            catch(Exception e) {
                LOGGER.log(Level.SEVERE, e.message)
                e.printStackTrace
            }
        }

        return parent.createMethod(method.name) => [
            stereotypes = method.stereotype
            notes = method.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
            method.inArgs.forEach[arg, index|transformParamenter(arg, EAParameterContainer.Kind.IN, index)]
            method.outArgs.forEach[arg, index|transformParamenter(arg, EAParameterContainer.Kind.OUT, index)]
            val errors = method.errors
            if(null != errors)
            {
                errors.enumerators.forEach[enumerator|transformErrorParamenter(enumerator)]

                val errorBaseEnum = errors.base
                if(null != errorBaseEnum)
                {
                    transformErrorParamenter(errorBaseEnum)
                }
            }
            val errorEnum = method.errorEnum
            if(null != errorEnum)
            {
                transformErrorParamenter(errorEnum)
            }
        ]
    }

    private def String myToString(EAMethodContainer eaMethodContainer) {
        return String.format("name: '%s', stereotypes: '%s', comment: '%s', parameters: '%s'", eaMethodContainer.name, eaMethodContainer.stereotypes, eaMethodContainer.notes,
            eaMethodContainer.parameters.map[p|String.format("name: '%s', type: '%s', comment: '%s', kind: '%s', stereotypes: '%s', pos: %d", p.name, p.type, p.notes, p.kind, p.stereotypes, p.position)]
        )
    }

    private def EAMethodContainer transformBroadcast(EAElementContainer parent, FBroadcast broadcast)
    {
        // Search for already existing method.
        val existingBroadcast = parent.findExistingEABroadcastContainer(broadcast)
        if(existingBroadcast != null) {
            existingBroadcast.setEAParameter = broadcast
            return existingBroadcast
        }

        return parent.createMethod(broadcast.name) => [
            stereotypes = broadcast.stereotype
            notes = broadcast.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
            broadcast.outArgs.forEach[arg, index|transformParamenter(arg, EAParameterContainer.Kind.IN, index)]
        ]
    }

    // Stereotypes of a parameter. See also transformParamenter.
    private def boolean hasValidParamterStereotypes(List<String> stereotypes) {
        return stereotypes.isEmpty || stereotypes.contains(EAFrancaConstants.STEREOTYPE_ARRAY)
    }

    // Without default, type and typeElement (depends on enumerator OR enumerationType).
    private def void setEAParameters(EAParameterContainer eaPara, EAParameterContainer.Kind direction, FArgument argument) {
        eaPara => [
            name = argument.name
            stereotypes = if(argument.array) EAFrancaConstants.STEREOTYPE_ARRAY else null
            kind = direction
            type = argument.type.typeName
            typeElement = argument.type.EAElementContainer
            notes = argument.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
        ]
    }

    private def EAParameterContainer transformParamenter(EAMethodContainer parent, FArgument argument,
        EAParameterContainer.Kind direction, int index)
    {
        return parent.getOrCreateParameter(argument.name) => [
            setEAParameters(it, direction, argument)
            position = index
        ]
    }

    private def void setEAErrorParamenter(EAParameterContainer eaPara, FAnnotationBlock  annotationBlock) {
        eaPara => [
            stereotypes = EAFrancaConstants.STEREOTYPE_ERROR
            kind = EAParameterContainer.Kind.OUT
            notes = annotationBlock.transformAnnotation(FAnnotationType.DESCRIPTION)
        ]
    }

    private def void setEAErrorParamenter(EAParameterContainer eaPara, FEnumerator enumerator) {
        eaPara => [
            setEAErrorParamenter(enumerator.comment)
            ^default = enumerator.value.enumeratorValue
        ]
    }

    private def void setEAErrorParamenter(EAParameterContainer eaPara, FEnumerationType enumerationType) {
        eaPara => [
            setEAErrorParamenter(enumerationType.comment)
            type = enumerationType.name
            typeElement = dataTypes.get(enumerationType)
        ]
    }

    private def EAParameterContainer transformErrorParamenter(EAMethodContainer parent, FEnumerator enumerator)
    {
        return parent.getOrCreateParameter(enumerator.name) => [
            setEAErrorParamenter(it, enumerator)
        ]
    }

    private def EAParameterContainer transformErrorParamenter(EAMethodContainer parent, FEnumerationType enumerationType)
    {
        return parent.getOrCreateParameter(enumerationType.name) => [
            setEAErrorParamenter(it, enumerationType)
        ]
    }

    private def String transformVersion(FVersion version)
    {
        if(null != version)
        {
            return version.major + "." + version.minor
        }
        return null
    }

    private def String transformAnnotation(FAnnotationBlock annotationBlock, FAnnotationType annotationType)
    {
        // Combining all @description elements together.
        if(annotationType == FAnnotationType.DESCRIPTION) {
            return transformDescriptions(annotationBlock)
        }

        if(null != annotationBlock && null != annotationType)
        {
            val annotation = annotationBlock.elements.findFirst[type == annotationType]

            return if(null != annotation) annotation.comment else null
        }

        return null
    }

    private def String transformDescriptions(FAnnotationBlock annotationBlock)
    {
        if(null != annotationBlock && null != FAnnotationType.DESCRIPTION)
        {
            val descriptionBuilder = new StringBuilder()

            annotationBlock.elements.filter[type == FAnnotationType.DESCRIPTION].forEach[
                // Represents array of lines of one @description element. Note: Carriage return (\r) is required here.
                val descriptions = comment.split("\\r?\\n")

                if(!descriptions.isEmpty) {
                    descriptions.forEach[
                        descriptionBuilder.append(trim)
                        // Note: Carriage return (\r) is required here.
                        descriptionBuilder.append("\r\n")
                    ]
                }
            ]
            val descriptionResult = descriptionBuilder.toString.trim

            return if(descriptionResult.length > 0) descriptionResult else null
        }
        return null
    }

    //
    // Internal helper methods.
    //
    private def String getStereotype(FAttribute attribute)
    {
        if(attribute.readonly && attribute.noSubscriptions)
        {
            return EAFrancaConstants.STEREOTYPE_ATTRIBUTE_READ_ONLY_NO_SUBSCRIPTIONS
        }
        if(attribute.readonly)
        {
            return EAFrancaConstants.STEREOTYPE_ATTRIBUTE_READ_ONLY
        }
        if(attribute.noSubscriptions)
        {
            return EAFrancaConstants.STEREOTYPE_ATTRIBUTE_NO_SUBSCRIPTIONS
        }

        return EAFrancaConstants.STEREOTYPE_ATTRIBUTE
    }

    private def String getStereotype(FMethod method)
    {
        return if(method.fireAndForget)
            EAFrancaConstants.STEREOTYPE_METHOD_FIRE_AND_FORGET
        else
            EAFrancaConstants.STEREOTYPE_METHOD
    }

    private def String getStereotype(FBroadcast broadcast)
    {
        return if(broadcast.selective)
            EAFrancaConstants.STEREOTYPE_BROADCAST_SELECTIVE
        else
            EAFrancaConstants.STEREOTYPE_BROADCAST
    }

    private def EAElementContainer getEAElementContainer(FTypeRef typeRef)
    {
        val francaType = typeRef.derived

        if(null != francaType)
        {
            return dataTypes.get(francaType)
        }

        return null
    }

    private def String getTypeName(FTypeRef typeRef)
    {
        val francaType = typeRef.derived

        if(null != francaType)
        {
            return francaType.name
        }

        return typeRef.predefined.literal
    }

    private def String createGenLinksString(FBasicTypeId basicTypeId)
    {
        return EAConstants.GENLINK_PARENT + "=" + basicTypeId.literal + ";"
    }

    private def EAConnectorContainer setBaseElement(EAElementContainer element, EAElementContainer baseElement)
    {
        if(null != baseElement)
        {
            return baseElement.getOrCreateConnector("", EAConnectorContainer.Type.GENERALIZATION, element)
        }

        return null
    }
}
