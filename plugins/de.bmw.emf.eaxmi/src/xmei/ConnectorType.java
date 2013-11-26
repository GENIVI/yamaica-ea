/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.ConnectorType#getSource <em>Source</em>}</li>
 *   <li>{@link xmei.ConnectorType#getTarget <em>Target</em>}</li>
 *   <li>{@link xmei.ConnectorType#getModel <em>Model</em>}</li>
 *   <li>{@link xmei.ConnectorType#getProperties <em>Properties</em>}</li>
 *   <li>{@link xmei.ConnectorType#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link xmei.ConnectorType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link xmei.ConnectorType#getAppearance <em>Appearance</em>}</li>
 *   <li>{@link xmei.ConnectorType#getLabels <em>Labels</em>}</li>
 *   <li>{@link xmei.ConnectorType#getExtendedProperties <em>Extended Properties</em>}</li>
 *   <li>{@link xmei.ConnectorType#getStyle <em>Style</em>}</li>
 *   <li>{@link xmei.ConnectorType#getXrefs <em>Xrefs</em>}</li>
 *   <li>{@link xmei.ConnectorType#getTags <em>Tags</em>}</li>
 *   <li>{@link xmei.ConnectorType#getIdref <em>Idref</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getConnectorType()
 * @model extendedMetaData="name='connectorType' kind='elementOnly'"
 * @generated
 */
public interface ConnectorType extends EObject
{
    /**
     * Returns the value of the '<em><b>Source</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' containment reference.
     * @see #setSource(SourceAndTargetType)
     * @see xmei.XmeiPackage#getConnectorType_Source()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='source'"
     * @generated
     */
    SourceAndTargetType getSource();

    /**
     * Sets the value of the '{@link xmei.ConnectorType#getSource <em>Source</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' containment reference.
     * @see #getSource()
     * @generated
     */
    void setSource(SourceAndTargetType value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' containment reference.
     * @see #setTarget(SourceAndTargetType)
     * @see xmei.XmeiPackage#getConnectorType_Target()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='target'"
     * @generated
     */
    SourceAndTargetType getTarget();

    /**
     * Sets the value of the '{@link xmei.ConnectorType#getTarget <em>Target</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' containment reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(SourceAndTargetType value);

    /**
     * Returns the value of the '<em><b>Model</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' containment reference.
     * @see #setModel(ConnectorModelType)
     * @see xmei.XmeiPackage#getConnectorType_Model()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='model'"
     * @generated
     */
    ConnectorModelType getModel();

    /**
     * Sets the value of the '{@link xmei.ConnectorType#getModel <em>Model</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' containment reference.
     * @see #getModel()
     * @generated
     */
    void setModel(ConnectorModelType value);

    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference.
     * @see #setProperties(ConnectorPropertiesType)
     * @see xmei.XmeiPackage#getConnectorType_Properties()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='properties'"
     * @generated
     */
    ConnectorPropertiesType getProperties();

    /**
     * Sets the value of the '{@link xmei.ConnectorType#getProperties <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Properties</em>' containment reference.
     * @see #getProperties()
     * @generated
     */
    void setProperties(ConnectorPropertiesType value);

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
     * @see xmei.XmeiPackage#getConnectorType_Modifiers()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='modifiers'"
     * @generated
     */
    ConnectorModifiersType getModifiers();

    /**
     * Sets the value of the '{@link xmei.ConnectorType#getModifiers <em>Modifiers</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Modifiers</em>' containment reference.
     * @see #getModifiers()
     * @generated
     */
    void setModifiers(ConnectorModifiersType value);

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
     * @see xmei.XmeiPackage#getConnectorType_Documentation()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='documentation'"
     * @generated
     */
    DocumentationType getDocumentation();

    /**
     * Sets the value of the '{@link xmei.ConnectorType#getDocumentation <em>Documentation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Documentation</em>' containment reference.
     * @see #getDocumentation()
     * @generated
     */
    void setDocumentation(DocumentationType value);

    /**
     * Returns the value of the '<em><b>Appearance</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Appearance</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Appearance</em>' containment reference.
     * @see #setAppearance(ConnectorAppearanceType)
     * @see xmei.XmeiPackage#getConnectorType_Appearance()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='appearance'"
     * @generated
     */
    ConnectorAppearanceType getAppearance();

    /**
     * Sets the value of the '{@link xmei.ConnectorType#getAppearance <em>Appearance</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Appearance</em>' containment reference.
     * @see #getAppearance()
     * @generated
     */
    void setAppearance(ConnectorAppearanceType value);

    /**
     * Returns the value of the '<em><b>Labels</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Labels</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Labels</em>' containment reference.
     * @see #setLabels(ConnectorLabelsType)
     * @see xmei.XmeiPackage#getConnectorType_Labels()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='labels'"
     * @generated
     */
    ConnectorLabelsType getLabels();

    /**
     * Sets the value of the '{@link xmei.ConnectorType#getLabels <em>Labels</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Labels</em>' containment reference.
     * @see #getLabels()
     * @generated
     */
    void setLabels(ConnectorLabelsType value);

    /**
     * Returns the value of the '<em><b>Extended Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extended Properties</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extended Properties</em>' containment reference.
     * @see #setExtendedProperties(ExtendedPropertiesType)
     * @see xmei.XmeiPackage#getConnectorType_ExtendedProperties()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='extendedProperties'"
     * @generated
     */
    ExtendedPropertiesType getExtendedProperties();

    /**
     * Sets the value of the '{@link xmei.ConnectorType#getExtendedProperties <em>Extended Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Extended Properties</em>' containment reference.
     * @see #getExtendedProperties()
     * @generated
     */
    void setExtendedProperties(ExtendedPropertiesType value);

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
     * @see xmei.XmeiPackage#getConnectorType_Style()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='style'"
     * @generated
     */
    DocumentationType getStyle();

    /**
     * Sets the value of the '{@link xmei.ConnectorType#getStyle <em>Style</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Style</em>' containment reference.
     * @see #getStyle()
     * @generated
     */
    void setStyle(DocumentationType value);

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
     * @see xmei.XmeiPackage#getConnectorType_Xrefs()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='xrefs'"
     * @generated
     */
    XrefsType getXrefs();

    /**
     * Sets the value of the '{@link xmei.ConnectorType#getXrefs <em>Xrefs</em>}' containment reference.
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
     * @see xmei.XmeiPackage#getConnectorType_Tags()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='tags'"
     * @generated
     */
    OperationTagsType getTags();

    /**
     * Sets the value of the '{@link xmei.ConnectorType#getTags <em>Tags</em>}' containment reference.
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
     * @see xmei.XmeiPackage#getConnectorType_Idref()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='idref' namespace='##targetNamespace'"
     * @generated
     */
    String getIdref();

    /**
     * Sets the value of the '{@link xmei.ConnectorType#getIdref <em>Idref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Idref</em>' attribute.
     * @see #getIdref()
     * @generated
     */
    void setIdref(String value);

} // ConnectorType
