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
import de.bmw.yamaica.ea.core.containers.EADiagramContainer
import de.bmw.yamaica.ea.core.containers.EAElementContainer
import de.bmw.yamaica.ea.core.containers.EAMethodContainer
import de.bmw.yamaica.ea.core.containers.EAPackageContainer
import de.bmw.yamaica.ea.core.containers.EAParameterContainer
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer
import java.util.Collection
import java.util.LinkedHashMap
import java.util.Map
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

class Franca2EATransformation
{
    private val static Logger      LOGGER                      = Logger.getLogger(typeof(Franca2EATransformation).name)

    val models = new LinkedHashMap<FModel, EAPackageContainer>
    val dataTypes = new LinkedHashMap<FType, EAElementContainer>
    val interfaces = new LinkedHashMap<FInterface, EAElementContainer>
    val clientInterfaces = new LinkedHashMap<FInterface, EAElementContainer>
    val EARepositoryContainer repository
    val EAPackageContainer prefixPackage
    val Map<String, String> fileNameCache

    new(Collection<FModel> models, EARepositoryContainer repository, IPath namespacePrefix, Map<String, String> fileNameCache)
    {
        this.fileNameCache = fileNameCache

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
            francaModel.typeCollections.forEach[typeCollection|eaPackage.transformTypeCollection(typeCollection, francaModel)]
            francaModel.interfaces.forEach[interface_|interfaces.put(interface_, eaPackage.transformInterface(interface_))]
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

        // Removing last segment. Lower casing the whole path and append last segment afterwards.
        val modelPackagePath =new Path(modelPackagePathOrigin.removeLastSegments(1).toString.toLowerCase).append(modelPackagePathOrigin.lastSegment)

        if(modelPackagePath.segmentCount == 1)
        {
            return prefixPackage.transformNamespace(modelPackagePath) => [
                stereotypes = #[EAFrancaConstants.STEREOTYPE_ROOT, EAFrancaConstants.STEREOTYPE_FIDL]
                isNamespaceRoot = true
                // Capitalize the name.
                name = name.toFirstUpper
            ]
        }
        else
        {
            return (prefixPackage.transformNamespace(modelPackagePath.uptoSegment(1)) => [
                stereotypes = EAFrancaConstants.STEREOTYPE_ROOT
                isNamespaceRoot = true
            ]).transformNamespace(modelPackagePath.removeFirstSegments(1)) => [
                stereotypes = EAFrancaConstants.STEREOTYPE_FIDL
                // Capitalize the name.
                name = name.toFirstUpper
            ]
        }
    }

    private def EAPackageContainer transformNamespace(IPath namespace)
    {
        if(namespace.segmentCount() > 0)
        {
            return repository.getOrCreateModel(EA2FrancaUtils.lastNamespaceSegmentNaming(fileNameCache, namespace)).transformNamespace(namespace.removeFirstSegments(1))
        }

        return null
    }

    private def EAPackageContainer transformNamespace(EAPackageContainer eaPackage, IPath namespace)
    {
        if(namespace.segmentCount() > 0)
        {
            return eaPackage.getOrCreatePackage(EA2FrancaUtils.lastNamespaceSegmentNaming(fileNameCache, namespace)).transformNamespace(namespace.removeFirstSegments(1)) => [
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
            typeCollection.types.forEach[type|dataTypes.put(type, transformDataType(type))]
            version = typeCollection.version.transformVersion
            author = typeCollection.comment.transformAnnotation(FAnnotationType.AUTHOR)
            notes = typeCollection.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
        ]
    }

    private def EAElementContainer transformInterface(EAPackageContainer parent, FInterface francaInterface)
    {
        return parent.getOrCreateElement(francaInterface.name, EAElementContainer.Type.INTERFACE) => [
            francaInterface.types.forEach[type|dataTypes.put(type, transformDataType(type))]
            stereotypes = EAFrancaConstants.STEREOTYPE_FRANCA_SERVICE_INTERFACE
            version = francaInterface.version.transformVersion
            author = francaInterface.comment.transformAnnotation(FAnnotationType.AUTHOR)
            notes = francaInterface.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
            // Either broadcasts or no noSubscriptions attributes (same filter as in 'transformClientInterfaceCrossReferences') must be available.
            if(!francaInterface.broadcasts.isEmpty || !francaInterface.attributes.filter[attribute|!attribute.noSubscriptions].isEmpty)
            {
                val clientInterface = parent.transformClientInterface(francaInterface)
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
            francaInterface.methods.forEach[method|transformMethod(method)]
            francaInterface.attributes.forEach[attribute|transformAttribute(attribute)]
            baseElement = interfaces.get(francaInterface.base)

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
        return parent.getOrCreateAttribute(enumerator.name) => [
            type = FBasicTypeId.STRING.literal
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

    private def EAMethodContainer transformMethod(EAElementContainer parent, FMethod method)
    {
        return parent.createMethod(method.name) => [
            stereotypes = method.stereotype
            notes = method.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
            method.inArgs.forEach[arg|transformParamenter(arg, EAParameterContainer.Kind.IN)]
            method.outArgs.forEach[arg|transformParamenter(arg, EAParameterContainer.Kind.OUT)]
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

    private def EAMethodContainer transformBroadcast(EAElementContainer parent, FBroadcast broadcast)
    {
        return parent.createMethod(broadcast.name) => [
            stereotypes = broadcast.stereotype
            notes = broadcast.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
            broadcast.outArgs.forEach[arg|transformParamenter(arg, EAParameterContainer.Kind.IN)]
        ]
    }

    private def EAParameterContainer transformParamenter(EAMethodContainer parent, FArgument argument,
        EAParameterContainer.Kind direction)
    {
        return parent.getOrCreateParameter(argument.name) => [
            stereotypes = if(argument.array) EAFrancaConstants.STEREOTYPE_ARRAY else null
            kind = direction
            type = argument.type.typeName
            typeElement = argument.type.EAElementContainer
            notes = argument.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
        ]
    }

    private def EAParameterContainer transformErrorParamenter(EAMethodContainer parent, FEnumerator enumerator)
    {
        return parent.getOrCreateParameter(enumerator.name) => [
            stereotypes = EAFrancaConstants.STEREOTYPE_ERROR
            kind = EAParameterContainer.Kind.OUT
            ^default = enumerator.value.enumeratorValue
            notes = enumerator.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
        ]
    }

    private def EAParameterContainer transformErrorParamenter(EAMethodContainer parent, FEnumerationType enumerationType)
    {
        return parent.getOrCreateParameter(enumerationType.name) => [
            stereotypes = EAFrancaConstants.STEREOTYPE_ERROR
            kind = EAParameterContainer.Kind.OUT
            type = enumerationType.name
            typeElement = dataTypes.get(enumerationType)
            notes = enumerationType.comment.transformAnnotation(FAnnotationType.DESCRIPTION)
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
