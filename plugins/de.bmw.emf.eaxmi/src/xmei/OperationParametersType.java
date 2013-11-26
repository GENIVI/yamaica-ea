/**
 */
package xmei;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.OperationParametersType#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getOperationParametersType()
 * @model extendedMetaData="name='operationParametersType' kind='elementOnly'"
 * @generated
 */
public interface OperationParametersType extends EObject
{
    /**
     * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
     * The list contents are of type {@link xmei.ParameterType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter</em>' containment reference list.
     * @see xmei.XmeiPackage#getOperationParametersType_Parameter()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='parameter'"
     * @generated
     */
    EList<ParameterType> getParameter();

} // OperationParametersType
