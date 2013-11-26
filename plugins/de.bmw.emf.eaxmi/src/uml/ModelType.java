/**
 */
package uml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import xmei.TypeBaseType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ModelType#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link uml.ModelType#getName <em>Name</em>}</li>
 *   <li>{@link uml.ModelType#getType <em>Type</em>}</li>
 *   <li>{@link uml.ModelType#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getModelType()
 * @model extendedMetaData="name='Model_._type' kind='elementOnly'"
 * @generated
 */
public interface ModelType extends EObject
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
     * @see uml.UmlPackage#getModelType_PackagedElement()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='packagedElement'"
     * @generated
     */
    EList<PackagedElementPackageType> getPackagedElement();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * The default value is <code>"EA_Model"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see uml.UmlPackage#getModelType_Name()
     * @model default="EA_Model" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link uml.ModelType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Unsets the value of the '{@link uml.ModelType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link uml.ModelType#getName <em>Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Name</em>' attribute is set.
     * @see #unsetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    boolean isSetName();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The default value is <code>"uml:Model"</code>.
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
     * @see uml.UmlPackage#getModelType_Type()
     * @model default="uml:Model" unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='type' namespace='xmei.Franca2EA_XMI_Schema'"
     * @generated
     */
    TypeBaseType getType();

    /**
     * Sets the value of the '{@link uml.ModelType#getType <em>Type</em>}' attribute.
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
     * Unsets the value of the '{@link uml.ModelType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(TypeBaseType)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link uml.ModelType#getType <em>Type</em>}' attribute is set.
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
     * @see uml.UmlPackage#getModelType_Visibility()
     * @model default="public" unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='visibility'"
     * @generated
     */
    VisibilityType getVisibility();

    /**
     * Sets the value of the '{@link uml.ModelType#getVisibility <em>Visibility</em>}' attribute.
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
     * Unsets the value of the '{@link uml.ModelType#getVisibility <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVisibility()
     * @see #getVisibility()
     * @see #setVisibility(VisibilityType)
     * @generated
     */
    void unsetVisibility();

    /**
     * Returns whether the value of the '{@link uml.ModelType#getVisibility <em>Visibility</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Visibility</em>' attribute is set.
     * @see #unsetVisibility()
     * @see #getVisibility()
     * @see #setVisibility(VisibilityType)
     * @generated
     */
    boolean isSetVisibility();

} // ModelType
