/**
 */
package uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packaged Element Association Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.PackagedElementAssociationType#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link uml.PackagedElementAssociationType#getOwnedEnd <em>Owned End</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getPackagedElementAssociationType()
 * @model extendedMetaData="name='packagedElementAssociationType' kind='elementOnly'"
 * @generated
 */
public interface PackagedElementAssociationType extends PackagedElementBaseType
{
    /**
     * Returns the value of the '<em><b>Member End</b></em>' containment reference list.
     * The list contents are of type {@link uml.MemberEndType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Member End</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Member End</em>' containment reference list.
     * @see uml.UmlPackage#getPackagedElementAssociationType_MemberEnd()
     * @model containment="true" lower="2" upper="2"
     *        extendedMetaData="kind='element' name='memberEnd'"
     * @generated
     */
    EList<MemberEndType> getMemberEnd();

    /**
     * Returns the value of the '<em><b>Owned End</b></em>' containment reference list.
     * The list contents are of type {@link uml.OwnedAttributeExtendedAttributesType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned End</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned End</em>' containment reference list.
     * @see uml.UmlPackage#getPackagedElementAssociationType_OwnedEnd()
     * @model containment="true" required="true" upper="2"
     *        extendedMetaData="kind='element' name='ownedEnd'"
     * @generated
     */
    EList<OwnedAttributeExtendedAttributesType> getOwnedEnd();

} // PackagedElementAssociationType
