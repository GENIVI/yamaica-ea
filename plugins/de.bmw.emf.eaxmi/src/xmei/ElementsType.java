/**
 */
package xmei;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.ElementsType#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getElementsType()
 * @model extendedMetaData="name='elementsType' kind='elementOnly'"
 * @generated
 */
public interface ElementsType extends EObject
{
    /**
     * Returns the value of the '<em><b>Element</b></em>' containment reference list.
     * The list contents are of type {@link xmei.ElementType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Element</em>' containment reference list.
     * @see xmei.XmeiPackage#getElementsType_Element()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='element'"
     * @generated
     */
    EList<ElementType> getElement();

} // ElementsType
