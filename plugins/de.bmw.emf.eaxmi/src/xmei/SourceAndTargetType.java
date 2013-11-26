/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source And Target Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.SourceAndTargetType#getModel <em>Model</em>}</li>
 *   <li>{@link xmei.SourceAndTargetType#getRole <em>Role</em>}</li>
 *   <li>{@link xmei.SourceAndTargetType#getType <em>Type</em>}</li>
 *   <li>{@link xmei.SourceAndTargetType#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link xmei.SourceAndTargetType#getStyle <em>Style</em>}</li>
 *   <li>{@link xmei.SourceAndTargetType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link xmei.SourceAndTargetType#getXrefs <em>Xrefs</em>}</li>
 *   <li>{@link xmei.SourceAndTargetType#getTags <em>Tags</em>}</li>
 *   <li>{@link xmei.SourceAndTargetType#getIdref <em>Idref</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getSourceAndTargetType()
 * @model extendedMetaData="name='sourceAndTargetType' kind='elementOnly'"
 * @generated
 */
public interface SourceAndTargetType extends EObject
{
    /**
     * Returns the value of the '<em><b>Model</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' containment reference.
     * @see #setModel(SourceAndTargetModelType)
     * @see xmei.XmeiPackage#getSourceAndTargetType_Model()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='model'"
     * @generated
     */
    SourceAndTargetModelType getModel();

    /**
     * Sets the value of the '{@link xmei.SourceAndTargetType#getModel <em>Model</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' containment reference.
     * @see #getModel()
     * @generated
     */
    void setModel(SourceAndTargetModelType value);

    /**
     * Returns the value of the '<em><b>Role</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Role</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Role</em>' containment reference.
     * @see #setRole(SourceAndTargetRoleType)
     * @see xmei.XmeiPackage#getSourceAndTargetType_Role()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='role'"
     * @generated
     */
    SourceAndTargetRoleType getRole();

    /**
     * Sets the value of the '{@link xmei.SourceAndTargetType#getRole <em>Role</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Role</em>' containment reference.
     * @see #getRole()
     * @generated
     */
    void setRole(SourceAndTargetRoleType value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' containment reference.
     * @see #setType(SourceAndTargetTypeType)
     * @see xmei.XmeiPackage#getSourceAndTargetType_Type()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='type'"
     * @generated
     */
    SourceAndTargetTypeType getType();

    /**
     * Sets the value of the '{@link xmei.SourceAndTargetType#getType <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' containment reference.
     * @see #getType()
     * @generated
     */
    void setType(SourceAndTargetTypeType value);

    /**
     * Returns the value of the '<em><b>Modifiers</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modifiers</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modifiers</em>' containment reference.
     * @see #setModifiers(ConnectorModifiersType)
     * @see xmei.XmeiPackage#getSourceAndTargetType_Modifiers()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='modifiers'"
     * @generated
     */
    ConnectorModifiersType getModifiers();

    /**
     * Sets the value of the '{@link xmei.SourceAndTargetType#getModifiers <em>Modifiers</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Modifiers</em>' containment reference.
     * @see #getModifiers()
     * @generated
     */
    void setModifiers(ConnectorModifiersType value);

    /**
     * Returns the value of the '<em><b>Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Style</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Style</em>' containment reference.
     * @see #setStyle(DocumentationType)
     * @see xmei.XmeiPackage#getSourceAndTargetType_Style()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='style'"
     * @generated
     */
    DocumentationType getStyle();

    /**
     * Sets the value of the '{@link xmei.SourceAndTargetType#getStyle <em>Style</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Style</em>' containment reference.
     * @see #getStyle()
     * @generated
     */
    void setStyle(DocumentationType value);

    /**
     * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Documentation</em>' containment reference.
     * @see #setDocumentation(DocumentationType)
     * @see xmei.XmeiPackage#getSourceAndTargetType_Documentation()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='documentation'"
     * @generated
     */
    DocumentationType getDocumentation();

    /**
     * Sets the value of the '{@link xmei.SourceAndTargetType#getDocumentation <em>Documentation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Documentation</em>' containment reference.
     * @see #getDocumentation()
     * @generated
     */
    void setDocumentation(DocumentationType value);

    /**
     * Returns the value of the '<em><b>Xrefs</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xrefs</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xrefs</em>' containment reference.
     * @see #setXrefs(XrefsType)
     * @see xmei.XmeiPackage#getSourceAndTargetType_Xrefs()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='xrefs'"
     * @generated
     */
    XrefsType getXrefs();

    /**
     * Sets the value of the '{@link xmei.SourceAndTargetType#getXrefs <em>Xrefs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xrefs</em>' containment reference.
     * @see #getXrefs()
     * @generated
     */
    void setXrefs(XrefsType value);

    /**
     * Returns the value of the '<em><b>Tags</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tags</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tags</em>' containment reference.
     * @see #setTags(OperationTagsType)
     * @see xmei.XmeiPackage#getSourceAndTargetType_Tags()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='tags'"
     * @generated
     */
    OperationTagsType getTags();

    /**
     * Sets the value of the '{@link xmei.SourceAndTargetType#getTags <em>Tags</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tags</em>' containment reference.
     * @see #getTags()
     * @generated
     */
    void setTags(OperationTagsType value);

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
     * @see xmei.XmeiPackage#getSourceAndTargetType_Idref()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='idref' namespace='##targetNamespace'"
     * @generated
     */
    String getIdref();

    /**
     * Sets the value of the '{@link xmei.SourceAndTargetType#getIdref <em>Idref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Idref</em>' attribute.
     * @see #getIdref()
     * @generated
     */
    void setIdref(String value);

} // SourceAndTargetType
