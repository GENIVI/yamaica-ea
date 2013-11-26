/**
 */
package xmei;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see xmei.XmeiFactory
 * @model kind="package"
 * @generated
 */
public interface XmeiPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "xmei";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "xmei.Franca2EA_XMI_Schema";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "xmei";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    XmeiPackage eINSTANCE = xmei.impl.XmeiPackageImpl.init();

    /**
     * The meta object id for the '{@link xmei.impl.AttributeContainmentTypeImpl <em>Attribute Containment Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.AttributeContainmentTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getAttributeContainmentType()
     * @generated
     */
    int ATTRIBUTE_CONTAINMENT_TYPE = 0;

    /**
     * The feature id for the '<em><b>Containment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_CONTAINMENT_TYPE__CONTAINMENT = 0;

    /**
     * The feature id for the '<em><b>Position</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_CONTAINMENT_TYPE__POSITION = 1;

    /**
     * The number of structural features of the '<em>Attribute Containment Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_CONTAINMENT_TYPE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Attribute Containment Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_CONTAINMENT_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.AttributeModelTypeImpl <em>Attribute Model Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.AttributeModelTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getAttributeModelType()
     * @generated
     */
    int ATTRIBUTE_MODEL_TYPE = 1;

    /**
     * The feature id for the '<em><b>Ea Guid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_MODEL_TYPE__EA_GUID = 0;

    /**
     * The feature id for the '<em><b>Ea Localid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_MODEL_TYPE__EA_LOCALID = 1;

    /**
     * The number of structural features of the '<em>Attribute Model Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_MODEL_TYPE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Attribute Model Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_MODEL_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.AttributePropertiesTypeImpl <em>Attribute Properties Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.AttributePropertiesTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getAttributePropertiesType()
     * @generated
     */
    int ATTRIBUTE_PROPERTIES_TYPE = 2;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_PROPERTIES_TYPE__TYPE = 0;

    /**
     * The number of structural features of the '<em>Attribute Properties Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_PROPERTIES_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Attribute Properties Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_PROPERTIES_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.AttributesTypeImpl <em>Attributes Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.AttributesTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getAttributesType()
     * @generated
     */
    int ATTRIBUTES_TYPE = 3;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTES_TYPE__ATTRIBUTE = 0;

    /**
     * The number of structural features of the '<em>Attributes Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTES_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Attributes Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTES_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.AttributeTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getAttributeType()
     * @generated
     */
    int ATTRIBUTE_TYPE = 4;

    /**
     * The feature id for the '<em><b>Initial</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__INITIAL = 0;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__DOCUMENTATION = 1;

    /**
     * The feature id for the '<em><b>Model</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__MODEL = 2;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__PROPERTIES = 3;

    /**
     * The feature id for the '<em><b>Containment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__CONTAINMENT = 4;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__STEREOTYPE = 5;

    /**
     * The feature id for the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__BOUNDS = 6;

    /**
     * The feature id for the '<em><b>Styleex</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__STYLEEX = 7;

    /**
     * The feature id for the '<em><b>Xrefs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__XREFS = 8;

    /**
     * The feature id for the '<em><b>Idref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__IDREF = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__NAME = 10;

    /**
     * The feature id for the '<em><b>Scope</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE__SCOPE = 11;

    /**
     * The number of structural features of the '<em>Attribute Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE_FEATURE_COUNT = 12;

    /**
     * The number of operations of the '<em>Attribute Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.BoundsTypeImpl <em>Bounds Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.BoundsTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getBoundsType()
     * @generated
     */
    int BOUNDS_TYPE = 5;

    /**
     * The feature id for the '<em><b>Lower</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS_TYPE__LOWER = 0;

    /**
     * The feature id for the '<em><b>Upper</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS_TYPE__UPPER = 1;

    /**
     * The number of structural features of the '<em>Bounds Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS_TYPE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Bounds Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOUNDS_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.CodeTypeImpl <em>Code Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.CodeTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getCodeType()
     * @generated
     */
    int CODE_TYPE = 6;

    /**
     * The feature id for the '<em><b>Gentype</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CODE_TYPE__GENTYPE = 0;

    /**
     * The number of structural features of the '<em>Code Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CODE_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Code Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CODE_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.ConcreteLinkTypeImpl <em>Concrete Link Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.ConcreteLinkTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getConcreteLinkType()
     * @generated
     */
    int CONCRETE_LINK_TYPE = 7;

    /**
     * The feature id for the '<em><b>End</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_LINK_TYPE__END = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_LINK_TYPE__ID = 1;

    /**
     * The feature id for the '<em><b>Start</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_LINK_TYPE__START = 2;

    /**
     * The number of structural features of the '<em>Concrete Link Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_LINK_TYPE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Concrete Link Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONCRETE_LINK_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.ConnectorAppearanceTypeImpl <em>Connector Appearance Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.ConnectorAppearanceTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getConnectorAppearanceType()
     * @generated
     */
    int CONNECTOR_APPEARANCE_TYPE = 8;

    /**
     * The feature id for the '<em><b>Head Style</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_APPEARANCE_TYPE__HEAD_STYLE = 0;

    /**
     * The feature id for the '<em><b>Linecolor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_APPEARANCE_TYPE__LINECOLOR = 1;

    /**
     * The feature id for the '<em><b>Linemode</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_APPEARANCE_TYPE__LINEMODE = 2;

    /**
     * The feature id for the '<em><b>Line Style</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_APPEARANCE_TYPE__LINE_STYLE = 3;

    /**
     * The feature id for the '<em><b>Linewidth</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_APPEARANCE_TYPE__LINEWIDTH = 4;

    /**
     * The feature id for the '<em><b>Seqno</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_APPEARANCE_TYPE__SEQNO = 5;

    /**
     * The number of structural features of the '<em>Connector Appearance Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_APPEARANCE_TYPE_FEATURE_COUNT = 6;

    /**
     * The number of operations of the '<em>Connector Appearance Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_APPEARANCE_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.ConnectorLabelsTypeImpl <em>Connector Labels Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.ConnectorLabelsTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getConnectorLabelsType()
     * @generated
     */
    int CONNECTOR_LABELS_TYPE = 9;

    /**
     * The feature id for the '<em><b>Lb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_LABELS_TYPE__LB = 0;

    /**
     * The feature id for the '<em><b>Mb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_LABELS_TYPE__MB = 1;

    /**
     * The feature id for the '<em><b>Mt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_LABELS_TYPE__MT = 2;

    /**
     * The number of structural features of the '<em>Connector Labels Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_LABELS_TYPE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Connector Labels Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_LABELS_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.ConnectorModelTypeImpl <em>Connector Model Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.ConnectorModelTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getConnectorModelType()
     * @generated
     */
    int CONNECTOR_MODEL_TYPE = 10;

    /**
     * The feature id for the '<em><b>Ea Localid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_MODEL_TYPE__EA_LOCALID = 0;

    /**
     * The number of structural features of the '<em>Connector Model Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_MODEL_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Connector Model Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_MODEL_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.ConnectorModifiersTypeImpl <em>Connector Modifiers Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.ConnectorModifiersTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getConnectorModifiersType()
     * @generated
     */
    int CONNECTOR_MODIFIERS_TYPE = 11;

    /**
     * The feature id for the '<em><b>Changeable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_MODIFIERS_TYPE__CHANGEABLE = 0;

    /**
     * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_MODIFIERS_TYPE__IS_LEAF = 1;

    /**
     * The feature id for the '<em><b>Is Navigable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_MODIFIERS_TYPE__IS_NAVIGABLE = 2;

    /**
     * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_MODIFIERS_TYPE__IS_ORDERED = 3;

    /**
     * The feature id for the '<em><b>Is Root</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_MODIFIERS_TYPE__IS_ROOT = 4;

    /**
     * The number of structural features of the '<em>Connector Modifiers Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_MODIFIERS_TYPE_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Connector Modifiers Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_MODIFIERS_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.ConnectorPropertiesTypeImpl <em>Connector Properties Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.ConnectorPropertiesTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getConnectorPropertiesType()
     * @generated
     */
    int CONNECTOR_PROPERTIES_TYPE = 12;

    /**
     * The feature id for the '<em><b>Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_PROPERTIES_TYPE__DIRECTION = 0;

    /**
     * The feature id for the '<em><b>Ea Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_PROPERTIES_TYPE__EA_TYPE = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_PROPERTIES_TYPE__NAME = 2;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_PROPERTIES_TYPE__STEREOTYPE = 3;

    /**
     * The number of structural features of the '<em>Connector Properties Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_PROPERTIES_TYPE_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Connector Properties Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_PROPERTIES_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.ConnectorsTypeImpl <em>Connectors Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.ConnectorsTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getConnectorsType()
     * @generated
     */
    int CONNECTORS_TYPE = 13;

    /**
     * The feature id for the '<em><b>Connector</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTORS_TYPE__CONNECTOR = 0;

    /**
     * The number of structural features of the '<em>Connectors Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTORS_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Connectors Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTORS_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.ConnectorTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getConnectorType()
     * @generated
     */
    int CONNECTOR_TYPE = 14;

    /**
     * The feature id for the '<em><b>Source</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__SOURCE = 0;

    /**
     * The feature id for the '<em><b>Target</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__TARGET = 1;

    /**
     * The feature id for the '<em><b>Model</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__MODEL = 2;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__PROPERTIES = 3;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__MODIFIERS = 4;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__DOCUMENTATION = 5;

    /**
     * The feature id for the '<em><b>Appearance</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__APPEARANCE = 6;

    /**
     * The feature id for the '<em><b>Labels</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__LABELS = 7;

    /**
     * The feature id for the '<em><b>Extended Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__EXTENDED_PROPERTIES = 8;

    /**
     * The feature id for the '<em><b>Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__STYLE = 9;

    /**
     * The feature id for the '<em><b>Xrefs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__XREFS = 10;

    /**
     * The feature id for the '<em><b>Tags</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__TAGS = 11;

    /**
     * The feature id for the '<em><b>Idref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE__IDREF = 12;

    /**
     * The number of structural features of the '<em>Connector Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE_FEATURE_COUNT = 13;

    /**
     * The number of operations of the '<em>Connector Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNECTOR_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.DiagramElementsTypeImpl <em>Diagram Elements Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.DiagramElementsTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getDiagramElementsType()
     * @generated
     */
    int DIAGRAM_ELEMENTS_TYPE = 15;

    /**
     * The feature id for the '<em><b>Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_ELEMENTS_TYPE__ELEMENT = 0;

    /**
     * The number of structural features of the '<em>Diagram Elements Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_ELEMENTS_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Diagram Elements Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_ELEMENTS_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.DiagramElementTypeImpl <em>Diagram Element Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.DiagramElementTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getDiagramElementType()
     * @generated
     */
    int DIAGRAM_ELEMENT_TYPE = 16;

    /**
     * The feature id for the '<em><b>Geometry</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_ELEMENT_TYPE__GEOMETRY = 0;

    /**
     * The feature id for the '<em><b>Seqno</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_ELEMENT_TYPE__SEQNO = 1;

    /**
     * The feature id for the '<em><b>Style</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_ELEMENT_TYPE__STYLE = 2;

    /**
     * The feature id for the '<em><b>Subject</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_ELEMENT_TYPE__SUBJECT = 3;

    /**
     * The number of structural features of the '<em>Diagram Element Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_ELEMENT_TYPE_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Diagram Element Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_ELEMENT_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.DiagramModelTypeImpl <em>Diagram Model Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.DiagramModelTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getDiagramModelType()
     * @generated
     */
    int DIAGRAM_MODEL_TYPE = 17;

    /**
     * The feature id for the '<em><b>Local ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_MODEL_TYPE__LOCAL_ID = 0;

    /**
     * The feature id for the '<em><b>Owner</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_MODEL_TYPE__OWNER = 1;

    /**
     * The feature id for the '<em><b>Package</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_MODEL_TYPE__PACKAGE = 2;

    /**
     * The feature id for the '<em><b>Parent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_MODEL_TYPE__PARENT = 3;

    /**
     * The number of structural features of the '<em>Diagram Model Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_MODEL_TYPE_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Diagram Model Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_MODEL_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.DiagramPropertiesTypeImpl <em>Diagram Properties Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.DiagramPropertiesTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getDiagramPropertiesType()
     * @generated
     */
    int DIAGRAM_PROPERTIES_TYPE = 18;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_PROPERTIES_TYPE__NAME = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_PROPERTIES_TYPE__TYPE = 1;

    /**
     * The number of structural features of the '<em>Diagram Properties Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_PROPERTIES_TYPE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Diagram Properties Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_PROPERTIES_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.DiagramsTypeImpl <em>Diagrams Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.DiagramsTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getDiagramsType()
     * @generated
     */
    int DIAGRAMS_TYPE = 19;

    /**
     * The feature id for the '<em><b>Diagram</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAMS_TYPE__DIAGRAM = 0;

    /**
     * The number of structural features of the '<em>Diagrams Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAMS_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Diagrams Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAMS_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.DiagramTypeImpl <em>Diagram Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.DiagramTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getDiagramType()
     * @generated
     */
    int DIAGRAM_TYPE = 20;

    /**
     * The feature id for the '<em><b>Model</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_TYPE__MODEL = 0;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_TYPE__PROPERTIES = 1;

    /**
     * The feature id for the '<em><b>Project</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_TYPE__PROJECT = 2;

    /**
     * The feature id for the '<em><b>Style1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_TYPE__STYLE1 = 3;

    /**
     * The feature id for the '<em><b>Style2</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_TYPE__STYLE2 = 4;

    /**
     * The feature id for the '<em><b>Swimlanes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_TYPE__SWIMLANES = 5;

    /**
     * The feature id for the '<em><b>Matrixitems</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_TYPE__MATRIXITEMS = 6;

    /**
     * The feature id for the '<em><b>Elements</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_TYPE__ELEMENTS = 7;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_TYPE__ID = 8;

    /**
     * The number of structural features of the '<em>Diagram Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_TYPE_FEATURE_COUNT = 9;

    /**
     * The number of operations of the '<em>Diagram Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DIAGRAM_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.DocumentationImpl <em>Documentation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.DocumentationImpl
     * @see xmei.impl.XmeiPackageImpl#getDocumentation()
     * @generated
     */
    int DOCUMENTATION = 21;

    /**
     * The feature id for the '<em><b>Exporter</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__EXPORTER = 0;

    /**
     * The feature id for the '<em><b>Exporter Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION__EXPORTER_VERSION = 1;

    /**
     * The number of structural features of the '<em>Documentation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Documentation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.DocumentationTypeImpl <em>Documentation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.DocumentationTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getDocumentationType()
     * @generated
     */
    int DOCUMENTATION_TYPE = 22;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION_TYPE__VALUE = 0;

    /**
     * The number of structural features of the '<em>Documentation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Documentation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENTATION_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.ElementsTypeImpl <em>Elements Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.ElementsTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getElementsType()
     * @generated
     */
    int ELEMENTS_TYPE = 23;

    /**
     * The feature id for the '<em><b>Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENTS_TYPE__ELEMENT = 0;

    /**
     * The number of structural features of the '<em>Elements Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENTS_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Elements Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENTS_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.ElementTypeImpl <em>Element Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.ElementTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getElementType()
     * @generated
     */
    int ELEMENT_TYPE = 24;

    /**
     * The feature id for the '<em><b>Model</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__MODEL = 0;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__PROPERTIES = 1;

    /**
     * The feature id for the '<em><b>Project</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__PROJECT = 2;

    /**
     * The feature id for the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__CODE = 3;

    /**
     * The feature id for the '<em><b>Links</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__LINKS = 4;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__ATTRIBUTES = 5;

    /**
     * The feature id for the '<em><b>Operations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__OPERATIONS = 6;

    /**
     * The feature id for the '<em><b>Idref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__IDREF = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__NAME = 8;

    /**
     * The feature id for the '<em><b>Scope</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__SCOPE = 9;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE__TYPE = 10;

    /**
     * The number of structural features of the '<em>Element Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE_FEATURE_COUNT = 11;

    /**
     * The number of operations of the '<em>Element Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELEMENT_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.ExtendedPropertiesTypeImpl <em>Extended Properties Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.ExtendedPropertiesTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getExtendedPropertiesType()
     * @generated
     */
    int EXTENDED_PROPERTIES_TYPE = 25;

    /**
     * The feature id for the '<em><b>Conditional</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDED_PROPERTIES_TYPE__CONDITIONAL = 0;

    /**
     * The feature id for the '<em><b>Diagram</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDED_PROPERTIES_TYPE__DIAGRAM = 1;

    /**
     * The feature id for the '<em><b>Privatedata1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDED_PROPERTIES_TYPE__PRIVATEDATA1 = 2;

    /**
     * The feature id for the '<em><b>Privatedata2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDED_PROPERTIES_TYPE__PRIVATEDATA2 = 3;

    /**
     * The feature id for the '<em><b>Privatedata3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDED_PROPERTIES_TYPE__PRIVATEDATA3 = 4;

    /**
     * The feature id for the '<em><b>Privatedata4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDED_PROPERTIES_TYPE__PRIVATEDATA4 = 5;

    /**
     * The feature id for the '<em><b>Privatedata5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDED_PROPERTIES_TYPE__PRIVATEDATA5 = 6;

    /**
     * The feature id for the '<em><b>Sequence Points</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDED_PROPERTIES_TYPE__SEQUENCE_POINTS = 7;

    /**
     * The feature id for the '<em><b>Stateflags</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDED_PROPERTIES_TYPE__STATEFLAGS = 8;

    /**
     * The feature id for the '<em><b>Virtual Inheritance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDED_PROPERTIES_TYPE__VIRTUAL_INHERITANCE = 9;

    /**
     * The number of structural features of the '<em>Extended Properties Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDED_PROPERTIES_TYPE_FEATURE_COUNT = 10;

    /**
     * The number of operations of the '<em>Extended Properties Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENDED_PROPERTIES_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.ExtensionImpl <em>Extension</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.ExtensionImpl
     * @see xmei.impl.XmeiPackageImpl#getExtension()
     * @generated
     */
    int EXTENSION = 26;

    /**
     * The feature id for the '<em><b>Elements</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION__ELEMENTS = 0;

    /**
     * The feature id for the '<em><b>Connectors</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION__CONNECTORS = 1;

    /**
     * The feature id for the '<em><b>Primitivetypes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION__PRIMITIVETYPES = 2;

    /**
     * The feature id for the '<em><b>Profiles</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION__PROFILES = 3;

    /**
     * The feature id for the '<em><b>Diagrams</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION__DIAGRAMS = 4;

    /**
     * The feature id for the '<em><b>Extender</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION__EXTENDER = 5;

    /**
     * The feature id for the '<em><b>Extender ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION__EXTENDER_ID = 6;

    /**
     * The number of structural features of the '<em>Extension</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_FEATURE_COUNT = 7;

    /**
     * The number of operations of the '<em>Extension</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXTENSION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.InitialTypeImpl <em>Initial Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.InitialTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getInitialType()
     * @generated
     */
    int INITIAL_TYPE = 27;

    /**
     * The feature id for the '<em><b>Body</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIAL_TYPE__BODY = 0;

    /**
     * The number of structural features of the '<em>Initial Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIAL_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Initial Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INITIAL_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.LinksTypeImpl <em>Links Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.LinksTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getLinksType()
     * @generated
     */
    int LINKS_TYPE = 28;

    /**
     * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKS_TYPE__SEQUENCE = 0;

    /**
     * The feature id for the '<em><b>Realisation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKS_TYPE__REALISATION = 1;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKS_TYPE__GENERALIZATION = 2;

    /**
     * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKS_TYPE__DEPENDENCY = 3;

    /**
     * The feature id for the '<em><b>Association</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKS_TYPE__ASSOCIATION = 4;

    /**
     * The number of structural features of the '<em>Links Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKS_TYPE_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Links Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKS_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.ModelTypeImpl <em>Model Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.ModelTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getModelType()
     * @generated
     */
    int MODEL_TYPE = 29;

    /**
     * The feature id for the '<em><b>Ea Ele Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TYPE__EA_ELE_TYPE = 0;

    /**
     * The feature id for the '<em><b>Ea Localid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TYPE__EA_LOCALID = 1;

    /**
     * The feature id for the '<em><b>Owner</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TYPE__OWNER = 2;

    /**
     * The feature id for the '<em><b>Package</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TYPE__PACKAGE = 3;

    /**
     * The feature id for the '<em><b>Package2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TYPE__PACKAGE2 = 4;

    /**
     * The feature id for the '<em><b>Tpos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TYPE__TPOS = 5;

    /**
     * The number of structural features of the '<em>Model Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TYPE_FEATURE_COUNT = 6;

    /**
     * The number of operations of the '<em>Model Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.OperationParametersTypeImpl <em>Operation Parameters Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.OperationParametersTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getOperationParametersType()
     * @generated
     */
    int OPERATION_PARAMETERS_TYPE = 30;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_PARAMETERS_TYPE__PARAMETER = 0;

    /**
     * The number of structural features of the '<em>Operation Parameters Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_PARAMETERS_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Operation Parameters Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_PARAMETERS_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.OperationPropertiesTypeImpl <em>Operation Properties Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.OperationPropertiesTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getOperationPropertiesType()
     * @generated
     */
    int OPERATION_PROPERTIES_TYPE = 31;

    /**
     * The feature id for the '<em><b>Position</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_PROPERTIES_TYPE__POSITION = 0;

    /**
     * The number of structural features of the '<em>Operation Properties Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_PROPERTIES_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Operation Properties Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_PROPERTIES_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.OperationsTypeImpl <em>Operations Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.OperationsTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getOperationsType()
     * @generated
     */
    int OPERATIONS_TYPE = 32;

    /**
     * The feature id for the '<em><b>Operation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATIONS_TYPE__OPERATION = 0;

    /**
     * The number of structural features of the '<em>Operations Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATIONS_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Operations Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATIONS_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.OperationTagsTypeImpl <em>Operation Tags Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.OperationTagsTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getOperationTagsType()
     * @generated
     */
    int OPERATION_TAGS_TYPE = 33;

    /**
     * The feature id for the '<em><b>Tag</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TAGS_TYPE__TAG = 0;

    /**
     * The number of structural features of the '<em>Operation Tags Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TAGS_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Operation Tags Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TAGS_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.OperationTypeImpl <em>Operation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.OperationTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getOperationType()
     * @generated
     */
    int OPERATION_TYPE = 34;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE__PROPERTIES = 0;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE__STEREOTYPE = 1;

    /**
     * The feature id for the '<em><b>Model</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE__MODEL = 2;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE__TYPE = 3;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE__DOCUMENTATION = 4;

    /**
     * The feature id for the '<em><b>Tags</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE__TAGS = 5;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE__PARAMETERS = 6;

    /**
     * The feature id for the '<em><b>Xrefs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE__XREFS = 7;

    /**
     * The feature id for the '<em><b>Idref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE__IDREF = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE__NAME = 9;

    /**
     * The feature id for the '<em><b>Scope</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE__SCOPE = 10;

    /**
     * The number of structural features of the '<em>Operation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE_FEATURE_COUNT = 11;

    /**
     * The number of operations of the '<em>Operation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.OperationTypeTypeImpl <em>Operation Type Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.OperationTypeTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getOperationTypeType()
     * @generated
     */
    int OPERATION_TYPE_TYPE = 35;

    /**
     * The feature id for the '<em><b>Concurrency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE_TYPE__CONCURRENCY = 0;

    /**
     * The feature id for the '<em><b>Const</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE_TYPE__CONST = 1;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE_TYPE__IS_ABSTRACT = 2;

    /**
     * The feature id for the '<em><b>Is Query</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE_TYPE__IS_QUERY = 3;

    /**
     * The feature id for the '<em><b>Pure</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE_TYPE__PURE = 4;

    /**
     * The feature id for the '<em><b>Returnarray</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE_TYPE__RETURNARRAY = 5;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE_TYPE__STATIC = 6;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE_TYPE__STEREOTYPE = 7;

    /**
     * The feature id for the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE_TYPE__SYNCHRONISED = 8;

    /**
     * The number of structural features of the '<em>Operation Type Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE_TYPE_FEATURE_COUNT = 9;

    /**
     * The number of operations of the '<em>Operation Type Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPERATION_TYPE_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.ParameterPropertiesTypeImpl <em>Parameter Properties Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.ParameterPropertiesTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getParameterPropertiesType()
     * @generated
     */
    int PARAMETER_PROPERTIES_TYPE = 36;

    /**
     * The feature id for the '<em><b>Classifier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_PROPERTIES_TYPE__CLASSIFIER = 0;

    /**
     * The feature id for the '<em><b>Const</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_PROPERTIES_TYPE__CONST = 1;

    /**
     * The feature id for the '<em><b>Ea Guid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_PROPERTIES_TYPE__EA_GUID = 2;

    /**
     * The feature id for the '<em><b>Pos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_PROPERTIES_TYPE__POS = 3;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_PROPERTIES_TYPE__TYPE = 4;

    /**
     * The number of structural features of the '<em>Parameter Properties Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_PROPERTIES_TYPE_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Parameter Properties Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_PROPERTIES_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.ParameterTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getParameterType()
     * @generated
     */
    int PARAMETER_TYPE = 37;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__PROPERTIES = 0;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__DOCUMENTATION = 1;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__VALUE = 2;

    /**
     * The feature id for the '<em><b>Xrefs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__XREFS = 3;

    /**
     * The feature id for the '<em><b>Idref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__IDREF = 4;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE__VISIBILITY = 5;

    /**
     * The number of structural features of the '<em>Parameter Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE_FEATURE_COUNT = 6;

    /**
     * The number of operations of the '<em>Parameter Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.PrimitiveTypesTypeImpl <em>Primitive Types Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.PrimitiveTypesTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getPrimitiveTypesType()
     * @generated
     */
    int PRIMITIVE_TYPES_TYPE = 38;

    /**
     * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPES_TYPE__PACKAGED_ELEMENT = 0;

    /**
     * The number of structural features of the '<em>Primitive Types Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPES_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Primitive Types Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPES_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.ProjectTypeImpl <em>Project Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.ProjectTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getProjectType()
     * @generated
     */
    int PROJECT_TYPE = 39;

    /**
     * The feature id for the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_TYPE__AUTHOR = 0;

    /**
     * The feature id for the '<em><b>Created</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_TYPE__CREATED = 1;

    /**
     * The feature id for the '<em><b>Modified</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_TYPE__MODIFIED = 2;

    /**
     * The feature id for the '<em><b>Phase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_TYPE__PHASE = 3;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_TYPE__VERSION = 4;

    /**
     * The number of structural features of the '<em>Project Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_TYPE_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Project Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROJECT_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.PropertiesTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getPropertiesType()
     * @generated
     */
    int PROPERTIES_TYPE = 40;

    /**
     * The feature id for the '<em><b>Class Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES_TYPE__CLASS_NAME = 0;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES_TYPE__DOCUMENTATION = 1;

    /**
     * The feature id for the '<em><b>Genlinks</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES_TYPE__GENLINKS = 2;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES_TYPE__IS_ABSTRACT = 3;

    /**
     * The feature id for the '<em><b>Is Active</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES_TYPE__IS_ACTIVE = 4;

    /**
     * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES_TYPE__IS_LEAF = 5;

    /**
     * The feature id for the '<em><b>Is Root</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES_TYPE__IS_ROOT = 6;

    /**
     * The feature id for the '<em><b>Is Specification</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES_TYPE__IS_SPECIFICATION = 7;

    /**
     * The feature id for the '<em><b>Scope</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES_TYPE__SCOPE = 8;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES_TYPE__STEREOTYPE = 9;

    /**
     * The feature id for the '<em><b>SType</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES_TYPE__STYPE = 10;

    /**
     * The number of structural features of the '<em>Properties Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES_TYPE_FEATURE_COUNT = 11;

    /**
     * The number of operations of the '<em>Properties Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTIES_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.SourceAndTargetModelTypeImpl <em>Source And Target Model Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.SourceAndTargetModelTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getSourceAndTargetModelType()
     * @generated
     */
    int SOURCE_AND_TARGET_MODEL_TYPE = 41;

    /**
     * The feature id for the '<em><b>Ea Localid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_MODEL_TYPE__EA_LOCALID = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_MODEL_TYPE__NAME = 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_MODEL_TYPE__TYPE = 2;

    /**
     * The number of structural features of the '<em>Source And Target Model Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_MODEL_TYPE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Source And Target Model Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_MODEL_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.SourceAndTargetRoleTypeImpl <em>Source And Target Role Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.SourceAndTargetRoleTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getSourceAndTargetRoleType()
     * @generated
     */
    int SOURCE_AND_TARGET_ROLE_TYPE = 42;

    /**
     * The feature id for the '<em><b>Target Scope</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_ROLE_TYPE__TARGET_SCOPE = 0;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_ROLE_TYPE__VISIBILITY = 1;

    /**
     * The number of structural features of the '<em>Source And Target Role Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_ROLE_TYPE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Source And Target Role Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_ROLE_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.SourceAndTargetTypeImpl <em>Source And Target Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.SourceAndTargetTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getSourceAndTargetType()
     * @generated
     */
    int SOURCE_AND_TARGET_TYPE = 43;

    /**
     * The feature id for the '<em><b>Model</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_TYPE__MODEL = 0;

    /**
     * The feature id for the '<em><b>Role</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_TYPE__ROLE = 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_TYPE__TYPE = 2;

    /**
     * The feature id for the '<em><b>Modifiers</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_TYPE__MODIFIERS = 3;

    /**
     * The feature id for the '<em><b>Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_TYPE__STYLE = 4;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_TYPE__DOCUMENTATION = 5;

    /**
     * The feature id for the '<em><b>Xrefs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_TYPE__XREFS = 6;

    /**
     * The feature id for the '<em><b>Tags</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_TYPE__TAGS = 7;

    /**
     * The feature id for the '<em><b>Idref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_TYPE__IDREF = 8;

    /**
     * The number of structural features of the '<em>Source And Target Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_TYPE_FEATURE_COUNT = 9;

    /**
     * The number of operations of the '<em>Source And Target Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.SourceAndTargetTypeTypeImpl <em>Source And Target Type Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.SourceAndTargetTypeTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getSourceAndTargetTypeType()
     * @generated
     */
    int SOURCE_AND_TARGET_TYPE_TYPE = 44;

    /**
     * The feature id for the '<em><b>Aggregation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_TYPE_TYPE__AGGREGATION = 0;

    /**
     * The feature id for the '<em><b>Containment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_TYPE_TYPE__CONTAINMENT = 1;

    /**
     * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_TYPE_TYPE__MULTIPLICITY = 2;

    /**
     * The number of structural features of the '<em>Source And Target Type Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_TYPE_TYPE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Source And Target Type Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOURCE_AND_TARGET_TYPE_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.StereotypeAttributeTypeImpl <em>Stereotype Attribute Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.StereotypeAttributeTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getStereotypeAttributeType()
     * @generated
     */
    int STEREOTYPE_ATTRIBUTE_TYPE = 45;

    /**
     * The feature id for the '<em><b>Stereotype</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STEREOTYPE_ATTRIBUTE_TYPE__STEREOTYPE = 0;

    /**
     * The number of structural features of the '<em>Stereotype Attribute Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STEREOTYPE_ATTRIBUTE_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Stereotype Attribute Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STEREOTYPE_ATTRIBUTE_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.StyleexTypeImpl <em>Styleex Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.StyleexTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getStyleexType()
     * @generated
     */
    int STYLEEX_TYPE = 46;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLEEX_TYPE__VALUE = 0;

    /**
     * The number of structural features of the '<em>Styleex Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLEEX_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Styleex Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLEEX_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.TagTypeImpl <em>Tag Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.TagTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getTagType()
     * @generated
     */
    int TAG_TYPE = 47;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAG_TYPE__ID = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAG_TYPE__NAME = 1;

    /**
     * The feature id for the '<em><b>Notes</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAG_TYPE__NOTES = 2;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAG_TYPE__VALUE = 3;

    /**
     * The number of structural features of the '<em>Tag Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAG_TYPE_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Tag Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TAG_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.DocumentRootImpl
     * @see xmei.impl.XmeiPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 48;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>XMI</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMI = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ID = 4;

    /**
     * The feature id for the '<em><b>Idref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__IDREF = 5;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__TYPE = 6;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__VERSION = 7;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 8;

    /**
     * The number of operations of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.XMITypeImpl <em>XMI Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.XMITypeImpl
     * @see xmei.impl.XmeiPackageImpl#getXMIType()
     * @generated
     */
    int XMI_TYPE = 49;

    /**
     * The feature id for the '<em><b>Documentation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XMI_TYPE__DOCUMENTATION = 0;

    /**
     * The feature id for the '<em><b>Model</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XMI_TYPE__MODEL = 1;

    /**
     * The feature id for the '<em><b>Extension</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XMI_TYPE__EXTENSION = 2;

    /**
     * The feature id for the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XMI_TYPE__VERSION = 3;

    /**
     * The number of structural features of the '<em>XMI Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XMI_TYPE_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>XMI Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XMI_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.impl.XrefsTypeImpl <em>Xrefs Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.impl.XrefsTypeImpl
     * @see xmei.impl.XmeiPackageImpl#getXrefsType()
     * @generated
     */
    int XREFS_TYPE = 50;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XREFS_TYPE__VALUE = 0;

    /**
     * The number of structural features of the '<em>Xrefs Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XREFS_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Xrefs Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XREFS_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link xmei.AsyncSyncType <em>Async Sync Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.AsyncSyncType
     * @see xmei.impl.XmeiPackageImpl#getAsyncSyncType()
     * @generated
     */
    int ASYNC_SYNC_TYPE = 51;

    /**
     * The meta object id for the '{@link xmei.DiagramTypeType <em>Diagram Type Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.DiagramTypeType
     * @see xmei.impl.XmeiPackageImpl#getDiagramTypeType()
     * @generated
     */
    int DIAGRAM_TYPE_TYPE = 52;

    /**
     * The meta object id for the '{@link xmei.DirectionType <em>Direction Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.DirectionType
     * @see xmei.impl.XmeiPackageImpl#getDirectionType()
     * @generated
     */
    int DIRECTION_TYPE = 53;

    /**
     * The meta object id for the '{@link xmei.EaTypesType <em>Ea Types Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.EaTypesType
     * @see xmei.impl.XmeiPackageImpl#getEaTypesType()
     * @generated
     */
    int EA_TYPES_TYPE = 54;

    /**
     * The meta object id for the '{@link xmei.StereotypeType <em>Stereotype Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.StereotypeType
     * @see xmei.impl.XmeiPackageImpl#getStereotypeType()
     * @generated
     */
    int STEREOTYPE_TYPE = 55;

    /**
     * The meta object id for the '{@link xmei.STypeType <em>SType Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.STypeType
     * @see xmei.impl.XmeiPackageImpl#getSTypeType()
     * @generated
     */
    int STYPE_TYPE = 56;

    /**
     * The meta object id for the '{@link xmei.TypeBaseType <em>Type Base Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.TypeBaseType
     * @see xmei.impl.XmeiPackageImpl#getTypeBaseType()
     * @generated
     */
    int TYPE_BASE_TYPE = 57;

    /**
     * The meta object id for the '<em>Async Sync Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.AsyncSyncType
     * @see xmei.impl.XmeiPackageImpl#getAsyncSyncTypeObject()
     * @generated
     */
    int ASYNC_SYNC_TYPE_OBJECT = 58;

    /**
     * The meta object id for the '<em>Diagram Type Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.DiagramTypeType
     * @see xmei.impl.XmeiPackageImpl#getDiagramTypeTypeObject()
     * @generated
     */
    int DIAGRAM_TYPE_TYPE_OBJECT = 59;

    /**
     * The meta object id for the '<em>Direction Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.DirectionType
     * @see xmei.impl.XmeiPackageImpl#getDirectionTypeObject()
     * @generated
     */
    int DIRECTION_TYPE_OBJECT = 60;

    /**
     * The meta object id for the '<em>Ea Types Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.EaTypesType
     * @see xmei.impl.XmeiPackageImpl#getEaTypesTypeObject()
     * @generated
     */
    int EA_TYPES_TYPE_OBJECT = 61;

    /**
     * The meta object id for the '<em>Id Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see xmei.impl.XmeiPackageImpl#getIdType()
     * @generated
     */
    int ID_TYPE = 62;

    /**
     * The meta object id for the '<em>Stereotype Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.StereotypeType
     * @see xmei.impl.XmeiPackageImpl#getStereotypeTypeObject()
     * @generated
     */
    int STEREOTYPE_TYPE_OBJECT = 63;

    /**
     * The meta object id for the '<em>SType Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.STypeType
     * @see xmei.impl.XmeiPackageImpl#getSTypeTypeObject()
     * @generated
     */
    int STYPE_TYPE_OBJECT = 64;

    /**
     * The meta object id for the '<em>Type Base Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xmei.TypeBaseType
     * @see xmei.impl.XmeiPackageImpl#getTypeBaseTypeObject()
     * @generated
     */
    int TYPE_BASE_TYPE_OBJECT = 65;


    /**
     * Returns the meta object for class '{@link xmei.AttributeContainmentType <em>Attribute Containment Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Containment Type</em>'.
     * @see xmei.AttributeContainmentType
     * @generated
     */
    EClass getAttributeContainmentType();

    /**
     * Returns the meta object for the attribute '{@link xmei.AttributeContainmentType#getContainment <em>Containment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Containment</em>'.
     * @see xmei.AttributeContainmentType#getContainment()
     * @see #getAttributeContainmentType()
     * @generated
     */
    EAttribute getAttributeContainmentType_Containment();

    /**
     * Returns the meta object for the attribute '{@link xmei.AttributeContainmentType#getPosition <em>Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Position</em>'.
     * @see xmei.AttributeContainmentType#getPosition()
     * @see #getAttributeContainmentType()
     * @generated
     */
    EAttribute getAttributeContainmentType_Position();

    /**
     * Returns the meta object for class '{@link xmei.AttributeModelType <em>Attribute Model Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Model Type</em>'.
     * @see xmei.AttributeModelType
     * @generated
     */
    EClass getAttributeModelType();

    /**
     * Returns the meta object for the attribute '{@link xmei.AttributeModelType#getEaGuid <em>Ea Guid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ea Guid</em>'.
     * @see xmei.AttributeModelType#getEaGuid()
     * @see #getAttributeModelType()
     * @generated
     */
    EAttribute getAttributeModelType_EaGuid();

    /**
     * Returns the meta object for the attribute '{@link xmei.AttributeModelType#getEaLocalid <em>Ea Localid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ea Localid</em>'.
     * @see xmei.AttributeModelType#getEaLocalid()
     * @see #getAttributeModelType()
     * @generated
     */
    EAttribute getAttributeModelType_EaLocalid();

    /**
     * Returns the meta object for class '{@link xmei.AttributePropertiesType <em>Attribute Properties Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Properties Type</em>'.
     * @see xmei.AttributePropertiesType
     * @generated
     */
    EClass getAttributePropertiesType();

    /**
     * Returns the meta object for the attribute '{@link xmei.AttributePropertiesType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see xmei.AttributePropertiesType#getType()
     * @see #getAttributePropertiesType()
     * @generated
     */
    EAttribute getAttributePropertiesType_Type();

    /**
     * Returns the meta object for class '{@link xmei.AttributesType <em>Attributes Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attributes Type</em>'.
     * @see xmei.AttributesType
     * @generated
     */
    EClass getAttributesType();

    /**
     * Returns the meta object for the containment reference list '{@link xmei.AttributesType#getAttribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute</em>'.
     * @see xmei.AttributesType#getAttribute()
     * @see #getAttributesType()
     * @generated
     */
    EReference getAttributesType_Attribute();

    /**
     * Returns the meta object for class '{@link xmei.AttributeType <em>Attribute Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Type</em>'.
     * @see xmei.AttributeType
     * @generated
     */
    EClass getAttributeType();

    /**
     * Returns the meta object for the containment reference '{@link xmei.AttributeType#getInitial <em>Initial</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Initial</em>'.
     * @see xmei.AttributeType#getInitial()
     * @see #getAttributeType()
     * @generated
     */
    EReference getAttributeType_Initial();

    /**
     * Returns the meta object for the containment reference '{@link xmei.AttributeType#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Documentation</em>'.
     * @see xmei.AttributeType#getDocumentation()
     * @see #getAttributeType()
     * @generated
     */
    EReference getAttributeType_Documentation();

    /**
     * Returns the meta object for the containment reference '{@link xmei.AttributeType#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Model</em>'.
     * @see xmei.AttributeType#getModel()
     * @see #getAttributeType()
     * @generated
     */
    EReference getAttributeType_Model();

    /**
     * Returns the meta object for the containment reference '{@link xmei.AttributeType#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Properties</em>'.
     * @see xmei.AttributeType#getProperties()
     * @see #getAttributeType()
     * @generated
     */
    EReference getAttributeType_Properties();

    /**
     * Returns the meta object for the containment reference '{@link xmei.AttributeType#getContainment <em>Containment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Containment</em>'.
     * @see xmei.AttributeType#getContainment()
     * @see #getAttributeType()
     * @generated
     */
    EReference getAttributeType_Containment();

    /**
     * Returns the meta object for the containment reference '{@link xmei.AttributeType#getStereotype <em>Stereotype</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Stereotype</em>'.
     * @see xmei.AttributeType#getStereotype()
     * @see #getAttributeType()
     * @generated
     */
    EReference getAttributeType_Stereotype();

    /**
     * Returns the meta object for the containment reference '{@link xmei.AttributeType#getBounds <em>Bounds</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Bounds</em>'.
     * @see xmei.AttributeType#getBounds()
     * @see #getAttributeType()
     * @generated
     */
    EReference getAttributeType_Bounds();

    /**
     * Returns the meta object for the containment reference '{@link xmei.AttributeType#getStyleex <em>Styleex</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Styleex</em>'.
     * @see xmei.AttributeType#getStyleex()
     * @see #getAttributeType()
     * @generated
     */
    EReference getAttributeType_Styleex();

    /**
     * Returns the meta object for the containment reference '{@link xmei.AttributeType#getXrefs <em>Xrefs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Xrefs</em>'.
     * @see xmei.AttributeType#getXrefs()
     * @see #getAttributeType()
     * @generated
     */
    EReference getAttributeType_Xrefs();

    /**
     * Returns the meta object for the attribute '{@link xmei.AttributeType#getIdref <em>Idref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idref</em>'.
     * @see xmei.AttributeType#getIdref()
     * @see #getAttributeType()
     * @generated
     */
    EAttribute getAttributeType_Idref();

    /**
     * Returns the meta object for the attribute '{@link xmei.AttributeType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see xmei.AttributeType#getName()
     * @see #getAttributeType()
     * @generated
     */
    EAttribute getAttributeType_Name();

    /**
     * Returns the meta object for the attribute '{@link xmei.AttributeType#getScope <em>Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scope</em>'.
     * @see xmei.AttributeType#getScope()
     * @see #getAttributeType()
     * @generated
     */
    EAttribute getAttributeType_Scope();

    /**
     * Returns the meta object for class '{@link xmei.BoundsType <em>Bounds Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bounds Type</em>'.
     * @see xmei.BoundsType
     * @generated
     */
    EClass getBoundsType();

    /**
     * Returns the meta object for the attribute '{@link xmei.BoundsType#getLower <em>Lower</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lower</em>'.
     * @see xmei.BoundsType#getLower()
     * @see #getBoundsType()
     * @generated
     */
    EAttribute getBoundsType_Lower();

    /**
     * Returns the meta object for the attribute '{@link xmei.BoundsType#getUpper <em>Upper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Upper</em>'.
     * @see xmei.BoundsType#getUpper()
     * @see #getBoundsType()
     * @generated
     */
    EAttribute getBoundsType_Upper();

    /**
     * Returns the meta object for class '{@link xmei.CodeType <em>Code Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Code Type</em>'.
     * @see xmei.CodeType
     * @generated
     */
    EClass getCodeType();

    /**
     * Returns the meta object for the attribute '{@link xmei.CodeType#getGentype <em>Gentype</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Gentype</em>'.
     * @see xmei.CodeType#getGentype()
     * @see #getCodeType()
     * @generated
     */
    EAttribute getCodeType_Gentype();

    /**
     * Returns the meta object for class '{@link xmei.ConcreteLinkType <em>Concrete Link Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Concrete Link Type</em>'.
     * @see xmei.ConcreteLinkType
     * @generated
     */
    EClass getConcreteLinkType();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConcreteLinkType#getEnd <em>End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>End</em>'.
     * @see xmei.ConcreteLinkType#getEnd()
     * @see #getConcreteLinkType()
     * @generated
     */
    EAttribute getConcreteLinkType_End();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConcreteLinkType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see xmei.ConcreteLinkType#getId()
     * @see #getConcreteLinkType()
     * @generated
     */
    EAttribute getConcreteLinkType_Id();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConcreteLinkType#getStart <em>Start</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Start</em>'.
     * @see xmei.ConcreteLinkType#getStart()
     * @see #getConcreteLinkType()
     * @generated
     */
    EAttribute getConcreteLinkType_Start();

    /**
     * Returns the meta object for class '{@link xmei.ConnectorAppearanceType <em>Connector Appearance Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connector Appearance Type</em>'.
     * @see xmei.ConnectorAppearanceType
     * @generated
     */
    EClass getConnectorAppearanceType();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConnectorAppearanceType#getHeadStyle <em>Head Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Head Style</em>'.
     * @see xmei.ConnectorAppearanceType#getHeadStyle()
     * @see #getConnectorAppearanceType()
     * @generated
     */
    EAttribute getConnectorAppearanceType_HeadStyle();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConnectorAppearanceType#getLinecolor <em>Linecolor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Linecolor</em>'.
     * @see xmei.ConnectorAppearanceType#getLinecolor()
     * @see #getConnectorAppearanceType()
     * @generated
     */
    EAttribute getConnectorAppearanceType_Linecolor();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConnectorAppearanceType#getLinemode <em>Linemode</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Linemode</em>'.
     * @see xmei.ConnectorAppearanceType#getLinemode()
     * @see #getConnectorAppearanceType()
     * @generated
     */
    EAttribute getConnectorAppearanceType_Linemode();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConnectorAppearanceType#getLineStyle <em>Line Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Line Style</em>'.
     * @see xmei.ConnectorAppearanceType#getLineStyle()
     * @see #getConnectorAppearanceType()
     * @generated
     */
    EAttribute getConnectorAppearanceType_LineStyle();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConnectorAppearanceType#getLinewidth <em>Linewidth</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Linewidth</em>'.
     * @see xmei.ConnectorAppearanceType#getLinewidth()
     * @see #getConnectorAppearanceType()
     * @generated
     */
    EAttribute getConnectorAppearanceType_Linewidth();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConnectorAppearanceType#getSeqno <em>Seqno</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Seqno</em>'.
     * @see xmei.ConnectorAppearanceType#getSeqno()
     * @see #getConnectorAppearanceType()
     * @generated
     */
    EAttribute getConnectorAppearanceType_Seqno();

    /**
     * Returns the meta object for class '{@link xmei.ConnectorLabelsType <em>Connector Labels Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connector Labels Type</em>'.
     * @see xmei.ConnectorLabelsType
     * @generated
     */
    EClass getConnectorLabelsType();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConnectorLabelsType#getLb <em>Lb</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lb</em>'.
     * @see xmei.ConnectorLabelsType#getLb()
     * @see #getConnectorLabelsType()
     * @generated
     */
    EAttribute getConnectorLabelsType_Lb();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConnectorLabelsType#getMb <em>Mb</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mb</em>'.
     * @see xmei.ConnectorLabelsType#getMb()
     * @see #getConnectorLabelsType()
     * @generated
     */
    EAttribute getConnectorLabelsType_Mb();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConnectorLabelsType#getMt <em>Mt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mt</em>'.
     * @see xmei.ConnectorLabelsType#getMt()
     * @see #getConnectorLabelsType()
     * @generated
     */
    EAttribute getConnectorLabelsType_Mt();

    /**
     * Returns the meta object for class '{@link xmei.ConnectorModelType <em>Connector Model Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connector Model Type</em>'.
     * @see xmei.ConnectorModelType
     * @generated
     */
    EClass getConnectorModelType();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConnectorModelType#getEaLocalid <em>Ea Localid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ea Localid</em>'.
     * @see xmei.ConnectorModelType#getEaLocalid()
     * @see #getConnectorModelType()
     * @generated
     */
    EAttribute getConnectorModelType_EaLocalid();

    /**
     * Returns the meta object for class '{@link xmei.ConnectorModifiersType <em>Connector Modifiers Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connector Modifiers Type</em>'.
     * @see xmei.ConnectorModifiersType
     * @generated
     */
    EClass getConnectorModifiersType();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConnectorModifiersType#getChangeable <em>Changeable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Changeable</em>'.
     * @see xmei.ConnectorModifiersType#getChangeable()
     * @see #getConnectorModifiersType()
     * @generated
     */
    EAttribute getConnectorModifiersType_Changeable();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConnectorModifiersType#isIsLeaf <em>Is Leaf</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Leaf</em>'.
     * @see xmei.ConnectorModifiersType#isIsLeaf()
     * @see #getConnectorModifiersType()
     * @generated
     */
    EAttribute getConnectorModifiersType_IsLeaf();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConnectorModifiersType#isIsNavigable <em>Is Navigable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Navigable</em>'.
     * @see xmei.ConnectorModifiersType#isIsNavigable()
     * @see #getConnectorModifiersType()
     * @generated
     */
    EAttribute getConnectorModifiersType_IsNavigable();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConnectorModifiersType#isIsOrdered <em>Is Ordered</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Ordered</em>'.
     * @see xmei.ConnectorModifiersType#isIsOrdered()
     * @see #getConnectorModifiersType()
     * @generated
     */
    EAttribute getConnectorModifiersType_IsOrdered();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConnectorModifiersType#isIsRoot <em>Is Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Root</em>'.
     * @see xmei.ConnectorModifiersType#isIsRoot()
     * @see #getConnectorModifiersType()
     * @generated
     */
    EAttribute getConnectorModifiersType_IsRoot();

    /**
     * Returns the meta object for class '{@link xmei.ConnectorPropertiesType <em>Connector Properties Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connector Properties Type</em>'.
     * @see xmei.ConnectorPropertiesType
     * @generated
     */
    EClass getConnectorPropertiesType();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConnectorPropertiesType#getDirection <em>Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Direction</em>'.
     * @see xmei.ConnectorPropertiesType#getDirection()
     * @see #getConnectorPropertiesType()
     * @generated
     */
    EAttribute getConnectorPropertiesType_Direction();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConnectorPropertiesType#getEaType <em>Ea Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ea Type</em>'.
     * @see xmei.ConnectorPropertiesType#getEaType()
     * @see #getConnectorPropertiesType()
     * @generated
     */
    EAttribute getConnectorPropertiesType_EaType();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConnectorPropertiesType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see xmei.ConnectorPropertiesType#getName()
     * @see #getConnectorPropertiesType()
     * @generated
     */
    EAttribute getConnectorPropertiesType_Name();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConnectorPropertiesType#getStereotype <em>Stereotype</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stereotype</em>'.
     * @see xmei.ConnectorPropertiesType#getStereotype()
     * @see #getConnectorPropertiesType()
     * @generated
     */
    EAttribute getConnectorPropertiesType_Stereotype();

    /**
     * Returns the meta object for class '{@link xmei.ConnectorsType <em>Connectors Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connectors Type</em>'.
     * @see xmei.ConnectorsType
     * @generated
     */
    EClass getConnectorsType();

    /**
     * Returns the meta object for the containment reference list '{@link xmei.ConnectorsType#getConnector <em>Connector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Connector</em>'.
     * @see xmei.ConnectorsType#getConnector()
     * @see #getConnectorsType()
     * @generated
     */
    EReference getConnectorsType_Connector();

    /**
     * Returns the meta object for class '{@link xmei.ConnectorType <em>Connector Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Connector Type</em>'.
     * @see xmei.ConnectorType
     * @generated
     */
    EClass getConnectorType();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ConnectorType#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Source</em>'.
     * @see xmei.ConnectorType#getSource()
     * @see #getConnectorType()
     * @generated
     */
    EReference getConnectorType_Source();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ConnectorType#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Target</em>'.
     * @see xmei.ConnectorType#getTarget()
     * @see #getConnectorType()
     * @generated
     */
    EReference getConnectorType_Target();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ConnectorType#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Model</em>'.
     * @see xmei.ConnectorType#getModel()
     * @see #getConnectorType()
     * @generated
     */
    EReference getConnectorType_Model();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ConnectorType#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Properties</em>'.
     * @see xmei.ConnectorType#getProperties()
     * @see #getConnectorType()
     * @generated
     */
    EReference getConnectorType_Properties();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ConnectorType#getModifiers <em>Modifiers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Modifiers</em>'.
     * @see xmei.ConnectorType#getModifiers()
     * @see #getConnectorType()
     * @generated
     */
    EReference getConnectorType_Modifiers();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ConnectorType#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Documentation</em>'.
     * @see xmei.ConnectorType#getDocumentation()
     * @see #getConnectorType()
     * @generated
     */
    EReference getConnectorType_Documentation();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ConnectorType#getAppearance <em>Appearance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Appearance</em>'.
     * @see xmei.ConnectorType#getAppearance()
     * @see #getConnectorType()
     * @generated
     */
    EReference getConnectorType_Appearance();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ConnectorType#getLabels <em>Labels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Labels</em>'.
     * @see xmei.ConnectorType#getLabels()
     * @see #getConnectorType()
     * @generated
     */
    EReference getConnectorType_Labels();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ConnectorType#getExtendedProperties <em>Extended Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Extended Properties</em>'.
     * @see xmei.ConnectorType#getExtendedProperties()
     * @see #getConnectorType()
     * @generated
     */
    EReference getConnectorType_ExtendedProperties();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ConnectorType#getStyle <em>Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Style</em>'.
     * @see xmei.ConnectorType#getStyle()
     * @see #getConnectorType()
     * @generated
     */
    EReference getConnectorType_Style();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ConnectorType#getXrefs <em>Xrefs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Xrefs</em>'.
     * @see xmei.ConnectorType#getXrefs()
     * @see #getConnectorType()
     * @generated
     */
    EReference getConnectorType_Xrefs();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ConnectorType#getTags <em>Tags</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Tags</em>'.
     * @see xmei.ConnectorType#getTags()
     * @see #getConnectorType()
     * @generated
     */
    EReference getConnectorType_Tags();

    /**
     * Returns the meta object for the attribute '{@link xmei.ConnectorType#getIdref <em>Idref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idref</em>'.
     * @see xmei.ConnectorType#getIdref()
     * @see #getConnectorType()
     * @generated
     */
    EAttribute getConnectorType_Idref();

    /**
     * Returns the meta object for class '{@link xmei.DiagramElementsType <em>Diagram Elements Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Diagram Elements Type</em>'.
     * @see xmei.DiagramElementsType
     * @generated
     */
    EClass getDiagramElementsType();

    /**
     * Returns the meta object for the containment reference list '{@link xmei.DiagramElementsType#getElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Element</em>'.
     * @see xmei.DiagramElementsType#getElement()
     * @see #getDiagramElementsType()
     * @generated
     */
    EReference getDiagramElementsType_Element();

    /**
     * Returns the meta object for class '{@link xmei.DiagramElementType <em>Diagram Element Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Diagram Element Type</em>'.
     * @see xmei.DiagramElementType
     * @generated
     */
    EClass getDiagramElementType();

    /**
     * Returns the meta object for the attribute '{@link xmei.DiagramElementType#getGeometry <em>Geometry</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Geometry</em>'.
     * @see xmei.DiagramElementType#getGeometry()
     * @see #getDiagramElementType()
     * @generated
     */
    EAttribute getDiagramElementType_Geometry();

    /**
     * Returns the meta object for the attribute '{@link xmei.DiagramElementType#getSeqno <em>Seqno</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Seqno</em>'.
     * @see xmei.DiagramElementType#getSeqno()
     * @see #getDiagramElementType()
     * @generated
     */
    EAttribute getDiagramElementType_Seqno();

    /**
     * Returns the meta object for the attribute '{@link xmei.DiagramElementType#getStyle <em>Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Style</em>'.
     * @see xmei.DiagramElementType#getStyle()
     * @see #getDiagramElementType()
     * @generated
     */
    EAttribute getDiagramElementType_Style();

    /**
     * Returns the meta object for the attribute '{@link xmei.DiagramElementType#getSubject <em>Subject</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Subject</em>'.
     * @see xmei.DiagramElementType#getSubject()
     * @see #getDiagramElementType()
     * @generated
     */
    EAttribute getDiagramElementType_Subject();

    /**
     * Returns the meta object for class '{@link xmei.DiagramModelType <em>Diagram Model Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Diagram Model Type</em>'.
     * @see xmei.DiagramModelType
     * @generated
     */
    EClass getDiagramModelType();

    /**
     * Returns the meta object for the attribute '{@link xmei.DiagramModelType#getLocalID <em>Local ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local ID</em>'.
     * @see xmei.DiagramModelType#getLocalID()
     * @see #getDiagramModelType()
     * @generated
     */
    EAttribute getDiagramModelType_LocalID();

    /**
     * Returns the meta object for the attribute '{@link xmei.DiagramModelType#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Owner</em>'.
     * @see xmei.DiagramModelType#getOwner()
     * @see #getDiagramModelType()
     * @generated
     */
    EAttribute getDiagramModelType_Owner();

    /**
     * Returns the meta object for the attribute '{@link xmei.DiagramModelType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Package</em>'.
     * @see xmei.DiagramModelType#getPackage()
     * @see #getDiagramModelType()
     * @generated
     */
    EAttribute getDiagramModelType_Package();

    /**
     * Returns the meta object for the attribute '{@link xmei.DiagramModelType#getParent <em>Parent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Parent</em>'.
     * @see xmei.DiagramModelType#getParent()
     * @see #getDiagramModelType()
     * @generated
     */
    EAttribute getDiagramModelType_Parent();

    /**
     * Returns the meta object for class '{@link xmei.DiagramPropertiesType <em>Diagram Properties Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Diagram Properties Type</em>'.
     * @see xmei.DiagramPropertiesType
     * @generated
     */
    EClass getDiagramPropertiesType();

    /**
     * Returns the meta object for the attribute '{@link xmei.DiagramPropertiesType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see xmei.DiagramPropertiesType#getName()
     * @see #getDiagramPropertiesType()
     * @generated
     */
    EAttribute getDiagramPropertiesType_Name();

    /**
     * Returns the meta object for the attribute '{@link xmei.DiagramPropertiesType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see xmei.DiagramPropertiesType#getType()
     * @see #getDiagramPropertiesType()
     * @generated
     */
    EAttribute getDiagramPropertiesType_Type();

    /**
     * Returns the meta object for class '{@link xmei.DiagramsType <em>Diagrams Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Diagrams Type</em>'.
     * @see xmei.DiagramsType
     * @generated
     */
    EClass getDiagramsType();

    /**
     * Returns the meta object for the containment reference list '{@link xmei.DiagramsType#getDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Diagram</em>'.
     * @see xmei.DiagramsType#getDiagram()
     * @see #getDiagramsType()
     * @generated
     */
    EReference getDiagramsType_Diagram();

    /**
     * Returns the meta object for class '{@link xmei.DiagramType <em>Diagram Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Diagram Type</em>'.
     * @see xmei.DiagramType
     * @generated
     */
    EClass getDiagramType();

    /**
     * Returns the meta object for the containment reference '{@link xmei.DiagramType#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Model</em>'.
     * @see xmei.DiagramType#getModel()
     * @see #getDiagramType()
     * @generated
     */
    EReference getDiagramType_Model();

    /**
     * Returns the meta object for the containment reference '{@link xmei.DiagramType#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Properties</em>'.
     * @see xmei.DiagramType#getProperties()
     * @see #getDiagramType()
     * @generated
     */
    EReference getDiagramType_Properties();

    /**
     * Returns the meta object for the containment reference '{@link xmei.DiagramType#getProject <em>Project</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Project</em>'.
     * @see xmei.DiagramType#getProject()
     * @see #getDiagramType()
     * @generated
     */
    EReference getDiagramType_Project();

    /**
     * Returns the meta object for the containment reference '{@link xmei.DiagramType#getStyle1 <em>Style1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Style1</em>'.
     * @see xmei.DiagramType#getStyle1()
     * @see #getDiagramType()
     * @generated
     */
    EReference getDiagramType_Style1();

    /**
     * Returns the meta object for the containment reference '{@link xmei.DiagramType#getStyle2 <em>Style2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Style2</em>'.
     * @see xmei.DiagramType#getStyle2()
     * @see #getDiagramType()
     * @generated
     */
    EReference getDiagramType_Style2();

    /**
     * Returns the meta object for the containment reference '{@link xmei.DiagramType#getSwimlanes <em>Swimlanes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Swimlanes</em>'.
     * @see xmei.DiagramType#getSwimlanes()
     * @see #getDiagramType()
     * @generated
     */
    EReference getDiagramType_Swimlanes();

    /**
     * Returns the meta object for the containment reference '{@link xmei.DiagramType#getMatrixitems <em>Matrixitems</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Matrixitems</em>'.
     * @see xmei.DiagramType#getMatrixitems()
     * @see #getDiagramType()
     * @generated
     */
    EReference getDiagramType_Matrixitems();

    /**
     * Returns the meta object for the containment reference '{@link xmei.DiagramType#getElements <em>Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Elements</em>'.
     * @see xmei.DiagramType#getElements()
     * @see #getDiagramType()
     * @generated
     */
    EReference getDiagramType_Elements();

    /**
     * Returns the meta object for the attribute '{@link xmei.DiagramType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see xmei.DiagramType#getId()
     * @see #getDiagramType()
     * @generated
     */
    EAttribute getDiagramType_Id();

    /**
     * Returns the meta object for class '{@link xmei.Documentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Documentation</em>'.
     * @see xmei.Documentation
     * @generated
     */
    EClass getDocumentation();

    /**
     * Returns the meta object for the attribute '{@link xmei.Documentation#getExporter <em>Exporter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Exporter</em>'.
     * @see xmei.Documentation#getExporter()
     * @see #getDocumentation()
     * @generated
     */
    EAttribute getDocumentation_Exporter();

    /**
     * Returns the meta object for the attribute '{@link xmei.Documentation#getExporterVersion <em>Exporter Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Exporter Version</em>'.
     * @see xmei.Documentation#getExporterVersion()
     * @see #getDocumentation()
     * @generated
     */
    EAttribute getDocumentation_ExporterVersion();

    /**
     * Returns the meta object for class '{@link xmei.DocumentationType <em>Documentation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Documentation Type</em>'.
     * @see xmei.DocumentationType
     * @generated
     */
    EClass getDocumentationType();

    /**
     * Returns the meta object for the attribute '{@link xmei.DocumentationType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see xmei.DocumentationType#getValue()
     * @see #getDocumentationType()
     * @generated
     */
    EAttribute getDocumentationType_Value();

    /**
     * Returns the meta object for class '{@link xmei.ElementsType <em>Elements Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Elements Type</em>'.
     * @see xmei.ElementsType
     * @generated
     */
    EClass getElementsType();

    /**
     * Returns the meta object for the containment reference list '{@link xmei.ElementsType#getElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Element</em>'.
     * @see xmei.ElementsType#getElement()
     * @see #getElementsType()
     * @generated
     */
    EReference getElementsType_Element();

    /**
     * Returns the meta object for class '{@link xmei.ElementType <em>Element Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element Type</em>'.
     * @see xmei.ElementType
     * @generated
     */
    EClass getElementType();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ElementType#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Model</em>'.
     * @see xmei.ElementType#getModel()
     * @see #getElementType()
     * @generated
     */
    EReference getElementType_Model();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ElementType#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Properties</em>'.
     * @see xmei.ElementType#getProperties()
     * @see #getElementType()
     * @generated
     */
    EReference getElementType_Properties();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ElementType#getProject <em>Project</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Project</em>'.
     * @see xmei.ElementType#getProject()
     * @see #getElementType()
     * @generated
     */
    EReference getElementType_Project();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ElementType#getCode <em>Code</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Code</em>'.
     * @see xmei.ElementType#getCode()
     * @see #getElementType()
     * @generated
     */
    EReference getElementType_Code();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ElementType#getLinks <em>Links</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Links</em>'.
     * @see xmei.ElementType#getLinks()
     * @see #getElementType()
     * @generated
     */
    EReference getElementType_Links();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ElementType#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Attributes</em>'.
     * @see xmei.ElementType#getAttributes()
     * @see #getElementType()
     * @generated
     */
    EReference getElementType_Attributes();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ElementType#getOperations <em>Operations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Operations</em>'.
     * @see xmei.ElementType#getOperations()
     * @see #getElementType()
     * @generated
     */
    EReference getElementType_Operations();

    /**
     * Returns the meta object for the attribute '{@link xmei.ElementType#getIdref <em>Idref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idref</em>'.
     * @see xmei.ElementType#getIdref()
     * @see #getElementType()
     * @generated
     */
    EAttribute getElementType_Idref();

    /**
     * Returns the meta object for the attribute '{@link xmei.ElementType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see xmei.ElementType#getName()
     * @see #getElementType()
     * @generated
     */
    EAttribute getElementType_Name();

    /**
     * Returns the meta object for the attribute '{@link xmei.ElementType#getScope <em>Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scope</em>'.
     * @see xmei.ElementType#getScope()
     * @see #getElementType()
     * @generated
     */
    EAttribute getElementType_Scope();

    /**
     * Returns the meta object for the attribute '{@link xmei.ElementType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see xmei.ElementType#getType()
     * @see #getElementType()
     * @generated
     */
    EAttribute getElementType_Type();

    /**
     * Returns the meta object for class '{@link xmei.ExtendedPropertiesType <em>Extended Properties Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Extended Properties Type</em>'.
     * @see xmei.ExtendedPropertiesType
     * @generated
     */
    EClass getExtendedPropertiesType();

    /**
     * Returns the meta object for the attribute '{@link xmei.ExtendedPropertiesType#getConditional <em>Conditional</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Conditional</em>'.
     * @see xmei.ExtendedPropertiesType#getConditional()
     * @see #getExtendedPropertiesType()
     * @generated
     */
    EAttribute getExtendedPropertiesType_Conditional();

    /**
     * Returns the meta object for the attribute '{@link xmei.ExtendedPropertiesType#getDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Diagram</em>'.
     * @see xmei.ExtendedPropertiesType#getDiagram()
     * @see #getExtendedPropertiesType()
     * @generated
     */
    EAttribute getExtendedPropertiesType_Diagram();

    /**
     * Returns the meta object for the attribute '{@link xmei.ExtendedPropertiesType#getPrivatedata1 <em>Privatedata1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Privatedata1</em>'.
     * @see xmei.ExtendedPropertiesType#getPrivatedata1()
     * @see #getExtendedPropertiesType()
     * @generated
     */
    EAttribute getExtendedPropertiesType_Privatedata1();

    /**
     * Returns the meta object for the attribute '{@link xmei.ExtendedPropertiesType#getPrivatedata2 <em>Privatedata2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Privatedata2</em>'.
     * @see xmei.ExtendedPropertiesType#getPrivatedata2()
     * @see #getExtendedPropertiesType()
     * @generated
     */
    EAttribute getExtendedPropertiesType_Privatedata2();

    /**
     * Returns the meta object for the attribute '{@link xmei.ExtendedPropertiesType#getPrivatedata3 <em>Privatedata3</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Privatedata3</em>'.
     * @see xmei.ExtendedPropertiesType#getPrivatedata3()
     * @see #getExtendedPropertiesType()
     * @generated
     */
    EAttribute getExtendedPropertiesType_Privatedata3();

    /**
     * Returns the meta object for the attribute '{@link xmei.ExtendedPropertiesType#getPrivatedata4 <em>Privatedata4</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Privatedata4</em>'.
     * @see xmei.ExtendedPropertiesType#getPrivatedata4()
     * @see #getExtendedPropertiesType()
     * @generated
     */
    EAttribute getExtendedPropertiesType_Privatedata4();

    /**
     * Returns the meta object for the attribute '{@link xmei.ExtendedPropertiesType#getPrivatedata5 <em>Privatedata5</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Privatedata5</em>'.
     * @see xmei.ExtendedPropertiesType#getPrivatedata5()
     * @see #getExtendedPropertiesType()
     * @generated
     */
    EAttribute getExtendedPropertiesType_Privatedata5();

    /**
     * Returns the meta object for the attribute '{@link xmei.ExtendedPropertiesType#getSequencePoints <em>Sequence Points</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sequence Points</em>'.
     * @see xmei.ExtendedPropertiesType#getSequencePoints()
     * @see #getExtendedPropertiesType()
     * @generated
     */
    EAttribute getExtendedPropertiesType_SequencePoints();

    /**
     * Returns the meta object for the attribute '{@link xmei.ExtendedPropertiesType#getStateflags <em>Stateflags</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stateflags</em>'.
     * @see xmei.ExtendedPropertiesType#getStateflags()
     * @see #getExtendedPropertiesType()
     * @generated
     */
    EAttribute getExtendedPropertiesType_Stateflags();

    /**
     * Returns the meta object for the attribute '{@link xmei.ExtendedPropertiesType#getVirtualInheritance <em>Virtual Inheritance</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Virtual Inheritance</em>'.
     * @see xmei.ExtendedPropertiesType#getVirtualInheritance()
     * @see #getExtendedPropertiesType()
     * @generated
     */
    EAttribute getExtendedPropertiesType_VirtualInheritance();

    /**
     * Returns the meta object for class '{@link xmei.Extension <em>Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Extension</em>'.
     * @see xmei.Extension
     * @generated
     */
    EClass getExtension();

    /**
     * Returns the meta object for the containment reference '{@link xmei.Extension#getElements <em>Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Elements</em>'.
     * @see xmei.Extension#getElements()
     * @see #getExtension()
     * @generated
     */
    EReference getExtension_Elements();

    /**
     * Returns the meta object for the containment reference '{@link xmei.Extension#getConnectors <em>Connectors</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Connectors</em>'.
     * @see xmei.Extension#getConnectors()
     * @see #getExtension()
     * @generated
     */
    EReference getExtension_Connectors();

    /**
     * Returns the meta object for the containment reference '{@link xmei.Extension#getPrimitivetypes <em>Primitivetypes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Primitivetypes</em>'.
     * @see xmei.Extension#getPrimitivetypes()
     * @see #getExtension()
     * @generated
     */
    EReference getExtension_Primitivetypes();

    /**
     * Returns the meta object for the attribute '{@link xmei.Extension#getProfiles <em>Profiles</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Profiles</em>'.
     * @see xmei.Extension#getProfiles()
     * @see #getExtension()
     * @generated
     */
    EAttribute getExtension_Profiles();

    /**
     * Returns the meta object for the containment reference '{@link xmei.Extension#getDiagrams <em>Diagrams</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Diagrams</em>'.
     * @see xmei.Extension#getDiagrams()
     * @see #getExtension()
     * @generated
     */
    EReference getExtension_Diagrams();

    /**
     * Returns the meta object for the attribute '{@link xmei.Extension#getExtender <em>Extender</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Extender</em>'.
     * @see xmei.Extension#getExtender()
     * @see #getExtension()
     * @generated
     */
    EAttribute getExtension_Extender();

    /**
     * Returns the meta object for the attribute '{@link xmei.Extension#getExtenderID <em>Extender ID</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Extender ID</em>'.
     * @see xmei.Extension#getExtenderID()
     * @see #getExtension()
     * @generated
     */
    EAttribute getExtension_ExtenderID();

    /**
     * Returns the meta object for class '{@link xmei.InitialType <em>Initial Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Initial Type</em>'.
     * @see xmei.InitialType
     * @generated
     */
    EClass getInitialType();

    /**
     * Returns the meta object for the attribute '{@link xmei.InitialType#getBody <em>Body</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Body</em>'.
     * @see xmei.InitialType#getBody()
     * @see #getInitialType()
     * @generated
     */
    EAttribute getInitialType_Body();

    /**
     * Returns the meta object for class '{@link xmei.LinksType <em>Links Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Links Type</em>'.
     * @see xmei.LinksType
     * @generated
     */
    EClass getLinksType();

    /**
     * Returns the meta object for the containment reference list '{@link xmei.LinksType#getSequence <em>Sequence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sequence</em>'.
     * @see xmei.LinksType#getSequence()
     * @see #getLinksType()
     * @generated
     */
    EReference getLinksType_Sequence();

    /**
     * Returns the meta object for the containment reference list '{@link xmei.LinksType#getRealisation <em>Realisation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Realisation</em>'.
     * @see xmei.LinksType#getRealisation()
     * @see #getLinksType()
     * @generated
     */
    EReference getLinksType_Realisation();

    /**
     * Returns the meta object for the containment reference list '{@link xmei.LinksType#getGeneralization <em>Generalization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Generalization</em>'.
     * @see xmei.LinksType#getGeneralization()
     * @see #getLinksType()
     * @generated
     */
    EReference getLinksType_Generalization();

    /**
     * Returns the meta object for the containment reference list '{@link xmei.LinksType#getDependency <em>Dependency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Dependency</em>'.
     * @see xmei.LinksType#getDependency()
     * @see #getLinksType()
     * @generated
     */
    EReference getLinksType_Dependency();

    /**
     * Returns the meta object for the containment reference list '{@link xmei.LinksType#getAssociation <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Association</em>'.
     * @see xmei.LinksType#getAssociation()
     * @see #getLinksType()
     * @generated
     */
    EReference getLinksType_Association();

    /**
     * Returns the meta object for class '{@link xmei.ModelType <em>Model Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model Type</em>'.
     * @see xmei.ModelType
     * @generated
     */
    EClass getModelType();

    /**
     * Returns the meta object for the attribute '{@link xmei.ModelType#getEaEleType <em>Ea Ele Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ea Ele Type</em>'.
     * @see xmei.ModelType#getEaEleType()
     * @see #getModelType()
     * @generated
     */
    EAttribute getModelType_EaEleType();

    /**
     * Returns the meta object for the attribute '{@link xmei.ModelType#getEaLocalid <em>Ea Localid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ea Localid</em>'.
     * @see xmei.ModelType#getEaLocalid()
     * @see #getModelType()
     * @generated
     */
    EAttribute getModelType_EaLocalid();

    /**
     * Returns the meta object for the attribute '{@link xmei.ModelType#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Owner</em>'.
     * @see xmei.ModelType#getOwner()
     * @see #getModelType()
     * @generated
     */
    EAttribute getModelType_Owner();

    /**
     * Returns the meta object for the attribute '{@link xmei.ModelType#getPackage <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Package</em>'.
     * @see xmei.ModelType#getPackage()
     * @see #getModelType()
     * @generated
     */
    EAttribute getModelType_Package();

    /**
     * Returns the meta object for the attribute '{@link xmei.ModelType#getPackage2 <em>Package2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Package2</em>'.
     * @see xmei.ModelType#getPackage2()
     * @see #getModelType()
     * @generated
     */
    EAttribute getModelType_Package2();

    /**
     * Returns the meta object for the attribute '{@link xmei.ModelType#getTpos <em>Tpos</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tpos</em>'.
     * @see xmei.ModelType#getTpos()
     * @see #getModelType()
     * @generated
     */
    EAttribute getModelType_Tpos();

    /**
     * Returns the meta object for class '{@link xmei.OperationParametersType <em>Operation Parameters Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operation Parameters Type</em>'.
     * @see xmei.OperationParametersType
     * @generated
     */
    EClass getOperationParametersType();

    /**
     * Returns the meta object for the containment reference list '{@link xmei.OperationParametersType#getParameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameter</em>'.
     * @see xmei.OperationParametersType#getParameter()
     * @see #getOperationParametersType()
     * @generated
     */
    EReference getOperationParametersType_Parameter();

    /**
     * Returns the meta object for class '{@link xmei.OperationPropertiesType <em>Operation Properties Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operation Properties Type</em>'.
     * @see xmei.OperationPropertiesType
     * @generated
     */
    EClass getOperationPropertiesType();

    /**
     * Returns the meta object for the attribute '{@link xmei.OperationPropertiesType#getPosition <em>Position</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Position</em>'.
     * @see xmei.OperationPropertiesType#getPosition()
     * @see #getOperationPropertiesType()
     * @generated
     */
    EAttribute getOperationPropertiesType_Position();

    /**
     * Returns the meta object for class '{@link xmei.OperationsType <em>Operations Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operations Type</em>'.
     * @see xmei.OperationsType
     * @generated
     */
    EClass getOperationsType();

    /**
     * Returns the meta object for the containment reference list '{@link xmei.OperationsType#getOperation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Operation</em>'.
     * @see xmei.OperationsType#getOperation()
     * @see #getOperationsType()
     * @generated
     */
    EReference getOperationsType_Operation();

    /**
     * Returns the meta object for class '{@link xmei.OperationTagsType <em>Operation Tags Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operation Tags Type</em>'.
     * @see xmei.OperationTagsType
     * @generated
     */
    EClass getOperationTagsType();

    /**
     * Returns the meta object for the containment reference list '{@link xmei.OperationTagsType#getTag <em>Tag</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Tag</em>'.
     * @see xmei.OperationTagsType#getTag()
     * @see #getOperationTagsType()
     * @generated
     */
    EReference getOperationTagsType_Tag();

    /**
     * Returns the meta object for class '{@link xmei.OperationType <em>Operation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operation Type</em>'.
     * @see xmei.OperationType
     * @generated
     */
    EClass getOperationType();

    /**
     * Returns the meta object for the containment reference '{@link xmei.OperationType#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Properties</em>'.
     * @see xmei.OperationType#getProperties()
     * @see #getOperationType()
     * @generated
     */
    EReference getOperationType_Properties();

    /**
     * Returns the meta object for the containment reference '{@link xmei.OperationType#getStereotype <em>Stereotype</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Stereotype</em>'.
     * @see xmei.OperationType#getStereotype()
     * @see #getOperationType()
     * @generated
     */
    EReference getOperationType_Stereotype();

    /**
     * Returns the meta object for the containment reference '{@link xmei.OperationType#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Model</em>'.
     * @see xmei.OperationType#getModel()
     * @see #getOperationType()
     * @generated
     */
    EReference getOperationType_Model();

    /**
     * Returns the meta object for the containment reference '{@link xmei.OperationType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see xmei.OperationType#getType()
     * @see #getOperationType()
     * @generated
     */
    EReference getOperationType_Type();

    /**
     * Returns the meta object for the containment reference '{@link xmei.OperationType#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Documentation</em>'.
     * @see xmei.OperationType#getDocumentation()
     * @see #getOperationType()
     * @generated
     */
    EReference getOperationType_Documentation();

    /**
     * Returns the meta object for the containment reference '{@link xmei.OperationType#getTags <em>Tags</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Tags</em>'.
     * @see xmei.OperationType#getTags()
     * @see #getOperationType()
     * @generated
     */
    EReference getOperationType_Tags();

    /**
     * Returns the meta object for the containment reference '{@link xmei.OperationType#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Parameters</em>'.
     * @see xmei.OperationType#getParameters()
     * @see #getOperationType()
     * @generated
     */
    EReference getOperationType_Parameters();

    /**
     * Returns the meta object for the containment reference '{@link xmei.OperationType#getXrefs <em>Xrefs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Xrefs</em>'.
     * @see xmei.OperationType#getXrefs()
     * @see #getOperationType()
     * @generated
     */
    EReference getOperationType_Xrefs();

    /**
     * Returns the meta object for the attribute '{@link xmei.OperationType#getIdref <em>Idref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idref</em>'.
     * @see xmei.OperationType#getIdref()
     * @see #getOperationType()
     * @generated
     */
    EAttribute getOperationType_Idref();

    /**
     * Returns the meta object for the attribute '{@link xmei.OperationType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see xmei.OperationType#getName()
     * @see #getOperationType()
     * @generated
     */
    EAttribute getOperationType_Name();

    /**
     * Returns the meta object for the attribute '{@link xmei.OperationType#getScope <em>Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scope</em>'.
     * @see xmei.OperationType#getScope()
     * @see #getOperationType()
     * @generated
     */
    EAttribute getOperationType_Scope();

    /**
     * Returns the meta object for class '{@link xmei.OperationTypeType <em>Operation Type Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Operation Type Type</em>'.
     * @see xmei.OperationTypeType
     * @generated
     */
    EClass getOperationTypeType();

    /**
     * Returns the meta object for the attribute '{@link xmei.OperationTypeType#getConcurrency <em>Concurrency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Concurrency</em>'.
     * @see xmei.OperationTypeType#getConcurrency()
     * @see #getOperationTypeType()
     * @generated
     */
    EAttribute getOperationTypeType_Concurrency();

    /**
     * Returns the meta object for the attribute '{@link xmei.OperationTypeType#isConst <em>Const</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Const</em>'.
     * @see xmei.OperationTypeType#isConst()
     * @see #getOperationTypeType()
     * @generated
     */
    EAttribute getOperationTypeType_Const();

    /**
     * Returns the meta object for the attribute '{@link xmei.OperationTypeType#isIsAbstract <em>Is Abstract</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Abstract</em>'.
     * @see xmei.OperationTypeType#isIsAbstract()
     * @see #getOperationTypeType()
     * @generated
     */
    EAttribute getOperationTypeType_IsAbstract();

    /**
     * Returns the meta object for the attribute '{@link xmei.OperationTypeType#isIsQuery <em>Is Query</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Query</em>'.
     * @see xmei.OperationTypeType#isIsQuery()
     * @see #getOperationTypeType()
     * @generated
     */
    EAttribute getOperationTypeType_IsQuery();

    /**
     * Returns the meta object for the attribute '{@link xmei.OperationTypeType#getPure <em>Pure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pure</em>'.
     * @see xmei.OperationTypeType#getPure()
     * @see #getOperationTypeType()
     * @generated
     */
    EAttribute getOperationTypeType_Pure();

    /**
     * Returns the meta object for the attribute '{@link xmei.OperationTypeType#getReturnarray <em>Returnarray</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Returnarray</em>'.
     * @see xmei.OperationTypeType#getReturnarray()
     * @see #getOperationTypeType()
     * @generated
     */
    EAttribute getOperationTypeType_Returnarray();

    /**
     * Returns the meta object for the attribute '{@link xmei.OperationTypeType#isStatic <em>Static</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Static</em>'.
     * @see xmei.OperationTypeType#isStatic()
     * @see #getOperationTypeType()
     * @generated
     */
    EAttribute getOperationTypeType_Static();

    /**
     * Returns the meta object for the attribute '{@link xmei.OperationTypeType#getStereotype <em>Stereotype</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stereotype</em>'.
     * @see xmei.OperationTypeType#getStereotype()
     * @see #getOperationTypeType()
     * @generated
     */
    EAttribute getOperationTypeType_Stereotype();

    /**
     * Returns the meta object for the attribute '{@link xmei.OperationTypeType#getSynchronised <em>Synchronised</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Synchronised</em>'.
     * @see xmei.OperationTypeType#getSynchronised()
     * @see #getOperationTypeType()
     * @generated
     */
    EAttribute getOperationTypeType_Synchronised();

    /**
     * Returns the meta object for class '{@link xmei.ParameterPropertiesType <em>Parameter Properties Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter Properties Type</em>'.
     * @see xmei.ParameterPropertiesType
     * @generated
     */
    EClass getParameterPropertiesType();

    /**
     * Returns the meta object for the attribute '{@link xmei.ParameterPropertiesType#getClassifier <em>Classifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Classifier</em>'.
     * @see xmei.ParameterPropertiesType#getClassifier()
     * @see #getParameterPropertiesType()
     * @generated
     */
    EAttribute getParameterPropertiesType_Classifier();

    /**
     * Returns the meta object for the attribute '{@link xmei.ParameterPropertiesType#isConst <em>Const</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Const</em>'.
     * @see xmei.ParameterPropertiesType#isConst()
     * @see #getParameterPropertiesType()
     * @generated
     */
    EAttribute getParameterPropertiesType_Const();

    /**
     * Returns the meta object for the attribute '{@link xmei.ParameterPropertiesType#getEaGuid <em>Ea Guid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ea Guid</em>'.
     * @see xmei.ParameterPropertiesType#getEaGuid()
     * @see #getParameterPropertiesType()
     * @generated
     */
    EAttribute getParameterPropertiesType_EaGuid();

    /**
     * Returns the meta object for the attribute '{@link xmei.ParameterPropertiesType#getPos <em>Pos</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pos</em>'.
     * @see xmei.ParameterPropertiesType#getPos()
     * @see #getParameterPropertiesType()
     * @generated
     */
    EAttribute getParameterPropertiesType_Pos();

    /**
     * Returns the meta object for the attribute '{@link xmei.ParameterPropertiesType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see xmei.ParameterPropertiesType#getType()
     * @see #getParameterPropertiesType()
     * @generated
     */
    EAttribute getParameterPropertiesType_Type();

    /**
     * Returns the meta object for class '{@link xmei.ParameterType <em>Parameter Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter Type</em>'.
     * @see xmei.ParameterType
     * @generated
     */
    EClass getParameterType();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ParameterType#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Properties</em>'.
     * @see xmei.ParameterType#getProperties()
     * @see #getParameterType()
     * @generated
     */
    EReference getParameterType_Properties();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ParameterType#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Documentation</em>'.
     * @see xmei.ParameterType#getDocumentation()
     * @see #getParameterType()
     * @generated
     */
    EReference getParameterType_Documentation();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ParameterType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see xmei.ParameterType#getValue()
     * @see #getParameterType()
     * @generated
     */
    EReference getParameterType_Value();

    /**
     * Returns the meta object for the containment reference '{@link xmei.ParameterType#getXrefs <em>Xrefs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Xrefs</em>'.
     * @see xmei.ParameterType#getXrefs()
     * @see #getParameterType()
     * @generated
     */
    EReference getParameterType_Xrefs();

    /**
     * Returns the meta object for the attribute '{@link xmei.ParameterType#getIdref <em>Idref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idref</em>'.
     * @see xmei.ParameterType#getIdref()
     * @see #getParameterType()
     * @generated
     */
    EAttribute getParameterType_Idref();

    /**
     * Returns the meta object for the attribute '{@link xmei.ParameterType#getVisibility <em>Visibility</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Visibility</em>'.
     * @see xmei.ParameterType#getVisibility()
     * @see #getParameterType()
     * @generated
     */
    EAttribute getParameterType_Visibility();

    /**
     * Returns the meta object for class '{@link xmei.PrimitiveTypesType <em>Primitive Types Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Primitive Types Type</em>'.
     * @see xmei.PrimitiveTypesType
     * @generated
     */
    EClass getPrimitiveTypesType();

    /**
     * Returns the meta object for the containment reference list '{@link xmei.PrimitiveTypesType#getPackagedElement <em>Packaged Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Packaged Element</em>'.
     * @see xmei.PrimitiveTypesType#getPackagedElement()
     * @see #getPrimitiveTypesType()
     * @generated
     */
    EReference getPrimitiveTypesType_PackagedElement();

    /**
     * Returns the meta object for class '{@link xmei.ProjectType <em>Project Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Project Type</em>'.
     * @see xmei.ProjectType
     * @generated
     */
    EClass getProjectType();

    /**
     * Returns the meta object for the attribute '{@link xmei.ProjectType#getAuthor <em>Author</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Author</em>'.
     * @see xmei.ProjectType#getAuthor()
     * @see #getProjectType()
     * @generated
     */
    EAttribute getProjectType_Author();

    /**
     * Returns the meta object for the attribute '{@link xmei.ProjectType#getCreated <em>Created</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Created</em>'.
     * @see xmei.ProjectType#getCreated()
     * @see #getProjectType()
     * @generated
     */
    EAttribute getProjectType_Created();

    /**
     * Returns the meta object for the attribute '{@link xmei.ProjectType#getModified <em>Modified</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Modified</em>'.
     * @see xmei.ProjectType#getModified()
     * @see #getProjectType()
     * @generated
     */
    EAttribute getProjectType_Modified();

    /**
     * Returns the meta object for the attribute '{@link xmei.ProjectType#getPhase <em>Phase</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Phase</em>'.
     * @see xmei.ProjectType#getPhase()
     * @see #getProjectType()
     * @generated
     */
    EAttribute getProjectType_Phase();

    /**
     * Returns the meta object for the attribute '{@link xmei.ProjectType#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see xmei.ProjectType#getVersion()
     * @see #getProjectType()
     * @generated
     */
    EAttribute getProjectType_Version();

    /**
     * Returns the meta object for class '{@link xmei.PropertiesType <em>Properties Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Properties Type</em>'.
     * @see xmei.PropertiesType
     * @generated
     */
    EClass getPropertiesType();

    /**
     * Returns the meta object for the attribute '{@link xmei.PropertiesType#getClassName <em>Class Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Class Name</em>'.
     * @see xmei.PropertiesType#getClassName()
     * @see #getPropertiesType()
     * @generated
     */
    EAttribute getPropertiesType_ClassName();

    /**
     * Returns the meta object for the attribute '{@link xmei.PropertiesType#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Documentation</em>'.
     * @see xmei.PropertiesType#getDocumentation()
     * @see #getPropertiesType()
     * @generated
     */
    EAttribute getPropertiesType_Documentation();

    /**
     * Returns the meta object for the attribute '{@link xmei.PropertiesType#getGenlinks <em>Genlinks</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Genlinks</em>'.
     * @see xmei.PropertiesType#getGenlinks()
     * @see #getPropertiesType()
     * @generated
     */
    EAttribute getPropertiesType_Genlinks();

    /**
     * Returns the meta object for the attribute '{@link xmei.PropertiesType#isIsAbstract <em>Is Abstract</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Abstract</em>'.
     * @see xmei.PropertiesType#isIsAbstract()
     * @see #getPropertiesType()
     * @generated
     */
    EAttribute getPropertiesType_IsAbstract();

    /**
     * Returns the meta object for the attribute '{@link xmei.PropertiesType#isIsActive <em>Is Active</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Active</em>'.
     * @see xmei.PropertiesType#isIsActive()
     * @see #getPropertiesType()
     * @generated
     */
    EAttribute getPropertiesType_IsActive();

    /**
     * Returns the meta object for the attribute '{@link xmei.PropertiesType#isIsLeaf <em>Is Leaf</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Leaf</em>'.
     * @see xmei.PropertiesType#isIsLeaf()
     * @see #getPropertiesType()
     * @generated
     */
    EAttribute getPropertiesType_IsLeaf();

    /**
     * Returns the meta object for the attribute '{@link xmei.PropertiesType#isIsRoot <em>Is Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Root</em>'.
     * @see xmei.PropertiesType#isIsRoot()
     * @see #getPropertiesType()
     * @generated
     */
    EAttribute getPropertiesType_IsRoot();

    /**
     * Returns the meta object for the attribute '{@link xmei.PropertiesType#isIsSpecification <em>Is Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Specification</em>'.
     * @see xmei.PropertiesType#isIsSpecification()
     * @see #getPropertiesType()
     * @generated
     */
    EAttribute getPropertiesType_IsSpecification();

    /**
     * Returns the meta object for the attribute '{@link xmei.PropertiesType#getScope <em>Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scope</em>'.
     * @see xmei.PropertiesType#getScope()
     * @see #getPropertiesType()
     * @generated
     */
    EAttribute getPropertiesType_Scope();

    /**
     * Returns the meta object for the attribute '{@link xmei.PropertiesType#getStereotype <em>Stereotype</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stereotype</em>'.
     * @see xmei.PropertiesType#getStereotype()
     * @see #getPropertiesType()
     * @generated
     */
    EAttribute getPropertiesType_Stereotype();

    /**
     * Returns the meta object for the attribute '{@link xmei.PropertiesType#getSType <em>SType</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>SType</em>'.
     * @see xmei.PropertiesType#getSType()
     * @see #getPropertiesType()
     * @generated
     */
    EAttribute getPropertiesType_SType();

    /**
     * Returns the meta object for class '{@link xmei.SourceAndTargetModelType <em>Source And Target Model Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Source And Target Model Type</em>'.
     * @see xmei.SourceAndTargetModelType
     * @generated
     */
    EClass getSourceAndTargetModelType();

    /**
     * Returns the meta object for the attribute '{@link xmei.SourceAndTargetModelType#getEaLocalid <em>Ea Localid</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ea Localid</em>'.
     * @see xmei.SourceAndTargetModelType#getEaLocalid()
     * @see #getSourceAndTargetModelType()
     * @generated
     */
    EAttribute getSourceAndTargetModelType_EaLocalid();

    /**
     * Returns the meta object for the attribute '{@link xmei.SourceAndTargetModelType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see xmei.SourceAndTargetModelType#getName()
     * @see #getSourceAndTargetModelType()
     * @generated
     */
    EAttribute getSourceAndTargetModelType_Name();

    /**
     * Returns the meta object for the attribute '{@link xmei.SourceAndTargetModelType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see xmei.SourceAndTargetModelType#getType()
     * @see #getSourceAndTargetModelType()
     * @generated
     */
    EAttribute getSourceAndTargetModelType_Type();

    /**
     * Returns the meta object for class '{@link xmei.SourceAndTargetRoleType <em>Source And Target Role Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Source And Target Role Type</em>'.
     * @see xmei.SourceAndTargetRoleType
     * @generated
     */
    EClass getSourceAndTargetRoleType();

    /**
     * Returns the meta object for the attribute '{@link xmei.SourceAndTargetRoleType#getTargetScope <em>Target Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Target Scope</em>'.
     * @see xmei.SourceAndTargetRoleType#getTargetScope()
     * @see #getSourceAndTargetRoleType()
     * @generated
     */
    EAttribute getSourceAndTargetRoleType_TargetScope();

    /**
     * Returns the meta object for the attribute '{@link xmei.SourceAndTargetRoleType#getVisibility <em>Visibility</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Visibility</em>'.
     * @see xmei.SourceAndTargetRoleType#getVisibility()
     * @see #getSourceAndTargetRoleType()
     * @generated
     */
    EAttribute getSourceAndTargetRoleType_Visibility();

    /**
     * Returns the meta object for class '{@link xmei.SourceAndTargetType <em>Source And Target Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Source And Target Type</em>'.
     * @see xmei.SourceAndTargetType
     * @generated
     */
    EClass getSourceAndTargetType();

    /**
     * Returns the meta object for the containment reference '{@link xmei.SourceAndTargetType#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Model</em>'.
     * @see xmei.SourceAndTargetType#getModel()
     * @see #getSourceAndTargetType()
     * @generated
     */
    EReference getSourceAndTargetType_Model();

    /**
     * Returns the meta object for the containment reference '{@link xmei.SourceAndTargetType#getRole <em>Role</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Role</em>'.
     * @see xmei.SourceAndTargetType#getRole()
     * @see #getSourceAndTargetType()
     * @generated
     */
    EReference getSourceAndTargetType_Role();

    /**
     * Returns the meta object for the containment reference '{@link xmei.SourceAndTargetType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see xmei.SourceAndTargetType#getType()
     * @see #getSourceAndTargetType()
     * @generated
     */
    EReference getSourceAndTargetType_Type();

    /**
     * Returns the meta object for the containment reference '{@link xmei.SourceAndTargetType#getModifiers <em>Modifiers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Modifiers</em>'.
     * @see xmei.SourceAndTargetType#getModifiers()
     * @see #getSourceAndTargetType()
     * @generated
     */
    EReference getSourceAndTargetType_Modifiers();

    /**
     * Returns the meta object for the containment reference '{@link xmei.SourceAndTargetType#getStyle <em>Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Style</em>'.
     * @see xmei.SourceAndTargetType#getStyle()
     * @see #getSourceAndTargetType()
     * @generated
     */
    EReference getSourceAndTargetType_Style();

    /**
     * Returns the meta object for the containment reference '{@link xmei.SourceAndTargetType#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Documentation</em>'.
     * @see xmei.SourceAndTargetType#getDocumentation()
     * @see #getSourceAndTargetType()
     * @generated
     */
    EReference getSourceAndTargetType_Documentation();

    /**
     * Returns the meta object for the containment reference '{@link xmei.SourceAndTargetType#getXrefs <em>Xrefs</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Xrefs</em>'.
     * @see xmei.SourceAndTargetType#getXrefs()
     * @see #getSourceAndTargetType()
     * @generated
     */
    EReference getSourceAndTargetType_Xrefs();

    /**
     * Returns the meta object for the containment reference '{@link xmei.SourceAndTargetType#getTags <em>Tags</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Tags</em>'.
     * @see xmei.SourceAndTargetType#getTags()
     * @see #getSourceAndTargetType()
     * @generated
     */
    EReference getSourceAndTargetType_Tags();

    /**
     * Returns the meta object for the attribute '{@link xmei.SourceAndTargetType#getIdref <em>Idref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idref</em>'.
     * @see xmei.SourceAndTargetType#getIdref()
     * @see #getSourceAndTargetType()
     * @generated
     */
    EAttribute getSourceAndTargetType_Idref();

    /**
     * Returns the meta object for class '{@link xmei.SourceAndTargetTypeType <em>Source And Target Type Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Source And Target Type Type</em>'.
     * @see xmei.SourceAndTargetTypeType
     * @generated
     */
    EClass getSourceAndTargetTypeType();

    /**
     * Returns the meta object for the attribute '{@link xmei.SourceAndTargetTypeType#getAggregation <em>Aggregation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Aggregation</em>'.
     * @see xmei.SourceAndTargetTypeType#getAggregation()
     * @see #getSourceAndTargetTypeType()
     * @generated
     */
    EAttribute getSourceAndTargetTypeType_Aggregation();

    /**
     * Returns the meta object for the attribute '{@link xmei.SourceAndTargetTypeType#getContainment <em>Containment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Containment</em>'.
     * @see xmei.SourceAndTargetTypeType#getContainment()
     * @see #getSourceAndTargetTypeType()
     * @generated
     */
    EAttribute getSourceAndTargetTypeType_Containment();

    /**
     * Returns the meta object for the attribute '{@link xmei.SourceAndTargetTypeType#getMultiplicity <em>Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Multiplicity</em>'.
     * @see xmei.SourceAndTargetTypeType#getMultiplicity()
     * @see #getSourceAndTargetTypeType()
     * @generated
     */
    EAttribute getSourceAndTargetTypeType_Multiplicity();

    /**
     * Returns the meta object for class '{@link xmei.StereotypeAttributeType <em>Stereotype Attribute Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Stereotype Attribute Type</em>'.
     * @see xmei.StereotypeAttributeType
     * @generated
     */
    EClass getStereotypeAttributeType();

    /**
     * Returns the meta object for the attribute '{@link xmei.StereotypeAttributeType#getStereotype <em>Stereotype</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stereotype</em>'.
     * @see xmei.StereotypeAttributeType#getStereotype()
     * @see #getStereotypeAttributeType()
     * @generated
     */
    EAttribute getStereotypeAttributeType_Stereotype();

    /**
     * Returns the meta object for class '{@link xmei.StyleexType <em>Styleex Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Styleex Type</em>'.
     * @see xmei.StyleexType
     * @generated
     */
    EClass getStyleexType();

    /**
     * Returns the meta object for the attribute '{@link xmei.StyleexType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see xmei.StyleexType#getValue()
     * @see #getStyleexType()
     * @generated
     */
    EAttribute getStyleexType_Value();

    /**
     * Returns the meta object for class '{@link xmei.TagType <em>Tag Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Tag Type</em>'.
     * @see xmei.TagType
     * @generated
     */
    EClass getTagType();

    /**
     * Returns the meta object for the attribute '{@link xmei.TagType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see xmei.TagType#getId()
     * @see #getTagType()
     * @generated
     */
    EAttribute getTagType_Id();

    /**
     * Returns the meta object for the attribute '{@link xmei.TagType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see xmei.TagType#getName()
     * @see #getTagType()
     * @generated
     */
    EAttribute getTagType_Name();

    /**
     * Returns the meta object for the attribute '{@link xmei.TagType#getNotes <em>Notes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Notes</em>'.
     * @see xmei.TagType#getNotes()
     * @see #getTagType()
     * @generated
     */
    EAttribute getTagType_Notes();

    /**
     * Returns the meta object for the attribute '{@link xmei.TagType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see xmei.TagType#getValue()
     * @see #getTagType()
     * @generated
     */
    EAttribute getTagType_Value();

    /**
     * Returns the meta object for class '{@link xmei.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see xmei.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link xmei.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see xmei.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link xmei.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see xmei.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link xmei.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see xmei.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link xmei.DocumentRoot#getXMI <em>XMI</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>XMI</em>'.
     * @see xmei.DocumentRoot#getXMI()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMI();

    /**
     * Returns the meta object for the attribute '{@link xmei.DocumentRoot#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see xmei.DocumentRoot#getId()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Id();

    /**
     * Returns the meta object for the attribute '{@link xmei.DocumentRoot#getIdref <em>Idref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idref</em>'.
     * @see xmei.DocumentRoot#getIdref()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Idref();

    /**
     * Returns the meta object for the attribute '{@link xmei.DocumentRoot#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see xmei.DocumentRoot#getType()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Type();

    /**
     * Returns the meta object for the attribute '{@link xmei.DocumentRoot#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see xmei.DocumentRoot#getVersion()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Version();

    /**
     * Returns the meta object for class '{@link xmei.XMIType <em>XMI Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XMI Type</em>'.
     * @see xmei.XMIType
     * @generated
     */
    EClass getXMIType();

    /**
     * Returns the meta object for the containment reference '{@link xmei.XMIType#getDocumentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Documentation</em>'.
     * @see xmei.XMIType#getDocumentation()
     * @see #getXMIType()
     * @generated
     */
    EReference getXMIType_Documentation();

    /**
     * Returns the meta object for the containment reference '{@link xmei.XMIType#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Model</em>'.
     * @see xmei.XMIType#getModel()
     * @see #getXMIType()
     * @generated
     */
    EReference getXMIType_Model();

    /**
     * Returns the meta object for the containment reference '{@link xmei.XMIType#getExtension <em>Extension</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Extension</em>'.
     * @see xmei.XMIType#getExtension()
     * @see #getXMIType()
     * @generated
     */
    EReference getXMIType_Extension();

    /**
     * Returns the meta object for the attribute '{@link xmei.XMIType#getVersion <em>Version</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Version</em>'.
     * @see xmei.XMIType#getVersion()
     * @see #getXMIType()
     * @generated
     */
    EAttribute getXMIType_Version();

    /**
     * Returns the meta object for class '{@link xmei.XrefsType <em>Xrefs Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Xrefs Type</em>'.
     * @see xmei.XrefsType
     * @generated
     */
    EClass getXrefsType();

    /**
     * Returns the meta object for the attribute '{@link xmei.XrefsType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see xmei.XrefsType#getValue()
     * @see #getXrefsType()
     * @generated
     */
    EAttribute getXrefsType_Value();

    /**
     * Returns the meta object for enum '{@link xmei.AsyncSyncType <em>Async Sync Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Async Sync Type</em>'.
     * @see xmei.AsyncSyncType
     * @generated
     */
    EEnum getAsyncSyncType();

    /**
     * Returns the meta object for enum '{@link xmei.DiagramTypeType <em>Diagram Type Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Diagram Type Type</em>'.
     * @see xmei.DiagramTypeType
     * @generated
     */
    EEnum getDiagramTypeType();

    /**
     * Returns the meta object for enum '{@link xmei.DirectionType <em>Direction Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Direction Type</em>'.
     * @see xmei.DirectionType
     * @generated
     */
    EEnum getDirectionType();

    /**
     * Returns the meta object for enum '{@link xmei.EaTypesType <em>Ea Types Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Ea Types Type</em>'.
     * @see xmei.EaTypesType
     * @generated
     */
    EEnum getEaTypesType();

    /**
     * Returns the meta object for enum '{@link xmei.StereotypeType <em>Stereotype Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Stereotype Type</em>'.
     * @see xmei.StereotypeType
     * @generated
     */
    EEnum getStereotypeType();

    /**
     * Returns the meta object for enum '{@link xmei.STypeType <em>SType Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>SType Type</em>'.
     * @see xmei.STypeType
     * @generated
     */
    EEnum getSTypeType();

    /**
     * Returns the meta object for enum '{@link xmei.TypeBaseType <em>Type Base Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Type Base Type</em>'.
     * @see xmei.TypeBaseType
     * @generated
     */
    EEnum getTypeBaseType();

    /**
     * Returns the meta object for data type '{@link xmei.AsyncSyncType <em>Async Sync Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Async Sync Type Object</em>'.
     * @see xmei.AsyncSyncType
     * @model instanceClass="xmei.AsyncSyncType"
     *        extendedMetaData="name='asyncSyncType:Object' baseType='asyncSyncType'"
     * @generated
     */
    EDataType getAsyncSyncTypeObject();

    /**
     * Returns the meta object for data type '{@link xmei.DiagramTypeType <em>Diagram Type Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Diagram Type Type Object</em>'.
     * @see xmei.DiagramTypeType
     * @model instanceClass="xmei.DiagramTypeType"
     *        extendedMetaData="name='diagramTypeType:Object' baseType='diagramTypeType'"
     * @generated
     */
    EDataType getDiagramTypeTypeObject();

    /**
     * Returns the meta object for data type '{@link xmei.DirectionType <em>Direction Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Direction Type Object</em>'.
     * @see xmei.DirectionType
     * @model instanceClass="xmei.DirectionType"
     *        extendedMetaData="name='directionType:Object' baseType='directionType'"
     * @generated
     */
    EDataType getDirectionTypeObject();

    /**
     * Returns the meta object for data type '{@link xmei.EaTypesType <em>Ea Types Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Ea Types Type Object</em>'.
     * @see xmei.EaTypesType
     * @model instanceClass="xmei.EaTypesType"
     *        extendedMetaData="name='eaTypesType:Object' baseType='eaTypesType'"
     * @generated
     */
    EDataType getEaTypesTypeObject();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Id Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Id Type</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='idType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
     * @generated
     */
    EDataType getIdType();

    /**
     * Returns the meta object for data type '{@link xmei.StereotypeType <em>Stereotype Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Stereotype Type Object</em>'.
     * @see xmei.StereotypeType
     * @model instanceClass="xmei.StereotypeType"
     *        extendedMetaData="name='stereotypeType:Object' baseType='stereotypeType'"
     * @generated
     */
    EDataType getStereotypeTypeObject();

    /**
     * Returns the meta object for data type '{@link xmei.STypeType <em>SType Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>SType Type Object</em>'.
     * @see xmei.STypeType
     * @model instanceClass="xmei.STypeType"
     *        extendedMetaData="name='sTypeType:Object' baseType='sTypeType'"
     * @generated
     */
    EDataType getSTypeTypeObject();

    /**
     * Returns the meta object for data type '{@link xmei.TypeBaseType <em>Type Base Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Type Base Type Object</em>'.
     * @see xmei.TypeBaseType
     * @model instanceClass="xmei.TypeBaseType"
     *        extendedMetaData="name='typeBaseType:Object' baseType='typeBaseType'"
     * @generated
     */
    EDataType getTypeBaseTypeObject();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    XmeiFactory getXmeiFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals
    {
        /**
         * The meta object literal for the '{@link xmei.impl.AttributeContainmentTypeImpl <em>Attribute Containment Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.AttributeContainmentTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getAttributeContainmentType()
         * @generated
         */
        EClass ATTRIBUTE_CONTAINMENT_TYPE = eINSTANCE.getAttributeContainmentType();

        /**
         * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_CONTAINMENT_TYPE__CONTAINMENT = eINSTANCE.getAttributeContainmentType_Containment();

        /**
         * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_CONTAINMENT_TYPE__POSITION = eINSTANCE.getAttributeContainmentType_Position();

        /**
         * The meta object literal for the '{@link xmei.impl.AttributeModelTypeImpl <em>Attribute Model Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.AttributeModelTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getAttributeModelType()
         * @generated
         */
        EClass ATTRIBUTE_MODEL_TYPE = eINSTANCE.getAttributeModelType();

        /**
         * The meta object literal for the '<em><b>Ea Guid</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_MODEL_TYPE__EA_GUID = eINSTANCE.getAttributeModelType_EaGuid();

        /**
         * The meta object literal for the '<em><b>Ea Localid</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_MODEL_TYPE__EA_LOCALID = eINSTANCE.getAttributeModelType_EaLocalid();

        /**
         * The meta object literal for the '{@link xmei.impl.AttributePropertiesTypeImpl <em>Attribute Properties Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.AttributePropertiesTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getAttributePropertiesType()
         * @generated
         */
        EClass ATTRIBUTE_PROPERTIES_TYPE = eINSTANCE.getAttributePropertiesType();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_PROPERTIES_TYPE__TYPE = eINSTANCE.getAttributePropertiesType_Type();

        /**
         * The meta object literal for the '{@link xmei.impl.AttributesTypeImpl <em>Attributes Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.AttributesTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getAttributesType()
         * @generated
         */
        EClass ATTRIBUTES_TYPE = eINSTANCE.getAttributesType();

        /**
         * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTES_TYPE__ATTRIBUTE = eINSTANCE.getAttributesType_Attribute();

        /**
         * The meta object literal for the '{@link xmei.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.AttributeTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getAttributeType()
         * @generated
         */
        EClass ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

        /**
         * The meta object literal for the '<em><b>Initial</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_TYPE__INITIAL = eINSTANCE.getAttributeType_Initial();

        /**
         * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_TYPE__DOCUMENTATION = eINSTANCE.getAttributeType_Documentation();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_TYPE__MODEL = eINSTANCE.getAttributeType_Model();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_TYPE__PROPERTIES = eINSTANCE.getAttributeType_Properties();

        /**
         * The meta object literal for the '<em><b>Containment</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_TYPE__CONTAINMENT = eINSTANCE.getAttributeType_Containment();

        /**
         * The meta object literal for the '<em><b>Stereotype</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_TYPE__STEREOTYPE = eINSTANCE.getAttributeType_Stereotype();

        /**
         * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_TYPE__BOUNDS = eINSTANCE.getAttributeType_Bounds();

        /**
         * The meta object literal for the '<em><b>Styleex</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_TYPE__STYLEEX = eINSTANCE.getAttributeType_Styleex();

        /**
         * The meta object literal for the '<em><b>Xrefs</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_TYPE__XREFS = eINSTANCE.getAttributeType_Xrefs();

        /**
         * The meta object literal for the '<em><b>Idref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_TYPE__IDREF = eINSTANCE.getAttributeType_Idref();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_TYPE__NAME = eINSTANCE.getAttributeType_Name();

        /**
         * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_TYPE__SCOPE = eINSTANCE.getAttributeType_Scope();

        /**
         * The meta object literal for the '{@link xmei.impl.BoundsTypeImpl <em>Bounds Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.BoundsTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getBoundsType()
         * @generated
         */
        EClass BOUNDS_TYPE = eINSTANCE.getBoundsType();

        /**
         * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDS_TYPE__LOWER = eINSTANCE.getBoundsType_Lower();

        /**
         * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BOUNDS_TYPE__UPPER = eINSTANCE.getBoundsType_Upper();

        /**
         * The meta object literal for the '{@link xmei.impl.CodeTypeImpl <em>Code Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.CodeTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getCodeType()
         * @generated
         */
        EClass CODE_TYPE = eINSTANCE.getCodeType();

        /**
         * The meta object literal for the '<em><b>Gentype</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CODE_TYPE__GENTYPE = eINSTANCE.getCodeType_Gentype();

        /**
         * The meta object literal for the '{@link xmei.impl.ConcreteLinkTypeImpl <em>Concrete Link Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.ConcreteLinkTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getConcreteLinkType()
         * @generated
         */
        EClass CONCRETE_LINK_TYPE = eINSTANCE.getConcreteLinkType();

        /**
         * The meta object literal for the '<em><b>End</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONCRETE_LINK_TYPE__END = eINSTANCE.getConcreteLinkType_End();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONCRETE_LINK_TYPE__ID = eINSTANCE.getConcreteLinkType_Id();

        /**
         * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONCRETE_LINK_TYPE__START = eINSTANCE.getConcreteLinkType_Start();

        /**
         * The meta object literal for the '{@link xmei.impl.ConnectorAppearanceTypeImpl <em>Connector Appearance Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.ConnectorAppearanceTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getConnectorAppearanceType()
         * @generated
         */
        EClass CONNECTOR_APPEARANCE_TYPE = eINSTANCE.getConnectorAppearanceType();

        /**
         * The meta object literal for the '<em><b>Head Style</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_APPEARANCE_TYPE__HEAD_STYLE = eINSTANCE.getConnectorAppearanceType_HeadStyle();

        /**
         * The meta object literal for the '<em><b>Linecolor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_APPEARANCE_TYPE__LINECOLOR = eINSTANCE.getConnectorAppearanceType_Linecolor();

        /**
         * The meta object literal for the '<em><b>Linemode</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_APPEARANCE_TYPE__LINEMODE = eINSTANCE.getConnectorAppearanceType_Linemode();

        /**
         * The meta object literal for the '<em><b>Line Style</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_APPEARANCE_TYPE__LINE_STYLE = eINSTANCE.getConnectorAppearanceType_LineStyle();

        /**
         * The meta object literal for the '<em><b>Linewidth</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_APPEARANCE_TYPE__LINEWIDTH = eINSTANCE.getConnectorAppearanceType_Linewidth();

        /**
         * The meta object literal for the '<em><b>Seqno</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_APPEARANCE_TYPE__SEQNO = eINSTANCE.getConnectorAppearanceType_Seqno();

        /**
         * The meta object literal for the '{@link xmei.impl.ConnectorLabelsTypeImpl <em>Connector Labels Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.ConnectorLabelsTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getConnectorLabelsType()
         * @generated
         */
        EClass CONNECTOR_LABELS_TYPE = eINSTANCE.getConnectorLabelsType();

        /**
         * The meta object literal for the '<em><b>Lb</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_LABELS_TYPE__LB = eINSTANCE.getConnectorLabelsType_Lb();

        /**
         * The meta object literal for the '<em><b>Mb</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_LABELS_TYPE__MB = eINSTANCE.getConnectorLabelsType_Mb();

        /**
         * The meta object literal for the '<em><b>Mt</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_LABELS_TYPE__MT = eINSTANCE.getConnectorLabelsType_Mt();

        /**
         * The meta object literal for the '{@link xmei.impl.ConnectorModelTypeImpl <em>Connector Model Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.ConnectorModelTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getConnectorModelType()
         * @generated
         */
        EClass CONNECTOR_MODEL_TYPE = eINSTANCE.getConnectorModelType();

        /**
         * The meta object literal for the '<em><b>Ea Localid</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_MODEL_TYPE__EA_LOCALID = eINSTANCE.getConnectorModelType_EaLocalid();

        /**
         * The meta object literal for the '{@link xmei.impl.ConnectorModifiersTypeImpl <em>Connector Modifiers Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.ConnectorModifiersTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getConnectorModifiersType()
         * @generated
         */
        EClass CONNECTOR_MODIFIERS_TYPE = eINSTANCE.getConnectorModifiersType();

        /**
         * The meta object literal for the '<em><b>Changeable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_MODIFIERS_TYPE__CHANGEABLE = eINSTANCE.getConnectorModifiersType_Changeable();

        /**
         * The meta object literal for the '<em><b>Is Leaf</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_MODIFIERS_TYPE__IS_LEAF = eINSTANCE.getConnectorModifiersType_IsLeaf();

        /**
         * The meta object literal for the '<em><b>Is Navigable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_MODIFIERS_TYPE__IS_NAVIGABLE = eINSTANCE.getConnectorModifiersType_IsNavigable();

        /**
         * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_MODIFIERS_TYPE__IS_ORDERED = eINSTANCE.getConnectorModifiersType_IsOrdered();

        /**
         * The meta object literal for the '<em><b>Is Root</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_MODIFIERS_TYPE__IS_ROOT = eINSTANCE.getConnectorModifiersType_IsRoot();

        /**
         * The meta object literal for the '{@link xmei.impl.ConnectorPropertiesTypeImpl <em>Connector Properties Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.ConnectorPropertiesTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getConnectorPropertiesType()
         * @generated
         */
        EClass CONNECTOR_PROPERTIES_TYPE = eINSTANCE.getConnectorPropertiesType();

        /**
         * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_PROPERTIES_TYPE__DIRECTION = eINSTANCE.getConnectorPropertiesType_Direction();

        /**
         * The meta object literal for the '<em><b>Ea Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_PROPERTIES_TYPE__EA_TYPE = eINSTANCE.getConnectorPropertiesType_EaType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_PROPERTIES_TYPE__NAME = eINSTANCE.getConnectorPropertiesType_Name();

        /**
         * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_PROPERTIES_TYPE__STEREOTYPE = eINSTANCE.getConnectorPropertiesType_Stereotype();

        /**
         * The meta object literal for the '{@link xmei.impl.ConnectorsTypeImpl <em>Connectors Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.ConnectorsTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getConnectorsType()
         * @generated
         */
        EClass CONNECTORS_TYPE = eINSTANCE.getConnectorsType();

        /**
         * The meta object literal for the '<em><b>Connector</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTORS_TYPE__CONNECTOR = eINSTANCE.getConnectorsType_Connector();

        /**
         * The meta object literal for the '{@link xmei.impl.ConnectorTypeImpl <em>Connector Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.ConnectorTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getConnectorType()
         * @generated
         */
        EClass CONNECTOR_TYPE = eINSTANCE.getConnectorType();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTOR_TYPE__SOURCE = eINSTANCE.getConnectorType_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTOR_TYPE__TARGET = eINSTANCE.getConnectorType_Target();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTOR_TYPE__MODEL = eINSTANCE.getConnectorType_Model();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTOR_TYPE__PROPERTIES = eINSTANCE.getConnectorType_Properties();

        /**
         * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTOR_TYPE__MODIFIERS = eINSTANCE.getConnectorType_Modifiers();

        /**
         * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTOR_TYPE__DOCUMENTATION = eINSTANCE.getConnectorType_Documentation();

        /**
         * The meta object literal for the '<em><b>Appearance</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTOR_TYPE__APPEARANCE = eINSTANCE.getConnectorType_Appearance();

        /**
         * The meta object literal for the '<em><b>Labels</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTOR_TYPE__LABELS = eINSTANCE.getConnectorType_Labels();

        /**
         * The meta object literal for the '<em><b>Extended Properties</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTOR_TYPE__EXTENDED_PROPERTIES = eINSTANCE.getConnectorType_ExtendedProperties();

        /**
         * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTOR_TYPE__STYLE = eINSTANCE.getConnectorType_Style();

        /**
         * The meta object literal for the '<em><b>Xrefs</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTOR_TYPE__XREFS = eINSTANCE.getConnectorType_Xrefs();

        /**
         * The meta object literal for the '<em><b>Tags</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONNECTOR_TYPE__TAGS = eINSTANCE.getConnectorType_Tags();

        /**
         * The meta object literal for the '<em><b>Idref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONNECTOR_TYPE__IDREF = eINSTANCE.getConnectorType_Idref();

        /**
         * The meta object literal for the '{@link xmei.impl.DiagramElementsTypeImpl <em>Diagram Elements Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.DiagramElementsTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getDiagramElementsType()
         * @generated
         */
        EClass DIAGRAM_ELEMENTS_TYPE = eINSTANCE.getDiagramElementsType();

        /**
         * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM_ELEMENTS_TYPE__ELEMENT = eINSTANCE.getDiagramElementsType_Element();

        /**
         * The meta object literal for the '{@link xmei.impl.DiagramElementTypeImpl <em>Diagram Element Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.DiagramElementTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getDiagramElementType()
         * @generated
         */
        EClass DIAGRAM_ELEMENT_TYPE = eINSTANCE.getDiagramElementType();

        /**
         * The meta object literal for the '<em><b>Geometry</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM_ELEMENT_TYPE__GEOMETRY = eINSTANCE.getDiagramElementType_Geometry();

        /**
         * The meta object literal for the '<em><b>Seqno</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM_ELEMENT_TYPE__SEQNO = eINSTANCE.getDiagramElementType_Seqno();

        /**
         * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM_ELEMENT_TYPE__STYLE = eINSTANCE.getDiagramElementType_Style();

        /**
         * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM_ELEMENT_TYPE__SUBJECT = eINSTANCE.getDiagramElementType_Subject();

        /**
         * The meta object literal for the '{@link xmei.impl.DiagramModelTypeImpl <em>Diagram Model Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.DiagramModelTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getDiagramModelType()
         * @generated
         */
        EClass DIAGRAM_MODEL_TYPE = eINSTANCE.getDiagramModelType();

        /**
         * The meta object literal for the '<em><b>Local ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM_MODEL_TYPE__LOCAL_ID = eINSTANCE.getDiagramModelType_LocalID();

        /**
         * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM_MODEL_TYPE__OWNER = eINSTANCE.getDiagramModelType_Owner();

        /**
         * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM_MODEL_TYPE__PACKAGE = eINSTANCE.getDiagramModelType_Package();

        /**
         * The meta object literal for the '<em><b>Parent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM_MODEL_TYPE__PARENT = eINSTANCE.getDiagramModelType_Parent();

        /**
         * The meta object literal for the '{@link xmei.impl.DiagramPropertiesTypeImpl <em>Diagram Properties Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.DiagramPropertiesTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getDiagramPropertiesType()
         * @generated
         */
        EClass DIAGRAM_PROPERTIES_TYPE = eINSTANCE.getDiagramPropertiesType();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM_PROPERTIES_TYPE__NAME = eINSTANCE.getDiagramPropertiesType_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM_PROPERTIES_TYPE__TYPE = eINSTANCE.getDiagramPropertiesType_Type();

        /**
         * The meta object literal for the '{@link xmei.impl.DiagramsTypeImpl <em>Diagrams Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.DiagramsTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getDiagramsType()
         * @generated
         */
        EClass DIAGRAMS_TYPE = eINSTANCE.getDiagramsType();

        /**
         * The meta object literal for the '<em><b>Diagram</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAMS_TYPE__DIAGRAM = eINSTANCE.getDiagramsType_Diagram();

        /**
         * The meta object literal for the '{@link xmei.impl.DiagramTypeImpl <em>Diagram Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.DiagramTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getDiagramType()
         * @generated
         */
        EClass DIAGRAM_TYPE = eINSTANCE.getDiagramType();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM_TYPE__MODEL = eINSTANCE.getDiagramType_Model();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM_TYPE__PROPERTIES = eINSTANCE.getDiagramType_Properties();

        /**
         * The meta object literal for the '<em><b>Project</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM_TYPE__PROJECT = eINSTANCE.getDiagramType_Project();

        /**
         * The meta object literal for the '<em><b>Style1</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM_TYPE__STYLE1 = eINSTANCE.getDiagramType_Style1();

        /**
         * The meta object literal for the '<em><b>Style2</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM_TYPE__STYLE2 = eINSTANCE.getDiagramType_Style2();

        /**
         * The meta object literal for the '<em><b>Swimlanes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM_TYPE__SWIMLANES = eINSTANCE.getDiagramType_Swimlanes();

        /**
         * The meta object literal for the '<em><b>Matrixitems</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM_TYPE__MATRIXITEMS = eINSTANCE.getDiagramType_Matrixitems();

        /**
         * The meta object literal for the '<em><b>Elements</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DIAGRAM_TYPE__ELEMENTS = eINSTANCE.getDiagramType_Elements();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DIAGRAM_TYPE__ID = eINSTANCE.getDiagramType_Id();

        /**
         * The meta object literal for the '{@link xmei.impl.DocumentationImpl <em>Documentation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.DocumentationImpl
         * @see xmei.impl.XmeiPackageImpl#getDocumentation()
         * @generated
         */
        EClass DOCUMENTATION = eINSTANCE.getDocumentation();

        /**
         * The meta object literal for the '<em><b>Exporter</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTATION__EXPORTER = eINSTANCE.getDocumentation_Exporter();

        /**
         * The meta object literal for the '<em><b>Exporter Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTATION__EXPORTER_VERSION = eINSTANCE.getDocumentation_ExporterVersion();

        /**
         * The meta object literal for the '{@link xmei.impl.DocumentationTypeImpl <em>Documentation Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.DocumentationTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getDocumentationType()
         * @generated
         */
        EClass DOCUMENTATION_TYPE = eINSTANCE.getDocumentationType();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENTATION_TYPE__VALUE = eINSTANCE.getDocumentationType_Value();

        /**
         * The meta object literal for the '{@link xmei.impl.ElementsTypeImpl <em>Elements Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.ElementsTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getElementsType()
         * @generated
         */
        EClass ELEMENTS_TYPE = eINSTANCE.getElementsType();

        /**
         * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENTS_TYPE__ELEMENT = eINSTANCE.getElementsType_Element();

        /**
         * The meta object literal for the '{@link xmei.impl.ElementTypeImpl <em>Element Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.ElementTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getElementType()
         * @generated
         */
        EClass ELEMENT_TYPE = eINSTANCE.getElementType();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT_TYPE__MODEL = eINSTANCE.getElementType_Model();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT_TYPE__PROPERTIES = eINSTANCE.getElementType_Properties();

        /**
         * The meta object literal for the '<em><b>Project</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT_TYPE__PROJECT = eINSTANCE.getElementType_Project();

        /**
         * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT_TYPE__CODE = eINSTANCE.getElementType_Code();

        /**
         * The meta object literal for the '<em><b>Links</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT_TYPE__LINKS = eINSTANCE.getElementType_Links();

        /**
         * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT_TYPE__ATTRIBUTES = eINSTANCE.getElementType_Attributes();

        /**
         * The meta object literal for the '<em><b>Operations</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELEMENT_TYPE__OPERATIONS = eINSTANCE.getElementType_Operations();

        /**
         * The meta object literal for the '<em><b>Idref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_TYPE__IDREF = eINSTANCE.getElementType_Idref();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_TYPE__NAME = eINSTANCE.getElementType_Name();

        /**
         * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_TYPE__SCOPE = eINSTANCE.getElementType_Scope();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ELEMENT_TYPE__TYPE = eINSTANCE.getElementType_Type();

        /**
         * The meta object literal for the '{@link xmei.impl.ExtendedPropertiesTypeImpl <em>Extended Properties Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.ExtendedPropertiesTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getExtendedPropertiesType()
         * @generated
         */
        EClass EXTENDED_PROPERTIES_TYPE = eINSTANCE.getExtendedPropertiesType();

        /**
         * The meta object literal for the '<em><b>Conditional</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTENDED_PROPERTIES_TYPE__CONDITIONAL = eINSTANCE.getExtendedPropertiesType_Conditional();

        /**
         * The meta object literal for the '<em><b>Diagram</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTENDED_PROPERTIES_TYPE__DIAGRAM = eINSTANCE.getExtendedPropertiesType_Diagram();

        /**
         * The meta object literal for the '<em><b>Privatedata1</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTENDED_PROPERTIES_TYPE__PRIVATEDATA1 = eINSTANCE.getExtendedPropertiesType_Privatedata1();

        /**
         * The meta object literal for the '<em><b>Privatedata2</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTENDED_PROPERTIES_TYPE__PRIVATEDATA2 = eINSTANCE.getExtendedPropertiesType_Privatedata2();

        /**
         * The meta object literal for the '<em><b>Privatedata3</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTENDED_PROPERTIES_TYPE__PRIVATEDATA3 = eINSTANCE.getExtendedPropertiesType_Privatedata3();

        /**
         * The meta object literal for the '<em><b>Privatedata4</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTENDED_PROPERTIES_TYPE__PRIVATEDATA4 = eINSTANCE.getExtendedPropertiesType_Privatedata4();

        /**
         * The meta object literal for the '<em><b>Privatedata5</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTENDED_PROPERTIES_TYPE__PRIVATEDATA5 = eINSTANCE.getExtendedPropertiesType_Privatedata5();

        /**
         * The meta object literal for the '<em><b>Sequence Points</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTENDED_PROPERTIES_TYPE__SEQUENCE_POINTS = eINSTANCE.getExtendedPropertiesType_SequencePoints();

        /**
         * The meta object literal for the '<em><b>Stateflags</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTENDED_PROPERTIES_TYPE__STATEFLAGS = eINSTANCE.getExtendedPropertiesType_Stateflags();

        /**
         * The meta object literal for the '<em><b>Virtual Inheritance</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTENDED_PROPERTIES_TYPE__VIRTUAL_INHERITANCE = eINSTANCE.getExtendedPropertiesType_VirtualInheritance();

        /**
         * The meta object literal for the '{@link xmei.impl.ExtensionImpl <em>Extension</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.ExtensionImpl
         * @see xmei.impl.XmeiPackageImpl#getExtension()
         * @generated
         */
        EClass EXTENSION = eINSTANCE.getExtension();

        /**
         * The meta object literal for the '<em><b>Elements</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTENSION__ELEMENTS = eINSTANCE.getExtension_Elements();

        /**
         * The meta object literal for the '<em><b>Connectors</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTENSION__CONNECTORS = eINSTANCE.getExtension_Connectors();

        /**
         * The meta object literal for the '<em><b>Primitivetypes</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTENSION__PRIMITIVETYPES = eINSTANCE.getExtension_Primitivetypes();

        /**
         * The meta object literal for the '<em><b>Profiles</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTENSION__PROFILES = eINSTANCE.getExtension_Profiles();

        /**
         * The meta object literal for the '<em><b>Diagrams</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXTENSION__DIAGRAMS = eINSTANCE.getExtension_Diagrams();

        /**
         * The meta object literal for the '<em><b>Extender</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTENSION__EXTENDER = eINSTANCE.getExtension_Extender();

        /**
         * The meta object literal for the '<em><b>Extender ID</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXTENSION__EXTENDER_ID = eINSTANCE.getExtension_ExtenderID();

        /**
         * The meta object literal for the '{@link xmei.impl.InitialTypeImpl <em>Initial Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.InitialTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getInitialType()
         * @generated
         */
        EClass INITIAL_TYPE = eINSTANCE.getInitialType();

        /**
         * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INITIAL_TYPE__BODY = eINSTANCE.getInitialType_Body();

        /**
         * The meta object literal for the '{@link xmei.impl.LinksTypeImpl <em>Links Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.LinksTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getLinksType()
         * @generated
         */
        EClass LINKS_TYPE = eINSTANCE.getLinksType();

        /**
         * The meta object literal for the '<em><b>Sequence</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINKS_TYPE__SEQUENCE = eINSTANCE.getLinksType_Sequence();

        /**
         * The meta object literal for the '<em><b>Realisation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINKS_TYPE__REALISATION = eINSTANCE.getLinksType_Realisation();

        /**
         * The meta object literal for the '<em><b>Generalization</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINKS_TYPE__GENERALIZATION = eINSTANCE.getLinksType_Generalization();

        /**
         * The meta object literal for the '<em><b>Dependency</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINKS_TYPE__DEPENDENCY = eINSTANCE.getLinksType_Dependency();

        /**
         * The meta object literal for the '<em><b>Association</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINKS_TYPE__ASSOCIATION = eINSTANCE.getLinksType_Association();

        /**
         * The meta object literal for the '{@link xmei.impl.ModelTypeImpl <em>Model Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.ModelTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getModelType()
         * @generated
         */
        EClass MODEL_TYPE = eINSTANCE.getModelType();

        /**
         * The meta object literal for the '<em><b>Ea Ele Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_TYPE__EA_ELE_TYPE = eINSTANCE.getModelType_EaEleType();

        /**
         * The meta object literal for the '<em><b>Ea Localid</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_TYPE__EA_LOCALID = eINSTANCE.getModelType_EaLocalid();

        /**
         * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_TYPE__OWNER = eINSTANCE.getModelType_Owner();

        /**
         * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_TYPE__PACKAGE = eINSTANCE.getModelType_Package();

        /**
         * The meta object literal for the '<em><b>Package2</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_TYPE__PACKAGE2 = eINSTANCE.getModelType_Package2();

        /**
         * The meta object literal for the '<em><b>Tpos</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_TYPE__TPOS = eINSTANCE.getModelType_Tpos();

        /**
         * The meta object literal for the '{@link xmei.impl.OperationParametersTypeImpl <em>Operation Parameters Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.OperationParametersTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getOperationParametersType()
         * @generated
         */
        EClass OPERATION_PARAMETERS_TYPE = eINSTANCE.getOperationParametersType();

        /**
         * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION_PARAMETERS_TYPE__PARAMETER = eINSTANCE.getOperationParametersType_Parameter();

        /**
         * The meta object literal for the '{@link xmei.impl.OperationPropertiesTypeImpl <em>Operation Properties Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.OperationPropertiesTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getOperationPropertiesType()
         * @generated
         */
        EClass OPERATION_PROPERTIES_TYPE = eINSTANCE.getOperationPropertiesType();

        /**
         * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION_PROPERTIES_TYPE__POSITION = eINSTANCE.getOperationPropertiesType_Position();

        /**
         * The meta object literal for the '{@link xmei.impl.OperationsTypeImpl <em>Operations Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.OperationsTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getOperationsType()
         * @generated
         */
        EClass OPERATIONS_TYPE = eINSTANCE.getOperationsType();

        /**
         * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATIONS_TYPE__OPERATION = eINSTANCE.getOperationsType_Operation();

        /**
         * The meta object literal for the '{@link xmei.impl.OperationTagsTypeImpl <em>Operation Tags Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.OperationTagsTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getOperationTagsType()
         * @generated
         */
        EClass OPERATION_TAGS_TYPE = eINSTANCE.getOperationTagsType();

        /**
         * The meta object literal for the '<em><b>Tag</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION_TAGS_TYPE__TAG = eINSTANCE.getOperationTagsType_Tag();

        /**
         * The meta object literal for the '{@link xmei.impl.OperationTypeImpl <em>Operation Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.OperationTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getOperationType()
         * @generated
         */
        EClass OPERATION_TYPE = eINSTANCE.getOperationType();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION_TYPE__PROPERTIES = eINSTANCE.getOperationType_Properties();

        /**
         * The meta object literal for the '<em><b>Stereotype</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION_TYPE__STEREOTYPE = eINSTANCE.getOperationType_Stereotype();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION_TYPE__MODEL = eINSTANCE.getOperationType_Model();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION_TYPE__TYPE = eINSTANCE.getOperationType_Type();

        /**
         * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION_TYPE__DOCUMENTATION = eINSTANCE.getOperationType_Documentation();

        /**
         * The meta object literal for the '<em><b>Tags</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION_TYPE__TAGS = eINSTANCE.getOperationType_Tags();

        /**
         * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION_TYPE__PARAMETERS = eINSTANCE.getOperationType_Parameters();

        /**
         * The meta object literal for the '<em><b>Xrefs</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OPERATION_TYPE__XREFS = eINSTANCE.getOperationType_Xrefs();

        /**
         * The meta object literal for the '<em><b>Idref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION_TYPE__IDREF = eINSTANCE.getOperationType_Idref();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION_TYPE__NAME = eINSTANCE.getOperationType_Name();

        /**
         * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION_TYPE__SCOPE = eINSTANCE.getOperationType_Scope();

        /**
         * The meta object literal for the '{@link xmei.impl.OperationTypeTypeImpl <em>Operation Type Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.OperationTypeTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getOperationTypeType()
         * @generated
         */
        EClass OPERATION_TYPE_TYPE = eINSTANCE.getOperationTypeType();

        /**
         * The meta object literal for the '<em><b>Concurrency</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION_TYPE_TYPE__CONCURRENCY = eINSTANCE.getOperationTypeType_Concurrency();

        /**
         * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION_TYPE_TYPE__CONST = eINSTANCE.getOperationTypeType_Const();

        /**
         * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION_TYPE_TYPE__IS_ABSTRACT = eINSTANCE.getOperationTypeType_IsAbstract();

        /**
         * The meta object literal for the '<em><b>Is Query</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION_TYPE_TYPE__IS_QUERY = eINSTANCE.getOperationTypeType_IsQuery();

        /**
         * The meta object literal for the '<em><b>Pure</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION_TYPE_TYPE__PURE = eINSTANCE.getOperationTypeType_Pure();

        /**
         * The meta object literal for the '<em><b>Returnarray</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION_TYPE_TYPE__RETURNARRAY = eINSTANCE.getOperationTypeType_Returnarray();

        /**
         * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION_TYPE_TYPE__STATIC = eINSTANCE.getOperationTypeType_Static();

        /**
         * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION_TYPE_TYPE__STEREOTYPE = eINSTANCE.getOperationTypeType_Stereotype();

        /**
         * The meta object literal for the '<em><b>Synchronised</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OPERATION_TYPE_TYPE__SYNCHRONISED = eINSTANCE.getOperationTypeType_Synchronised();

        /**
         * The meta object literal for the '{@link xmei.impl.ParameterPropertiesTypeImpl <em>Parameter Properties Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.ParameterPropertiesTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getParameterPropertiesType()
         * @generated
         */
        EClass PARAMETER_PROPERTIES_TYPE = eINSTANCE.getParameterPropertiesType();

        /**
         * The meta object literal for the '<em><b>Classifier</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_PROPERTIES_TYPE__CLASSIFIER = eINSTANCE.getParameterPropertiesType_Classifier();

        /**
         * The meta object literal for the '<em><b>Const</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_PROPERTIES_TYPE__CONST = eINSTANCE.getParameterPropertiesType_Const();

        /**
         * The meta object literal for the '<em><b>Ea Guid</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_PROPERTIES_TYPE__EA_GUID = eINSTANCE.getParameterPropertiesType_EaGuid();

        /**
         * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_PROPERTIES_TYPE__POS = eINSTANCE.getParameterPropertiesType_Pos();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_PROPERTIES_TYPE__TYPE = eINSTANCE.getParameterPropertiesType_Type();

        /**
         * The meta object literal for the '{@link xmei.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.ParameterTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getParameterType()
         * @generated
         */
        EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER_TYPE__PROPERTIES = eINSTANCE.getParameterType_Properties();

        /**
         * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER_TYPE__DOCUMENTATION = eINSTANCE.getParameterType_Documentation();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER_TYPE__VALUE = eINSTANCE.getParameterType_Value();

        /**
         * The meta object literal for the '<em><b>Xrefs</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARAMETER_TYPE__XREFS = eINSTANCE.getParameterType_Xrefs();

        /**
         * The meta object literal for the '<em><b>Idref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_TYPE__IDREF = eINSTANCE.getParameterType_Idref();

        /**
         * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER_TYPE__VISIBILITY = eINSTANCE.getParameterType_Visibility();

        /**
         * The meta object literal for the '{@link xmei.impl.PrimitiveTypesTypeImpl <em>Primitive Types Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.PrimitiveTypesTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getPrimitiveTypesType()
         * @generated
         */
        EClass PRIMITIVE_TYPES_TYPE = eINSTANCE.getPrimitiveTypesType();

        /**
         * The meta object literal for the '<em><b>Packaged Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRIMITIVE_TYPES_TYPE__PACKAGED_ELEMENT = eINSTANCE.getPrimitiveTypesType_PackagedElement();

        /**
         * The meta object literal for the '{@link xmei.impl.ProjectTypeImpl <em>Project Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.ProjectTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getProjectType()
         * @generated
         */
        EClass PROJECT_TYPE = eINSTANCE.getProjectType();

        /**
         * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROJECT_TYPE__AUTHOR = eINSTANCE.getProjectType_Author();

        /**
         * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROJECT_TYPE__CREATED = eINSTANCE.getProjectType_Created();

        /**
         * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROJECT_TYPE__MODIFIED = eINSTANCE.getProjectType_Modified();

        /**
         * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROJECT_TYPE__PHASE = eINSTANCE.getProjectType_Phase();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROJECT_TYPE__VERSION = eINSTANCE.getProjectType_Version();

        /**
         * The meta object literal for the '{@link xmei.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.PropertiesTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getPropertiesType()
         * @generated
         */
        EClass PROPERTIES_TYPE = eINSTANCE.getPropertiesType();

        /**
         * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTIES_TYPE__CLASS_NAME = eINSTANCE.getPropertiesType_ClassName();

        /**
         * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTIES_TYPE__DOCUMENTATION = eINSTANCE.getPropertiesType_Documentation();

        /**
         * The meta object literal for the '<em><b>Genlinks</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTIES_TYPE__GENLINKS = eINSTANCE.getPropertiesType_Genlinks();

        /**
         * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTIES_TYPE__IS_ABSTRACT = eINSTANCE.getPropertiesType_IsAbstract();

        /**
         * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTIES_TYPE__IS_ACTIVE = eINSTANCE.getPropertiesType_IsActive();

        /**
         * The meta object literal for the '<em><b>Is Leaf</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTIES_TYPE__IS_LEAF = eINSTANCE.getPropertiesType_IsLeaf();

        /**
         * The meta object literal for the '<em><b>Is Root</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTIES_TYPE__IS_ROOT = eINSTANCE.getPropertiesType_IsRoot();

        /**
         * The meta object literal for the '<em><b>Is Specification</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTIES_TYPE__IS_SPECIFICATION = eINSTANCE.getPropertiesType_IsSpecification();

        /**
         * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTIES_TYPE__SCOPE = eINSTANCE.getPropertiesType_Scope();

        /**
         * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTIES_TYPE__STEREOTYPE = eINSTANCE.getPropertiesType_Stereotype();

        /**
         * The meta object literal for the '<em><b>SType</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTIES_TYPE__STYPE = eINSTANCE.getPropertiesType_SType();

        /**
         * The meta object literal for the '{@link xmei.impl.SourceAndTargetModelTypeImpl <em>Source And Target Model Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.SourceAndTargetModelTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getSourceAndTargetModelType()
         * @generated
         */
        EClass SOURCE_AND_TARGET_MODEL_TYPE = eINSTANCE.getSourceAndTargetModelType();

        /**
         * The meta object literal for the '<em><b>Ea Localid</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOURCE_AND_TARGET_MODEL_TYPE__EA_LOCALID = eINSTANCE.getSourceAndTargetModelType_EaLocalid();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOURCE_AND_TARGET_MODEL_TYPE__NAME = eINSTANCE.getSourceAndTargetModelType_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOURCE_AND_TARGET_MODEL_TYPE__TYPE = eINSTANCE.getSourceAndTargetModelType_Type();

        /**
         * The meta object literal for the '{@link xmei.impl.SourceAndTargetRoleTypeImpl <em>Source And Target Role Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.SourceAndTargetRoleTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getSourceAndTargetRoleType()
         * @generated
         */
        EClass SOURCE_AND_TARGET_ROLE_TYPE = eINSTANCE.getSourceAndTargetRoleType();

        /**
         * The meta object literal for the '<em><b>Target Scope</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOURCE_AND_TARGET_ROLE_TYPE__TARGET_SCOPE = eINSTANCE.getSourceAndTargetRoleType_TargetScope();

        /**
         * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOURCE_AND_TARGET_ROLE_TYPE__VISIBILITY = eINSTANCE.getSourceAndTargetRoleType_Visibility();

        /**
         * The meta object literal for the '{@link xmei.impl.SourceAndTargetTypeImpl <em>Source And Target Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.SourceAndTargetTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getSourceAndTargetType()
         * @generated
         */
        EClass SOURCE_AND_TARGET_TYPE = eINSTANCE.getSourceAndTargetType();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOURCE_AND_TARGET_TYPE__MODEL = eINSTANCE.getSourceAndTargetType_Model();

        /**
         * The meta object literal for the '<em><b>Role</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOURCE_AND_TARGET_TYPE__ROLE = eINSTANCE.getSourceAndTargetType_Role();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOURCE_AND_TARGET_TYPE__TYPE = eINSTANCE.getSourceAndTargetType_Type();

        /**
         * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOURCE_AND_TARGET_TYPE__MODIFIERS = eINSTANCE.getSourceAndTargetType_Modifiers();

        /**
         * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOURCE_AND_TARGET_TYPE__STYLE = eINSTANCE.getSourceAndTargetType_Style();

        /**
         * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOURCE_AND_TARGET_TYPE__DOCUMENTATION = eINSTANCE.getSourceAndTargetType_Documentation();

        /**
         * The meta object literal for the '<em><b>Xrefs</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOURCE_AND_TARGET_TYPE__XREFS = eINSTANCE.getSourceAndTargetType_Xrefs();

        /**
         * The meta object literal for the '<em><b>Tags</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOURCE_AND_TARGET_TYPE__TAGS = eINSTANCE.getSourceAndTargetType_Tags();

        /**
         * The meta object literal for the '<em><b>Idref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOURCE_AND_TARGET_TYPE__IDREF = eINSTANCE.getSourceAndTargetType_Idref();

        /**
         * The meta object literal for the '{@link xmei.impl.SourceAndTargetTypeTypeImpl <em>Source And Target Type Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.SourceAndTargetTypeTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getSourceAndTargetTypeType()
         * @generated
         */
        EClass SOURCE_AND_TARGET_TYPE_TYPE = eINSTANCE.getSourceAndTargetTypeType();

        /**
         * The meta object literal for the '<em><b>Aggregation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOURCE_AND_TARGET_TYPE_TYPE__AGGREGATION = eINSTANCE.getSourceAndTargetTypeType_Aggregation();

        /**
         * The meta object literal for the '<em><b>Containment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOURCE_AND_TARGET_TYPE_TYPE__CONTAINMENT = eINSTANCE.getSourceAndTargetTypeType_Containment();

        /**
         * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOURCE_AND_TARGET_TYPE_TYPE__MULTIPLICITY = eINSTANCE.getSourceAndTargetTypeType_Multiplicity();

        /**
         * The meta object literal for the '{@link xmei.impl.StereotypeAttributeTypeImpl <em>Stereotype Attribute Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.StereotypeAttributeTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getStereotypeAttributeType()
         * @generated
         */
        EClass STEREOTYPE_ATTRIBUTE_TYPE = eINSTANCE.getStereotypeAttributeType();

        /**
         * The meta object literal for the '<em><b>Stereotype</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STEREOTYPE_ATTRIBUTE_TYPE__STEREOTYPE = eINSTANCE.getStereotypeAttributeType_Stereotype();

        /**
         * The meta object literal for the '{@link xmei.impl.StyleexTypeImpl <em>Styleex Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.StyleexTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getStyleexType()
         * @generated
         */
        EClass STYLEEX_TYPE = eINSTANCE.getStyleexType();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLEEX_TYPE__VALUE = eINSTANCE.getStyleexType_Value();

        /**
         * The meta object literal for the '{@link xmei.impl.TagTypeImpl <em>Tag Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.TagTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getTagType()
         * @generated
         */
        EClass TAG_TYPE = eINSTANCE.getTagType();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TAG_TYPE__ID = eINSTANCE.getTagType_Id();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TAG_TYPE__NAME = eINSTANCE.getTagType_Name();

        /**
         * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TAG_TYPE__NOTES = eINSTANCE.getTagType_Notes();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TAG_TYPE__VALUE = eINSTANCE.getTagType_Value();

        /**
         * The meta object literal for the '{@link xmei.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.DocumentRootImpl
         * @see xmei.impl.XmeiPackageImpl#getDocumentRoot()
         * @generated
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>XMI</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XMI = eINSTANCE.getDocumentRoot_XMI();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__ID = eINSTANCE.getDocumentRoot_Id();

        /**
         * The meta object literal for the '<em><b>Idref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__IDREF = eINSTANCE.getDocumentRoot_Idref();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__TYPE = eINSTANCE.getDocumentRoot_Type();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__VERSION = eINSTANCE.getDocumentRoot_Version();

        /**
         * The meta object literal for the '{@link xmei.impl.XMITypeImpl <em>XMI Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.XMITypeImpl
         * @see xmei.impl.XmeiPackageImpl#getXMIType()
         * @generated
         */
        EClass XMI_TYPE = eINSTANCE.getXMIType();

        /**
         * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference XMI_TYPE__DOCUMENTATION = eINSTANCE.getXMIType_Documentation();

        /**
         * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference XMI_TYPE__MODEL = eINSTANCE.getXMIType_Model();

        /**
         * The meta object literal for the '<em><b>Extension</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference XMI_TYPE__EXTENSION = eINSTANCE.getXMIType_Extension();

        /**
         * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XMI_TYPE__VERSION = eINSTANCE.getXMIType_Version();

        /**
         * The meta object literal for the '{@link xmei.impl.XrefsTypeImpl <em>Xrefs Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.impl.XrefsTypeImpl
         * @see xmei.impl.XmeiPackageImpl#getXrefsType()
         * @generated
         */
        EClass XREFS_TYPE = eINSTANCE.getXrefsType();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XREFS_TYPE__VALUE = eINSTANCE.getXrefsType_Value();

        /**
         * The meta object literal for the '{@link xmei.AsyncSyncType <em>Async Sync Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.AsyncSyncType
         * @see xmei.impl.XmeiPackageImpl#getAsyncSyncType()
         * @generated
         */
        EEnum ASYNC_SYNC_TYPE = eINSTANCE.getAsyncSyncType();

        /**
         * The meta object literal for the '{@link xmei.DiagramTypeType <em>Diagram Type Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.DiagramTypeType
         * @see xmei.impl.XmeiPackageImpl#getDiagramTypeType()
         * @generated
         */
        EEnum DIAGRAM_TYPE_TYPE = eINSTANCE.getDiagramTypeType();

        /**
         * The meta object literal for the '{@link xmei.DirectionType <em>Direction Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.DirectionType
         * @see xmei.impl.XmeiPackageImpl#getDirectionType()
         * @generated
         */
        EEnum DIRECTION_TYPE = eINSTANCE.getDirectionType();

        /**
         * The meta object literal for the '{@link xmei.EaTypesType <em>Ea Types Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.EaTypesType
         * @see xmei.impl.XmeiPackageImpl#getEaTypesType()
         * @generated
         */
        EEnum EA_TYPES_TYPE = eINSTANCE.getEaTypesType();

        /**
         * The meta object literal for the '{@link xmei.StereotypeType <em>Stereotype Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.StereotypeType
         * @see xmei.impl.XmeiPackageImpl#getStereotypeType()
         * @generated
         */
        EEnum STEREOTYPE_TYPE = eINSTANCE.getStereotypeType();

        /**
         * The meta object literal for the '{@link xmei.STypeType <em>SType Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.STypeType
         * @see xmei.impl.XmeiPackageImpl#getSTypeType()
         * @generated
         */
        EEnum STYPE_TYPE = eINSTANCE.getSTypeType();

        /**
         * The meta object literal for the '{@link xmei.TypeBaseType <em>Type Base Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.TypeBaseType
         * @see xmei.impl.XmeiPackageImpl#getTypeBaseType()
         * @generated
         */
        EEnum TYPE_BASE_TYPE = eINSTANCE.getTypeBaseType();

        /**
         * The meta object literal for the '<em>Async Sync Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.AsyncSyncType
         * @see xmei.impl.XmeiPackageImpl#getAsyncSyncTypeObject()
         * @generated
         */
        EDataType ASYNC_SYNC_TYPE_OBJECT = eINSTANCE.getAsyncSyncTypeObject();

        /**
         * The meta object literal for the '<em>Diagram Type Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.DiagramTypeType
         * @see xmei.impl.XmeiPackageImpl#getDiagramTypeTypeObject()
         * @generated
         */
        EDataType DIAGRAM_TYPE_TYPE_OBJECT = eINSTANCE.getDiagramTypeTypeObject();

        /**
         * The meta object literal for the '<em>Direction Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.DirectionType
         * @see xmei.impl.XmeiPackageImpl#getDirectionTypeObject()
         * @generated
         */
        EDataType DIRECTION_TYPE_OBJECT = eINSTANCE.getDirectionTypeObject();

        /**
         * The meta object literal for the '<em>Ea Types Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.EaTypesType
         * @see xmei.impl.XmeiPackageImpl#getEaTypesTypeObject()
         * @generated
         */
        EDataType EA_TYPES_TYPE_OBJECT = eINSTANCE.getEaTypesTypeObject();

        /**
         * The meta object literal for the '<em>Id Type</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see xmei.impl.XmeiPackageImpl#getIdType()
         * @generated
         */
        EDataType ID_TYPE = eINSTANCE.getIdType();

        /**
         * The meta object literal for the '<em>Stereotype Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.StereotypeType
         * @see xmei.impl.XmeiPackageImpl#getStereotypeTypeObject()
         * @generated
         */
        EDataType STEREOTYPE_TYPE_OBJECT = eINSTANCE.getStereotypeTypeObject();

        /**
         * The meta object literal for the '<em>SType Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.STypeType
         * @see xmei.impl.XmeiPackageImpl#getSTypeTypeObject()
         * @generated
         */
        EDataType STYPE_TYPE_OBJECT = eINSTANCE.getSTypeTypeObject();

        /**
         * The meta object literal for the '<em>Type Base Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see xmei.TypeBaseType
         * @see xmei.impl.XmeiPackageImpl#getTypeBaseTypeObject()
         * @generated
         */
        EDataType TYPE_BASE_TYPE_OBJECT = eINSTANCE.getTypeBaseTypeObject();

    }

} //XmeiPackage
