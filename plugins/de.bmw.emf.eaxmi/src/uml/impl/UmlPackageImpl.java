/**
 */
package uml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import uml.DefaultValueType;
import uml.DirectionType;
import uml.DocumentRoot;
import uml.GeneralizationType;
import uml.MemberEndType;
import uml.ModelType;
import uml.MultiplicityValueType;
import uml.OwnedAttributeBaseType;
import uml.OwnedAttributeExtendedAttributesType;
import uml.OwnedAttributeExtendedContentType;
import uml.OwnedLiteralType;
import uml.OwnedOperationType;
import uml.OwnedParameterType;
import uml.PackageImportType;
import uml.PackagedElementAssociationType;
import uml.PackagedElementBaseType;
import uml.PackagedElementInstanceSpecificationType;
import uml.PackagedElementPackageType;
import uml.PackagedElementRelationType;
import uml.TypeType;
import uml.UmlClassType;
import uml.UmlEnumerationType;
import uml.UmlFactory;
import uml.UmlInterfaceType;
import uml.UmlPackage;
import uml.VisibilityType;

import xmei.XmeiPackage;

import xmei.impl.XmeiPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlPackageImpl extends EPackageImpl implements UmlPackage
{
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass defaultValueTypeEClass = null;

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
    private EClass generalizationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass memberEndTypeEClass = null;

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
    private EClass multiplicityValueTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ownedAttributeBaseTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ownedAttributeExtendedAttributesTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ownedAttributeExtendedContentTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ownedLiteralTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ownedOperationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ownedParameterTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass packagedElementAssociationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass packagedElementBaseTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass packagedElementInstanceSpecificationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass packagedElementPackageTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass packagedElementRelationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass packageImportTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass typeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass umlClassTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass umlEnumerationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass umlInterfaceTypeEClass = null;

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
    private EEnum visibilityTypeEEnum = null;

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
    private EDataType visibilityTypeObjectEDataType = null;

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
     * @see uml.UmlPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private UmlPackageImpl()
    {
        super(eNS_URI, UmlFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link UmlPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static UmlPackage init()
    {
        if (isInited) return (UmlPackage)EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI);

        // Obtain or create and register package
        UmlPackageImpl theUmlPackage = (UmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UmlPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        XMLTypePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        XmeiPackageImpl theXmeiPackage = (XmeiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XmeiPackage.eNS_URI) instanceof XmeiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XmeiPackage.eNS_URI) : XmeiPackage.eINSTANCE);

        // Create package meta-data objects
        theUmlPackage.createPackageContents();
        theXmeiPackage.createPackageContents();

        // Initialize created meta-data
        theUmlPackage.initializePackageContents();
        theXmeiPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theUmlPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(UmlPackage.eNS_URI, theUmlPackage);
        return theUmlPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDefaultValueType()
    {
        return defaultValueTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefaultValueType_Id()
    {
        return (EAttribute)defaultValueTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefaultValueType_Type()
    {
        return (EAttribute)defaultValueTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefaultValueType_Value()
    {
        return (EAttribute)defaultValueTypeEClass.getEStructuralFeatures().get(2);
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
    public EReference getDocumentRoot_Model()
    {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGeneralizationType()
    {
        return generalizationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGeneralizationType_General()
    {
        return (EAttribute)generalizationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGeneralizationType_Id()
    {
        return (EAttribute)generalizationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGeneralizationType_Type()
    {
        return (EAttribute)generalizationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMemberEndType()
    {
        return memberEndTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMemberEndType_Idref()
    {
        return (EAttribute)memberEndTypeEClass.getEStructuralFeatures().get(0);
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
    public EReference getModelType_PackagedElement()
    {
        return (EReference)modelTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModelType_Name()
    {
        return (EAttribute)modelTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModelType_Type()
    {
        return (EAttribute)modelTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModelType_Visibility()
    {
        return (EAttribute)modelTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMultiplicityValueType()
    {
        return multiplicityValueTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMultiplicityValueType_Id()
    {
        return (EAttribute)multiplicityValueTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMultiplicityValueType_Type()
    {
        return (EAttribute)multiplicityValueTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMultiplicityValueType_Value()
    {
        return (EAttribute)multiplicityValueTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOwnedAttributeBaseType()
    {
        return ownedAttributeBaseTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOwnedAttributeBaseType_Type()
    {
        return (EReference)ownedAttributeBaseTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedAttributeBaseType_Id()
    {
        return (EAttribute)ownedAttributeBaseTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedAttributeBaseType_Type1()
    {
        return (EAttribute)ownedAttributeBaseTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOwnedAttributeExtendedAttributesType()
    {
        return ownedAttributeExtendedAttributesTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedAttributeExtendedAttributesType_Aggregation()
    {
        return (EAttribute)ownedAttributeExtendedAttributesTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedAttributeExtendedAttributesType_Association()
    {
        return (EAttribute)ownedAttributeExtendedAttributesTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedAttributeExtendedAttributesType_IsDerived()
    {
        return (EAttribute)ownedAttributeExtendedAttributesTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedAttributeExtendedAttributesType_IsDerivedUnion()
    {
        return (EAttribute)ownedAttributeExtendedAttributesTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedAttributeExtendedAttributesType_IsOrdered()
    {
        return (EAttribute)ownedAttributeExtendedAttributesTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedAttributeExtendedAttributesType_IsReadOnly()
    {
        return (EAttribute)ownedAttributeExtendedAttributesTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedAttributeExtendedAttributesType_IsStatic()
    {
        return (EAttribute)ownedAttributeExtendedAttributesTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedAttributeExtendedAttributesType_IsUnique()
    {
        return (EAttribute)ownedAttributeExtendedAttributesTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedAttributeExtendedAttributesType_Name()
    {
        return (EAttribute)ownedAttributeExtendedAttributesTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedAttributeExtendedAttributesType_Visibility()
    {
        return (EAttribute)ownedAttributeExtendedAttributesTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOwnedAttributeExtendedContentType()
    {
        return ownedAttributeExtendedContentTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOwnedAttributeExtendedContentType_LowerValue()
    {
        return (EReference)ownedAttributeExtendedContentTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOwnedAttributeExtendedContentType_UpperValue()
    {
        return (EReference)ownedAttributeExtendedContentTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOwnedLiteralType()
    {
        return ownedLiteralTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOwnedLiteralType_Specification()
    {
        return (EReference)ownedLiteralTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedLiteralType_Classifier()
    {
        return (EAttribute)ownedLiteralTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedLiteralType_Id()
    {
        return (EAttribute)ownedLiteralTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedLiteralType_Name()
    {
        return (EAttribute)ownedLiteralTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedLiteralType_Type()
    {
        return (EAttribute)ownedLiteralTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedLiteralType_Visibility()
    {
        return (EAttribute)ownedLiteralTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOwnedOperationType()
    {
        return ownedOperationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOwnedOperationType_OwnedParameter()
    {
        return (EReference)ownedOperationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedOperationType_Concurrency()
    {
        return (EAttribute)ownedOperationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedOperationType_Name()
    {
        return (EAttribute)ownedOperationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOwnedParameterType()
    {
        return ownedParameterTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOwnedParameterType_DefaultValue()
    {
        return (EReference)ownedParameterTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOwnedParameterType_LowerValue()
    {
        return (EReference)ownedParameterTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOwnedParameterType_UpperValue()
    {
        return (EReference)ownedParameterTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedParameterType_Direction()
    {
        return (EAttribute)ownedParameterTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedParameterType_Id()
    {
        return (EAttribute)ownedParameterTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedParameterType_IsException()
    {
        return (EAttribute)ownedParameterTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedParameterType_IsOrdered()
    {
        return (EAttribute)ownedParameterTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedParameterType_IsStream()
    {
        return (EAttribute)ownedParameterTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedParameterType_IsUnique()
    {
        return (EAttribute)ownedParameterTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedParameterType_Name()
    {
        return (EAttribute)ownedParameterTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnedParameterType_Type()
    {
        return (EAttribute)ownedParameterTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPackagedElementAssociationType()
    {
        return packagedElementAssociationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPackagedElementAssociationType_MemberEnd()
    {
        return (EReference)packagedElementAssociationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPackagedElementAssociationType_OwnedEnd()
    {
        return (EReference)packagedElementAssociationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPackagedElementBaseType()
    {
        return packagedElementBaseTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPackagedElementBaseType_Id()
    {
        return (EAttribute)packagedElementBaseTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPackagedElementBaseType_Type()
    {
        return (EAttribute)packagedElementBaseTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPackagedElementBaseType_Visibility()
    {
        return (EAttribute)packagedElementBaseTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPackagedElementInstanceSpecificationType()
    {
        return packagedElementInstanceSpecificationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPackagedElementInstanceSpecificationType_Classifier()
    {
        return (EAttribute)packagedElementInstanceSpecificationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPackagedElementInstanceSpecificationType_Name()
    {
        return (EAttribute)packagedElementInstanceSpecificationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPackagedElementPackageType()
    {
        return packagedElementPackageTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPackagedElementPackageType_PackageImport()
    {
        return (EReference)packagedElementPackageTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPackagedElementPackageType_PackagedElement()
    {
        return (EReference)packagedElementPackageTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPackagedElementPackageType_Name()
    {
        return (EAttribute)packagedElementPackageTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPackagedElementRelationType()
    {
        return packagedElementRelationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPackagedElementRelationType_Client()
    {
        return (EAttribute)packagedElementRelationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPackagedElementRelationType_Supplier()
    {
        return (EAttribute)packagedElementRelationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPackageImportType()
    {
        return packageImportTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPackageImportType_ImportedPackage()
    {
        return (EAttribute)packageImportTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTypeType()
    {
        return typeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTypeType_Href()
    {
        return (EAttribute)typeTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTypeType_Idref()
    {
        return (EAttribute)typeTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUmlClassType()
    {
        return umlClassTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUmlClassType_Generalization()
    {
        return (EReference)umlClassTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUmlClassType_OwnedAttribute()
    {
        return (EReference)umlClassTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUmlClassType_Name()
    {
        return (EAttribute)umlClassTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUmlEnumerationType()
    {
        return umlEnumerationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUmlEnumerationType_OwnedLiteral()
    {
        return (EReference)umlEnumerationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUmlEnumerationType_Generalization()
    {
        return (EReference)umlEnumerationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUmlEnumerationType_Name()
    {
        return (EAttribute)umlEnumerationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUmlInterfaceType()
    {
        return umlInterfaceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUmlInterfaceType_Generalization()
    {
        return (EReference)umlInterfaceTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUmlInterfaceType_OwnedAttribute()
    {
        return (EReference)umlInterfaceTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUmlInterfaceType_OwnedOperation()
    {
        return (EReference)umlInterfaceTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUmlInterfaceType_NestedClassifier()
    {
        return (EReference)umlInterfaceTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUmlInterfaceType_IsAbstract()
    {
        return (EAttribute)umlInterfaceTypeEClass.getEStructuralFeatures().get(4);
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
    public EEnum getVisibilityType()
    {
        return visibilityTypeEEnum;
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
    public EDataType getVisibilityTypeObject()
    {
        return visibilityTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlFactory getUmlFactory()
    {
        return (UmlFactory)getEFactoryInstance();
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
        defaultValueTypeEClass = createEClass(DEFAULT_VALUE_TYPE);
        createEAttribute(defaultValueTypeEClass, DEFAULT_VALUE_TYPE__ID);
        createEAttribute(defaultValueTypeEClass, DEFAULT_VALUE_TYPE__TYPE);
        createEAttribute(defaultValueTypeEClass, DEFAULT_VALUE_TYPE__VALUE);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__MODEL);

        generalizationTypeEClass = createEClass(GENERALIZATION_TYPE);
        createEAttribute(generalizationTypeEClass, GENERALIZATION_TYPE__GENERAL);
        createEAttribute(generalizationTypeEClass, GENERALIZATION_TYPE__ID);
        createEAttribute(generalizationTypeEClass, GENERALIZATION_TYPE__TYPE);

        memberEndTypeEClass = createEClass(MEMBER_END_TYPE);
        createEAttribute(memberEndTypeEClass, MEMBER_END_TYPE__IDREF);

        modelTypeEClass = createEClass(MODEL_TYPE);
        createEReference(modelTypeEClass, MODEL_TYPE__PACKAGED_ELEMENT);
        createEAttribute(modelTypeEClass, MODEL_TYPE__NAME);
        createEAttribute(modelTypeEClass, MODEL_TYPE__TYPE);
        createEAttribute(modelTypeEClass, MODEL_TYPE__VISIBILITY);

        multiplicityValueTypeEClass = createEClass(MULTIPLICITY_VALUE_TYPE);
        createEAttribute(multiplicityValueTypeEClass, MULTIPLICITY_VALUE_TYPE__ID);
        createEAttribute(multiplicityValueTypeEClass, MULTIPLICITY_VALUE_TYPE__TYPE);
        createEAttribute(multiplicityValueTypeEClass, MULTIPLICITY_VALUE_TYPE__VALUE);

        ownedAttributeBaseTypeEClass = createEClass(OWNED_ATTRIBUTE_BASE_TYPE);
        createEReference(ownedAttributeBaseTypeEClass, OWNED_ATTRIBUTE_BASE_TYPE__TYPE);
        createEAttribute(ownedAttributeBaseTypeEClass, OWNED_ATTRIBUTE_BASE_TYPE__ID);
        createEAttribute(ownedAttributeBaseTypeEClass, OWNED_ATTRIBUTE_BASE_TYPE__TYPE1);

        ownedAttributeExtendedAttributesTypeEClass = createEClass(OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE);
        createEAttribute(ownedAttributeExtendedAttributesTypeEClass, OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__AGGREGATION);
        createEAttribute(ownedAttributeExtendedAttributesTypeEClass, OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__ASSOCIATION);
        createEAttribute(ownedAttributeExtendedAttributesTypeEClass, OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED);
        createEAttribute(ownedAttributeExtendedAttributesTypeEClass, OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED_UNION);
        createEAttribute(ownedAttributeExtendedAttributesTypeEClass, OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_ORDERED);
        createEAttribute(ownedAttributeExtendedAttributesTypeEClass, OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_READ_ONLY);
        createEAttribute(ownedAttributeExtendedAttributesTypeEClass, OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_STATIC);
        createEAttribute(ownedAttributeExtendedAttributesTypeEClass, OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_UNIQUE);
        createEAttribute(ownedAttributeExtendedAttributesTypeEClass, OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__NAME);
        createEAttribute(ownedAttributeExtendedAttributesTypeEClass, OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__VISIBILITY);

        ownedAttributeExtendedContentTypeEClass = createEClass(OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE);
        createEReference(ownedAttributeExtendedContentTypeEClass, OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__LOWER_VALUE);
        createEReference(ownedAttributeExtendedContentTypeEClass, OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE__UPPER_VALUE);

        ownedLiteralTypeEClass = createEClass(OWNED_LITERAL_TYPE);
        createEReference(ownedLiteralTypeEClass, OWNED_LITERAL_TYPE__SPECIFICATION);
        createEAttribute(ownedLiteralTypeEClass, OWNED_LITERAL_TYPE__CLASSIFIER);
        createEAttribute(ownedLiteralTypeEClass, OWNED_LITERAL_TYPE__ID);
        createEAttribute(ownedLiteralTypeEClass, OWNED_LITERAL_TYPE__NAME);
        createEAttribute(ownedLiteralTypeEClass, OWNED_LITERAL_TYPE__TYPE);
        createEAttribute(ownedLiteralTypeEClass, OWNED_LITERAL_TYPE__VISIBILITY);

        ownedOperationTypeEClass = createEClass(OWNED_OPERATION_TYPE);
        createEReference(ownedOperationTypeEClass, OWNED_OPERATION_TYPE__OWNED_PARAMETER);
        createEAttribute(ownedOperationTypeEClass, OWNED_OPERATION_TYPE__CONCURRENCY);
        createEAttribute(ownedOperationTypeEClass, OWNED_OPERATION_TYPE__NAME);

        ownedParameterTypeEClass = createEClass(OWNED_PARAMETER_TYPE);
        createEReference(ownedParameterTypeEClass, OWNED_PARAMETER_TYPE__DEFAULT_VALUE);
        createEReference(ownedParameterTypeEClass, OWNED_PARAMETER_TYPE__LOWER_VALUE);
        createEReference(ownedParameterTypeEClass, OWNED_PARAMETER_TYPE__UPPER_VALUE);
        createEAttribute(ownedParameterTypeEClass, OWNED_PARAMETER_TYPE__DIRECTION);
        createEAttribute(ownedParameterTypeEClass, OWNED_PARAMETER_TYPE__ID);
        createEAttribute(ownedParameterTypeEClass, OWNED_PARAMETER_TYPE__IS_EXCEPTION);
        createEAttribute(ownedParameterTypeEClass, OWNED_PARAMETER_TYPE__IS_ORDERED);
        createEAttribute(ownedParameterTypeEClass, OWNED_PARAMETER_TYPE__IS_STREAM);
        createEAttribute(ownedParameterTypeEClass, OWNED_PARAMETER_TYPE__IS_UNIQUE);
        createEAttribute(ownedParameterTypeEClass, OWNED_PARAMETER_TYPE__NAME);
        createEAttribute(ownedParameterTypeEClass, OWNED_PARAMETER_TYPE__TYPE);

        packagedElementAssociationTypeEClass = createEClass(PACKAGED_ELEMENT_ASSOCIATION_TYPE);
        createEReference(packagedElementAssociationTypeEClass, PACKAGED_ELEMENT_ASSOCIATION_TYPE__MEMBER_END);
        createEReference(packagedElementAssociationTypeEClass, PACKAGED_ELEMENT_ASSOCIATION_TYPE__OWNED_END);

        packagedElementBaseTypeEClass = createEClass(PACKAGED_ELEMENT_BASE_TYPE);
        createEAttribute(packagedElementBaseTypeEClass, PACKAGED_ELEMENT_BASE_TYPE__ID);
        createEAttribute(packagedElementBaseTypeEClass, PACKAGED_ELEMENT_BASE_TYPE__TYPE);
        createEAttribute(packagedElementBaseTypeEClass, PACKAGED_ELEMENT_BASE_TYPE__VISIBILITY);

        packagedElementInstanceSpecificationTypeEClass = createEClass(PACKAGED_ELEMENT_INSTANCE_SPECIFICATION_TYPE);
        createEAttribute(packagedElementInstanceSpecificationTypeEClass, PACKAGED_ELEMENT_INSTANCE_SPECIFICATION_TYPE__CLASSIFIER);
        createEAttribute(packagedElementInstanceSpecificationTypeEClass, PACKAGED_ELEMENT_INSTANCE_SPECIFICATION_TYPE__NAME);

        packagedElementPackageTypeEClass = createEClass(PACKAGED_ELEMENT_PACKAGE_TYPE);
        createEReference(packagedElementPackageTypeEClass, PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGE_IMPORT);
        createEReference(packagedElementPackageTypeEClass, PACKAGED_ELEMENT_PACKAGE_TYPE__PACKAGED_ELEMENT);
        createEAttribute(packagedElementPackageTypeEClass, PACKAGED_ELEMENT_PACKAGE_TYPE__NAME);

        packagedElementRelationTypeEClass = createEClass(PACKAGED_ELEMENT_RELATION_TYPE);
        createEAttribute(packagedElementRelationTypeEClass, PACKAGED_ELEMENT_RELATION_TYPE__CLIENT);
        createEAttribute(packagedElementRelationTypeEClass, PACKAGED_ELEMENT_RELATION_TYPE__SUPPLIER);

        packageImportTypeEClass = createEClass(PACKAGE_IMPORT_TYPE);
        createEAttribute(packageImportTypeEClass, PACKAGE_IMPORT_TYPE__IMPORTED_PACKAGE);

        typeTypeEClass = createEClass(TYPE_TYPE);
        createEAttribute(typeTypeEClass, TYPE_TYPE__HREF);
        createEAttribute(typeTypeEClass, TYPE_TYPE__IDREF);

        umlClassTypeEClass = createEClass(UML_CLASS_TYPE);
        createEReference(umlClassTypeEClass, UML_CLASS_TYPE__GENERALIZATION);
        createEReference(umlClassTypeEClass, UML_CLASS_TYPE__OWNED_ATTRIBUTE);
        createEAttribute(umlClassTypeEClass, UML_CLASS_TYPE__NAME);

        umlEnumerationTypeEClass = createEClass(UML_ENUMERATION_TYPE);
        createEReference(umlEnumerationTypeEClass, UML_ENUMERATION_TYPE__OWNED_LITERAL);
        createEReference(umlEnumerationTypeEClass, UML_ENUMERATION_TYPE__GENERALIZATION);
        createEAttribute(umlEnumerationTypeEClass, UML_ENUMERATION_TYPE__NAME);

        umlInterfaceTypeEClass = createEClass(UML_INTERFACE_TYPE);
        createEReference(umlInterfaceTypeEClass, UML_INTERFACE_TYPE__GENERALIZATION);
        createEReference(umlInterfaceTypeEClass, UML_INTERFACE_TYPE__OWNED_ATTRIBUTE);
        createEReference(umlInterfaceTypeEClass, UML_INTERFACE_TYPE__OWNED_OPERATION);
        createEReference(umlInterfaceTypeEClass, UML_INTERFACE_TYPE__NESTED_CLASSIFIER);
        createEAttribute(umlInterfaceTypeEClass, UML_INTERFACE_TYPE__IS_ABSTRACT);

        // Create enums
        directionTypeEEnum = createEEnum(DIRECTION_TYPE);
        visibilityTypeEEnum = createEEnum(VISIBILITY_TYPE);

        // Create data types
        directionTypeObjectEDataType = createEDataType(DIRECTION_TYPE_OBJECT);
        visibilityTypeObjectEDataType = createEDataType(VISIBILITY_TYPE_OBJECT);
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
        XmeiPackage theXmeiPackage = (XmeiPackage)EPackage.Registry.INSTANCE.getEPackage(XmeiPackage.eNS_URI);
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        ownedAttributeExtendedAttributesTypeEClass.getESuperTypes().add(this.getOwnedAttributeBaseType());
        ownedAttributeExtendedContentTypeEClass.getESuperTypes().add(this.getOwnedAttributeExtendedAttributesType());
        ownedOperationTypeEClass.getESuperTypes().add(this.getPackagedElementBaseType());
        packagedElementAssociationTypeEClass.getESuperTypes().add(this.getPackagedElementBaseType());
        packagedElementInstanceSpecificationTypeEClass.getESuperTypes().add(this.getPackagedElementBaseType());
        packagedElementPackageTypeEClass.getESuperTypes().add(this.getPackagedElementBaseType());
        packagedElementRelationTypeEClass.getESuperTypes().add(this.getPackagedElementBaseType());
        packageImportTypeEClass.getESuperTypes().add(this.getPackagedElementBaseType());
        umlClassTypeEClass.getESuperTypes().add(this.getPackagedElementBaseType());
        umlEnumerationTypeEClass.getESuperTypes().add(this.getPackagedElementBaseType());
        umlInterfaceTypeEClass.getESuperTypes().add(this.getPackagedElementPackageType());

        // Initialize classes, features, and operations; add parameters
        initEClass(defaultValueTypeEClass, DefaultValueType.class, "DefaultValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDefaultValueType_Id(), theXmeiPackage.getIdType(), "id", null, 1, 1, DefaultValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDefaultValueType_Type(), theXmeiPackage.getTypeBaseType(), "type", null, 1, 1, DefaultValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDefaultValueType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, DefaultValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Model(), this.getModelType(), null, "model", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(generalizationTypeEClass, GeneralizationType.class, "GeneralizationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGeneralizationType_General(), theXmeiPackage.getIdType(), "general", null, 1, 1, GeneralizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGeneralizationType_Id(), theXmeiPackage.getIdType(), "id", null, 1, 1, GeneralizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGeneralizationType_Type(), theXmeiPackage.getTypeBaseType(), "type", "uml:Generalization", 1, 1, GeneralizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(memberEndTypeEClass, MemberEndType.class, "MemberEndType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMemberEndType_Idref(), theXmeiPackage.getIdType(), "idref", null, 1, 1, MemberEndType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(modelTypeEClass, ModelType.class, "ModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getModelType_PackagedElement(), this.getPackagedElementPackageType(), null, "packagedElement", null, 1, -1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModelType_Name(), theXMLTypePackage.getString(), "name", "EA_Model", 1, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModelType_Type(), theXmeiPackage.getTypeBaseType(), "type", "uml:Model", 1, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModelType_Visibility(), this.getVisibilityType(), "visibility", "public", 1, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(multiplicityValueTypeEClass, MultiplicityValueType.class, "MultiplicityValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMultiplicityValueType_Id(), theXmeiPackage.getIdType(), "id", null, 1, 1, MultiplicityValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMultiplicityValueType_Type(), theXmeiPackage.getTypeBaseType(), "type", null, 1, 1, MultiplicityValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMultiplicityValueType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, MultiplicityValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ownedAttributeBaseTypeEClass, OwnedAttributeBaseType.class, "OwnedAttributeBaseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOwnedAttributeBaseType_Type(), this.getTypeType(), null, "type", null, 1, 1, OwnedAttributeBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedAttributeBaseType_Id(), theXmeiPackage.getIdType(), "id", null, 1, 1, OwnedAttributeBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedAttributeBaseType_Type1(), theXmeiPackage.getTypeBaseType(), "type1", "uml:Property", 1, 1, OwnedAttributeBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ownedAttributeExtendedAttributesTypeEClass, OwnedAttributeExtendedAttributesType.class, "OwnedAttributeExtendedAttributesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOwnedAttributeExtendedAttributesType_Aggregation(), theXMLTypePackage.getString(), "aggregation", null, 0, 1, OwnedAttributeExtendedAttributesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedAttributeExtendedAttributesType_Association(), theXmeiPackage.getIdType(), "association", null, 0, 1, OwnedAttributeExtendedAttributesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedAttributeExtendedAttributesType_IsDerived(), theXMLTypePackage.getBoolean(), "isDerived", null, 0, 1, OwnedAttributeExtendedAttributesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedAttributeExtendedAttributesType_IsDerivedUnion(), theXMLTypePackage.getBoolean(), "isDerivedUnion", null, 0, 1, OwnedAttributeExtendedAttributesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedAttributeExtendedAttributesType_IsOrdered(), theXMLTypePackage.getBoolean(), "isOrdered", null, 0, 1, OwnedAttributeExtendedAttributesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedAttributeExtendedAttributesType_IsReadOnly(), theXMLTypePackage.getBoolean(), "isReadOnly", null, 0, 1, OwnedAttributeExtendedAttributesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedAttributeExtendedAttributesType_IsStatic(), theXMLTypePackage.getBoolean(), "isStatic", null, 0, 1, OwnedAttributeExtendedAttributesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedAttributeExtendedAttributesType_IsUnique(), theXMLTypePackage.getBoolean(), "isUnique", null, 0, 1, OwnedAttributeExtendedAttributesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedAttributeExtendedAttributesType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, OwnedAttributeExtendedAttributesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedAttributeExtendedAttributesType_Visibility(), this.getVisibilityType(), "visibility", null, 0, 1, OwnedAttributeExtendedAttributesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ownedAttributeExtendedContentTypeEClass, OwnedAttributeExtendedContentType.class, "OwnedAttributeExtendedContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOwnedAttributeExtendedContentType_LowerValue(), this.getMultiplicityValueType(), null, "lowerValue", null, 1, 1, OwnedAttributeExtendedContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOwnedAttributeExtendedContentType_UpperValue(), this.getMultiplicityValueType(), null, "upperValue", null, 1, 1, OwnedAttributeExtendedContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ownedLiteralTypeEClass, OwnedLiteralType.class, "OwnedLiteralType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOwnedLiteralType_Specification(), this.getDefaultValueType(), null, "specification", null, 1, 1, OwnedLiteralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedLiteralType_Classifier(), theXMLTypePackage.getString(), "classifier", null, 1, 1, OwnedLiteralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedLiteralType_Id(), theXmeiPackage.getIdType(), "id", null, 1, 1, OwnedLiteralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedLiteralType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, OwnedLiteralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedLiteralType_Type(), theXmeiPackage.getTypeBaseType(), "type", null, 1, 1, OwnedLiteralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedLiteralType_Visibility(), this.getVisibilityType(), "visibility", null, 1, 1, OwnedLiteralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ownedOperationTypeEClass, OwnedOperationType.class, "OwnedOperationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOwnedOperationType_OwnedParameter(), this.getOwnedParameterType(), null, "ownedParameter", null, 0, -1, OwnedOperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedOperationType_Concurrency(), theXMLTypePackage.getString(), "concurrency", "sequential", 1, 1, OwnedOperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedOperationType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, OwnedOperationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ownedParameterTypeEClass, OwnedParameterType.class, "OwnedParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOwnedParameterType_DefaultValue(), this.getDefaultValueType(), null, "defaultValue", null, 0, 1, OwnedParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOwnedParameterType_LowerValue(), this.getMultiplicityValueType(), null, "lowerValue", null, 1, 1, OwnedParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOwnedParameterType_UpperValue(), this.getMultiplicityValueType(), null, "upperValue", null, 1, 1, OwnedParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedParameterType_Direction(), this.getDirectionType(), "direction", null, 1, 1, OwnedParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedParameterType_Id(), theXmeiPackage.getIdType(), "id", null, 1, 1, OwnedParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedParameterType_IsException(), theXMLTypePackage.getBoolean(), "isException", null, 1, 1, OwnedParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedParameterType_IsOrdered(), theXMLTypePackage.getBoolean(), "isOrdered", null, 1, 1, OwnedParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedParameterType_IsStream(), theXMLTypePackage.getBoolean(), "isStream", null, 1, 1, OwnedParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedParameterType_IsUnique(), theXMLTypePackage.getBoolean(), "isUnique", null, 1, 1, OwnedParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedParameterType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, OwnedParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnedParameterType_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, OwnedParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(packagedElementAssociationTypeEClass, PackagedElementAssociationType.class, "PackagedElementAssociationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPackagedElementAssociationType_MemberEnd(), this.getMemberEndType(), null, "memberEnd", null, 2, 2, PackagedElementAssociationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPackagedElementAssociationType_OwnedEnd(), this.getOwnedAttributeExtendedAttributesType(), null, "ownedEnd", null, 1, 2, PackagedElementAssociationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(packagedElementBaseTypeEClass, PackagedElementBaseType.class, "PackagedElementBaseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPackagedElementBaseType_Id(), theXmeiPackage.getIdType(), "id", null, 1, 1, PackagedElementBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPackagedElementBaseType_Type(), theXmeiPackage.getTypeBaseType(), "type", null, 1, 1, PackagedElementBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPackagedElementBaseType_Visibility(), this.getVisibilityType(), "visibility", "public", 1, 1, PackagedElementBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(packagedElementInstanceSpecificationTypeEClass, PackagedElementInstanceSpecificationType.class, "PackagedElementInstanceSpecificationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPackagedElementInstanceSpecificationType_Classifier(), theXmeiPackage.getIdType(), "classifier", null, 1, 1, PackagedElementInstanceSpecificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPackagedElementInstanceSpecificationType_Name(), theXMLTypePackage.getString(), "name", "", 1, 1, PackagedElementInstanceSpecificationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(packagedElementPackageTypeEClass, PackagedElementPackageType.class, "PackagedElementPackageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPackagedElementPackageType_PackageImport(), this.getPackageImportType(), null, "packageImport", null, 0, -1, PackagedElementPackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPackagedElementPackageType_PackagedElement(), this.getPackagedElementBaseType(), null, "packagedElement", null, 0, -1, PackagedElementPackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPackagedElementPackageType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PackagedElementPackageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(packagedElementRelationTypeEClass, PackagedElementRelationType.class, "PackagedElementRelationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPackagedElementRelationType_Client(), theXmeiPackage.getIdType(), "client", null, 1, 1, PackagedElementRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getPackagedElementRelationType_Supplier(), theXmeiPackage.getIdType(), "supplier", null, 1, 1, PackagedElementRelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(packageImportTypeEClass, PackageImportType.class, "PackageImportType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPackageImportType_ImportedPackage(), theXmeiPackage.getIdType(), "importedPackage", null, 1, 1, PackageImportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(typeTypeEClass, TypeType.class, "TypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTypeType_Href(), theXMLTypePackage.getString(), "href", null, 0, 1, TypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTypeType_Idref(), theXmeiPackage.getIdType(), "idref", null, 0, 1, TypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(umlClassTypeEClass, UmlClassType.class, "UmlClassType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUmlClassType_Generalization(), this.getGeneralizationType(), null, "generalization", null, 0, 1, UmlClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getUmlClassType_OwnedAttribute(), this.getOwnedAttributeBaseType(), null, "ownedAttribute", null, 0, -1, UmlClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUmlClassType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, UmlClassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(umlEnumerationTypeEClass, UmlEnumerationType.class, "UmlEnumerationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUmlEnumerationType_OwnedLiteral(), this.getOwnedLiteralType(), null, "ownedLiteral", null, 0, -1, UmlEnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getUmlEnumerationType_Generalization(), this.getGeneralizationType(), null, "generalization", null, 0, 1, UmlEnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUmlEnumerationType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, UmlEnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(umlInterfaceTypeEClass, UmlInterfaceType.class, "UmlInterfaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUmlInterfaceType_Generalization(), this.getGeneralizationType(), null, "generalization", null, 0, 1, UmlInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getUmlInterfaceType_OwnedAttribute(), this.getOwnedAttributeBaseType(), null, "ownedAttribute", null, 0, -1, UmlInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getUmlInterfaceType_OwnedOperation(), this.getOwnedOperationType(), null, "ownedOperation", null, 0, -1, UmlInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getUmlInterfaceType_NestedClassifier(), this.getPackagedElementBaseType(), null, "nestedClassifier", null, 0, -1, UmlInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUmlInterfaceType_IsAbstract(), theXMLTypePackage.getBoolean(), "isAbstract", null, 1, 1, UmlInterfaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(directionTypeEEnum, DirectionType.class, "DirectionType");
        addEEnumLiteral(directionTypeEEnum, DirectionType.IN);
        addEEnumLiteral(directionTypeEEnum, DirectionType.OUT);

        initEEnum(visibilityTypeEEnum, VisibilityType.class, "VisibilityType");
        addEEnumLiteral(visibilityTypeEEnum, VisibilityType.PUBLIC);
        addEEnumLiteral(visibilityTypeEEnum, VisibilityType.PRIVATE);

        // Initialize data types
        initEDataType(directionTypeObjectEDataType, DirectionType.class, "DirectionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(visibilityTypeObjectEDataType, VisibilityType.class, "VisibilityTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
          (defaultValueTypeEClass, 
           source, 
           new String[] 
           {
             "name", "defaultValueType",
             "kind", "empty"
           });		
        addAnnotation
          (getDefaultValueType_Id(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "id",
             "namespace", "xmei.Franca2EA_XMI_Schema"
           });		
        addAnnotation
          (getDefaultValueType_Type(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "type",
             "namespace", "xmei.Franca2EA_XMI_Schema"
           });		
        addAnnotation
          (getDefaultValueType_Value(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "value"
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
          (getDocumentRoot_Model(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "Model",
             "namespace", "##targetNamespace"
           });		
        addAnnotation
          (generalizationTypeEClass, 
           source, 
           new String[] 
           {
             "name", "generalizationType",
             "kind", "empty"
           });		
        addAnnotation
          (getGeneralizationType_General(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "general"
           });		
        addAnnotation
          (getGeneralizationType_Id(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "id",
             "namespace", "xmei.Franca2EA_XMI_Schema"
           });		
        addAnnotation
          (getGeneralizationType_Type(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "type",
             "namespace", "xmei.Franca2EA_XMI_Schema"
           });		
        addAnnotation
          (memberEndTypeEClass, 
           source, 
           new String[] 
           {
             "name", "memberEndType",
             "kind", "empty"
           });		
        addAnnotation
          (getMemberEndType_Idref(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "idref",
             "namespace", "xmei.Franca2EA_XMI_Schema"
           });		
        addAnnotation
          (modelTypeEClass, 
           source, 
           new String[] 
           {
             "name", "Model_._type",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getModelType_PackagedElement(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "packagedElement"
           });		
        addAnnotation
          (getModelType_Name(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getModelType_Type(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "type",
             "namespace", "xmei.Franca2EA_XMI_Schema"
           });		
        addAnnotation
          (getModelType_Visibility(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "visibility"
           });		
        addAnnotation
          (multiplicityValueTypeEClass, 
           source, 
           new String[] 
           {
             "name", "multiplicityValueType",
             "kind", "empty"
           });		
        addAnnotation
          (getMultiplicityValueType_Id(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "id",
             "namespace", "xmei.Franca2EA_XMI_Schema"
           });		
        addAnnotation
          (getMultiplicityValueType_Type(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "type",
             "namespace", "xmei.Franca2EA_XMI_Schema"
           });		
        addAnnotation
          (getMultiplicityValueType_Value(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "value"
           });		
        addAnnotation
          (ownedAttributeBaseTypeEClass, 
           source, 
           new String[] 
           {
             "name", "ownedAttributeBaseType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getOwnedAttributeBaseType_Type(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "type"
           });		
        addAnnotation
          (getOwnedAttributeBaseType_Id(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "id",
             "namespace", "xmei.Franca2EA_XMI_Schema"
           });		
        addAnnotation
          (getOwnedAttributeBaseType_Type1(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "type",
             "namespace", "xmei.Franca2EA_XMI_Schema"
           });		
        addAnnotation
          (ownedAttributeExtendedAttributesTypeEClass, 
           source, 
           new String[] 
           {
             "name", "ownedAttributeExtendedAttributesType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getOwnedAttributeExtendedAttributesType_Aggregation(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "aggregation"
           });		
        addAnnotation
          (getOwnedAttributeExtendedAttributesType_Association(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "association"
           });		
        addAnnotation
          (getOwnedAttributeExtendedAttributesType_IsDerived(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isDerived"
           });		
        addAnnotation
          (getOwnedAttributeExtendedAttributesType_IsDerivedUnion(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isDerivedUnion"
           });		
        addAnnotation
          (getOwnedAttributeExtendedAttributesType_IsOrdered(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isOrdered"
           });		
        addAnnotation
          (getOwnedAttributeExtendedAttributesType_IsReadOnly(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isReadOnly"
           });		
        addAnnotation
          (getOwnedAttributeExtendedAttributesType_IsStatic(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isStatic"
           });		
        addAnnotation
          (getOwnedAttributeExtendedAttributesType_IsUnique(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isUnique"
           });		
        addAnnotation
          (getOwnedAttributeExtendedAttributesType_Name(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getOwnedAttributeExtendedAttributesType_Visibility(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "visibility"
           });		
        addAnnotation
          (ownedAttributeExtendedContentTypeEClass, 
           source, 
           new String[] 
           {
             "name", "ownedAttributeExtendedContentType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getOwnedAttributeExtendedContentType_LowerValue(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "lowerValue"
           });		
        addAnnotation
          (getOwnedAttributeExtendedContentType_UpperValue(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "upperValue"
           });		
        addAnnotation
          (ownedLiteralTypeEClass, 
           source, 
           new String[] 
           {
             "name", "ownedLiteralType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getOwnedLiteralType_Specification(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "specification"
           });		
        addAnnotation
          (getOwnedLiteralType_Classifier(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "classifier"
           });		
        addAnnotation
          (getOwnedLiteralType_Id(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "id",
             "namespace", "xmei.Franca2EA_XMI_Schema"
           });		
        addAnnotation
          (getOwnedLiteralType_Name(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getOwnedLiteralType_Type(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "type",
             "namespace", "xmei.Franca2EA_XMI_Schema"
           });		
        addAnnotation
          (getOwnedLiteralType_Visibility(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "visibility"
           });		
        addAnnotation
          (ownedOperationTypeEClass, 
           source, 
           new String[] 
           {
             "name", "ownedOperationType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getOwnedOperationType_OwnedParameter(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "ownedParameter"
           });		
        addAnnotation
          (getOwnedOperationType_Concurrency(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "concurrency"
           });		
        addAnnotation
          (getOwnedOperationType_Name(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (ownedParameterTypeEClass, 
           source, 
           new String[] 
           {
             "name", "ownedParameterType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getOwnedParameterType_DefaultValue(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "defaultValue"
           });		
        addAnnotation
          (getOwnedParameterType_LowerValue(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "lowerValue"
           });		
        addAnnotation
          (getOwnedParameterType_UpperValue(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "upperValue"
           });		
        addAnnotation
          (getOwnedParameterType_Direction(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "direction"
           });		
        addAnnotation
          (getOwnedParameterType_Id(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "id",
             "namespace", "xmei.Franca2EA_XMI_Schema"
           });		
        addAnnotation
          (getOwnedParameterType_IsException(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isException"
           });		
        addAnnotation
          (getOwnedParameterType_IsOrdered(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isOrdered"
           });		
        addAnnotation
          (getOwnedParameterType_IsStream(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isStream"
           });		
        addAnnotation
          (getOwnedParameterType_IsUnique(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isUnique"
           });		
        addAnnotation
          (getOwnedParameterType_Name(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (getOwnedParameterType_Type(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "type"
           });		
        addAnnotation
          (packagedElementAssociationTypeEClass, 
           source, 
           new String[] 
           {
             "name", "packagedElementAssociationType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getPackagedElementAssociationType_MemberEnd(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "memberEnd"
           });		
        addAnnotation
          (getPackagedElementAssociationType_OwnedEnd(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "ownedEnd"
           });		
        addAnnotation
          (packagedElementBaseTypeEClass, 
           source, 
           new String[] 
           {
             "name", "packagedElementBaseType",
             "kind", "empty"
           });		
        addAnnotation
          (getPackagedElementBaseType_Id(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "id",
             "namespace", "xmei.Franca2EA_XMI_Schema"
           });		
        addAnnotation
          (getPackagedElementBaseType_Type(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "type",
             "namespace", "xmei.Franca2EA_XMI_Schema"
           });		
        addAnnotation
          (getPackagedElementBaseType_Visibility(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "visibility"
           });		
        addAnnotation
          (packagedElementInstanceSpecificationTypeEClass, 
           source, 
           new String[] 
           {
             "name", "packagedElementInstanceSpecificationType",
             "kind", "empty"
           });		
        addAnnotation
          (getPackagedElementInstanceSpecificationType_Classifier(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "classifier"
           });		
        addAnnotation
          (getPackagedElementInstanceSpecificationType_Name(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (packagedElementPackageTypeEClass, 
           source, 
           new String[] 
           {
             "name", "packagedElementPackageType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getPackagedElementPackageType_PackageImport(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "packageImport"
           });		
        addAnnotation
          (getPackagedElementPackageType_PackagedElement(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "packagedElement"
           });		
        addAnnotation
          (getPackagedElementPackageType_Name(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (packagedElementRelationTypeEClass, 
           source, 
           new String[] 
           {
             "name", "packagedElementRelationType",
             "kind", "empty"
           });		
        addAnnotation
          (getPackagedElementRelationType_Client(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "client"
           });		
        addAnnotation
          (getPackagedElementRelationType_Supplier(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "supplier"
           });		
        addAnnotation
          (packageImportTypeEClass, 
           source, 
           new String[] 
           {
             "name", "packageImportType",
             "kind", "empty"
           });		
        addAnnotation
          (getPackageImportType_ImportedPackage(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "importedPackage"
           });		
        addAnnotation
          (typeTypeEClass, 
           source, 
           new String[] 
           {
             "name", "typeType",
             "kind", "empty"
           });		
        addAnnotation
          (getTypeType_Href(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "href"
           });		
        addAnnotation
          (getTypeType_Idref(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "idref",
             "namespace", "xmei.Franca2EA_XMI_Schema"
           });		
        addAnnotation
          (umlClassTypeEClass, 
           source, 
           new String[] 
           {
             "name", "umlClassType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getUmlClassType_Generalization(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "generalization"
           });		
        addAnnotation
          (getUmlClassType_OwnedAttribute(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "ownedAttribute"
           });		
        addAnnotation
          (getUmlClassType_Name(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (umlEnumerationTypeEClass, 
           source, 
           new String[] 
           {
             "name", "umlEnumerationType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getUmlEnumerationType_OwnedLiteral(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "ownedLiteral"
           });		
        addAnnotation
          (getUmlEnumerationType_Generalization(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "generalization"
           });		
        addAnnotation
          (getUmlEnumerationType_Name(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "name"
           });		
        addAnnotation
          (umlInterfaceTypeEClass, 
           source, 
           new String[] 
           {
             "name", "umlInterfaceType",
             "kind", "elementOnly"
           });		
        addAnnotation
          (getUmlInterfaceType_Generalization(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "generalization"
           });		
        addAnnotation
          (getUmlInterfaceType_OwnedAttribute(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "ownedAttribute"
           });		
        addAnnotation
          (getUmlInterfaceType_OwnedOperation(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "ownedOperation"
           });		
        addAnnotation
          (getUmlInterfaceType_NestedClassifier(), 
           source, 
           new String[] 
           {
             "kind", "element",
             "name", "nestedClassifier"
           });		
        addAnnotation
          (getUmlInterfaceType_IsAbstract(), 
           source, 
           new String[] 
           {
             "kind", "attribute",
             "name", "isAbstract"
           });		
        addAnnotation
          (visibilityTypeEEnum, 
           source, 
           new String[] 
           {
             "name", "visibilityType"
           });		
        addAnnotation
          (visibilityTypeObjectEDataType, 
           source, 
           new String[] 
           {
             "name", "visibilityType:Object",
             "baseType", "visibilityType"
           });
    }

} //UmlPackageImpl
