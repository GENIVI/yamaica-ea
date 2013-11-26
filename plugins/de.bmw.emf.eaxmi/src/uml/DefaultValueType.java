/**
 */
package uml;

import org.eclipse.emf.ecore.EObject;

import xmei.TypeBaseType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.DefaultValueType#getId <em>Id</em>}</li>
 *   <li>{@link uml.DefaultValueType#getType <em>Type</em>}</li>
 *   <li>{@link uml.DefaultValueType#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getDefaultValueType()
 * @model extendedMetaData="name='defaultValueType' kind='empty'"
 * @generated
 */
public interface DefaultValueType extends EObject
{
    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see uml.UmlPackage#getDefaultValueType_Id()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='id' namespace='xmei.Franca2EA_XMI_Schema'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link uml.DefaultValueType#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link xmei.TypeBaseType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see xmei.TypeBaseType
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(TypeBaseType)
     * @see uml.UmlPackage#getDefaultValueType_Type()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='type' namespace='xmei.Franca2EA_XMI_Schema'"
     * @generated
     */
    TypeBaseType getType();

    /**
     * Sets the value of the '{@link uml.DefaultValueType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see xmei.TypeBaseType
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType(TypeBaseType value);

    /**
     * Unsets the value of the '{@link uml.DefaultValueType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(TypeBaseType)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link uml.DefaultValueType#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(TypeBaseType)
     * @generated
     */
    boolean isSetType();

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see uml.UmlPackage#getDefaultValueType_Value()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='value'"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link uml.DefaultValueType#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

} // DefaultValueType
