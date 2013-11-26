/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.CodeType#getGentype <em>Gentype</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getCodeType()
 * @model extendedMetaData="name='codeType' kind='empty'"
 * @generated
 */
public interface CodeType extends EObject
{
    /**
     * Returns the value of the '<em><b>Gentype</b></em>' attribute.
     * The default value is <code>"FrancaIDL"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gentype</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gentype</em>' attribute.
     * @see #isSetGentype()
     * @see #unsetGentype()
     * @see #setGentype(String)
     * @see xmei.XmeiPackage#getCodeType_Gentype()
     * @model default="FrancaIDL" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='gentype'"
     * @generated
     */
    String getGentype();

    /**
     * Sets the value of the '{@link xmei.CodeType#getGentype <em>Gentype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gentype</em>' attribute.
     * @see #isSetGentype()
     * @see #unsetGentype()
     * @see #getGentype()
     * @generated
     */
    void setGentype(String value);

    /**
     * Unsets the value of the '{@link xmei.CodeType#getGentype <em>Gentype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGentype()
     * @see #getGentype()
     * @see #setGentype(String)
     * @generated
     */
    void unsetGentype();

    /**
     * Returns whether the value of the '{@link xmei.CodeType#getGentype <em>Gentype</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gentype</em>' attribute is set.
     * @see #unsetGentype()
     * @see #getGentype()
     * @see #setGentype(String)
     * @generated
     */
    boolean isSetGentype();

} // CodeType
