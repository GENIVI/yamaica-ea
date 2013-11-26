/**
 */
package uml;

import org.eclipse.emf.ecore.EObject;

import xmei.TypeBaseType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owned Literal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.OwnedLiteralType#getSpecification <em>Specification</em>}</li>
 *   <li>{@link uml.OwnedLiteralType#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link uml.OwnedLiteralType#getId <em>Id</em>}</li>
 *   <li>{@link uml.OwnedLiteralType#getName <em>Name</em>}</li>
 *   <li>{@link uml.OwnedLiteralType#getType <em>Type</em>}</li>
 *   <li>{@link uml.OwnedLiteralType#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getOwnedLiteralType()
 * @model extendedMetaData="name='ownedLiteralType' kind='elementOnly'"
 * @generated
 */
public interface OwnedLiteralType extends EObject
{
    /**
     * Returns the value of the '<em><b>Specification</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Specification</em>' containment reference.
     * @see #setSpecification(DefaultValueType)
     * @see uml.UmlPackage#getOwnedLiteralType_Specification()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='specification'"
     * @generated
     */
    DefaultValueType getSpecification();

    /**
     * Sets the value of the '{@link uml.OwnedLiteralType#getSpecification <em>Specification</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Specification</em>' containment reference.
     * @see #getSpecification()
     * @generated
     */
    void setSpecification(DefaultValueType value);

    /**
     * Returns the value of the '<em><b>Classifier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Classifier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Classifier</em>' attribute.
     * @see #setClassifier(String)
     * @see uml.UmlPackage#getOwnedLiteralType_Classifier()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='classifier'"
     * @generated
     */
    String getClassifier();

    /**
     * Sets the value of the '{@link uml.OwnedLiteralType#getClassifier <em>Classifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Classifier</em>' attribute.
     * @see #getClassifier()
     * @generated
     */
    void setClassifier(String value);

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see uml.UmlPackage#getOwnedLiteralType_Id()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='id' namespace='xmei.Franca2EA_XMI_Schema'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link uml.OwnedLiteralType#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see uml.UmlPackage#getOwnedLiteralType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link uml.OwnedLiteralType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link xmei.TypeBaseType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see xmei.TypeBaseType
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(TypeBaseType)
     * @see uml.UmlPackage#getOwnedLiteralType_Type()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='type' namespace='xmei.Franca2EA_XMI_Schema'"
     * @generated
     */
    TypeBaseType getType();

    /**
     * Sets the value of the '{@link uml.OwnedLiteralType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see xmei.TypeBaseType
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType(TypeBaseType value);

    /**
     * Unsets the value of the '{@link uml.OwnedLiteralType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(TypeBaseType)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link uml.OwnedLiteralType#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(TypeBaseType)
     * @generated
     */
    boolean isSetType();

    /**
     * Returns the value of the '<em><b>Visibility</b></em>' attribute.
     * The literals are from the enumeration {@link uml.VisibilityType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Visibility</em>' attribute.
     * @see uml.VisibilityType
     * @see #isSetVisibility()
     * @see #unsetVisibility()
     * @see #setVisibility(VisibilityType)
     * @see uml.UmlPackage#getOwnedLiteralType_Visibility()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='visibility'"
     * @generated
     */
    VisibilityType getVisibility();

    /**
     * Sets the value of the '{@link uml.OwnedLiteralType#getVisibility <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Visibility</em>' attribute.
     * @see uml.VisibilityType
     * @see #isSetVisibility()
     * @see #unsetVisibility()
     * @see #getVisibility()
     * @generated
     */
    void setVisibility(VisibilityType value);

    /**
     * Unsets the value of the '{@link uml.OwnedLiteralType#getVisibility <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVisibility()
     * @see #getVisibility()
     * @see #setVisibility(VisibilityType)
     * @generated
     */
    void unsetVisibility();

    /**
     * Returns whether the value of the '{@link uml.OwnedLiteralType#getVisibility <em>Visibility</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Visibility</em>' attribute is set.
     * @see #unsetVisibility()
     * @see #getVisibility()
     * @see #setVisibility(VisibilityType)
     * @generated
     */
    boolean isSetVisibility();

} // OwnedLiteralType
