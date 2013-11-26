/**
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owned Attribute Extended Content Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.OwnedAttributeExtendedContentType#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link uml.OwnedAttributeExtendedContentType#getUpperValue <em>Upper Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getOwnedAttributeExtendedContentType()
 * @model extendedMetaData="name='ownedAttributeExtendedContentType' kind='elementOnly'"
 * @generated
 */
public interface OwnedAttributeExtendedContentType extends OwnedAttributeExtendedAttributesType
{
    /**
     * Returns the value of the '<em><b>Lower Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lower Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lower Value</em>' containment reference.
     * @see #setLowerValue(MultiplicityValueType)
     * @see uml.UmlPackage#getOwnedAttributeExtendedContentType_LowerValue()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='lowerValue'"
     * @generated
     */
    MultiplicityValueType getLowerValue();

    /**
     * Sets the value of the '{@link uml.OwnedAttributeExtendedContentType#getLowerValue <em>Lower Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lower Value</em>' containment reference.
     * @see #getLowerValue()
     * @generated
     */
    void setLowerValue(MultiplicityValueType value);

    /**
     * Returns the value of the '<em><b>Upper Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Upper Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Upper Value</em>' containment reference.
     * @see #setUpperValue(MultiplicityValueType)
     * @see uml.UmlPackage#getOwnedAttributeExtendedContentType_UpperValue()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='upperValue'"
     * @generated
     */
    MultiplicityValueType getUpperValue();

    /**
     * Sets the value of the '{@link uml.OwnedAttributeExtendedContentType#getUpperValue <em>Upper Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Upper Value</em>' containment reference.
     * @see #getUpperValue()
     * @generated
     */
    void setUpperValue(MultiplicityValueType value);

} // OwnedAttributeExtendedContentType
