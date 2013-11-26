/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.StereotypeAttributeType#getStereotype <em>Stereotype</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getStereotypeAttributeType()
 * @model extendedMetaData="name='stereotypeAttributeType' kind='empty'"
 * @generated
 */
public interface StereotypeAttributeType extends EObject
{
    /**
     * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
     * The literals are from the enumeration {@link xmei.StereotypeType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stereotype</em>' attribute.
     * @see xmei.StereotypeType
     * @see #isSetStereotype()
     * @see #unsetStereotype()
     * @see #setStereotype(StereotypeType)
     * @see xmei.XmeiPackage#getStereotypeAttributeType_Stereotype()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='stereotype'"
     * @generated
     */
    StereotypeType getStereotype();

    /**
     * Sets the value of the '{@link xmei.StereotypeAttributeType#getStereotype <em>Stereotype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stereotype</em>' attribute.
     * @see xmei.StereotypeType
     * @see #isSetStereotype()
     * @see #unsetStereotype()
     * @see #getStereotype()
     * @generated
     */
    void setStereotype(StereotypeType value);

    /**
     * Unsets the value of the '{@link xmei.StereotypeAttributeType#getStereotype <em>Stereotype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStereotype()
     * @see #getStereotype()
     * @see #setStereotype(StereotypeType)
     * @generated
     */
    void unsetStereotype();

    /**
     * Returns whether the value of the '{@link xmei.StereotypeAttributeType#getStereotype <em>Stereotype</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Stereotype</em>' attribute is set.
     * @see #unsetStereotype()
     * @see #getStereotype()
     * @see #setStereotype(StereotypeType)
     * @generated
     */
    boolean isSetStereotype();

} // StereotypeAttributeType
