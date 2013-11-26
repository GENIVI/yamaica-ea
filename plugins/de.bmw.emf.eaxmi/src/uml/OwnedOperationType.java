/**
 */
package uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owned Operation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.OwnedOperationType#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link uml.OwnedOperationType#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link uml.OwnedOperationType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getOwnedOperationType()
 * @model extendedMetaData="name='ownedOperationType' kind='elementOnly'"
 * @generated
 */
public interface OwnedOperationType extends PackagedElementBaseType
{
    /**
     * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
     * The list contents are of type {@link uml.OwnedParameterType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Parameter</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Parameter</em>' containment reference list.
     * @see uml.UmlPackage#getOwnedOperationType_OwnedParameter()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='ownedParameter'"
     * @generated
     */
    EList<OwnedParameterType> getOwnedParameter();

    /**
     * Returns the value of the '<em><b>Concurrency</b></em>' attribute.
     * The default value is <code>"sequential"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Concurrency</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Concurrency</em>' attribute.
     * @see #isSetConcurrency()
     * @see #unsetConcurrency()
     * @see #setConcurrency(String)
     * @see uml.UmlPackage#getOwnedOperationType_Concurrency()
     * @model default="sequential" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='concurrency'"
     * @generated
     */
    String getConcurrency();

    /**
     * Sets the value of the '{@link uml.OwnedOperationType#getConcurrency <em>Concurrency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Concurrency</em>' attribute.
     * @see #isSetConcurrency()
     * @see #unsetConcurrency()
     * @see #getConcurrency()
     * @generated
     */
    void setConcurrency(String value);

    /**
     * Unsets the value of the '{@link uml.OwnedOperationType#getConcurrency <em>Concurrency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConcurrency()
     * @see #getConcurrency()
     * @see #setConcurrency(String)
     * @generated
     */
    void unsetConcurrency();

    /**
     * Returns whether the value of the '{@link uml.OwnedOperationType#getConcurrency <em>Concurrency</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Concurrency</em>' attribute is set.
     * @see #unsetConcurrency()
     * @see #getConcurrency()
     * @see #setConcurrency(String)
     * @generated
     */
    boolean isSetConcurrency();

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
     * @see uml.UmlPackage#getOwnedOperationType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link uml.OwnedOperationType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // OwnedOperationType
