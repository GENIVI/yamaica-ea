/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.franca

import de.bmw.yamaica.ea.core.ConnectorDetails
import de.bmw.yamaica.ea.core.EquivalentElementContainer
import de.bmw.yamaica.ea.core.NoteHelper
import java.text.SimpleDateFormat
import java.util.Date
import java.util.HashMap
import org.eclipse.core.runtime.Path
import org.franca.core.franca.FArgument
import org.franca.core.franca.FArrayType
import org.franca.core.franca.FAttribute
import org.franca.core.franca.FBroadcast
import org.franca.core.franca.FCompoundType
import org.franca.core.franca.FEnumerationType
import org.franca.core.franca.FEnumerator
import org.franca.core.franca.FField
import org.franca.core.franca.FInterface
import org.franca.core.franca.FMapType
import org.franca.core.franca.FMethod
import org.franca.core.franca.FModel
import org.franca.core.franca.FModelElement
import org.franca.core.franca.FStructType
import org.franca.core.franca.FType
import org.franca.core.franca.FTypeCollection
import org.franca.core.franca.FTypeDef
import org.franca.core.franca.FTypeRef
import org.franca.core.franca.FTypedElement
import org.franca.core.franca.FUnionType
import uml.DirectionType
import uml.GeneralizationType
import uml.OwnedAttributeExtendedAttributesType
import uml.OwnedAttributeExtendedContentType
import uml.OwnedLiteralType
import uml.OwnedOperationType
import uml.OwnedParameterType
import uml.PackagedElementBaseType
import uml.PackagedElementPackageType
import uml.UmlClassType
import uml.UmlEnumerationType
import uml.UmlFactory
import uml.UmlInterfaceType
import uml.VisibilityType
import xmei.AttributeType
import xmei.CodeType
import xmei.ConcreteLinkType
import xmei.DocumentRoot
import xmei.EaTypesType
import xmei.ElementType
import xmei.ModelType
import xmei.OperationType
import xmei.ParameterType
import xmei.ProjectType
import xmei.PropertiesType
import xmei.STypeType
import xmei.StereotypeType
import xmei.TypeBaseType
import xmei.XMIType
import xmei.XmeiFactory
import xmei.XmeiPackage

import static de.bmw.yamaica.ea.core.XmiUmlConstants.*
import java.util.Collection

/*
 * TODO diagrams:
 * 
 * diagramme bestehen einfach aus allen elementen eines packages als "subject"
 */
class Franca2EATransformation
{
    extension NoteHelper noteHelper
    private DocumentRoot docRoot
    private XMIType xmiModel
    private int eaIdCounter
    private int globalElementTpos
    private HashMap<String, PackagedElementPackageType> packageMap;
    private HashMap<String, EquivalentElementContainer> transformedElementMap
    private HashMap<FModelElement, String> transformedTypes
    private HashMap<ConcreteLinkType, ConnectorDetails> connectorMap
    private String createdAndModifiedDate
    private final String DATE_FORMAT = "yyyy/MM/dd HH:mm:ss"
    private int enumeratorPosition
    private int parameterPosition

    new()
    {
        this.noteHelper = new NoteHelper
        this.packageMap = new HashMap<String, PackagedElementPackageType>
        this.transformedElementMap = new HashMap<String, EquivalentElementContainer>
        this.transformedTypes = new HashMap<FModelElement, String>
        this.connectorMap = new HashMap<ConcreteLinkType, ConnectorDetails>
        docRoot = XmeiFactory.eINSTANCE.createDocumentRoot
        xmiModel = XmeiFactory.eINSTANCE.createXMIType
        docRoot.XMI = xmiModel
        XmeiPackage.eINSTANCE.setNsPrefix(XMI_NAMESPACE_PREFIX);
        eaIdCounter = 0
        globalElementTpos = -1
        initializeCreatedDate
        enumeratorPosition = 0
        parameterPosition = 0
    }

    def void initializeCreatedDate()
    {
        val dateFormat = new SimpleDateFormat(DATE_FORMAT);
        val currentDate = new Date
        val dateString = dateFormat.format(currentDate)
        createdAndModifiedDate = dateString.replace(SLASH, DASH)
    }

    def DocumentRoot transform(Collection<FModel> srcModels)
    {
        initializeXmiType
        srcModels.forEach[transformFModel]

        srcModels.forEach[transformReferences]
        
        return docRoot
    }

    def void transformReferences(FModel srcModel)
    {
        srcModel.typeCollections.forEach [ typeColl |
            typeColl.types.forEach[type | type.transformReference]
        ]
        srcModel.interfaces.forEach [ inter |
            inter.types.forEach[type | type.transformReference]
        ]
        
        srcModel.interfaces.forEach [ inter |
            inter.transformInterfaceReferences
        ]
        
         
        connectorMap.values.forEach [ connector |
            connector.createConnector
        ]
    }
    
    def void transformInterfaceReferences(FInterface inter)
    {
        if(inter.base != null)
        {
            inter.transformReferenceIfBaseExists
        }
    }
    
    def void transformReferenceIfBaseExists(FInterface inter)
    {
        val parentId = inter.base.searchTransformedElementsForIdByFModelElement
        val childId = inter.searchTransformedElementsForIdByFModelElement
        
        val generalizationElement = parentId.createGeneralizationElement

        val childElement = transformedElementMap.get(childId).umlModelElement as UmlInterfaceType
        childElement.generalization = generalizationElement

        generalizationElement.id.createExtensionElementsForIds(parentId, childId)
    }

    def void initializeXmiType()
    {
        xmiModel.version = XMI_VERSION
        xmiModel.documentation = XmeiFactory.eINSTANCE.createDocumentation
        intializeDocumentation
        xmiModel.model = UmlFactory.eINSTANCE.createModelType
        initializeModelAttributes
        xmiModel.extension = XmeiFactory.eINSTANCE.createExtension
        initializeExtension
        initializePrimitiveTypes
    }

    def void intializeDocumentation()
    {
        xmiModel.documentation.exporter = ENTERPRISE_ARCHITECT
        xmiModel.documentation.exporterVersion = EXPORTER_VERSION
    }

    def void initializeModelAttributes()
    {
        xmiModel.model.name = MODEL_NAME
        xmiModel.model.type = TypeBaseType.UML_MODEL
        xmiModel.model.visibility = VisibilityType.PUBLIC
    }

    def void initializeExtension()
    {
        xmiModel.extension.extender = ENTERPRISE_ARCHITECT
        xmiModel.extension.extenderID = EXPORTER_VERSION
        xmiModel.extension.elements = XmeiFactory.eINSTANCE.createElementsType
        xmiModel.extension.connectors = XmeiFactory.eINSTANCE.createConnectorsType
        xmiModel.extension.primitivetypes = XmeiFactory.eINSTANCE.createPrimitiveTypesType
        xmiModel.extension.profiles = ""
        xmiModel.extension.diagrams = XmeiFactory.eINSTANCE.createDiagramsType
    }

    def void initializePrimitiveTypes()
    {
        val rootPackage = UmlFactory.eINSTANCE.createPackagedElementPackageType
        rootPackage.name = EA_PRIMITIVETYPES_PACKAGE
        rootPackage.id = EAPRIMITIVETYPESPACKAGE
        rootPackage.type = TypeBaseType.UML_PACKAGE
        rootPackage.visibility = VisibilityType.PUBLIC
        xmiModel.extension.primitivetypes.packagedElement.add(rootPackage)
        val typesPackage = UmlFactory.eINSTANCE.createPackagedElementPackageType
        typesPackage.name = EA_FRANCAIDL_TYPES_PACKAGE
        typesPackage.id = EAFRANCAIDLTYPESPACKAGE
        typesPackage.type = TypeBaseType.UML_PACKAGE
        typesPackage.visibility = VisibilityType.PUBLIC
        rootPackage.packagedElement.add(typesPackage)
        typesPackage.addPrimitiveTypes
    }

    def void addPrimitiveTypes(PackagedElementPackageType typesPackage)
    {
        typesPackage.addElementForString(UINT_8)
        typesPackage.addElementForString(UINT_16)
        typesPackage.addElementForString(UINT_32)
        typesPackage.addElementForString(UINT_64)
        typesPackage.addElementForString(INT_8)
        typesPackage.addElementForString(INT_16)
        typesPackage.addElementForString(INT_32)
        typesPackage.addElementForString(INT_64)
        typesPackage.addElementForString(BOOLEAN)
        typesPackage.addElementForString(BYTEBUFFER)
        typesPackage.addElementForString(STRING)
        typesPackage.addElementForString(FLOAT)
        typesPackage.addElementForString(DOUBLE)
    }

    def void addElementForString(PackagedElementPackageType typesPackage, String typeName)
    {
        val typeToAdd = UmlFactory.eINSTANCE.createUmlClassType
        typeToAdd.visibility = VisibilityType.PUBLIC
        typeToAdd.type = TypeBaseType.UML_PRIMITIVE_TYPE
        typeToAdd.name = typeName
        typeToAdd.id = EA_FRANCA_IDL_ + typeName
        typesPackage.packagedElement.add(typeToAdd)
    }

    def void transformFModel(FModel src)
    {

        val rootPackageName = src.returnFirstSegmentOfFidlQualifiedName
        var PackagedElementPackageType rootPackage
        if(!packageMap.containsKey(rootPackageName))
        {
            rootPackage = src.createRootPackage
            xmiModel.model.packagedElement.add(rootPackage)
        }
        else
        {
            rootPackage = packageMap.get(rootPackageName)
        }
        src.transformTypeCollections

        src.transformInterfaces
        
    }

    def String returnFirstSegmentOfFidlQualifiedName(FModel src)
    {
        val convertedFidlPackageName = src.name.replace(DOT, SLASH);
        val convertedFidlPath = new Path(convertedFidlPackageName)
        return convertedFidlPath.segment(0)
    }

    def create UmlFactory.eINSTANCE.createPackagedElementPackageType createRootPackage(FModel model)
    {
        val convertedFidlPackageName = model.name.replace(DOT, SLASH);
        val rootPath = new Path(convertedFidlPackageName).segment(0)
        name = rootPath
        id = uniqueEaId
        type = TypeBaseType.UML_PACKAGE
        visibility = VisibilityType.PUBLIC
        packageMap.put(rootPath, it)
        transformedElementMap.put(id, new EquivalentElementContainer)
        transformedElementMap.get(id).setUmlModelElement(it)

        it.createRootPackageExtensionElement()
    }

    def create XmeiFactory.eINSTANCE.createElementType createRootPackageExtensionElement(PackagedElementPackageType rootPackage)
    {
        idref = rootPackage.id
        type = rootPackage.type
        name = rootPackage.name
        scope = rootPackage.visibility
        xmiModel.extension.elements.element.add(it)
        transformedElementMap.get(rootPackage.id).setExtensionElement(it)

        model = it.createModelElement
        model.package = ROOT_ELEMENT_ID

        properties = it.createPropertiesElement
        properties.stereotype = StereotypeType.ROOT

        project = null.createProjectElement

        code = createCodeElement

    }

    def PropertiesType createPropertiesElement(ElementType element)
    {
        val properties = XmeiFactory.eINSTANCE.createPropertiesType

        properties.isSpecification = false;
        properties.scope = VisibilityType.PUBLIC
        switch (element.type.value)
        {
            case TypeBaseType.UML_PACKAGE_VALUE: properties.SType = STypeType.PACKAGE
            case TypeBaseType.UML_CLASS_VALUE: properties.SType = STypeType.CLASS
        }

        properties.documentation = transformedElementMap.get(element.idref).fidlElement.description
        return properties
    }

    def ModelType createModelElement(ElementType element)
    {
        val model = XmeiFactory.eINSTANCE.createModelType
        model.tpos = assignGlobalTpos
        model.eaLocalid = eaIdCounter //assign same value as string "id" contains
        switch (element.type.value)
        {
            case TypeBaseType.UML_PACKAGE_VALUE:
            {
                model.eaEleType = ELEMENTTYPE_PACKAGE
                model.package2 = element.idref
            }
            case TypeBaseType.UML_CLASS_VALUE:
                model.eaEleType = ELEMENTTYPE_ELEMENT
        }

        return model
    }

    def CodeType createCodeElement()
    {
        val codeType = XmeiFactory.eINSTANCE.createCodeType
        codeType.gentype = FRANCA_IDL
        return codeType
    }

    def ProjectType createProjectElement(FModelElement fidlElement)
    {
        val newElement = XmeiFactory.eINSTANCE.createProjectType
        newElement.created = createdAndModifiedDate
        newElement.modified = newElement.created

        if(fidlElement != null)
        {
            newElement.author = fidlElement.author
            switch (fidlElement)
            {
                FTypeCollection: newElement.version = fidlElement.extractVersionFromTypeCollection
                default: 
                    {
                        if(fidlElement.eContainer instanceof FTypeCollection)
                        {
                            val container = fidlElement.eContainer as FTypeCollection
                            newElement.version = container.extractVersionFromTypeCollection
                        }
                        else
                        {
                            newElement.version = ""
                        }
                    }
            }
        }
        else
        {
            newElement.author = ""
            newElement.version = ""
        }
        newElement.phase = newElement.version

        return newElement
    }

    def String extractVersionFromTypeCollection(FTypeCollection collection)
    {
        if(collection.version != null)
        {
            return collection.version.major.toString + DOT + collection.version.minor.toString
        }
        else
        {
            return ""
        }
    }

    def int assignGlobalTpos()
    {
        globalElementTpos = globalElementTpos + 1
        return globalElementTpos
    }

    def String uniqueEaId()
    {
        return EA_ID_PREFIX + Integer.toString(assignEaIdCounterValue)
    }

    def int assignEaIdCounterValue()
    {
        eaIdCounter = eaIdCounter + 1
        return eaIdCounter
    }
    
    def PackagedElementPackageType createPackageForTypeCollection(FTypeCollection typeColl)
    {
        val newPackage = typeColl.name.createPackageForName

        transformedElementMap.get(newPackage.id).fidlElement = typeColl

        val extensionElement = transformedElementMap.get(newPackage.id).extensionElement as ElementType
        extensionElement.project = transformedElementMap.get(newPackage.id).fidlElement.createProjectElement
        return newPackage
    }

    def PackagedElementPackageType createPackageForName(String packageName)
    {
        val newPackage = UmlFactory.eINSTANCE.createPackagedElementPackageType()
        newPackage.name = packageName
        newPackage.id = uniqueEaId
        newPackage.type = TypeBaseType.UML_PACKAGE
        newPackage.visibility = VisibilityType.PUBLIC

        transformedElementMap.put(newPackage.id, new EquivalentElementContainer)
        transformedElementMap.get(newPackage.id).umlModelElement = newPackage

        val extensionElement = newPackage.createExtensionPackage
        extensionElement.project = createProjectElement(null)
        extensionElement.code = createCodeElement

        return newPackage
    }

    def create XmeiFactory.eINSTANCE.createElementType createExtensionPackage(PackagedElementPackageType umlPackage)
    {
        idref = umlPackage.id
        type = umlPackage.type
        name = umlPackage.name
        scope = umlPackage.visibility
        xmiModel.extension.elements.element.add(it)
        transformedElementMap.get(umlPackage.id).extensionElement = it

        model = it.createModelElement

        properties = it.createPropertiesElement

        project = createProjectElement(transformedElementMap.get(umlPackage.id).fidlElement)

        code = createCodeElement

        xmiModel.extension.elements.element.add(it)
    }

    def void transformTypeCollections(FModel model)
    {
        val parentPackage = model.createPackagesForPath
        model.typeCollections.forEach [ typeColl |
            if(typeColl.name == null)
            {
                typeColl.types.forEach[type|type.transformTypeInCollection(parentPackage)]
            }
            else
            {
                val newPackage = typeColl.createPackageForTypeCollection
                parentPackage.packagedElement.add(newPackage)
                (transformedElementMap.get(newPackage.id).extensionElement as ElementType).model.package = parentPackage.id
                typeColl.types.forEach[type|type.transformTypeInCollection(newPackage)]
            }
        ]
    }

    def PackagedElementPackageType createPackagesForPath(FModel model)
    {
        var fullyQualifiedName = model.name
        var prefixName = fullyQualifiedName.returnPrefix
        var packageName = prefixName
        var parentPackage = packageMap.get(packageName)
        var restString = fullyQualifiedName.removeFirstSegment
        while(restString.indexOf('.') != -1)
        {
            packageName = restString.returnPrefix
            prefixName = prefixName + DOT + packageName
            val newPackage = packageName.createPackageForName
            packageMap.put(prefixName, newPackage)
            parentPackage.packagedElement.add(newPackage)
            val extensionPackage = transformedElementMap.get(newPackage.id).extensionElement as ElementType
            extensionPackage.model.package = parentPackage.id
            parentPackage = newPackage
            restString = restString.removeFirstSegment
        }
        packageName = restString.returnPrefix
        prefixName = prefixName + DOT + packageName
        val newPackage = packageName.createPackageForName
        val extensionPackage = transformedElementMap.get(newPackage.id).extensionElement as ElementType
        extensionPackage.properties.stereotype = StereotypeType.FIDL
        extensionPackage.model.package = parentPackage.id
        packageMap.put(prefixName, newPackage)
        parentPackage.packagedElement.add(newPackage)
        return newPackage
    }

    def String returnPrefix(String originalString)
    {
        val firstDotIndex = originalString.indexOf('.')
        if(firstDotIndex != -1)
        {
            return originalString.substring(0, firstDotIndex)
        }
        return originalString
    }

    def String removeFirstSegment(String originalString)
    {
        val firstDotIndex = originalString.indexOf('.')
        if(firstDotIndex != -1)
        {
            return originalString.substring(firstDotIndex + 1, originalString.length)
        }
        return ""
    }

    def void transformTypeInCollection(FType type, PackagedElementPackageType parentPackage)
    {
        switch (type)
        {
            FTypeDef: type.transformTypeDef(parentPackage)
            FEnumerationType: type.transformEnumerationType(parentPackage)
            FUnionType: type.transformCompoundType(parentPackage)
            FStructType: type.transformCompoundType(parentPackage)
            FArrayType: type.transformArrayType(parentPackage)
            FMapType: type.transformMapType(parentPackage)
        }
    }

    def create UmlFactory.eINSTANCE.createUmlClassType transformTypeDef(FTypeDef type, PackagedElementPackageType parentPackage)
    {
        id = uniqueEaId
        name = type.name
        it.type = TypeBaseType.UML_CLASS
        visibility = VisibilityType.PUBLIC

        if(type.eContainer instanceof FTypeCollection && !(type.eContainer instanceof FInterface)) 
        {
            parentPackage.packagedElement.add(it)
        }
        else if(type.eContainer instanceof FInterface)
        {
            (parentPackage as UmlInterfaceType).nestedClassifier.add(it)
        }
        transformedElementMap.put(id, new EquivalentElementContainer)
        transformedElementMap.get(id).fidlElement = type
        transformedElementMap.get(id).umlModelElement = it

        transformedTypes.put(type, id)

        it.createCorrespondingExtensionElement

        val extensionElement = transformedElementMap.get(id).extensionElement as ElementType
        extensionElement.properties.stereotype = StereotypeType.TYPEDEF

        if(type.actualType.predefined.getName != UNDEFINED)
        {
            extensionElement.properties.genlinks = PARENT_EQUALS + type.actualType.predefined.getName + SEMICOLON
        }

    }

    def create XmeiFactory.eINSTANCE.createElementType createCorrespondingExtensionElement(PackagedElementBaseType umlType)
    {
        idref = umlType.id
        type = TypeBaseType.UML_CLASS
        scope = VisibilityType.PUBLIC

        switch (umlType)
        {
            UmlClassType: name = umlType.name
            UmlEnumerationType: name = umlType.name
            UmlInterfaceType: name = umlType.name
        }

        model = it.createModelElement
        model.package = (umlType.eContainer as PackagedElementPackageType).id
        
        if(umlType.eContainer instanceof UmlInterfaceType)
        {
            model.owner = (umlType.eContainer as PackagedElementPackageType).id
        }

        properties = it.createPropertiesElement

        project = transformedElementMap.get(idref).fidlElement.createProjectElement

        code = createCodeElement

        xmiModel.extension.elements.element.add(it)
        transformedElementMap.get(umlType.id).setExtensionElement(it)

    }

    def create UmlFactory.eINSTANCE.createUmlEnumerationType transformEnumerationType(FEnumerationType type,
        PackagedElementPackageType parentPackage)
    {
        id = uniqueEaId
        name = type.name
        it.type = TypeBaseType.UML_CLASS
        visibility = VisibilityType.PUBLIC

        if(type.eContainer instanceof FTypeCollection && !(type.eContainer instanceof FInterface)) 
        {
            parentPackage.packagedElement.add(it)
        }
        else if(type.eContainer instanceof FInterface)
        {
            (parentPackage as UmlInterfaceType).nestedClassifier.add(it)
        }
        transformedElementMap.put(id, new EquivalentElementContainer)
        transformedElementMap.get(id).fidlElement = type
        transformedElementMap.get(id).umlModelElement = it

        transformedTypes.put(type, id)

        it.createCorrespondingExtensionElement

        val extensionElement = transformedElementMap.get(id).extensionElement as ElementType
        extensionElement.properties.stereotype = StereotypeType.FRANCA_ENUM

        if(!type.enumerators.empty)
        {
            extensionElement.attributes = XmeiFactory.eINSTANCE.createAttributesType
        }

        enumeratorPosition = 0
        type.enumerators.forEach [ enumerator |
            enumerator.transformEnumerator(id)
        ]
    }

    def void transformEnumerator(FEnumerator enumerator, String parentId)
    {

        if(enumerator.value != null)
        {
            enumerator.createUmlEnumeratorLiteral(parentId)
        }
    }

    def create UmlFactory.eINSTANCE.createOwnedLiteralType createUmlEnumeratorLiteral(FEnumerator enumerator, String parentId)
    {
        id = uniqueEaId
        name = enumerator.name
        type = TypeBaseType.UML_ENUMERATION_LITERAL
        visibility = VisibilityType.PUBLIC
        classifier = EAFRANCAIDL_ + STRING

        specification = it.createSpecificationElement(enumerator)

        transformedElementMap.put(id, new EquivalentElementContainer)
        transformedElementMap.get(id).fidlElement = enumerator
        transformedElementMap.get(id).umlModelElement = it

        val umlParent = transformedElementMap.get(parentId).umlModelElement as UmlEnumerationType
        umlParent.ownedLiteral.add(it)

        enumerator.createExtensionEnumerator(id, parentId)
    }

    def create XmeiFactory.eINSTANCE.createAttributeType createExtensionEnumerator(FEnumerator enumerator, String umlElementId,
        String parentId)
    {
        val extensionElement = transformedElementMap.get(parentId).extensionElement as ElementType

        idref = umlElementId
        name = enumerator.name
        scope = VisibilityType.PUBLIC

        it.createAttributeElementDefaults
        initial.body = enumerator.value

        documentation.value = enumerator.description

        properties.type = STRING

        containment.containment = CONTAINMENT_NOT_SPECIFIED

        styleex.value = ENUMERATOR_STYLEEX_VALUE_LITERAL_TRUE

        transformedElementMap.get(umlElementId).extensionElement = it
        extensionElement.attributes.attribute.add(it)
    }

    def void createAttributeElementDefaults(AttributeType containerAttribute)
    {
        containerAttribute.initial = XmeiFactory.eINSTANCE.createInitialType

        containerAttribute.documentation = XmeiFactory.eINSTANCE.createDocumentationType

        containerAttribute.properties = XmeiFactory.eINSTANCE.createAttributePropertiesType

        containerAttribute.model = XmeiFactory.eINSTANCE.createAttributeModelType
        containerAttribute.model.eaLocalid = eaIdCounter
        containerAttribute.model.eaGuid = OPEN_CURLED_BRACKETS + containerAttribute.idref + CLOSE_CURLED_BRACKETS

        containerAttribute.bounds = XmeiFactory.eINSTANCE.createBoundsType
        containerAttribute.bounds.lower = 1
        containerAttribute.bounds.upper = 1.toString

        containerAttribute.containment = XmeiFactory.eINSTANCE.createAttributeContainmentType
        containerAttribute.containment.position = enumeratorPosition
        enumeratorPosition = enumeratorPosition + 1

        containerAttribute.styleex = XmeiFactory.eINSTANCE.createStyleexType

        containerAttribute.stereotype = XmeiFactory.eINSTANCE.createStereotypeAttributeType

    }

    def create UmlFactory.eINSTANCE.createDefaultValueType createSpecificationElement(OwnedLiteralType literalType, FEnumerator enumerator)
    {
        type = TypeBaseType.UML_LITERAL_STRING
        id = literalType.id
        value = enumerator.value
    }

    def create UmlFactory.eINSTANCE.createUmlClassType transformCompoundType(FCompoundType compType,
        PackagedElementPackageType parentPackage)
    {
        id = uniqueEaId
        name = compType.name
        type = TypeBaseType.UML_CLASS
        visibility = VisibilityType.PUBLIC

        if(compType.eContainer instanceof FTypeCollection && !(compType.eContainer instanceof FInterface)) 
        {
            parentPackage.packagedElement.add(it)
        }
        else if(compType.eContainer instanceof FInterface)
        {
            (parentPackage as UmlInterfaceType).nestedClassifier.add(it)
        }
        transformedElementMap.put(id, new EquivalentElementContainer)
        transformedElementMap.get(id).fidlElement = compType
        transformedElementMap.get(id).umlModelElement = it

        transformedTypes.put(compType, id)

        it.createCorrespondingExtensionElement

        val extensionElement = transformedElementMap.get(id).extensionElement as ElementType

        if(!compType.elements.empty)
        {
            extensionElement.attributes = XmeiFactory.eINSTANCE.createAttributesType
        }

        switch (compType)
        {
            FStructType: extensionElement.properties.stereotype = StereotypeType.STRUCT
            FUnionType: extensionElement.properties.stereotype = StereotypeType.UNION
        }

        enumeratorPosition = 0
        compType.elements.forEach [ field |
            field.transformField(id)
        ]
    }

    def void transformField(FField field, String parentId)
    {
        val attribute = field.createUmlOwnedAttribute(parentId)
        val umlParent = transformedElementMap.get(parentId).umlModelElement as UmlClassType
        umlParent.ownedAttribute.add(attribute)
    }

    def create UmlFactory.eINSTANCE.createOwnedAttributeExtendedContentType createUmlOwnedAttribute(FTypedElement field, String parentId)
    {
                //TODO field.array != null heißt dass das attribut ein array ist
        id = uniqueEaId
        name = field.name
        type1 = TypeBaseType.UML_PROPERTY
        visibility = VisibilityType.PUBLIC

        lowerValue = UmlFactory.eINSTANCE.createMultiplicityValueType
        lowerValue.type = TypeBaseType.UML_LITERAL_INTEGER
        lowerValue.id = id
        lowerValue.value = 1.toString

        upperValue = UmlFactory.eINSTANCE.createMultiplicityValueType
        upperValue.type = TypeBaseType.UML_LITERAL_INTEGER
        upperValue.id = id
        
        if(field.array != null)
        {
           // upperValue.value = ASTERISK
           upperValue.value = (-1).toString
        }
        else
        {
            upperValue.value = 1.toString
        }

        type = UmlFactory.eINSTANCE.createTypeType

        if(field.type.predefined.getName != UNDEFINED)
        {
            type.idref = EAFRANCAIDL_ + field.type.predefined.getName
        }

        transformedElementMap.put(id, new EquivalentElementContainer)
        transformedElementMap.get(id).fidlElement = field
        transformedElementMap.get(id).umlModelElement = it

        field.createExtensionOwnedAttribute(id, parentId)
    }

    def create XmeiFactory.eINSTANCE.createAttributeType createExtensionOwnedAttribute(FTypedElement field, String umlElementId, String parentId)
    {
        val extensionElement = transformedElementMap.get(parentId).extensionElement as ElementType

        idref = umlElementId
        name = field.name
        scope = VisibilityType.PUBLIC

        it.createAttributeElementDefaults
        
        if(field.array != null)
        {
            bounds.upper = ASTERISK
        }

        documentation.value = field.description

        if(field.type.predefined.getName != UNDEFINED)
        {
            properties.type = field.type.predefined.getName
        }
        else
        {
            properties.type = field.type.derived.getName
        }

        containment.containment = CONTAINMENT_NOT_SPECIFIED

        styleex.value = ENUMERATOR_STYLEEX_VALUE_LITERAL_FALSE

        transformedElementMap.get(umlElementId).extensionElement = it
        extensionElement.attributes.attribute.add(it)
    }

    def create UmlFactory.eINSTANCE.createUmlClassType transformArrayType(FArrayType arrType, PackagedElementPackageType parentPackage)
    {
        id = uniqueEaId
        name = arrType.name
        type = TypeBaseType.UML_CLASS
        visibility = VisibilityType.PUBLIC

        if(arrType.eContainer instanceof FTypeCollection && !(arrType.eContainer instanceof FInterface)) 
        {
            parentPackage.packagedElement.add(it)
        }
        else if(arrType.eContainer instanceof FInterface)
        {
            (parentPackage as UmlInterfaceType).nestedClassifier.add(it)
        }
        
        transformedElementMap.put(id, new EquivalentElementContainer)
        transformedElementMap.get(id).fidlElement = arrType
        transformedElementMap.get(id).umlModelElement = it

        transformedTypes.put(arrType, id)

        it.createCorrespondingExtensionElement

        val extensionElement = transformedElementMap.get(id).extensionElement as ElementType
        extensionElement.properties.stereotype = StereotypeType.ARRAY

        if(arrType.elementType.predefined.getName == UNDEFINED) //array type is not base data type
        {
            id.createUmlOwnedAttributeWithoutName
            val associationAttribute = ownedAttribute.get(0) as OwnedAttributeExtendedAttributesType
            val association = id.createAssociation(associationAttribute.id, parentPackage)
            associationAttribute.association = association.id
        }
        else
        {
            extensionElement.properties.genlinks = PARENT_EQUALS + arrType.elementType.predefined.getName + SEMICOLON
        }

    }

    def OwnedAttributeExtendedContentType createUmlOwnedAttributeWithoutName(String parentId)
    {
        val returnAttr = UmlFactory.eINSTANCE.createOwnedAttributeExtendedContentType
        returnAttr.id = uniqueEaId
        returnAttr.type1 = TypeBaseType.UML_PROPERTY
        returnAttr.visibility = VisibilityType.PUBLIC

        returnAttr.lowerValue = UmlFactory.eINSTANCE.createMultiplicityValueType
        returnAttr.lowerValue.type = TypeBaseType.UML_LITERAL_INTEGER
        returnAttr.lowerValue.id = returnAttr.id
        returnAttr.lowerValue.value = 1.toString

        returnAttr.upperValue = UmlFactory.eINSTANCE.createMultiplicityValueType
        returnAttr.upperValue.type = TypeBaseType.UML_LITERAL_INTEGER
        returnAttr.upperValue.id = returnAttr.id
        returnAttr.upperValue.value = 1.toString

        returnAttr.type = UmlFactory.eINSTANCE.createTypeType

        transformedElementMap.put(returnAttr.id, new EquivalentElementContainer)
        transformedElementMap.get(returnAttr.id).umlModelElement = returnAttr

        val umlParent = transformedElementMap.get(parentId).umlModelElement as UmlClassType
        umlParent.ownedAttribute.add(returnAttr)

        return returnAttr
    }

    def create UmlFactory.eINSTANCE.createPackagedElementAssociationType createAssociation(String elementId, String associationId,
        PackagedElementPackageType parentPackage)
    {
        id = uniqueEaId
        type = TypeBaseType.UML_ASSOCIATION
        visibility = VisibilityType.PUBLIC

        val firstMemberEnd = UmlFactory.eINSTANCE.createMemberEndType
        firstMemberEnd.idref = associationId
        memberEnd.add(firstMemberEnd)

        val ownedEndElement = id.createOwnedEndElement(elementId)

        ownedEnd.add(ownedEndElement)

        val secondMemberEnd = UmlFactory.eINSTANCE.createMemberEndType
        secondMemberEnd.idref = ownedEndElement.id
        memberEnd.add(secondMemberEnd)

        parentPackage.packagedElement.add(it)
        transformedElementMap.put(id, new EquivalentElementContainer)
        transformedElementMap.get(id).umlModelElement = it
    }

    def create UmlFactory.eINSTANCE.createOwnedAttributeExtendedAttributesType createOwnedEndElement(String parentId, String refElementId)
    {
        id = uniqueEaId
        type1 = TypeBaseType.UML_PROPERTY
        visibility = VisibilityType.PUBLIC
        association = parentId
        type = UmlFactory.eINSTANCE.createTypeType
        type.idref = refElementId
    }

    def create UmlFactory.eINSTANCE.createUmlClassType transformMapType(FMapType mapType, PackagedElementPackageType parentPackage)
    {
        id = uniqueEaId
        name = mapType.name
        type = TypeBaseType.UML_CLASS
        visibility = VisibilityType.PUBLIC

        if(mapType.eContainer instanceof FTypeCollection && !(mapType.eContainer instanceof FInterface)) 
        {
            parentPackage.packagedElement.add(it)
        }
        else if(mapType.eContainer instanceof FInterface)
        {
            (parentPackage as UmlInterfaceType).nestedClassifier.add(it)
        }
        
        transformedElementMap.put(id, new EquivalentElementContainer)
        transformedElementMap.get(id).fidlElement = mapType
        transformedElementMap.get(id).umlModelElement = it
        
        transformedTypes.put(mapType, id)

        it.createCorrespondingExtensionElement

        val extensionElement = transformedElementMap.get(id).extensionElement as ElementType

        extensionElement.properties.stereotype = StereotypeType.MAP
        extensionElement.attributes = XmeiFactory.eINSTANCE.createAttributesType
        mapType.keyType.transformMapElementType(id, StereotypeType.KEY)
        mapType.valueType.transformMapElementType(id, StereotypeType.VALUE)
    }

    def void transformMapElementType(FTypeRef typeRef, String umlElementId, StereotypeType keyOrValue)
    {
        val parentUmlElement = transformedElementMap.get(umlElementId).umlModelElement as UmlClassType
        val umlAttribute = umlElementId.createUmlOwnedAttributeWithoutName

        if(typeRef.predefined.getName != UNDEFINED)
        {
            umlAttribute.type.idref = EAFRANCAIDL_ + typeRef.predefined.getName
        } // else set later when transforming references

        if(keyOrValue == StereotypeType.KEY)
        {
            umlAttribute.name = StereotypeType.KEY.toString
        }
        else
        {
            umlAttribute.name = StereotypeType.VALUE.toString
        }

        typeRef.createExtensionOwnedAttribute(umlAttribute, parentUmlElement.id)
        val extensionElement = transformedElementMap.get(umlAttribute.id).extensionElement as AttributeType

        if(keyOrValue == StereotypeType.KEY)
        {
            extensionElement.stereotype.stereotype = StereotypeType.KEY
        }
        else
        {
            extensionElement.stereotype.stereotype = StereotypeType.VALUE
        }
    }

    def create XmeiFactory.eINSTANCE.createAttributeType createExtensionOwnedAttribute(FTypeRef typeRef,
        OwnedAttributeExtendedContentType umlElement, String parentId)
    {
        val extensionElement = transformedElementMap.get(parentId).extensionElement as ElementType

        idref = umlElement.id
        name = umlElement.name
        scope = VisibilityType.PUBLIC

        it.createAttributeElementDefaults

        if(typeRef.predefined.getName != UNDEFINED)
        {
            properties.type = typeRef.predefined.getName
        }
        else
        {
            properties.type = typeRef.derived.getName
        }

        containment.containment = CONTAINMENT_NOT_SPECIFIED

        styleex.value = ENUMERATOR_STYLEEX_VALUE_LITERAL_FALSE

        transformedElementMap.get(umlElement.id).extensionElement = it
        extensionElement.attributes.attribute.add(it)
    }

    def void transformReference(FType type)
    {
        switch (type)
        {
            FTypeDef: type.transformTypeRef
            FEnumerationType: type.transformEnumerationRef
            FUnionType: type.transformUnionRef
            FStructType: type.transformStructRef
            FArrayType: type.transformArrayRef
            FMapType: type.transformMapRef
        }

    }

    def void transformTypeRef(FTypeDef typeDef)
    {
        transformedElementMap.entrySet.forEach [
            if(value.fidlElement != null)
            {
                if(value.fidlElement.name == typeDef.actualType.typeName)
                {
                    typeDef.createGeneralizationToActualType(value.fidlElement)
                }
            }
        ]
    }

    def void createGeneralizationToActualType(FTypeDef typeDef, FModelElement actualTypeElement)
    {
        val childId = typeDef.searchTransformedElementsForIdByFModelElement
        val parentId = actualTypeElement.searchTransformedElementsForIdByFModelElement

        val generalizationElement = parentId.createGeneralizationElement

        val childElement = transformedElementMap.get(childId).umlModelElement as UmlClassType
        childElement.generalization = generalizationElement

        generalizationElement.id.createExtensionElementsForIds(parentId, childId)
    }

    def GeneralizationType createGeneralizationElement(String parentId)
    {
        val generalizationElement = UmlFactory.eINSTANCE.createGeneralizationType
        generalizationElement.type = TypeBaseType.UML_GENERALIZATION
        generalizationElement.id = uniqueEaId
        generalizationElement.general = parentId

        return generalizationElement
    }

    def ConcreteLinkType createConcreteLink(String id, String startId, String endId)
    {
        val generalizationExtension = XmeiFactory.eINSTANCE.createConcreteLinkType
        generalizationExtension.id = id
        generalizationExtension.start = startId
        generalizationExtension.end = endId

        return generalizationExtension
    }

    def void createExtensionElementsForIds(String umlElementId, String parentId, String childId)
    {
        val parentExtensionElement = transformedElementMap.get(parentId).extensionElement as ElementType
        val childExtensionElement = transformedElementMap.get(childId).extensionElement as ElementType

        if(parentExtensionElement.links == null)
        {
            parentExtensionElement.links = XmeiFactory.eINSTANCE.createLinksType
        }
        if(childExtensionElement.links == null)
        {
            childExtensionElement.links = XmeiFactory.eINSTANCE.createLinksType
        }

        val parentGeneralizationExtension = umlElementId.createConcreteLink(childId, parentId)
        parentExtensionElement.links.generalization.add(parentGeneralizationExtension)
        if(!connectorMap.containsKey(parentGeneralizationExtension))
        {
            connectorMap.put(parentGeneralizationExtension, new ConnectorDetails) 
            connectorMap.get(parentGeneralizationExtension).connectorId = parentGeneralizationExtension.id
            connectorMap.get(parentGeneralizationExtension).connectorType = EaTypesType.GENERALIZATION
            connectorMap.get(parentGeneralizationExtension).connectorStereotype = StereotypeType.EXTENDS
            connectorMap.get(parentGeneralizationExtension).startId = childId
            connectorMap.get(parentGeneralizationExtension).endId = parentId
            connectorMap.get(parentGeneralizationExtension).startLocalId = childExtensionElement.model.eaLocalid
            connectorMap.get(parentGeneralizationExtension).endLocalId = parentExtensionElement.model.eaLocalid

        /* we only need to insert the element once into the connectorMap
             * because the elements we add to the parent as well as the child extension element
             * are equal (but need to be created twice) 
             */
        }
        val childGeneralizationExtension = umlElementId.createConcreteLink(childId, parentId)
        childExtensionElement.links.generalization.add(childGeneralizationExtension)
    }

    def String searchTransformedElementsForIdByFModelElement(FModelElement type)
    {
        val returnId = transformedTypes.get(type)
        return returnId
    }

    def void transformEnumerationRef(FEnumerationType enumType)
    {
        if(enumType.base != null)
        {
            enumType.setReferenceIfBaseExists()
        }
    }

    def void setReferenceIfBaseExists(FEnumerationType enumType)
    {

        val childId = enumType.searchTransformedElementsForIdByFModelElement
        val parentId = enumType.base.searchTransformedElementsForIdByFModelElement

        val generalizationElement = parentId.createGeneralizationElement

        val childElement = transformedElementMap.get(childId).umlModelElement as UmlEnumerationType
        childElement.generalization = generalizationElement

        generalizationElement.id.createExtensionElementsForIds(parentId, childId)
    }

    def void transformUnionRef(FUnionType unionType)
    {
        if(unionType.base != null)
        {
            unionType.setReferenceIfBaseExists
        }
        unionType.transformContainedAttributes
    }
    
    def void setReferenceIfBaseExists(FUnionType unionType)
    {
        val childId = unionType.searchTransformedElementsForIdByFModelElement
        val parentId = unionType.base.searchTransformedElementsForIdByFModelElement

        val generalizationElement = parentId.createGeneralizationElement

        val childElement = transformedElementMap.get(childId).umlModelElement as UmlClassType
        childElement.generalization = generalizationElement

        generalizationElement.id.createExtensionElementsForIds(parentId, childId)
    }
    
    def void transformContainedAttributes(FCompoundType type)
    {
        type.elements.forEach[ field |
            if(field.type.predefined.toString == UNDEFINED)
            {
                val refId = transformedTypes.get(field.type.derived)
                val containerId = transformedTypes.get(type)
                val containerUmlElement = transformedElementMap.get(containerId).umlModelElement as UmlClassType
                containerUmlElement.ownedAttribute.forEach[ attribute |
                    val attr = attribute as OwnedAttributeExtendedContentType
                    if(attr.name == field.name)
                    {
                        attr.type.idref = refId
                    }
                ]
            }
        ]
    }
    
    def void transformStructRef(FStructType structType)
    {
        if(structType.base != null)
        {
            structType.setReferencesIfBaseExists
        }
        structType.transformContainedAttributes
    }

    def void setReferencesIfBaseExists(FStructType structType)
    {
        val childId = structType.searchTransformedElementsForIdByFModelElement
        val parentId = structType.base.searchTransformedElementsForIdByFModelElement

        val generalizationElement = parentId.createGeneralizationElement

        val childElement = transformedElementMap.get(childId).umlModelElement as UmlClassType
        childElement.generalization = generalizationElement

        generalizationElement.id.createExtensionElementsForIds(parentId, childId)
    }

    def void transformArrayRef(FArrayType arrayType)
    {
        if(arrayType.elementType.predefined.getName == UNDEFINED)
        {
            val baseType = arrayType.elementType.derived
            val baseId = transformedTypes.get(baseType)
            
            val arrayId = transformedTypes.get(arrayType)
            val arrayUmlElement = transformedElementMap.get(arrayId).umlModelElement as UmlClassType
            arrayUmlElement.ownedAttribute.head.type.idref = baseId
            
            val arrayExtensionElement = transformedElementMap.get(arrayId).extensionElement as ElementType
            if(arrayExtensionElement.links == null)
            {
                arrayExtensionElement.links = XmeiFactory.eINSTANCE.createLinksType
            }
            
            val extensionAssociation = arrayUmlElement.createAssociationExtension(arrayId, baseId)
            val baseExtensionElement = transformedElementMap.get(baseId).extensionElement as ElementType
            
            arrayExtensionElement.links.association.add(extensionAssociation)
            
            if(!connectorMap.containsKey(extensionAssociation))
            {
                connectorMap.put(extensionAssociation, new ConnectorDetails) 
                connectorMap.get(extensionAssociation).connectorId = extensionAssociation.id
                connectorMap.get(extensionAssociation).connectorType = EaTypesType.ASSOCIATION
                connectorMap.get(extensionAssociation).connectorStereotype = StereotypeType.ARRAY_OF
                connectorMap.get(extensionAssociation).startId = baseId
                connectorMap.get(extensionAssociation).endId = arrayId
                connectorMap.get(extensionAssociation).startLocalId = baseExtensionElement.model.eaLocalid
                connectorMap.get(extensionAssociation).endLocalId = arrayExtensionElement.model.eaLocalid

                 /* we only need to insert the element once into the connectorMap
             * because the elements we add to the parent as well as the child extension element
             * are equal (but need to be created twice) 
             */
            }
            
            
            if(baseExtensionElement.links == null)
            {
                baseExtensionElement.links = XmeiFactory.eINSTANCE.createLinksType
            }
            
            val baseExtensionAssociation = arrayUmlElement.createAssociationExtension(arrayId, baseId)
            
            baseExtensionElement.links.association.add(baseExtensionAssociation)
        }
    }
    
    def ConcreteLinkType createAssociationExtension(UmlClassType arrayUmlElement, String arrayId, String baseId)
    {
        val extensionAssociation = XmeiFactory.eINSTANCE.createConcreteLinkType
        extensionAssociation.id = (arrayUmlElement.ownedAttribute.get(0) as OwnedAttributeExtendedContentType).association
        extensionAssociation.end = arrayId
        extensionAssociation.start = baseId
        return extensionAssociation
    }

    def void transformMapRef(FMapType mapType)
    {
         mapType.setAttributeRef(mapType.keyType, KEY)
         mapType.setAttributeRef(mapType.valueType, VALUE)
    }

    def void setAttributeRef(FMapType map, FTypeRef ref, String keyOrValue)
    {
        if(ref.predefined.toString == UNDEFINED)
        {
            val refId = transformedTypes.get(ref.derived)
            val containerId = transformedTypes.get(map)
            val containerUmlElement = transformedElementMap.get(containerId).umlModelElement as UmlClassType
            containerUmlElement.ownedAttribute.forEach[ attribute |
                val attr = attribute as OwnedAttributeExtendedContentType
                if(attr.name == keyOrValue)
                {
                    attr.type.idref = refId
                }
            ]
        }
    }

    def void transformInterfaces(FModel model)
    {
        val parentPackage = packageMap.get(model.name)
        model.interfaces.forEach[ currentInterface |
            currentInterface.transformInterface(parentPackage)
        ]
    }
    
    def void transformInterface(FInterface currentInterface, PackagedElementPackageType parentPackage)
    {
        val interfacePackage = currentInterface.createPackageForInterface
        parentPackage.packagedElement.add(interfacePackage)
        val extensionElement = (transformedElementMap.get(interfacePackage.id).extensionElement as ElementType)
        extensionElement.model.package = parentPackage.id
        
        if(!currentInterface.attributes.empty || !currentInterface.types.empty)
        {
            extensionElement.attributes = XmeiFactory.eINSTANCE.createAttributesType
        }
        
        if(!currentInterface.broadcasts.empty || !currentInterface.methods.empty)
        {
            extensionElement.operations = XmeiFactory.eINSTANCE.createOperationsType
        }
        
        val interfaceId = transformedTypes.get(currentInterface)
        currentInterface.attributes.forEach[ attribute |
            attribute.transformInterfaceAttributes(interfaceId)
        ]
        
        enumeratorPosition = 0
        currentInterface.methods.forEach[ method |
            method.transformInterfaceMethod(interfaceId)
        ]
        currentInterface.types.forEach[ type |
            type.transformInterfaceTypes(interfaceId)
        ]
        
        val clientInterface = currentInterface.createClientInterface
        parentPackage.packagedElement.add(clientInterface)
        val extensionElementClient = (transformedElementMap.get(clientInterface.id).extensionElement as ElementType)
        extensionElementClient.model.package = clientInterface.id
        extensionElementClient.operations = XmeiFactory.eINSTANCE.createOperationsType
        extensionElementClient.properties.stereotype = StereotypeType.FRANCA_CLIENT_INTERFACE
        
        currentInterface.broadcasts.forEach[ broadcast |
            broadcast.transformInterfaceBroadcasts(clientInterface.id)
        ]
        
        val interfaceAssociation = interfacePackage.id.createAssociationBetweenInterfaces(clientInterface.id)
        parentPackage.packagedElement.add(interfaceAssociation)
        val associationLink = interfaceAssociation.id.createConcreteLink(interfacePackage.id, clientInterface.id)
        val associationLinkClient = interfaceAssociation.id.createConcreteLink(interfacePackage.id, clientInterface.id)
        extensionElement.links = XmeiFactory.eINSTANCE.createLinksType
        extensionElement.links.association.add(associationLink)
        extensionElementClient.links = XmeiFactory.eINSTANCE.createLinksType
        extensionElementClient.links.association.add(associationLinkClient)
        
        if(!connectorMap.containsKey(associationLink))
        {
            connectorMap.put(associationLink, new ConnectorDetails) 
            connectorMap.get(associationLink).connectorId = associationLink.id
            connectorMap.get(associationLink).connectorType = EaTypesType.ASSOCIATION
            connectorMap.get(associationLink).connectorStereotype = StereotypeType.FRANCA_INTERFACE
            connectorMap.get(associationLink).startId = interfacePackage.id
            connectorMap.get(associationLink).endId = clientInterface.id
            connectorMap.get(associationLink).startLocalId = extensionElement.model.eaLocalid
            connectorMap.get(associationLink).endLocalId = extensionElementClient.model.eaLocalid
             /* we only need to insert the element once into the connectorMap
         * because the elements we add to the parent as well as the child extension element
         * are equal (but need to be created twice) 
         */
        }
    }
    
    def create UmlFactory.eINSTANCE.createPackagedElementAssociationType createAssociationBetweenInterfaces(String parentInterfaceId, String clientInterfaceId) {
        id = uniqueEaId
        type = TypeBaseType.UML_ASSOCIATION
        visibility = VisibilityType.PUBLIC

        val firstMemberEnd = UmlFactory.eINSTANCE.createMemberEndType
        firstMemberEnd.idref = id + "_A"
        memberEnd.add(firstMemberEnd)
        
        val secondMemberEnd = UmlFactory.eINSTANCE.createMemberEndType
        secondMemberEnd.idref = id + "_B"
        memberEnd.add(secondMemberEnd)

        val ownedEndElementParent = id.createOwnedEndElementWithId(parentInterfaceId, firstMemberEnd.idref)
        val ownedEndElementClient = id.createOwnedEndElementWithId(clientInterfaceId, secondMemberEnd.idref)

        ownedEnd.add(ownedEndElementClient)
        ownedEnd.add(ownedEndElementParent)

        transformedElementMap.put(id, new EquivalentElementContainer)
        transformedElementMap.get(id).umlModelElement = it
    }
    
    def create UmlFactory.eINSTANCE.createOwnedAttributeExtendedAttributesType createOwnedEndElementWithId(String parentId, String refElementId, String memberEndId)
    {
        id = memberEndId
        type1 = TypeBaseType.UML_PROPERTY
        visibility = VisibilityType.PUBLIC
        association = parentId
        type = UmlFactory.eINSTANCE.createTypeType
        type.idref = refElementId
    }
    
    def UmlInterfaceType createPackageForInterface(FInterface inter)
    {
        val newPackage = inter.name.createInterfaceForName

        transformedElementMap.get(newPackage.id).fidlElement = inter

        val extensionElement = transformedElementMap.get(newPackage.id).extensionElement as ElementType
        extensionElement.project = transformedElementMap.get(newPackage.id).fidlElement.createProjectElement
        
        transformedTypes.put(inter, newPackage.id)
        
        return newPackage
    }
    
    def UmlInterfaceType createClientInterface(FInterface inter)
    {
        val clientName = inter.name + CLIENT
        val newPackage = clientName.createInterfaceForName

        transformedElementMap.get(newPackage.id).fidlElement = inter

        val extensionElement = transformedElementMap.get(newPackage.id).extensionElement as ElementType
        extensionElement.project = transformedElementMap.get(newPackage.id).fidlElement.createProjectElement
        
        return newPackage
    }

    def UmlInterfaceType createInterfaceForName(String packageName)
    {
        val newPackage = UmlFactory.eINSTANCE.createUmlInterfaceType
        newPackage.name = packageName
        newPackage.id = uniqueEaId
        newPackage.type = TypeBaseType.UML_INTERFACE
        newPackage.visibility = VisibilityType.PUBLIC
        newPackage.isAbstract = true

        transformedElementMap.put(newPackage.id, new EquivalentElementContainer)
        transformedElementMap.get(newPackage.id).umlModelElement = newPackage
        

        val extensionElement = newPackage.createExtensionInterface
        extensionElement.project = createProjectElement(null)
        extensionElement.code = createCodeElement

        return newPackage
    }

    def create XmeiFactory.eINSTANCE.createElementType createExtensionInterface(UmlInterfaceType umlPackage)
    {
        idref = umlPackage.id
        type = umlPackage.type
        name = umlPackage.name
        scope = umlPackage.visibility
        xmiModel.extension.elements.element.add(it)
        transformedElementMap.get(umlPackage.id).extensionElement = it

        model = it.createModelElement
        
        model.eaEleType = ELEMENTTYPE_ELEMENT

        properties = it.createPropertiesElement
        
        properties.SType = STypeType.INTERFACE
        properties.isAbstract = true
        properties.stereotype = StereotypeType.FRANCA_SERVICE_INTERFACE

        project = createProjectElement(transformedElementMap.get(umlPackage.id).fidlElement)

        code = createCodeElement

        xmiModel.extension.elements.element.add(it)
    }
    
    def void transformInterfaceTypes(FType type, String parentInterface)
    {
        type.transformTypeInCollection(transformedElementMap.get(parentInterface).umlModelElement as UmlInterfaceType)
    }
    
    def create UmlFactory.eINSTANCE.createUmlEnumerationType transformEnumerationTypeInInterface(FEnumerationType type,
        UmlInterfaceType parentPackage)
    {
        id = uniqueEaId
        name = type.name
        it.type = TypeBaseType.UML_CLASS
        visibility = VisibilityType.PUBLIC

        parentPackage.nestedClassifier.add(it)
        transformedElementMap.put(id, new EquivalentElementContainer)
        transformedElementMap.get(id).fidlElement = type
        transformedElementMap.get(id).umlModelElement = it

        transformedTypes.put(type, id)

        it.createCorrespondingExtensionElement

        val extensionElement = transformedElementMap.get(id).extensionElement as ElementType
        extensionElement.properties.stereotype = StereotypeType.FRANCA_ENUM

        if(!type.enumerators.empty)
        {
            extensionElement.attributes = XmeiFactory.eINSTANCE.createAttributesType
        }

        enumeratorPosition = 0
        type.enumerators.forEach [ enumerator |
            enumerator.transformEnumerator(id)
        ]
    }
    
    def void transformInterfaceMethod(FMethod method, String parentInterface)
    {
        method.createOwnedOperationElement(parentInterface)
    }
    
    def create UmlFactory.eINSTANCE.createOwnedOperationType createOwnedOperationElement(FMethod method, String parentInterface)
    {
        id = uniqueEaId
        name = method.name
        visibility = VisibilityType.PUBLIC
        it.concurrency = SEQUENTIAL
        
        val parentUmlElement = transformedElementMap.get(parentInterface).umlModelElement as UmlInterfaceType
        parentUmlElement.ownedOperation.add(it)
        
        transformedElementMap.put(id, new EquivalentElementContainer)
        transformedElementMap.get(id).fidlElement = method
        transformedElementMap.get(id).umlModelElement = it

        transformedTypes.put(method, id)
        
        val extensionOperation = method.createOwnedOperationExtensionElement(id, parentInterface)
        
        parameterPosition = 0
        method.inArgs.forEach[ inArg |
            inArg.transformParameter(DIRECTION_IN, id)
        ]

        extensionOperation.type.returnarray = 0
        method.outArgs.forEach[ outArg |
            outArg.transformParameter(DIRECTION_OUT, id)
        ]
        
        method.outArgs.forEach[ outArg |
            if(outArg.array != null)
            {
                /*
                 * if one of the return parameters is an array, we set the returnarray flag to true
                 */
                extensionOperation.type.returnarray = 1
            }            
        ]
        
        if(method.errors != null)
        {
            if(method.errors.base != null)
            {
                method.errors.base.setErrorEnumReference(it)
            }
            method.errors.enumerators.forEach[ errorEnumerator |
                errorEnumerator.transformErrorEnumerator(it)
            ]
        }
        
        if(method.errorEnum != null)
        {
            method.errorEnum.setErrorEnumReference(it)
        }
        
    }
    
    def void transformErrorEnumerator(FEnumerator enumerator, OwnedOperationType parentOperation)
    {
        val ownedParam = UmlFactory.eINSTANCE.createOwnedParameterType
        ownedParam.id = uniqueEaId
        ownedParam.name = enumerator.name
        ownedParam.type = ERROR
        ownedParam.isStream = false
        ownedParam.isOrdered = false
        ownedParam.isException = false
        ownedParam.isUnique = false
        ownedParam.direction = DirectionType.OUT
        
        ownedParam.defaultValue = UmlFactory.eINSTANCE.createDefaultValueType
        ownedParam.defaultValue.type = TypeBaseType.UML_LITERAL_STRING
        ownedParam.defaultValue.id = ownedParam.id + "_" + parameterPosition
        parameterPosition = parameterPosition + 1
        ownedParam.defaultValue.value = enumerator.value
        
        parentOperation.ownedParameter.add(ownedParam) 
        transformedElementMap.put(ownedParam.id, new EquivalentElementContainer)
        transformedElementMap.get(ownedParam.id).fidlElement = enumerator
        transformedElementMap.get(ownedParam.id).umlModelElement = ownedParam

        transformedTypes.put(enumerator, ownedParam.id)
        
        ownedParam.createParameterExtension(parentOperation.id)
    }
    
    def void setErrorEnumReference(FEnumerationType errorEnum, OwnedOperationType parentOperation)
    {
        val ownedParam = UmlFactory.eINSTANCE.createOwnedParameterType
        ownedParam.id = uniqueEaId
        ownedParam.name = ERROR
        ownedParam.type = transformedTypes.get(errorEnum)
        ownedParam.isStream = false
        ownedParam.isOrdered = false
        ownedParam.isException = false
        ownedParam.isUnique = false
        ownedParam.direction = DirectionType.OUT
        
        parentOperation.ownedParameter.add(ownedParam)     
        ownedParam.createEnumRefExtension(parentOperation.id, errorEnum)        
    }
    
    def create XmeiFactory.eINSTANCE.createParameterType createEnumRefExtension(OwnedParameterType paramType, String operationId, FEnumerationType errorEnum)
    {
        idref = paramType.id
        visibility = VisibilityType.PUBLIC
        
        it.createParameterDefaults
        
        properties.classifier = transformedTypes.get(errorEnum)
        properties.type = errorEnum.name
             
        val extensionOperation = transformedElementMap.get(operationId).extensionElement as OperationType
        extensionOperation.parameters.parameter.add(it)
    }
    
    def create XmeiFactory.eINSTANCE.createOperationType createOwnedOperationExtensionElement(FMethod method, String umlElementId, String parentId)
    {
        val extensionElement = transformedElementMap.get(parentId).extensionElement as ElementType

        idref = umlElementId
        name = method.name
        scope = VisibilityType.PUBLIC

        it.createOperationElementDefaults

        documentation.value = method.description

        transformedElementMap.get(umlElementId).extensionElement = it
        
        if(method.fireAndForget != null)
        {
            it.stereotype.stereotype = StereotypeType.METHOD_FIREANDFORGET
        }
        else
        {
            it.stereotype.stereotype = StereotypeType.METHOD
        }
        it.type.stereotype = it.stereotype.stereotype
        
        extensionElement.operations.operation.add(it)
    }
    
    
    def void createOperationElementDefaults(OperationType operation)
    {
        operation.documentation = XmeiFactory.eINSTANCE.createDocumentationType

        operation.properties = XmeiFactory.eINSTANCE.createOperationPropertiesType
        operation.properties.position = enumeratorPosition
        enumeratorPosition = enumeratorPosition + 1

        operation.model = XmeiFactory.eINSTANCE.createAttributeModelType
        operation.model.eaLocalid = eaIdCounter
        operation.model.eaGuid = OPEN_CURLED_BRACKETS + operation.idref + CLOSE_CURLED_BRACKETS

        operation.stereotype = XmeiFactory.eINSTANCE.createStereotypeAttributeType
        
        operation.type = XmeiFactory.eINSTANCE.createOperationTypeType
        operation.type.static = false
        operation.type.const = false
        operation.type.isAbstract = false
        operation.type.concurrency = SEQUENTIAL_CAPITAL_S
        operation.type.isQuery = false
        operation.type.synchronised = 0
        operation.type.pure = 0
        
        operation.parameters = XmeiFactory.eINSTANCE.createOperationParametersType
        
    }
    
    def create UmlFactory.eINSTANCE.createOwnedParameterType transformParameter(FArgument argument, String argDirection, String operationId)
    {
        id = uniqueEaId
        name = argument.name
        if(argDirection.equals(DIRECTION_IN))
        {
            direction = DirectionType.IN
            if(argument.array != null)
            {
                lowerValue = UmlFactory.eINSTANCE.createMultiplicityValueType
                lowerValue.type = TypeBaseType.UML_LITERAL_INTEGER
                lowerValue.value = 1.toString
                lowerValue.id = id + "_A"
                
                upperValue = UmlFactory.eINSTANCE.createMultiplicityValueType
                upperValue.type = TypeBaseType.UML_LITERAL_UNLIMITED_NATURAL
                upperValue.value = (-1).toString
                upperValue.id = id + "_B"
            }
        }
        else
        {
            direction = DirectionType.OUT
        }
        isStream = false
        isOrdered = false
        isException = false
        isUnique = false
        type = argument.type.typeName
        
        val parentOperation = transformedElementMap.get(operationId).umlModelElement as OwnedOperationType
        parentOperation.ownedParameter.add(it)
        
        transformedElementMap.put(id, new EquivalentElementContainer)
        transformedElementMap.get(id).fidlElement = argument
        transformedElementMap.get(id).umlModelElement = it

        transformedTypes.put(argument, id)
        
        it.createParameterExtension(operationId)
    }
    
    def create XmeiFactory.eINSTANCE.createParameterType createParameterExtension(OwnedParameterType paramType, String operationId)
    {
        idref = paramType.id
        visibility = VisibilityType.PUBLIC
        
        it.createParameterDefaults
        
        transformedElementMap.get(idref).extensionElement = it
        
        if(transformedElementMap.get(idref).fidlElement instanceof FEnumerator)
        {
            val enumerator = transformedElementMap.get(idref).fidlElement as FEnumerator
            properties.type = enumerator.name
        }
        else 
        {
            val fArgument = transformedElementMap.get(idref).fidlElement as FArgument
            if(fArgument.type.predefined.getName == UNDEFINED)
            {
                properties.classifier = transformedTypes.get(fArgument.type.derived)
            }
            properties.type = fArgument.type.typeName
        }
        val extensionOperation = transformedElementMap.get(operationId).extensionElement as OperationType
        extensionOperation.parameters.parameter.add(it)
    }
    
    def void createParameterDefaults(ParameterType paramType)
    {
        paramType.properties = XmeiFactory.eINSTANCE.createParameterPropertiesType
        paramType.properties.pos = parameterPosition
        parameterPosition = parameterPosition + 1
        paramType.properties.const = false
        paramType.properties.eaGuid = OPEN_CURLED_BRACKETS + paramType.idref + CLOSE_CURLED_BRACKETS
        
        paramType.documentation = XmeiFactory.eINSTANCE.createDocumentationType
    }
    
    def create UmlFactory.eINSTANCE.createOwnedOperationType transformInterfaceBroadcasts(FBroadcast broadcast, String parentInterface)
    {
        id = uniqueEaId
        name = broadcast.name
        visibility = VisibilityType.PUBLIC
        it.concurrency = SEQUENTIAL
        
        val parentUmlElement = transformedElementMap.get(parentInterface).umlModelElement as UmlInterfaceType
        parentUmlElement.ownedOperation.add(it)
        
        transformedElementMap.put(id, new EquivalentElementContainer)
        transformedElementMap.get(id).fidlElement = broadcast
        transformedElementMap.get(id).umlModelElement = it

        transformedTypes.put(broadcast, id)
        
        val extensionOperation = broadcast.createOwnedOperationBroadcastExtensionElement(id, parentInterface)
        
        parameterPosition = 0

        extensionOperation.type.returnarray = 0
        broadcast.outArgs.forEach[ outArg |
            outArg.transformParameter(DIRECTION_OUT, id)
        ]
        
        broadcast.outArgs.forEach[ outArg |
            if(outArg.array != null)
            {
                /*
                 * if one of the return parameters is an array, we set the returnarray flag to true
                 */
                extensionOperation.type.returnarray = 1
            }            
        ]
    }
    
    def create XmeiFactory.eINSTANCE.createOperationType createOwnedOperationBroadcastExtensionElement(FBroadcast broadcast, String umlElementId, String parentId)
    {
        val extensionElement = transformedElementMap.get(parentId).extensionElement as ElementType

        idref = umlElementId
        name = broadcast.name
        scope = VisibilityType.PUBLIC

        it.createOperationElementDefaults

        documentation.value = broadcast.description

        transformedElementMap.get(umlElementId).extensionElement = it
        
        if(broadcast.selective != null)
        {
            it.stereotype.stereotype = StereotypeType.BROADCAST_SELECTIVE
        }
        else
        {
            it.stereotype.stereotype = StereotypeType.BROADCAST
        }
        it.type.stereotype = it.stereotype.stereotype
        
        extensionElement.operations.operation.add(it)
    }
    
    def void transformInterfaceAttributes(FAttribute attribute, String parentInterface)
    {
        val createdAttr = attribute.createUmlOwnedAttribute(parentInterface)
        val umlParent = transformedElementMap.get(parentInterface).umlModelElement as UmlInterfaceType
        umlParent.ownedAttribute.add(createdAttr)
        val extensionElement = transformedElementMap.get(createdAttr.id).extensionElement as AttributeType
        
        if(attribute.readonly && attribute.noSubscriptions)
        {
            extensionElement.stereotype.stereotype = StereotypeType.ATTRIBUTE_READONLY_NOSUBSCRIPTIONS
        }
        else if(attribute.readonly)
        {
            extensionElement.stereotype.stereotype = StereotypeType.ATTRIBUTE_READONLY
        }
        else if(attribute.noSubscriptions)
        {
            extensionElement.stereotype.stereotype = StereotypeType.ATTRIBUTE_NOSUBSCRIPTIONS
        }
        else
        {
            extensionElement.stereotype.stereotype = StereotypeType.ATTRIBUTE
        }
        
    }
    
    def create XmeiFactory.eINSTANCE.createConnectorType createConnector(ConnectorDetails details) {
        idref = details.connectorId
        
        source = XmeiFactory.eINSTANCE.createSourceAndTargetType
        target = XmeiFactory.eINSTANCE.createSourceAndTargetType
        
        model = XmeiFactory.eINSTANCE.createConnectorModelType
        model.eaLocalid = assignEaIdCounterValue
        properties = XmeiFactory.eINSTANCE.createConnectorPropertiesType
        properties.eaType = details.connectorType
        properties.stereotype = details.connectorStereotype
        properties.direction = xmei.DirectionType.SOURCE_DESTINATION
        /*
         * if we have a franca interface we don't want any direction, so overwrite the setting
         */
        if(properties.stereotype == StereotypeType.FRANCA_INTERFACE)
        {
            properties.direction = xmei.DirectionType.UNSPECIFIED
        }
        
        if(properties.stereotype == StereotypeType.ARRAY_OF)
        {
            labels = XmeiFactory.eINSTANCE.createConnectorLabelsType
            labels.lb = ASTERISK
            target.type = XmeiFactory.eINSTANCE.createSourceAndTargetTypeType
            target.type.multiplicity = ASTERISK
        }
        
        source.idref = details.startId
        target.idref = details.endId
        
        xmiModel.extension.connectors.connector.add(it)
    }

    def String getTypeName(FTypeRef t)
    {

        if(t.derived != null)
        {
            return t.derived.name;
        }
        else
        {
            return t.predefined.getName;
        }

    }
}
