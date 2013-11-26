/**
 */
package xmei;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.OperationsType#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getOperationsType()
 * @model extendedMetaData="name='operationsType' kind='elementOnly'"
 * @generated
 */
public interface OperationsType extends EObject
{
    /**
     * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
     * The list contents are of type {@link xmei.OperationType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation</em>' containment reference list.
     * @see xmei.XmeiPackage#getOperationsType_Operation()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='operation'"
     * @generated
     */
    EList<OperationType> getOperation();

} // OperationsType
