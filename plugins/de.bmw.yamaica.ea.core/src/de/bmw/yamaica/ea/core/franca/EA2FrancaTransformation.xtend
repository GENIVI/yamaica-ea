/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.franca

import de.bmw.yamaica.ea.core.EAConstants
import de.bmw.yamaica.ea.core.containers.EAAttributeContainer
import de.bmw.yamaica.ea.core.containers.EAContainer
import de.bmw.yamaica.ea.core.containers.EAContainerWithElements
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace
import de.bmw.yamaica.ea.core.containers.EAElementContainer
import de.bmw.yamaica.ea.core.containers.EAMethodContainer
import de.bmw.yamaica.ea.core.containers.EAPackageContainer
import de.bmw.yamaica.ea.core.containers.EAParameterContainer
import de.bmw.yamaica.ea.core.franca.exceptions.AutoImportException
import de.bmw.yamaica.ea.core.franca.exceptions.ClientInterfaceDerivationException
import de.bmw.yamaica.ea.core.franca.exceptions.DataTypeParentException
import de.bmw.yamaica.ea.core.franca.exceptions.ErrorEnumTypeCountException
import de.bmw.yamaica.ea.core.franca.exceptions.ErrorEnumTypeException
import de.bmw.yamaica.ea.core.franca.exceptions.FireAndForgetMethodException
import de.bmw.yamaica.ea.core.franca.exceptions.FullyQualifiedNameCollisionException
import de.bmw.yamaica.ea.core.franca.exceptions.InternalErrorException
import de.bmw.yamaica.ea.core.franca.exceptions.ManualImportException
import de.bmw.yamaica.ea.core.franca.exceptions.TypeResolvingException
import de.bmw.yamaica.ea.core.franca.exceptions.VersionNumberFormatException
import de.bmw.yamaica.franca.base.core.FrancaUtils
import de.bmw.yamaica.franca.base.core.InterfaceDefinitionKeyword
import java.util.Collection
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.Map
import org.eclipse.core.runtime.IPath
import org.eclipse.emf.ecore.EObject
import org.franca.core.franca.FAnnotation
import org.franca.core.franca.FAnnotationBlock
import org.franca.core.franca.FAnnotationType
import org.franca.core.franca.FBasicTypeId
import org.franca.core.franca.FEnumerationType
import org.franca.core.franca.FInterface
import org.franca.core.franca.FModel
import org.franca.core.franca.FModelElement
import org.franca.core.franca.FStructType
import org.franca.core.franca.FType
import org.franca.core.franca.FTypeCollection
import org.franca.core.franca.FTypeRef
import org.franca.core.franca.FUnionType
import org.franca.core.franca.FVersion
import org.franca.core.franca.FrancaFactory

import static de.bmw.yamaica.ea.core.franca.EADependencyDiscoverer.*

import static extension de.bmw.yamaica.ea.core.franca.EAContainerExtensions.*

// To understand this transformation it is import to know what "create methods" are actual doing!
// 
// "Create" methods cache their return values depending on their parameters (one cached instance of the return object
// per combination of method parameters). The function block will be executed only once per parameter combination. On
// the first call the function block is executed and the return value will be cached. If the method is called a second
// time with the same parameters the cached return value will be returned without executing the function block again.
// https://groups.google.com/forum/#!topic/xtend-lang/15gz5CoqCAI
class EA2FrancaTransformation
{
    static val INLINE_ARRAY_BRACKETS = "[]"
    static val COMMENT_AT_REPLACEMENT = "(at)"
    static val DEFAULT_MAJOR_VERSION_NUMBER = 0
    static val DEFAULT_MINOR_VERSION_NUMBER = 0

    static val MANUAL_IMPORT_MESSAGE = "The package \"%s\" which should be imported has no stereotype «fidl» or is not inside of a package with stereotype «fidl»!"
    static val MODEL_ANALYSIS_ERROR_MESSAGE = "The %s \"%s\" could not be found (model analysis error)! Try to import «fidl» package of this %s manually by using an import association."
    static val FIRE_AND_FORGET_WITH_OUT_PARAMS_MESSAGE = "A fire-and-forget method cannot have out arguments!"
    static val ERROR_ENUM_TYPE_COUNT_MESSAGE = "Only one error enumeration may be defined!"
    static val ERROR_ENUM_TYPE_MESSAGE = "The type of the error enumeration must be of type enumeration!"
    static val VERSION_NUMBER_FORMAT_MESSAGE = "The version number \"%s\" has a wrong format. The format must be \"MAJOR.MINOR\" where MAJOR and MINOR are integers!"
    static val TYPE_NOT_RESOLVABLE_MESSAGE = "The type \"%s\" cannot be resolved!"
    static val CLIENT_INTERFACE_AS_BASE_MESSAGE = "The non-client interface may not be derived from a client interface (\"%s\")!"
    static val FULL_QUALIFIED_NAME_MESSAGE = "The elements \"%s\" and \"%s\" have the same full qualified name \"%s\"!"
    static val ELEMENT_INSIDE_FIDL_PACKAGE_MESSAGE = "The element cannot be transformed since it is a direct child of a «fidl» package!"
    static val ELEMENT_NOT_INSIDE_PACKAGE_OR_INTERFACE_MESSAGE = "The element must be a child of either an interface or a package!"

    extension EAIssueLogger logger = new EAIssueLogger
    extension EA2FrancaUtils transformationUtils = new EA2FrancaUtils(logger)
    extension EADependencyDiscoverer dependencyDiscoverer = new EADependencyDiscoverer(logger, transformationUtils)

    val models = new LinkedHashMap<EAPackageContainer, FModel>
    val dataTypes = new LinkedHashMap<EAElementContainer, FType>
    val interfaces = new LinkedHashMap<EAElementContainer, FInterface>

    val modelDependencies = new LinkedHashMap<FModel, Collection<EAContainerWithNamespace>>
    val fullQualifiedNames = new LinkedHashMap<String, EAContainerWithNamespace>

    def Collection<String> getLogMessages()
    {
        return logger.logMessages
    }

    // The following transform methods should be called in the written order. The first method
    // returns all available FModel instances. The caller is responsible to put them into a resource
    // set and to save them afterwards. Saving must be done after *EACH* method call. If the caller
    // does not save the returned models after each of these method calls it is possible that Xtext
    // cannot serialize the models because of unresolvable cross references between the models.
    /**
     * Analyses the referred EA packages and calculates the package dependencies. Creates empty
     * Franca models for all referred EA packages and their dependencies.
     */
    def Collection<FModel> transformModels(Collection<EAPackageContainer> modelPackages)
    {
        modelPackages.forEach[modelPackage|modelPackage.transformModel]

        return models.values
    }

    /**
     * Generates the import statements based on the dependency analysis from the transformModels
     * method call. Expects a map with a relative save path for all Franca models to correctly
     * generate the import statements. If the map is empty or a model is missing the save path
     * is calculated by the getRelativeFidlPackagePath method.
     */
    def void transformImports(Map<FModel, IPath> importPaths)
    {
        models.entrySet.forEach [ entry |
            for (element2Import : modelDependencies.get(entry.value))
            {
                var EAPackageContainer package2Import = null

                switch element2Import
                {
                    EAPackageContainer: package2Import = element2Import
                    EAElementContainer: package2Import = element2Import.^package
                }

                // Do not self-import since Franca will generate full qualified names for references 
                // within the same file anyway
                if(!entry.key.equals(package2Import.fidlPackage))
                {
                    entry.value.imports.add(entry.key.transformImport(package2Import, importPaths))
                }
            }
        ]
    }

    /**
     * Creates all Franca data type instances. But typedefs and arrays have no actual type and
     * derivations are not resolved right now. This must be done with the next step.
     */
    def void transformTypes()
    {
        models.entrySet.forEach [ entry |
            val typeElements = entry.key.packageElements.filter[type.equals(EAConstants.TYPE_CLASS)].toList
            for (typeCollection : typeElements.transformTypeCollections)
            {

                // The returned FTypeCollection can be also of type FInterface (an specialization of FTypeCollection)
                switch typeCollection
                {
                    FInterface: entry.value.interfaces.add(typeCollection)
                    FTypeCollection: entry.value.typeCollections.add(typeCollection)
                }
            }
        ]
    }

    /**
     * Creates all cross references between types (adds the actual type to all array and typedef
     * types and adds base type to structs, unions and enumerations).
     */
    def void transformTypeCrossReferences()
    {
        dataTypes.keySet.forEach[element|element.transformDataTypeCrossReferences]
    }

    /**
     * Creates all missing Franca interfaces (without attributes, methods, broadcasts and derivation
     * since we possibly don't know the derived interface at this time). Some interfaces may already
     * exist since interfaces are also type collections (see transformTypes() method).
     */
    def void transformInterfaces()
    {
        models.entrySet.forEach [ entry |
            for (interfaceElement : entry.key.packageElements.filter[isTransformableInterfaceElement])
            {
                entry.value.interfaces.add(interfaceElement.transformInterface)
            }
        ]
    }

    /**
     * Creates all Franca interface contents (attributes, methods and broadcasts).
     */
    def void transformInterfaceContents()
    {
        interfaces.entrySet.forEach [ entry |
            entry.key.transformInterfaceContents(entry.value)
            // TODO
            // The line below is currently replace by the code below since Xtend 2.4.1 produces 
            // a senseless warning here.
            // entry.key.oppositeFrancaInterfaceElement?.transformInterfaceContents(entry.value)
            val oppositeFrancaInterfaceElement = entry.key.oppositeFrancaInterfaceElement
            if(null != oppositeFrancaInterfaceElement)
            {
                oppositeFrancaInterfaceElement.transformInterfaceContents(entry.value)
            }
        ]
    }

    /**
     * Creates all cross references between interfaces (derivations).
     */
    def void transformInterfaceCrossReferences()
    {
        interfaces.keySet.forEach[element|element.transformInterfaceCrossReferences]
    }

    //
    // Internal transformation methods.
    //
    def private create FrancaFactory.eINSTANCE.createFModel transformModel(EAPackageContainer fidlPackage)
    {
        registerContainer(fidlPackage)
        name = fidlPackage.fidlNamespaceAsPath.normalizeNamespacePath(fidlPackage).path2Namespace

        val fidlPackageDependencies = new LinkedHashSet<EAContainerWithNamespace>

        // Resolving dependencies automatically (by finding dependent external elements)
        for (externalElement : fidlPackage.externalPackageElements)
        {
            val fidlPackage2Import = externalElement.fidlPackage

            if(null == fidlPackage2Import)
            {
                addIssue(typeof(AutoImportException), fidlPackage, AUTO_IMPORT_MESSAGE, externalElement.namespace)
            }

            // Transform the model of the import dependency
            fidlPackage2Import.transformModel
            fidlPackageDependencies.add(externalElement)
        }

        // Resolving dependencies by import association
        for (package2Import : fidlPackage.importedPackages)
        {
            val fidlPackage2Import = package2Import.fidlPackage

            if(null == fidlPackage2Import)
            {
                addIssue(typeof(ManualImportException), fidlPackage, MANUAL_IMPORT_MESSAGE, package2Import.namespace)
            }

            // Transform the model of the import dependency
            fidlPackage2Import.transformModel
            fidlPackageDependencies.add(package2Import)
        }
        modelDependencies.put(it, fidlPackageDependencies)
    }

    def private create FrancaFactory.eINSTANCE.createImport transformImport(EAPackageContainer fidlPackage,
        EAPackageContainer package2Import, Map<FModel, IPath> importPaths)
    {
        val fidlPackagePath = fidlPackage.getRelativeFidlPackagePath(importPaths)
        val fidlPackage2ImportPath = package2Import.fidlPackage.getRelativeFidlPackagePath(importPaths)
        val relativePath = fidlPackage2ImportPath.removeLastSegments(1).makeRelativeTo(fidlPackagePath.removeLastSegments(1))

        importURI = relativePath.append(fidlPackage2ImportPath.lastSegment).toString
        importedNamespace = package2Import.fidlNamespaceAsPath.normalizeNamespacePath(package2Import).append("*").path2Namespace
    }

    // This method tries to transform all referred data type elements. If the 
    // transformation was successful its type collection element will be created.
    // Beware, that interfaces are a specialization of a type collections. Thus it
    // must be checked if an element (data type) has an package or an interface as
    // parent.
    def private Collection<FTypeCollection> transformTypeCollections(Collection<EAElementContainer> elements)
    {
        val typeCollections = new LinkedHashSet<FTypeCollection>

        for (element : elements)
        {
            val dataType = element.transformDataType

            if(null != dataType)
            {
                val parent = element.parent

                if(parent instanceof EAPackageContainer)
                {
                    val elementPackage = parent as EAPackageContainer
                    val fidlPackage = element.fidlPackage

                    if(elementPackage.equals(fidlPackage))
                    {
                        addIssue(typeof(DataTypeParentException), element, ELEMENT_INSIDE_FIDL_PACKAGE_MESSAGE)
                    }
                    else
                    {
                        val typeCollection = elementPackage.transformTypeCollection
                        typeCollection.types.add(dataType)
                        typeCollections.add(typeCollection)
                    }
                }
                else if(parent instanceof EAElementContainer)
                {
                    var elementParent = parent as EAElementContainer

                    if(!elementParent.isTransformableInterfaceElement)
                    {
                        elementParent = elementParent.oppositeFrancaInterfaceElement

                        if(null == elementParent || !elementParent.isTransformableInterfaceElement)
                        {
                            addIssue(typeof(DataTypeParentException), element, ELEMENT_NOT_INSIDE_PACKAGE_OR_INTERFACE_MESSAGE)
                        }
                    }
                    val interface_ = elementParent.transformInterface
                    interface_.types.add(dataType)
                    typeCollections.add(interface_)
                }
                else
                {
                    addIssue(typeof(DataTypeParentException), element, ELEMENT_NOT_INSIDE_PACKAGE_OR_INTERFACE_MESSAGE)
                }
            }
        }
        return typeCollections
    }

    def private create FrancaFactory.eINSTANCE.createFTypeCollection transformTypeCollection(EAPackageContainer tcPackage)
    {
        registerContainer(tcPackage)
        val relativeNamespacePath = tcPackage.fidlNamespaceAsPath.makeRelativeTo(tcPackage.fidlPackage.fidlNamespaceAsPath)
        name = relativeNamespacePath.normalizeNamespacePath(tcPackage).path2Namespace
        version = tcPackage.transformVersion
        comment = transformAnnotationBlock(tcPackage.notes, tcPackage.author)
    }

    def private transformDataType(EAElementContainer element)
    {
        switch element.francaDataType
        {
            case EAFrancaDataType.TYPEDEF: return element.transformTypeDef
            case EAFrancaDataType.ARRAY: return element.transformArrayType
            case EAFrancaDataType.ENUMERATION: return element.transformEnumerationType
            case EAFrancaDataType.STRUCT: return element.transformStructType
            case EAFrancaDataType.UNION: return element.transformUnionType
            case EAFrancaDataType.MAP: return element.transformMapType
            case EAFrancaDataType.UNDEFINED: return null
        }
    }

    def private void transformDataTypeCrossReferences(EAElementContainer element)
    {
        switch element.francaDataType
        {
            case EAFrancaDataType.TYPEDEF: element.transformTypeDefCrossReferences
            case EAFrancaDataType.ARRAY: element.transformArrayTypeCrossReferences
            case EAFrancaDataType.ENUMERATION: element.transformEnumerationTypeCrossReferences
            case EAFrancaDataType.STRUCT: element.transformStructTypeCrossReferences
            case EAFrancaDataType.UNION: element.transformUnionTypeCrossReferences
            case EAFrancaDataType.MAP: element.transformMapTypeCrossReferences
        }
    }

    def private create FrancaFactory.eINSTANCE.createFTypeDef transformTypeDef(EAElementContainer element)
    {
        registerContainer(element)
        name = element.fidlName.normalizeName(true, element)
        comment = transformAnnotationBlock(element.notes, "")
        actualType = getTypeRef(null, FBasicTypeId.UNDEFINED.getName, element)
    }

    def private void transformTypeDefCrossReferences(EAElementContainer element)
    {
        transformTypeDef(element) => [
            val baseTypeElement = element.baseElement
            val baseType = element.parseGenlinks.get(EAConstants.GENLINK_PARENT)
            actualType = baseTypeElement.getTypeRef(baseType, element)
        ]
    }

    def private create FrancaFactory.eINSTANCE.createFArrayType transformArrayType(EAElementContainer element)
    {
        registerContainer(element)
        name = element.fidlName.normalizeName(true, element)
        comment = transformAnnotationBlock(element.notes, "")
        elementType = getTypeRef(null, FBasicTypeId.UNDEFINED.getName, element)
    }

    def private void transformArrayTypeCrossReferences(EAElementContainer element)
    {
        transformArrayType(element) => [
            val typeElement = element.arrayTypeElement
            val baseType = element.parseGenlinks.get(EAConstants.GENLINK_PARENT)
            elementType = typeElement.getTypeRef(baseType, element)
        ]
    }

    def private create FrancaFactory.eINSTANCE.createFEnumerationType transformEnumerationType(EAElementContainer element)
    {
        registerContainer(element)
        name = element.fidlName.normalizeName(true, element)
        comment = transformAnnotationBlock(element.notes, "")
        enumerators.addAll(element.attributes.map[transformEnumerator])
    }

    def private create FrancaFactory.eINSTANCE.createFEnumerator transformEnumerator(EAAttributeContainer attribute)
    {
        registerContainer(attribute)
        name = attribute.fidlName.normalizeName(true, attribute)
        val defaultValue = attribute.getDefault.trim
        if(defaultValue.length > 0) value = defaultValue
        comment = transformAnnotationBlock(attribute.notes, "")
    }

    def private void transformEnumerationTypeCrossReferences(EAElementContainer element)
    {
        transformEnumerationType(element) => [
            base = element.getBaseType(typeof(FEnumerationType))
        ]
    }

    def private create FrancaFactory.eINSTANCE.createFStructType transformStructType(EAElementContainer element)
    {
        registerContainer(element)
        name = element.fidlName.normalizeName(true, element)
        comment = transformAnnotationBlock(element.notes, "")
    }

    def private void transformStructTypeCrossReferences(EAElementContainer element)
    {
        transformStructType(element) => [
            elements.addAll(element.attributes.map[transformField])
            base = element.getBaseType(typeof(FStructType))
        ]
    }

    def private create FrancaFactory.eINSTANCE.createFUnionType transformUnionType(EAElementContainer element)
    {
        registerContainer(element)
        name = element.fidlName.normalizeName(true, element)
        comment = transformAnnotationBlock(element.notes, "")
    }

    def private void transformUnionTypeCrossReferences(EAElementContainer element)
    {
        transformUnionType(element) => [
            elements.addAll(element.attributes.map[transformField])
            base = element.getBaseType(typeof(FUnionType))
        ]
    }

    def private create FrancaFactory.eINSTANCE.createFField transformField(EAAttributeContainer attribute)
    {
        registerContainer(attribute)
        name = attribute.fidlName.normalizeName(true, attribute)
        type = attribute.typeElement.getTypeRef(attribute.type, attribute)
        comment = transformAnnotationBlock(attribute.notes, "")
        array = if(attribute.collection) INLINE_ARRAY_BRACKETS else null
    }

    def private create FrancaFactory.eINSTANCE.createFMapType transformMapType(EAElementContainer element)
    {
        registerContainer(element)
        name = element.fidlName.normalizeName(true, element)
        comment = transformAnnotationBlock(element.notes, "")
        keyType = getTypeRef(null, FBasicTypeId.UNDEFINED.getName, element)
        valueType = getTypeRef(null, FBasicTypeId.UNDEFINED.getName, element)
    }

    def private void transformMapTypeCrossReferences(EAElementContainer element)
    {
        transformMapType(element) => [
            element.attributes.forEach [ attribute |
                // TODO Stereotypes really necessary?
                // Key attribute should be named "key" or should have stereotype «key»
                if(attribute.name.equals(EAFrancaConstants.STEREOTYPE_KEY) || attribute.hasStereotype(EAFrancaConstants.STEREOTYPE_KEY))
                {
                    keyType = attribute.typeElement.getTypeRef(attribute.type, attribute)
                }
                // Value attribute should be named "value" or should have stereotype «value»
                if(attribute.name.equals(EAFrancaConstants.STEREOTYPE_VALUE) ||
                    attribute.hasStereotype(EAFrancaConstants.STEREOTYPE_VALUE))
                {
                    valueType = attribute.typeElement.getTypeRef(attribute.type, attribute)
                }
            ]
        ]
    }

    def private create FrancaFactory.eINSTANCE.createFInterface transformInterface(EAElementContainer element)
    {
        registerContainer(element)
        val ePath = element.fidlNamespaceAsPath
        val fPath = element.fidlPackage.fidlNamespaceAsPath
        val relativeNamespacePath = ePath.makeRelativeTo(fPath)
        name = relativeNamespacePath.normalizeNamespacePath(element).path2Namespace
        comment = transformAnnotationBlock(element.notes, element.author)
        version = element.transformVersion
    }

    def private void transformInterfaceContents(EAElementContainer element, FInterface interface_)
    {
        interface_.attributes.addAll(element.attributes.map[transformAttribute])
        interface_.methods.addAll(element.methods.filter[isMethod].map[transformMethod])
        interface_.broadcasts.addAll(element.methods.filter[isBroadcast].map[transformBroadcast])
    }

    def private void transformInterfaceCrossReferences(EAElementContainer element)
    {
        transformInterface(element) => [
            val baseInterfaceElement = element.baseElement
            if(null != baseInterfaceElement)
            {
                base = interfaces.get(baseInterfaceElement)

                if(null == base)
                {
                    if(baseInterfaceElement.isClientFrancaInterfaceElement)
                    {
                        addIssue(typeof(ClientInterfaceDerivationException), element, CLIENT_INTERFACE_AS_BASE_MESSAGE,
                            baseInterfaceElement.namespace)
                    }
                    else
                    {
                        val elementType = baseInterfaceElement.EAObjectType.getName.toLowerCase
                        addIssue(typeof(InternalErrorException), element, MODEL_ANALYSIS_ERROR_MESSAGE, elementType,
                            baseInterfaceElement.namespace, elementType)
                    }
                }
            }
        ]
    }

    def private create FrancaFactory.eINSTANCE.createFAttribute transformAttribute(EAAttributeContainer attribute)
    {
        registerContainer(attribute)
        name = attribute.fidlName.normalizeName(true, attribute)
        type = attribute.typeElement.getTypeRef(attribute.type, attribute)
        comment = transformAnnotationBlock(attribute.notes, "")
        array = if(attribute.collection) INLINE_ARRAY_BRACKETS else null
        readonly = attribute.readOnlyAttribute
        noSubscriptions = attribute.noSubscriptionsAttribute
    }

    def private create FrancaFactory.eINSTANCE.createFMethod transformMethod(EAMethodContainer method)
    {
        registerContainer(method)
        name = method.fidlName.normalizeName(true, method)
        comment = transformAnnotationBlock(method.notes, "")
        fireAndForget = if(method.isFireAndForgetMethod) InterfaceDefinitionKeyword.FIRE_AND_FORGET.toString else null

        val inParams = new LinkedHashSet<EAParameterContainer>()
        val outParams = new LinkedHashSet<EAParameterContainer>()
        val errorParams = new LinkedHashSet<EAParameterContainer>()
        val errorTypes = new LinkedHashSet<EAParameterContainer>()

        // sort all parameters
        method.parameters.forEach [ parameter |
            switch parameter
            {
                // if parameter is named "error" its type will be the base enum of the error block
                case !parameter.type.equals("") && parameter.hasStereotype(EAFrancaConstants.STEREOTYPE_ERROR):
                    errorTypes.add(parameter)
                // if parameter has no type and stereotype error it will be an error enumerator
                case parameter.type.equals("") && parameter.hasStereotype(EAFrancaConstants.STEREOTYPE_ERROR):
                    errorParams.add(parameter)
                // if kind is "out" it will be an out parameter
                case parameter.kind == EAConstants.PARAMETER_DIRECTION_OUT:
                    outParams.add(parameter)
                // if kind is "in" it will be an in parameter
                case parameter.kind == EAConstants.PARAMETER_DIRECTION_IN:
                    inParams.add(parameter)
            }
        ]

        inArgs.addAll(inParams.map[transformArgument])
        outArgs.addAll(outParams.map[transformArgument])

        // TODO really needed?
        // If method has a return type it will be added to the out arguments list
        // with the name "return_value".
        val returnTypeAsString = method.returnType

        if(returnTypeAsString.length > 0)
        {
            val returnType = method.returnTypeElement.getTypeRef(returnTypeAsString, method)

            if(null != returnType)
            {
                val returnOutParam = FrancaFactory.eINSTANCE.createFArgument
                returnOutParam.name = name + "_return_value"
                returnOutParam.type = returnType
                returnOutParam.array = if(method.returnTypeArray) INLINE_ARRAY_BRACKETS else null

                outArgs.add(returnOutParam)
            }
        }

        if(outArgs.size > 0 && null != fireAndForget)
        {
            addIssue(typeof(FireAndForgetMethodException), method, FIRE_AND_FORGET_WITH_OUT_PARAMS_MESSAGE)
        }

        if(errorParams.size > 0)
        {
            errors = FrancaFactory.eINSTANCE.createFEnumerationType
            errors.enumerators.addAll(
                errorParams.map [
                    val enumerator = FrancaFactory.eINSTANCE.createFEnumerator
                    enumerator.name = it.fidlName
                    it.getDefault.trim => [if(it.length > 0) enumerator.value = it]
                    enumerator.comment = transformAnnotationBlock(it.notes, "")
                    return enumerator
                ]
            )
        }

        if(errorTypes.size > 0)
        {
            if(errorTypes.size > 1)
            {
                addIssue(typeof(ErrorEnumTypeCountException), method, ERROR_ENUM_TYPE_COUNT_MESSAGE)
            }
            val errorEnumTypeElement = errorTypes.head.typeElement
            val errorEnumType = dataTypes.get(errorEnumTypeElement)

            if(null == errorEnumType)
            {
                val elementType = errorEnumTypeElement.EAObjectType.getName.toLowerCase
                addIssue(typeof(InternalErrorException), method, MODEL_ANALYSIS_ERROR_MESSAGE, elementType, errorEnumTypeElement.namespace,
                    elementType)
            }

            if(!(errorEnumType instanceof FEnumerationType))
            {
                addIssue(typeof(ErrorEnumTypeException), method, ERROR_ENUM_TYPE_MESSAGE)
            }

            if(null != errors)
            {
                errors.base = errorEnumType as FEnumerationType
            }
            else
            {
                errorEnum = errorEnumType as FEnumerationType
            }
        }
    }

    def private create FrancaFactory.eINSTANCE.createFBroadcast transformBroadcast(EAMethodContainer method)
    {
        registerContainer(method)
        name = method.fidlName.normalizeName(true, method)
        comment = transformAnnotationBlock(method.notes, "")
        selective = if(method.selectiveBroadcast) InterfaceDefinitionKeyword.SELECTIVE.toString else null

        outArgs.addAll(method.parameters.filter[kind == EAConstants.PARAMETER_DIRECTION_OUT].map[transformArgument])
    }

    def private create FrancaFactory.eINSTANCE.createFArgument transformArgument(EAParameterContainer parameter)
    {
        registerContainer(parameter)
        name = parameter.fidlName.normalizeName(true, parameter)
        type = parameter.typeElement.getTypeRef(parameter.type, parameter)
        comment = transformAnnotationBlock(parameter.notes, "")
        array = if(parameter.hasStereotype(EAFrancaConstants.STEREOTYPE_ARRAY)) INLINE_ARRAY_BRACKETS else null
    }

    def private FVersion transformVersion(EAContainerWithElements container)
    {
        val versionString = container.version.trim

        // Since the version statement is optional in Franca it will be only created if it is set in EA
        if(versionString.length == 0)
        {
            return null
        }
        else
        {
            val version = FrancaFactory.eINSTANCE.createFVersion => [
                registerContainer(container)
                val versionSegments = versionString.split("\\.")
                if(versionSegments.size > 0)
                {
                    try
                    {
                        major = new Integer(versionSegments.get(0))
                    }
                    catch(NumberFormatException e)
                    {
                        major = DEFAULT_MAJOR_VERSION_NUMBER
                        addIssue(typeof(VersionNumberFormatException), container, VERSION_NUMBER_FORMAT_MESSAGE, versionString)
                    }
                }
                if(versionSegments.size > 1)
                {
                    try
                    {
                        minor = new Integer(versionSegments.get(1))
                    }
                    catch(NumberFormatException e)
                    {
                        minor = DEFAULT_MINOR_VERSION_NUMBER
                        addIssue(typeof(VersionNumberFormatException), container, VERSION_NUMBER_FORMAT_MESSAGE, versionString)
                    }
                }
            ]
            return version
        }
    }

    def private FAnnotationBlock transformAnnotationBlock(String note, String author)
    {
        val noteLength = note.trim.length
        val authorLength = author.trim.length

        if(noteLength > 0 || authorLength > 0)
        {
            val annotationBlock = FrancaFactory.eINSTANCE.createFAnnotationBlock

            if(noteLength > 0)
            {
                annotationBlock.elements.add(note.transformAnnotation(FAnnotationType.DESCRIPTION))
            }

            if(authorLength > 0)
            {
                annotationBlock.elements.add(author.transformAnnotation(FAnnotationType.AUTHOR))
            }
            return annotationBlock
        }
        else
        {
            return null
        }
    }

    def private FAnnotation transformAnnotation(String comment, FAnnotationType annotationType)
    {
        val annotation = FrancaFactory.eINSTANCE.createFAnnotation
        annotation.type = annotationType
        annotation.comment = comment.replaceAll("@", COMMENT_AT_REPLACEMENT)

        return annotation
    }

    // 
    // Internal helper methods.
    // 
    /**
     * All generated Franca objects with their corresponding EA container classes should be registered. This method
     * will check if another element has the same full qualified name. Further more this method caches all objects
     * that will be needed for cross references (e.g. type inheritance)
     */
    def private void registerContainer(EObject francaObject, EAContainer container)
    {
        if(container instanceof EAContainerWithNamespace && (francaObject instanceof FModel || francaObject instanceof FModelElement))
        {
            val containerWithNamespace = container as EAContainerWithNamespace
            val fidlFqn = containerWithNamespace.fidlNamespaceAsPath.normalizeNamespacePath(containerWithNamespace).path2Namespace

            if(fullQualifiedNames.containsKey(fidlFqn))
            {
                val collisionContainer = fullQualifiedNames.get(fidlFqn)
                addIssue(typeof(FullyQualifiedNameCollisionException), containerWithNamespace, FULL_QUALIFIED_NAME_MESSAGE,
                    containerWithNamespace.namespace, collisionContainer.namespace, fidlFqn)
            }
            else
            {
                fullQualifiedNames.put(fidlFqn, containerWithNamespace)
            }
        }

        switch francaObject
        {
            case container instanceof EAPackageContainer && francaObject instanceof FModel:
                models.put(container as EAPackageContainer, francaObject as FModel)
            case container instanceof EAElementContainer && francaObject instanceof FInterface:
                interfaces.put(container as EAElementContainer, francaObject as FInterface)
            case container instanceof EAElementContainer && francaObject instanceof FType:
                dataTypes.put(container as EAElementContainer, francaObject as FType)
        }
    }

    def private FTypeRef getTypeRef(EAElementContainer element, String type, EAContainerWithNamespace container)
    {
        val typeRef = FrancaFactory.eINSTANCE.createFTypeRef

        if(null != element)
        {
            if(!dataTypes.containsKey(element))
            {
                val elementType = element.EAObjectType.getName.toLowerCase
                addIssue(typeof(InternalErrorException), container, MODEL_ANALYSIS_ERROR_MESSAGE, elementType, element.namespace,
                    elementType)
            }
            typeRef.derived = dataTypes.get(element)
        }

        if(null == typeRef.derived)
        {
            val normalizedName = type?.normalizeName(true, container)
            val basicTypeId = FBasicTypeId.getByName(normalizedName)

            if(null != basicTypeId)
            { // check if name is a base type
                typeRef.predefined = basicTypeId
            }
            else
            {
                typeRef.predefined = FBasicTypeId.UNDEFINED
                addIssue(typeof(TypeResolvingException), container, TYPE_NOT_RESOLVABLE_MESSAGE, type)
            }
        }
        return typeRef
    }

    def private <T extends FType> T getBaseType(EAElementContainer element, Class<T> expectedType)
    {
        val baseElement = element.baseElement
        val baseType = dataTypes.get(baseElement)

        if(null != baseElement && null == baseType)
        {
            val elementType = baseElement.EAObjectType.getName.toLowerCase
            addIssue(typeof(InternalErrorException), element, MODEL_ANALYSIS_ERROR_MESSAGE, elementType, baseElement.namespace, elementType)
        }

        if(expectedType.isInstance(baseType))
        {
            return baseType as T
        }
        else
        {
            return null
        }
    }

    /**
     * Returns the save path for a Franca model. Takes the path that was referred to transformImports method or
     * calculates its own path.
     */
    def private IPath getRelativeFidlPackagePath(EAPackageContainer fidlPackage, Map<FModel, IPath> importPaths)
    {
        val referredPath = importPaths.get(models.get(fidlPackage))

        if(null != referredPath)
        {
            return referredPath
        }
        else
        {
            return FrancaUtils.getRelativeFidlPackagePath(models.get(fidlPackage))
        }
    }
}
