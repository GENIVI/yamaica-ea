/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.ConnectorModelType#getEaLocalid <em>Ea Localid</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getConnectorModelType()
 * @model extendedMetaData="name='connectorModelType' kind='empty'"
 * @generated
 */
public interface ConnectorModelType extends EObject
{
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
     * @see xmei.XmeiPackage#getConnectorModelType_EaLocalid()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
     *        extendedMetaData="kind='attribute' name='ea_localid'"
     * @generated
     */
    int getEaLocalid();

    /**
     * Sets the value of the '{@link xmei.ConnectorModelType#getEaLocalid <em>Ea Localid</em>}' attribute.
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
     * Unsets the value of the '{@link xmei.ConnectorModelType#getEaLocalid <em>Ea Localid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEaLocalid()
     * @see #getEaLocalid()
     * @see #setEaLocalid(int)
     * @generated
     */
    void unsetEaLocalid();

    /**
     * Returns whether the value of the '{@link xmei.ConnectorModelType#getEaLocalid <em>Ea Localid</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ea Localid</em>' attribute is set.
     * @see #unsetEaLocalid()
     * @see #getEaLocalid()
     * @see #setEaLocalid(int)
     * @generated
     */
    boolean isSetEaLocalid();

} // ConnectorModelType
