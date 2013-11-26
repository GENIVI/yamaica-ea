/**
 */
package uml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.TypeType#getHref <em>Href</em>}</li>
 *   <li>{@link uml.TypeType#getIdref <em>Idref</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getTypeType()
 * @model extendedMetaData="name='typeType' kind='empty'"
 * @generated
 */
public interface TypeType extends EObject
{
    /**
     * Returns the value of the '<em><b>Href</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Href</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Href</em>' attribute.
     * @see #setHref(String)
     * @see uml.UmlPackage#getTypeType_Href()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='href'"
     * @generated
     */
    String getHref();

    /**
     * Sets the value of the '{@link uml.TypeType#getHref <em>Href</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Href</em>' attribute.
     * @see #getHref()
     * @generated
     */
    void setHref(String value);

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
     * @see uml.UmlPackage#getTypeType_Idref()
     * @model dataType="xmei.IdType"
     *        extendedMetaData="kind='attribute' name='idref' namespace='xmei.Franca2EA_XMI_Schema'"
     * @generated
     */
    String getIdref();

    /**
     * Sets the value of the '{@link uml.TypeType#getIdref <em>Idref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Idref</em>' attribute.
     * @see #getIdref()
     * @generated
     */
    void setIdref(String value);

} // TypeType
