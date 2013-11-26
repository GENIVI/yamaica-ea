/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.ConcreteLinkType#getEnd <em>End</em>}</li>
 *   <li>{@link xmei.ConcreteLinkType#getId <em>Id</em>}</li>
 *   <li>{@link xmei.ConcreteLinkType#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getConcreteLinkType()
 * @model extendedMetaData="name='concreteLinkType' kind='empty'"
 * @generated
 */
public interface ConcreteLinkType extends EObject
{
    /**
     * Returns the value of the '<em><b>End</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End</em>' attribute.
     * @see #setEnd(String)
     * @see xmei.XmeiPackage#getConcreteLinkType_End()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='end'"
     * @generated
     */
    String getEnd();

    /**
     * Sets the value of the '{@link xmei.ConcreteLinkType#getEnd <em>End</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End</em>' attribute.
     * @see #getEnd()
     * @generated
     */
    void setEnd(String value);

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see xmei.XmeiPackage#getConcreteLinkType_Id()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link xmei.ConcreteLinkType#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Start</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Start</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Start</em>' attribute.
     * @see #setStart(String)
     * @see xmei.XmeiPackage#getConcreteLinkType_Start()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='start'"
     * @generated
     */
    String getStart();

    /**
     * Sets the value of the '{@link xmei.ConcreteLinkType#getStart <em>Start</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Start</em>' attribute.
     * @see #getStart()
     * @generated
     */
    void setStart(String value);

} // ConcreteLinkType
