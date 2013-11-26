/**
 */
package uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.UmlClassType#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link uml.UmlClassType#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml.UmlClassType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getUmlClassType()
 * @model extendedMetaData="name='umlClassType' kind='elementOnly'"
 * @generated
 */
public interface UmlClassType extends PackagedElementBaseType
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
     * @see uml.UmlPackage#getUmlClassType_Generalization()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='generalization'"
     * @generated
     */
    GeneralizationType getGeneralization();

    /**
     * Sets the value of the '{@link uml.UmlClassType#getGeneralization <em>Generalization</em>}' containment reference.
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
     * @see uml.UmlPackage#getUmlClassType_OwnedAttribute()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ownedAttribute'"
     * @generated
     */
    EList<OwnedAttributeBaseType> getOwnedAttribute();

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
     * @see uml.UmlPackage#getUmlClassType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link uml.UmlClassType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // UmlClassType
