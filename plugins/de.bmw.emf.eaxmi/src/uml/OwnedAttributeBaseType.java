/**
 */
package uml;

import org.eclipse.emf.ecore.EObject;

import xmei.TypeBaseType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owned Attribute Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.OwnedAttributeBaseType#getType <em>Type</em>}</li>
 *   <li>{@link uml.OwnedAttributeBaseType#getId <em>Id</em>}</li>
 *   <li>{@link uml.OwnedAttributeBaseType#getType1 <em>Type1</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getOwnedAttributeBaseType()
 * @model extendedMetaData="name='ownedAttributeBaseType' kind='elementOnly'"
 * @generated
 */
public interface OwnedAttributeBaseType extends EObject
{
    /**
     * Returns the value of the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' containment reference.
     * @see #setType(TypeType)
     * @see uml.UmlPackage#getOwnedAttributeBaseType_Type()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='type'"
     * @generated
     */
    TypeType getType();

    /**
     * Sets the value of the '{@link uml.OwnedAttributeBaseType#getType <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' containment reference.
     * @see #getType()
     * @generated
     */
    void setType(TypeType value);

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
     * @see uml.UmlPackage#getOwnedAttributeBaseType_Id()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='id' namespace='xmei.Franca2EA_XMI_Schema'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link uml.OwnedAttributeBaseType#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Type1</b></em>' attribute.
     * The default value is <code>"uml:Property"</code>.
     * The literals are from the enumeration {@link xmei.TypeBaseType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type1</em>' attribute.
     * @see xmei.TypeBaseType
     * @see #isSetType1()
     * @see #unsetType1()
     * @see #setType1(TypeBaseType)
     * @see uml.UmlPackage#getOwnedAttributeBaseType_Type1()
     * @model default="uml:Property" unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='type' namespace='xmei.Franca2EA_XMI_Schema'"
     * @generated
     */
    TypeBaseType getType1();

    /**
     * Sets the value of the '{@link uml.OwnedAttributeBaseType#getType1 <em>Type1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type1</em>' attribute.
     * @see xmei.TypeBaseType
     * @see #isSetType1()
     * @see #unsetType1()
     * @see #getType1()
     * @generated
     */
    void setType1(TypeBaseType value);

    /**
     * Unsets the value of the '{@link uml.OwnedAttributeBaseType#getType1 <em>Type1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType1()
     * @see #getType1()
     * @see #setType1(TypeBaseType)
     * @generated
     */
    void unsetType1();

    /**
     * Returns whether the value of the '{@link uml.OwnedAttributeBaseType#getType1 <em>Type1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type1</em>' attribute is set.
     * @see #unsetType1()
     * @see #getType1()
     * @see #setType1(TypeBaseType)
     * @generated
     */
    boolean isSetType1();

} // OwnedAttributeBaseType
