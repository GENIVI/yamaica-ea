/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

import uml.VisibilityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.ParameterType#getProperties <em>Properties</em>}</li>
 *   <li>{@link xmei.ParameterType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link xmei.ParameterType#getValue <em>Value</em>}</li>
 *   <li>{@link xmei.ParameterType#getXrefs <em>Xrefs</em>}</li>
 *   <li>{@link xmei.ParameterType#getIdref <em>Idref</em>}</li>
 *   <li>{@link xmei.ParameterType#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getParameterType()
 * @model extendedMetaData="name='parameterType' kind='elementOnly'"
 * @generated
 */
public interface ParameterType extends EObject
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
     * @see #setProperties(ParameterPropertiesType)
     * @see xmei.XmeiPackage#getParameterType_Properties()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='properties'"
     * @generated
     */
    ParameterPropertiesType getProperties();

    /**
     * Sets the value of the '{@link xmei.ParameterType#getProperties <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Properties</em>' containment reference.
     * @see #getProperties()
     * @generated
     */
    void setProperties(ParameterPropertiesType value);

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
     * @see xmei.XmeiPackage#getParameterType_Documentation()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='documentation'"
     * @generated
     */
    DocumentationType getDocumentation();

    /**
     * Sets the value of the '{@link xmei.ParameterType#getDocumentation <em>Documentation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Documentation</em>' containment reference.
     * @see #getDocumentation()
     * @generated
     */
    void setDocumentation(DocumentationType value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(InitialType)
     * @see xmei.XmeiPackage#getParameterType_Value()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Value'"
     * @generated
     */
    InitialType getValue();

    /**
     * Sets the value of the '{@link xmei.ParameterType#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
    void setValue(InitialType value);

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
     * @see xmei.XmeiPackage#getParameterType_Xrefs()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='xrefs'"
     * @generated
     */
    XrefsType getXrefs();

    /**
     * Sets the value of the '{@link xmei.ParameterType#getXrefs <em>Xrefs</em>}' containment reference.
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
     * @see xmei.XmeiPackage#getParameterType_Idref()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='idref' namespace='##targetNamespace'"
     * @generated
     */
    String getIdref();

    /**
     * Sets the value of the '{@link xmei.ParameterType#getIdref <em>Idref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Idref</em>' attribute.
     * @see #getIdref()
     * @generated
     */
    void setIdref(String value);

    /**
     * Returns the value of the '<em><b>Visibility</b></em>' attribute.
     * The literals are from the enumeration {@link uml.VisibilityType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Visibility</em>' attribute.
     * @see uml.VisibilityType
     * @see #isSetVisibility()
     * @see #unsetVisibility()
     * @see #setVisibility(VisibilityType)
     * @see xmei.XmeiPackage#getParameterType_Visibility()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='visibility'"
     * @generated
     */
    VisibilityType getVisibility();

    /**
     * Sets the value of the '{@link xmei.ParameterType#getVisibility <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Visibility</em>' attribute.
     * @see uml.VisibilityType
     * @see #isSetVisibility()
     * @see #unsetVisibility()
     * @see #getVisibility()
     * @generated
     */
    void setVisibility(VisibilityType value);

    /**
     * Unsets the value of the '{@link xmei.ParameterType#getVisibility <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVisibility()
     * @see #getVisibility()
     * @see #setVisibility(VisibilityType)
     * @generated
     */
    void unsetVisibility();

    /**
     * Returns whether the value of the '{@link xmei.ParameterType#getVisibility <em>Visibility</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Visibility</em>' attribute is set.
     * @see #unsetVisibility()
     * @see #getVisibility()
     * @see #setVisibility(VisibilityType)
     * @generated
     */
    boolean isSetVisibility();

} // ParameterType
