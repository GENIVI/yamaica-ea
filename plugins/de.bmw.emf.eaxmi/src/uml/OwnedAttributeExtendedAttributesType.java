/**
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owned Attribute Extended Attributes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.OwnedAttributeExtendedAttributesType#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link uml.OwnedAttributeExtendedAttributesType#getAssociation <em>Association</em>}</li>
 *   <li>{@link uml.OwnedAttributeExtendedAttributesType#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link uml.OwnedAttributeExtendedAttributesType#isIsDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link uml.OwnedAttributeExtendedAttributesType#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link uml.OwnedAttributeExtendedAttributesType#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link uml.OwnedAttributeExtendedAttributesType#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link uml.OwnedAttributeExtendedAttributesType#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link uml.OwnedAttributeExtendedAttributesType#getName <em>Name</em>}</li>
 *   <li>{@link uml.OwnedAttributeExtendedAttributesType#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getOwnedAttributeExtendedAttributesType()
 * @model extendedMetaData="name='ownedAttributeExtendedAttributesType' kind='elementOnly'"
 * @generated
 */
public interface OwnedAttributeExtendedAttributesType extends OwnedAttributeBaseType
{
    /**
     * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Aggregation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Aggregation</em>' attribute.
     * @see #setAggregation(String)
     * @see uml.UmlPackage#getOwnedAttributeExtendedAttributesType_Aggregation()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='aggregation'"
     * @generated
     */
    String getAggregation();

    /**
     * Sets the value of the '{@link uml.OwnedAttributeExtendedAttributesType#getAggregation <em>Aggregation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Aggregation</em>' attribute.
     * @see #getAggregation()
     * @generated
     */
    void setAggregation(String value);

    /**
     * Returns the value of the '<em><b>Association</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Association</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Association</em>' attribute.
     * @see #setAssociation(String)
     * @see uml.UmlPackage#getOwnedAttributeExtendedAttributesType_Association()
     * @model dataType="xmei.IdType"
     *        extendedMetaData="kind='attribute' name='association'"
     * @generated
     */
    String getAssociation();

    /**
     * Sets the value of the '{@link uml.OwnedAttributeExtendedAttributesType#getAssociation <em>Association</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Association</em>' attribute.
     * @see #getAssociation()
     * @generated
     */
    void setAssociation(String value);

    /**
     * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Derived</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Derived</em>' attribute.
     * @see #isSetIsDerived()
     * @see #unsetIsDerived()
     * @see #setIsDerived(boolean)
     * @see uml.UmlPackage#getOwnedAttributeExtendedAttributesType_IsDerived()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isDerived'"
     * @generated
     */
    boolean isIsDerived();

    /**
     * Sets the value of the '{@link uml.OwnedAttributeExtendedAttributesType#isIsDerived <em>Is Derived</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Derived</em>' attribute.
     * @see #isSetIsDerived()
     * @see #unsetIsDerived()
     * @see #isIsDerived()
     * @generated
     */
    void setIsDerived(boolean value);

    /**
     * Unsets the value of the '{@link uml.OwnedAttributeExtendedAttributesType#isIsDerived <em>Is Derived</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsDerived()
     * @see #isIsDerived()
     * @see #setIsDerived(boolean)
     * @generated
     */
    void unsetIsDerived();

    /**
     * Returns whether the value of the '{@link uml.OwnedAttributeExtendedAttributesType#isIsDerived <em>Is Derived</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Derived</em>' attribute is set.
     * @see #unsetIsDerived()
     * @see #isIsDerived()
     * @see #setIsDerived(boolean)
     * @generated
     */
    boolean isSetIsDerived();

    /**
     * Returns the value of the '<em><b>Is Derived Union</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Derived Union</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Derived Union</em>' attribute.
     * @see #isSetIsDerivedUnion()
     * @see #unsetIsDerivedUnion()
     * @see #setIsDerivedUnion(boolean)
     * @see uml.UmlPackage#getOwnedAttributeExtendedAttributesType_IsDerivedUnion()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isDerivedUnion'"
     * @generated
     */
    boolean isIsDerivedUnion();

    /**
     * Sets the value of the '{@link uml.OwnedAttributeExtendedAttributesType#isIsDerivedUnion <em>Is Derived Union</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Derived Union</em>' attribute.
     * @see #isSetIsDerivedUnion()
     * @see #unsetIsDerivedUnion()
     * @see #isIsDerivedUnion()
     * @generated
     */
    void setIsDerivedUnion(boolean value);

    /**
     * Unsets the value of the '{@link uml.OwnedAttributeExtendedAttributesType#isIsDerivedUnion <em>Is Derived Union</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsDerivedUnion()
     * @see #isIsDerivedUnion()
     * @see #setIsDerivedUnion(boolean)
     * @generated
     */
    void unsetIsDerivedUnion();

    /**
     * Returns whether the value of the '{@link uml.OwnedAttributeExtendedAttributesType#isIsDerivedUnion <em>Is Derived Union</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Derived Union</em>' attribute is set.
     * @see #unsetIsDerivedUnion()
     * @see #isIsDerivedUnion()
     * @see #setIsDerivedUnion(boolean)
     * @generated
     */
    boolean isSetIsDerivedUnion();

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
     * @see uml.UmlPackage#getOwnedAttributeExtendedAttributesType_IsOrdered()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isOrdered'"
     * @generated
     */
    boolean isIsOrdered();

    /**
     * Sets the value of the '{@link uml.OwnedAttributeExtendedAttributesType#isIsOrdered <em>Is Ordered</em>}' attribute.
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
     * Unsets the value of the '{@link uml.OwnedAttributeExtendedAttributesType#isIsOrdered <em>Is Ordered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsOrdered()
     * @see #isIsOrdered()
     * @see #setIsOrdered(boolean)
     * @generated
     */
    void unsetIsOrdered();

    /**
     * Returns whether the value of the '{@link uml.OwnedAttributeExtendedAttributesType#isIsOrdered <em>Is Ordered</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Read Only</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Read Only</em>' attribute.
     * @see #isSetIsReadOnly()
     * @see #unsetIsReadOnly()
     * @see #setIsReadOnly(boolean)
     * @see uml.UmlPackage#getOwnedAttributeExtendedAttributesType_IsReadOnly()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isReadOnly'"
     * @generated
     */
    boolean isIsReadOnly();

    /**
     * Sets the value of the '{@link uml.OwnedAttributeExtendedAttributesType#isIsReadOnly <em>Is Read Only</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Read Only</em>' attribute.
     * @see #isSetIsReadOnly()
     * @see #unsetIsReadOnly()
     * @see #isIsReadOnly()
     * @generated
     */
    void setIsReadOnly(boolean value);

    /**
     * Unsets the value of the '{@link uml.OwnedAttributeExtendedAttributesType#isIsReadOnly <em>Is Read Only</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsReadOnly()
     * @see #isIsReadOnly()
     * @see #setIsReadOnly(boolean)
     * @generated
     */
    void unsetIsReadOnly();

    /**
     * Returns whether the value of the '{@link uml.OwnedAttributeExtendedAttributesType#isIsReadOnly <em>Is Read Only</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Read Only</em>' attribute is set.
     * @see #unsetIsReadOnly()
     * @see #isIsReadOnly()
     * @see #setIsReadOnly(boolean)
     * @generated
     */
    boolean isSetIsReadOnly();

    /**
     * Returns the value of the '<em><b>Is Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Static</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Static</em>' attribute.
     * @see #isSetIsStatic()
     * @see #unsetIsStatic()
     * @see #setIsStatic(boolean)
     * @see uml.UmlPackage#getOwnedAttributeExtendedAttributesType_IsStatic()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isStatic'"
     * @generated
     */
    boolean isIsStatic();

    /**
     * Sets the value of the '{@link uml.OwnedAttributeExtendedAttributesType#isIsStatic <em>Is Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Static</em>' attribute.
     * @see #isSetIsStatic()
     * @see #unsetIsStatic()
     * @see #isIsStatic()
     * @generated
     */
    void setIsStatic(boolean value);

    /**
     * Unsets the value of the '{@link uml.OwnedAttributeExtendedAttributesType#isIsStatic <em>Is Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsStatic()
     * @see #isIsStatic()
     * @see #setIsStatic(boolean)
     * @generated
     */
    void unsetIsStatic();

    /**
     * Returns whether the value of the '{@link uml.OwnedAttributeExtendedAttributesType#isIsStatic <em>Is Static</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Static</em>' attribute is set.
     * @see #unsetIsStatic()
     * @see #isIsStatic()
     * @see #setIsStatic(boolean)
     * @generated
     */
    boolean isSetIsStatic();

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
     * @see uml.UmlPackage#getOwnedAttributeExtendedAttributesType_IsUnique()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isUnique'"
     * @generated
     */
    boolean isIsUnique();

    /**
     * Sets the value of the '{@link uml.OwnedAttributeExtendedAttributesType#isIsUnique <em>Is Unique</em>}' attribute.
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
     * Unsets the value of the '{@link uml.OwnedAttributeExtendedAttributesType#isIsUnique <em>Is Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsUnique()
     * @see #isIsUnique()
     * @see #setIsUnique(boolean)
     * @generated
     */
    void unsetIsUnique();

    /**
     * Returns whether the value of the '{@link uml.OwnedAttributeExtendedAttributesType#isIsUnique <em>Is Unique</em>}' attribute is set.
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
     * @see uml.UmlPackage#getOwnedAttributeExtendedAttributesType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link uml.OwnedAttributeExtendedAttributesType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Visibility</b></em>' attribute.
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
     * @see uml.UmlPackage#getOwnedAttributeExtendedAttributesType_Visibility()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='visibility'"
     * @generated
     */
    VisibilityType getVisibility();

    /**
     * Sets the value of the '{@link uml.OwnedAttributeExtendedAttributesType#getVisibility <em>Visibility</em>}' attribute.
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
     * Unsets the value of the '{@link uml.OwnedAttributeExtendedAttributesType#getVisibility <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVisibility()
     * @see #getVisibility()
     * @see #setVisibility(VisibilityType)
     * @generated
     */
    void unsetVisibility();

    /**
     * Returns whether the value of the '{@link uml.OwnedAttributeExtendedAttributesType#getVisibility <em>Visibility</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Visibility</em>' attribute is set.
     * @see #unsetVisibility()
     * @see #getVisibility()
     * @see #setVisibility(VisibilityType)
     * @generated
     */
    boolean isSetVisibility();

} // OwnedAttributeExtendedAttributesType
