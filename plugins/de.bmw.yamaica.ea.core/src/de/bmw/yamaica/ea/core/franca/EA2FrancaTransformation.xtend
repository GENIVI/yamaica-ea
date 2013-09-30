/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
 package de.bmw.yamaica.ea.core.franca

import de.bmw.yamaica.ea.core.EAConstants
import de.bmw.yamaica.ea.core.containers.EAAttributeContainer
import de.bmw.yamaica.ea.core.containers.EAConnectorContainer
import de.bmw.yamaica.ea.core.containers.EAContainer
import de.bmw.yamaica.ea.core.containers.EAContainerWithElements
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace
import de.bmw.yamaica.ea.core.containers.EAElementContainer
import de.bmw.yamaica.ea.core.containers.EAMethodContainer
import de.bmw.yamaica.ea.core.containers.EAPackageContainer
import de.bmw.yamaica.ea.core.containers.EAParameterContainer
import de.bmw.yamaica.franca.base.core.InterfaceDefinitionKeyword
import de.bmw.yamaica.franca.base.core.FrancaUtils
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.LinkedList
import java.util.Map
import java.util.Set
import org.eclipse.core.runtime.IPath
import org.eclipse.emf.ecore.EObject
import org.franca.core.franca.FAnnotationType
import org.franca.core.franca.FBasicTypeId
import org.franca.core.franca.FEnumerationType
import org.franca.core.franca.FInterface
import org.franca.core.franca.FModel
import org.franca.core.franca.FModelElement
import org.franca.core.franca.FStructType
import org.franca.core.franca.FType
import org.franca.core.franca.FTypeCollection
import org.franca.core.franca.FUnionType
import org.franca.core.franca.FrancaFactory

// To understand this transformation it is import to know what "create methods" are actual doing!
// 
// "Create" methods cache their return values depending on their parameters (one cached instance of the return object
// per combination of method parameters). The function block will be executed only once per parameter combination. On
// the first call the function block is executed and the return value will be cached. If the method is called a second
// time with the same parameters the cached return value will be returned without executing the function block again.
// https://groups.google.com/forum/#!topic/xtend-lang/15gz5CoqCAI
class EA2FrancaTransformation {
    
    static val INLINE_ARRAY_BRACKETS = "[]"
    static val COMMENT_AT_REPLACEMENT = "(at)"
    static val DEFAULT_MAJOR_VERSION_NUMBER = 0
    static val DEFAULT_MINOR_VERSION_NUMBER = 0
    
    static val WARNING = 1
    static val ERROR_IF_STRICT = 2
    static val ERROR = 3
    static val INTERNAL_ERROR = 4
    
    static val WARNING_DEFAULT_MESSAGE_START = "A warning"
    static val ERROR_DEFAULT_MESSAGE_START = "An error"
    static val INTERNAL_ERROR_DEFAULT_MESSAGE_START = "Please report a bug. An internal error"
    static val UNKNOWN_ISSUE_DEFAULT_MESSAGE_START = "An unknown issue"
    static val DEFAULT_MESSAGE = "%s occurred while transforming the %s \"%s\"."
    static val AUTO_IMPORT_MESSAGE = "The element \"%s\" which should be imported is not inside of a package with stereotype «fidl»!"
    static val MANUAL_IMPORT_MESSAGE = "The package \"%s\" which should be imported has no stereotype «fidl» or is not inside of a package with stereotype «fidl»!"
    static val MODEL_ANALYSIS_ERROR_MESSAGE = "The %s \"%s\" could not be found (model analysis error)! Try to import «fidl» package of this %s manually by using an import association."
    static val FIRE_AND_FORGET_WITH_OUT_PARAMS_MESSAGE = "A fire-and-forget method cannot have out arguments!"
    static val ERROR_ENUM_TYPE_COUNT_MESSAGE = "Only one error enumeration may be defined!"
    static val ERROR_ENUM_TYPE_MESSAGE = "The type of the error enumeration must be of type enumeration!"
    static val VERSION_NUMBER_FORMAT_MESSAGE = "The version number \"%s\" has a wrong format. The format must be \"MAJOR.MINOR\" where MAJOR and MINOR are integers!"
    static val TYPE_NOT_RESOLVABLE_MESSAGE = "The type \"%s\" cannot be resolved!"
    static val BASE_TYPE_COUNT_MESSAGE = "The element has more than one base type!"
    static val CLIENT_INTERFACE_COUNT_MESSAGE = "The element has more than one client interface!"
    static val CLIENT_INTERFACE_AS_BASE_MESSAGE = "The non-client interface may not be derived from a client interface (\"%s\")!"
    static val ARRAY_OF_ASSOCIATION_COUNT_MESSAGE = "The element has more than one «" + EAFrancaConstants::STEREOTYPE_ARRAF_OF + "» association!"
    static val FULL_QUALIFIED_NAME_MESSAGE = "The elements \"%s\" and \"%s\" have the same full qualified name \"%s\"!"
    static val ELEMENT_INSIDE_FIDL_PACKAGE_MESSAGE = "The element cannot be transformed since it is a direct child of a «fidl» package!"
    static val ELEMENT_NOT_INSIDE_PACKAGE_OR_INTERFACE_MESSAGE = "The element must be a child of either an interface or a package!"
    
    // @Inject extension TransformationLogger
    
    val models = new LinkedHashMap<EAPackageContainer, FModel>
    val dataTypes = new LinkedHashMap<EAElementContainer, FType>
    val interfaces = new LinkedHashMap<EAElementContainer, FInterface>
    
    val modelDependencies = new LinkedHashMap<FModel, EAContainerWithNamespace[]>
    val fullQualifiedNames = new LinkedHashMap<String, EAContainerWithNamespace>
    val logMessages = new LinkedList<String>
    val strictTransformation = true
    
    // The following transform methods should be called in the written order. The first method
    // returns all available FModel instances. The caller is responsible to put them into a resource
    // set and to save them afterwards. Saving must be done after *EACH* method call. If the caller
    // does not save the returned models after each of these method calls it is possible that Xtext
    // cannot serialize the models because of unresolvable cross references between the models.
    
    /**
     * Analyses the referred EA packages and calculates the package dependencies. Creates empty
     * Franca models for all referred EA packages and their dependencies.
     */
    def FModel[] transformModels(EAPackageContainer[] packages) {
        packages.forEach[it.transformModel]
        models.values
    }
    
    /**
     * Generates the import statements based on the dependency analysis from the transformModels
     * method call. Expects a map with a relative save path for all Franca models to correctly
     * generate the import statements. If the map is empty or a model is missing the save path
     * is calculated by the getRelativeFidlPackagePath method.
     */
    def transformImports(Map<FModel, IPath> importPaths) {
        models.entrySet.forEach[
            for(element2Import : modelDependencies.get(it.value)) {
                var EAPackageContainer package2Import = null
                
                switch element2Import {
                    EAPackageContainer: package2Import = element2Import
                    EAElementContainer: package2Import = element2Import.^package
                }
                
                // Do not self-import since Franca will generate full qualified names for references 
                // within the same file anyway
                if(!it.key.equals(package2Import.fidlPackage)) {
                    it.value.imports.add(it.key.transformImport(package2Import, importPaths))
                }
            }
        ]
    }
    
    /**
     * Creates all Franca data type instances. But typedefs and arrays have no actual type and
     * derivations are not resolved right now. This must be done with the next step.
     */
    def transformTypes() {
        models.entrySet.forEach[
            val typeElements = it.key.packageElements.filter[it.type.equals(EAConstants::TYPE_CLASS)]
            
            for(typeCollection : typeElements.transformTypeCollections) {
                // The returned FTypeCollection can be also of type FInterface (an specialization of FTypeCollection)
                switch typeCollection {
                    FInterface: it.value.interfaces.add(typeCollection)
                    FTypeCollection: it.value.typeCollections.add(typeCollection)
                }
            }
        ]
    }
    
    /**
     * Creates all cross references between types (adds the actual type to all array and typedef
     * types and adds base type to structs, unions and enumerations).
     */
    def transformTypeCrossReferences() {
        dataTypes.entrySet.forEach[it.key.transformDataTypeCrossReferences]
    }
    
    /**
     * Creates all missing Franca interfaces (without attributes, methods, broadcasts and derivation
     * since we possibly don't know the derived interface at this time). Some interfaces may already
     * exist since interfaces are also type collections (see transformTypes() method).
     */
    def transformInterfaces() {
        models.entrySet.forEach[
            for(interfaceElement : it.key.packageElements.filter[it.isTransformableInterfaceElement]) {
                it.value.interfaces.add(interfaceElement.transformInterface)
            }
        ]
    }
    
    /**
     * Creates all Franca interface contents (attributes, methods and broadcasts).
     */
    def transformInterfaceContents() {
        interfaces.entrySet.forEach[
            it.key.transformInterfaceContents(it.value)
            // TODO
            // The line below is currently replace by the code below since Xtend 2.4.1 produces 
            // a senseless warning here.
            // it.key.oppositeFrancaInterfaceElement?.transformInterfaceContents(it)
            val oppositeFrancaInterfaceElement = it.key.oppositeFrancaInterfaceElement
            
            if(null != oppositeFrancaInterfaceElement) {
                oppositeFrancaInterfaceElement.transformInterfaceContents(it.value)
            }
        ]
    }
    
    /**
     * Creates all cross references between interfaces (derivations).
     */
    def transformInterfaceCrossReferences() {
        interfaces.entrySet.forEach[it.key.transformInterfaceCrossReferences]
    }
    
    //
    // Register methods
    //
    /**
     * All generated Franca objects with their corresponding EA container classes should be registered. This method
     * will check if another element has the same full qualified name. Further more this method caches all objects
     * that will be needed for cross references (e.g. type inheritance)
     */
    def private registerContainer(EObject francaObject, EAContainer container) {
        if(container instanceof EAContainerWithNamespace && (francaObject instanceof FModel || francaObject instanceof FModelElement)) {
            val containerWithNamespace = container as EAContainerWithNamespace
            val fidlFqn = containerWithNamespace.fidlNamespaceAsPath.normalizeNamespacePath(containerWithNamespace).path2Namespace
            
            if(fullQualifiedNames.containsKey(fidlFqn)) {
                val collisionContainer = fullQualifiedNames.get(fidlFqn)
                addIssue(ERROR, containerWithNamespace, FULL_QUALIFIED_NAME_MESSAGE, containerWithNamespace.namespace, collisionContainer.namespace, fidlFqn)
            } else {
                fullQualifiedNames.put(fidlFqn, containerWithNamespace)
            }
        }
        
        switch francaObject {
            case container instanceof EAPackageContainer && francaObject instanceof FModel:
                models.put(container as EAPackageContainer, francaObject as FModel)
            
            case container instanceof EAElementContainer && francaObject instanceof FInterface:
                interfaces.put(container as EAElementContainer, francaObject as FInterface)
            
            case container instanceof EAElementContainer && francaObject instanceof FType:
                dataTypes.put(container as EAElementContainer, francaObject as FType)
        }
    }
    
    //
    // Log methods.
    //
    def String[] getLogMessages() {
        logMessages
    }
    
    def private addIssue(int issueType, EAContainerWithNamespace container, String message, Object... args) {
        val m1 = String::format(DEFAULT_MESSAGE + " ", issueType.issueTypeName, container.EAObjectType.getName.toLowerCase, container.namespace)
        val m2 = String::format(message, args)
        
        switch issueType {
            case WARNING:
                logMessages.add(m1 + m2)
                
            case ERROR_IF_STRICT == issueType && !strictTransformation:
                logMessages.add(m1 + m2)
                
            case ERROR_IF_STRICT == issueType && strictTransformation:
                throw new EA2FrancaTransformationException(m1 + m2)
                
            case ERROR:
                throw new EA2FrancaTransformationException(m1 + m2)
                
            case INTERNAL_ERROR:
                throw new EA2FrancaTransformationException(m1 + m2)
        }
    }
    
    def private getIssueTypeName(int issueType) {
        if(WARNING == issueType || (ERROR_IF_STRICT == issueType && !strictTransformation)) {
            WARNING_DEFAULT_MESSAGE_START
        } else if(ERROR == issueType || (ERROR_IF_STRICT == issueType && strictTransformation)) {
            ERROR_DEFAULT_MESSAGE_START
        } else if(INTERNAL_ERROR == issueType) {
            INTERNAL_ERROR_DEFAULT_MESSAGE_START
        } else {
            UNKNOWN_ISSUE_DEFAULT_MESSAGE_START
        }
    }
    
    //
    // Internal transformation methods.
    //
    def private create FrancaFactory::eINSTANCE.createFModel transformModel(EAPackageContainer fidlPackage) {
        registerContainer(fidlPackage)
        name = fidlPackage.fidlNamespaceAsPath.normalizeNamespacePath(fidlPackage).path2Namespace
        
        val fidlPackageDependencies = new LinkedHashSet<EAContainerWithNamespace>
        
        // Resolving dependencies automatically (by finding dependent external elements)
        for(externalElement : fidlPackage.externalPackageElements) {
            val fidlPackage2Import = externalElement.fidlPackage
            
            if(null == fidlPackage2Import) {
                addIssue(ERROR, fidlPackage, AUTO_IMPORT_MESSAGE, externalElement.namespace)
            }
            // Transform the model of the import dependency
            fidlPackage2Import.transformModel
            fidlPackageDependencies.add(externalElement)
        }
        // Resolving dependencies by import association
        for(package2Import : fidlPackage.importedPackages) {
            val fidlPackage2Import = package2Import.fidlPackage
            
            if(null == fidlPackage2Import) {
                addIssue(ERROR, fidlPackage, MANUAL_IMPORT_MESSAGE, package2Import.namespace)
            }
            // Transform the model of the import dependency
            fidlPackage2Import.transformModel
            fidlPackageDependencies.add(package2Import)
        }
        modelDependencies.put(it, fidlPackageDependencies)
    }
    
    def private create FrancaFactory::eINSTANCE.createImport transformImport(EAPackageContainer fidlPackage, EAPackageContainer package2Import, Map<FModel, IPath> importPaths) {
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
    def private transformTypeCollections(EAElementContainer[] elements) {
        val typeCollections = new LinkedHashSet<FTypeCollection>
        
        for(element : elements) {
            val dataType = element.transformDataType
            
            if(null != dataType) {
                val parent = element.parent
                
                if(parent instanceof EAPackageContainer) {
                    val elementPackage = parent as EAPackageContainer
                    val fidlPackage = element.fidlPackage
                    
                    if(elementPackage.equals(fidlPackage)) {
                        addIssue(ERROR, element, ELEMENT_INSIDE_FIDL_PACKAGE_MESSAGE)
                    } else {
                        val typeCollection = elementPackage.transformTypeCollection
                        typeCollection.types.add(dataType)
                        typeCollections.add(typeCollection)
                    }
                } else if(parent instanceof EAElementContainer) {
                    var elementParent = parent as EAElementContainer
                    
                    if(!elementParent.isTransformableInterfaceElement) {
                        elementParent = elementParent.oppositeFrancaInterfaceElement
                        
                        if(null == elementParent || !elementParent.isTransformableInterfaceElement) {
                            addIssue(ERROR, element, ELEMENT_NOT_INSIDE_PACKAGE_OR_INTERFACE_MESSAGE)
                        }
                    }
                    val ^interface = elementParent.transformInterface
                    ^interface.types.add(dataType)
                    typeCollections.add(^interface)
                } else {
                    addIssue(ERROR, element, ELEMENT_NOT_INSIDE_PACKAGE_OR_INTERFACE_MESSAGE)
                }
            }
        }
        typeCollections
    }
    
    def private create FrancaFactory::eINSTANCE.createFTypeCollection transformTypeCollection(EAPackageContainer tcPackage) {
        registerContainer(tcPackage)
        val relativeNamespacePath = tcPackage.fidlNamespaceAsPath.makeRelativeTo(tcPackage.fidlPackage.fidlNamespaceAsPath)
        name = relativeNamespacePath.normalizeNamespacePath(tcPackage).path2Namespace
        version = tcPackage.transformVersion
        comment = transformAnnotationBlock(tcPackage.notes, tcPackage.author)
    }
    
    def private transformDataType(EAElementContainer element) {
        switch element {
            case element.hasStereotype(EAFrancaConstants::STEREOTYPE_TYPEDEF):     element.transformTypeDef
            case element.hasStereotype(EAFrancaConstants::STEREOTYPE_ARRAY):       element.transformArrayType
            case element.hasStereotype(EAFrancaConstants::STEREOTYPE_ENUMERATION): element.transformEnumerationType
            case element.hasStereotype(EAFrancaConstants::STEREOTYPE_STRUCT):      element.transformStructType
            case element.hasStereotype(EAFrancaConstants::STEREOTYPE_UNION):       element.transformUnionType
            case element.hasStereotype(EAFrancaConstants::STEREOTYPE_MAP):         element.transformMapType
            default: null
        }
    }
    
    def private void transformDataTypeCrossReferences(EAElementContainer element) {
        switch element {
            case element.hasStereotype(EAFrancaConstants::STEREOTYPE_TYPEDEF):     element.transformTypeDefCrossReferences
            case element.hasStereotype(EAFrancaConstants::STEREOTYPE_ARRAY):       element.transformArrayTypeCrossReferences
            case element.hasStereotype(EAFrancaConstants::STEREOTYPE_ENUMERATION): element.transformEnumerationTypeCrossReferences
            case element.hasStereotype(EAFrancaConstants::STEREOTYPE_STRUCT):      element.transformStructTypeCrossReferences
            case element.hasStereotype(EAFrancaConstants::STEREOTYPE_UNION):       element.transformUnionTypeCrossReferences
            case element.hasStereotype(EAFrancaConstants::STEREOTYPE_MAP):         element.transformMapTypeCrossReferences
        }
    }
    
    def private create FrancaFactory::eINSTANCE.createFTypeDef transformTypeDef(EAElementContainer element) {
        registerContainer(element)
        name = element.fidlName.normalizeName(true, element)
        comment = transformAnnotationBlock(element.notes, "")
        actualType = getTypeRef(null, FBasicTypeId::UNDEFINED.getName, element)
    }
    
    def private void transformTypeDefCrossReferences(EAElementContainer element) { transformTypeDef(element) => [
        val baseTypeElement = element.baseElement
        val baseType = element.parseGenlinks.get(EAConstants::GENLINK_PARENT)
        actualType = baseTypeElement.getTypeRef(baseType, element)
    ]}
    
    def private create FrancaFactory::eINSTANCE.createFArrayType transformArrayType(EAElementContainer element) {
        registerContainer(element)
        name = element.fidlName.normalizeName(true, element)
        comment = transformAnnotationBlock(element.notes, "")
        elementType = getTypeRef(null, FBasicTypeId::UNDEFINED.getName, element)
    }
    
    def private void transformArrayTypeCrossReferences(EAElementContainer element) { transformArrayType(element) => [
        val typeElement = element.arrayTypeElement
        val baseType = element.parseGenlinks.get(EAConstants::GENLINK_PARENT)
        elementType = typeElement.getTypeRef(baseType, element)
    ]}
    
    def private create FrancaFactory::eINSTANCE.createFEnumerationType transformEnumerationType(EAElementContainer element) {
        registerContainer(element)
        name = element.fidlName.normalizeName(true, element)
        comment = transformAnnotationBlock(element.notes, "")
        enumerators.addAll(element.attributes.map[transformEnumerator])
    }
    
    def private create FrancaFactory::eINSTANCE.createFEnumerator transformEnumerator(EAAttributeContainer attribute) {
        registerContainer(attribute)
        name = attribute.fidlName.normalizeName(true, attribute)
        val defaultValue = attribute.getDefault.trim
        if(defaultValue.length > 0) value = defaultValue
        comment = transformAnnotationBlock(attribute.notes, "")
    }
    
    def private void transformEnumerationTypeCrossReferences(EAElementContainer element) { transformEnumerationType(element) => [
        base = element.getBaseType(typeof(FEnumerationType))
    ]}
    
    def private create FrancaFactory::eINSTANCE.createFStructType transformStructType(EAElementContainer element) {
        registerContainer(element)
        name = element.fidlName.normalizeName(true, element)
        comment = transformAnnotationBlock(element.notes, "")
    }
    
    def private void transformStructTypeCrossReferences(EAElementContainer element) { transformStructType(element) => [
        elements.addAll(element.attributes.map[transformField])
        base = element.getBaseType(typeof(FStructType))
    ]}
    
    def private create FrancaFactory::eINSTANCE.createFUnionType transformUnionType(EAElementContainer element) {
        registerContainer(element)
        name = element.fidlName.normalizeName(true, element)
        comment = transformAnnotationBlock(element.notes, "")
    }
    
    def private void transformUnionTypeCrossReferences(EAElementContainer element) { transformUnionType(element) => [
        elements.addAll(element.attributes.map[transformField])
        base = element.getBaseType(typeof(FUnionType))
    ]}
    
    def private create FrancaFactory::eINSTANCE.createFField transformField(EAAttributeContainer attribute) {
        registerContainer(attribute)
        name = attribute.fidlName.normalizeName(true, attribute)
        type = attribute.typeElement.getTypeRef(attribute.type, attribute)
        comment = transformAnnotationBlock(attribute.notes, "")
        array = if(attribute.collection) INLINE_ARRAY_BRACKETS else null
    }
    
    def private create FrancaFactory::eINSTANCE.createFMapType transformMapType(EAElementContainer element) {
        registerContainer(element)
        name = element.fidlName.normalizeName(true, element)
        comment = transformAnnotationBlock(element.notes, "")
        keyType = getTypeRef(null, FBasicTypeId::UNDEFINED.getName, element)
        valueType = getTypeRef(null, FBasicTypeId::UNDEFINED.getName, element)
    }
    
    def private void transformMapTypeCrossReferences(EAElementContainer element) { transformMapType(element) => [
        element.attributes.forEach[attribute |
            // TODO Stereotypes really necessary?
            
            // Key attribute should be named "key" or should have stereotype «key»
            if(attribute.name.equals(EAFrancaConstants::STEREOTYPE_KEY) || attribute.hasStereotype(EAFrancaConstants::STEREOTYPE_KEY)) {
                keyType = attribute.typeElement.getTypeRef(attribute.type, attribute)
            }
            // Value attribute should be named "value" or should have stereotype «value»
            if(attribute.name.equals(EAFrancaConstants::STEREOTYPE_VALUE) || attribute.hasStereotype(EAFrancaConstants::STEREOTYPE_VALUE)) {
                valueType = attribute.typeElement.getTypeRef(attribute.type, attribute)
            }
        ]
    ]}
    
    def private create FrancaFactory::eINSTANCE.createFInterface transformInterface(EAElementContainer element) {
        registerContainer(element)
        val ePath = element.fidlNamespaceAsPath
        val fPath = element.fidlPackage.fidlNamespaceAsPath
        val relativeNamespacePath = ePath.makeRelativeTo(fPath)
        name = relativeNamespacePath.normalizeNamespacePath(element).path2Namespace
        comment = transformAnnotationBlock(element.notes, element.author)
        version = element.transformVersion
    }
    
    def private transformInterfaceContents(EAElementContainer element, FInterface ^interface) {
        ^interface.attributes.addAll(element.attributes.map[transformAttribute])
        ^interface.methods.addAll(element.methods.filter[it.method].map[transformMethod])
        ^interface.broadcasts.addAll(element.methods.filter[it.broadcast].map[transformBroadcast])
    }
    
    def private transformInterfaceCrossReferences(EAElementContainer element) { transformInterface(element) => [
        val baseInterfaceElement = element.baseElement
        
        if(null != baseInterfaceElement) {
            base = interfaces.get(baseInterfaceElement)
            
            if(null == base) {
                if(baseInterfaceElement.isClientFrancaInterfaceElement) {
                    addIssue(ERROR, element, CLIENT_INTERFACE_AS_BASE_MESSAGE, baseInterfaceElement.namespace)
                } else {
                    val elementType = baseInterfaceElement.EAObjectType.getName.toLowerCase
                    addIssue(INTERNAL_ERROR, element, MODEL_ANALYSIS_ERROR_MESSAGE, elementType, baseInterfaceElement.namespace, elementType)
                }
            }
        }
    ]}
    
    def private create FrancaFactory::eINSTANCE.createFAttribute transformAttribute(EAAttributeContainer attribute) {
        registerContainer(attribute)
        name = attribute.fidlName.normalizeName(true, attribute)
        type = attribute.typeElement.getTypeRef(attribute.type, attribute)
        comment = transformAnnotationBlock(attribute.notes, "")
        array = if(attribute.collection) INLINE_ARRAY_BRACKETS else null
        readonly = attribute.readOnlyAttribute
        noSubscriptions = attribute.noSubscriptionsAttribute
    }
    
    def private create FrancaFactory::eINSTANCE.createFMethod transformMethod(EAMethodContainer method) {
        registerContainer(method)
        name = method.fidlName.normalizeName(true, method)
        comment = transformAnnotationBlock(method.notes, "")
        fireAndForget = if(method.fireAndForgetMethod) InterfaceDefinitionKeyword::FIRE_AND_FORGET.toString else null
        
        val inParams = new LinkedHashSet<EAParameterContainer>()
        val outParams = new LinkedHashSet<EAParameterContainer>()
        val errorParams = new LinkedHashSet<EAParameterContainer>()
        val errorTypes = new LinkedHashSet<EAParameterContainer>()
        
        // sort all parameters
        method.parameters.forEach[
            switch it {
                // if parameter is named "error" its type will be the base enum of the error block
                case !it.type.equals("") &&  it.hasStereotype(EAFrancaConstants::STEREOTYPE_ERROR): errorTypes.add(it)
                // if parameter has no type and stereotype error it will be an error enumerator
                case it.type.equals("") && it.hasStereotype(EAFrancaConstants::STEREOTYPE_ERROR): errorParams.add(it)
                // if kind is "out" it will be an out parameter
                case it.kind == EAConstants::PARAMETER_DIRECTION_OUT: outParams.add(it)
                // if kind is "in" it will be an in parameter
                case it.kind == EAConstants::PARAMETER_DIRECTION_IN: inParams.add(it)
            }
        ]
        
        inArgs.addAll(inParams.map[transformArgument])
        outArgs.addAll(outParams.map[transformArgument])
        
        // TODO really needed?
        // If method has a return type it will be added to the out arguments list
        // with the name "return_value".
        val returnTypeAsString = method.returnType
        
        if(returnTypeAsString.length > 0) {
            val returnType = method.returnTypeElement.getTypeRef(returnTypeAsString, method)
            
            if(null != returnType) {
                val returnOutParam = FrancaFactory::eINSTANCE.createFArgument
                returnOutParam.name = name + "_return_value"
                returnOutParam.type = returnType
                returnOutParam.array = if(method.returnTypeArray) INLINE_ARRAY_BRACKETS else null
                
                outArgs.add(returnOutParam)
            }
        }
        
        if(outArgs.size > 0 && null != fireAndForget) {
            addIssue(ERROR, method, FIRE_AND_FORGET_WITH_OUT_PARAMS_MESSAGE)
        }
        
        if(errorParams.size > 0) {
            errors = FrancaFactory::eINSTANCE.createFEnumerationType
            errors.enumerators.addAll(errorParams.map[
                val enumerator = FrancaFactory::eINSTANCE.createFEnumerator
                enumerator.name = it.fidlName
                it.getDefault.trim => [ if(it.length > 0) enumerator.value = it ]
                enumerator.comment = transformAnnotationBlock(it.notes, "")
                enumerator
            ])
        }
        
        if(errorTypes.size > 0) {
            if(errorTypes.size > 1) {
                addIssue(ERROR, method, ERROR_ENUM_TYPE_COUNT_MESSAGE)
            }
            val errorEnumTypeElement = errorTypes.head.typeElement
            val errorEnumType = dataTypes.get(errorEnumTypeElement)
            
            if(null == errorEnumType) {
                val elementType = errorEnumTypeElement.EAObjectType.getName.toLowerCase
                addIssue(INTERNAL_ERROR, method, MODEL_ANALYSIS_ERROR_MESSAGE, elementType, errorEnumTypeElement.namespace, elementType)
            }
            
            if(!(errorEnumType instanceof FEnumerationType)) {
                addIssue(ERROR, method, ERROR_ENUM_TYPE_MESSAGE)
            }
            
            if(null != errors) {
                errors.base = errorEnumType as FEnumerationType
            } else {
                errorEnum = errorEnumType as FEnumerationType
            }
        }
    }
    
    def private create FrancaFactory::eINSTANCE.createFBroadcast transformBroadcast(EAMethodContainer method) {
        registerContainer(method)
        name = method.fidlName.normalizeName(true, method)
        comment = transformAnnotationBlock(method.notes, "")
        selective = if(method.selectiveBroadcast) InterfaceDefinitionKeyword::SELECTIVE.toString else null
        
        outArgs.addAll(method.parameters.filter[it.kind == EAConstants::PARAMETER_DIRECTION_OUT].map[transformArgument])
    }
    
    def private create FrancaFactory::eINSTANCE.createFArgument transformArgument(EAParameterContainer parameter) {
        registerContainer(parameter)
        name = parameter.fidlName.normalizeName(true, parameter)
        type = parameter.typeElement.getTypeRef(parameter.type, parameter)
        comment = transformAnnotationBlock(parameter.notes, "")
        array = if(parameter.hasStereotype(EAFrancaConstants::STEREOTYPE_ARRAY)) INLINE_ARRAY_BRACKETS else null
    }
    
    def private transformVersion(EAContainerWithElements container) {
        val versionString = container.version.trim
        
        // Since the version statement is optional in Franca it will be only created if it is set in EA
        if(versionString.length == 0) {
            null
        } else {
            val version = FrancaFactory::eINSTANCE.createFVersion => [
                registerContainer(container)
                val versionSegments = versionString.split("\\.")
                
                if(versionSegments.size > 0) {
                    try {
                        major = new Integer(versionSegments.get(0))
                    } catch(NumberFormatException e) {
                        major = DEFAULT_MAJOR_VERSION_NUMBER
                        addIssue(ERROR_IF_STRICT, container, VERSION_NUMBER_FORMAT_MESSAGE, versionString)
                    }
                }
                if(versionSegments.size > 1) {
                    try {
                        minor = new Integer(versionSegments.get(1))
                    } catch(NumberFormatException e) {
                        minor = DEFAULT_MINOR_VERSION_NUMBER
                        addIssue(ERROR_IF_STRICT, container, VERSION_NUMBER_FORMAT_MESSAGE, versionString)
                    }
                }
            ]
            version
        }
    }
    
    def private transformAnnotationBlock(String note, String author) {
        val noteLength = note.trim.length
        val authorLength = author.trim.length
        
        if(noteLength > 0 || authorLength > 0) {
            val annotationBlock = FrancaFactory::eINSTANCE.createFAnnotationBlock
            
            if(noteLength > 0) {
                annotationBlock.elements.add(note.transformAnnotation(FAnnotationType::DESCRIPTION))
            }
            if(authorLength > 0) {
                annotationBlock.elements.add(author.transformAnnotation(FAnnotationType::AUTHOR))
            }
            annotationBlock
        } else {
            null
        }
    }
    
    def private transformAnnotation(String comment, FAnnotationType annotationType) {
        val annotation = FrancaFactory::eINSTANCE.createFAnnotation
        annotation.type = annotationType
        annotation.comment = comment.replaceAll("@", COMMENT_AT_REPLACEMENT)
        
        annotation
    }
    
    // 
    // Internal helper methods.
    // 
    /**
     * Returns a list with all elements within a package or an element (search is done recursively). Recursion
     * stops if child package has stereotype fidl or nofidl. Elements (and its child elements) are ignored too if
     * it has stereotype nofidl.
     */
    def private Set<EAElementContainer> getPackageElements(EAContainerWithElements container2Scan) {
        val elements = new LinkedHashSet<EAElementContainer>
        
        val container2ScanElements = container2Scan.elements.filter[!it.hasStereotype(EAFrancaConstants::STEREOTYPE_NO_FIDL)]
        elements.addAll(container2ScanElements)
        container2ScanElements.forEach[elements.addAll(it.packageElements)]
        
        if(container2Scan instanceof EAPackageContainer) {
            val container2ScanPackages = (container2Scan as EAPackageContainer).packages.filter[!it.hasStereotype(EAFrancaConstants::STEREOTYPE_NO_FIDL) && !it.hasStereotype(EAFrancaConstants::STEREOTYPE_FIDL)]
            container2ScanPackages.forEach[elements.addAll(it.packageElements)]
        }
        elements
    }
    
    /**
     * Returns a list with all elements which are needed by the referred package but are not a member of the
     * referred package (e.g. base classes or base interfaces).
     */
    def private getExternalPackageElements(EAPackageContainer fidlPackage2Scan) {
        val externalElements = new LinkedHashSet<EAElementContainer>
        
        fidlPackage2Scan.packageElements.forEach[
            switch it {
                case it.type.equals(EAConstants::TYPE_CLASS): externalElements.addExternalTypeElements(it, fidlPackage2Scan)
                case it.type.equals(EAConstants::TYPE_INTERFACE): externalElements.addExternalInterfaceElements(it, fidlPackage2Scan)
            }
        ]
        externalElements
    }
    
    def private void addExternalTypeElements(Set<EAElementContainer> externalElements, EAElementContainer element2Scan, EAPackageContainer fidlPackage2Scan) {
        switch element2Scan {
            case element2Scan.hasStereotype(EAFrancaConstants::STEREOTYPE_TYPEDEF):
                externalElements.addExternalTypeDefElements(element2Scan, fidlPackage2Scan)
                
            case element2Scan.hasStereotype(EAFrancaConstants::STEREOTYPE_ARRAY):
                externalElements.addExternalArrayTypeElements(element2Scan, fidlPackage2Scan)
                
            case element2Scan.hasStereotype(EAFrancaConstants::STEREOTYPE_ENUMERATION):
                externalElements.addExternalEnumerationTypeElements(element2Scan, fidlPackage2Scan)
                
            case element2Scan.hasStereotype(EAFrancaConstants::STEREOTYPE_STRUCT):
                externalElements.addExternalStructTypeElements(element2Scan, fidlPackage2Scan)
                
            case element2Scan.hasStereotype(EAFrancaConstants::STEREOTYPE_UNION):
                externalElements.addExternalUnionTypeElements(element2Scan, fidlPackage2Scan)
                
            case element2Scan.hasStereotype(EAFrancaConstants::STEREOTYPE_MAP):
                externalElements.addExternalMapTypeElements(element2Scan, fidlPackage2Scan)
        }
    }
    
    def private void addExternalTypeDefElements(Set<EAElementContainer> externalElements, EAElementContainer element2Scan, EAPackageContainer fidlPackage2Scan) {
        externalElements.addExternalBaseTypeElement(element2Scan, fidlPackage2Scan)
    }
    
    def private void addExternalArrayTypeElements(Set<EAElementContainer> externalElements, EAElementContainer element2Scan, EAPackageContainer fidlPackage2Scan) {
        externalElements.addExternalElement(element2Scan.arrayTypeElement, fidlPackage2Scan)
    }
    
    def private void addExternalEnumerationTypeElements(Set<EAElementContainer> externalElements, EAElementContainer element2Scan, EAPackageContainer fidlPackage2Scan) {
        externalElements.addExternalBaseTypeElement(element2Scan, fidlPackage2Scan)
    }
    
    def private void addExternalStructTypeElements(Set<EAElementContainer> externalElements, EAElementContainer element2Scan, EAPackageContainer fidlPackage2Scan) {
        externalElements.addExternalBaseTypeElement(element2Scan, fidlPackage2Scan)
        externalElements.addExternalAttributeElements(element2Scan, fidlPackage2Scan)
    }
    
    def private void addExternalUnionTypeElements(Set<EAElementContainer> externalElements, EAElementContainer element2Scan, EAPackageContainer fidlPackage2Scan) {
        externalElements.addExternalBaseTypeElement(element2Scan, fidlPackage2Scan)
        externalElements.addExternalAttributeElements(element2Scan, fidlPackage2Scan)
    }
    
    def private void addExternalMapTypeElements(Set<EAElementContainer> externalElements, EAElementContainer element2Scan, EAPackageContainer fidlPackage2Scan) {
        externalElements.addExternalAttributeElements(element2Scan, fidlPackage2Scan)
    }
    
    def private void addExternalInterfaceElements(Set<EAElementContainer> externalElements, EAElementContainer element2Scan, EAPackageContainer fidlPackage2Scan) {
        externalElements.addExternalBaseInterfaceElement(element2Scan, fidlPackage2Scan)
        externalElements.addExternalAttributeElements(element2Scan, fidlPackage2Scan)
        externalElements.addExternalMethodElements(element2Scan, fidlPackage2Scan)
    }
    
    def private void addExternalMethodElements(Set<EAElementContainer> externalElements, EAElementContainer element2Scan, EAPackageContainer fidlPackage2Scan) {
        element2Scan.methods.forEach[
            it.parameters.map[it.typeElement].forEach[externalElements.addExternalElement(it, fidlPackage2Scan)]
            externalElements.addExternalElement(it.returnTypeElement, fidlPackage2Scan)
        ]
    }
    
    def private void addExternalAttributeElements(Set<EAElementContainer> externalElements, EAElementContainer element2Scan, EAPackageContainer fidlPackage2Scan) {
        element2Scan.attributes.map[it.typeElement].forEach[externalElements.addExternalElement(it, fidlPackage2Scan)]
    }
    
    def private void addExternalBaseTypeElement(Set<EAElementContainer> externalElements, EAElementContainer element2Scan, EAPackageContainer fidlPackage2Scan) {
        externalElements.addExternalElement(element2Scan.baseElement, fidlPackage2Scan)
    }
    
    def private void addExternalBaseInterfaceElement(Set<EAElementContainer> externalElements, EAElementContainer element2Scan, EAPackageContainer fidlPackage2Scan) {
        element2Scan.baseElement => [
            if(null != it) {
                if(!it.isClientFrancaInterfaceElement) {
                    externalElements.addExternalElement(it, fidlPackage2Scan)
                } else {
                    externalElements.addExternalElement(it.oppositeFrancaInterfaceElement, fidlPackage2Scan)
                }
            }
        ]
    }
    
    def private void addExternalElement(Set<EAElementContainer> externalElements, EAElementContainer element2Add, EAPackageContainer fidlPackage2Scan) {
        if(null != element2Add) {
            val fidlPackageOfElement2Scan = element2Add.fidlPackage
            
            if(null == fidlPackageOfElement2Scan) {
                addIssue(ERROR, fidlPackage2Scan, AUTO_IMPORT_MESSAGE, element2Add.namespace)
            }
            externalElements.add(element2Add)
        }
    }
    
    def private getTypeRef(EAElementContainer element, String type, EAContainerWithNamespace container) {
        val typeRef = FrancaFactory::eINSTANCE.createFTypeRef
        
        if(null != element) {
            if(!dataTypes.containsKey(element)) {
                val elementType = element.EAObjectType.getName.toLowerCase
                addIssue(INTERNAL_ERROR, container, MODEL_ANALYSIS_ERROR_MESSAGE, elementType, element.namespace, elementType)
            }
            typeRef.derived = dataTypes.get(element)
        }
        if(null == typeRef.derived) {
            val normalizedName = type?.normalizeName(true, container)
            val basicTypeId = FBasicTypeId::getByName(normalizedName)
            
            if(null != basicTypeId) {// check if name is a base type
                typeRef.predefined = basicTypeId
            } else {
                typeRef.predefined = FBasicTypeId::UNDEFINED
                addIssue(ERROR_IF_STRICT, container, TYPE_NOT_RESOLVABLE_MESSAGE, type)
            }
        }
        typeRef
    }
    
    def private <T extends FType> getBaseType(EAElementContainer element, Class<T> expectedType) {
        val baseElement = element.baseElement
        val baseType = dataTypes.get(baseElement)
        
        if(null != baseElement && null == baseType) {
            val elementType = baseElement.EAObjectType.getName.toLowerCase
            addIssue(INTERNAL_ERROR, element, MODEL_ANALYSIS_ERROR_MESSAGE, elementType, baseElement.namespace, elementType)
        }
        if(expectedType.isInstance(baseType)) {
            return baseType as T
        } else {
            return null
        }
    }
    
    def private getBaseElement(EAElementContainer element) {
        val baseClasses = element.baseClasses.filter[it.type.equals(element.type)]
        
        if(baseClasses.size > 1) {
            addIssue(ERROR, element, BASE_TYPE_COUNT_MESSAGE)
        }
        baseClasses.head
    }
    
    /**
     * Searches for the "opposite" Franca interface. An opposite interface must be connected
     * with an undirected association with stereotype "FrancaInterface" with the referred
     * interface element. Further more its name must end with "Client" if the name of the 
     * referred interface does not end with "Client" or vice versa. The rest of the name must
     * be identically.
     */
    def private getOppositeFrancaInterfaceElement(EAElementContainer element) {
        val elementName = element.fidlName
        val oppositeFrancaInterfaceElements = element.getConnectors(EAConnectorContainer::ASSOCIATION).filter[
            it.hasStereotype(EAFrancaConstants::STEREOTYPE_FRANCA_INTERFACE) && !it.directed
        ].map[it.getOpposite(element)].filter[
            val oppositeElementName = it.fidlName
            val filter = it.type.equals(EAConstants::TYPE_INTERFACE) && 
                (elementName.equals(oppositeElementName + EAFrancaConstants::CLIENT_INTERFACE_NAME_SUFFIX) ||
                oppositeElementName.equals(elementName + EAFrancaConstants::CLIENT_INTERFACE_NAME_SUFFIX))
            filter
        ]
        if(oppositeFrancaInterfaceElements.size > 1) {
            addIssue(ERROR, element, CLIENT_INTERFACE_COUNT_MESSAGE)
        }
        oppositeFrancaInterfaceElements.head
    }
    
    def private isClientFrancaInterfaceElement(EAElementContainer element) {
        val oppositeFrancaInterfaceElement = element.oppositeFrancaInterfaceElement
        
        if(null != oppositeFrancaInterfaceElement &&
            element.fidlName.equals(oppositeFrancaInterfaceElement.fidlName + EAFrancaConstants::CLIENT_INTERFACE_NAME_SUFFIX) &&
            element.type.equals(EAConstants::TYPE_INTERFACE)) {
            true
        } else {
            false
        }
    }
    
    def private isTransformableInterfaceElement(EAElementContainer element) {
        if(element.type.equals(EAConstants::TYPE_INTERFACE) && !element.isClientFrancaInterfaceElement) {
            true
        } else {
            false
        }
    }
    
    def private getArrayTypeElement(EAElementContainer element) {
        // find all directed association with stereotype "arrayOf" and get the opposite element of this association
        val arrayOfAssociations = element.getConnectors(EAConnectorContainer::ASSOCIATION).filter[
            it.hasStereotype(EAFrancaConstants::STEREOTYPE_ARRAF_OF) && 
            it.isNavigable(it.getOpposite(element)) && 
            !it.isNavigable(element)
        ]
        if(arrayOfAssociations.size > 1) {
            addIssue(ERROR, element, ARRAY_OF_ASSOCIATION_COUNT_MESSAGE)
        }
        val oppositeElement = arrayOfAssociations.head?.getOpposite(element)
        
        if(null != oppositeElement && oppositeElement.type == EAConstants::TYPE_CLASS) {
            oppositeElement
        } else {
            null
        }
    }
    
    def private isReadOnlyAttribute(EAAttributeContainer attribute) {
        if(attribute.hasStereotype(EAFrancaConstants::STEREOTYPE_READ_ONLY) || 
           attribute.hasStereotype(EAFrancaConstants::STEREOTYPE_ATTRIBUTE_READ_ONLY) || 
           attribute.hasStereotype(EAFrancaConstants::STEREOTYPE_ATTRIBUTE_READ_ONLY_NO_SUBSCRIPTIONS)) {
            true
        } else {
            false
        }
    }
    
    def private isNoSubscriptionsAttribute(EAAttributeContainer attribute) {
        if(attribute.hasStereotype(EAFrancaConstants::STEREOTYPE_NO_SUBSCRIPTIONS) || 
           attribute.hasStereotype(EAFrancaConstants::STEREOTYPE_ATTRIBUTE_NO_SUBSCRIPTIONS) || 
           attribute.hasStereotype(EAFrancaConstants::STEREOTYPE_ATTRIBUTE_READ_ONLY_NO_SUBSCRIPTIONS)) {
            true
        } else {
            false
        }
    }
    
    def private isFireAndForgetMethod(EAMethodContainer method) {
        if(method.hasStereotype(EAFrancaConstants::STEREOTYPE_FIRE_AND_FORGET) || 
           method.hasStereotype(EAFrancaConstants::STEREOTYPE_METHOD_FIRE_AND_FORGET)) {
            true
        } else {
            false
        }
    }
    
    def private isMethod(EAMethodContainer method) {
        if(method.hasStereotype(EAFrancaConstants::STEREOTYPE_METHOD) || 
           method.hasStereotype(EAFrancaConstants::STEREOTYPE_METHOD_FIRE_AND_FORGET)) {
            true
        } else {
            false
        }
    }
    
    def private isSelectiveBroadcast(EAMethodContainer method) {
        if(method.hasStereotype(EAFrancaConstants::STEREOTYPE_SELECTIVE) || 
           method.hasStereotype(EAFrancaConstants::STEREOTYPE_BROADCAST_SELECTIVE)) {
            true
        } else {
            false
        }
    }
    
    def private isBroadcast(EAMethodContainer method) {
        if(method.hasStereotype(EAFrancaConstants::STEREOTYPE_BROADCAST) || 
           method.hasStereotype(EAFrancaConstants::STEREOTYPE_BROADCAST_SELECTIVE)) {
            true
        } else {
            false
        }
    }
    
    def private parseGenlinks(EAElementContainer element) {
        val map = new LinkedHashMap<String, String>
        element.genlinks.split(";").forEach[
            val keyValueArray = it.split("=")
            switch(keyValueArray.size) {
                case 2: map.put(keyValueArray.get(0), keyValueArray.get(1))
                case 1: map.put(keyValueArray.get(0), null)
            }
        ]
        map
    }
    
    /**
     * Just calls the static version of this method which can be used as extension method (see Xtend docs).
     */
    def private String normalizeName(String name, boolean allowKeywords, EAContainerWithNamespace container) {
        try {
            if(allowKeywords) {
                FrancaUtils::normalizeName(name, FrancaUtils::SPACES, FrancaUtils::KEYWORDS)
            } else {
                val normalizationMask = FrancaUtils::SPACES.bitwiseOr(FrancaUtils::INTERFACE_DEFINITION_KEYWORDS)
                
                FrancaUtils::normalizeName(name, normalizationMask, FrancaUtils::NONE)
            }
        } catch (Exception e) {
            addIssue(ERROR, container, e.message)
            null
        }
    }
    
    /**
     * Just calls the static version of this method which can be used as extension method (see Xtend docs).
     */
    def private IPath normalizeNamespacePath(IPath path, EAContainerWithNamespace container) {
        try {
            val normalizationMask = FrancaUtils::SPACES.bitwiseOr(FrancaUtils::INTERFACE_DEFINITION_KEYWORDS)
            
            FrancaUtils::normalizeNamespacePath(path, normalizationMask, FrancaUtils::DEPLOYMENT_DEFINITION_KEYWORDS)
        } catch (Exception e) {
            addIssue(ERROR, container, e.message)
            null
        }
    }
    
    def private getFidlNamespaceAsPath(EAContainerWithNamespace container) {
        EAContainerExtensions::getFidlNamespaceAsPath(container);
    }
    
    def private getFidlPackage(EAContainerWithNamespace container) {
        EAContainerExtensions::getFidlPackage(container);
    }
    
    def private getFidlName(EAContainerWithNamespace container) {
        EAContainerExtensions::getFidlName(container);
    }
    
    def private path2Namespace(IPath namespaceAsPath) {
        FrancaUtils::path2NamespaceString(namespaceAsPath.toString)
    }
    
    /**
     * Returns the save path for a Franca model. Takes the path that was referred to transformImports method or
     * calculates its own path.
     */
    def private getRelativeFidlPackagePath(EAPackageContainer fidlPackage, Map<FModel, IPath> importPaths) {
        val referredPath = importPaths.get(models.get(fidlPackage))
        
        if(null != referredPath) {
            referredPath
        } else {
            FrancaUtils::getRelativeFidlPackagePath(models.get(fidlPackage))
        }
    }
}
