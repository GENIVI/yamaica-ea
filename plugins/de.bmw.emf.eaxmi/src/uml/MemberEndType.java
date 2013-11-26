/**
 */
package uml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member End Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.MemberEndType#getIdref <em>Idref</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getMemberEndType()
 * @model extendedMetaData="name='memberEndType' kind='empty'"
 * @generated
 */
public interface MemberEndType extends EObject
{
    /**
     * Returns the value of the '<em><b>Idref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Idref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Idref</em>' attribute.
     * @see #setIdref(String)
     * @see uml.UmlPackage#getMemberEndType_Idref()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='idref' namespace='xmei.Franca2EA_XMI_Schema'"
     * @generated
     */
    String getIdref();

    /**
     * Sets the value of the '{@link uml.MemberEndType#getIdref <em>Idref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Idref</em>' attribute.
     * @see #getIdref()
     * @generated
     */
    void setIdref(String value);

} // MemberEndType
