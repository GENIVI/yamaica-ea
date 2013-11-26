/**
 */
package xmei;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attributes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.AttributesType#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getAttributesType()
 * @model extendedMetaData="name='attributesType' kind='elementOnly'"
 * @generated
 */
public interface AttributesType extends EObject
{
    /**
     * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
     * The list contents are of type {@link xmei.AttributeType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute</em>' containment reference list.
     * @see xmei.XmeiPackage#getAttributesType_Attribute()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='attribute'"
     * @generated
     */
    EList<AttributeType> getAttribute();

} // AttributesType
