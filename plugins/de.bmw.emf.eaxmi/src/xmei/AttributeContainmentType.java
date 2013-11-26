/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Containment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.AttributeContainmentType#getContainment <em>Containment</em>}</li>
 *   <li>{@link xmei.AttributeContainmentType#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getAttributeContainmentType()
 * @model extendedMetaData="name='attributeContainmentType' kind='empty'"
 * @generated
 */
public interface AttributeContainmentType extends EObject
{
    /**
     * Returns the value of the '<em><b>Containment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Containment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Containment</em>' attribute.
     * @see #setContainment(String)
     * @see xmei.XmeiPackage#getAttributeContainmentType_Containment()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='containment'"
     * @generated
     */
    String getContainment();

    /**
     * Sets the value of the '{@link xmei.AttributeContainmentType#getContainment <em>Containment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Containment</em>' attribute.
     * @see #getContainment()
     * @generated
     */
    void setContainment(String value);

    /**
     * Returns the value of the '<em><b>Position</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Position</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Position</em>' attribute.
     * @see #isSetPosition()
     * @see #unsetPosition()
     * @see #setPosition(int)
     * @see xmei.XmeiPackage#getAttributeContainmentType_Position()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
     *        extendedMetaData="kind='attribute' name='position'"
     * @generated
     */
    int getPosition();

    /**
     * Sets the value of the '{@link xmei.AttributeContainmentType#getPosition <em>Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Position</em>' attribute.
     * @see #isSetPosition()
     * @see #unsetPosition()
     * @see #getPosition()
     * @generated
     */
    void setPosition(int value);

    /**
     * Unsets the value of the '{@link xmei.AttributeContainmentType#getPosition <em>Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPosition()
     * @see #getPosition()
     * @see #setPosition(int)
     * @generated
     */
    void unsetPosition();

    /**
     * Returns whether the value of the '{@link xmei.AttributeContainmentType#getPosition <em>Position</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Position</em>' attribute is set.
     * @see #unsetPosition()
     * @see #getPosition()
     * @see #setPosition(int)
     * @generated
     */
    boolean isSetPosition();

} // AttributeContainmentType
