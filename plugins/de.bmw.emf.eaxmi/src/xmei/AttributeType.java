/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

import uml.VisibilityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.AttributeType#getInitial <em>Initial</em>}</li>
 *   <li>{@link xmei.AttributeType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link xmei.AttributeType#getModel <em>Model</em>}</li>
 *   <li>{@link xmei.AttributeType#getProperties <em>Properties</em>}</li>
 *   <li>{@link xmei.AttributeType#getContainment <em>Containment</em>}</li>
 *   <li>{@link xmei.AttributeType#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link xmei.AttributeType#getBounds <em>Bounds</em>}</li>
 *   <li>{@link xmei.AttributeType#getStyleex <em>Styleex</em>}</li>
 *   <li>{@link xmei.AttributeType#getXrefs <em>Xrefs</em>}</li>
 *   <li>{@link xmei.AttributeType#getIdref <em>Idref</em>}</li>
 *   <li>{@link xmei.AttributeType#getName <em>Name</em>}</li>
 *   <li>{@link xmei.AttributeType#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getAttributeType()
 * @model extendedMetaData="name='attributeType' kind='elementOnly'"
 * @generated
 */
public interface AttributeType extends EObject
{
    /**
     * Returns the value of the '<em><b>Initial</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initial</em>' containment reference.
     * @see #setInitial(InitialType)
     * @see xmei.XmeiPackage#getAttributeType_Initial()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='initial'"
     * @generated
     */
    InitialType getInitial();

    /**
     * Sets the value of the '{@link xmei.AttributeType#getInitial <em>Initial</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial</em>' containment reference.
     * @see #getInitial()
     * @generated
     */
    void setInitial(InitialType value);

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
     * @see xmei.XmeiPackage#getAttributeType_Documentation()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='documentation'"
     * @generated
     */
    DocumentationType getDocumentation();

    /**
     * Sets the value of the '{@link xmei.AttributeType#getDocumentation <em>Documentation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Documentation</em>' containment reference.
     * @see #getDocumentation()
     * @generated
     */
    void setDocumentation(DocumentationType value);

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
     * @see xmei.XmeiPackage#getAttributeType_Model()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='model'"
     * @generated
     */
    AttributeModelType getModel();

    /**
     * Sets the value of the '{@link xmei.AttributeType#getModel <em>Model</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' containment reference.
     * @see #getModel()
     * @generated
     */
    void setModel(AttributeModelType value);

    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference.
     * @see #setProperties(AttributePropertiesType)
     * @see xmei.XmeiPackage#getAttributeType_Properties()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='properties'"
     * @generated
     */
    AttributePropertiesType getProperties();

    /**
     * Sets the value of the '{@link xmei.AttributeType#getProperties <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Properties</em>' containment reference.
     * @see #getProperties()
     * @generated
     */
    void setProperties(AttributePropertiesType value);

    /**
     * Returns the value of the '<em><b>Containment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Containment</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Containment</em>' containment reference.
     * @see #setContainment(AttributeContainmentType)
     * @see xmei.XmeiPackage#getAttributeType_Containment()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='containment'"
     * @generated
     */
    AttributeContainmentType getContainment();

    /**
     * Sets the value of the '{@link xmei.AttributeType#getContainment <em>Containment</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Containment</em>' containment reference.
     * @see #getContainment()
     * @generated
     */
    void setContainment(AttributeContainmentType value);

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
     * @see xmei.XmeiPackage#getAttributeType_Stereotype()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='stereotype'"
     * @generated
     */
    StereotypeAttributeType getStereotype();

    /**
     * Sets the value of the '{@link xmei.AttributeType#getStereotype <em>Stereotype</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stereotype</em>' containment reference.
     * @see #getStereotype()
     * @generated
     */
    void setStereotype(StereotypeAttributeType value);

    /**
     * Returns the value of the '<em><b>Bounds</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bounds</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bounds</em>' containment reference.
     * @see #setBounds(BoundsType)
     * @see xmei.XmeiPackage#getAttributeType_Bounds()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='bounds'"
     * @generated
     */
    BoundsType getBounds();

    /**
     * Sets the value of the '{@link xmei.AttributeType#getBounds <em>Bounds</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bounds</em>' containment reference.
     * @see #getBounds()
     * @generated
     */
    void setBounds(BoundsType value);

    /**
     * Returns the value of the '<em><b>Styleex</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Styleex</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Styleex</em>' containment reference.
     * @see #setStyleex(StyleexType)
     * @see xmei.XmeiPackage#getAttributeType_Styleex()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='styleex'"
     * @generated
     */
    StyleexType getStyleex();

    /**
     * Sets the value of the '{@link xmei.AttributeType#getStyleex <em>Styleex</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Styleex</em>' containment reference.
     * @see #getStyleex()
     * @generated
     */
    void setStyleex(StyleexType value);

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
     * @see xmei.XmeiPackage#getAttributeType_Xrefs()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='xrefs'"
     * @generated
     */
    XrefsType getXrefs();

    /**
     * Sets the value of the '{@link xmei.AttributeType#getXrefs <em>Xrefs</em>}' containment reference.
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
     * @see xmei.XmeiPackage#getAttributeType_Idref()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='idref' namespace='##targetNamespace'"
     * @generated
     */
    String getIdref();

    /**
     * Sets the value of the '{@link xmei.AttributeType#getIdref <em>Idref</em>}' attribute.
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
     * @see xmei.XmeiPackage#getAttributeType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link xmei.AttributeType#getName <em>Name</em>}' attribute.
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
     * @see xmei.XmeiPackage#getAttributeType_Scope()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='scope'"
     * @generated
     */
    VisibilityType getScope();

    /**
     * Sets the value of the '{@link xmei.AttributeType#getScope <em>Scope</em>}' attribute.
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
     * Unsets the value of the '{@link xmei.AttributeType#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScope()
     * @see #getScope()
     * @see #setScope(VisibilityType)
     * @generated
     */
    void unsetScope();

    /**
     * Returns whether the value of the '{@link xmei.AttributeType#getScope <em>Scope</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scope</em>' attribute is set.
     * @see #unsetScope()
     * @see #getScope()
     * @see #setScope(VisibilityType)
     * @generated
     */
    boolean isSetScope();

} // AttributeType
