/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

import uml.ModelType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XMI Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.XMIType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link xmei.XMIType#getModel <em>Model</em>}</li>
 *   <li>{@link xmei.XMIType#getExtension <em>Extension</em>}</li>
 *   <li>{@link xmei.XMIType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getXMIType()
 * @model extendedMetaData="name='XMI_._type' kind='elementOnly'"
 * @generated
 */
public interface XMIType extends EObject
{
    /**
     * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Documentation</em>' containment reference.
     * @see #setDocumentation(Documentation)
     * @see xmei.XmeiPackage#getXMIType_Documentation()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace'"
     * @generated
     */
    Documentation getDocumentation();

    /**
     * Sets the value of the '{@link xmei.XMIType#getDocumentation <em>Documentation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Documentation</em>' containment reference.
     * @see #getDocumentation()
     * @generated
     */
    void setDocumentation(Documentation value);

    /**
     * Returns the value of the '<em><b>Model</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' containment reference.
     * @see #setModel(ModelType)
     * @see xmei.XmeiPackage#getXMIType_Model()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='Model' namespace='uml.Franca2EA_UML_Schema'"
     * @generated
     */
    ModelType getModel();

    /**
     * Sets the value of the '{@link xmei.XMIType#getModel <em>Model</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' containment reference.
     * @see #getModel()
     * @generated
     */
    void setModel(ModelType value);

    /**
     * Returns the value of the '<em><b>Extension</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extension</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extension</em>' containment reference.
     * @see #setExtension(Extension)
     * @see xmei.XmeiPackage#getXMIType_Extension()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='Extension' namespace='##targetNamespace'"
     * @generated
     */
    Extension getExtension();

    /**
     * Sets the value of the '{@link xmei.XMIType#getExtension <em>Extension</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Extension</em>' containment reference.
     * @see #getExtension()
     * @generated
     */
    void setExtension(Extension value);

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * The default value is <code>"2.1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see #isSetVersion()
     * @see #unsetVersion()
     * @see #setVersion(String)
     * @see xmei.XmeiPackage#getXMIType_Version()
     * @model default="2.1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='version' namespace='##targetNamespace'"
     * @generated
     */
    String getVersion();

    /**
     * Sets the value of the '{@link xmei.XMIType#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #isSetVersion()
     * @see #unsetVersion()
     * @see #getVersion()
     * @generated
     */
    void setVersion(String value);

    /**
     * Unsets the value of the '{@link xmei.XMIType#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVersion()
     * @see #getVersion()
     * @see #setVersion(String)
     * @generated
     */
    void unsetVersion();

    /**
     * Returns whether the value of the '{@link xmei.XMIType#getVersion <em>Version</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Version</em>' attribute is set.
     * @see #unsetVersion()
     * @see #getVersion()
     * @see #setVersion(String)
     * @generated
     */
    boolean isSetVersion();

} // XMIType
