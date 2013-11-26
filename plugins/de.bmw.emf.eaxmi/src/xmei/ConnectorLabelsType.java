/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Labels Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.ConnectorLabelsType#getLb <em>Lb</em>}</li>
 *   <li>{@link xmei.ConnectorLabelsType#getMb <em>Mb</em>}</li>
 *   <li>{@link xmei.ConnectorLabelsType#getMt <em>Mt</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getConnectorLabelsType()
 * @model extendedMetaData="name='connectorLabelsType' kind='empty'"
 * @generated
 */
public interface ConnectorLabelsType extends EObject
{
    /**
     * Returns the value of the '<em><b>Lb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lb</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lb</em>' attribute.
     * @see #setLb(String)
     * @see xmei.XmeiPackage#getConnectorLabelsType_Lb()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='lb'"
     * @generated
     */
    String getLb();

    /**
     * Sets the value of the '{@link xmei.ConnectorLabelsType#getLb <em>Lb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lb</em>' attribute.
     * @see #getLb()
     * @generated
     */
    void setLb(String value);

    /**
     * Returns the value of the '<em><b>Mb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mb</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mb</em>' attribute.
     * @see #setMb(String)
     * @see xmei.XmeiPackage#getConnectorLabelsType_Mb()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='mb'"
     * @generated
     */
    String getMb();

    /**
     * Sets the value of the '{@link xmei.ConnectorLabelsType#getMb <em>Mb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mb</em>' attribute.
     * @see #getMb()
     * @generated
     */
    void setMb(String value);

    /**
     * Returns the value of the '<em><b>Mt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mt</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mt</em>' attribute.
     * @see #setMt(String)
     * @see xmei.XmeiPackage#getConnectorLabelsType_Mt()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='mt'"
     * @generated
     */
    String getMt();

    /**
     * Sets the value of the '{@link xmei.ConnectorLabelsType#getMt <em>Mt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mt</em>' attribute.
     * @see #getMt()
     * @generated
     */
    void setMt(String value);

} // ConnectorLabelsType
