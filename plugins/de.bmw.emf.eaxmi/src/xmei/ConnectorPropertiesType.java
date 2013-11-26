/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.ConnectorPropertiesType#getDirection <em>Direction</em>}</li>
 *   <li>{@link xmei.ConnectorPropertiesType#getEaType <em>Ea Type</em>}</li>
 *   <li>{@link xmei.ConnectorPropertiesType#getName <em>Name</em>}</li>
 *   <li>{@link xmei.ConnectorPropertiesType#getStereotype <em>Stereotype</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getConnectorPropertiesType()
 * @model extendedMetaData="name='connectorPropertiesType' kind='empty'"
 * @generated
 */
public interface ConnectorPropertiesType extends EObject
{
    /**
     * Returns the value of the '<em><b>Direction</b></em>' attribute.
     * The literals are from the enumeration {@link xmei.DirectionType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Direction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Direction</em>' attribute.
     * @see xmei.DirectionType
     * @see #isSetDirection()
     * @see #unsetDirection()
     * @see #setDirection(DirectionType)
     * @see xmei.XmeiPackage#getConnectorPropertiesType_Direction()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='direction'"
     * @generated
     */
    DirectionType getDirection();

    /**
     * Sets the value of the '{@link xmei.ConnectorPropertiesType#getDirection <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Direction</em>' attribute.
     * @see xmei.DirectionType
     * @see #isSetDirection()
     * @see #unsetDirection()
     * @see #getDirection()
     * @generated
     */
    void setDirection(DirectionType value);

    /**
     * Unsets the value of the '{@link xmei.ConnectorPropertiesType#getDirection <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDirection()
     * @see #getDirection()
     * @see #setDirection(DirectionType)
     * @generated
     */
    void unsetDirection();

    /**
     * Returns whether the value of the '{@link xmei.ConnectorPropertiesType#getDirection <em>Direction</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Direction</em>' attribute is set.
     * @see #unsetDirection()
     * @see #getDirection()
     * @see #setDirection(DirectionType)
     * @generated
     */
    boolean isSetDirection();

    /**
     * Returns the value of the '<em><b>Ea Type</b></em>' attribute.
     * The literals are from the enumeration {@link xmei.EaTypesType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ea Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ea Type</em>' attribute.
     * @see xmei.EaTypesType
     * @see #isSetEaType()
     * @see #unsetEaType()
     * @see #setEaType(EaTypesType)
     * @see xmei.XmeiPackage#getConnectorPropertiesType_EaType()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='ea_type'"
     * @generated
     */
    EaTypesType getEaType();

    /**
     * Sets the value of the '{@link xmei.ConnectorPropertiesType#getEaType <em>Ea Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ea Type</em>' attribute.
     * @see xmei.EaTypesType
     * @see #isSetEaType()
     * @see #unsetEaType()
     * @see #getEaType()
     * @generated
     */
    void setEaType(EaTypesType value);

    /**
     * Unsets the value of the '{@link xmei.ConnectorPropertiesType#getEaType <em>Ea Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEaType()
     * @see #getEaType()
     * @see #setEaType(EaTypesType)
     * @generated
     */
    void unsetEaType();

    /**
     * Returns whether the value of the '{@link xmei.ConnectorPropertiesType#getEaType <em>Ea Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ea Type</em>' attribute is set.
     * @see #unsetEaType()
     * @see #getEaType()
     * @see #setEaType(EaTypesType)
     * @generated
     */
    boolean isSetEaType();

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
     * @see xmei.XmeiPackage#getConnectorPropertiesType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link xmei.ConnectorPropertiesType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
     * The literals are from the enumeration {@link xmei.StereotypeType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stereotype</em>' attribute.
     * @see xmei.StereotypeType
     * @see #isSetStereotype()
     * @see #unsetStereotype()
     * @see #setStereotype(StereotypeType)
     * @see xmei.XmeiPackage#getConnectorPropertiesType_Stereotype()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='stereotype'"
     * @generated
     */
    StereotypeType getStereotype();

    /**
     * Sets the value of the '{@link xmei.ConnectorPropertiesType#getStereotype <em>Stereotype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stereotype</em>' attribute.
     * @see xmei.StereotypeType
     * @see #isSetStereotype()
     * @see #unsetStereotype()
     * @see #getStereotype()
     * @generated
     */
    void setStereotype(StereotypeType value);

    /**
     * Unsets the value of the '{@link xmei.ConnectorPropertiesType#getStereotype <em>Stereotype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStereotype()
     * @see #getStereotype()
     * @see #setStereotype(StereotypeType)
     * @generated
     */
    void unsetStereotype();

    /**
     * Returns whether the value of the '{@link xmei.ConnectorPropertiesType#getStereotype <em>Stereotype</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Stereotype</em>' attribute is set.
     * @see #unsetStereotype()
     * @see #getStereotype()
     * @see #setStereotype(StereotypeType)
     * @generated
     */
    boolean isSetStereotype();

} // ConnectorPropertiesType
