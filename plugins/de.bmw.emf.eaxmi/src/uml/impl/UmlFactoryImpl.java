/**
 */
package uml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlFactoryImpl extends EFactoryImpl implements UmlFactory
{
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static UmlFactory init()
    {
        try
        {
            UmlFactory theUmlFactory = (UmlFactory)EPackage.Registry.INSTANCE.getEFactory(UmlPackage.eNS_URI);
            if (theUmlFactory != null)
            {
                return theUmlFactory;
            }
        }
        catch (Exception exception)
        {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new UmlFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlFactoryImpl()
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
            case UmlPackage.DEFAULT_VALUE_TYPE: return createDefaultValueType();
            case UmlPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case UmlPackage.GENERALIZATION_TYPE: return createGeneralizationType();
            case UmlPackage.MEMBER_END_TYPE: return createMemberEndType();
            case UmlPackage.MODEL_TYPE: return createModelType();
            case UmlPackage.MULTIPLICITY_VALUE_TYPE: return createMultiplicityValueType();
            case UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE: return createOwnedAttributeBaseType();
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE: return createOwnedAttributeExtendedAttributesType();
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_CONTENT_TYPE: return createOwnedAttributeExtendedContentType();
            case UmlPackage.OWNED_LITERAL_TYPE: return createOwnedLiteralType();
            case UmlPackage.OWNED_OPERATION_TYPE: return createOwnedOperationType();
            case UmlPackage.OWNED_PARAMETER_TYPE: return createOwnedParameterType();
            case UmlPackage.PACKAGED_ELEMENT_ASSOCIATION_TYPE: return createPackagedElementAssociationType();
            case UmlPackage.PACKAGED_ELEMENT_BASE_TYPE: return createPackagedElementBaseType();
            case UmlPackage.PACKAGED_ELEMENT_INSTANCE_SPECIFICATION_TYPE: return createPackagedElementInstanceSpecificationType();
            case UmlPackage.PACKAGED_ELEMENT_PACKAGE_TYPE: return createPackagedElementPackageType();
            case UmlPackage.PACKAGED_ELEMENT_RELATION_TYPE: return createPackagedElementRelationType();
            case UmlPackage.PACKAGE_IMPORT_TYPE: return createPackageImportType();
            case UmlPackage.TYPE_TYPE: return createTypeType();
            case UmlPackage.UML_CLASS_TYPE: return createUmlClassType();
            case UmlPackage.UML_ENUMERATION_TYPE: return createUmlEnumerationType();
            case UmlPackage.UML_INTERFACE_TYPE: return createUmlInterfaceType();
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
            case UmlPackage.DIRECTION_TYPE:
                return createDirectionTypeFromString(eDataType, initialValue);
            case UmlPackage.VISIBILITY_TYPE:
                return createVisibilityTypeFromString(eDataType, initialValue);
            case UmlPackage.DIRECTION_TYPE_OBJECT:
                return createDirectionTypeObjectFromString(eDataType, initialValue);
            case UmlPackage.VISIBILITY_TYPE_OBJECT:
                return createVisibilityTypeObjectFromString(eDataType, initialValue);
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
            case UmlPackage.DIRECTION_TYPE:
                return convertDirectionTypeToString(eDataType, instanceValue);
            case UmlPackage.VISIBILITY_TYPE:
                return convertVisibilityTypeToString(eDataType, instanceValue);
            case UmlPackage.DIRECTION_TYPE_OBJECT:
                return convertDirectionTypeObjectToString(eDataType, instanceValue);
            case UmlPackage.VISIBILITY_TYPE_OBJECT:
                return convertVisibilityTypeObjectToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefaultValueType createDefaultValueType()
    {
        DefaultValueTypeImpl defaultValueType = new DefaultValueTypeImpl();
        return defaultValueType;
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
    public GeneralizationType createGeneralizationType()
    {
        GeneralizationTypeImpl generalizationType = new GeneralizationTypeImpl();
        return generalizationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MemberEndType createMemberEndType()
    {
        MemberEndTypeImpl memberEndType = new MemberEndTypeImpl();
        return memberEndType;
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
    public MultiplicityValueType createMultiplicityValueType()
    {
        MultiplicityValueTypeImpl multiplicityValueType = new MultiplicityValueTypeImpl();
        return multiplicityValueType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OwnedAttributeBaseType createOwnedAttributeBaseType()
    {
        OwnedAttributeBaseTypeImpl ownedAttributeBaseType = new OwnedAttributeBaseTypeImpl();
        return ownedAttributeBaseType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OwnedAttributeExtendedAttributesType createOwnedAttributeExtendedAttributesType()
    {
        OwnedAttributeExtendedAttributesTypeImpl ownedAttributeExtendedAttributesType = new OwnedAttributeExtendedAttributesTypeImpl();
        return ownedAttributeExtendedAttributesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OwnedAttributeExtendedContentType createOwnedAttributeExtendedContentType()
    {
        OwnedAttributeExtendedContentTypeImpl ownedAttributeExtendedContentType = new OwnedAttributeExtendedContentTypeImpl();
        return ownedAttributeExtendedContentType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OwnedLiteralType createOwnedLiteralType()
    {
        OwnedLiteralTypeImpl ownedLiteralType = new OwnedLiteralTypeImpl();
        return ownedLiteralType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OwnedOperationType createOwnedOperationType()
    {
        OwnedOperationTypeImpl ownedOperationType = new OwnedOperationTypeImpl();
        return ownedOperationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OwnedParameterType createOwnedParameterType()
    {
        OwnedParameterTypeImpl ownedParameterType = new OwnedParameterTypeImpl();
        return ownedParameterType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackagedElementAssociationType createPackagedElementAssociationType()
    {
        PackagedElementAssociationTypeImpl packagedElementAssociationType = new PackagedElementAssociationTypeImpl();
        return packagedElementAssociationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackagedElementBaseType createPackagedElementBaseType()
    {
        PackagedElementBaseTypeImpl packagedElementBaseType = new PackagedElementBaseTypeImpl();
        return packagedElementBaseType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackagedElementInstanceSpecificationType createPackagedElementInstanceSpecificationType()
    {
        PackagedElementInstanceSpecificationTypeImpl packagedElementInstanceSpecificationType = new PackagedElementInstanceSpecificationTypeImpl();
        return packagedElementInstanceSpecificationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackagedElementPackageType createPackagedElementPackageType()
    {
        PackagedElementPackageTypeImpl packagedElementPackageType = new PackagedElementPackageTypeImpl();
        return packagedElementPackageType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackagedElementRelationType createPackagedElementRelationType()
    {
        PackagedElementRelationTypeImpl packagedElementRelationType = new PackagedElementRelationTypeImpl();
        return packagedElementRelationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackageImportType createPackageImportType()
    {
        PackageImportTypeImpl packageImportType = new PackageImportTypeImpl();
        return packageImportType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeType createTypeType()
    {
        TypeTypeImpl typeType = new TypeTypeImpl();
        return typeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlClassType createUmlClassType()
    {
        UmlClassTypeImpl umlClassType = new UmlClassTypeImpl();
        return umlClassType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlEnumerationType createUmlEnumerationType()
    {
        UmlEnumerationTypeImpl umlEnumerationType = new UmlEnumerationTypeImpl();
        return umlEnumerationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlInterfaceType createUmlInterfaceType()
    {
        UmlInterfaceTypeImpl umlInterfaceType = new UmlInterfaceTypeImpl();
        return umlInterfaceType;
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
    public VisibilityType createVisibilityTypeFromString(EDataType eDataType, String initialValue)
    {
        VisibilityType result = VisibilityType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertVisibilityTypeToString(EDataType eDataType, Object instanceValue)
    {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DirectionType createDirectionTypeObjectFromString(EDataType eDataType, String initialValue)
    {
        return createDirectionTypeFromString(UmlPackage.Literals.DIRECTION_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDirectionTypeObjectToString(EDataType eDataType, Object instanceValue)
    {
        return convertDirectionTypeToString(UmlPackage.Literals.DIRECTION_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VisibilityType createVisibilityTypeObjectFromString(EDataType eDataType, String initialValue)
    {
        return createVisibilityTypeFromString(UmlPackage.Literals.VISIBILITY_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertVisibilityTypeObjectToString(EDataType eDataType, Object instanceValue)
    {
        return convertVisibilityTypeToString(UmlPackage.Literals.VISIBILITY_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlPackage getUmlPackage()
    {
        return (UmlPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static UmlPackage getPackage()
    {
        return UmlPackage.eINSTANCE;
    }

} //UmlFactoryImpl
