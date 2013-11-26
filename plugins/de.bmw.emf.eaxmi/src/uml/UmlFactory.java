/**
 */
package uml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uml.UmlPackage
 * @generated
 */
public interface UmlFactory extends EFactory
{
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    UmlFactory eINSTANCE = uml.impl.UmlFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Default Value Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Default Value Type</em>'.
     * @generated
     */
    DefaultValueType createDefaultValueType();

    /**
     * Returns a new object of class '<em>Document Root</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Document Root</em>'.
     * @generated
     */
    DocumentRoot createDocumentRoot();

    /**
     * Returns a new object of class '<em>Generalization Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Generalization Type</em>'.
     * @generated
     */
    GeneralizationType createGeneralizationType();

    /**
     * Returns a new object of class '<em>Member End Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Member End Type</em>'.
     * @generated
     */
    MemberEndType createMemberEndType();

    /**
     * Returns a new object of class '<em>Model Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Model Type</em>'.
     * @generated
     */
    ModelType createModelType();

    /**
     * Returns a new object of class '<em>Multiplicity Value Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Multiplicity Value Type</em>'.
     * @generated
     */
    MultiplicityValueType createMultiplicityValueType();

    /**
     * Returns a new object of class '<em>Owned Attribute Base Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Owned Attribute Base Type</em>'.
     * @generated
     */
    OwnedAttributeBaseType createOwnedAttributeBaseType();

    /**
     * Returns a new object of class '<em>Owned Attribute Extended Attributes Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Owned Attribute Extended Attributes Type</em>'.
     * @generated
     */
    OwnedAttributeExtendedAttributesType createOwnedAttributeExtendedAttributesType();

    /**
     * Returns a new object of class '<em>Owned Attribute Extended Content Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Owned Attribute Extended Content Type</em>'.
     * @generated
     */
    OwnedAttributeExtendedContentType createOwnedAttributeExtendedContentType();

    /**
     * Returns a new object of class '<em>Owned Literal Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Owned Literal Type</em>'.
     * @generated
     */
    OwnedLiteralType createOwnedLiteralType();

    /**
     * Returns a new object of class '<em>Owned Operation Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Owned Operation Type</em>'.
     * @generated
     */
    OwnedOperationType createOwnedOperationType();

    /**
     * Returns a new object of class '<em>Owned Parameter Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Owned Parameter Type</em>'.
     * @generated
     */
    OwnedParameterType createOwnedParameterType();

    /**
     * Returns a new object of class '<em>Packaged Element Association Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Packaged Element Association Type</em>'.
     * @generated
     */
    PackagedElementAssociationType createPackagedElementAssociationType();

    /**
     * Returns a new object of class '<em>Packaged Element Base Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Packaged Element Base Type</em>'.
     * @generated
     */
    PackagedElementBaseType createPackagedElementBaseType();

    /**
     * Returns a new object of class '<em>Packaged Element Instance Specification Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Packaged Element Instance Specification Type</em>'.
     * @generated
     */
    PackagedElementInstanceSpecificationType createPackagedElementInstanceSpecificationType();

    /**
     * Returns a new object of class '<em>Packaged Element Package Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Packaged Element Package Type</em>'.
     * @generated
     */
    PackagedElementPackageType createPackagedElementPackageType();

    /**
     * Returns a new object of class '<em>Packaged Element Relation Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Packaged Element Relation Type</em>'.
     * @generated
     */
    PackagedElementRelationType createPackagedElementRelationType();

    /**
     * Returns a new object of class '<em>Package Import Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Package Import Type</em>'.
     * @generated
     */
    PackageImportType createPackageImportType();

    /**
     * Returns a new object of class '<em>Type Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Type Type</em>'.
     * @generated
     */
    TypeType createTypeType();

    /**
     * Returns a new object of class '<em>Class Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Class Type</em>'.
     * @generated
     */
    UmlClassType createUmlClassType();

    /**
     * Returns a new object of class '<em>Enumeration Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enumeration Type</em>'.
     * @generated
     */
    UmlEnumerationType createUmlEnumerationType();

    /**
     * Returns a new object of class '<em>Interface Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interface Type</em>'.
     * @generated
     */
    UmlInterfaceType createUmlInterfaceType();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    UmlPackage getUmlPackage();

} //UmlFactory
