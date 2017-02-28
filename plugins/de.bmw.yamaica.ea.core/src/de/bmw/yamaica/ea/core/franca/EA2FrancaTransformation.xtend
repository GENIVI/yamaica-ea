/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.franca

import de.bmw.yamaica.common.core.utils.CircleFinder
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
import de.bmw.yamaica.ea.core.franca.exceptions.CircleException
import de.bmw.yamaica.ea.core.franca.exceptions.ClientInterfaceDerivationException
import de.bmw.yamaica.ea.core.franca.exceptions.ErrorEnumTypeCountException
import de.bmw.yamaica.ea.core.franca.exceptions.ErrorEnumTypeException
import de.bmw.yamaica.ea.core.franca.exceptions.FireAndForgetMethodException
import de.bmw.yamaica.ea.core.franca.exceptions.ForbiddenAttributeNameException
import de.bmw.yamaica.ea.core.franca.exceptions.FullyQualifiedNameCollisionException
import de.bmw.yamaica.ea.core.franca.exceptions.InternalErrorException
import de.bmw.yamaica.ea.core.franca.exceptions.InvalidTypeCollectionNamingException
import de.bmw.yamaica.ea.core.franca.exceptions.ManualImportException
import de.bmw.yamaica.ea.core.franca.exceptions.TypeResolvingException
import de.bmw.yamaica.ea.core.franca.exceptions.VersionNumberFormatException
import de.bmw.yamaica.franca.common.core.FrancaUtils
import java.util.Collection
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.List
import java.util.Map
import java.util.Set
import java.util.logging.Level
import java.util.logging.Logger
import org.apache.commons.lang.StringUtils
import org.eclipse.core.runtime.IPath
import org.eclipse.emf.ecore.EObject
import org.franca.core.franca.FAnnotation
import org.franca.core.franca.FAnnotationBlock
import org.franca.core.franca.FAnnotationType
import org.franca.core.franca.FArgument
import org.franca.core.franca.FArrayType
import org.franca.core.franca.FAttribute
import org.franca.core.franca.FBasicTypeId
import org.franca.core.franca.FBroadcast
import org.franca.core.franca.FEnumerationType
import org.franca.core.franca.FEnumerator
import org.franca.core.franca.FExpression
import org.franca.core.franca.FField
import org.franca.core.franca.FIntegerConstant
import org.franca.core.franca.FInterface
import org.franca.core.franca.FMapType
import org.franca.core.franca.FMethod
import org.franca.core.franca.FModel
import org.franca.core.franca.FModelElement
import org.franca.core.franca.FStringConstant
import org.franca.core.franca.FStructType
import org.franca.core.franca.FType
import org.franca.core.franca.FTypeCollection
import org.franca.core.franca.FTypeDef
import org.franca.core.franca.FTypeRef
import org.franca.core.franca.FTypedElement
import org.franca.core.franca.FUnionType
import org.franca.core.franca.FVersion
import org.franca.core.franca.FrancaFactory
import org.franca.core.franca.Import

import static de.bmw.yamaica.ea.core.franca.EADependencyDiscoverer.*

import static extension de.bmw.yamaica.ea.core.franca.EAContainerExtensions.*
import static extension de.bmw.yamaica.franca.common.core.FrancaUtils.*

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
    static val COMMENT_STAR_REPLACEMENT = "(star)"
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
    static val FULLY_QUALIFIED_NAME_MESSAGE = "The elements \"%s\" and \"%s\" have the same fully qualified name \"%s\"!"
    static val CIRCLE_MESSAGE = "The package (%s) contains an import circle."
    static val TYPE_COLLECTION_INVALID_ELEMENT_NAME = "TypeCollection '%s' (%s) contains element with the same name!"
    static val FORBIDDEN_ATTRIBUTE_NAME = "Usage of the attribute name '%s' (%s) is forbidden."

    extension EAIssueLogger eaIssueLogger = new EAIssueLogger
    extension EA2FrancaUtils transformationUtils = new EA2FrancaUtils(eaIssueLogger)
    extension EADependencyDiscoverer dependencyDiscoverer = new EADependencyDiscoverer(eaIssueLogger, transformationUtils)

    private val static Logger      LOGGER                      = Logger.getLogger(typeof(EA2FrancaTransformation).name);

    val models = new LinkedHashMap<EAPackageContainer, FModel>
    val dataTypes = new LinkedHashMap<EAElementContainer, FType>
    val interfaces = new LinkedHashMap<EAElementContainer, FInterface>

    val modelDependencies = new LinkedHashMap<FModel, Collection<EAContainerWithNamespace>>

    // Local usage only to detect fully qualified name collision.
    private val fullyQualifiedNames = new LinkedHashMap<String, EAContainerWithNamespace>

    /**
     * Holding all origin file names needed for recovery (due to lower case package path).
     */
    val originFileNames = <FModel, String>newHashMap()

    /**
     * Each interface may have any number of managed services to other interfaces.
     */
    val managedServiceMap = <EAElementContainer, List<EAElementContainer>>newHashMap()

    def Collection<String> getLogMessages()
    {
        return eaIssueLogger.logMessages
    }

    /**
     * Retrieve all origin file names needed for recovery. The transformModels method must be call before this.
     */
    def getOriginFileNames() {
        originFileNames
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
        modelPackages.forEach[transformModel]

        return models.values
    }

// Not used in the moment!
//    private def boolean isEmpty(EAPackageContainer fidlPackage) {
//        return fidlPackage.elements.filter[isTransformableInterfaceElement].isEmpty && fidlPackage.elements.filterNull.isEmpty // && fidlPackage.packages.empty
//    }

    /**
     * Creates all Franca data type instances. But typedefs and arrays have no actual type and
     * derivations are not resolved right now. This must be done with the next step.
     */
    def void transformDataTypes()
    {
        models.forEach [ eaPackage, francaModel |
            francaModel.typeCollections.addAll(#[eaPackage.transformTypeCollection].filter[types.size > 0]) // anonymous type collection
            // Filter condition: TypeCollection must contain at least one type OR must be named (avoid empty anonymous typeCollections)!
            francaModel.typeCollections.addAll(eaPackage.packages.map[transformTypeCollection].filter[types.size > 0 || name != null])
            francaModel.interfaces.addAll(eaPackage.elements.filter[isTransformableInterfaceElement].map[transformInterface])
        ]
    }

    /**
     * Creates all cross references between types (adds the actual type to all array and typedef
     * types and adds base type to structs, unions and enumerations), interfaces and fidl files.
     *
     * Creates all Franca interface contents (attributes, methods and broadcasts).
     *
     * Generates the import statements based on the dependency analysis from the transformModels
     * method call. Expects a map with a relative save path for all Franca models to correctly
     * generate the import statements. If the map is empty or a model is missing the save path
     * is calculated by the getRelativeFidlPackagePath method.
     */
    def void transformCrossReferences(Map<FModel, IPath> importPaths)
    {
        // Graph to analyze if loop/circle exists.
        // Example: Package MediaBrowser=[Package MetadataTypes, Package MediaBrowserTypes]
        val Map<EAPackageContainer, Set<EAPackageContainer>> allImports = newHashMap()

        models.forEach [ eaPackage, francaModel |
            // Stores all imports for each francaModel.
            val List<Import> importsOfCurrentFModel = newArrayList()
            // Containing all import packages of current fmodel needed for import circle detection.
            val Set<EAPackageContainer> allImportPackagesOfCurrentFModel = newHashSet()

            for (element2Import : modelDependencies.get(francaModel))
            {
                var EAPackageContainer currentEAPackageContainer = null

                switch element2Import
                {
                    EAPackageContainer: {
                        importsOfCurrentFModel.add(eaPackage.transformImport(element2Import, importPaths))
                        currentEAPackageContainer = element2Import
                    }
                    EAElementContainer: {
                        importsOfCurrentFModel.add(eaPackage.transformImport(element2Import.^package, importPaths))
                        currentEAPackageContainer = element2Import.^package
                    }
                }

                allImportPackagesOfCurrentFModel.add(if(currentEAPackageContainer.isTypeCollectionPackage) currentEAPackageContainer.parent.package else currentEAPackageContainer)
            }

            // Avoid adding empty dependencies/imports.
            if(!allImportPackagesOfCurrentFModel.isEmpty) {
                allImports.put(eaPackage, allImportPackagesOfCurrentFModel)
            }

            // Stores all imports [importURI, importedNamespace] avoiding duplicate imports.
            val Map<String, String> duplicates = newHashMap()

            francaModel.imports.addAll(importsOfCurrentFModel.filter[
                it != null && !importedNamespace.isNullOrEmpty && !importedNamespace.equals(duplicates.put(importURI, importedNamespace))
            ])
        ]

        // Check if any circle is existing.
        val CircleFinder<EAPackageContainer> importCircleDetection = new CircleFinder(allImports)

        // Print detected loop and throw CircleException.
        if(importCircleDetection.hasCircle) {
            addIssue(typeof(CircleException), importCircleDetection.getCircleElement, CIRCLE_MESSAGE, importCircleDetection.getCircleElement)
        }

        // Transfers the relationship of the 'managedServiceMap' to the interfaces (FInterface) of the map 'interfaces'.
        interfaces.filter[eaElementContainer, fInterface|managedServiceMap.containsKey(eaElementContainer)].forEach[eaElementContainer, fInterface|
            fInterface.managedInterfaces.addAll(managedServiceMap.get(eaElementContainer).map[interfaces.get(it)])
        ]

        dataTypes.keySet.forEach[transformDataTypeCrossReferences]
        interfaces.keySet.forEach[transformInterfaceCrossReferences]
    }

    /**
     * Since version 11: Lower casing whole package path. Store origin file name in list first.
     * Since version 15: Anonymous TypeCollections will be named and last package segment path will be removed (GLIPCI-655).
     */
    private def String packageNaming(EAPackageContainer fidlPackage) {
        var fidlNamespaceAsPath = fidlPackage.fidlNamespaceAsPath.normalizeNamespacePath(fidlPackage)

        // Condition/assumption: Fidl containing exact one anonymous typeCollection: Name it using the fidl file name (see also GLIPCI-655)!
        if(fidlPackage.isExactOneAnonymousTypeColection && !fidlPackage.isAnonymousTypeCollectionTaggedValueSet) {
            // In case of typeCollections only (see also GLIPCI-655)!
            fidlNamespaceAsPath = fidlNamespaceAsPath.removeLastSegments(1)
        }
        return fidlNamespaceAsPath.path2Namespace.toLowerCase
    }

    //
    // Internal transformation methods.
    //
    private def create FrancaFactory.eINSTANCE.createFModel transformModel(EAPackageContainer fidlPackage)
    {
        LOGGER.log(Level.FINEST, String.format("Processing EAPackageContainer (name: '%s') to FModel..", fidlPackage.name))

        // Stores each fmodel paired with origin file name.
        originFileNames.put(it, fidlPackage.name)

        registerContainer(fidlPackage)
        name = packageNaming(fidlPackage)

        modelDependencies.put(it, fidlPackage.fidlPackageDependencies)
    }

    // Extracts package dependencies.
    private def Set<EAContainerWithNamespace> getFidlPackageDependencies(EAPackageContainer fidlPackage) {
        val fidlPackageDependencies = new LinkedHashSet<EAContainerWithNamespace>

        // Collecting all managed service relationships of the current fidlPackage.
        val managedServices = fidlPackage.managedServices
        managedServiceMap.putAll(managedServices)

        // Resolving dependencies automatically (by finding dependent external elements and managing services).
        #[fidlPackage.externalPackageElements, managedServices.values.flatten].forEach[
            filter[!fidlPackage.equals(it.fidlPackage)].forEach[externalElement|
                val fidlPackage2Import = externalElement.fidlPackage

                if(null == fidlPackage2Import)
                {
                    addIssue(typeof(AutoImportException), fidlPackage, AUTO_IMPORT_MESSAGE, externalElement.namespace)
                }

                // Transform the model of the import dependency
                fidlPackage2Import.transformModel
                fidlPackageDependencies.add(externalElement)
            ]
        ]

        // Resolving dependencies by import association.
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
        return fidlPackageDependencies
    }

    private def create FrancaFactory.eINSTANCE.createImport transformImport(EAPackageContainer fidlPackage,
        EAPackageContainer package2Import, Map<FModel, IPath> importPaths)
    {
        val fidlPackagePath = fidlPackage.getRelativeFidlPackagePath(importPaths)
        val fidlPackage2ImportPath = package2Import.fidlPackage.getRelativeFidlPackagePath(importPaths)
        val relativePath = fidlPackage2ImportPath.removeLastSegments(1).makeRelativeTo(fidlPackagePath.removeLastSegments(1))

        var normalizedNamespacePath = package2Import.fidlNamespaceAsPath.normalizeNamespacePath(package2Import)

        // Avoid imports of TypeCollections (-> add one import for each FIDL file only)!
        if(package2Import.hasTypeCollectionOnly) {
            normalizedNamespacePath = normalizedNamespacePath.removeLastSegments(1)
        }

        importURI = relativePath.append(fidlPackage2ImportPath.lastSegment).toString
        importedNamespace = normalizedNamespacePath.append("*").path2Namespace.toLowerCase
    }

//    private def IPath toLowerCase(IPath originPath) {
//        return new Path(originPath.toString.toLowerCase)
//    }

    private def create FrancaFactory.eINSTANCE.createFTypeCollection transformTypeCollection(EAPackageContainer tcPackage)
    {
        registerContainer(tcPackage)

        if(!tcPackage.isFidlPackage)
        {
            name = tcPackage.fidlName.normalizeName(true, tcPackage)
        }
        else
        {
            if(tcPackage.isAnonymousTypeCollectionTaggedValueSet)
            {
                LOGGER.log(Level.FINEST, String.format("Tagged valued 'FIDL-Anonymous-TypeCollection' is set for %s", tcPackage))

                // Set anonymous type collection!
                name = null
            }
            // If tagged value is missing or false:
            // Use the name of the EA package with the fidl stereotype to also name the type collection (new logic by GLIPCI-655).
            else
            {
                // Condition/assumption: Fidl containing exact one anonymous typeCollection: Name it using the fidl file name!
                name = if(tcPackage.isExactOneAnonymousTypeColection) tcPackage.name else null
            }
        }

        version = tcPackage.transformVersion
        comment = transformAnnotationBlock(tcPackage.notes, tcPackage.author, level)

        types.addAll(tcPackage.elements.map[transformDataType].filterNull)

        // Print warning: Code-generator will fail in case of TypeCollection name is equals to a element's name.
        // See also: https://msdn.microsoft.com/en-us/library/ms173672.aspx
        // E.g. struct TrafficSign { struct TrafficSign } will fail!
        val typeCollectionName = name
        if(!typeCollectionName.isNullOrEmpty) {
            types.filter[typeCollectionName.equals(it.name)].forEach[
                addIssue(typeof(InvalidTypeCollectionNamingException), tcPackage, TYPE_COLLECTION_INVALID_ELEMENT_NAME, typeCollectionName, tcPackage.fidlNamespace)
            ]
        }
    }

    // Read the tagged value for anonymous type collections (see also GLIPCI-655).
    // States: Not existing (-> new logic), false (-> new logic) or true (-> old logic).
    private def boolean isAnonymousTypeCollectionTaggedValueSet(EAPackageContainer tcPackage) {
        val taggedValue = tcPackage.getAnonymousTypeCollectionTaggedValue
        //  If the value is missing or false, apply the new logic described in this issue.
        return taggedValue != null && Boolean.parseBoolean(taggedValue)
    }

    // EAPackageContainer has exact one anonymous typeCollection.
    private def boolean isExactOneAnonymousTypeColection(EAPackageContainer tcPackage) {
        // If the following three conditions are met:
        // - Fidl does not contain any interface!
        // - Fidl contains any elements (at least one)!
        // - Fidl does not contain any subfolders (-> named typeCollections) to ensure a anonymous typeCollection will be considered!
        return tcPackage.hasTypeCollectionOnly && tcPackage.packages.empty
    }

    // EAPackageContainer has typeCollection only.
    private def boolean hasTypeCollectionOnly(EAPackageContainer tcPackage) {
        // If the following three conditions are met:
        // - Fidl does not contain any interface!
        // - Fidl contains any elements (at least one)!
        return tcPackage.elements.filter[isTransformableInterfaceElement].isEmpty && !tcPackage.elements.filterNull.isEmpty
    }

    private def String getAnonymousTypeCollectionTaggedValue(EAPackageContainer tcPackage) {
        try
        {
            val taggedValue = tcPackage.getTaggedValueByName(EAFrancaConstants.TAGGED_VALUE_ANONYMOUS_TYPECOLLECTION_PREFIX)
            return if(taggedValue != null) taggedValue.value else null
        }
        catch (UnsupportedOperationException e)
        {
            return null
        }
    }

    private def transformDataType(EAElementContainer element)
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

    private def void transformDataTypeCrossReferences(EAElementContainer element)
    {
        switch element.francaDataType
        {
            case EAFrancaDataType.TYPEDEF: element.transformTypeDefCrossReferences
            case EAFrancaDataType.ARRAY: element.transformArrayTypeCrossReferences
            case EAFrancaDataType.ENUMERATION: element.transformEnumerationTypeCrossReferences
            case EAFrancaDataType.STRUCT: element.transformStructTypeCrossReferences
            case EAFrancaDataType.UNION: element.transformUnionTypeCrossReferences
            case EAFrancaDataType.MAP: element.transformMapTypeCrossReferences
            default: {}
        }
    }

    private def create FrancaFactory.eINSTANCE.createFTypeDef transformTypeDef(EAElementContainer element)
    {
        registerContainer(element)
        name = element.fidlName.normalizeName(true, element)
        comment = transformAnnotationBlock(element.notes, "", level)
        actualType = getTypeRef(null, FBasicTypeId.UNDEFINED.getName, element)
    }

    private def void transformTypeDefCrossReferences(EAElementContainer element)
    {
        transformTypeDef(element) => [
            val baseTypeElement = element.baseElement
            val baseType = element.parseGenlinks.get(EAConstants.GENLINK_PARENT)
            actualType = baseTypeElement.getTypeRef(baseType, element)
        ]
    }

    private def create FrancaFactory.eINSTANCE.createFArrayType transformArrayType(EAElementContainer element)
    {
        registerContainer(element)
        name = element.fidlName.normalizeName(true, element)
        comment = transformAnnotationBlock(element.notes, "", level)
        elementType = getTypeRef(null, FBasicTypeId.UNDEFINED.getName, element)
    }

    private def void transformArrayTypeCrossReferences(EAElementContainer element)
    {
        transformArrayType(element) => [
            val typeElement = element.arrayTypeElement
            val baseType = element.parseGenlinks.get(EAConstants.GENLINK_PARENT)
            elementType = typeElement.getTypeRef(baseType, element)
        ]
    }

    private def create FrancaFactory.eINSTANCE.createFEnumerationType transformEnumerationType(EAElementContainer element)
    {
        registerContainer(element)
        // Allowed enumeration pattern (according to the guidelines): [A-Z][A-Za-z0-9]*
        name = element.fidlName.normalizeName(true, element)
        comment = transformAnnotationBlock(element.notes, "", level)

        // Filter by name. Avoid duplicated enumeration values.
        val seen = newHashSet
        val duplicates = newArrayList()
        enumerators.addAll(element.attributes.map[transformEnumerator].filter[
                if(!seen.add(name)) {
                    duplicates.add(name)
                    return false
                }
                return true
            ])

        // Produces warning about duplicate enumeration values.
        if(!duplicates.isEmpty) {
            LOGGER.log(Level.WARNING, String.format("Duplicate enumeration values in %s (%s): %s", name, element.namespace, duplicates))
        }
    }

    private def create FrancaFactory.eINSTANCE.createFEnumerator transformEnumerator(EAAttributeContainer attribute)
    {
        registerContainer(attribute)
        // Allowed enumeration value pattern (according to the guidelines): [A-Z][A-Z0-9_]*
        name = attribute.fidlName.normalizeName(true, attribute)
        value = attribute.^default.enumeratorValue
        comment = transformAnnotationBlock(attribute.notes, "", level)

        // Warning in case of deprecated String value usage.
        value.checkTypeOfEnumerationValue(attribute)
    }

    // Recommended: Using FIntegerConstant for enumeration value only. Usage of String values is deprecated! Print warning.
    private def void checkTypeOfEnumerationValue(FExpression fExpression, EAContainerWithNamespace attribute) {
        if(fExpression != null && !(fExpression instanceof FIntegerConstant)) {
            var String valueToString = fExpression.toString
            if(fExpression instanceof FStringConstant) {
                valueToString = fExpression.^val
            }
            LOGGER.log(Level.WARNING, String.format("Could not parse enumeration value to integer! String value ('%s') usage is deprecated. Location: %s", valueToString, attribute.namespace))
        }
    }

    private def void transformEnumerationTypeCrossReferences(EAElementContainer element)
    {
        transformEnumerationType(element) => [
            base = element.getBaseType(typeof(FEnumerationType))
        ]
    }

    private def create FrancaFactory.eINSTANCE.createFStructType transformStructType(EAElementContainer element)
    {
        registerContainer(element)
        name = element.fidlName.normalizeName(true, element)
        comment = transformAnnotationBlock(element.notes, "", level)
        polymorphic = element.hasStereotype(EAFrancaConstants.STEREOTYPE_POLYMORPHIC_STRUCT)
    }

    private def void transformStructTypeCrossReferences(EAElementContainer element)
    {
        transformStructType(element) => [
            elements.addAll(element.attributes.map[transformField])
            base = element.getBaseType(typeof(FStructType))
        ]
    }

    private def create FrancaFactory.eINSTANCE.createFUnionType transformUnionType(EAElementContainer element)
    {
        registerContainer(element)
        name = element.fidlName.normalizeName(true, element)
        comment = transformAnnotationBlock(element.notes, "", level)
    }

    private def void transformUnionTypeCrossReferences(EAElementContainer element)
    {
        transformUnionType(element) => [
            elements.addAll(element.attributes.map[transformField])
            base = element.getBaseType(typeof(FUnionType))
        ]
    }

    private def create FrancaFactory.eINSTANCE.createFField transformField(EAAttributeContainer attribute)
    {
        registerContainer(attribute)
        name = attribute.fidlName.normalizeName(true, attribute)
        type = attribute.typeElement.getTypeRef(attribute.type, attribute)
        comment = transformAnnotationBlock(attribute.notes, "", level)
        array = attribute.collection
    }

    private def create FrancaFactory.eINSTANCE.createFMapType transformMapType(EAElementContainer element)
    {
        registerContainer(element)
        name = element.fidlName.normalizeName(true, element)
        comment = transformAnnotationBlock(element.notes, "", level)
        keyType = getTypeRef(null, FBasicTypeId.UNDEFINED.getName, element)
        valueType = getTypeRef(null, FBasicTypeId.UNDEFINED.getName, element)
    }

    private def void transformMapTypeCrossReferences(EAElementContainer element)
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

    private def create FrancaFactory.eINSTANCE.createFInterface transformInterface(EAElementContainer element)
    {
        registerContainer(element)
        name = element.fidlName.normalizeName(true, element)
        version = element.transformVersion
        comment = transformAnnotationBlock(element.notes, element.author, level)

        types.addAll(element.elements.map[transformDataType].filterNull)
    }

    private def void transformInterfaceCrossReferences(EAElementContainer element)
    {
        transformInterface(element) => [
            attributes.addAll(element.attributes.map[transformAttribute])
            methods.addAll(element.methods.filter[isMethod].map[transformMethod])
            broadcasts.addAll(element.methods.filter[isBroadcast].map[transformBroadcast])
            val oppositeElement = element.oppositeFrancaInterfaceElement
            if(null != oppositeElement)
            {
                attributes.addAll(oppositeElement.attributes.map[transformAttribute])
                methods.addAll(oppositeElement.methods.filter[isMethod].map[transformMethod])
                broadcasts.addAll(oppositeElement.methods.filter[isBroadcast].map[transformBroadcast])
            }
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

    private def create FrancaFactory.eINSTANCE.createFAttribute transformAttribute(EAAttributeContainer attribute)
    {
        registerContainer(attribute)
        name = attribute.fidlName.normalizeName(true, attribute)
        type = attribute.typeElement.getTypeRef(attribute.type, attribute)
        comment = transformAnnotationBlock(attribute.notes, "", level)
        array = attribute.collection
        readonly = attribute.readOnlyAttribute
        noSubscriptions = attribute.noSubscriptionsAttribute

        // Print logging warning in case of non-recommended attribute name usage.
        if(name.isAttributeNameBlacklisted) {
            addIssue(typeof(ForbiddenAttributeNameException), attribute, FORBIDDEN_ATTRIBUTE_NAME, name, attribute.namespace)
        }
    }

    private def boolean isAttributeNameBlacklisted(String attributeName) {
        if(attributeName.isNullOrEmpty) {
            return false
        }
        return EAFrancaConstants.FRANCA_ATTRIBUTE_NAME_BLACKLIST.contains(attributeName)
    }

    private def create FrancaFactory.eINSTANCE.createFMethod transformMethod(EAMethodContainer method)
    {
        registerContainer(method)
        name = method.fidlName.normalizeName(true, method)
        comment = transformAnnotationBlock(method.notes, "", level)
        fireAndForget = method.isFireAndForgetMethod

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
                case parameter.kind == EAParameterContainer.Kind.OUT:
                    outParams.add(parameter)
                // if kind is "in" it will be an in parameter
                case parameter.kind == EAParameterContainer.Kind.IN:
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
                returnOutParam.array = method.returnTypeArray

                outArgs.add(returnOutParam)
            }
        }

        if(outArgs.size > 0 && fireAndForget)
        {
            addIssue(typeof(FireAndForgetMethodException), method, FIRE_AND_FORGET_WITH_OUT_PARAMS_MESSAGE)
        }

        if(errorParams.size > 0)
        {
            errors = FrancaFactory.eINSTANCE.createFEnumerationType
            errors.enumerators.addAll(
                errorParams.map [errorParam |
                    return FrancaFactory.eINSTANCE.createFEnumerator => [
                        // Allowed enumeration value pattern (according to the guidelines): [A-Z][A-Z0-9_]*
                        name = errorParam.fidlName.normalizeName(true, errorParam)
                        value = errorParam.^default.enumeratorValue
                        // Special case: A method's error block contains FEnumerator values as well! Increasing level by one.
                        comment = transformAnnotationBlock(errorParam.notes, "", level + 1)

                        // Warning in case of deprecated String value usage.
                        value.checkTypeOfEnumerationValue(method)
                    ]
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

            if(errorEnumTypeElement == null) {
                // Avoid NullPointerException! Throw 'could not solve' message in this case.
                addIssue(typeof(ErrorEnumTypeCountException), method, TYPE_NOT_RESOLVABLE_MESSAGE, name)
            }
            else {
                val errorEnumType = dataTypes.get(errorEnumTypeElement)

                if(null == errorEnumType)
                {
                    val elementType = errorEnumTypeElement.EAObjectType.getName.toLowerCase
                    addIssue(typeof(InternalErrorException), method, MODEL_ANALYSIS_ERROR_MESSAGE, elementType, errorEnumTypeElement.namespace,
                        elementType)
                }

                else if(!(errorEnumType instanceof FEnumerationType))
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
    }

    private def create FrancaFactory.eINSTANCE.createFBroadcast transformBroadcast(EAMethodContainer method)
    {
        registerContainer(method)
        name = method.fidlName.normalizeName(true, method)
        comment = transformAnnotationBlock(method.notes, "", level)
        selective = method.selectiveBroadcast

        // We should filter parameters to only select "in" parameters.
        // But it was decided to not check the kind (in/out) of the parameter.
        // See ticket https://asc.bmwgroup.net/jira/browse/GLIPCI-318
        outArgs.addAll(method.parameters.map[transformArgument])
    }

    private def create FrancaFactory.eINSTANCE.createFArgument transformArgument(EAParameterContainer parameter)
    {
        registerContainer(parameter)
        name = parameter.fidlName.normalizeName(true, parameter)
        type = parameter.typeElement.getTypeRef(parameter.type, parameter)
        comment = transformAnnotationBlock(parameter.notes, "", level)
        array = parameter.hasStereotype(EAFrancaConstants.STEREOTYPE_ARRAY)
    }

    private def FVersion transformVersion(EAContainerWithElements container)
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

    private def FAnnotationBlock transformAnnotationBlock(String note, String author, int level)
    {
        val noteLength = note.trim.length
        val authorLength = author.trim.length

        if(noteLength > 0 || authorLength > 0)
        {
            val annotationBlock = FrancaFactory.eINSTANCE.createFAnnotationBlock

            if(noteLength > 0)
            {
                annotationBlock.elements.addAll(note.transformAnnotation(FAnnotationType.DESCRIPTION, level))
            }

            if(authorLength > 0)
            {
                annotationBlock.elements.addAll(author.transformAnnotation(FAnnotationType.AUTHOR, level))
            }
            return annotationBlock
        }
        else
        {
            return null
        }
    }

    private def FAnnotation transformAnnotation(String comment, FAnnotationType annotationType, int level)
    {
        val newComment = comment.replaceAll("@", COMMENT_AT_REPLACEMENT).replaceAll("\\*", COMMENT_STAR_REPLACEMENT)
        val annotation = FrancaFactory.eINSTANCE.createFAnnotation
        annotation.type = annotationType

        // Add @description elements for each line.
        if(annotationType == FAnnotationType.DESCRIPTION) {
            return annotation.transformDescription(newComment, level)
        }

        annotation.comment = newComment
        return annotation
    }

    private def FAnnotation transformDescription(FAnnotation annotationType, String comment, int level) {
        val commentLines = comment.split("\\r?\\n")

        if(commentLines.length > 1)
        {
            // Comment block: Append linefeed and spaces in the beginning.
            val stringBuilder = new StringBuilder('\n')

            commentLines.forEach[
                // append spaces
                if(!trim.isEmpty) {
                    // Number of spaces depends on the level of the type of field.
                    stringBuilder.append(StringUtils.repeat(" ", (level +1) * EAConstants.DISPLAYED_TAB_WIDTH))
                    stringBuilder.append(it) // trim?
                }
                stringBuilder.append('\n')
            ]
            // Delete the last linefeed.
            stringBuilder.delete(stringBuilder.length - 1, stringBuilder.length)
            annotationType.comment = stringBuilder.toString
        }
        else
        {
            // Splitting is not necessary at all!
            annotationType.comment = comment
        }
        return annotationType
    }

    // Determine the number of spaces in the beginning of each comment line.
    private def int getLevel(FModelElement modelElement) {
        switch(modelElement) {
            // Top level
            FInterface, FTypeCollection:
                return 0

            // Level 1
            // E.g. version, attribute, broadcast, method, enumeration, array
            FStructType, FUnionType, FMethod, FEnumerationType, FArrayType, FMapType, FAttribute, FBroadcast, FTypeDef:
                return 1

            // Level 2
            // E.g. struct elements, enumeration values, out, in.
            // FField: Fields of union.
            FEnumerator, FField:
                return 2

            // Level 3
            FArgument:
                return 3
        }

        // Unexpected! Problem while creating comment block.
        LOGGER.log(Level.WARNING, String.format("The level could not be determined. '%s' is not listed yet!", modelElement))
        return 1
    }

    private def String fullyQualifiedName(EObject francaObject, EAContainerWithNamespace containerWithNamespace) {
        val fqnPrefix = francaObject.namespacePrefix + ":"
        val fidlFqn = containerWithNamespace.fidlNamespaceAsPath.normalizeNamespacePath(containerWithNamespace).path2Namespace
        val fqnParams = if(containerWithNamespace instanceof EAMethodContainer)
            {
                // Format: <direction>:<datatype> for each parameter.
                // TODO: kind can be null! Shall not happen!?
                "(" + containerWithNamespace.parameters.filter[!hasStereotype(EAFrancaConstants.STEREOTYPE_ERROR)].map[
                        if(kind != null) {
                            kind.getName + ":" + transformArgument.typeAsString
                        } else {
                            // TODO: FIX ME!
                            ""
                        }
                    ].join(",") + ")"
            }
            else
            {
                ""
            }
        fqnPrefix + fidlFqn + fqnParams
    }

    //
    // Internal helper methods.
    //
    /**
     * All generated Franca objects with their corresponding EA container classes should be registered. This method
     * will check if another element has the same fully qualified name. Further more this method caches all objects
     * that will be needed for cross references (e.g. type inheritance)
     */
    private def void registerContainer(EObject francaObject, EAContainer container)
    {
        if(((francaObject instanceof FMethod || francaObject instanceof FBroadcast) && container instanceof EAMethodContainer) ||
            (francaObject instanceof FType && container instanceof EAElementContainer) ||
            (francaObject instanceof FAttribute && container instanceof EAAttributeContainer) ||
            (francaObject instanceof FModel && container instanceof EAPackageContainer) ||
            (francaObject instanceof FInterface && container instanceof EAElementContainer) ||
            (francaObject instanceof FTypeCollection && container instanceof EAPackageContainer))
        {
            val containerWithNamespace = container as EAContainerWithNamespace
            val completeFidlFqn = francaObject.fullyQualifiedName(containerWithNamespace)
            if(fullyQualifiedNames.containsKey(completeFidlFqn))
            {
                val collisionContainer = fullyQualifiedNames.get(completeFidlFqn)
                addIssue(typeof(FullyQualifiedNameCollisionException), containerWithNamespace, FULLY_QUALIFIED_NAME_MESSAGE,
                    containerWithNamespace.namespace, collisionContainer.namespace, completeFidlFqn)
            }
            else
            {
                fullyQualifiedNames.put(completeFidlFqn, containerWithNamespace)
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

    private def String getNamespacePrefix(EObject francaObject)
    {
        switch francaObject
        {
            FModel: return "P"
            FMethod: return "M"
            FBroadcast: return "B"
            FType: return "T"
            FAttribute: return "A"
            FInterface: return "I"
            FTypeCollection: return "TC"
            default: return "D"
        }
    }

    private def String getTypeAsString(FTypedElement typedElement)
    {
        val type = typedElement.type.derived
        val arrayBrackets = if(typedElement.array) INLINE_ARRAY_BRACKETS else ""

        if(type != null)
        {
            return type.name + arrayBrackets
        }
        else
        {
            return typedElement.type.predefined.literal + arrayBrackets
        }
    }

    private def FTypeRef getTypeRef(EAElementContainer element, String type, EAContainerWithNamespace container)
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

    private def <T extends FType> T getBaseType(EAElementContainer element, Class<T> expectedType)
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
    private def IPath getRelativeFidlPackagePath(EAPackageContainer fidlPackage, Map<FModel, IPath> importPaths)
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
