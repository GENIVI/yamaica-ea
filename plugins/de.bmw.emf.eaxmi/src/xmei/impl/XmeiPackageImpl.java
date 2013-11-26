/**
 */
package xmei.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import uml.UmlPackage;

import uml.impl.UmlPackageImpl;

import xmei.AsyncSyncType;
import xmei.AttributeContainmentType;
import xmei.AttributeModelType;
import xmei.AttributePropertiesType;
import xmei.AttributeType;
import xmei.AttributesType;
import xmei.BoundsType;
import xmei.CodeType;
import xmei.ConcreteLinkType;
import xmei.ConnectorAppearanceType;
import xmei.ConnectorLabelsType;
import xmei.ConnectorModelType;
import xmei.ConnectorModifiersType;
import xmei.ConnectorPropertiesType;
import xmei.ConnectorType;
import xmei.ConnectorsType;
import xmei.DiagramElementType;
import xmei.DiagramElementsType;
import xmei.DiagramModelType;
import xmei.DiagramPropertiesType;
import xmei.DiagramType;
import xmei.DiagramTypeType;
import xmei.DiagramsType;
import xmei.DirectionType;
import xmei.DocumentRoot;
import xmei.Documentation;
import xmei.DocumentationType;
import xmei.EaTypesType;
import xmei.ElementType;
import xmei.ElementsType;
import xmei.ExtendedPropertiesType;
import xmei.Extension;
import xmei.InitialType;
import xmei.LinksType;
import xmei.ModelType;
import xmei.OperationParametersType;
import xmei.OperationPropertiesType;
import xmei.OperationTagsType;
import xmei.OperationType;
import xmei.OperationTypeType;
import xmei.OperationsType;
import xmei.ParameterPropertiesType;
import xmei.ParameterType;
import xmei.PrimitiveTypesType;
import xmei.ProjectType;
import xmei.PropertiesType;
import xmei.STypeType;
import xmei.SourceAndTargetModelType;
import xmei.SourceAndTargetRoleType;
import xmei.SourceAndTargetType;
import xmei.SourceAndTargetTypeType;
import xmei.StereotypeAttributeType;
import xmei.StereotypeType;
import xmei.StyleexType;
import xmei.TagType;
import xmei.TypeBaseType;
import xmei.XMIType;
import xmei.XmeiFactory;
import xmei.XmeiPackage;
import xmei.XrefsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmeiPackageImpl extends EPackageImpl implements XmeiPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeContainmentTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeModelTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributePropertiesTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributesTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass boundsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass codeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass concreteLinkTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass connectorAppearanceTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass connectorLabelsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass connectorModelTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass connectorModifiersTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass connectorPropertiesTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass connectorsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass connectorTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass diagramElementsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass diagramElementTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass diagramModelTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass diagramPropertiesTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass diagramsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass diagramTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass elementsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass elementTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass extendedPropertiesTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass extensionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass initialTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass linksTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass modelTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass operationParametersTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass operationPropertiesTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass operationsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass operationTagsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass operationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass operationTypeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass parameterPropertiesTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass parameterTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass primitiveTypesTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass projectTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertiesTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sourceAndTargetModelTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sourceAndTargetRoleTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sourceAndTargetTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sourceAndTargetTypeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stereotypeAttributeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass styleexTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tagTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentRootEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass xmiTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass xrefsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum asyncSyncTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum diagramTypeTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum directionTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum eaTypesTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum stereotypeTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum sTypeTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum typeBaseTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType asyncSyncTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType diagramTypeTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType directionTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType eaTypesTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType idTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType stereotypeTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType sTypeTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType typeBaseTypeObjectEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see xmei.XmeiPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private XmeiPackageImpl()
    {
        super(eNS_URI, XmeiFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link XmeiPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static XmeiPackage init()
    {
        if (isInited) return (XmeiPackage)EPackage.Registry.INSTANCE.getEPackage(XmeiPackage.eNS_URI);

        // Obtain or create and register package
        XmeiPackageImpl theXmeiPackage = (XmeiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XmeiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XmeiPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        XMLTypePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        UmlPackageImpl theUmlPackage = (UmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI) instanceof UmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI) : UmlPackage.eINSTANCE);

        // Create package meta-data objects
        theXmeiPackage.createPackageContents();
        theUmlPackage.createPackageContents();

        // Initialize created meta-data
        theXmeiPackage.initializePackageContents();
        theUmlPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theXmeiPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(XmeiPackage.eNS_URI, theXmeiPackage);
        return theXmeiPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeContainmentType()
    {
        return attributeContainmentTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeContainmentType_Containment()
    {
        return (EAttribute)attributeContainmentTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeContainmentType_Position()
    {
        return (EAttribute)attributeContainmentTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeModelType()
    {
        return attributeModelTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeModelType_EaGuid()
    {
        return (EAttribute)attributeModelTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeModelType_EaLocalid()
    {
        return (EAttribute)attributeModelTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributePropertiesType()
    {
        return attributePropertiesTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributePropertiesType_Type()
    {
        return (EAttribute)attributePropertiesTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributesType()
    {
        return attributesTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributesType_Attribute()
    {
        return (EReference)attributesTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeType()
    {
        return attributeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeType_Initial()
    {
        return (EReference)attributeTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeType_Documentation()
    {
        return (EReference)attributeTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeType_Model()
    {
        return (EReference)attributeTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeType_Properties()
    {
        return (EReference)attributeTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeType_Containment()
    {
        return (EReference)attributeTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeType_Stereotype()
    {
        return (EReference)attributeTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeType_Bounds()
    {
        return (EReference)attributeTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeType_Styleex()
    {
        return (EReference)attributeTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeType_Xrefs()
    {
        return (EReference)attributeTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeType_Idref()
    {
        return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeType_Name()
    {
        return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeType_Scope()
    {
        return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBoundsType()
    {
        return boundsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBoundsType_Lower()
    {
        return (EAttribute)boundsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBoundsType_Upper()
    {
        return (EAttribute)boundsTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCodeType()
    {
        return codeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCodeType_Gentype()
    {
        return (EAttribute)codeTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConcreteLinkType()
    {
        return concreteLinkTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConcreteLinkType_End()
    {
        return (EAttribute)concreteLinkTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConcreteLinkType_Id()
    {
        return (EAttribute)concreteLinkTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConcreteLinkType_Start()
    {
        return (EAttribute)concreteLinkTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConnectorAppearanceType()
    {
        return connectorAppearanceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorAppearanceType_HeadStyle()
    {
        return (EAttribute)connectorAppearanceTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorAppearanceType_Linecolor()
    {
        return (EAttribute)connectorAppearanceTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorAppearanceType_Linemode()
    {
        return (EAttribute)connectorAppearanceTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorAppearanceType_LineStyle()
    {
        return (EAttribute)connectorAppearanceTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorAppearanceType_Linewidth()
    {
        return (EAttribute)connectorAppearanceTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorAppearanceType_Seqno()
    {
        return (EAttribute)connectorAppearanceTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConnectorLabelsType()
    {
        return connectorLabelsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorLabelsType_Lb()
    {
        return (EAttribute)connectorLabelsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorLabelsType_Mb()
    {
        return (EAttribute)connectorLabelsTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorLabelsType_Mt()
    {
        return (EAttribute)connectorLabelsTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConnectorModelType()
    {
        return connectorModelTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorModelType_EaLocalid()
    {
        return (EAttribute)connectorModelTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConnectorModifiersType()
    {
        return connectorModifiersTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorModifiersType_Changeable()
    {
        return (EAttribute)connectorModifiersTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorModifiersType_IsLeaf()
    {
        return (EAttribute)connectorModifiersTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorModifiersType_IsNavigable()
    {
        return (EAttribute)connectorModifiersTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorModifiersType_IsOrdered()
    {
        return (EAttribute)connectorModifiersTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorModifiersType_IsRoot()
    {
        return (EAttribute)connectorModifiersTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConnectorPropertiesType()
    {
        return connectorPropertiesTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorPropertiesType_Direction()
    {
        return (EAttribute)connectorPropertiesTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorPropertiesType_EaType()
    {
        return (EAttribute)connectorPropertiesTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorPropertiesType_Name()
    {
        return (EAttribute)connectorPropertiesTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorPropertiesType_Stereotype()
    {
        return (EAttribute)connectorPropertiesTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConnectorsType()
    {
        return connectorsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnectorsType_Connector()
    {
        return (EReference)connectorsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConnectorType()
    {
        return connectorTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnectorType_Source()
    {
        return (EReference)connectorTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnectorType_Target()
    {
        return (EReference)connectorTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnectorType_Model()
    {
        return (EReference)connectorTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnectorType_Properties()
    {
        return (EReference)connectorTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnectorType_Modifiers()
    {
        return (EReference)connectorTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnectorType_Documentation()
    {
        return (EReference)connectorTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnectorType_Appearance()
    {
        return (EReference)connectorTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnectorType_Labels()
    {
        return (EReference)connectorTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnectorType_ExtendedProperties()
    {
        return (EReference)connectorTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnectorType_Style()
    {
        return (EReference)connectorTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnectorType_Xrefs()
    {
        return (EReference)connectorTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConnectorType_Tags()
    {
        return (EReference)connectorTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConnectorType_Idref()
    {
        return (EAttribute)connectorTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDiagramElementsType()
    {
        return diagramElementsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagramElementsType_Element()
    {
        return (EReference)diagramElementsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDiagramElementType()
    {
        return diagramElementTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagramElementType_Geometry()
    {
        return (EAttribute)diagramElementTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagramElementType_Seqno()
    {
        return (EAttribute)diagramElementTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagramElementType_Style()
    {
        return (EAttribute)diagramElementTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagramElementType_Subject()
    {
        return (EAttribute)diagramElementTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDiagramModelType()
    {
        return diagramModelTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagramModelType_LocalID()
    {
        return (EAttribute)diagramModelTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagramModelType_Owner()
    {
        return (EAttribute)diagramModelTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagramModelType_Package()
    {
        return (EAttribute)diagramModelTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagramModelType_Parent()
    {
        return (EAttribute)diagramModelTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDiagramPropertiesType()
    {
        return diagramPropertiesTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagramPropertiesType_Name()
    {
        return (EAttribute)diagramPropertiesTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagramPropertiesType_Type()
    {
        return (EAttribute)diagramPropertiesTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDiagramsType()
    {
        return diagramsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagramsType_Diagram()
    {
        return (EReference)diagramsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDiagramType()
    {
        return diagramTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagramType_Model()
    {
        return (EReference)diagramTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagramType_Properties()
    {
        return (EReference)diagramTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagramType_Project()
    {
        return (EReference)diagramTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagramType_Style1()
    {
        return (EReference)diagramTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagramType_Style2()
    {
        return (EReference)diagramTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagramType_Swimlanes()
    {
        return (EReference)diagramTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagramType_Matrixitems()
    {
        return (EReference)diagramTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDiagramType_Elements()
    {
        return (EReference)diagramTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDiagramType_Id()
    {
        return (EAttribute)diagramTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentation()
    {
        return documentationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentation_Exporter()
    {
        return (EAttribute)documentationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentation_ExporterVersion()
    {
        return (EAttribute)documentationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentationType()
    {
        return documentationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentationType_Value()
    {
        return (EAttribute)documentationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getElementsType()
    {
        return elementsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElementsType_Element()
    {
        return (EReference)elementsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getElementType()
    {
        return elementTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElementType_Model()
    {
        return (EReference)elementTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElementType_Properties()
    {
        return (EReference)elementTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElementType_Project()
    {
        return (EReference)elementTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElementType_Code()
    {
        return (EReference)elementTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElementType_Links()
    {
        return (EReference)elementTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElementType_Attributes()
    {
        return (EReference)elementTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElementType_Operations()
    {
        return (EReference)elementTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElementType_Idref()
    {
        return (EAttribute)elementTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElementType_Name()
    {
        return (EAttribute)elementTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElementType_Scope()
    {
        return (EAttribute)elementTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElementType_Type()
    {
        return (EAttribute)elementTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExtendedPropertiesType()
    {
        return extendedPropertiesTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtendedPropertiesType_Conditional()
    {
        return (EAttribute)extendedPropertiesTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtendedPropertiesType_Diagram()
    {
        return (EAttribute)extendedPropertiesTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtendedPropertiesType_Privatedata1()
    {
        return (EAttribute)extendedPropertiesTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtendedPropertiesType_Privatedata2()
    {
        return (EAttribute)extendedPropertiesTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtendedPropertiesType_Privatedata3()
    {
        return (EAttribute)extendedPropertiesTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtendedPropertiesType_Privatedata4()
    {
        return (EAttribute)extendedPropertiesTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtendedPropertiesType_Privatedata5()
    {
        return (EAttribute)extendedPropertiesTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtendedPropertiesType_SequencePoints()
    {
        return (EAttribute)extendedPropertiesTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtendedPropertiesType_Stateflags()
    {
        return (EAttribute)extendedPropertiesTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtendedPropertiesType_VirtualInheritance()
    {
        return (EAttribute)extendedPropertiesTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExtension()
    {
        return extensionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtension_Elements()
    {
        return (EReference)extensionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtension_Connectors()
    {
        return (EReference)extensionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtension_Primitivetypes()
    {
        return (EReference)extensionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtension_Profiles()
    {
        return (EAttribute)extensionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtension_Diagrams()
    {
        return (EReference)extensionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtension_Extender()
    {
        return (EAttribute)extensionEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtension_ExtenderID()
    {
        return (EAttribute)extensionEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInitialType()
    {
        return initialTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInitialType_Body()
    {
        return (EAttribute)initialTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLinksType()
    {
        return linksTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLinksType_Sequence()
    {
        return (EReference)linksTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLinksType_Realisation()
    {
        return (EReference)linksTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLinksType_Generalization()
    {
        return (EReference)linksTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLinksType_Dependency()
    {
        return (EReference)linksTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLinksType_Association()
    {
        return (EReference)linksTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getModelType()
    {
        return modelTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModelType_EaEleType()
    {
        return (EAttribute)modelTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModelType_EaLocalid()
    {
        return (EAttribute)modelTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModelType_Owner()
    {
        return (EAttribute)modelTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModelType_Package()
    {
        return (EAttribute)modelTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModelType_Package2()
    {
        return (EAttribute)modelTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModelType_Tpos()
    {
        return (EAttribute)modelTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOperationParametersType()
    {
        return operationParametersTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperationParametersType_Parameter()
    {
        return (EReference)operationParametersTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOperationPropertiesType()
    {
        return operationPropertiesTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperationPropertiesType_Position()
    {
        return (EAttribute)operationPropertiesTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOperationsType()
    {
        return operationsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperationsType_Operation()
    {
        return (EReference)operationsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOperationTagsType()
    {
        return operationTagsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperationTagsType_Tag()
    {
        return (EReference)operationTagsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOperationType()
    {
        return operationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperationType_Properties()
    {
        return (EReference)operationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperationType_Stereotype()
    {
        return (EReference)operationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperationType_Model()
    {
        return (EReference)operationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperationType_Type()
    {
        return (EReference)operationTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperationType_Documentation()
    {
        return (EReference)operationTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperationType_Tags()
    {
        return (EReference)operationTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperationType_Parameters()
    {
        return (EReference)operationTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperationType_Xrefs()
    {
        return (EReference)operationTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperationType_Idref()
    {
        return (EAttribute)operationTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperationType_Name()
    {
        return (EAttribute)operationTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperationType_Scope()
    {
        return (EAttribute)operationTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOperationTypeType()
    {
        return operationTypeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperationTypeType_Concurrency()
    {
        return (EAttribute)operationTypeTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperationTypeType_Const()
    {
        return (EAttribute)operationTypeTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperationTypeType_IsAbstract()
    {
        return (EAttribute)operationTypeTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperationTypeType_IsQuery()
    {
        return (EAttribute)operationTypeTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperationTypeType_Pure()
    {
        return (EAttribute)operationTypeTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperationTypeType_Returnarray()
    {
        return (EAttribute)operationTypeTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperationTypeType_Static()
    {
        return (EAttribute)operationTypeTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperationTypeType_Stereotype()
    {
        return (EAttribute)operationTypeTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperationTypeType_Synchronised()
    {
        return (EAttribute)operationTypeTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getParameterPropertiesType()
    {
        return parameterPropertiesTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameterPropertiesType_Classifier()
    {
        return (EAttribute)parameterPropertiesTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameterPropertiesType_Const()
    {
        return (EAttribute)parameterPropertiesTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameterPropertiesType_EaGuid()
    {
        return (EAttribute)parameterPropertiesTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameterPropertiesType_Pos()
    {
        return (EAttribute)parameterPropertiesTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameterPropertiesType_Type()
    {
        return (EAttribute)parameterPropertiesTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getParameterType()
    {
        return parameterTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_Properties()
    {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_Documentation()
    {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_Value()
    {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getParameterType_Xrefs()
    {
        return (EReference)parameterTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameterType_Idref()
    {
        return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameterType_Visibility()
    {
        return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPrimitiveTypesType()
    {
        return primitiveTypesTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPrimitiveTypesType_PackagedElement()
    {
        return (EReference)primitiveTypesTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProjectType()
    {
        return projectTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProjectType_Author()
    {
        return (EAttribute)projectTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProjectType_Created()
    {
        return (EAttribute)projectTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProjectType_Modified()
    {
        return (EAttribute)projectTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProjectType_Phase()
    {
        return (EAttribute)projectTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProjectType_Version()
    {
        return (EAttribute)projectTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPropertiesType()
    {
        return propertiesTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertiesType_ClassName()
    {
        return (EAttribute)propertiesTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertiesType_Documentation()
    {
        return (EAttribute)propertiesTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertiesType_Genlinks()
    {
        return (EAttribute)propertiesTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertiesType_IsAbstract()
    {
        return (EAttribute)propertiesTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertiesType_IsActive()
    {
        return (EAttribute)propertiesTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertiesType_IsLeaf()
    {
        return (EAttribute)propertiesTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertiesType_IsRoot()
    {
        return (EAttribute)propertiesTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertiesType_IsSpecification()
    {
        return (EAttribute)propertiesTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertiesType_Scope()
    {
        return (EAttribute)propertiesTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertiesType_Stereotype()
    {
        return (EAttribute)propertiesTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertiesType_SType()
    {
        return (EAttribute)propertiesTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSourceAndTargetModelType()
    {
        return sourceAndTargetModelTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSourceAndTargetModelType_EaLocalid()
    {
        return (EAttribute)sourceAndTargetModelTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSourceAndTargetModelType_Name()
    {
        return (EAttribute)sourceAndTargetModelTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSourceAndTargetModelType_Type()
    {
        return (EAttribute)sourceAndTargetModelTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSourceAndTargetRoleType()
    {
        return sourceAndTargetRoleTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSourceAndTargetRoleType_TargetScope()
    {
        return (EAttribute)sourceAndTargetRoleTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSourceAndTargetRoleType_Visibility()
    {
        return (EAttribute)sourceAndTargetRoleTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSourceAndTargetType()
    {
        return sourceAndTargetTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSourceAndTargetType_Model()
    {
        return (EReference)sourceAndTargetTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSourceAndTargetType_Role()
    {
        return (EReference)sourceAndTargetTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSourceAndTargetType_Type()
    {
        return (EReference)sourceAndTargetTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSourceAndTargetType_Modifiers()
    {
        return (EReference)sourceAndTargetTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSourceAndTargetType_Style()
    {
        return (EReference)sourceAndTargetTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSourceAndTargetType_Documentation()
    {
        return (EReference)sourceAndTargetTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSourceAndTargetType_Xrefs()
    {
        return (EReference)sourceAndTargetTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSourceAndTargetType_Tags()
    {
        return (EReference)sourceAndTargetTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSourceAndTargetType_Idref()
    {
        return (EAttribute)sourceAndTargetTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSourceAndTargetTypeType()
    {
        return sourceAndTargetTypeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSourceAndTargetTypeType_Aggregation()
    {
        return (EAttribute)sourceAndTargetTypeTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSourceAndTargetTypeType_Containment()
    {
        return (EAttribute)sourceAndTargetTypeTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSourceAndTargetTypeType_Multiplicity()
    {
        return (EAttribute)sourceAndTargetTypeTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStereotypeAttributeType()
    {
        return stereotypeAttributeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStereotypeAttributeType_Stereotype()
    {
        return (EAttribute)stereotypeAttributeTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStyleexType()
    {
        return styleexTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStyleexType_Value()
    {
        return (EAttribute)styleexTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTagType()
    {
        return tagTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTagType_Id()
    {
        return (EAttribute)tagTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTagType_Name()
    {
        return (EAttribute)tagTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTagType_Notes()
    {
        return (EAttribute)tagTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTagType_Value()
    {
        return (EAttribute)tagTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentRoot()
    {
        return documentRootEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Mixed()
    {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XMLNSPrefixMap()
    {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XSISchemaLocation()
    {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XMI()
    {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Id()
    {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Idref()
    {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Type()
    {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Version()
    {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getXMIType()
    {
        return xmiTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getXMIType_Documentation()
    {
        return (EReference)xmiTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getXMIType_Model()
    {
        return (EReference)xmiTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getXMIType_Extension()
    {
        return (EReference)xmiTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXMIType_Version()
    {
        return (EAttribute)xmiTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getXrefsType()
    {
        return xrefsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXrefsType_Value()
    {
        return (EAttribute)xrefsTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAsyncSyncType()
    {
        return asyncSyncTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDiagramTypeType()
    {
        return diagramTypeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDirectionType()
    {
        return directionTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getEaTypesType()
    {
        return eaTypesTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getStereotypeType()
    {
        return stereotypeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSTypeType()
    {
        return sTypeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTypeBaseType()
    {
        return typeBaseTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getAsyncSyncTypeObject()
    {
        return asyncSyncTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getDiagramTypeTypeObject()
    {
        return diagramTypeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getDirectionTypeObject()
    {
        return directionTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getEaTypesTypeObject()
    {
        return eaTypesTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getIdType()
    {
        return idTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getStereotypeTypeObject()
    {
        return stereotypeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSTypeTypeObject()
    {
        return sTypeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTypeBaseTypeObject()
    {
        return typeBaseTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XmeiFactory getXmeiFactory()
    {
        return (XmeiFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents()
    {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        attributeContainmentTypeEClass = createEClass(ATTRIBUTE_CONTAINMENT_TYPE);
        createEAttribute(attributeContainmentTypeEClass, ATTRIBUTE_CONTAINMENT_TYPE__CONTAINMENT);
        createEAttribute(attributeContainmentTypeEClass, ATTRIBUTE_CONTAINMENT_TYPE__POSITION);

        attributeModelTypeEClass = createEClass(ATTRIBUTE_MODEL_TYPE);
        createEAttribute(attributeModelTypeEClass, ATTRIBUTE_MODEL_TYPE__EA_GUID);
        createEAttribute(attributeModelTypeEClass, ATTRIBUTE_MODEL_TYPE__EA_LOCALID);

        attributePropertiesTypeEClass = createEClass(ATTRIBUTE_PROPERTIES_TYPE);
        createEAttribute(attributePropertiesTypeEClass, ATTRIBUTE_PROPERTIES_TYPE__TYPE);

        attributesTypeEClass = createEClass(ATTRIBUTES_TYPE);
        createEReference(attributesTypeEClass, ATTRIBUTES_TYPE__ATTRIBUTE);

        attributeTypeEClass = createEClass(ATTRIBUTE_TYPE);
        createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__INITIAL);
        createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__DOCUMENTATION);
        createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__MODEL);
        createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__PROPERTIES);
        createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__CONTAINMENT);
        createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__STEREOTYPE);
        createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__BOUNDS);
        createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__STYLEEX);
        createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__XREFS);
        createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__IDREF);
        createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__NAME);
        createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__SCOPE);

        boundsTypeEClass = createEClass(BOUNDS_TYPE);
        createEAttribute(boundsTypeEClass, BOUNDS_TYPE__LOWER);
        createEAttribute(boundsTypeEClass, BOUNDS_TYPE__UPPER);

        codeTypeEClass = createEClass(CODE_TYPE);
        createEAttribute(codeTypeEClass, CODE_TYPE__GENTYPE);

        concreteLinkTypeEClass = createEClass(CONCRETE_LINK_TYPE);
        createEAttribute(concreteLinkTypeEClass, CONCRETE_LINK_TYPE__END);
        createEAttribute(concreteLinkTypeEClass, CONCRETE_LINK_TYPE__ID);
        createEAttribute(concreteLinkTypeEClass, CONCRETE_LINK_TYPE__START);

        connectorAppearanceTypeEClass = createEClass(CONNECTOR_APPEARANCE_TYPE);
        createEAttribute(connectorAppearanceTypeEClass, CONNECTOR_APPEARANCE_TYPE__HEAD_STYLE);
        createEAttribute(connectorAppearanceTypeEClass, CONNECTOR_APPEARANCE_TYPE__LINECOLOR);
        createEAttribute(connectorAppearanceTypeEClass, CONNECTOR_APPEARANCE_TYPE__LINEMODE);
        createEAttribute(connectorAppearanceTypeEClass, CONNECTOR_APPEARANCE_TYPE__LINE_STYLE);
        createEAttribute(connectorAppearanceTypeEClass, CONNECTOR_APPEARANCE_TYPE__LINEWIDTH);
        createEAttribute(connectorAppearanceTypeEClass, CONNECTOR_APPEARANCE_TYPE__SEQNO);

        connectorLabelsTypeEClass = createEClass(CONNECTOR_LABELS_TYPE);
        createEAttribute(connectorLabelsTypeEClass, CONNECTOR_LABELS_TYPE__LB);
        createEAttribute(connectorLabelsTypeEClass, CONNECTOR_LABELS_TYPE__MB);
        createEAttribute(connectorLabelsTypeEClass, CONNECTOR_LABELS_TYPE__MT);

        connectorModelTypeEClass = createEClass(CONNECTOR_MODEL_TYPE);
        createEAttribute(connectorModelTypeEClass, CONNECTOR_MODEL_TYPE__EA_LOCALID);

        connectorModifiersTypeEClass = createEClass(CONNECTOR_MODIFIERS_TYPE);
        createEAttribute(connectorModifiersTypeEClass, CONNECTOR_MODIFIERS_TYPE__CHANGEABLE);
        createEAttribute(connectorModifiersTypeEClass, CONNECTOR_MODIFIERS_TYPE__IS_LEAF);
        createEAttribute(connectorModifiersTypeEClass, CONNECTOR_MODIFIERS_TYPE__IS_NAVIGABLE);
        createEAttribute(connectorModifiersTypeEClass, CONNECTOR_MODIFIERS_TYPE__IS_ORDERED);
        createEAttribute(connectorModifiersTypeEClass, CONNECTOR_MODIFIERS_TYPE__IS_ROOT);

        connectorPropertiesTypeEClass = createEClass(CONNECTOR_PROPERTIES_TYPE);
        createEAttribute(connectorPropertiesTypeEClass, CONNECTOR_PROPERTIES_TYPE__DIRECTION);
        createEAttribute(connectorPropertiesTypeEClass, CONNECTOR_PROPERTIES_TYPE__EA_TYPE);
        createEAttribute(connectorPropertiesTypeEClass, CONNECTOR_PROPERTIES_TYPE__NAME);
        createEAttribute(connectorPropertiesTypeEClass, CONNECTOR_PROPERTIES_TYPE__STEREOTYPE);

        connectorsTypeEClass = createEClass(CONNECTORS_TYPE);
        createEReference(connectorsTypeEClass, CONNECTORS_TYPE__CONNECTOR);

        connectorTypeEClass = createEClass(CONNECTOR_TYPE);
        createEReference(connectorTypeEClass, CONNECTOR_TYPE__SOURCE);
        createEReference(connectorTypeEClass, CONNECTOR_TYPE__TARGET);
        createEReference(connectorTypeEClass, CONNECTOR_TYPE__MODEL);
        createEReference(connectorTypeEClass, CONNECTOR_TYPE__PROPERTIES);
        createEReference(connectorTypeEClass, CONNECTOR_TYPE__MODIFIERS);
        createEReference(connectorTypeEClass, CONNECTOR_TYPE__DOCUMENTATION);
        createEReference(connectorTypeEClass, CONNECTOR_TYPE__APPEARANCE);
        createEReference(connectorTypeEClass, CONNECTOR_TYPE__LABELS);
        createEReference(connectorTypeEClass, CONNECTOR_TYPE__EXTENDED_PROPERTIES);
        createEReference(connectorTypeEClass, CONNECTOR_TYPE__STYLE);
        createEReference(connectorTypeEClass, CONNECTOR_TYPE__XREFS);
        createEReference(connectorTypeEClass, CONNECTOR_TYPE__TAGS);
        createEAttribute(connectorTypeEClass, CONNECTOR_TYPE__IDREF);

        diagramElementsTypeEClass = createEClass(DIAGRAM_ELEMENTS_TYPE);
        createEReference(diagramElementsTypeEClass, DIAGRAM_ELEMENTS_TYPE__ELEMENT);

        diagramElementTypeEClass = createEClass(DIAGRAM_ELEMENT_TYPE);
        createEAttribute(diagramElementTypeEClass, DIAGRAM_ELEMENT_TYPE__GEOMETRY);
        createEAttribute(diagramElementTypeEClass, DIAGRAM_ELEMENT_TYPE__SEQNO);
        createEAttribute(diagramElementTypeEClass, DIAGRAM_ELEMENT_TYPE__STYLE);
        createEAttribute(diagramElementTypeEClass, DIAGRAM_ELEMENT_TYPE__SUBJECT);

        diagramModelTypeEClass = createEClass(DIAGRAM_MODEL_TYPE);
        createEAttribute(diagramModelTypeEClass, DIAGRAM_MODEL_TYPE__LOCAL_ID);
        createEAttribute(diagramModelTypeEClass, DIAGRAM_MODEL_TYPE__OWNER);
        createEAttribute(diagramModelTypeEClass, DIAGRAM_MODEL_TYPE__PACKAGE);
        createEAttribute(diagramModelTypeEClass, DIAGRAM_MODEL_TYPE__PARENT);

        diagramPropertiesTypeEClass = createEClass(DIAGRAM_PROPERTIES_TYPE);
        createEAttribute(diagramPropertiesTypeEClass, DIAGRAM_PROPERTIES_TYPE__NAME);
        createEAttribute(diagramPropertiesTypeEClass, DIAGRAM_PROPERTIES_TYPE__TYPE);

        diagramsTypeEClass = createEClass(DIAGRAMS_TYPE);
        createEReference(diagramsTypeEClass, DIAGRAMS_TYPE__DIAGRAM);

        diagramTypeEClass = createEClass(DIAGRAM_TYPE);
        createEReference(diagramTypeEClass, DIAGRAM_TYPE__MODEL);
        createEReference(diagramTypeEClass, DIAGRAM_TYPE__PROPERTIES);
        createEReference(diagramTypeEClass, DIAGRAM_TYPE__PROJECT);
        createEReference(diagramTypeEClass, DIAGRAM_TYPE__STYLE1);
        createEReference(diagramTypeEClass, DIAGRAM_TYPE__STYLE2);
        createEReference(diagramTypeEClass, DIAGRAM_TYPE__SWIMLANES);
        createEReference(diagramTypeEClass, DIAGRAM_TYPE__MATRIXITEMS);
        createEReference(diagramTypeEClass, DIAGRAM_TYPE__ELEMENTS);
        createEAttribute(diagramTypeEClass, DIAGRAM_TYPE__ID);

        documentationEClass = createEClass(DOCUMENTATION);
        createEAttribute(documentationEClass, DOCUMENTATION__EXPORTER);
        createEAttribute(documentationEClass, DOCUMENTATION__EXPORTER_VERSION);

        documentationTypeEClass = createEClass(DOCUMENTATION_TYPE);
        createEAttribute(documentationTypeEClass, DOCUMENTATION_TYPE__VALUE);

        elementsTypeEClass = createEClass(ELEMENTS_TYPE);
        createEReference(elementsTypeEClass, ELEMENTS_TYPE__ELEMENT);

        elementTypeEClass = createEClass(ELEMENT_TYPE);
        createEReference(elementTypeEClass, ELEMENT_TYPE__MODEL);
        createEReference(elementTypeEClass, ELEMENT_TYPE__PROPERTIES);
        createEReference(elementTypeEClass, ELEMENT_TYPE__PROJECT);
        createEReference(elementTypeEClass, ELEMENT_TYPE__CODE);
        createEReference(elementTypeEClass, ELEMENT_TYPE__LINKS);
        createEReference(elementTypeEClass, ELEMENT_TYPE__ATTRIBUTES);
        createEReference(elementTypeEClass, ELEMENT_TYPE__OPERATIONS);
        createEAttribute(elementTypeEClass, ELEMENT_TYPE__IDREF);
        createEAttribute(elementTypeEClass, ELEMENT_TYPE__NAME);
        createEAttribute(elementTypeEClass, ELEMENT_TYPE__SCOPE);
        createEAttribute(elementTypeEClass, ELEMENT_TYPE__TYPE);

        extendedPropertiesTypeEClass = createEClass(EXTENDED_PROPERTIES_TYPE);
        createEAttribute(extendedPropertiesTypeEClass, EXTENDED_PROPERTIES_TYPE__CONDITIONAL);
        createEAttribute(extendedPropertiesTypeEClass, EXTENDED_PROPERTIES_TYPE__DIAGRAM);
        createEAttribute(extendedPropertiesTypeEClass, EXTENDED_PROPERTIES_TYPE__PRIVATEDATA1);
        createEAttribute(extendedPropertiesTypeEClass, EXTENDED_PROPERTIES_TYPE__PRIVATEDATA2);
        createEAttribute(extendedPropertiesTypeEClass, EXTENDED_PROPERTIES_TYPE__PRIVATEDATA3);
        createEAttribute(extendedPropertiesTypeEClass, EXTENDED_PROPERTIES_TYPE__PRIVATEDATA4);
        createEAttribute(extendedPropertiesTypeEClass, EXTENDED_PROPERTIES_TYPE__PRIVATEDATA5);
        createEAttribute(extendedPropertiesTypeEClass, EXTENDED_PROPERTIES_TYPE__SEQUENCE_POINTS);
        createEAttribute(extendedPropertiesTypeEClass, EXTENDED_PROPERTIES_TYPE__STATEFLAGS);
        createEAttribute(extendedPropertiesTypeEClass, EXTENDED_PROPERTIES_TYPE__VIRTUAL_INHERITANCE);

        extensionEClass = createEClass(EXTENSION);
        createEReference(extensionEClass, EXTENSION__ELEMENTS);
        createEReference(extensionEClass, EXTENSION__CONNECTORS);
        createEReference(extensionEClass, EXTENSION__PRIMITIVETYPES);
        createEAttribute(extensionEClass, EXTENSION__PROFILES);
        createEReference(extensionEClass, EXTENSION__DIAGRAMS);
        createEAttribute(extensionEClass, EXTENSION__EXTENDER);
        createEAttribute(extensionEClass, EXTENSION__EXTENDER_ID);

        initialTypeEClass = createEClass(INITIAL_TYPE);
        createEAttribute(initialTypeEClass, INITIAL_TYPE__BODY);

        linksTypeEClass = createEClass(LINKS_TYPE);
        createEReference(linksTypeEClass, LINKS_TYPE__SEQUENCE);
        createEReference(linksTypeEClass, LINKS_TYPE__REALISATION);
        createEReference(linksTypeEClass, LINKS_TYPE__GENERALIZATION);
        createEReference(linksTypeEClass, LINKS_TYPE__DEPENDENCY);
        createEReference(linksTypeEClass, LINKS_TYPE__ASSOCIATION);

        modelTypeEClass = createEClass(MODEL_TYPE);
        createEAttribute(modelTypeEClass, MODEL_TYPE__EA_ELE_TYPE);
        createEAttribute(modelTypeEClass, MODEL_TYPE__EA_LOCALID);
        createEAttribute(modelTypeEClass, MODEL_TYPE__OWNER);
        createEAttribute(modelTypeEClass, MODEL_TYPE__PACKAGE);
        createEAttribute(modelTypeEClass, MODEL_TYPE__PACKAGE2);
        createEAttribute(modelTypeEClass, MODEL_TYPE__TPOS);

        operationParametersTypeEClass = createEClass(OPERATION_PARAMETERS_TYPE);
        createEReference(operationParametersTypeEClass, OPERATION_PARAMETERS_TYPE__PARAMETER);

        operationPropertiesTypeEClass = createEClass(OPERATION_PROPERTIES_TYPE);
        createEAttribute(operationPropertiesTypeEClass, OPERATION_PROPERTIES_TYPE__POSITION);

        operationsTypeEClass = createEClass(OPERATIONS_TYPE);
        createEReference(operationsTypeEClass, OPERATIONS_TYPE__OPERATION);

        operationTagsTypeEClass = createEClass(OPERATION_TAGS_TYPE);
        createEReference(operationTagsTypeEClass, OPERATION_TAGS_TYPE__TAG);

        operationTypeEClass = createEClass(OPERATION_TYPE);
        createEReference(operationTypeEClass, OPERATION_TYPE__PROPERTIES);
        createEReference(operationTypeEClass, OPERATION_TYPE__STEREOTYPE);
        createEReference(operationTypeEClass, OPERATION_TYPE__MODEL);
        createEReference(operationTypeEClass, OPERATION_TYPE__TYPE);
        createEReference(operationTypeEClass, OPERATION_TYPE__DOCUMENTATION);
        createEReference(operationTypeEClass, OPERATION_TYPE__TAGS);
        createEReference(operationTypeEClass, OPERATION_TYPE__PARAMETERS);
        createEReference(operationTypeEClass, OPERATION_TYPE__XREFS);
        createEAttribute(operationTypeEClass, OPERATION_TYPE__IDREF);
        createEAttribute(operationTypeEClass, OPERATION_TYPE__NAME);
        createEAttribute(operationTypeEClass, OPERATION_TYPE__SCOPE);

        operationTypeTypeEClass = createEClass(OPERATION_TYPE_TYPE);
        createEAttribute(operationTypeTypeEClass, OPERATION_TYPE_TYPE__CONCURRENCY);
        createEAttribute(operationTypeTypeEClass, OPERATION_TYPE_TYPE__CONST);
        createEAttribute(operationTypeTypeEClass, OPERATION_TYPE_TYPE__IS_ABSTRACT);
        createEAttribute(operationTypeTypeEClass, OPERATION_TYPE_TYPE__IS_QUERY);
        createEAttribute(operationTypeTypeEClass, OPERATION_TYPE_TYPE__PURE);
        createEAttribute(operationTypeTypeEClass, OPERATION_TYPE_TYPE__RETURNARRAY);
        createEAttribute(operationTypeTypeEClass, OPERATION_TYPE_TYPE__STATIC);
        createEAttribute(operationTypeTypeEClass, OPERATION_TYPE_TYPE__STEREOTYPE);
        createEAttribute(operationTypeTypeEClass, OPERATION_TYPE_TYPE__SYNCHRONISED);

        parameterPropertiesTypeEClass = createEClass(PARAMETER_PROPERTIES_TYPE);
        createEAttribute(parameterPropertiesTypeEClass, PARAMETER_PROPERTIES_TYPE__CLASSIFIER);
        createEAttribute(parameterPropertiesTypeEClass, PARAMETER_PROPERTIES_TYPE__CONST);
        createEAttribute(parameterPropertiesTypeEClass, PARAMETER_PROPERTIES_TYPE__EA_GUID);
        createEAttribute(parameterPropertiesTypeEClass, PARAMETER_PROPERTIES_TYPE__POS);
        createEAttribute(parameterPropertiesTypeEClass, PARAMETER_PROPERTIES_TYPE__TYPE);

        parameterTypeEClass = createEClass(PARAMETER_TYPE);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__PROPERTIES);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__DOCUMENTATION);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__VALUE);
        createEReference(parameterTypeEClass, PARAMETER_TYPE__XREFS);
        createEAttribute(parameterTypeEClass, PARAMETER_TYPE__IDREF);
        createEAttribute(parameterTypeEClass, PARAMETER_TYPE__VISIBILITY);

        primitiveTypesTypeEClass = createEClass(PRIMITIVE_TYPES_TYPE);
        createEReference(primitiveTypesTypeEClass, PRIMITIVE_TYPES_TYPE__PACKAGED_ELEMENT);

        projectTypeEClass = createEClass(PROJECT_TYPE);
        createEAttribute(projectTypeEClass, PROJECT_TYPE__AUTHOR);
        createEAttribute(projectTypeEClass, PROJECT_TYPE__CREATED);
        createEAttribute(projectTypeEClass, PROJECT_TYPE__MODIFIED);
        createEAttribute(projectTypeEClass, PROJECT_TYPE__PHASE);
        createEAttribute(projectTypeEClass, PROJECT_TYPE__VERSION);

        propertiesTypeEClass = createEClass(PROPERTIES_TYPE);
        createEAttribute(propertiesTypeEClass, PROPERTIES_TYPE__CLASS_NAME);
        createEAttribute(propertiesTypeEClass, PROPERTIES_TYPE__DOCUMENTATION);
        createEAttribute(propertiesTypeEClass, PROPERTIES_TYPE__GENLINKS);
        createEAttribute(propertiesTypeEClass, PROPERTIES_TYPE__IS_ABSTRACT);
        createEAttribute(propertiesTypeEClass, PROPERTIES_TYPE__IS_ACTIVE);
        createEAttribute(propertiesTypeEClass, PROPERTIES_TYPE__IS_LEAF);
        createEAttribute(propertiesTypeEClass, PROPERTIES_TYPE__IS_ROOT);
        createEAttribute(propertiesTypeEClass, PROPERTIES_TYPE__IS_SPECIFICATION);
        createEAttribute(propertiesTypeEClass, PROPERTIES_TYPE__SCOPE);
        createEAttribute(propertiesTypeEClass, PROPERTIES_TYPE__STEREOTYPE);
        createEAttribute(propertiesTypeEClass, PROPERTIES_TYPE__STYPE);

        sourceAndTargetModelTypeEClass = createEClass(SOURCE_AND_TARGET_MODEL_TYPE);
        createEAttribute(sourceAndTargetModelTypeEClass, SOURCE_AND_TARGET_MODEL_TYPE__EA_LOCALID);
        createEAttribute(sourceAndTargetModelTypeEClass, SOURCE_AND_TARGET_MODEL_TYPE__NAME);
        createEAttribute(sourceAndTargetModelTypeEClass, SOURCE_AND_TARGET_MODEL_TYPE__TYPE);

        sourceAndTargetRoleTypeEClass = createEClass(SOURCE_AND_TARGET_ROLE_TYPE);
        createEAttribute(sourceAndTargetRoleTypeEClass, SOURCE_AND_TARGET_ROLE_TYPE__TARGET_SCOPE);
        createEAttribute(sourceAndTargetRoleTypeEClass, SOURCE_AND_TARGET_ROLE_TYPE__VISIBILITY);

        sourceAndTargetTypeEClass = createEClass(SOURCE_AND_TARGET_TYPE);
        createEReference(sourceAndTargetTypeEClass, SOURCE_AND_TARGET_TYPE__MODEL);
        createEReference(sourceAndTargetTypeEClass, SOURCE_AND_TARGET_TYPE__ROLE);
        createEReference(sourceAndTargetTypeEClass, SOURCE_AND_TARGET_TYPE__TYPE);
        createEReference(sourceAndTargetTypeEClass, SOURCE_AND_TARGET_TYPE__MODIFIERS);
        createEReference(sourceAndTargetTypeEClass, SOURCE_AND_TARGET_TYPE__STYLE);
        createEReference(sourceAndTargetTypeEClass, SOURCE_AND_TARGET_TYPE__DOCUMENTATION);
        createEReference(sourceAndTargetTypeEClass, SOURCE_AND_TARGET_TYPE__XREFS);
        createEReference(sourceAndTargetTypeEClass, SOURCE_AND_TARGET_TYPE__TAGS);
        createEAttribute(sourceAndTargetTypeEClass, SOURCE_AND_TARGET_TYPE__IDREF);

        sourceAndTargetTypeTypeEClass = createEClass(SOURCE_AND_TARGET_TYPE_TYPE);
        createEAttribute(sourceAndTargetTypeTypeEClass, SOURCE_AND_TARGET_TYPE_TYPE__AGGREGATION);
        createEAttribute(sourceAndTargetTypeTypeEClass, SOURCE_AND_TARGET_TYPE_TYPE__CONTAINMENT);
        createEAttribute(sourceAndTargetTypeTypeEClass, SOURCE_AND_TARGET_TYPE_TYPE__MULTIPLICITY);

        stereotypeAttributeTypeEClass = createEClass(STEREOTYPE_ATTRIBUTE_TYPE);
        createEAttribute(stereotypeAttributeTypeEClass, STEREOTYPE_ATTRIBUTE_TYPE__STEREOTYPE);

        styleexTypeEClass = createEClass(STYLEEX_TYPE);
        createEAttribute(styleexTypeEClass, STYLEEX_TYPE__VALUE);

        tagTypeEClass = createEClass(TAG_TYPE);
        createEAttribute(tagTypeEClass, TAG_TYPE__ID);
        createEAttribute(tagTypeEClass, TAG_TYPE__NAME);
        createEAttribute(tagTypeEClass, TAG_TYPE__NOTES);
        createEAttribute(tagTypeEClass, TAG_TYPE__VALUE);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMI);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__ID);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__IDREF);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__TYPE);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__VERSION);

        xmiTypeEClass = createEClass(XMI_TYPE);
        createEReference(xmiTypeEClass, XMI_TYPE__DOCUMENTATION);
        createEReference(xmiTypeEClass, XMI_TYPE__MODEL);
        createEReference(xmiTypeEClass, XMI_TYPE__EXTENSION);
        createEAttribute(xmiTypeEClass, XMI_TYPE__VERSION);

        xrefsTypeEClass = createEClass(XREFS_TYPE);
        createEAttribute(xrefsTypeEClass, XREFS_TYPE__VALUE);

        // Create enums
        asyncSyncTypeEEnum = createEEnum(ASYNC_SYNC_TYPE);
        diagramTypeTypeEEnum = createEEnum(DIAGRAM_TYPE_TYPE);
        directionTypeEEnum = createEEnum(DIRECTION_TYPE);
        eaTypesTypeEEnum = createEEnum(EA_TYPES_TYPE);
        stereotypeTypeEEnum = createEEnum(STEREOTYPE_TYPE);
        sTypeTypeEEnum = createEEnum(STYPE_TYPE);
        typeBaseTypeEEnum = createEEnum(TYPE_BASE_TYPE);

        // Create data types
        asyncSyncTypeObjectEDataType = createEDataType(ASYNC_SYNC_TYPE_OBJECT);
        diagramTypeTypeObjectEDataType = createEDataType(DIAGRAM_TYPE_TYPE_OBJECT);
        directionTypeObjectEDataType = createEDataType(DIRECTION_TYPE_OBJECT);
        eaTypesTypeObjectEDataType = createEDataType(EA_TYPES_TYPE_OBJECT);
        idTypeEDataType = createEDataType(ID_TYPE);
        stereotypeTypeObjectEDataType = createEDataType(STEREOTYPE_TYPE_OBJECT);
        sTypeTypeObjectEDataType = createEDataType(STYPE_TYPE_OBJECT);
        typeBaseTypeObjectEDataType = createEDataType(TYPE_BASE_TYPE_OBJECT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents()
    {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
        UmlPackage theUmlPackage = (UmlPackage)EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes, features, and operations; add parameters
        initEClass(attributeContainmentTypeEClass, AttributeContainmentType.class, "AttributeContainmentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAttributeContainmentType_Containment(), theXMLTypePackage.getString(), "containment", null, 1, 1, AttributeContainmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttributeContainmentType_Position(), theXMLTypePackage.getInt(), "position", null, 1, 1, AttributeContainmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributeModelTypeEClass, AttributeModelType.class, "AttributeModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAttributeModelType_EaGuid(), theXMLTypePackage.getString(), "eaGuid", null, 1, 1, AttributeModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttributeModelType_EaLocalid(), theXMLTypePackage.getInt(), "eaLocalid", null, 1, 1, AttributeModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributePropertiesTypeEClass, AttributePropertiesType.class, "AttributePropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAttributePropertiesType_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, AttributePropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributesTypeEClass, AttributesType.class, "AttributesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAttributesType_Attribute(), this.getAttributeType(), null, "attribute", null, 0, -1, AttributesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributeTypeEClass, AttributeType.class, "AttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAttributeType_Initial(), this.getInitialType(), null, "initial", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAttributeType_Documentation(), this.getDocumentationType(), null, "documentation", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAttributeType_Model(), this.getAttributeModelType(), null, "model", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAttributeType_Properties(), this.getAttributePropertiesType(), null, "properties", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAttributeType_Containment(), this.getAttributeContainmentType(), null, "containment", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAttributeType_Stereotype(), this.getStereotypeAttributeType(), null, "stereotype", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAttributeType_Bounds(), this.getBoundsType(), null, "bounds", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAttributeType_Styleex(), this.getStyleexType(), null, "styleex", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAttributeType_Xrefs(), this.getXrefsType(), null, "xrefs", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttributeType_Idref(), this.getIdType(), "idref", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttributeType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttributeType_Scope(), theUmlPackage.getVisibilityType(), "scope", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(boundsTypeEClass, BoundsType.class, "BoundsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBoundsType_Lower(), theXMLTypePackage.getInt(), "lower", null, 1, 1, BoundsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBoundsType_Upper(), theXMLTypePackage.getString(), "upper", null, 1, 1, BoundsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(codeTypeEClass, CodeType.class, "CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCodeType_Gentype(), theXMLTypePackage.getString(), "gentype", "FrancaIDL", 0, 1, CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(concreteLinkTypeEClass, ConcreteLinkType.class, "ConcreteLinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getConcreteLinkType_End(), this.getIdType(), "end", null, 1, 1, ConcreteLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConcreteLinkType_Id(), this.getIdType(), "id", null, 1, 1, ConcreteLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConcreteLinkType_Start(), this.getIdType(), "start", null, 1, 1, ConcreteLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(connectorAppearanceTypeEClass, ConnectorAppearanceType.class, "ConnectorAppearanceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getConnectorAppearanceType_HeadStyle(), theXMLTypePackage.getInt(), "headStyle", null, 1, 1, ConnectorAppearanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnectorAppearanceType_Linecolor(), theXMLTypePackage.getInt(), "linecolor", null, 1, 1, ConnectorAppearanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnectorAppearanceType_Linemode(), theXMLTypePackage.getInt(), "linemode", null, 1, 1, ConnectorAppearanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnectorAppearanceType_LineStyle(), theXMLTypePackage.getInt(), "lineStyle", null, 1, 1, ConnectorAppearanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnectorAppearanceType_Linewidth(), theXMLTypePackage.getInt(), "linewidth", null, 1, 1, ConnectorAppearanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnectorAppearanceType_Seqno(), theXMLTypePackage.getInt(), "seqno", null, 1, 1, ConnectorAppearanceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(connectorLabelsTypeEClass, ConnectorLabelsType.class, "ConnectorLabelsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getConnectorLabelsType_Lb(), theXMLTypePackage.getString(), "lb", null, 0, 1, ConnectorLabelsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnectorLabelsType_Mb(), theXMLTypePackage.getString(), "mb", null, 0, 1, ConnectorLabelsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnectorLabelsType_Mt(), theXMLTypePackage.getString(), "mt", null, 0, 1, ConnectorLabelsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(connectorModelTypeEClass, ConnectorModelType.class, "ConnectorModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getConnectorModelType_EaLocalid(), theXMLTypePackage.getInt(), "eaLocalid", null, 1, 1, ConnectorModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(connectorModifiersTypeEClass, ConnectorModifiersType.class, "ConnectorModifiersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getConnectorModifiersType_Changeable(), theXMLTypePackage.getString(), "changeable", "none", 0, 1, ConnectorModifiersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnectorModifiersType_IsLeaf(), theXMLTypePackage.getBoolean(), "isLeaf", null, 0, 1, ConnectorModifiersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnectorModifiersType_IsNavigable(), theXMLTypePackage.getBoolean(), "isNavigable", null, 0, 1, ConnectorModifiersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnectorModifiersType_IsOrdered(), theXMLTypePackage.getBoolean(), "isOrdered", null, 0, 1, ConnectorModifiersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnectorModifiersType_IsRoot(), theXMLTypePackage.getBoolean(), "isRoot", null, 0, 1, ConnectorModifiersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(connectorPropertiesTypeEClass, ConnectorPropertiesType.class, "ConnectorPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getConnectorPropertiesType_Direction(), this.getDirectionType(), "direction", null, 1, 1, ConnectorPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnectorPropertiesType_EaType(), this.getEaTypesType(), "eaType", null, 1, 1, ConnectorPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnectorPropertiesType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ConnectorPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnectorPropertiesType_Stereotype(), this.getStereotypeType(), "stereotype", null, 0, 1, ConnectorPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(connectorsTypeEClass, ConnectorsType.class, "ConnectorsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConnectorsType_Connector(), this.getConnectorType(), null, "connector", null, 0, -1, ConnectorsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(connectorTypeEClass, ConnectorType.class, "ConnectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConnectorType_Source(), this.getSourceAndTargetType(), null, "source", null, 1, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConnectorType_Target(), this.getSourceAndTargetType(), null, "target", null, 1, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConnectorType_Model(), this.getConnectorModelType(), null, "model", null, 1, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConnectorType_Properties(), this.getConnectorPropertiesType(), null, "properties", null, 1, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConnectorType_Modifiers(), this.getConnectorModifiersType(), null, "modifiers", null, 1, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConnectorType_Documentation(), this.getDocumentationType(), null, "documentation", null, 1, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConnectorType_Appearance(), this.getConnectorAppearanceType(), null, "appearance", null, 1, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConnectorType_Labels(), this.getConnectorLabelsType(), null, "labels", null, 1, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConnectorType_ExtendedProperties(), this.getExtendedPropertiesType(), null, "extendedProperties", null, 1, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConnectorType_Style(), this.getDocumentationType(), null, "style", null, 1, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConnectorType_Xrefs(), this.getXrefsType(), null, "xrefs", null, 1, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getConnectorType_Tags(), this.getOperationTagsType(), null, "tags", null, 1, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConnectorType_Idref(), this.getIdType(), "idref", null, 1, 1, ConnectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(diagramElementsTypeEClass, DiagramElementsType.class, "DiagramElementsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDiagramElementsType_Element(), this.getDiagramElementType(), null, "element", null, 0, -1, DiagramElementsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(diagramElementTypeEClass, DiagramElementType.class, "DiagramElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDiagramElementType_Geometry(), theXMLTypePackage.getString(), "geometry", null, 1, 1, DiagramElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiagramElementType_Seqno(), theXMLTypePackage.getInt(), "seqno", null, 0, 1, DiagramElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiagramElementType_Style(), theXMLTypePackage.getString(), "style", null, 1, 1, DiagramElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiagramElementType_Subject(), this.getIdType(), "subject", null, 1, 1, DiagramElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(diagramModelTypeEClass, DiagramModelType.class, "DiagramModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDiagramModelType_LocalID(), theXMLTypePackage.getInt(), "localID", null, 1, 1, DiagramModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiagramModelType_Owner(), this.getIdType(), "owner", null, 1, 1, DiagramModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiagramModelType_Package(), this.getIdType(), "package", null, 1, 1, DiagramModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiagramModelType_Parent(), this.getIdType(), "parent", null, 0, 1, DiagramModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(diagramPropertiesTypeEClass, DiagramPropertiesType.class, "DiagramPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDiagramPropertiesType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, DiagramPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiagramPropertiesType_Type(), this.getDiagramTypeType(), "type", null, 1, 1, DiagramPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(diagramsTypeEClass, DiagramsType.class, "DiagramsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDiagramsType_Diagram(), this.getDiagramType(), null, "diagram", null, 0, -1, DiagramsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(diagramTypeEClass, DiagramType.class, "DiagramType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDiagramType_Model(), this.getDiagramModelType(), null, "model", null, 1, 1, DiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDiagramType_Properties(), this.getDiagramPropertiesType(), null, "properties", null, 1, 1, DiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDiagramType_Project(), this.getProjectType(), null, "project", null, 1, 1, DiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDiagramType_Style1(), this.getDocumentationType(), null, "style1", null, 1, 1, DiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDiagramType_Style2(), this.getDocumentationType(), null, "style2", null, 1, 1, DiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDiagramType_Swimlanes(), this.getDocumentationType(), null, "swimlanes", null, 1, 1, DiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDiagramType_Matrixitems(), this.getDocumentationType(), null, "matrixitems", null, 1, 1, DiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDiagramType_Elements(), this.getDiagramElementsType(), null, "elements", null, 1, 1, DiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDiagramType_Id(), this.getIdType(), "id", null, 1, 1, DiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentationEClass, Documentation.class, "Documentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentation_Exporter(), theXMLTypePackage.getString(), "exporter", "Enterprise Architect", 1, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentation_ExporterVersion(), theXMLTypePackage.getString(), "exporterVersion", "6.5", 1, 1, Documentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentationTypeEClass, DocumentationType.class, "DocumentationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentationType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, DocumentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(elementsTypeEClass, ElementsType.class, "ElementsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getElementsType_Element(), this.getElementType(), null, "element", null, 0, -1, ElementsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(elementTypeEClass, ElementType.class, "ElementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getElementType_Model(), this.getModelType(), null, "model", null, 1, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getElementType_Properties(), this.getPropertiesType(), null, "properties", null, 1, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getElementType_Project(), this.getProjectType(), null, "project", null, 1, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getElementType_Code(), this.getCodeType(), null, "code", null, 1, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getElementType_Links(), this.getLinksType(), null, "links", null, 0, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getElementType_Attributes(), this.getAttributesType(), null, "attributes", null, 0, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getElementType_Operations(), this.getOperationsType(), null, "operations", null, 0, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getElementType_Idref(), this.getIdType(), "idref", null, 1, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getElementType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getElementType_Scope(), theUmlPackage.getVisibilityType(), "scope", null, 0, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getElementType_Type(), this.getTypeBaseType(), "type", null, 1, 1, ElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(extendedPropertiesTypeEClass, ExtendedPropertiesType.class, "ExtendedPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getExtendedPropertiesType_Conditional(), theXMLTypePackage.getString(), "conditional", null, 0, 1, ExtendedPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExtendedPropertiesType_Diagram(), this.getIdType(), "diagram", null, 0, 1, ExtendedPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExtendedPropertiesType_Privatedata1(), this.getAsyncSyncType(), "privatedata1", null, 0, 1, ExtendedPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExtendedPropertiesType_Privatedata2(), theXMLTypePackage.getString(), "privatedata2", null, 0, 1, ExtendedPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExtendedPropertiesType_Privatedata3(), theXMLTypePackage.getString(), "privatedata3", "Call", 0, 1, ExtendedPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExtendedPropertiesType_Privatedata4(), theXMLTypePackage.getInt(), "privatedata4", "0", 0, 1, ExtendedPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExtendedPropertiesType_Privatedata5(), theXMLTypePackage.getString(), "privatedata5", null, 0, 1, ExtendedPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExtendedPropertiesType_SequencePoints(), theXMLTypePackage.getString(), "sequencePoints", null, 0, 1, ExtendedPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExtendedPropertiesType_Stateflags(), theXMLTypePackage.getString(), "stateflags", null, 0, 1, ExtendedPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExtendedPropertiesType_VirtualInheritance(), theXMLTypePackage.getInt(), "virtualInheritance", null, 1, 1, ExtendedPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExtension_Elements(), this.getElementsType(), null, "elements", null, 1, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExtension_Connectors(), this.getConnectorsType(), null, "connectors", null, 1, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExtension_Primitivetypes(), this.getPrimitiveTypesType(), null, "primitivetypes", null, 1, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExtension_Profiles(), theXMLTypePackage.getString(), "profiles", null, 1, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExtension_Diagrams(), this.getDiagramsType(), null, "diagrams", null, 1, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExtension_Extender(), theXMLTypePackage.getString(), "extender", "Enterprise Architect", 1, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExtension_ExtenderID(), theXMLTypePackage.getString(), "extenderID", "6.5", 1, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(initialTypeEClass, InitialType.class, "InitialType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getInitialType_Body(), theXMLTypePackage.getString(), "body", null, 0, 1, InitialType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(linksTypeEClass, LinksType.class, "LinksType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLinksType_Sequence(), this.getConcreteLinkType(), null, "sequence", null, 0, -1, LinksType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLinksType_Realisation(), this.getConcreteLinkType(), null, "realisation", null, 0, -1, LinksType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLinksType_Generalization(), this.getConcreteLinkType(), null, "generalization", null, 0, -1, LinksType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLinksType_Dependency(), this.getConcreteLinkType(), null, "dependency", null, 0, -1, LinksType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLinksType_Association(), this.getConcreteLinkType(), null, "association", null, 0, -1, LinksType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(modelTypeEClass, ModelType.class, "ModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getModelType_EaEleType(), theXMLTypePackage.getString(), "eaEleType", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModelType_EaLocalid(), theXMLTypePackage.getInt(), "eaLocalid", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModelType_Owner(), this.getIdType(), "owner", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModelType_Package(), this.getIdType(), "package", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModelType_Package2(), this.getIdType(), "package2", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModelType_Tpos(), theXMLTypePackage.getInt(), "tpos", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(operationParametersTypeEClass, OperationParametersType.class, "OperationParametersType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOperationParametersType_Parameter(), this.getParameterType(), null, "parameter", null, 0, -1, OperationParametersType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(operationPropertiesTypeEClass, OperationPropertiesType.class, "OperationPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOperationPropertiesType_Position(), theXMLTypePackage.getInt(), "position", null, 1, 1, OperationPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(operationsTypeEClass, OperationsType.class, "OperationsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOperationsType_Operation(), this.getOperationType(), null, "operation", null, 0, -1, OperationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(operationTagsTypeEClass, OperationTagsType.class, "OperationTagsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOperationTagsType_Tag(), this.getTagType(), null, "tag", null, 0, -1, OperationTagsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(operationTypeEClass, OperationType.class, "OperationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOperationType_Properties(), this.getOperationPropertiesType(), null, "properties", null, 1, 1, OperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOperationType_Stereotype(), this.getStereotypeAttributeType(), null, "stereotype", null, 1, 1, OperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOperationType_Model(), this.getAttributeModelType(), null, "model", null, 1, 1, OperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOperationType_Type(), this.getOperationTypeType(), null, "type", null, 1, 1, OperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOperationType_Documentation(), this.getDocumentationType(), null, "documentation", null, 1, 1, OperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOperationType_Tags(), this.getOperationTagsType(), null, "tags", null, 1, 1, OperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOperationType_Parameters(), this.getOperationParametersType(), null, "parameters", null, 1, 1, OperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOperationType_Xrefs(), this.getXrefsType(), null, "xrefs", null, 1, 1, OperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperationType_Idref(), this.getIdType(), "idref", null, 1, 1, OperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperationType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, OperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperationType_Scope(), theUmlPackage.getVisibilityType(), "scope", null, 1, 1, OperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(operationTypeTypeEClass, OperationTypeType.class, "OperationTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOperationTypeType_Concurrency(), theXMLTypePackage.getString(), "concurrency", null, 1, 1, OperationTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperationTypeType_Const(), theXMLTypePackage.getBoolean(), "const", null, 1, 1, OperationTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperationTypeType_IsAbstract(), theXMLTypePackage.getBoolean(), "isAbstract", null, 1, 1, OperationTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperationTypeType_IsQuery(), theXMLTypePackage.getBoolean(), "isQuery", null, 1, 1, OperationTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperationTypeType_Pure(), theXMLTypePackage.getInt(), "pure", null, 1, 1, OperationTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperationTypeType_Returnarray(), theXMLTypePackage.getInt(), "returnarray", null, 1, 1, OperationTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperationTypeType_Static(), theXMLTypePackage.getBoolean(), "static", null, 1, 1, OperationTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperationTypeType_Stereotype(), this.getStereotypeType(), "stereotype", null, 1, 1, OperationTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOperationTypeType_Synchronised(), theXMLTypePackage.getInt(), "synchronised", null, 1, 1, OperationTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(parameterPropertiesTypeEClass, ParameterPropertiesType.class, "ParameterPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getParameterPropertiesType_Classifier(), theXMLTypePackage.getString(), "classifier", null, 0, 1, ParameterPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameterPropertiesType_Const(), theXMLTypePackage.getBoolean(), "const", null, 1, 1, ParameterPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameterPropertiesType_EaGuid(), theXMLTypePackage.getString(), "eaGuid", null, 1, 1, ParameterPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameterPropertiesType_Pos(), theXMLTypePackage.getInt(), "pos", null, 1, 1, ParameterPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameterPropertiesType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, ParameterPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(parameterTypeEClass, ParameterType.class, "ParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getParameterType_Properties(), this.getParameterPropertiesType(), null, "properties", null, 1, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_Documentation(), this.getDocumentationType(), null, "documentation", null, 1, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_Value(), this.getInitialType(), null, "value", null, 0, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getParameterType_Xrefs(), this.getXrefsType(), null, "xrefs", null, 1, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameterType_Idref(), this.getIdType(), "idref", null, 1, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameterType_Visibility(), theUmlPackage.getVisibilityType(), "visibility", null, 1, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(primitiveTypesTypeEClass, PrimitiveTypesType.class, "PrimitiveTypesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPrimitiveTypesType_PackagedElement(), theUmlPackage.getPackagedElementPackageType(), null, "packagedElement", null, 0, -1, PrimitiveTypesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(projectTypeEClass, ProjectType.class, "ProjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProjectType_Author(), theXMLTypePackage.getString(), "author", null, 0, 1, ProjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProjectType_Created(), theXMLTypePackage.getString(), "created", null, 0, 1, ProjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProjectType_Modified(), theXMLTypePackage.getString(), "modified", null, 0, 1, ProjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProjectType_Phase(), theXMLTypePackage.getString(), "phase", null, 0, 1, ProjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProjectType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, ProjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertiesTypeEClass, PropertiesType.class, "PropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPropertiesType_ClassName(), theXMLTypePackage.getString(), "className", null, 0, 1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPropertiesType_Documentation(), theXMLTypePackage.getString(), "documentation", null, 0, 1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPropertiesType_Genlinks(), theXMLTypePackage.getString(), "genlinks", null, 0, 1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPropertiesType_IsAbstract(), theXMLTypePackage.getBoolean(), "isAbstract", null, 0, 1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPropertiesType_IsActive(), theXMLTypePackage.getBoolean(), "isActive", null, 0, 1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPropertiesType_IsLeaf(), theXMLTypePackage.getBoolean(), "isLeaf", null, 0, 1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPropertiesType_IsRoot(), theXMLTypePackage.getBoolean(), "isRoot", null, 0, 1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPropertiesType_IsSpecification(), theXMLTypePackage.getBoolean(), "isSpecification", null, 0, 1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPropertiesType_Scope(), theUmlPackage.getVisibilityType(), "scope", null, 0, 1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPropertiesType_Stereotype(), this.getStereotypeType(), "stereotype", null, 0, 1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPropertiesType_SType(), this.getSTypeType(), "sType", null, 0, 1, PropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sourceAndTargetModelTypeEClass, SourceAndTargetModelType.class, "SourceAndTargetModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSourceAndTargetModelType_EaLocalid(), theXMLTypePackage.getInt(), "eaLocalid", null, 1, 1, SourceAndTargetModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSourceAndTargetModelType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SourceAndTargetModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSourceAndTargetModelType_Type(), this.getSTypeType(), "type", null, 1, 1, SourceAndTargetModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sourceAndTargetRoleTypeEClass, SourceAndTargetRoleType.class, "SourceAndTargetRoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSourceAndTargetRoleType_TargetScope(), theXMLTypePackage.getString(), "targetScope", "instance", 1, 1, SourceAndTargetRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSourceAndTargetRoleType_Visibility(), theUmlPackage.getVisibilityType(), "visibility", null, 1, 1, SourceAndTargetRoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sourceAndTargetTypeEClass, SourceAndTargetType.class, "SourceAndTargetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSourceAndTargetType_Model(), this.getSourceAndTargetModelType(), null, "model", null, 1, 1, SourceAndTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSourceAndTargetType_Role(), this.getSourceAndTargetRoleType(), null, "role", null, 1, 1, SourceAndTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSourceAndTargetType_Type(), this.getSourceAndTargetTypeType(), null, "type", null, 1, 1, SourceAndTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSourceAndTargetType_Modifiers(), this.getConnectorModifiersType(), null, "modifiers", null, 1, 1, SourceAndTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSourceAndTargetType_Style(), this.getDocumentationType(), null, "style", null, 1, 1, SourceAndTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSourceAndTargetType_Documentation(), this.getDocumentationType(), null, "documentation", null, 1, 1, SourceAndTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSourceAndTargetType_Xrefs(), this.getXrefsType(), null, "xrefs", null, 1, 1, SourceAndTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSourceAndTargetType_Tags(), this.getOperationTagsType(), null, "tags", null, 1, 1, SourceAndTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSourceAndTargetType_Idref(), this.getIdType(), "idref", null, 1, 1, SourceAndTargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sourceAndTargetTypeTypeEClass, SourceAndTargetTypeType.class, "SourceAndTargetTypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSourceAndTargetTypeType_Aggregation(), theXMLTypePackage.getString(), "aggregation", null, 0, 1, SourceAndTargetTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSourceAndTargetTypeType_Containment(), theXMLTypePackage.getString(), "containment", null, 1, 1, SourceAndTargetTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSourceAndTargetTypeType_Multiplicity(), theXMLTypePackage.getString(), "multiplicity", null, 0, 1, SourceAndTargetTypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(stereotypeAttributeTypeEClass, StereotypeAttributeType.class, "StereotypeAttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getStereotypeAttributeType_Stereotype(), this.getStereotypeType(), "stereotype", null, 0, 1, StereotypeAttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(styleexTypeEClass, StyleexType.class, "StyleexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getStyleexType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, StyleexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tagTypeEClass, TagType.class, "TagType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTagType_Id(), this.getIdType(), "id", null, 1, 1, TagType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTagType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TagType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTagType_Notes(), theXMLTypePackage.getString(), "notes", null, 0, 1, TagType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTagType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, TagType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMI(), this.getXMIType(), null, "xMI", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Id(), this.getIdType(), "id", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Idref(), this.getIdType(), "idref", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Type(), this.getTypeBaseType(), "type", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentRoot_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(xmiTypeEClass, XMIType.class, "XMIType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getXMIType_Documentation(), this.getDocumentation(), null, "documentation", null, 1, 1, XMIType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getXMIType_Model(), theUmlPackage.getModelType(), null, "model", null, 1, 1, XMIType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getXMIType_Extension(), this.getExtension(), null, "extension", null, 1, 1, XMIType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getXMIType_Version(), theXMLTypePackage.getString(), "version", "2.1", 1, 1, XMIType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(xrefsTypeEClass, XrefsType.class, "XrefsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getXrefsType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, XrefsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(asyncSyncTypeEEnum, AsyncSyncType.class, "AsyncSyncType");
        addEEnumLiteral(asyncSyncTypeEEnum, AsyncSyncType.SYNCHRONOUS);
        addEEnumLiteral(asyncSyncTypeEEnum, AsyncSyncType.ASYNCHRONOUS);

        initEEnum(diagramTypeTypeEEnum, DiagramTypeType.class, "DiagramTypeType");
        addEEnumLiteral(diagramTypeTypeEEnum, DiagramTypeType.COMPONENT);
        addEEnumLiteral(diagramTypeTypeEEnum, DiagramTypeType.LOGICAL);
        addEEnumLiteral(diagramTypeTypeEEnum, DiagramTypeType.SEQUENCE);

        initEEnum(directionTypeEEnum, DirectionType.class, "DirectionType");
        addEEnumLiteral(directionTypeEEnum, DirectionType.DESTINATION_SOURCE);
        addEEnumLiteral(directionTypeEEnum, DirectionType.SOURCE_DESTINATION);
        addEEnumLiteral(directionTypeEEnum, DirectionType.UNSPECIFIED);

        initEEnum(eaTypesTypeEEnum, EaTypesType.class, "EaTypesType");
        addEEnumLiteral(eaTypesTypeEEnum, EaTypesType.ASSOCIATION);
        addEEnumLiteral(eaTypesTypeEEnum, EaTypesType.DEPENDENCY);
        addEEnumLiteral(eaTypesTypeEEnum, EaTypesType.GENERALIZATION);
        addEEnumLiteral(eaTypesTypeEEnum, EaTypesType.PACKAGE);
        addEEnumLiteral(eaTypesTypeEEnum, EaTypesType.SEQUENCE);
        addEEnumLiteral(eaTypesTypeEEnum, EaTypesType.REALISATION);

        initEEnum(stereotypeTypeEEnum, StereotypeType.class, "StereotypeType");
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.ARRAY);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.ARRAY_OF);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.ATTRIBUTE);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.ATTRIBUTE_NOSUBSCRIPTIONS);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.ATTRIBUTE_READONLY);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.ATTRIBUTE_READONLY_NOSUBSCRIPTIONS);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.BROADCAST);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.BROADCAST_SELECTIVE);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.ENUMERATION);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.EXTENDS);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.FIDL);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.FRANCA_CLIENT_INTERFACE);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.FRANCA_ENUM);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.FRANCA_INTERFACE);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.FRANCA_SERVICE_INTERFACE);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.IMPORT);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.KEY);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.MAP);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.METHOD);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.METHOD_FIREANDFORGET);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.ROOT);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.STRUCT);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.TYPEDEF);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.UNION);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.USE);
        addEEnumLiteral(stereotypeTypeEEnum, StereotypeType.VALUE);

        initEEnum(sTypeTypeEEnum, STypeType.class, "STypeType");
        addEEnumLiteral(sTypeTypeEEnum, STypeType.CLASS);
        addEEnumLiteral(sTypeTypeEEnum, STypeType.COMPONENT);
        addEEnumLiteral(sTypeTypeEEnum, STypeType.INTERFACE);
        addEEnumLiteral(sTypeTypeEEnum, STypeType.PACKAGE);

        initEEnum(typeBaseTypeEEnum, TypeBaseType.class, "TypeBaseType");
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_ASSOCIATION);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_CLASS);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_COLLABORATION);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_COMMENT);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_COMPONENT);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_DEPENDENCY);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_ENUMERATION);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_ENUMERATION_LITERAL);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_EXTENSION);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_GENERALIZATION);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_INSTANCE_SPECIFICATION);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_INTERACTION);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_INTERFACE);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_LIFELINE);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_LITERAL_INTEGER);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_LITERAL_STRING);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_LITERAL_UNLIMITED_NATURAL);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_MESSAGE);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_MODEL);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_OCCURRENCE_SPECIFICATION);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_PACKAGE);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_PACKAGE_IMPORT);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_PRIMITIVE_TYPE);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_PROPERTY);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_REALIZATION);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_STEREOTYPE);
        addEEnumLiteral(typeBaseTypeEEnum, TypeBaseType.UML_USAGE);

        // Initialize data types
        initEDataType(asyncSyncTypeObjectEDataType, AsyncSyncType.class, "AsyncSyncTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(diagramTypeTypeObjectEDataType, DiagramTypeType.class, "DiagramTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(directionTypeObjectEDataType, DirectionType.class, "DirectionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(eaTypesTypeObjectEDataType, EaTypesType.class, "EaTypesTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(idTypeEDataType, String.class, "IdType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(stereotypeTypeObjectEDataType, StereotypeType.class, "StereotypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(sTypeTypeObjectEDataType, STypeType.class, "STypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(typeBaseTypeObjectEDataType, TypeBaseType.class, "TypeBaseTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createExtendedMetaDataAnnotations()
    {
        String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
        addAnnotation
          (asyncSyncTypeEEnum, 
           source, 
           new String[] 
           {
             "name", "asyncSyncType"
           });		
        addAnnotation
          (asyncSyncTypeObjectEDataType, 
           source, 
           new String[] 
           {
             "name", "asyncSyncType:Object",
             "baseType", "asyncSyncType"
           });		
        addAnnotation
          (attributeContainmentTypeEClass, 
           source, 
           new String[] 
           {
             "name", "attributeContainmentType",
             "kind", "empty"
           });		
        addAnnotation
          (getAttributeContainmentType_Containment(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "containment"
           });		
        addAnnotation
          (getAttributeContainmentType_Position(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "position"
           });		
        addAnnotation
          (attributeModelTypeEClass, 
           source, 
           new String[] 
           {
             "name", "attributeModelType",
             "kind", "empty"
           });		
        addAnnotation
          (getAttributeModelType_EaGuid(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "ea_guid"
           });		
        addAnnotation
          (getAttributeModelType_EaLocalid(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "ea_localid"
           });		
        addAnnotation
          (attributePropertiesTypeEClass, 
           source, 
           new String[] 
           {
             "name", "attributePropertiesType",
             "kind", "empty"
           });		
        addAnnotation
          (getAttributePropertiesType_Type(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "type"
           });		
        addAnnotation
          (attributesTypeEClass, 
           source, 
           new String[] 
           {
             "name", "attributesType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getAttributesType_Attribute(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "attribute"
           });		
        addAnnotation
          (attributeTypeEClass, 
           source, 
           new String[] 
           {
             "name", "attributeType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getAttributeType_Initial(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "initial"
           });		
        addAnnotation
          (getAttributeType_Documentation(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "documentation"
           });		
        addAnnotation
          (getAttributeType_Model(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "model"
           });		
        addAnnotation
          (getAttributeType_Properties(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "properties"
           });		
        addAnnotation
          (getAttributeType_Containment(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "containment"
           });		
        addAnnotation
          (getAttributeType_Stereotype(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "stereotype"
           });		
        addAnnotation
          (getAttributeType_Bounds(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "bounds"
           });		
        addAnnotation
          (getAttributeType_Styleex(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "styleex"
           });		
        addAnnotation
          (getAttributeType_Xrefs(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "xrefs"
           });		
        addAnnotation
          (getAttributeType_Idref(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "idref",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getAttributeType_Name(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getAttributeType_Scope(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "scope"
           });		
        addAnnotation
          (boundsTypeEClass, 
           source, 
           new String[] 
           {
             "name", "boundsType",
             "kind", "empty"
           });		
        addAnnotation
          (getBoundsType_Lower(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "lower"
           });		
        addAnnotation
          (getBoundsType_Upper(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "upper"
           });		
        addAnnotation
          (codeTypeEClass, 
           source, 
           new String[] 
           {
             "name", "codeType",
             "kind", "empty"
           });		
        addAnnotation
          (getCodeType_Gentype(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "gentype"
           });		
        addAnnotation
          (concreteLinkTypeEClass, 
           source, 
           new String[] 
           {
             "name", "concreteLinkType",
             "kind", "empty"
           });		
        addAnnotation
          (getConcreteLinkType_End(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "end"
           });		
        addAnnotation
          (getConcreteLinkType_Id(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "id",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getConcreteLinkType_Start(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "start"
           });		
        addAnnotation
          (connectorAppearanceTypeEClass, 
           source, 
           new String[] 
           {
             "name", "connectorAppearanceType",
             "kind", "empty"
           });		
        addAnnotation
          (getConnectorAppearanceType_HeadStyle(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "headStyle"
           });		
        addAnnotation
          (getConnectorAppearanceType_Linecolor(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "linecolor"
           });		
        addAnnotation
          (getConnectorAppearanceType_Linemode(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "linemode"
           });		
        addAnnotation
          (getConnectorAppearanceType_LineStyle(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "lineStyle"
           });		
        addAnnotation
          (getConnectorAppearanceType_Linewidth(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "linewidth"
           });		
        addAnnotation
          (getConnectorAppearanceType_Seqno(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "seqno"
           });		
        addAnnotation
          (connectorLabelsTypeEClass, 
           source, 
           new String[] 
           {
             "name", "connectorLabelsType",
             "kind", "empty"
           });		
        addAnnotation
          (getConnectorLabelsType_Lb(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "lb"
           });		
        addAnnotation
          (getConnectorLabelsType_Mb(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "mb"
           });		
        addAnnotation
          (getConnectorLabelsType_Mt(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "mt"
           });		
        addAnnotation
          (connectorModelTypeEClass, 
           source, 
           new String[] 
           {
             "name", "connectorModelType",
             "kind", "empty"
           });		
        addAnnotation
          (getConnectorModelType_EaLocalid(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "ea_localid"
           });		
        addAnnotation
          (connectorModifiersTypeEClass, 
           source, 
           new String[] 
           {
             "name", "connectorModifiersType",
             "kind", "empty"
           });		
        addAnnotation
          (getConnectorModifiersType_Changeable(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "changeable"
           });		
        addAnnotation
          (getConnectorModifiersType_IsLeaf(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isLeaf"
           });		
        addAnnotation
          (getConnectorModifiersType_IsNavigable(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isNavigable"
           });		
        addAnnotation
          (getConnectorModifiersType_IsOrdered(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isOrdered"
           });		
        addAnnotation
          (getConnectorModifiersType_IsRoot(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isRoot"
           });		
        addAnnotation
          (connectorPropertiesTypeEClass, 
           source, 
           new String[] 
           {
             "name", "connectorPropertiesType",
             "kind", "empty"
           });		
        addAnnotation
          (getConnectorPropertiesType_Direction(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "direction"
           });		
        addAnnotation
          (getConnectorPropertiesType_EaType(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "ea_type"
           });		
        addAnnotation
          (getConnectorPropertiesType_Name(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getConnectorPropertiesType_Stereotype(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "stereotype"
           });		
        addAnnotation
          (connectorsTypeEClass, 
           source, 
           new String[] 
           {
             "name", "connectorsType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getConnectorsType_Connector(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "connector"
           });		
        addAnnotation
          (connectorTypeEClass, 
           source, 
           new String[] 
           {
             "name", "connectorType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getConnectorType_Source(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "source"
           });		
        addAnnotation
          (getConnectorType_Target(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "target"
           });		
        addAnnotation
          (getConnectorType_Model(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "model"
           });		
        addAnnotation
          (getConnectorType_Properties(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "properties"
           });		
        addAnnotation
          (getConnectorType_Modifiers(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "modifiers"
           });		
        addAnnotation
          (getConnectorType_Documentation(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "documentation"
           });		
        addAnnotation
          (getConnectorType_Appearance(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "appearance"
           });		
        addAnnotation
          (getConnectorType_Labels(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "labels"
           });		
        addAnnotation
          (getConnectorType_ExtendedProperties(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "extendedProperties"
           });		
        addAnnotation
          (getConnectorType_Style(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "style"
           });		
        addAnnotation
          (getConnectorType_Xrefs(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "xrefs"
           });		
        addAnnotation
          (getConnectorType_Tags(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "tags"
           });		
        addAnnotation
          (getConnectorType_Idref(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "idref",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (diagramElementsTypeEClass, 
           source, 
           new String[] 
           {
             "name", "diagramElementsType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getDiagramElementsType_Element(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "element"
           });		
        addAnnotation
          (diagramElementTypeEClass, 
           source, 
           new String[] 
           {
             "name", "diagramElementType",
             "kind", "empty"
           });		
        addAnnotation
          (getDiagramElementType_Geometry(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "geometry"
           });		
        addAnnotation
          (getDiagramElementType_Seqno(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "seqno"
           });		
        addAnnotation
          (getDiagramElementType_Style(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "style"
           });		
        addAnnotation
          (getDiagramElementType_Subject(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "subject"
           });		
        addAnnotation
          (diagramModelTypeEClass, 
           source, 
           new String[] 
           {
             "name", "diagramModelType",
             "kind", "empty"
           });		
        addAnnotation
          (getDiagramModelType_LocalID(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "localID"
           });		
        addAnnotation
          (getDiagramModelType_Owner(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "owner"
           });		
        addAnnotation
          (getDiagramModelType_Package(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "package"
           });		
        addAnnotation
          (getDiagramModelType_Parent(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "parent"
           });		
        addAnnotation
          (diagramPropertiesTypeEClass, 
           source, 
           new String[] 
           {
             "name", "diagramPropertiesType",
             "kind", "empty"
           });		
        addAnnotation
          (getDiagramPropertiesType_Name(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getDiagramPropertiesType_Type(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "type"
           });		
        addAnnotation
          (diagramsTypeEClass, 
           source, 
           new String[] 
           {
             "name", "diagramsType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getDiagramsType_Diagram(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "diagram"
           });		
        addAnnotation
          (diagramTypeEClass, 
           source, 
           new String[] 
           {
             "name", "diagramType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getDiagramType_Model(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "model"
           });		
        addAnnotation
          (getDiagramType_Properties(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "properties"
           });		
        addAnnotation
          (getDiagramType_Project(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "project"
           });		
        addAnnotation
          (getDiagramType_Style1(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "style1"
           });		
        addAnnotation
          (getDiagramType_Style2(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "style2"
           });		
        addAnnotation
          (getDiagramType_Swimlanes(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "swimlanes"
           });		
        addAnnotation
          (getDiagramType_Matrixitems(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "matrixitems"
           });		
        addAnnotation
          (getDiagramType_Elements(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "elements"
           });		
        addAnnotation
          (getDiagramType_Id(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "id",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (diagramTypeTypeEEnum, 
           source, 
           new String[] 
           {
             "name", "diagramTypeType"
           });		
        addAnnotation
          (diagramTypeTypeObjectEDataType, 
           source, 
           new String[] 
           {
             "name", "diagramTypeType:Object",
             "baseType", "diagramTypeType"
           });		
        addAnnotation
          (directionTypeEEnum, 
           source, 
           new String[] 
           {
             "name", "directionType"
           });		
        addAnnotation
          (directionTypeObjectEDataType, 
           source, 
           new String[] 
           {
             "name", "directionType:Object",
             "baseType", "directionType"
           });		
        addAnnotation
          (documentationEClass, 
           source, 
           new String[] 
           {
             "name", "Documentation",
             "kind", "empty"
           });		
        addAnnotation
          (getDocumentation_Exporter(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "exporter"
           });		
        addAnnotation
          (getDocumentation_ExporterVersion(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "exporterVersion"
           });		
        addAnnotation
          (documentationTypeEClass, 
           source, 
           new String[] 
           {
             "name", "documentationType",
             "kind", "empty"
           });		
        addAnnotation
          (getDocumentationType_Value(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "value"
           });		
        addAnnotation
          (eaTypesTypeEEnum, 
           source, 
           new String[] 
           {
             "name", "eaTypesType"
           });		
        addAnnotation
          (eaTypesTypeObjectEDataType, 
           source, 
           new String[] 
           {
             "name", "eaTypesType:Object",
             "baseType", "eaTypesType"
           });		
        addAnnotation
          (elementsTypeEClass, 
           source, 
           new String[] 
           {
             "name", "elementsType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getElementsType_Element(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "element"
           });		
        addAnnotation
          (elementTypeEClass, 
           source, 
           new String[] 
           {
             "name", "elementType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getElementType_Model(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "model"
           });		
        addAnnotation
          (getElementType_Properties(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "properties"
           });		
        addAnnotation
          (getElementType_Project(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "project"
           });		
        addAnnotation
          (getElementType_Code(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "code"
           });		
        addAnnotation
          (getElementType_Links(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "links"
           });		
        addAnnotation
          (getElementType_Attributes(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "attributes"
           });		
        addAnnotation
          (getElementType_Operations(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "operations"
           });		
        addAnnotation
          (getElementType_Idref(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "idref",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getElementType_Name(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getElementType_Scope(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "scope"
           });		
        addAnnotation
          (getElementType_Type(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "type",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (extendedPropertiesTypeEClass, 
           source, 
           new String[] 
           {
             "name", "extendedPropertiesType",
             "kind", "empty"
           });		
        addAnnotation
          (getExtendedPropertiesType_Conditional(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "conditional"
           });		
        addAnnotation
          (getExtendedPropertiesType_Diagram(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "diagram"
           });		
        addAnnotation
          (getExtendedPropertiesType_Privatedata1(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "privatedata1"
           });		
        addAnnotation
          (getExtendedPropertiesType_Privatedata2(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "privatedata2"
           });		
        addAnnotation
          (getExtendedPropertiesType_Privatedata3(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "privatedata3"
           });		
        addAnnotation
          (getExtendedPropertiesType_Privatedata4(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "privatedata4"
           });		
        addAnnotation
          (getExtendedPropertiesType_Privatedata5(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "privatedata5"
           });		
        addAnnotation
          (getExtendedPropertiesType_SequencePoints(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "sequence_points"
           });		
        addAnnotation
          (getExtendedPropertiesType_Stateflags(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "stateflags"
           });		
        addAnnotation
          (getExtendedPropertiesType_VirtualInheritance(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "virtualInheritance"
           });		
        addAnnotation
          (extensionEClass, 
           source, 
           new String[] 
           {
             "name", "Extension",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getExtension_Elements(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "elements"
           });		
        addAnnotation
          (getExtension_Connectors(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "connectors"
           });		
        addAnnotation
          (getExtension_Primitivetypes(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "primitivetypes"
           });		
        addAnnotation
          (getExtension_Profiles(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "profiles"
           });		
        addAnnotation
          (getExtension_Diagrams(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "diagrams"
           });		
        addAnnotation
          (getExtension_Extender(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "extender"
           });		
        addAnnotation
          (getExtension_ExtenderID(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "extenderID"
           });		
        addAnnotation
          (idTypeEDataType, 
           source, 
           new String[] 
           {
             "name", "idType",
             "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
           });		
        addAnnotation
          (initialTypeEClass, 
           source, 
           new String[] 
           {
             "name", "initialType",
             "kind", "empty"
           });		
        addAnnotation
          (getInitialType_Body(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "body"
           });		
        addAnnotation
          (linksTypeEClass, 
           source, 
           new String[] 
           {
             "name", "linksType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getLinksType_Sequence(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "Sequence"
           });		
        addAnnotation
          (getLinksType_Realisation(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "Realisation"
           });		
        addAnnotation
          (getLinksType_Generalization(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "Generalization"
           });		
        addAnnotation
          (getLinksType_Dependency(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "Dependency"
           });		
        addAnnotation
          (getLinksType_Association(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "Association"
           });		
        addAnnotation
          (modelTypeEClass, 
           source, 
           new String[] 
           {
             "name", "modelType",
             "kind", "empty"
           });		
        addAnnotation
          (getModelType_EaEleType(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "ea_eleType"
           });		
        addAnnotation
          (getModelType_EaLocalid(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "ea_localid"
           });		
        addAnnotation
          (getModelType_Owner(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "owner"
           });		
        addAnnotation
          (getModelType_Package(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "package"
           });		
        addAnnotation
          (getModelType_Package2(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "package2"
           });		
        addAnnotation
          (getModelType_Tpos(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "tpos"
           });		
        addAnnotation
          (operationParametersTypeEClass, 
           source, 
           new String[] 
           {
             "name", "operationParametersType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getOperationParametersType_Parameter(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "parameter"
           });		
        addAnnotation
          (operationPropertiesTypeEClass, 
           source, 
           new String[] 
           {
             "name", "operationPropertiesType",
             "kind", "empty"
           });		
        addAnnotation
          (getOperationPropertiesType_Position(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "position"
           });		
        addAnnotation
          (operationsTypeEClass, 
           source, 
           new String[] 
           {
             "name", "operationsType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getOperationsType_Operation(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "operation"
           });		
        addAnnotation
          (operationTagsTypeEClass, 
           source, 
           new String[] 
           {
             "name", "operationTagsType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getOperationTagsType_Tag(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "tag"
           });		
        addAnnotation
          (operationTypeEClass, 
           source, 
           new String[] 
           {
             "name", "operationType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getOperationType_Properties(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "properties"
           });		
        addAnnotation
          (getOperationType_Stereotype(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "stereotype"
           });		
        addAnnotation
          (getOperationType_Model(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "model"
           });		
        addAnnotation
          (getOperationType_Type(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "type"
           });		
        addAnnotation
          (getOperationType_Documentation(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "documentation"
           });		
        addAnnotation
          (getOperationType_Tags(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "tags"
           });		
        addAnnotation
          (getOperationType_Parameters(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "parameters"
           });		
        addAnnotation
          (getOperationType_Xrefs(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "xrefs"
           });		
        addAnnotation
          (getOperationType_Idref(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "idref",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getOperationType_Name(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getOperationType_Scope(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "scope"
           });		
        addAnnotation
          (operationTypeTypeEClass, 
           source, 
           new String[] 
           {
             "name", "operationTypeType",
             "kind", "empty"
           });		
        addAnnotation
          (getOperationTypeType_Concurrency(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "concurrency"
           });		
        addAnnotation
          (getOperationTypeType_Const(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "const"
           });		
        addAnnotation
          (getOperationTypeType_IsAbstract(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isAbstract"
           });		
        addAnnotation
          (getOperationTypeType_IsQuery(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isQuery"
           });		
        addAnnotation
          (getOperationTypeType_Pure(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "pure"
           });		
        addAnnotation
          (getOperationTypeType_Returnarray(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "returnarray"
           });		
        addAnnotation
          (getOperationTypeType_Static(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "static"
           });		
        addAnnotation
          (getOperationTypeType_Stereotype(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "stereotype"
           });		
        addAnnotation
          (getOperationTypeType_Synchronised(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "synchronised"
           });		
        addAnnotation
          (parameterPropertiesTypeEClass, 
           source, 
           new String[] 
           {
             "name", "parameterPropertiesType",
             "kind", "empty"
           });		
        addAnnotation
          (getParameterPropertiesType_Classifier(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "classifier"
           });		
        addAnnotation
          (getParameterPropertiesType_Const(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "const"
           });		
        addAnnotation
          (getParameterPropertiesType_EaGuid(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "ea_guid"
           });		
        addAnnotation
          (getParameterPropertiesType_Pos(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "pos"
           });		
        addAnnotation
          (getParameterPropertiesType_Type(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "type"
           });		
        addAnnotation
          (parameterTypeEClass, 
           source, 
           new String[] 
           {
             "name", "parameterType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getParameterType_Properties(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "properties"
           });		
        addAnnotation
          (getParameterType_Documentation(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "documentation"
           });		
        addAnnotation
          (getParameterType_Value(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "Value"
           });		
        addAnnotation
          (getParameterType_Xrefs(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "xrefs"
           });		
        addAnnotation
          (getParameterType_Idref(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "idref",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getParameterType_Visibility(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "visibility"
           });		
        addAnnotation
          (primitiveTypesTypeEClass, 
           source, 
           new String[] 
           {
             "name", "primitiveTypesType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getPrimitiveTypesType_PackagedElement(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "packagedElement"
           });		
        addAnnotation
          (projectTypeEClass, 
           source, 
           new String[] 
           {
             "name", "projectType",
             "kind", "empty"
           });		
        addAnnotation
          (getProjectType_Author(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "author"
           });		
        addAnnotation
          (getProjectType_Created(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "created"
           });		
        addAnnotation
          (getProjectType_Modified(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "modified"
           });		
        addAnnotation
          (getProjectType_Phase(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "phase"
           });		
        addAnnotation
          (getProjectType_Version(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "version"
           });		
        addAnnotation
          (propertiesTypeEClass, 
           source, 
           new String[] 
           {
             "name", "propertiesType",
             "kind", "empty"
           });		
        addAnnotation
          (getPropertiesType_ClassName(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "className"
           });		
        addAnnotation
          (getPropertiesType_Documentation(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "documentation"
           });		
        addAnnotation
          (getPropertiesType_Genlinks(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "genlinks"
           });		
        addAnnotation
          (getPropertiesType_IsAbstract(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isAbstract"
           });		
        addAnnotation
          (getPropertiesType_IsActive(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isActive"
           });		
        addAnnotation
          (getPropertiesType_IsLeaf(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isLeaf"
           });		
        addAnnotation
          (getPropertiesType_IsRoot(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isRoot"
           });		
        addAnnotation
          (getPropertiesType_IsSpecification(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isSpecification"
           });		
        addAnnotation
          (getPropertiesType_Scope(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "scope"
           });		
        addAnnotation
          (getPropertiesType_Stereotype(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "stereotype"
           });		
        addAnnotation
          (getPropertiesType_SType(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "sType"
           });		
        addAnnotation
          (sourceAndTargetModelTypeEClass, 
           source, 
           new String[] 
           {
             "name", "sourceAndTargetModelType",
             "kind", "empty"
           });		
        addAnnotation
          (getSourceAndTargetModelType_EaLocalid(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "ea_localid"
           });		
        addAnnotation
          (getSourceAndTargetModelType_Name(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getSourceAndTargetModelType_Type(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "type"
           });		
        addAnnotation
          (sourceAndTargetRoleTypeEClass, 
           source, 
           new String[] 
           {
             "name", "sourceAndTargetRoleType",
             "kind", "empty"
           });		
        addAnnotation
          (getSourceAndTargetRoleType_TargetScope(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "targetScope"
           });		
        addAnnotation
          (getSourceAndTargetRoleType_Visibility(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "visibility"
           });		
        addAnnotation
          (sourceAndTargetTypeEClass, 
           source, 
           new String[] 
           {
             "name", "sourceAndTargetType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getSourceAndTargetType_Model(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "model"
           });		
        addAnnotation
          (getSourceAndTargetType_Role(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "role"
           });		
        addAnnotation
          (getSourceAndTargetType_Type(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "type"
           });		
        addAnnotation
          (getSourceAndTargetType_Modifiers(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "modifiers"
           });		
        addAnnotation
          (getSourceAndTargetType_Style(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "style"
           });		
        addAnnotation
          (getSourceAndTargetType_Documentation(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "documentation"
           });		
        addAnnotation
          (getSourceAndTargetType_Xrefs(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "xrefs"
           });		
        addAnnotation
          (getSourceAndTargetType_Tags(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "tags"
           });		
        addAnnotation
          (getSourceAndTargetType_Idref(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "idref",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (sourceAndTargetTypeTypeEClass, 
           source, 
           new String[] 
           {
             "name", "sourceAndTargetTypeType",
             "kind", "empty"
           });		
        addAnnotation
          (getSourceAndTargetTypeType_Aggregation(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "aggregation"
           });		
        addAnnotation
          (getSourceAndTargetTypeType_Containment(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "containment"
           });		
        addAnnotation
          (getSourceAndTargetTypeType_Multiplicity(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "multiplicity"
           });		
        addAnnotation
          (stereotypeAttributeTypeEClass, 
           source, 
           new String[] 
           {
             "name", "stereotypeAttributeType",
             "kind", "empty"
           });		
        addAnnotation
          (getStereotypeAttributeType_Stereotype(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "stereotype"
           });		
        addAnnotation
          (stereotypeTypeEEnum, 
           source, 
           new String[] 
           {
             "name", "stereotypeType"
           });		
        addAnnotation
          (stereotypeTypeObjectEDataType, 
           source, 
           new String[] 
           {
             "name", "stereotypeType:Object",
             "baseType", "stereotypeType"
           });		
        addAnnotation
          (styleexTypeEClass, 
           source, 
           new String[] 
           {
             "name", "styleexType",
             "kind", "empty"
           });		
        addAnnotation
          (getStyleexType_Value(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "value"
           });		
        addAnnotation
          (sTypeTypeEEnum, 
           source, 
           new String[] 
           {
             "name", "sTypeType"
           });		
        addAnnotation
          (sTypeTypeObjectEDataType, 
           source, 
           new String[] 
           {
             "name", "sTypeType:Object",
             "baseType", "sTypeType"
           });		
        addAnnotation
          (tagTypeEClass, 
           source, 
           new String[] 
           {
             "name", "tagType",
             "kind", "empty"
           });		
        addAnnotation
          (getTagType_Id(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "id",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getTagType_Name(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getTagType_Notes(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "notes"
           });		
        addAnnotation
          (getTagType_Value(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "value"
           });		
        addAnnotation
          (typeBaseTypeEEnum, 
           source, 
           new String[] 
           {
             "name", "typeBaseType"
           });		
        addAnnotation
          (typeBaseTypeObjectEDataType, 
           source, 
           new String[] 
           {
             "name", "typeBaseType:Object",
             "baseType", "typeBaseType"
           });		
        addAnnotation
          (documentRootEClass, 
           source, 
           new String[] 
           {
             "name", "",
             "kind", "mixed"
           });		
        addAnnotation
          (getDocumentRoot_Mixed(), 
           source, 
           new String[] 
           {
             "kind", "elementWildcard",
             "name", ":mixed"
           });		
        addAnnotation
          (getDocumentRoot_XMLNSPrefixMap(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "xmlns:prefix"
           });		
        addAnnotation
          (getDocumentRoot_XSISchemaLocation(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "xsi:schemaLocation"
           });		
        addAnnotation
          (getDocumentRoot_XMI(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "XMI",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Id(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "id",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Idref(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "idref",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Type(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "type",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getDocumentRoot_Version(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "version",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (xmiTypeEClass, 
           source, 
           new String[] 
           {
             "name", "XMI_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getXMIType_Documentation(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "Documentation",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getXMIType_Model(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "Model",
             "namespace", "uml.Franca2EA_UML_Schema"
           });		
        addAnnotation
          (getXMIType_Extension(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "Extension",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (getXMIType_Version(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "version",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (xrefsTypeEClass, 
           source, 
           new String[] 
           {
             "name", "xrefsType",
             "kind", "empty"
           });		
        addAnnotation
          (getXrefsType_Value(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "value"
           });
    }

} //XmeiPackageImpl
