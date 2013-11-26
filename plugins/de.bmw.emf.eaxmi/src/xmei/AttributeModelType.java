/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.AttributeModelType#getEaGuid <em>Ea Guid</em>}</li>
 *   <li>{@link xmei.AttributeModelType#getEaLocalid <em>Ea Localid</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getAttributeModelType()
 * @model extendedMetaData="name='attributeModelType' kind='empty'"
 * @generated
 */
public interface AttributeModelType extends EObject
{
    /**
     * Returns the value of the '<em><b>Ea Guid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ea Guid</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ea Guid</em>' attribute.
     * @see #setEaGuid(String)
     * @see xmei.XmeiPackage#getAttributeModelType_EaGuid()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='ea_guid'"
     * @generated
     */
    String getEaGuid();

    /**
     * Sets the value of the '{@link xmei.AttributeModelType#getEaGuid <em>Ea Guid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ea Guid</em>' attribute.
     * @see #getEaGuid()
     * @generated
     */
    void setEaGuid(String value);

    /**
     * Returns the value of the '<em><b>Ea Localid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ea Localid</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ea Localid</em>' attribute.
     * @see #isSetEaLocalid()
     * @see #unsetEaLocalid()
     * @see #setEaLocalid(int)
     * @see xmei.XmeiPackage#getAttributeModelType_EaLocalid()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
     *        extendedMetaData="kind='attribute' name='ea_localid'"
     * @generated
     */
    int getEaLocalid();

    /**
     * Sets the value of the '{@link xmei.AttributeModelType#getEaLocalid <em>Ea Localid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ea Localid</em>' attribute.
     * @see #isSetEaLocalid()
     * @see #unsetEaLocalid()
     * @see #getEaLocalid()
     * @generated
     */
    void setEaLocalid(int value);

    /**
     * Unsets the value of the '{@link xmei.AttributeModelType#getEaLocalid <em>Ea Localid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEaLocalid()
     * @see #getEaLocalid()
     * @see #setEaLocalid(int)
     * @generated
     */
    void unsetEaLocalid();

    /**
     * Returns whether the value of the '{@link xmei.AttributeModelType#getEaLocalid <em>Ea Localid</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ea Localid</em>' attribute is set.
     * @see #unsetEaLocalid()
     * @see #getEaLocalid()
     * @see #setEaLocalid(int)
     * @generated
     */
    boolean isSetEaLocalid();

} // AttributeModelType
