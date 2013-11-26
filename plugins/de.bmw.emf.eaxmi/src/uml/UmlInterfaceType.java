/**
 */
package uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.UmlInterfaceType#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link uml.UmlInterfaceType#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml.UmlInterfaceType#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link uml.UmlInterfaceType#getNestedClassifier <em>Nested Classifier</em>}</li>
 *   <li>{@link uml.UmlInterfaceType#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getUmlInterfaceType()
 * @model extendedMetaData="name='umlInterfaceType' kind='elementOnly'"
 * @generated
 */
public interface UmlInterfaceType extends PackagedElementPackageType
{
    /**
     * Returns the value of the '<em><b>Generalization</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Generalization</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Generalization</em>' containment reference.
     * @see #setGeneralization(GeneralizationType)
     * @see uml.UmlPackage#getUmlInterfaceType_Generalization()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='generalization'"
     * @generated
     */
    GeneralizationType getGeneralization();

    /**
     * Sets the value of the '{@link uml.UmlInterfaceType#getGeneralization <em>Generalization</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Generalization</em>' containment reference.
     * @see #getGeneralization()
     * @generated
     */
    void setGeneralization(GeneralizationType value);

    /**
     * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
     * The list contents are of type {@link uml.OwnedAttributeBaseType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Attribute</em>' containment reference list.
     * @see uml.UmlPackage#getUmlInterfaceType_OwnedAttribute()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ownedAttribute'"
     * @generated
     */
    EList<OwnedAttributeBaseType> getOwnedAttribute();

    /**
     * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
     * The list contents are of type {@link uml.OwnedOperationType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Operation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Operation</em>' containment reference list.
     * @see uml.UmlPackage#getUmlInterfaceType_OwnedOperation()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ownedOperation'"
     * @generated
     */
    EList<OwnedOperationType> getOwnedOperation();

    /**
     * Returns the value of the '<em><b>Nested Classifier</b></em>' containment reference list.
     * The list contents are of type {@link uml.PackagedElementBaseType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nested Classifier</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nested Classifier</em>' containment reference list.
     * @see uml.UmlPackage#getUmlInterfaceType_NestedClassifier()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='nestedClassifier'"
     * @generated
     */
    EList<PackagedElementBaseType> getNestedClassifier();

    /**
     * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Abstract</em>' attribute.
     * @see #isSetIsAbstract()
     * @see #unsetIsAbstract()
     * @see #setIsAbstract(boolean)
     * @see uml.UmlPackage#getUmlInterfaceType_IsAbstract()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
     *        extendedMetaData="kind='attribute' name='isAbstract'"
     * @generated
     */
    boolean isIsAbstract();

    /**
     * Sets the value of the '{@link uml.UmlInterfaceType#isIsAbstract <em>Is Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Abstract</em>' attribute.
     * @see #isSetIsAbstract()
     * @see #unsetIsAbstract()
     * @see #isIsAbstract()
     * @generated
     */
    void setIsAbstract(boolean value);

    /**
     * Unsets the value of the '{@link uml.UmlInterfaceType#isIsAbstract <em>Is Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsAbstract()
     * @see #isIsAbstract()
     * @see #setIsAbstract(boolean)
     * @generated
     */
    void unsetIsAbstract();

    /**
     * Returns whether the value of the '{@link uml.UmlInterfaceType#isIsAbstract <em>Is Abstract</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Abstract</em>' attribute is set.
     * @see #unsetIsAbstract()
     * @see #isIsAbstract()
     * @see #setIsAbstract(boolean)
     * @generated
     */
    boolean isSetIsAbstract();

} // UmlInterfaceType
