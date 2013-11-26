/**
 */
package uml;

import org.eclipse.emf.ecore.EObject;

import xmei.TypeBaseType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packaged Element Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.PackagedElementBaseType#getId <em>Id</em>}</li>
 *   <li>{@link uml.PackagedElementBaseType#getType <em>Type</em>}</li>
 *   <li>{@link uml.PackagedElementBaseType#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getPackagedElementBaseType()
 * @model extendedMetaData="name='packagedElementBaseType' kind='empty'"
 * @generated
 */
public interface PackagedElementBaseType extends EObject
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
     * @see uml.UmlPackage#getPackagedElementBaseType_Id()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='id' namespace='xmei.Franca2EA_XMI_Schema'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link uml.PackagedElementBaseType#getId <em>Id</em>}' attribute.
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
     * @see uml.UmlPackage#getPackagedElementBaseType_Type()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='type' namespace='xmei.Franca2EA_XMI_Schema'"
     * @generated
     */
    TypeBaseType getType();

    /**
     * Sets the value of the '{@link uml.PackagedElementBaseType#getType <em>Type</em>}' attribute.
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
     * Unsets the value of the '{@link uml.PackagedElementBaseType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(TypeBaseType)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link uml.PackagedElementBaseType#getType <em>Type</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Visibility</b></em>' attribute.
     * The default value is <code>"public"</code>.
     * The literals are from the enumeration {@link uml.VisibilityType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Visibility</em>' attribute.
     * @see uml.VisibilityType
     * @see #isSetVisibility()
     * @see #unsetVisibility()
     * @see #setVisibility(VisibilityType)
     * @see uml.UmlPackage#getPackagedElementBaseType_Visibility()
     * @model default="public" unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='visibility'"
     * @generated
     */
    VisibilityType getVisibility();

    /**
     * Sets the value of the '{@link uml.PackagedElementBaseType#getVisibility <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Visibility</em>' attribute.
     * @see uml.VisibilityType
     * @see #isSetVisibility()
     * @see #unsetVisibility()
     * @see #getVisibility()
     * @generated
     */
    void setVisibility(VisibilityType value);

    /**
     * Unsets the value of the '{@link uml.PackagedElementBaseType#getVisibility <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVisibility()
     * @see #getVisibility()
     * @see #setVisibility(VisibilityType)
     * @generated
     */
    void unsetVisibility();

    /**
     * Returns whether the value of the '{@link uml.PackagedElementBaseType#getVisibility <em>Visibility</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Visibility</em>' attribute is set.
     * @see #unsetVisibility()
     * @see #getVisibility()
     * @see #setVisibility(VisibilityType)
     * @generated
     */
    boolean isSetVisibility();

} // PackagedElementBaseType
