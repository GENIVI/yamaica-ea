/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

import uml.VisibilityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.PropertiesType#getClassName <em>Class Name</em>}</li>
 *   <li>{@link xmei.PropertiesType#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link xmei.PropertiesType#getGenlinks <em>Genlinks</em>}</li>
 *   <li>{@link xmei.PropertiesType#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link xmei.PropertiesType#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link xmei.PropertiesType#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link xmei.PropertiesType#isIsRoot <em>Is Root</em>}</li>
 *   <li>{@link xmei.PropertiesType#isIsSpecification <em>Is Specification</em>}</li>
 *   <li>{@link xmei.PropertiesType#getScope <em>Scope</em>}</li>
 *   <li>{@link xmei.PropertiesType#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link xmei.PropertiesType#getSType <em>SType</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getPropertiesType()
 * @model extendedMetaData="name='propertiesType' kind='empty'"
 * @generated
 */
public interface PropertiesType extends EObject
{
    /**
     * Returns the value of the '<em><b>Class Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Class Name</em>' attribute.
     * @see #setClassName(String)
     * @see xmei.XmeiPackage#getPropertiesType_ClassName()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='className'"
     * @generated
     */
    String getClassName();

    /**
     * Sets the value of the '{@link xmei.PropertiesType#getClassName <em>Class Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Class Name</em>' attribute.
     * @see #getClassName()
     * @generated
     */
    void setClassName(String value);

    /**
     * Returns the value of the '<em><b>Documentation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Documentation</em>' attribute.
     * @see #setDocumentation(String)
     * @see xmei.XmeiPackage#getPropertiesType_Documentation()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='documentation'"
     * @generated
     */
    String getDocumentation();

    /**
     * Sets the value of the '{@link xmei.PropertiesType#getDocumentation <em>Documentation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Documentation</em>' attribute.
     * @see #getDocumentation()
     * @generated
     */
    void setDocumentation(String value);

    /**
     * Returns the value of the '<em><b>Genlinks</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Genlinks</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Genlinks</em>' attribute.
     * @see #setGenlinks(String)
     * @see xmei.XmeiPackage#getPropertiesType_Genlinks()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='genlinks'"
     * @generated
     */
    String getGenlinks();

    /**
     * Sets the value of the '{@link xmei.PropertiesType#getGenlinks <em>Genlinks</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Genlinks</em>' attribute.
     * @see #getGenlinks()
     * @generated
     */
    void setGenlinks(String value);

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
     * @see xmei.XmeiPackage#getPropertiesType_IsAbstract()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isAbstract'"
     * @generated
     */
    boolean isIsAbstract();

    /**
     * Sets the value of the '{@link xmei.PropertiesType#isIsAbstract <em>Is Abstract</em>}' attribute.
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
     * Unsets the value of the '{@link xmei.PropertiesType#isIsAbstract <em>Is Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsAbstract()
     * @see #isIsAbstract()
     * @see #setIsAbstract(boolean)
     * @generated
     */
    void unsetIsAbstract();

    /**
     * Returns whether the value of the '{@link xmei.PropertiesType#isIsAbstract <em>Is Abstract</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Abstract</em>' attribute is set.
     * @see #unsetIsAbstract()
     * @see #isIsAbstract()
     * @see #setIsAbstract(boolean)
     * @generated
     */
    boolean isSetIsAbstract();

    /**
     * Returns the value of the '<em><b>Is Active</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Active</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Active</em>' attribute.
     * @see #isSetIsActive()
     * @see #unsetIsActive()
     * @see #setIsActive(boolean)
     * @see xmei.XmeiPackage#getPropertiesType_IsActive()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isActive'"
     * @generated
     */
    boolean isIsActive();

    /**
     * Sets the value of the '{@link xmei.PropertiesType#isIsActive <em>Is Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Active</em>' attribute.
     * @see #isSetIsActive()
     * @see #unsetIsActive()
     * @see #isIsActive()
     * @generated
     */
    void setIsActive(boolean value);

    /**
     * Unsets the value of the '{@link xmei.PropertiesType#isIsActive <em>Is Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsActive()
     * @see #isIsActive()
     * @see #setIsActive(boolean)
     * @generated
     */
    void unsetIsActive();

    /**
     * Returns whether the value of the '{@link xmei.PropertiesType#isIsActive <em>Is Active</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Active</em>' attribute is set.
     * @see #unsetIsActive()
     * @see #isIsActive()
     * @see #setIsActive(boolean)
     * @generated
     */
    boolean isSetIsActive();

    /**
     * Returns the value of the '<em><b>Is Leaf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Leaf</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Leaf</em>' attribute.
     * @see #isSetIsLeaf()
     * @see #unsetIsLeaf()
     * @see #setIsLeaf(boolean)
     * @see xmei.XmeiPackage#getPropertiesType_IsLeaf()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isLeaf'"
     * @generated
     */
    boolean isIsLeaf();

    /**
     * Sets the value of the '{@link xmei.PropertiesType#isIsLeaf <em>Is Leaf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Leaf</em>' attribute.
     * @see #isSetIsLeaf()
     * @see #unsetIsLeaf()
     * @see #isIsLeaf()
     * @generated
     */
    void setIsLeaf(boolean value);

    /**
     * Unsets the value of the '{@link xmei.PropertiesType#isIsLeaf <em>Is Leaf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsLeaf()
     * @see #isIsLeaf()
     * @see #setIsLeaf(boolean)
     * @generated
     */
    void unsetIsLeaf();

    /**
     * Returns whether the value of the '{@link xmei.PropertiesType#isIsLeaf <em>Is Leaf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Leaf</em>' attribute is set.
     * @see #unsetIsLeaf()
     * @see #isIsLeaf()
     * @see #setIsLeaf(boolean)
     * @generated
     */
    boolean isSetIsLeaf();

    /**
     * Returns the value of the '<em><b>Is Root</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Root</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Root</em>' attribute.
     * @see #isSetIsRoot()
     * @see #unsetIsRoot()
     * @see #setIsRoot(boolean)
     * @see xmei.XmeiPackage#getPropertiesType_IsRoot()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isRoot'"
     * @generated
     */
    boolean isIsRoot();

    /**
     * Sets the value of the '{@link xmei.PropertiesType#isIsRoot <em>Is Root</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Root</em>' attribute.
     * @see #isSetIsRoot()
     * @see #unsetIsRoot()
     * @see #isIsRoot()
     * @generated
     */
    void setIsRoot(boolean value);

    /**
     * Unsets the value of the '{@link xmei.PropertiesType#isIsRoot <em>Is Root</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsRoot()
     * @see #isIsRoot()
     * @see #setIsRoot(boolean)
     * @generated
     */
    void unsetIsRoot();

    /**
     * Returns whether the value of the '{@link xmei.PropertiesType#isIsRoot <em>Is Root</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Root</em>' attribute is set.
     * @see #unsetIsRoot()
     * @see #isIsRoot()
     * @see #setIsRoot(boolean)
     * @generated
     */
    boolean isSetIsRoot();

    /**
     * Returns the value of the '<em><b>Is Specification</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Specification</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Specification</em>' attribute.
     * @see #isSetIsSpecification()
     * @see #unsetIsSpecification()
     * @see #setIsSpecification(boolean)
     * @see xmei.XmeiPackage#getPropertiesType_IsSpecification()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isSpecification'"
     * @generated
     */
    boolean isIsSpecification();

    /**
     * Sets the value of the '{@link xmei.PropertiesType#isIsSpecification <em>Is Specification</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Specification</em>' attribute.
     * @see #isSetIsSpecification()
     * @see #unsetIsSpecification()
     * @see #isIsSpecification()
     * @generated
     */
    void setIsSpecification(boolean value);

    /**
     * Unsets the value of the '{@link xmei.PropertiesType#isIsSpecification <em>Is Specification</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsSpecification()
     * @see #isIsSpecification()
     * @see #setIsSpecification(boolean)
     * @generated
     */
    void unsetIsSpecification();

    /**
     * Returns whether the value of the '{@link xmei.PropertiesType#isIsSpecification <em>Is Specification</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Specification</em>' attribute is set.
     * @see #unsetIsSpecification()
     * @see #isIsSpecification()
     * @see #setIsSpecification(boolean)
     * @generated
     */
    boolean isSetIsSpecification();

    /**
     * Returns the value of the '<em><b>Scope</b></em>' attribute.
     * The literals are from the enumeration {@link uml.VisibilityType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scope</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scope</em>' attribute.
     * @see uml.VisibilityType
     * @see #isSetScope()
     * @see #unsetScope()
     * @see #setScope(VisibilityType)
     * @see xmei.XmeiPackage#getPropertiesType_Scope()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='scope'"
     * @generated
     */
    VisibilityType getScope();

    /**
     * Sets the value of the '{@link xmei.PropertiesType#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scope</em>' attribute.
     * @see uml.VisibilityType
     * @see #isSetScope()
     * @see #unsetScope()
     * @see #getScope()
     * @generated
     */
    void setScope(VisibilityType value);

    /**
     * Unsets the value of the '{@link xmei.PropertiesType#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScope()
     * @see #getScope()
     * @see #setScope(VisibilityType)
     * @generated
     */
    void unsetScope();

    /**
     * Returns whether the value of the '{@link xmei.PropertiesType#getScope <em>Scope</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scope</em>' attribute is set.
     * @see #unsetScope()
     * @see #getScope()
     * @see #setScope(VisibilityType)
     * @generated
     */
    boolean isSetScope();

    /**
     * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
     * The literals are from the enumeration {@link xmei.StereotypeType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stereotype</em>' attribute.
     * @see xmei.StereotypeType
     * @see #isSetStereotype()
     * @see #unsetStereotype()
     * @see #setStereotype(StereotypeType)
     * @see xmei.XmeiPackage#getPropertiesType_Stereotype()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='stereotype'"
     * @generated
     */
    StereotypeType getStereotype();

    /**
     * Sets the value of the '{@link xmei.PropertiesType#getStereotype <em>Stereotype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stereotype</em>' attribute.
     * @see xmei.StereotypeType
     * @see #isSetStereotype()
     * @see #unsetStereotype()
     * @see #getStereotype()
     * @generated
     */
    void setStereotype(StereotypeType value);

    /**
     * Unsets the value of the '{@link xmei.PropertiesType#getStereotype <em>Stereotype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStereotype()
     * @see #getStereotype()
     * @see #setStereotype(StereotypeType)
     * @generated
     */
    void unsetStereotype();

    /**
     * Returns whether the value of the '{@link xmei.PropertiesType#getStereotype <em>Stereotype</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Stereotype</em>' attribute is set.
     * @see #unsetStereotype()
     * @see #getStereotype()
     * @see #setStereotype(StereotypeType)
     * @generated
     */
    boolean isSetStereotype();

    /**
     * Returns the value of the '<em><b>SType</b></em>' attribute.
     * The literals are from the enumeration {@link xmei.STypeType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>SType</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>SType</em>' attribute.
     * @see xmei.STypeType
     * @see #isSetSType()
     * @see #unsetSType()
     * @see #setSType(STypeType)
     * @see xmei.XmeiPackage#getPropertiesType_SType()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='sType'"
     * @generated
     */
    STypeType getSType();

    /**
     * Sets the value of the '{@link xmei.PropertiesType#getSType <em>SType</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>SType</em>' attribute.
     * @see xmei.STypeType
     * @see #isSetSType()
     * @see #unsetSType()
     * @see #getSType()
     * @generated
     */
    void setSType(STypeType value);

    /**
     * Unsets the value of the '{@link xmei.PropertiesType#getSType <em>SType</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSType()
     * @see #getSType()
     * @see #setSType(STypeType)
     * @generated
     */
    void unsetSType();

    /**
     * Returns whether the value of the '{@link xmei.PropertiesType#getSType <em>SType</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>SType</em>' attribute is set.
     * @see #unsetSType()
     * @see #getSType()
     * @see #setSType(STypeType)
     * @generated
     */
    boolean isSetSType();

} // PropertiesType
