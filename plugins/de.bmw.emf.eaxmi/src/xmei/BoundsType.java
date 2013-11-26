/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounds Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.BoundsType#getLower <em>Lower</em>}</li>
 *   <li>{@link xmei.BoundsType#getUpper <em>Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getBoundsType()
 * @model extendedMetaData="name='boundsType' kind='empty'"
 * @generated
 */
public interface BoundsType extends EObject
{
    /**
     * Returns the value of the '<em><b>Lower</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lower</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lower</em>' attribute.
     * @see #isSetLower()
     * @see #unsetLower()
     * @see #setLower(int)
     * @see xmei.XmeiPackage#getBoundsType_Lower()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
     *        extendedMetaData="kind='attribute' name='lower'"
     * @generated
     */
    int getLower();

    /**
     * Sets the value of the '{@link xmei.BoundsType#getLower <em>Lower</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lower</em>' attribute.
     * @see #isSetLower()
     * @see #unsetLower()
     * @see #getLower()
     * @generated
     */
    void setLower(int value);

    /**
     * Unsets the value of the '{@link xmei.BoundsType#getLower <em>Lower</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLower()
     * @see #getLower()
     * @see #setLower(int)
     * @generated
     */
    void unsetLower();

    /**
     * Returns whether the value of the '{@link xmei.BoundsType#getLower <em>Lower</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lower</em>' attribute is set.
     * @see #unsetLower()
     * @see #getLower()
     * @see #setLower(int)
     * @generated
     */
    boolean isSetLower();

    /**
     * Returns the value of the '<em><b>Upper</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Upper</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Upper</em>' attribute.
     * @see #setUpper(String)
     * @see xmei.XmeiPackage#getBoundsType_Upper()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='upper'"
     * @generated
     */
    String getUpper();

    /**
     * Sets the value of the '{@link xmei.BoundsType#getUpper <em>Upper</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Upper</em>' attribute.
     * @see #getUpper()
     * @generated
     */
    void setUpper(String value);

} // BoundsType
