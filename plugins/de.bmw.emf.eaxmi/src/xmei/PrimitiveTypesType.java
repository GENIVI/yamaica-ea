/**
 */
package xmei;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import uml.PackagedElementPackageType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Types Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.PrimitiveTypesType#getPackagedElement <em>Packaged Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getPrimitiveTypesType()
 * @model extendedMetaData="name='primitiveTypesType' kind='elementOnly'"
 * @generated
 */
public interface PrimitiveTypesType extends EObject
{
    /**
     * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
     * The list contents are of type {@link uml.PackagedElementPackageType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Packaged Element</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Packaged Element</em>' containment reference list.
     * @see xmei.XmeiPackage#getPrimitiveTypesType_PackagedElement()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='packagedElement'"
     * @generated
     */
    EList<PackagedElementPackageType> getPackagedElement();

} // PrimitiveTypesType
