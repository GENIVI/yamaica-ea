/**
 */
package uml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owned Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.OwnedParameterType#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link uml.OwnedParameterType#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link uml.OwnedParameterType#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link uml.OwnedParameterType#getDirection <em>Direction</em>}</li>
 *   <li>{@link uml.OwnedParameterType#getId <em>Id</em>}</li>
 *   <li>{@link uml.OwnedParameterType#isIsException <em>Is Exception</em>}</li>
 *   <li>{@link uml.OwnedParameterType#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link uml.OwnedParameterType#isIsStream <em>Is Stream</em>}</li>
 *   <li>{@link uml.OwnedParameterType#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link uml.OwnedParameterType#getName <em>Name</em>}</li>
 *   <li>{@link uml.OwnedParameterType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getOwnedParameterType()
 * @model extendedMetaData="name='ownedParameterType' kind='elementOnly'"
 * @generated
 */
public interface OwnedParameterType extends EObject
{
    /**
     * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' containment reference.
     * @see #setDefaultValue(DefaultValueType)
     * @see uml.UmlPackage#getOwnedParameterType_DefaultValue()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='defaultValue'"
     * @generated
     */
    DefaultValueType getDefaultValue();

    /**
     * Sets the value of the '{@link uml.OwnedParameterType#getDefaultValue <em>Default Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' containment reference.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue(DefaultValueType value);

    /**
     * Returns the value of the '<em><b>Lower Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lower Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lower Value</em>' containment reference.
     * @see #setLowerValue(MultiplicityValueType)
     * @see uml.UmlPackage#getOwnedParameterType_LowerValue()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='lowerValue'"
     * @generated
     */
    MultiplicityValueType getLowerValue();

    /**
     * Sets the value of the '{@link uml.OwnedParameterType#getLowerValue <em>Lower Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lower Value</em>' containment reference.
     * @see #getLowerValue()
     * @generated
     */
    void setLowerValue(MultiplicityValueType value);

    /**
     * Returns the value of the '<em><b>Upper Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Upper Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Upper Value</em>' containment reference.
     * @see #setUpperValue(MultiplicityValueType)
     * @see uml.UmlPackage#getOwnedParameterType_UpperValue()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='upperValue'"
     * @generated
     */
    MultiplicityValueType getUpperValue();

    /**
     * Sets the value of the '{@link uml.OwnedParameterType#getUpperValue <em>Upper Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Upper Value</em>' containment reference.
     * @see #getUpperValue()
     * @generated
     */
    void setUpperValue(MultiplicityValueType value);

    /**
     * Returns the value of the '<em><b>Direction</b></em>' attribute.
     * The literals are from the enumeration {@link uml.DirectionType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Direction</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Direction</em>' attribute.
     * @see uml.DirectionType
     * @see #isSetDirection()
     * @see #unsetDirection()
     * @see #setDirection(DirectionType)
     * @see uml.UmlPackage#getOwnedParameterType_Direction()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='direction'"
     * @generated
     */
    DirectionType getDirection();

    /**
     * Sets the value of the '{@link uml.OwnedParameterType#getDirection <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Direction</em>' attribute.
     * @see uml.DirectionType
     * @see #isSetDirection()
     * @see #unsetDirection()
     * @see #getDirection()
     * @generated
     */
    void setDirection(DirectionType value);

    /**
     * Unsets the value of the '{@link uml.OwnedParameterType#getDirection <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDirection()
     * @see #getDirection()
     * @see #setDirection(DirectionType)
     * @generated
     */
    void unsetDirection();

    /**
     * Returns whether the value of the '{@link uml.OwnedParameterType#getDirection <em>Direction</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Direction</em>' attribute is set.
     * @see #unsetDirection()
     * @see #getDirection()
     * @see #setDirection(DirectionType)
     * @generated
     */
    boolean isSetDirection();

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
     * @see uml.UmlPackage#getOwnedParameterType_Id()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='id' namespace='xmei.Franca2EA_XMI_Schema'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link uml.OwnedParameterType#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Is Exception</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Exception</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Exception</em>' attribute.
     * @see #isSetIsException()
     * @see #unsetIsException()
     * @see #setIsException(boolean)
     * @see uml.UmlPackage#getOwnedParameterType_IsException()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
     *        extendedMetaData="kind='attribute' name='isException'"
     * @generated
     */
    boolean isIsException();

    /**
     * Sets the value of the '{@link uml.OwnedParameterType#isIsException <em>Is Exception</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Exception</em>' attribute.
     * @see #isSetIsException()
     * @see #unsetIsException()
     * @see #isIsException()
     * @generated
     */
    void setIsException(boolean value);

    /**
     * Unsets the value of the '{@link uml.OwnedParameterType#isIsException <em>Is Exception</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsException()
     * @see #isIsException()
     * @see #setIsException(boolean)
     * @generated
     */
    void unsetIsException();

    /**
     * Returns whether the value of the '{@link uml.OwnedParameterType#isIsException <em>Is Exception</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Exception</em>' attribute is set.
     * @see #unsetIsException()
     * @see #isIsException()
     * @see #setIsException(boolean)
     * @generated
     */
    boolean isSetIsException();

    /**
     * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Ordered</em>' attribute.
     * @see #isSetIsOrdered()
     * @see #unsetIsOrdered()
     * @see #setIsOrdered(boolean)
     * @see uml.UmlPackage#getOwnedParameterType_IsOrdered()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
     *        extendedMetaData="kind='attribute' name='isOrdered'"
     * @generated
     */
    boolean isIsOrdered();

    /**
     * Sets the value of the '{@link uml.OwnedParameterType#isIsOrdered <em>Is Ordered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Ordered</em>' attribute.
     * @see #isSetIsOrdered()
     * @see #unsetIsOrdered()
     * @see #isIsOrdered()
     * @generated
     */
    void setIsOrdered(boolean value);

    /**
     * Unsets the value of the '{@link uml.OwnedParameterType#isIsOrdered <em>Is Ordered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsOrdered()
     * @see #isIsOrdered()
     * @see #setIsOrdered(boolean)
     * @generated
     */
    void unsetIsOrdered();

    /**
     * Returns whether the value of the '{@link uml.OwnedParameterType#isIsOrdered <em>Is Ordered</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Ordered</em>' attribute is set.
     * @see #unsetIsOrdered()
     * @see #isIsOrdered()
     * @see #setIsOrdered(boolean)
     * @generated
     */
    boolean isSetIsOrdered();

    /**
     * Returns the value of the '<em><b>Is Stream</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Stream</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Stream</em>' attribute.
     * @see #isSetIsStream()
     * @see #unsetIsStream()
     * @see #setIsStream(boolean)
     * @see uml.UmlPackage#getOwnedParameterType_IsStream()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
     *        extendedMetaData="kind='attribute' name='isStream'"
     * @generated
     */
    boolean isIsStream();

    /**
     * Sets the value of the '{@link uml.OwnedParameterType#isIsStream <em>Is Stream</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Stream</em>' attribute.
     * @see #isSetIsStream()
     * @see #unsetIsStream()
     * @see #isIsStream()
     * @generated
     */
    void setIsStream(boolean value);

    /**
     * Unsets the value of the '{@link uml.OwnedParameterType#isIsStream <em>Is Stream</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsStream()
     * @see #isIsStream()
     * @see #setIsStream(boolean)
     * @generated
     */
    void unsetIsStream();

    /**
     * Returns whether the value of the '{@link uml.OwnedParameterType#isIsStream <em>Is Stream</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Stream</em>' attribute is set.
     * @see #unsetIsStream()
     * @see #isIsStream()
     * @see #setIsStream(boolean)
     * @generated
     */
    boolean isSetIsStream();

    /**
     * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Unique</em>' attribute.
     * @see #isSetIsUnique()
     * @see #unsetIsUnique()
     * @see #setIsUnique(boolean)
     * @see uml.UmlPackage#getOwnedParameterType_IsUnique()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
     *        extendedMetaData="kind='attribute' name='isUnique'"
     * @generated
     */
    boolean isIsUnique();

    /**
     * Sets the value of the '{@link uml.OwnedParameterType#isIsUnique <em>Is Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Unique</em>' attribute.
     * @see #isSetIsUnique()
     * @see #unsetIsUnique()
     * @see #isIsUnique()
     * @generated
     */
    void setIsUnique(boolean value);

    /**
     * Unsets the value of the '{@link uml.OwnedParameterType#isIsUnique <em>Is Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsUnique()
     * @see #isIsUnique()
     * @see #setIsUnique(boolean)
     * @generated
     */
    void unsetIsUnique();

    /**
     * Returns whether the value of the '{@link uml.OwnedParameterType#isIsUnique <em>Is Unique</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Unique</em>' attribute is set.
     * @see #unsetIsUnique()
     * @see #isIsUnique()
     * @see #setIsUnique(boolean)
     * @generated
     */
    boolean isSetIsUnique();

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
     * @see uml.UmlPackage#getOwnedParameterType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link uml.OwnedParameterType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see uml.UmlPackage#getOwnedParameterType_Type()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link uml.OwnedParameterType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

} // OwnedParameterType
