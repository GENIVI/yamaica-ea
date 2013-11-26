/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

import uml.VisibilityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.ElementType#getModel <em>Model</em>}</li>
 *   <li>{@link xmei.ElementType#getProperties <em>Properties</em>}</li>
 *   <li>{@link xmei.ElementType#getProject <em>Project</em>}</li>
 *   <li>{@link xmei.ElementType#getCode <em>Code</em>}</li>
 *   <li>{@link xmei.ElementType#getLinks <em>Links</em>}</li>
 *   <li>{@link xmei.ElementType#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link xmei.ElementType#getOperations <em>Operations</em>}</li>
 *   <li>{@link xmei.ElementType#getIdref <em>Idref</em>}</li>
 *   <li>{@link xmei.ElementType#getName <em>Name</em>}</li>
 *   <li>{@link xmei.ElementType#getScope <em>Scope</em>}</li>
 *   <li>{@link xmei.ElementType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getElementType()
 * @model extendedMetaData="name='elementType' kind='elementOnly'"
 * @generated
 */
public interface ElementType extends EObject
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
     * @see #setModel(ModelType)
     * @see xmei.XmeiPackage#getElementType_Model()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='model'"
     * @generated
     */
    ModelType getModel();

    /**
     * Sets the value of the '{@link xmei.ElementType#getModel <em>Model</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' containment reference.
     * @see #getModel()
     * @generated
     */
    void setModel(ModelType value);

    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference.
     * @see #setProperties(PropertiesType)
     * @see xmei.XmeiPackage#getElementType_Properties()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='properties'"
     * @generated
     */
    PropertiesType getProperties();

    /**
     * Sets the value of the '{@link xmei.ElementType#getProperties <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Properties</em>' containment reference.
     * @see #getProperties()
     * @generated
     */
    void setProperties(PropertiesType value);

    /**
     * Returns the value of the '<em><b>Project</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Project</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Project</em>' containment reference.
     * @see #setProject(ProjectType)
     * @see xmei.XmeiPackage#getElementType_Project()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='project'"
     * @generated
     */
    ProjectType getProject();

    /**
     * Sets the value of the '{@link xmei.ElementType#getProject <em>Project</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Project</em>' containment reference.
     * @see #getProject()
     * @generated
     */
    void setProject(ProjectType value);

    /**
     * Returns the value of the '<em><b>Code</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Code</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Code</em>' containment reference.
     * @see #setCode(CodeType)
     * @see xmei.XmeiPackage#getElementType_Code()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='code'"
     * @generated
     */
    CodeType getCode();

    /**
     * Sets the value of the '{@link xmei.ElementType#getCode <em>Code</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Code</em>' containment reference.
     * @see #getCode()
     * @generated
     */
    void setCode(CodeType value);

    /**
     * Returns the value of the '<em><b>Links</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Links</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Links</em>' containment reference.
     * @see #setLinks(LinksType)
     * @see xmei.XmeiPackage#getElementType_Links()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='links'"
     * @generated
     */
    LinksType getLinks();

    /**
     * Sets the value of the '{@link xmei.ElementType#getLinks <em>Links</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Links</em>' containment reference.
     * @see #getLinks()
     * @generated
     */
    void setLinks(LinksType value);

    /**
     * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attributes</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attributes</em>' containment reference.
     * @see #setAttributes(AttributesType)
     * @see xmei.XmeiPackage#getElementType_Attributes()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='attributes'"
     * @generated
     */
    AttributesType getAttributes();

    /**
     * Sets the value of the '{@link xmei.ElementType#getAttributes <em>Attributes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attributes</em>' containment reference.
     * @see #getAttributes()
     * @generated
     */
    void setAttributes(AttributesType value);

    /**
     * Returns the value of the '<em><b>Operations</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operations</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operations</em>' containment reference.
     * @see #setOperations(OperationsType)
     * @see xmei.XmeiPackage#getElementType_Operations()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='operations'"
     * @generated
     */
    OperationsType getOperations();

    /**
     * Sets the value of the '{@link xmei.ElementType#getOperations <em>Operations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operations</em>' containment reference.
     * @see #getOperations()
     * @generated
     */
    void setOperations(OperationsType value);

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
     * @see xmei.XmeiPackage#getElementType_Idref()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='idref' namespace='##targetNamespace'"
     * @generated
     */
    String getIdref();

    /**
     * Sets the value of the '{@link xmei.ElementType#getIdref <em>Idref</em>}' attribute.
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
     * @see xmei.XmeiPackage#getElementType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link xmei.ElementType#getName <em>Name</em>}' attribute.
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
     * @see xmei.XmeiPackage#getElementType_Scope()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='scope'"
     * @generated
     */
    VisibilityType getScope();

    /**
     * Sets the value of the '{@link xmei.ElementType#getScope <em>Scope</em>}' attribute.
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
     * Unsets the value of the '{@link xmei.ElementType#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScope()
     * @see #getScope()
     * @see #setScope(VisibilityType)
     * @generated
     */
    void unsetScope();

    /**
     * Returns whether the value of the '{@link xmei.ElementType#getScope <em>Scope</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scope</em>' attribute is set.
     * @see #unsetScope()
     * @see #getScope()
     * @see #setScope(VisibilityType)
     * @generated
     */
    boolean isSetScope();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link xmei.TypeBaseType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see xmei.TypeBaseType
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(TypeBaseType)
     * @see xmei.XmeiPackage#getElementType_Type()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
     * @generated
     */
    TypeBaseType getType();

    /**
     * Sets the value of the '{@link xmei.ElementType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see xmei.TypeBaseType
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType(TypeBaseType value);

    /**
     * Unsets the value of the '{@link xmei.ElementType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(TypeBaseType)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link xmei.ElementType#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(TypeBaseType)
     * @generated
     */
    boolean isSetType();

} // ElementType
