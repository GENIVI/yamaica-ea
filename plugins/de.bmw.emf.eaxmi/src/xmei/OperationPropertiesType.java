/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.OperationPropertiesType#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getOperationPropertiesType()
 * @model extendedMetaData="name='operationPropertiesType' kind='empty'"
 * @generated
 */
public interface OperationPropertiesType extends EObject
{
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
     * @see xmei.XmeiPackage#getOperationPropertiesType_Position()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
     *        extendedMetaData="kind='attribute' name='position'"
     * @generated
     */
    int getPosition();

    /**
     * Sets the value of the '{@link xmei.OperationPropertiesType#getPosition <em>Position</em>}' attribute.
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
     * Unsets the value of the '{@link xmei.OperationPropertiesType#getPosition <em>Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPosition()
     * @see #getPosition()
     * @see #setPosition(int)
     * @generated
     */
    void unsetPosition();

    /**
     * Returns whether the value of the '{@link xmei.OperationPropertiesType#getPosition <em>Position</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Position</em>' attribute is set.
     * @see #unsetPosition()
     * @see #getPosition()
     * @see #setPosition(int)
     * @generated
     */
    boolean isSetPosition();

} // OperationPropertiesType
