/**
 */
package uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.UmlEnumerationType#getOwnedLiteral <em>Owned Literal</em>}</li>
 *   <li>{@link uml.UmlEnumerationType#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link uml.UmlEnumerationType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getUmlEnumerationType()
 * @model extendedMetaData="name='umlEnumerationType' kind='elementOnly'"
 * @generated
 */
public interface UmlEnumerationType extends PackagedElementBaseType
{
    /**
     * Returns the value of the '<em><b>Owned Literal</b></em>' containment reference list.
     * The list contents are of type {@link uml.OwnedLiteralType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Literal</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Literal</em>' containment reference list.
     * @see uml.UmlPackage#getUmlEnumerationType_OwnedLiteral()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ownedLiteral'"
     * @generated
     */
    EList<OwnedLiteralType> getOwnedLiteral();

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
     * @see uml.UmlPackage#getUmlEnumerationType_Generalization()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='generalization'"
     * @generated
     */
    GeneralizationType getGeneralization();

    /**
     * Sets the value of the '{@link uml.UmlEnumerationType#getGeneralization <em>Generalization</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Generalization</em>' containment reference.
     * @see #getGeneralization()
     * @generated
     */
    void setGeneralization(GeneralizationType value);

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
     * @see uml.UmlPackage#getUmlEnumerationType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link uml.UmlEnumerationType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // UmlEnumerationType
