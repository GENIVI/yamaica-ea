/**
 */
package xmei;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Tags Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.OperationTagsType#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getOperationTagsType()
 * @model extendedMetaData="name='operationTagsType' kind='elementOnly'"
 * @generated
 */
public interface OperationTagsType extends EObject
{
    /**
     * Returns the value of the '<em><b>Tag</b></em>' containment reference list.
     * The list contents are of type {@link xmei.TagType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tag</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tag</em>' containment reference list.
     * @see xmei.XmeiPackage#getOperationTagsType_Tag()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='tag'"
     * @generated
     */
    EList<TagType> getTag();

} // OperationTagsType
