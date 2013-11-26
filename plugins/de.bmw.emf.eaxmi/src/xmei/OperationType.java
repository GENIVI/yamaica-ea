/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

import uml.VisibilityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.OperationType#getProperties <em>Properties</em>}</li>
 *   <li>{@link xmei.OperationType#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link xmei.OperationType#getModel <em>Model</em>}</li>
 *   <li>{@link xmei.OperationType#getType <em>Type</em>}</li>
 *   <li>{@link xmei.OperationType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link xmei.OperationType#getTags <em>Tags</em>}</li>
 *   <li>{@link xmei.OperationType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link xmei.OperationType#getXrefs <em>Xrefs</em>}</li>
 *   <li>{@link xmei.OperationType#getIdref <em>Idref</em>}</li>
 *   <li>{@link xmei.OperationType#getName <em>Name</em>}</li>
 *   <li>{@link xmei.OperationType#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getOperationType()
 * @model extendedMetaData="name='operationType' kind='elementOnly'"
 * @generated
 */
public interface OperationType extends EObject
{
    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference.
     * @see #setProperties(OperationPropertiesType)
     * @see xmei.XmeiPackage#getOperationType_Properties()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='properties'"
     * @generated
     */
    OperationPropertiesType getProperties();

    /**
     * Sets the value of the '{@link xmei.OperationType#getProperties <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Properties</em>' containment reference.
     * @see #getProperties()
     * @generated
     */
    void setProperties(OperationPropertiesType value);

    /**
     * Returns the value of the '<em><b>Stereotype</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stereotype</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stereotype</em>' containment reference.
     * @see #setStereotype(StereotypeAttributeType)
     * @see xmei.XmeiPackage#getOperationType_Stereotype()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='stereotype'"
     * @generated
     */
    StereotypeAttributeType getStereotype();

    /**
     * Sets the value of the '{@link xmei.OperationType#getStereotype <em>Stereotype</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stereotype</em>' containment reference.
     * @see #getStereotype()
     * @generated
     */
    void setStereotype(StereotypeAttributeType value);

    /**
     * Returns the value of the '<em><b>Model</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' containment reference.
     * @see #setModel(AttributeModelType)
     * @see xmei.XmeiPackage#getOperationType_Model()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='model'"
     * @generated
     */
    AttributeModelType getModel();

    /**
     * Sets the value of the '{@link xmei.OperationType#getModel <em>Model</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' containment reference.
     * @see #getModel()
     * @generated
     */
    void setModel(AttributeModelType value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' containment reference.
     * @see #setType(OperationTypeType)
     * @see xmei.XmeiPackage#getOperationType_Type()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='type'"
     * @generated
     */
    OperationTypeType getType();

    /**
     * Sets the value of the '{@link xmei.OperationType#getType <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' containment reference.
     * @see #getType()
     * @generated
     */
    void setType(OperationTypeType value);

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
     * @see xmei.XmeiPackage#getOperationType_Documentation()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='documentation'"
     * @generated
     */
    DocumentationType getDocumentation();

    /**
     * Sets the value of the '{@link xmei.OperationType#getDocumentation <em>Documentation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Documentation</em>' containment reference.
     * @see #getDocumentation()
     * @generated
     */
    void setDocumentation(DocumentationType value);

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
     * @see xmei.XmeiPackage#getOperationType_Tags()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='tags'"
     * @generated
     */
    OperationTagsType getTags();

    /**
     * Sets the value of the '{@link xmei.OperationType#getTags <em>Tags</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tags</em>' containment reference.
     * @see #getTags()
     * @generated
     */
    void setTags(OperationTagsType value);

    /**
     * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameters</em>' containment reference.
     * @see #setParameters(OperationParametersType)
     * @see xmei.XmeiPackage#getOperationType_Parameters()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='parameters'"
     * @generated
     */
    OperationParametersType getParameters();

    /**
     * Sets the value of the '{@link xmei.OperationType#getParameters <em>Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parameters</em>' containment reference.
     * @see #getParameters()
     * @generated
     */
    void setParameters(OperationParametersType value);

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
     * @see xmei.XmeiPackage#getOperationType_Xrefs()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='xrefs'"
     * @generated
     */
    XrefsType getXrefs();

    /**
     * Sets the value of the '{@link xmei.OperationType#getXrefs <em>Xrefs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xrefs</em>' containment reference.
     * @see #getXrefs()
     * @generated
     */
    void setXrefs(XrefsType value);

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
     * @see xmei.XmeiPackage#getOperationType_Idref()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='idref' namespace='##targetNamespace'"
     * @generated
     */
    String getIdref();

    /**
     * Sets the value of the '{@link xmei.OperationType#getIdref <em>Idref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Idref</em>' attribute.
     * @see #getIdref()
     * @generated
     */
    void setIdref(String value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see xmei.XmeiPackage#getOperationType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link xmei.OperationType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Scope</b></em>' attribute.
     * The literals are from the enumeration {@link uml.VisibilityType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scope</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scope</em>' attribute.
     * @see uml.VisibilityType
     * @see #isSetScope()
     * @see #unsetScope()
     * @see #setScope(VisibilityType)
     * @see xmei.XmeiPackage#getOperationType_Scope()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='scope'"
     * @generated
     */
    VisibilityType getScope();

    /**
     * Sets the value of the '{@link xmei.OperationType#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scope</em>' attribute.
     * @see uml.VisibilityType
     * @see #isSetScope()
     * @see #unsetScope()
     * @see #getScope()
     * @generated
     */
    void setScope(VisibilityType value);

    /**
     * Unsets the value of the '{@link xmei.OperationType#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScope()
     * @see #getScope()
     * @see #setScope(VisibilityType)
     * @generated
     */
    void unsetScope();

    /**
     * Returns whether the value of the '{@link xmei.OperationType#getScope <em>Scope</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scope</em>' attribute is set.
     * @see #unsetScope()
     * @see #getScope()
     * @see #setScope(VisibilityType)
     * @generated
     */
    boolean isSetScope();

} // OperationType
