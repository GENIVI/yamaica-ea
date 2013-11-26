/**
 */
package uml;

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
 * @see uml.UmlFactory
 * @model kind="package"
 * @generated
 */
public interface UmlPackage extends EPackage
{
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "uml";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "uml.Franca2EA_UML_Schema";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "uml";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    UmlPackage eINSTANCE = uml.impl.UmlPackageImpl.init();

    /**
     * The meta object id for the '{@link uml.impl.DefaultValueTypeImpl <em>Default Value Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.DefaultValueTypeImpl
     * @see uml.impl.UmlPackageImpl#getDefaultValueType()
     * @generated
     */
    int DEFAULT_VALUE_TYPE = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_VALUE_TYPE__ID = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_VALUE_TYPE__TYPE = 1;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_VALUE_TYPE__VALUE = 2;

    /**
     * The number of structural features of the '<em>Default Value Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_VALUE_TYPE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Default Value Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_VALUE_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link uml.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.DocumentRootImpl
     * @see uml.impl.UmlPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 1;

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
     * The feature id for the '<em><b>Model</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MODEL = 3;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link uml.impl.GeneralizationTypeImpl <em>Generalization Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.GeneralizationTypeImpl
     * @see uml.impl.UmlPackageImpl#getGeneralizationType()
     * @generated
     */
    int GENERALIZATION_TYPE = 2;

    /**
     * The feature id for the '<em><b>General</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION_TYPE__GENERAL = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION_TYPE__ID = 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION_TYPE__TYPE = 2;

    /**
     * The number of structural features of the '<em>Generalization Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION_TYPE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Generalization Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GENERALIZATION_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link uml.impl.MemberEndTypeImpl <em>Member End Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.MemberEndTypeImpl
     * @see uml.impl.UmlPackageImpl#getMemberEndType()
     * @generated
     */
    int MEMBER_END_TYPE = 3;

    /**
     * The feature id for the '<em><b>Idref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_END_TYPE__IDREF = 0;

    /**
     * The number of structural features of the '<em>Member End Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_END_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Member End Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_END_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link uml.impl.ModelTypeImpl <em>Model Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.ModelTypeImpl
     * @see uml.impl.UmlPackageImpl#getModelType()
     * @generated
     */
    int MODEL_TYPE = 4;

    /**
     * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TYPE__PACKAGED_ELEMENT = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TYPE__NAME = 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TYPE__TYPE = 2;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TYPE__VISIBILITY = 3;

    /**
     * The number of structural features of the '<em>Model Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TYPE_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Model Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link uml.impl.MultiplicityValueTypeImpl <em>Multiplicity Value Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.MultiplicityValueTypeImpl
     * @see uml.impl.UmlPackageImpl#getMultiplicityValueType()
     * @generated
     */
    int MULTIPLICITY_VALUE_TYPE = 5;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICITY_VALUE_TYPE__ID = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICITY_VALUE_TYPE__TYPE = 1;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICITY_VALUE_TYPE__VALUE = 2;

    /**
     * The number of structural features of the '<em>Multiplicity Value Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICITY_VALUE_TYPE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Multiplicity Value Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTIPLICITY_VALUE_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link uml.impl.OwnedAttributeBaseTypeImpl <em>Owned Attribute Base Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.OwnedAttributeBaseTypeImpl
     * @see uml.impl.UmlPackageImpl#getOwnedAttributeBaseType()
     * @generated
     */
    int OWNED_ATTRIBUTE_BASE_TYPE = 6;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_BASE_TYPE__TYPE = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_BASE_TYPE__ID = 1;

    /**
     * The feature id for the '<em><b>Type1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_BASE_TYPE__TYPE1 = 2;

    /**
     * The number of structural features of the '<em>Owned Attribute Base Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_BASE_TYPE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Owned Attribute Base Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_BASE_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link uml.impl.OwnedAttributeExtendedAttributesTypeImpl <em>Owned Attribute Extended Attributes Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.OwnedAttributeExtendedAttributesTypeImpl
     * @see uml.impl.UmlPackageImpl#getOwnedAttributeExtendedAttributesType()
     * @generated
     */
    int OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE = 7;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__TYPE = OWNED_ATTRIBUTE_BASE_TYPE__TYPE;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__ID = OWNED_ATTRIBUTE_BASE_TYPE__ID;

    /**
     * The feature id for the '<em><b>Type1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__TYPE1 = OWNED_ATTRIBUTE_BASE_TYPE__TYPE1;

    /**
     * The feature id for the '<em><b>Aggregation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__AGGREGATION = OWNED_ATTRIBUTE_BASE_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Association</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__ASSOCIATION = OWNED_ATTRIBUTE_BASE_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Is Derived</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED = OWNED_ATTRIBUTE_BASE_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Is Derived Union</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED_UNION = OWNED_ATTRIBUTE_BASE_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_ORDERED = OWNED_ATTRIBUTE_BASE_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_READ_ONLY = OWNED_ATTRIBUTE_BASE_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Is Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_STATIC = OWNED_ATTRIBUTE_BASE_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Is Unique</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_UNIQUE = OWNED_ATTRIBUTE_BASE_TYPE_FEATURE_COUNT + 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__NAME = OWNED_ATTRIBUTE_BASE_TYPE_FEATURE_COUNT + 8;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__VISIBILITY = OWNED_ATTRIBUTE_BASE_TYPE_FEATURE_COUNT + 9;

    /**
     * The number of structural features of the '<em>Owned Attribute Extended Attributes Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE_FEATURE_COUNT = OWNED_ATTRIBUTE_BASE_TYPE_FEATURE_COUNT + 10;

    /**
     * The number of operations of the '<em>Owned Attribute Extended Attributes Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE_OPERATION_COUNT = OWNED_ATTRIBUTE_BASE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link uml.impl.OwnedAttributeExtendedContentTypeImpl <em>Owned Attribute Extended Content Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.OwnedAttributeExtendedContentTypeImpl
     * @see uml.impl.UmlPackageImpl#getOwnedAttributeExtendedContentType()
     * @generated
     */
    int OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE = 8;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__TYPE = OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__TYPE;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__ID = OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__ID;

    /**
     * The feature id for the '<em><b>Type1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__TYPE1 = OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__TYPE1;

    /**
     * The feature id for the '<em><b>Aggregation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__AGGREGATION = OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__AGGREGATION;

    /**
     * The feature id for the '<em><b>Association</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__ASSOCIATION = OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__ASSOCIATION;

    /**
     * The feature id for the '<em><b>Is Derived</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__IS_DERIVED = OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED;

    /**
     * The feature id for the '<em><b>Is Derived Union</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__IS_DERIVED_UNION = OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED_UNION;

    /**
     * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__IS_ORDERED = OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_ORDERED;

    /**
     * The feature id for the '<em><b>Is Read Only</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__IS_READ_ONLY = OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_READ_ONLY;

    /**
     * The feature id for the '<em><b>Is Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__IS_STATIC = OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_STATIC;

    /**
     * The feature id for the '<em><b>Is Unique</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__IS_UNIQUE = OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_UNIQUE;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__NAME = OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__VISIBILITY = OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__LOWER_VALUE = OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__UPPER_VALUE = OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Owned Attribute Extended Content Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE_FEATURE_COUNT = OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Owned Attribute Extended Content Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE_OPERATION_COUNT = OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link uml.impl.OwnedLiteralTypeImpl <em>Owned Literal Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.OwnedLiteralTypeImpl
     * @see uml.impl.UmlPackageImpl#getOwnedLiteralType()
     * @generated
     */
    int OWNED_LITERAL_TYPE = 9;

    /**
     * The feature id for the '<em><b>Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_LITERAL_TYPE__SPECIFICATION = 0;

    /**
     * The feature id for the '<em><b>Classifier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_LITERAL_TYPE__CLASSIFIER = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_LITERAL_TYPE__ID = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_LITERAL_TYPE__NAME = 3;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_LITERAL_TYPE__TYPE = 4;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_LITERAL_TYPE__VISIBILITY = 5;

    /**
     * The number of structural features of the '<em>Owned Literal Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_LITERAL_TYPE_FEATURE_COUNT = 6;

    /**
     * The number of operations of the '<em>Owned Literal Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_LITERAL_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link uml.impl.PackagedElementBaseTypeImpl <em>Packaged Element Base Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.PackagedElementBaseTypeImpl
     * @see uml.impl.UmlPackageImpl#getPackagedElementBaseType()
     * @generated
     */
    int PACKAGED_ELEMENT_BASE_TYPE = 13;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_BASE_TYPE__ID = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_BASE_TYPE__TYPE = 1;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_BASE_TYPE__VISIBILITY = 2;

    /**
     * The number of structural features of the '<em>Packaged Element Base Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Packaged Element Base Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_BASE_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link uml.impl.OwnedOperationTypeImpl <em>Owned Operation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.OwnedOperationTypeImpl
     * @see uml.impl.UmlPackageImpl#getOwnedOperationType()
     * @generated
     */
    int OWNED_OPERATION_TYPE = 10;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_OPERATION_TYPE__ID = PACKAGED_ELEMENT_BASE_TYPE__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_OPERATION_TYPE__TYPE = PACKAGED_ELEMENT_BASE_TYPE__TYPE;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_OPERATION_TYPE__VISIBILITY = PACKAGED_ELEMENT_BASE_TYPE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_OPERATION_TYPE__OWNED_PARAMETER = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Concurrency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_OPERATION_TYPE__CONCURRENCY = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_OPERATION_TYPE__NAME = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Owned Operation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_OPERATION_TYPE_FEATURE_COUNT = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Owned Operation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_OPERATION_TYPE_OPERATION_COUNT = PACKAGED_ELEMENT_BASE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link uml.impl.OwnedParameterTypeImpl <em>Owned Parameter Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.OwnedParameterTypeImpl
     * @see uml.impl.UmlPackageImpl#getOwnedParameterType()
     * @generated
     */
    int OWNED_PARAMETER_TYPE = 11;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_PARAMETER_TYPE__DEFAULT_VALUE = 0;

    /**
     * The feature id for the '<em><b>Lower Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_PARAMETER_TYPE__LOWER_VALUE = 1;

    /**
     * The feature id for the '<em><b>Upper Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_PARAMETER_TYPE__UPPER_VALUE = 2;

    /**
     * The feature id for the '<em><b>Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_PARAMETER_TYPE__DIRECTION = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_PARAMETER_TYPE__ID = 4;

    /**
     * The feature id for the '<em><b>Is Exception</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_PARAMETER_TYPE__IS_EXCEPTION = 5;

    /**
     * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_PARAMETER_TYPE__IS_ORDERED = 6;

    /**
     * The feature id for the '<em><b>Is Stream</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_PARAMETER_TYPE__IS_STREAM = 7;

    /**
     * The feature id for the '<em><b>Is Unique</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_PARAMETER_TYPE__IS_UNIQUE = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_PARAMETER_TYPE__NAME = 9;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_PARAMETER_TYPE__TYPE = 10;

    /**
     * The number of structural features of the '<em>Owned Parameter Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_PARAMETER_TYPE_FEATURE_COUNT = 11;

    /**
     * The number of operations of the '<em>Owned Parameter Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNED_PARAMETER_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link uml.impl.PackagedElementAssociationTypeImpl <em>Packaged Element Association Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.PackagedElementAssociationTypeImpl
     * @see uml.impl.UmlPackageImpl#getPackagedElementAssociationType()
     * @generated
     */
    int PACKAGED_ELEMENT_ASSOCIATION_TYPE = 12;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_ASSOCIATION_TYPE__ID = PACKAGED_ELEMENT_BASE_TYPE__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_ASSOCIATION_TYPE__TYPE = PACKAGED_ELEMENT_BASE_TYPE__TYPE;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_ASSOCIATION_TYPE__VISIBILITY = PACKAGED_ELEMENT_BASE_TYPE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Member End</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_ASSOCIATION_TYPE__MEMBER_END = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Owned End</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_ASSOCIATION_TYPE__OWNED_END = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Packaged Element Association Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_ASSOCIATION_TYPE_FEATURE_COUNT = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Packaged Element Association Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_ASSOCIATION_TYPE_OPERATION_COUNT = PACKAGED_ELEMENT_BASE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link uml.impl.PackagedElementInstanceSpecificationTypeImpl <em>Packaged Element Instance Specification Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.PackagedElementInstanceSpecificationTypeImpl
     * @see uml.impl.UmlPackageImpl#getPackagedElementInstanceSpecificationType()
     * @generated
     */
    int PACKAGED_ELEMENT_INSTANCE_SPECIFICATION_TYPE = 14;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_INSTANCE_SPECIFICATION_TYPE__ID = PACKAGED_ELEMENT_BASE_TYPE__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_INSTANCE_SPECIFICATION_TYPE__TYPE = PACKAGED_ELEMENT_BASE_TYPE__TYPE;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_INSTANCE_SPECIFICATION_TYPE__VISIBILITY = PACKAGED_ELEMENT_BASE_TYPE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Classifier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_INSTANCE_SPECIFICATION_TYPE__CLASSIFIER = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_INSTANCE_SPECIFICATION_TYPE__NAME = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Packaged Element Instance Specification Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_INSTANCE_SPECIFICATION_TYPE_FEATURE_COUNT = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Packaged Element Instance Specification Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_INSTANCE_SPECIFICATION_TYPE_OPERATION_COUNT = PACKAGED_ELEMENT_BASE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link uml.impl.PackagedElementPackageTypeImpl <em>Packaged Element Package Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.PackagedElementPackageTypeImpl
     * @see uml.impl.UmlPackageImpl#getPackagedElementPackageType()
     * @generated
     */
    int PACKAGED_ELEMENT_PACKAGE_TYPE = 15;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_PACKAGE_TYPE__ID = PACKAGED_ELEMENT_BASE_TYPE__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_PACKAGE_TYPE__TYPE = PACKAGED_ELEMENT_BASE_TYPE__TYPE;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_PACKAGE_TYPE__VISIBILITY = PACKAGED_ELEMENT_BASE_TYPE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGE_IMPORT = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGED_ELEMENT = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_PACKAGE_TYPE__NAME = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Packaged Element Package Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_PACKAGE_TYPE_FEATURE_COUNT = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Packaged Element Package Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_PACKAGE_TYPE_OPERATION_COUNT = PACKAGED_ELEMENT_BASE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link uml.impl.PackagedElementRelationTypeImpl <em>Packaged Element Relation Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.PackagedElementRelationTypeImpl
     * @see uml.impl.UmlPackageImpl#getPackagedElementRelationType()
     * @generated
     */
    int PACKAGED_ELEMENT_RELATION_TYPE = 16;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_RELATION_TYPE__ID = PACKAGED_ELEMENT_BASE_TYPE__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_RELATION_TYPE__TYPE = PACKAGED_ELEMENT_BASE_TYPE__TYPE;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_RELATION_TYPE__VISIBILITY = PACKAGED_ELEMENT_BASE_TYPE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Client</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_RELATION_TYPE__CLIENT = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Supplier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_RELATION_TYPE__SUPPLIER = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Packaged Element Relation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_RELATION_TYPE_FEATURE_COUNT = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Packaged Element Relation Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGED_ELEMENT_RELATION_TYPE_OPERATION_COUNT = PACKAGED_ELEMENT_BASE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link uml.impl.PackageImportTypeImpl <em>Package Import Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.PackageImportTypeImpl
     * @see uml.impl.UmlPackageImpl#getPackageImportType()
     * @generated
     */
    int PACKAGE_IMPORT_TYPE = 17;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT_TYPE__ID = PACKAGED_ELEMENT_BASE_TYPE__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT_TYPE__TYPE = PACKAGED_ELEMENT_BASE_TYPE__TYPE;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT_TYPE__VISIBILITY = PACKAGED_ELEMENT_BASE_TYPE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Imported Package</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT_TYPE__IMPORTED_PACKAGE = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Package Import Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT_TYPE_FEATURE_COUNT = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Package Import Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_IMPORT_TYPE_OPERATION_COUNT = PACKAGED_ELEMENT_BASE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link uml.impl.TypeTypeImpl <em>Type Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.TypeTypeImpl
     * @see uml.impl.UmlPackageImpl#getTypeType()
     * @generated
     */
    int TYPE_TYPE = 18;

    /**
     * The feature id for the '<em><b>Href</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_TYPE__HREF = 0;

    /**
     * The feature id for the '<em><b>Idref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_TYPE__IDREF = 1;

    /**
     * The number of structural features of the '<em>Type Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_TYPE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Type Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link uml.impl.UmlClassTypeImpl <em>Class Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.UmlClassTypeImpl
     * @see uml.impl.UmlPackageImpl#getUmlClassType()
     * @generated
     */
    int UML_CLASS_TYPE = 19;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_CLASS_TYPE__ID = PACKAGED_ELEMENT_BASE_TYPE__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_CLASS_TYPE__TYPE = PACKAGED_ELEMENT_BASE_TYPE__TYPE;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_CLASS_TYPE__VISIBILITY = PACKAGED_ELEMENT_BASE_TYPE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_CLASS_TYPE__GENERALIZATION = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_CLASS_TYPE__OWNED_ATTRIBUTE = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_CLASS_TYPE__NAME = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Class Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_CLASS_TYPE_FEATURE_COUNT = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Class Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_CLASS_TYPE_OPERATION_COUNT = PACKAGED_ELEMENT_BASE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link uml.impl.UmlEnumerationTypeImpl <em>Enumeration Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.UmlEnumerationTypeImpl
     * @see uml.impl.UmlPackageImpl#getUmlEnumerationType()
     * @generated
     */
    int UML_ENUMERATION_TYPE = 20;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_ENUMERATION_TYPE__ID = PACKAGED_ELEMENT_BASE_TYPE__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_ENUMERATION_TYPE__TYPE = PACKAGED_ELEMENT_BASE_TYPE__TYPE;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_ENUMERATION_TYPE__VISIBILITY = PACKAGED_ELEMENT_BASE_TYPE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Owned Literal</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_ENUMERATION_TYPE__OWNED_LITERAL = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_ENUMERATION_TYPE__GENERALIZATION = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_ENUMERATION_TYPE__NAME = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Enumeration Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_ENUMERATION_TYPE_FEATURE_COUNT = PACKAGED_ELEMENT_BASE_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Enumeration Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_ENUMERATION_TYPE_OPERATION_COUNT = PACKAGED_ELEMENT_BASE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link uml.impl.UmlInterfaceTypeImpl <em>Interface Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.UmlInterfaceTypeImpl
     * @see uml.impl.UmlPackageImpl#getUmlInterfaceType()
     * @generated
     */
    int UML_INTERFACE_TYPE = 21;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_INTERFACE_TYPE__ID = PACKAGED_ELEMENT_PACKAGE_TYPE__ID;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_INTERFACE_TYPE__TYPE = PACKAGED_ELEMENT_PACKAGE_TYPE__TYPE;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_INTERFACE_TYPE__VISIBILITY = PACKAGED_ELEMENT_PACKAGE_TYPE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_INTERFACE_TYPE__PACKAGE_IMPORT = PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGE_IMPORT;

    /**
     * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_INTERFACE_TYPE__PACKAGED_ELEMENT = PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGED_ELEMENT;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_INTERFACE_TYPE__NAME = PACKAGED_ELEMENT_PACKAGE_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Generalization</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_INTERFACE_TYPE__GENERALIZATION = PACKAGED_ELEMENT_PACKAGE_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_INTERFACE_TYPE__OWNED_ATTRIBUTE = PACKAGED_ELEMENT_PACKAGE_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_INTERFACE_TYPE__OWNED_OPERATION = PACKAGED_ELEMENT_PACKAGE_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_INTERFACE_TYPE__NESTED_CLASSIFIER = PACKAGED_ELEMENT_PACKAGE_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_INTERFACE_TYPE__IS_ABSTRACT = PACKAGED_ELEMENT_PACKAGE_TYPE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Interface Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_INTERFACE_TYPE_FEATURE_COUNT = PACKAGED_ELEMENT_PACKAGE_TYPE_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Interface Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UML_INTERFACE_TYPE_OPERATION_COUNT = PACKAGED_ELEMENT_PACKAGE_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link uml.DirectionType <em>Direction Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.DirectionType
     * @see uml.impl.UmlPackageImpl#getDirectionType()
     * @generated
     */
    int DIRECTION_TYPE = 22;

    /**
     * The meta object id for the '{@link uml.VisibilityType <em>Visibility Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.VisibilityType
     * @see uml.impl.UmlPackageImpl#getVisibilityType()
     * @generated
     */
    int VISIBILITY_TYPE = 23;

    /**
     * The meta object id for the '<em>Direction Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.DirectionType
     * @see uml.impl.UmlPackageImpl#getDirectionTypeObject()
     * @generated
     */
    int DIRECTION_TYPE_OBJECT = 24;

    /**
     * The meta object id for the '<em>Visibility Type Object</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.VisibilityType
     * @see uml.impl.UmlPackageImpl#getVisibilityTypeObject()
     * @generated
     */
    int VISIBILITY_TYPE_OBJECT = 25;


    /**
     * Returns the meta object for class '{@link uml.DefaultValueType <em>Default Value Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Default Value Type</em>'.
     * @see uml.DefaultValueType
     * @generated
     */
    EClass getDefaultValueType();

    /**
     * Returns the meta object for the attribute '{@link uml.DefaultValueType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see uml.DefaultValueType#getId()
     * @see #getDefaultValueType()
     * @generated
     */
    EAttribute getDefaultValueType_Id();

    /**
     * Returns the meta object for the attribute '{@link uml.DefaultValueType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see uml.DefaultValueType#getType()
     * @see #getDefaultValueType()
     * @generated
     */
    EAttribute getDefaultValueType_Type();

    /**
     * Returns the meta object for the attribute '{@link uml.DefaultValueType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see uml.DefaultValueType#getValue()
     * @see #getDefaultValueType()
     * @generated
     */
    EAttribute getDefaultValueType_Value();

    /**
     * Returns the meta object for class '{@link uml.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see uml.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link uml.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see uml.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link uml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see uml.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link uml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see uml.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link uml.DocumentRoot#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Model</em>'.
     * @see uml.DocumentRoot#getModel()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Model();

    /**
     * Returns the meta object for class '{@link uml.GeneralizationType <em>Generalization Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Generalization Type</em>'.
     * @see uml.GeneralizationType
     * @generated
     */
    EClass getGeneralizationType();

    /**
     * Returns the meta object for the attribute '{@link uml.GeneralizationType#getGeneral <em>General</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>General</em>'.
     * @see uml.GeneralizationType#getGeneral()
     * @see #getGeneralizationType()
     * @generated
     */
    EAttribute getGeneralizationType_General();

    /**
     * Returns the meta object for the attribute '{@link uml.GeneralizationType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see uml.GeneralizationType#getId()
     * @see #getGeneralizationType()
     * @generated
     */
    EAttribute getGeneralizationType_Id();

    /**
     * Returns the meta object for the attribute '{@link uml.GeneralizationType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see uml.GeneralizationType#getType()
     * @see #getGeneralizationType()
     * @generated
     */
    EAttribute getGeneralizationType_Type();

    /**
     * Returns the meta object for class '{@link uml.MemberEndType <em>Member End Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Member End Type</em>'.
     * @see uml.MemberEndType
     * @generated
     */
    EClass getMemberEndType();

    /**
     * Returns the meta object for the attribute '{@link uml.MemberEndType#getIdref <em>Idref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idref</em>'.
     * @see uml.MemberEndType#getIdref()
     * @see #getMemberEndType()
     * @generated
     */
    EAttribute getMemberEndType_Idref();

    /**
     * Returns the meta object for class '{@link uml.ModelType <em>Model Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model Type</em>'.
     * @see uml.ModelType
     * @generated
     */
    EClass getModelType();

    /**
     * Returns the meta object for the containment reference list '{@link uml.ModelType#getPackagedElement <em>Packaged Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Packaged Element</em>'.
     * @see uml.ModelType#getPackagedElement()
     * @see #getModelType()
     * @generated
     */
    EReference getModelType_PackagedElement();

    /**
     * Returns the meta object for the attribute '{@link uml.ModelType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see uml.ModelType#getName()
     * @see #getModelType()
     * @generated
     */
    EAttribute getModelType_Name();

    /**
     * Returns the meta object for the attribute '{@link uml.ModelType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see uml.ModelType#getType()
     * @see #getModelType()
     * @generated
     */
    EAttribute getModelType_Type();

    /**
     * Returns the meta object for the attribute '{@link uml.ModelType#getVisibility <em>Visibility</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Visibility</em>'.
     * @see uml.ModelType#getVisibility()
     * @see #getModelType()
     * @generated
     */
    EAttribute getModelType_Visibility();

    /**
     * Returns the meta object for class '{@link uml.MultiplicityValueType <em>Multiplicity Value Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Multiplicity Value Type</em>'.
     * @see uml.MultiplicityValueType
     * @generated
     */
    EClass getMultiplicityValueType();

    /**
     * Returns the meta object for the attribute '{@link uml.MultiplicityValueType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see uml.MultiplicityValueType#getId()
     * @see #getMultiplicityValueType()
     * @generated
     */
    EAttribute getMultiplicityValueType_Id();

    /**
     * Returns the meta object for the attribute '{@link uml.MultiplicityValueType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see uml.MultiplicityValueType#getType()
     * @see #getMultiplicityValueType()
     * @generated
     */
    EAttribute getMultiplicityValueType_Type();

    /**
     * Returns the meta object for the attribute '{@link uml.MultiplicityValueType#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see uml.MultiplicityValueType#getValue()
     * @see #getMultiplicityValueType()
     * @generated
     */
    EAttribute getMultiplicityValueType_Value();

    /**
     * Returns the meta object for class '{@link uml.OwnedAttributeBaseType <em>Owned Attribute Base Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Owned Attribute Base Type</em>'.
     * @see uml.OwnedAttributeBaseType
     * @generated
     */
    EClass getOwnedAttributeBaseType();

    /**
     * Returns the meta object for the containment reference '{@link uml.OwnedAttributeBaseType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see uml.OwnedAttributeBaseType#getType()
     * @see #getOwnedAttributeBaseType()
     * @generated
     */
    EReference getOwnedAttributeBaseType_Type();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedAttributeBaseType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see uml.OwnedAttributeBaseType#getId()
     * @see #getOwnedAttributeBaseType()
     * @generated
     */
    EAttribute getOwnedAttributeBaseType_Id();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedAttributeBaseType#getType1 <em>Type1</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type1</em>'.
     * @see uml.OwnedAttributeBaseType#getType1()
     * @see #getOwnedAttributeBaseType()
     * @generated
     */
    EAttribute getOwnedAttributeBaseType_Type1();

    /**
     * Returns the meta object for class '{@link uml.OwnedAttributeExtendedAttributesType <em>Owned Attribute Extended Attributes Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Owned Attribute Extended Attributes Type</em>'.
     * @see uml.OwnedAttributeExtendedAttributesType
     * @generated
     */
    EClass getOwnedAttributeExtendedAttributesType();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedAttributeExtendedAttributesType#getAggregation <em>Aggregation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Aggregation</em>'.
     * @see uml.OwnedAttributeExtendedAttributesType#getAggregation()
     * @see #getOwnedAttributeExtendedAttributesType()
     * @generated
     */
    EAttribute getOwnedAttributeExtendedAttributesType_Aggregation();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedAttributeExtendedAttributesType#getAssociation <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Association</em>'.
     * @see uml.OwnedAttributeExtendedAttributesType#getAssociation()
     * @see #getOwnedAttributeExtendedAttributesType()
     * @generated
     */
    EAttribute getOwnedAttributeExtendedAttributesType_Association();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedAttributeExtendedAttributesType#isIsDerived <em>Is Derived</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Derived</em>'.
     * @see uml.OwnedAttributeExtendedAttributesType#isIsDerived()
     * @see #getOwnedAttributeExtendedAttributesType()
     * @generated
     */
    EAttribute getOwnedAttributeExtendedAttributesType_IsDerived();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedAttributeExtendedAttributesType#isIsDerivedUnion <em>Is Derived Union</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Derived Union</em>'.
     * @see uml.OwnedAttributeExtendedAttributesType#isIsDerivedUnion()
     * @see #getOwnedAttributeExtendedAttributesType()
     * @generated
     */
    EAttribute getOwnedAttributeExtendedAttributesType_IsDerivedUnion();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedAttributeExtendedAttributesType#isIsOrdered <em>Is Ordered</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Ordered</em>'.
     * @see uml.OwnedAttributeExtendedAttributesType#isIsOrdered()
     * @see #getOwnedAttributeExtendedAttributesType()
     * @generated
     */
    EAttribute getOwnedAttributeExtendedAttributesType_IsOrdered();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedAttributeExtendedAttributesType#isIsReadOnly <em>Is Read Only</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Read Only</em>'.
     * @see uml.OwnedAttributeExtendedAttributesType#isIsReadOnly()
     * @see #getOwnedAttributeExtendedAttributesType()
     * @generated
     */
    EAttribute getOwnedAttributeExtendedAttributesType_IsReadOnly();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedAttributeExtendedAttributesType#isIsStatic <em>Is Static</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Static</em>'.
     * @see uml.OwnedAttributeExtendedAttributesType#isIsStatic()
     * @see #getOwnedAttributeExtendedAttributesType()
     * @generated
     */
    EAttribute getOwnedAttributeExtendedAttributesType_IsStatic();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedAttributeExtendedAttributesType#isIsUnique <em>Is Unique</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Unique</em>'.
     * @see uml.OwnedAttributeExtendedAttributesType#isIsUnique()
     * @see #getOwnedAttributeExtendedAttributesType()
     * @generated
     */
    EAttribute getOwnedAttributeExtendedAttributesType_IsUnique();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedAttributeExtendedAttributesType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see uml.OwnedAttributeExtendedAttributesType#getName()
     * @see #getOwnedAttributeExtendedAttributesType()
     * @generated
     */
    EAttribute getOwnedAttributeExtendedAttributesType_Name();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedAttributeExtendedAttributesType#getVisibility <em>Visibility</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Visibility</em>'.
     * @see uml.OwnedAttributeExtendedAttributesType#getVisibility()
     * @see #getOwnedAttributeExtendedAttributesType()
     * @generated
     */
    EAttribute getOwnedAttributeExtendedAttributesType_Visibility();

    /**
     * Returns the meta object for class '{@link uml.OwnedAttributeExtendedContentType <em>Owned Attribute Extended Content Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Owned Attribute Extended Content Type</em>'.
     * @see uml.OwnedAttributeExtendedContentType
     * @generated
     */
    EClass getOwnedAttributeExtendedContentType();

    /**
     * Returns the meta object for the containment reference '{@link uml.OwnedAttributeExtendedContentType#getLowerValue <em>Lower Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Lower Value</em>'.
     * @see uml.OwnedAttributeExtendedContentType#getLowerValue()
     * @see #getOwnedAttributeExtendedContentType()
     * @generated
     */
    EReference getOwnedAttributeExtendedContentType_LowerValue();

    /**
     * Returns the meta object for the containment reference '{@link uml.OwnedAttributeExtendedContentType#getUpperValue <em>Upper Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Upper Value</em>'.
     * @see uml.OwnedAttributeExtendedContentType#getUpperValue()
     * @see #getOwnedAttributeExtendedContentType()
     * @generated
     */
    EReference getOwnedAttributeExtendedContentType_UpperValue();

    /**
     * Returns the meta object for class '{@link uml.OwnedLiteralType <em>Owned Literal Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Owned Literal Type</em>'.
     * @see uml.OwnedLiteralType
     * @generated
     */
    EClass getOwnedLiteralType();

    /**
     * Returns the meta object for the containment reference '{@link uml.OwnedLiteralType#getSpecification <em>Specification</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Specification</em>'.
     * @see uml.OwnedLiteralType#getSpecification()
     * @see #getOwnedLiteralType()
     * @generated
     */
    EReference getOwnedLiteralType_Specification();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedLiteralType#getClassifier <em>Classifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Classifier</em>'.
     * @see uml.OwnedLiteralType#getClassifier()
     * @see #getOwnedLiteralType()
     * @generated
     */
    EAttribute getOwnedLiteralType_Classifier();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedLiteralType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see uml.OwnedLiteralType#getId()
     * @see #getOwnedLiteralType()
     * @generated
     */
    EAttribute getOwnedLiteralType_Id();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedLiteralType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see uml.OwnedLiteralType#getName()
     * @see #getOwnedLiteralType()
     * @generated
     */
    EAttribute getOwnedLiteralType_Name();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedLiteralType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see uml.OwnedLiteralType#getType()
     * @see #getOwnedLiteralType()
     * @generated
     */
    EAttribute getOwnedLiteralType_Type();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedLiteralType#getVisibility <em>Visibility</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Visibility</em>'.
     * @see uml.OwnedLiteralType#getVisibility()
     * @see #getOwnedLiteralType()
     * @generated
     */
    EAttribute getOwnedLiteralType_Visibility();

    /**
     * Returns the meta object for class '{@link uml.OwnedOperationType <em>Owned Operation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Owned Operation Type</em>'.
     * @see uml.OwnedOperationType
     * @generated
     */
    EClass getOwnedOperationType();

    /**
     * Returns the meta object for the containment reference list '{@link uml.OwnedOperationType#getOwnedParameter <em>Owned Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Parameter</em>'.
     * @see uml.OwnedOperationType#getOwnedParameter()
     * @see #getOwnedOperationType()
     * @generated
     */
    EReference getOwnedOperationType_OwnedParameter();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedOperationType#getConcurrency <em>Concurrency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Concurrency</em>'.
     * @see uml.OwnedOperationType#getConcurrency()
     * @see #getOwnedOperationType()
     * @generated
     */
    EAttribute getOwnedOperationType_Concurrency();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedOperationType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see uml.OwnedOperationType#getName()
     * @see #getOwnedOperationType()
     * @generated
     */
    EAttribute getOwnedOperationType_Name();

    /**
     * Returns the meta object for class '{@link uml.OwnedParameterType <em>Owned Parameter Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Owned Parameter Type</em>'.
     * @see uml.OwnedParameterType
     * @generated
     */
    EClass getOwnedParameterType();

    /**
     * Returns the meta object for the containment reference '{@link uml.OwnedParameterType#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Default Value</em>'.
     * @see uml.OwnedParameterType#getDefaultValue()
     * @see #getOwnedParameterType()
     * @generated
     */
    EReference getOwnedParameterType_DefaultValue();

    /**
     * Returns the meta object for the containment reference '{@link uml.OwnedParameterType#getLowerValue <em>Lower Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Lower Value</em>'.
     * @see uml.OwnedParameterType#getLowerValue()
     * @see #getOwnedParameterType()
     * @generated
     */
    EReference getOwnedParameterType_LowerValue();

    /**
     * Returns the meta object for the containment reference '{@link uml.OwnedParameterType#getUpperValue <em>Upper Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Upper Value</em>'.
     * @see uml.OwnedParameterType#getUpperValue()
     * @see #getOwnedParameterType()
     * @generated
     */
    EReference getOwnedParameterType_UpperValue();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedParameterType#getDirection <em>Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Direction</em>'.
     * @see uml.OwnedParameterType#getDirection()
     * @see #getOwnedParameterType()
     * @generated
     */
    EAttribute getOwnedParameterType_Direction();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedParameterType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see uml.OwnedParameterType#getId()
     * @see #getOwnedParameterType()
     * @generated
     */
    EAttribute getOwnedParameterType_Id();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedParameterType#isIsException <em>Is Exception</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Exception</em>'.
     * @see uml.OwnedParameterType#isIsException()
     * @see #getOwnedParameterType()
     * @generated
     */
    EAttribute getOwnedParameterType_IsException();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedParameterType#isIsOrdered <em>Is Ordered</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Ordered</em>'.
     * @see uml.OwnedParameterType#isIsOrdered()
     * @see #getOwnedParameterType()
     * @generated
     */
    EAttribute getOwnedParameterType_IsOrdered();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedParameterType#isIsStream <em>Is Stream</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Stream</em>'.
     * @see uml.OwnedParameterType#isIsStream()
     * @see #getOwnedParameterType()
     * @generated
     */
    EAttribute getOwnedParameterType_IsStream();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedParameterType#isIsUnique <em>Is Unique</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Unique</em>'.
     * @see uml.OwnedParameterType#isIsUnique()
     * @see #getOwnedParameterType()
     * @generated
     */
    EAttribute getOwnedParameterType_IsUnique();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedParameterType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see uml.OwnedParameterType#getName()
     * @see #getOwnedParameterType()
     * @generated
     */
    EAttribute getOwnedParameterType_Name();

    /**
     * Returns the meta object for the attribute '{@link uml.OwnedParameterType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see uml.OwnedParameterType#getType()
     * @see #getOwnedParameterType()
     * @generated
     */
    EAttribute getOwnedParameterType_Type();

    /**
     * Returns the meta object for class '{@link uml.PackagedElementAssociationType <em>Packaged Element Association Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Packaged Element Association Type</em>'.
     * @see uml.PackagedElementAssociationType
     * @generated
     */
    EClass getPackagedElementAssociationType();

    /**
     * Returns the meta object for the containment reference list '{@link uml.PackagedElementAssociationType#getMemberEnd <em>Member End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Member End</em>'.
     * @see uml.PackagedElementAssociationType#getMemberEnd()
     * @see #getPackagedElementAssociationType()
     * @generated
     */
    EReference getPackagedElementAssociationType_MemberEnd();

    /**
     * Returns the meta object for the containment reference list '{@link uml.PackagedElementAssociationType#getOwnedEnd <em>Owned End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned End</em>'.
     * @see uml.PackagedElementAssociationType#getOwnedEnd()
     * @see #getPackagedElementAssociationType()
     * @generated
     */
    EReference getPackagedElementAssociationType_OwnedEnd();

    /**
     * Returns the meta object for class '{@link uml.PackagedElementBaseType <em>Packaged Element Base Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Packaged Element Base Type</em>'.
     * @see uml.PackagedElementBaseType
     * @generated
     */
    EClass getPackagedElementBaseType();

    /**
     * Returns the meta object for the attribute '{@link uml.PackagedElementBaseType#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see uml.PackagedElementBaseType#getId()
     * @see #getPackagedElementBaseType()
     * @generated
     */
    EAttribute getPackagedElementBaseType_Id();

    /**
     * Returns the meta object for the attribute '{@link uml.PackagedElementBaseType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see uml.PackagedElementBaseType#getType()
     * @see #getPackagedElementBaseType()
     * @generated
     */
    EAttribute getPackagedElementBaseType_Type();

    /**
     * Returns the meta object for the attribute '{@link uml.PackagedElementBaseType#getVisibility <em>Visibility</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Visibility</em>'.
     * @see uml.PackagedElementBaseType#getVisibility()
     * @see #getPackagedElementBaseType()
     * @generated
     */
    EAttribute getPackagedElementBaseType_Visibility();

    /**
     * Returns the meta object for class '{@link uml.PackagedElementInstanceSpecificationType <em>Packaged Element Instance Specification Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Packaged Element Instance Specification Type</em>'.
     * @see uml.PackagedElementInstanceSpecificationType
     * @generated
     */
    EClass getPackagedElementInstanceSpecificationType();

    /**
     * Returns the meta object for the attribute '{@link uml.PackagedElementInstanceSpecificationType#getClassifier <em>Classifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Classifier</em>'.
     * @see uml.PackagedElementInstanceSpecificationType#getClassifier()
     * @see #getPackagedElementInstanceSpecificationType()
     * @generated
     */
    EAttribute getPackagedElementInstanceSpecificationType_Classifier();

    /**
     * Returns the meta object for the attribute '{@link uml.PackagedElementInstanceSpecificationType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see uml.PackagedElementInstanceSpecificationType#getName()
     * @see #getPackagedElementInstanceSpecificationType()
     * @generated
     */
    EAttribute getPackagedElementInstanceSpecificationType_Name();

    /**
     * Returns the meta object for class '{@link uml.PackagedElementPackageType <em>Packaged Element Package Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Packaged Element Package Type</em>'.
     * @see uml.PackagedElementPackageType
     * @generated
     */
    EClass getPackagedElementPackageType();

    /**
     * Returns the meta object for the containment reference list '{@link uml.PackagedElementPackageType#getPackageImport <em>Package Import</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Package Import</em>'.
     * @see uml.PackagedElementPackageType#getPackageImport()
     * @see #getPackagedElementPackageType()
     * @generated
     */
    EReference getPackagedElementPackageType_PackageImport();

    /**
     * Returns the meta object for the containment reference list '{@link uml.PackagedElementPackageType#getPackagedElement <em>Packaged Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Packaged Element</em>'.
     * @see uml.PackagedElementPackageType#getPackagedElement()
     * @see #getPackagedElementPackageType()
     * @generated
     */
    EReference getPackagedElementPackageType_PackagedElement();

    /**
     * Returns the meta object for the attribute '{@link uml.PackagedElementPackageType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see uml.PackagedElementPackageType#getName()
     * @see #getPackagedElementPackageType()
     * @generated
     */
    EAttribute getPackagedElementPackageType_Name();

    /**
     * Returns the meta object for class '{@link uml.PackagedElementRelationType <em>Packaged Element Relation Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Packaged Element Relation Type</em>'.
     * @see uml.PackagedElementRelationType
     * @generated
     */
    EClass getPackagedElementRelationType();

    /**
     * Returns the meta object for the attribute '{@link uml.PackagedElementRelationType#getClient <em>Client</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Client</em>'.
     * @see uml.PackagedElementRelationType#getClient()
     * @see #getPackagedElementRelationType()
     * @generated
     */
    EAttribute getPackagedElementRelationType_Client();

    /**
     * Returns the meta object for the attribute '{@link uml.PackagedElementRelationType#getSupplier <em>Supplier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Supplier</em>'.
     * @see uml.PackagedElementRelationType#getSupplier()
     * @see #getPackagedElementRelationType()
     * @generated
     */
    EAttribute getPackagedElementRelationType_Supplier();

    /**
     * Returns the meta object for class '{@link uml.PackageImportType <em>Package Import Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Package Import Type</em>'.
     * @see uml.PackageImportType
     * @generated
     */
    EClass getPackageImportType();

    /**
     * Returns the meta object for the attribute '{@link uml.PackageImportType#getImportedPackage <em>Imported Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Imported Package</em>'.
     * @see uml.PackageImportType#getImportedPackage()
     * @see #getPackageImportType()
     * @generated
     */
    EAttribute getPackageImportType_ImportedPackage();

    /**
     * Returns the meta object for class '{@link uml.TypeType <em>Type Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type Type</em>'.
     * @see uml.TypeType
     * @generated
     */
    EClass getTypeType();

    /**
     * Returns the meta object for the attribute '{@link uml.TypeType#getHref <em>Href</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Href</em>'.
     * @see uml.TypeType#getHref()
     * @see #getTypeType()
     * @generated
     */
    EAttribute getTypeType_Href();

    /**
     * Returns the meta object for the attribute '{@link uml.TypeType#getIdref <em>Idref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Idref</em>'.
     * @see uml.TypeType#getIdref()
     * @see #getTypeType()
     * @generated
     */
    EAttribute getTypeType_Idref();

    /**
     * Returns the meta object for class '{@link uml.UmlClassType <em>Class Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Class Type</em>'.
     * @see uml.UmlClassType
     * @generated
     */
    EClass getUmlClassType();

    /**
     * Returns the meta object for the containment reference '{@link uml.UmlClassType#getGeneralization <em>Generalization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Generalization</em>'.
     * @see uml.UmlClassType#getGeneralization()
     * @see #getUmlClassType()
     * @generated
     */
    EReference getUmlClassType_Generalization();

    /**
     * Returns the meta object for the containment reference list '{@link uml.UmlClassType#getOwnedAttribute <em>Owned Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Attribute</em>'.
     * @see uml.UmlClassType#getOwnedAttribute()
     * @see #getUmlClassType()
     * @generated
     */
    EReference getUmlClassType_OwnedAttribute();

    /**
     * Returns the meta object for the attribute '{@link uml.UmlClassType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see uml.UmlClassType#getName()
     * @see #getUmlClassType()
     * @generated
     */
    EAttribute getUmlClassType_Name();

    /**
     * Returns the meta object for class '{@link uml.UmlEnumerationType <em>Enumeration Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enumeration Type</em>'.
     * @see uml.UmlEnumerationType
     * @generated
     */
    EClass getUmlEnumerationType();

    /**
     * Returns the meta object for the containment reference list '{@link uml.UmlEnumerationType#getOwnedLiteral <em>Owned Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Literal</em>'.
     * @see uml.UmlEnumerationType#getOwnedLiteral()
     * @see #getUmlEnumerationType()
     * @generated
     */
    EReference getUmlEnumerationType_OwnedLiteral();

    /**
     * Returns the meta object for the containment reference '{@link uml.UmlEnumerationType#getGeneralization <em>Generalization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Generalization</em>'.
     * @see uml.UmlEnumerationType#getGeneralization()
     * @see #getUmlEnumerationType()
     * @generated
     */
    EReference getUmlEnumerationType_Generalization();

    /**
     * Returns the meta object for the attribute '{@link uml.UmlEnumerationType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see uml.UmlEnumerationType#getName()
     * @see #getUmlEnumerationType()
     * @generated
     */
    EAttribute getUmlEnumerationType_Name();

    /**
     * Returns the meta object for class '{@link uml.UmlInterfaceType <em>Interface Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Interface Type</em>'.
     * @see uml.UmlInterfaceType
     * @generated
     */
    EClass getUmlInterfaceType();

    /**
     * Returns the meta object for the containment reference '{@link uml.UmlInterfaceType#getGeneralization <em>Generalization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Generalization</em>'.
     * @see uml.UmlInterfaceType#getGeneralization()
     * @see #getUmlInterfaceType()
     * @generated
     */
    EReference getUmlInterfaceType_Generalization();

    /**
     * Returns the meta object for the containment reference list '{@link uml.UmlInterfaceType#getOwnedAttribute <em>Owned Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Attribute</em>'.
     * @see uml.UmlInterfaceType#getOwnedAttribute()
     * @see #getUmlInterfaceType()
     * @generated
     */
    EReference getUmlInterfaceType_OwnedAttribute();

    /**
     * Returns the meta object for the containment reference list '{@link uml.UmlInterfaceType#getOwnedOperation <em>Owned Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Operation</em>'.
     * @see uml.UmlInterfaceType#getOwnedOperation()
     * @see #getUmlInterfaceType()
     * @generated
     */
    EReference getUmlInterfaceType_OwnedOperation();

    /**
     * Returns the meta object for the containment reference list '{@link uml.UmlInterfaceType#getNestedClassifier <em>Nested Classifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Nested Classifier</em>'.
     * @see uml.UmlInterfaceType#getNestedClassifier()
     * @see #getUmlInterfaceType()
     * @generated
     */
    EReference getUmlInterfaceType_NestedClassifier();

    /**
     * Returns the meta object for the attribute '{@link uml.UmlInterfaceType#isIsAbstract <em>Is Abstract</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Is Abstract</em>'.
     * @see uml.UmlInterfaceType#isIsAbstract()
     * @see #getUmlInterfaceType()
     * @generated
     */
    EAttribute getUmlInterfaceType_IsAbstract();

    /**
     * Returns the meta object for enum '{@link uml.DirectionType <em>Direction Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Direction Type</em>'.
     * @see uml.DirectionType
     * @generated
     */
    EEnum getDirectionType();

    /**
     * Returns the meta object for enum '{@link uml.VisibilityType <em>Visibility Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Visibility Type</em>'.
     * @see uml.VisibilityType
     * @generated
     */
    EEnum getVisibilityType();

    /**
     * Returns the meta object for data type '{@link uml.DirectionType <em>Direction Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Direction Type Object</em>'.
     * @see uml.DirectionType
     * @model instanceClass="uml.DirectionType"
     *        extendedMetaData="name='directionType:Object' baseType='directionType'"
     * @generated
     */
    EDataType getDirectionTypeObject();

    /**
     * Returns the meta object for data type '{@link uml.VisibilityType <em>Visibility Type Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Visibility Type Object</em>'.
     * @see uml.VisibilityType
     * @model instanceClass="uml.VisibilityType"
     *        extendedMetaData="name='visibilityType:Object' baseType='visibilityType'"
     * @generated
     */
    EDataType getVisibilityTypeObject();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    UmlFactory getUmlFactory();

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
         * The meta object literal for the '{@link uml.impl.DefaultValueTypeImpl <em>Default Value Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.DefaultValueTypeImpl
         * @see uml.impl.UmlPackageImpl#getDefaultValueType()
         * @generated
         */
        EClass DEFAULT_VALUE_TYPE = eINSTANCE.getDefaultValueType();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEFAULT_VALUE_TYPE__ID = eINSTANCE.getDefaultValueType_Id();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEFAULT_VALUE_TYPE__TYPE = eINSTANCE.getDefaultValueType_Type();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEFAULT_VALUE_TYPE__VALUE = eINSTANCE.getDefaultValueType_Value();

        /**
         * The meta object literal for the '{@link uml.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.DocumentRootImpl
         * @see uml.impl.UmlPackageImpl#getDocumentRoot()
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
         * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__MODEL = eINSTANCE.getDocumentRoot_Model();

        /**
         * The meta object literal for the '{@link uml.impl.GeneralizationTypeImpl <em>Generalization Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.GeneralizationTypeImpl
         * @see uml.impl.UmlPackageImpl#getGeneralizationType()
         * @generated
         */
        EClass GENERALIZATION_TYPE = eINSTANCE.getGeneralizationType();

        /**
         * The meta object literal for the '<em><b>General</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERALIZATION_TYPE__GENERAL = eINSTANCE.getGeneralizationType_General();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERALIZATION_TYPE__ID = eINSTANCE.getGeneralizationType_Id();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GENERALIZATION_TYPE__TYPE = eINSTANCE.getGeneralizationType_Type();

        /**
         * The meta object literal for the '{@link uml.impl.MemberEndTypeImpl <em>Member End Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.MemberEndTypeImpl
         * @see uml.impl.UmlPackageImpl#getMemberEndType()
         * @generated
         */
        EClass MEMBER_END_TYPE = eINSTANCE.getMemberEndType();

        /**
         * The meta object literal for the '<em><b>Idref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MEMBER_END_TYPE__IDREF = eINSTANCE.getMemberEndType_Idref();

        /**
         * The meta object literal for the '{@link uml.impl.ModelTypeImpl <em>Model Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.ModelTypeImpl
         * @see uml.impl.UmlPackageImpl#getModelType()
         * @generated
         */
        EClass MODEL_TYPE = eINSTANCE.getModelType();

        /**
         * The meta object literal for the '<em><b>Packaged Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODEL_TYPE__PACKAGED_ELEMENT = eINSTANCE.getModelType_PackagedElement();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_TYPE__NAME = eINSTANCE.getModelType_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_TYPE__TYPE = eINSTANCE.getModelType_Type();

        /**
         * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODEL_TYPE__VISIBILITY = eINSTANCE.getModelType_Visibility();

        /**
         * The meta object literal for the '{@link uml.impl.MultiplicityValueTypeImpl <em>Multiplicity Value Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.MultiplicityValueTypeImpl
         * @see uml.impl.UmlPackageImpl#getMultiplicityValueType()
         * @generated
         */
        EClass MULTIPLICITY_VALUE_TYPE = eINSTANCE.getMultiplicityValueType();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MULTIPLICITY_VALUE_TYPE__ID = eINSTANCE.getMultiplicityValueType_Id();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MULTIPLICITY_VALUE_TYPE__TYPE = eINSTANCE.getMultiplicityValueType_Type();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MULTIPLICITY_VALUE_TYPE__VALUE = eINSTANCE.getMultiplicityValueType_Value();

        /**
         * The meta object literal for the '{@link uml.impl.OwnedAttributeBaseTypeImpl <em>Owned Attribute Base Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.OwnedAttributeBaseTypeImpl
         * @see uml.impl.UmlPackageImpl#getOwnedAttributeBaseType()
         * @generated
         */
        EClass OWNED_ATTRIBUTE_BASE_TYPE = eINSTANCE.getOwnedAttributeBaseType();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OWNED_ATTRIBUTE_BASE_TYPE__TYPE = eINSTANCE.getOwnedAttributeBaseType_Type();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_ATTRIBUTE_BASE_TYPE__ID = eINSTANCE.getOwnedAttributeBaseType_Id();

        /**
         * The meta object literal for the '<em><b>Type1</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_ATTRIBUTE_BASE_TYPE__TYPE1 = eINSTANCE.getOwnedAttributeBaseType_Type1();

        /**
         * The meta object literal for the '{@link uml.impl.OwnedAttributeExtendedAttributesTypeImpl <em>Owned Attribute Extended Attributes Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.OwnedAttributeExtendedAttributesTypeImpl
         * @see uml.impl.UmlPackageImpl#getOwnedAttributeExtendedAttributesType()
         * @generated
         */
        EClass OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE = eINSTANCE.getOwnedAttributeExtendedAttributesType();

        /**
         * The meta object literal for the '<em><b>Aggregation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__AGGREGATION = eINSTANCE.getOwnedAttributeExtendedAttributesType_Aggregation();

        /**
         * The meta object literal for the '<em><b>Association</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__ASSOCIATION = eINSTANCE.getOwnedAttributeExtendedAttributesType_Association();

        /**
         * The meta object literal for the '<em><b>Is Derived</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED = eINSTANCE.getOwnedAttributeExtendedAttributesType_IsDerived();

        /**
         * The meta object literal for the '<em><b>Is Derived Union</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED_UNION = eINSTANCE.getOwnedAttributeExtendedAttributesType_IsDerivedUnion();

        /**
         * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_ORDERED = eINSTANCE.getOwnedAttributeExtendedAttributesType_IsOrdered();

        /**
         * The meta object literal for the '<em><b>Is Read Only</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_READ_ONLY = eINSTANCE.getOwnedAttributeExtendedAttributesType_IsReadOnly();

        /**
         * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_STATIC = eINSTANCE.getOwnedAttributeExtendedAttributesType_IsStatic();

        /**
         * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_UNIQUE = eINSTANCE.getOwnedAttributeExtendedAttributesType_IsUnique();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__NAME = eINSTANCE.getOwnedAttributeExtendedAttributesType_Name();

        /**
         * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__VISIBILITY = eINSTANCE.getOwnedAttributeExtendedAttributesType_Visibility();

        /**
         * The meta object literal for the '{@link uml.impl.OwnedAttributeExtendedContentTypeImpl <em>Owned Attribute Extended Content Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.OwnedAttributeExtendedContentTypeImpl
         * @see uml.impl.UmlPackageImpl#getOwnedAttributeExtendedContentType()
         * @generated
         */
        EClass OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE = eINSTANCE.getOwnedAttributeExtendedContentType();

        /**
         * The meta object literal for the '<em><b>Lower Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__LOWER_VALUE = eINSTANCE.getOwnedAttributeExtendedContentType_LowerValue();

        /**
         * The meta object literal for the '<em><b>Upper Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__UPPER_VALUE = eINSTANCE.getOwnedAttributeExtendedContentType_UpperValue();

        /**
         * The meta object literal for the '{@link uml.impl.OwnedLiteralTypeImpl <em>Owned Literal Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.OwnedLiteralTypeImpl
         * @see uml.impl.UmlPackageImpl#getOwnedLiteralType()
         * @generated
         */
        EClass OWNED_LITERAL_TYPE = eINSTANCE.getOwnedLiteralType();

        /**
         * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OWNED_LITERAL_TYPE__SPECIFICATION = eINSTANCE.getOwnedLiteralType_Specification();

        /**
         * The meta object literal for the '<em><b>Classifier</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_LITERAL_TYPE__CLASSIFIER = eINSTANCE.getOwnedLiteralType_Classifier();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_LITERAL_TYPE__ID = eINSTANCE.getOwnedLiteralType_Id();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_LITERAL_TYPE__NAME = eINSTANCE.getOwnedLiteralType_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_LITERAL_TYPE__TYPE = eINSTANCE.getOwnedLiteralType_Type();

        /**
         * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_LITERAL_TYPE__VISIBILITY = eINSTANCE.getOwnedLiteralType_Visibility();

        /**
         * The meta object literal for the '{@link uml.impl.OwnedOperationTypeImpl <em>Owned Operation Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.OwnedOperationTypeImpl
         * @see uml.impl.UmlPackageImpl#getOwnedOperationType()
         * @generated
         */
        EClass OWNED_OPERATION_TYPE = eINSTANCE.getOwnedOperationType();

        /**
         * The meta object literal for the '<em><b>Owned Parameter</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OWNED_OPERATION_TYPE__OWNED_PARAMETER = eINSTANCE.getOwnedOperationType_OwnedParameter();

        /**
         * The meta object literal for the '<em><b>Concurrency</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_OPERATION_TYPE__CONCURRENCY = eINSTANCE.getOwnedOperationType_Concurrency();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_OPERATION_TYPE__NAME = eINSTANCE.getOwnedOperationType_Name();

        /**
         * The meta object literal for the '{@link uml.impl.OwnedParameterTypeImpl <em>Owned Parameter Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.OwnedParameterTypeImpl
         * @see uml.impl.UmlPackageImpl#getOwnedParameterType()
         * @generated
         */
        EClass OWNED_PARAMETER_TYPE = eINSTANCE.getOwnedParameterType();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OWNED_PARAMETER_TYPE__DEFAULT_VALUE = eINSTANCE.getOwnedParameterType_DefaultValue();

        /**
         * The meta object literal for the '<em><b>Lower Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OWNED_PARAMETER_TYPE__LOWER_VALUE = eINSTANCE.getOwnedParameterType_LowerValue();

        /**
         * The meta object literal for the '<em><b>Upper Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OWNED_PARAMETER_TYPE__UPPER_VALUE = eINSTANCE.getOwnedParameterType_UpperValue();

        /**
         * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_PARAMETER_TYPE__DIRECTION = eINSTANCE.getOwnedParameterType_Direction();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_PARAMETER_TYPE__ID = eINSTANCE.getOwnedParameterType_Id();

        /**
         * The meta object literal for the '<em><b>Is Exception</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_PARAMETER_TYPE__IS_EXCEPTION = eINSTANCE.getOwnedParameterType_IsException();

        /**
         * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_PARAMETER_TYPE__IS_ORDERED = eINSTANCE.getOwnedParameterType_IsOrdered();

        /**
         * The meta object literal for the '<em><b>Is Stream</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_PARAMETER_TYPE__IS_STREAM = eINSTANCE.getOwnedParameterType_IsStream();

        /**
         * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_PARAMETER_TYPE__IS_UNIQUE = eINSTANCE.getOwnedParameterType_IsUnique();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_PARAMETER_TYPE__NAME = eINSTANCE.getOwnedParameterType_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNED_PARAMETER_TYPE__TYPE = eINSTANCE.getOwnedParameterType_Type();

        /**
         * The meta object literal for the '{@link uml.impl.PackagedElementAssociationTypeImpl <em>Packaged Element Association Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.PackagedElementAssociationTypeImpl
         * @see uml.impl.UmlPackageImpl#getPackagedElementAssociationType()
         * @generated
         */
        EClass PACKAGED_ELEMENT_ASSOCIATION_TYPE = eINSTANCE.getPackagedElementAssociationType();

        /**
         * The meta object literal for the '<em><b>Member End</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PACKAGED_ELEMENT_ASSOCIATION_TYPE__MEMBER_END = eINSTANCE.getPackagedElementAssociationType_MemberEnd();

        /**
         * The meta object literal for the '<em><b>Owned End</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PACKAGED_ELEMENT_ASSOCIATION_TYPE__OWNED_END = eINSTANCE.getPackagedElementAssociationType_OwnedEnd();

        /**
         * The meta object literal for the '{@link uml.impl.PackagedElementBaseTypeImpl <em>Packaged Element Base Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.PackagedElementBaseTypeImpl
         * @see uml.impl.UmlPackageImpl#getPackagedElementBaseType()
         * @generated
         */
        EClass PACKAGED_ELEMENT_BASE_TYPE = eINSTANCE.getPackagedElementBaseType();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PACKAGED_ELEMENT_BASE_TYPE__ID = eINSTANCE.getPackagedElementBaseType_Id();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PACKAGED_ELEMENT_BASE_TYPE__TYPE = eINSTANCE.getPackagedElementBaseType_Type();

        /**
         * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PACKAGED_ELEMENT_BASE_TYPE__VISIBILITY = eINSTANCE.getPackagedElementBaseType_Visibility();

        /**
         * The meta object literal for the '{@link uml.impl.PackagedElementInstanceSpecificationTypeImpl <em>Packaged Element Instance Specification Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.PackagedElementInstanceSpecificationTypeImpl
         * @see uml.impl.UmlPackageImpl#getPackagedElementInstanceSpecificationType()
         * @generated
         */
        EClass PACKAGED_ELEMENT_INSTANCE_SPECIFICATION_TYPE = eINSTANCE.getPackagedElementInstanceSpecificationType();

        /**
         * The meta object literal for the '<em><b>Classifier</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PACKAGED_ELEMENT_INSTANCE_SPECIFICATION_TYPE__CLASSIFIER = eINSTANCE.getPackagedElementInstanceSpecificationType_Classifier();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PACKAGED_ELEMENT_INSTANCE_SPECIFICATION_TYPE__NAME = eINSTANCE.getPackagedElementInstanceSpecificationType_Name();

        /**
         * The meta object literal for the '{@link uml.impl.PackagedElementPackageTypeImpl <em>Packaged Element Package Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.PackagedElementPackageTypeImpl
         * @see uml.impl.UmlPackageImpl#getPackagedElementPackageType()
         * @generated
         */
        EClass PACKAGED_ELEMENT_PACKAGE_TYPE = eINSTANCE.getPackagedElementPackageType();

        /**
         * The meta object literal for the '<em><b>Package Import</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGE_IMPORT = eINSTANCE.getPackagedElementPackageType_PackageImport();

        /**
         * The meta object literal for the '<em><b>Packaged Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGED_ELEMENT = eINSTANCE.getPackagedElementPackageType_PackagedElement();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PACKAGED_ELEMENT_PACKAGE_TYPE__NAME = eINSTANCE.getPackagedElementPackageType_Name();

        /**
         * The meta object literal for the '{@link uml.impl.PackagedElementRelationTypeImpl <em>Packaged Element Relation Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.PackagedElementRelationTypeImpl
         * @see uml.impl.UmlPackageImpl#getPackagedElementRelationType()
         * @generated
         */
        EClass PACKAGED_ELEMENT_RELATION_TYPE = eINSTANCE.getPackagedElementRelationType();

        /**
         * The meta object literal for the '<em><b>Client</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PACKAGED_ELEMENT_RELATION_TYPE__CLIENT = eINSTANCE.getPackagedElementRelationType_Client();

        /**
         * The meta object literal for the '<em><b>Supplier</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PACKAGED_ELEMENT_RELATION_TYPE__SUPPLIER = eINSTANCE.getPackagedElementRelationType_Supplier();

        /**
         * The meta object literal for the '{@link uml.impl.PackageImportTypeImpl <em>Package Import Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.PackageImportTypeImpl
         * @see uml.impl.UmlPackageImpl#getPackageImportType()
         * @generated
         */
        EClass PACKAGE_IMPORT_TYPE = eINSTANCE.getPackageImportType();

        /**
         * The meta object literal for the '<em><b>Imported Package</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PACKAGE_IMPORT_TYPE__IMPORTED_PACKAGE = eINSTANCE.getPackageImportType_ImportedPackage();

        /**
         * The meta object literal for the '{@link uml.impl.TypeTypeImpl <em>Type Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.TypeTypeImpl
         * @see uml.impl.UmlPackageImpl#getTypeType()
         * @generated
         */
        EClass TYPE_TYPE = eINSTANCE.getTypeType();

        /**
         * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TYPE_TYPE__HREF = eINSTANCE.getTypeType_Href();

        /**
         * The meta object literal for the '<em><b>Idref</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TYPE_TYPE__IDREF = eINSTANCE.getTypeType_Idref();

        /**
         * The meta object literal for the '{@link uml.impl.UmlClassTypeImpl <em>Class Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.UmlClassTypeImpl
         * @see uml.impl.UmlPackageImpl#getUmlClassType()
         * @generated
         */
        EClass UML_CLASS_TYPE = eINSTANCE.getUmlClassType();

        /**
         * The meta object literal for the '<em><b>Generalization</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UML_CLASS_TYPE__GENERALIZATION = eINSTANCE.getUmlClassType_Generalization();

        /**
         * The meta object literal for the '<em><b>Owned Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UML_CLASS_TYPE__OWNED_ATTRIBUTE = eINSTANCE.getUmlClassType_OwnedAttribute();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute UML_CLASS_TYPE__NAME = eINSTANCE.getUmlClassType_Name();

        /**
         * The meta object literal for the '{@link uml.impl.UmlEnumerationTypeImpl <em>Enumeration Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.UmlEnumerationTypeImpl
         * @see uml.impl.UmlPackageImpl#getUmlEnumerationType()
         * @generated
         */
        EClass UML_ENUMERATION_TYPE = eINSTANCE.getUmlEnumerationType();

        /**
         * The meta object literal for the '<em><b>Owned Literal</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UML_ENUMERATION_TYPE__OWNED_LITERAL = eINSTANCE.getUmlEnumerationType_OwnedLiteral();

        /**
         * The meta object literal for the '<em><b>Generalization</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UML_ENUMERATION_TYPE__GENERALIZATION = eINSTANCE.getUmlEnumerationType_Generalization();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute UML_ENUMERATION_TYPE__NAME = eINSTANCE.getUmlEnumerationType_Name();

        /**
         * The meta object literal for the '{@link uml.impl.UmlInterfaceTypeImpl <em>Interface Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.impl.UmlInterfaceTypeImpl
         * @see uml.impl.UmlPackageImpl#getUmlInterfaceType()
         * @generated
         */
        EClass UML_INTERFACE_TYPE = eINSTANCE.getUmlInterfaceType();

        /**
         * The meta object literal for the '<em><b>Generalization</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UML_INTERFACE_TYPE__GENERALIZATION = eINSTANCE.getUmlInterfaceType_Generalization();

        /**
         * The meta object literal for the '<em><b>Owned Attribute</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UML_INTERFACE_TYPE__OWNED_ATTRIBUTE = eINSTANCE.getUmlInterfaceType_OwnedAttribute();

        /**
         * The meta object literal for the '<em><b>Owned Operation</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UML_INTERFACE_TYPE__OWNED_OPERATION = eINSTANCE.getUmlInterfaceType_OwnedOperation();

        /**
         * The meta object literal for the '<em><b>Nested Classifier</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UML_INTERFACE_TYPE__NESTED_CLASSIFIER = eINSTANCE.getUmlInterfaceType_NestedClassifier();

        /**
         * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute UML_INTERFACE_TYPE__IS_ABSTRACT = eINSTANCE.getUmlInterfaceType_IsAbstract();

        /**
         * The meta object literal for the '{@link uml.DirectionType <em>Direction Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.DirectionType
         * @see uml.impl.UmlPackageImpl#getDirectionType()
         * @generated
         */
        EEnum DIRECTION_TYPE = eINSTANCE.getDirectionType();

        /**
         * The meta object literal for the '{@link uml.VisibilityType <em>Visibility Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.VisibilityType
         * @see uml.impl.UmlPackageImpl#getVisibilityType()
         * @generated
         */
        EEnum VISIBILITY_TYPE = eINSTANCE.getVisibilityType();

        /**
         * The meta object literal for the '<em>Direction Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.DirectionType
         * @see uml.impl.UmlPackageImpl#getDirectionTypeObject()
         * @generated
         */
        EDataType DIRECTION_TYPE_OBJECT = eINSTANCE.getDirectionTypeObject();

        /**
         * The meta object literal for the '<em>Visibility Type Object</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see uml.VisibilityType
         * @see uml.impl.UmlPackageImpl#getVisibilityTypeObject()
         * @generated
         */
        EDataType VISIBILITY_TYPE_OBJECT = eINSTANCE.getVisibilityTypeObject();

    }

} //UmlPackage
