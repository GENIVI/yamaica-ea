/**
 */
package xmei.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import xmei.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmeiFactoryImpl extends EFactoryImpl implements XmeiFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static XmeiFactory init()
    {
        try
        {
            XmeiFactory theXmeiFactory = (XmeiFactory)EPackage.Registry.INSTANCE.getEFactory(XmeiPackage.eNS_URI);
            if (theXmeiFactory != null)
            {
                return theXmeiFactory;
            }
        }
        catch (Exception exception)
        {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new XmeiFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XmeiFactoryImpl()
    {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass)
    {
        switch (eClass.getClassifierID())
        {
            case XmeiPackage.ATTRIBUTE_CONTAINMENT_TYPE: return createAttributeContainmentType();
            case XmeiPackage.ATTRIBUTE_MODEL_TYPE: return createAttributeModelType();
            case XmeiPackage.ATTRIBUTE_PROPERTIES_TYPE: return createAttributePropertiesType();
            case XmeiPackage.ATTRIBUTES_TYPE: return createAttributesType();
            case XmeiPackage.ATTRIBUTE_TYPE: return createAttributeType();
            case XmeiPackage.BOUNDS_TYPE: return createBoundsType();
            case XmeiPackage.CODE_TYPE: return createCodeType();
            case XmeiPackage.CONCRETE_LINK_TYPE: return createConcreteLinkType();
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE: return createConnectorAppearanceType();
            case XmeiPackage.CONNECTOR_LABELS_TYPE: return createConnectorLabelsType();
            case XmeiPackage.CONNECTOR_MODEL_TYPE: return createConnectorModelType();
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE: return createConnectorModifiersType();
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE: return createConnectorPropertiesType();
            case XmeiPackage.CONNECTORS_TYPE: return createConnectorsType();
            case XmeiPackage.CONNECTOR_TYPE: return createConnectorType();
            case XmeiPackage.DIAGRAM_ELEMENTS_TYPE: return createDiagramElementsType();
            case XmeiPackage.DIAGRAM_ELEMENT_TYPE: return createDiagramElementType();
            case XmeiPackage.DIAGRAM_MODEL_TYPE: return createDiagramModelType();
            case XmeiPackage.DIAGRAM_PROPERTIES_TYPE: return createDiagramPropertiesType();
            case XmeiPackage.DIAGRAMS_TYPE: return createDiagramsType();
            case XmeiPackage.DIAGRAM_TYPE: return createDiagramType();
            case XmeiPackage.DOCUMENTATION: return createDocumentation();
            case XmeiPackage.DOCUMENTATION_TYPE: return createDocumentationType();
            case XmeiPackage.ELEMENTS_TYPE: return createElementsType();
            case XmeiPackage.ELEMENT_TYPE: return createElementType();
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE: return createExtendedPropertiesType();
            case XmeiPackage.EXTENSION: return createExtension();
            case XmeiPackage.INITIAL_TYPE: return createInitialType();
            case XmeiPackage.LINKS_TYPE: return createLinksType();
            case XmeiPackage.MODEL_TYPE: return createModelType();
            case XmeiPackage.OPERATION_PARAMETERS_TYPE: return createOperationParametersType();
            case XmeiPackage.OPERATION_PROPERTIES_TYPE: return createOperationPropertiesType();
            case XmeiPackage.OPERATIONS_TYPE: return createOperationsType();
            case XmeiPackage.OPERATION_TAGS_TYPE: return createOperationTagsType();
            case XmeiPackage.OPERATION_TYPE: return createOperationType();
            case XmeiPackage.OPERATION_TYPE_TYPE: return createOperationTypeType();
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE: return createParameterPropertiesType();
            case XmeiPackage.PARAMETER_TYPE: return createParameterType();
            case XmeiPackage.PRIMITIVE_TYPES_TYPE: return createPrimitiveTypesType();
            case XmeiPackage.PROJECT_TYPE: return createProjectType();
            case XmeiPackage.PROPERTIES_TYPE: return createPropertiesType();
            case XmeiPackage.SOURCE_AND_TARGET_MODEL_TYPE: return createSourceAndTargetModelType();
            case XmeiPackage.SOURCE_AND_TARGET_ROLE_TYPE: return createSourceAndTargetRoleType();
            case XmeiPackage.SOURCE_AND_TARGET_TYPE: return createSourceAndTargetType();
            case XmeiPackage.SOURCE_AND_TARGET_TYPE_TYPE: return createSourceAndTargetTypeType();
            case XmeiPackage.STEREOTYPE_ATTRIBUTE_TYPE: return createStereotypeAttributeType();
            case XmeiPackage.STYLEEX_TYPE: return createStyleexType();
            case XmeiPackage.TAG_TYPE: return createTagType();
            case XmeiPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case XmeiPackage.XMI_TYPE: return createXMIType();
            case XmeiPackage.XREFS_TYPE: return createXrefsType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue)
    {
        switch (eDataType.getClassifierID())
        {
            case XmeiPackage.ASYNC_SYNC_TYPE:
                return createAsyncSyncTypeFromString(eDataType, initialValue);
            case XmeiPackage.DIAGRAM_TYPE_TYPE:
                return createDiagramTypeTypeFromString(eDataType, initialValue);
            case XmeiPackage.DIRECTION_TYPE:
                return createDirectionTypeFromString(eDataType, initialValue);
            case XmeiPackage.EA_TYPES_TYPE:
                return createEaTypesTypeFromString(eDataType, initialValue);
            case XmeiPackage.STEREOTYPE_TYPE:
                return createStereotypeTypeFromString(eDataType, initialValue);
            case XmeiPackage.STYPE_TYPE:
                return createSTypeTypeFromString(eDataType, initialValue);
            case XmeiPackage.TYPE_BASE_TYPE:
                return createTypeBaseTypeFromString(eDataType, initialValue);
            case XmeiPackage.ASYNC_SYNC_TYPE_OBJECT:
                return createAsyncSyncTypeObjectFromString(eDataType, initialValue);
            case XmeiPackage.DIAGRAM_TYPE_TYPE_OBJECT:
                return createDiagramTypeTypeObjectFromString(eDataType, initialValue);
            case XmeiPackage.DIRECTION_TYPE_OBJECT:
                return createDirectionTypeObjectFromString(eDataType, initialValue);
            case XmeiPackage.EA_TYPES_TYPE_OBJECT:
                return createEaTypesTypeObjectFromString(eDataType, initialValue);
            case XmeiPackage.ID_TYPE:
                return createIdTypeFromString(eDataType, initialValue);
            case XmeiPackage.STEREOTYPE_TYPE_OBJECT:
                return createStereotypeTypeObjectFromString(eDataType, initialValue);
            case XmeiPackage.STYPE_TYPE_OBJECT:
                return createSTypeTypeObjectFromString(eDataType, initialValue);
            case XmeiPackage.TYPE_BASE_TYPE_OBJECT:
                return createTypeBaseTypeObjectFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue)
    {
        switch (eDataType.getClassifierID())
        {
            case XmeiPackage.ASYNC_SYNC_TYPE:
                return convertAsyncSyncTypeToString(eDataType, instanceValue);
            case XmeiPackage.DIAGRAM_TYPE_TYPE:
                return convertDiagramTypeTypeToString(eDataType, instanceValue);
            case XmeiPackage.DIRECTION_TYPE:
                return convertDirectionTypeToString(eDataType, instanceValue);
            case XmeiPackage.EA_TYPES_TYPE:
                return convertEaTypesTypeToString(eDataType, instanceValue);
            case XmeiPackage.STEREOTYPE_TYPE:
                return convertStereotypeTypeToString(eDataType, instanceValue);
            case XmeiPackage.STYPE_TYPE:
                return convertSTypeTypeToString(eDataType, instanceValue);
            case XmeiPackage.TYPE_BASE_TYPE:
                return convertTypeBaseTypeToString(eDataType, instanceValue);
            case XmeiPackage.ASYNC_SYNC_TYPE_OBJECT:
                return convertAsyncSyncTypeObjectToString(eDataType, instanceValue);
            case XmeiPackage.DIAGRAM_TYPE_TYPE_OBJECT:
                return convertDiagramTypeTypeObjectToString(eDataType, instanceValue);
            case XmeiPackage.DIRECTION_TYPE_OBJECT:
                return convertDirectionTypeObjectToString(eDataType, instanceValue);
            case XmeiPackage.EA_TYPES_TYPE_OBJECT:
                return convertEaTypesTypeObjectToString(eDataType, instanceValue);
            case XmeiPackage.ID_TYPE:
                return convertIdTypeToString(eDataType, instanceValue);
            case XmeiPackage.STEREOTYPE_TYPE_OBJECT:
                return convertStereotypeTypeObjectToString(eDataType, instanceValue);
            case XmeiPackage.STYPE_TYPE_OBJECT:
                return convertSTypeTypeObjectToString(eDataType, instanceValue);
            case XmeiPackage.TYPE_BASE_TYPE_OBJECT:
                return convertTypeBaseTypeObjectToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeContainmentType createAttributeContainmentType()
    {
        AttributeContainmentTypeImpl attributeContainmentType = new AttributeContainmentTypeImpl();
        return attributeContainmentType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeModelType createAttributeModelType()
    {
        AttributeModelTypeImpl attributeModelType = new AttributeModelTypeImpl();
        return attributeModelType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributePropertiesType createAttributePropertiesType()
    {
        AttributePropertiesTypeImpl attributePropertiesType = new AttributePropertiesTypeImpl();
        return attributePropertiesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributesType createAttributesType()
    {
        AttributesTypeImpl attributesType = new AttributesTypeImpl();
        return attributesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeType createAttributeType()
    {
        AttributeTypeImpl attributeType = new AttributeTypeImpl();
        return attributeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BoundsType createBoundsType()
    {
        BoundsTypeImpl boundsType = new BoundsTypeImpl();
        return boundsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CodeType createCodeType()
    {
        CodeTypeImpl codeType = new CodeTypeImpl();
        return codeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConcreteLinkType createConcreteLinkType()
    {
        ConcreteLinkTypeImpl concreteLinkType = new ConcreteLinkTypeImpl();
        return concreteLinkType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorAppearanceType createConnectorAppearanceType()
    {
        ConnectorAppearanceTypeImpl connectorAppearanceType = new ConnectorAppearanceTypeImpl();
        return connectorAppearanceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorLabelsType createConnectorLabelsType()
    {
        ConnectorLabelsTypeImpl connectorLabelsType = new ConnectorLabelsTypeImpl();
        return connectorLabelsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorModelType createConnectorModelType()
    {
        ConnectorModelTypeImpl connectorModelType = new ConnectorModelTypeImpl();
        return connectorModelType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorModifiersType createConnectorModifiersType()
    {
        ConnectorModifiersTypeImpl connectorModifiersType = new ConnectorModifiersTypeImpl();
        return connectorModifiersType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorPropertiesType createConnectorPropertiesType()
    {
        ConnectorPropertiesTypeImpl connectorPropertiesType = new ConnectorPropertiesTypeImpl();
        return connectorPropertiesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorsType createConnectorsType()
    {
        ConnectorsTypeImpl connectorsType = new ConnectorsTypeImpl();
        return connectorsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorType createConnectorType()
    {
        ConnectorTypeImpl connectorType = new ConnectorTypeImpl();
        return connectorType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramElementsType createDiagramElementsType()
    {
        DiagramElementsTypeImpl diagramElementsType = new DiagramElementsTypeImpl();
        return diagramElementsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramElementType createDiagramElementType()
    {
        DiagramElementTypeImpl diagramElementType = new DiagramElementTypeImpl();
        return diagramElementType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramModelType createDiagramModelType()
    {
        DiagramModelTypeImpl diagramModelType = new DiagramModelTypeImpl();
        return diagramModelType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramPropertiesType createDiagramPropertiesType()
    {
        DiagramPropertiesTypeImpl diagramPropertiesType = new DiagramPropertiesTypeImpl();
        return diagramPropertiesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramsType createDiagramsType()
    {
        DiagramsTypeImpl diagramsType = new DiagramsTypeImpl();
        return diagramsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramType createDiagramType()
    {
        DiagramTypeImpl diagramType = new DiagramTypeImpl();
        return diagramType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Documentation createDocumentation()
    {
        DocumentationImpl documentation = new DocumentationImpl();
        return documentation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentationType createDocumentationType()
    {
        DocumentationTypeImpl documentationType = new DocumentationTypeImpl();
        return documentationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElementsType createElementsType()
    {
        ElementsTypeImpl elementsType = new ElementsTypeImpl();
        return elementsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElementType createElementType()
    {
        ElementTypeImpl elementType = new ElementTypeImpl();
        return elementType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtendedPropertiesType createExtendedPropertiesType()
    {
        ExtendedPropertiesTypeImpl extendedPropertiesType = new ExtendedPropertiesTypeImpl();
        return extendedPropertiesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Extension createExtension()
    {
        ExtensionImpl extension = new ExtensionImpl();
        return extension;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InitialType createInitialType()
    {
        InitialTypeImpl initialType = new InitialTypeImpl();
        return initialType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinksType createLinksType()
    {
        LinksTypeImpl linksType = new LinksTypeImpl();
        return linksType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelType createModelType()
    {
        ModelTypeImpl modelType = new ModelTypeImpl();
        return modelType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationParametersType createOperationParametersType()
    {
        OperationParametersTypeImpl operationParametersType = new OperationParametersTypeImpl();
        return operationParametersType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationPropertiesType createOperationPropertiesType()
    {
        OperationPropertiesTypeImpl operationPropertiesType = new OperationPropertiesTypeImpl();
        return operationPropertiesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationsType createOperationsType()
    {
        OperationsTypeImpl operationsType = new OperationsTypeImpl();
        return operationsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationTagsType createOperationTagsType()
    {
        OperationTagsTypeImpl operationTagsType = new OperationTagsTypeImpl();
        return operationTagsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationType createOperationType()
    {
        OperationTypeImpl operationType = new OperationTypeImpl();
        return operationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationTypeType createOperationTypeType()
    {
        OperationTypeTypeImpl operationTypeType = new OperationTypeTypeImpl();
        return operationTypeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterPropertiesType createParameterPropertiesType()
    {
        ParameterPropertiesTypeImpl parameterPropertiesType = new ParameterPropertiesTypeImpl();
        return parameterPropertiesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterType createParameterType()
    {
        ParameterTypeImpl parameterType = new ParameterTypeImpl();
        return parameterType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PrimitiveTypesType createPrimitiveTypesType()
    {
        PrimitiveTypesTypeImpl primitiveTypesType = new PrimitiveTypesTypeImpl();
        return primitiveTypesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProjectType createProjectType()
    {
        ProjectTypeImpl projectType = new ProjectTypeImpl();
        return projectType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertiesType createPropertiesType()
    {
        PropertiesTypeImpl propertiesType = new PropertiesTypeImpl();
        return propertiesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SourceAndTargetModelType createSourceAndTargetModelType()
    {
        SourceAndTargetModelTypeImpl sourceAndTargetModelType = new SourceAndTargetModelTypeImpl();
        return sourceAndTargetModelType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SourceAndTargetRoleType createSourceAndTargetRoleType()
    {
        SourceAndTargetRoleTypeImpl sourceAndTargetRoleType = new SourceAndTargetRoleTypeImpl();
        return sourceAndTargetRoleType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SourceAndTargetType createSourceAndTargetType()
    {
        SourceAndTargetTypeImpl sourceAndTargetType = new SourceAndTargetTypeImpl();
        return sourceAndTargetType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SourceAndTargetTypeType createSourceAndTargetTypeType()
    {
        SourceAndTargetTypeTypeImpl sourceAndTargetTypeType = new SourceAndTargetTypeTypeImpl();
        return sourceAndTargetTypeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StereotypeAttributeType createStereotypeAttributeType()
    {
        StereotypeAttributeTypeImpl stereotypeAttributeType = new StereotypeAttributeTypeImpl();
        return stereotypeAttributeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StyleexType createStyleexType()
    {
        StyleexTypeImpl styleexType = new StyleexTypeImpl();
        return styleexType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TagType createTagType()
    {
        TagTypeImpl tagType = new TagTypeImpl();
        return tagType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRoot createDocumentRoot()
    {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XMIType createXMIType()
    {
        XMITypeImpl xmiType = new XMITypeImpl();
        return xmiType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XrefsType createXrefsType()
    {
        XrefsTypeImpl xrefsType = new XrefsTypeImpl();
        return xrefsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AsyncSyncType createAsyncSyncTypeFromString(EDataType eDataType, String initialValue)
    {
        AsyncSyncType result = AsyncSyncType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAsyncSyncTypeToString(EDataType eDataType, Object instanceValue)
    {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramTypeType createDiagramTypeTypeFromString(EDataType eDataType, String initialValue)
    {
        DiagramTypeType result = DiagramTypeType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDiagramTypeTypeToString(EDataType eDataType, Object instanceValue)
    {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DirectionType createDirectionTypeFromString(EDataType eDataType, String initialValue)
    {
        DirectionType result = DirectionType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDirectionTypeToString(EDataType eDataType, Object instanceValue)
    {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EaTypesType createEaTypesTypeFromString(EDataType eDataType, String initialValue)
    {
        EaTypesType result = EaTypesType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEaTypesTypeToString(EDataType eDataType, Object instanceValue)
    {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StereotypeType createStereotypeTypeFromString(EDataType eDataType, String initialValue)
    {
        StereotypeType result = StereotypeType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertStereotypeTypeToString(EDataType eDataType, Object instanceValue)
    {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public STypeType createSTypeTypeFromString(EDataType eDataType, String initialValue)
    {
        STypeType result = STypeType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSTypeTypeToString(EDataType eDataType, Object instanceValue)
    {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeBaseType createTypeBaseTypeFromString(EDataType eDataType, String initialValue)
    {
        TypeBaseType result = TypeBaseType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTypeBaseTypeToString(EDataType eDataType, Object instanceValue)
    {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AsyncSyncType createAsyncSyncTypeObjectFromString(EDataType eDataType, String initialValue)
    {
        return createAsyncSyncTypeFromString(XmeiPackage.Literals.ASYNC_SYNC_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAsyncSyncTypeObjectToString(EDataType eDataType, Object instanceValue)
    {
        return convertAsyncSyncTypeToString(XmeiPackage.Literals.ASYNC_SYNC_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramTypeType createDiagramTypeTypeObjectFromString(EDataType eDataType, String initialValue)
    {
        return createDiagramTypeTypeFromString(XmeiPackage.Literals.DIAGRAM_TYPE_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDiagramTypeTypeObjectToString(EDataType eDataType, Object instanceValue)
    {
        return convertDiagramTypeTypeToString(XmeiPackage.Literals.DIAGRAM_TYPE_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DirectionType createDirectionTypeObjectFromString(EDataType eDataType, String initialValue)
    {
        return createDirectionTypeFromString(XmeiPackage.Literals.DIRECTION_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDirectionTypeObjectToString(EDataType eDataType, Object instanceValue)
    {
        return convertDirectionTypeToString(XmeiPackage.Literals.DIRECTION_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EaTypesType createEaTypesTypeObjectFromString(EDataType eDataType, String initialValue)
    {
        return createEaTypesTypeFromString(XmeiPackage.Literals.EA_TYPES_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEaTypesTypeObjectToString(EDataType eDataType, Object instanceValue)
    {
        return convertEaTypesTypeToString(XmeiPackage.Literals.EA_TYPES_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createIdTypeFromString(EDataType eDataType, String initialValue)
    {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIdTypeToString(EDataType eDataType, Object instanceValue)
    {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StereotypeType createStereotypeTypeObjectFromString(EDataType eDataType, String initialValue)
    {
        return createStereotypeTypeFromString(XmeiPackage.Literals.STEREOTYPE_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertStereotypeTypeObjectToString(EDataType eDataType, Object instanceValue)
    {
        return convertStereotypeTypeToString(XmeiPackage.Literals.STEREOTYPE_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public STypeType createSTypeTypeObjectFromString(EDataType eDataType, String initialValue)
    {
        return createSTypeTypeFromString(XmeiPackage.Literals.STYPE_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSTypeTypeObjectToString(EDataType eDataType, Object instanceValue)
    {
        return convertSTypeTypeToString(XmeiPackage.Literals.STYPE_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeBaseType createTypeBaseTypeObjectFromString(EDataType eDataType, String initialValue)
    {
        return createTypeBaseTypeFromString(XmeiPackage.Literals.TYPE_BASE_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTypeBaseTypeObjectToString(EDataType eDataType, Object instanceValue)
    {
        return convertTypeBaseTypeToString(XmeiPackage.Literals.TYPE_BASE_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XmeiPackage getXmeiPackage()
    {
        return (XmeiPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static XmeiPackage getPackage()
    {
        return XmeiPackage.eINSTANCE;
    }

} //XmeiFactoryImpl
