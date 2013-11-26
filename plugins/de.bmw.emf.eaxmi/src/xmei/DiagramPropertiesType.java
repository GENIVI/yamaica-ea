/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.DiagramPropertiesType#getName <em>Name</em>}</li>
 *   <li>{@link xmei.DiagramPropertiesType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getDiagramPropertiesType()
 * @model extendedMetaData="name='diagramPropertiesType' kind='empty'"
 * @generated
 */
public interface DiagramPropertiesType extends EObject
{
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
     * @see xmei.XmeiPackage#getDiagramPropertiesType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link xmei.DiagramPropertiesType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link xmei.DiagramTypeType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see xmei.DiagramTypeType
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(DiagramTypeType)
     * @see xmei.XmeiPackage#getDiagramPropertiesType_Type()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    DiagramTypeType getType();

    /**
     * Sets the value of the '{@link xmei.DiagramPropertiesType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see xmei.DiagramTypeType
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType(DiagramTypeType value);

    /**
     * Unsets the value of the '{@link xmei.DiagramPropertiesType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(DiagramTypeType)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link xmei.DiagramPropertiesType#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(DiagramTypeType)
     * @generated
     */
    boolean isSetType();

} // DiagramPropertiesType
