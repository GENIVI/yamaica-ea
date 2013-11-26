/**
 */
package xmei;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectors Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.ConnectorsType#getConnector <em>Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getConnectorsType()
 * @model extendedMetaData="name='connectorsType' kind='elementOnly'"
 * @generated
 */
public interface ConnectorsType extends EObject
{
    /**
     * Returns the value of the '<em><b>Connector</b></em>' containment reference list.
     * The list contents are of type {@link xmei.ConnectorType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connector</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connector</em>' containment reference list.
     * @see xmei.XmeiPackage#getConnectorsType_Connector()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='connector'"
     * @generated
     */
    EList<ConnectorType> getConnector();

} // ConnectorsType
