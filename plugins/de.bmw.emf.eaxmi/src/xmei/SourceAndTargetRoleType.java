/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

import uml.VisibilityType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source And Target Role Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.SourceAndTargetRoleType#getTargetScope <em>Target Scope</em>}</li>
 *   <li>{@link xmei.SourceAndTargetRoleType#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getSourceAndTargetRoleType()
 * @model extendedMetaData="name='sourceAndTargetRoleType' kind='empty'"
 * @generated
 */
public interface SourceAndTargetRoleType extends EObject
{
    /**
     * Returns the value of the '<em><b>Target Scope</b></em>' attribute.
     * The default value is <code>"instance"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Scope</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Scope</em>' attribute.
     * @see #isSetTargetScope()
     * @see #unsetTargetScope()
     * @see #setTargetScope(String)
     * @see xmei.XmeiPackage#getSourceAndTargetRoleType_TargetScope()
     * @model default="instance" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='targetScope'"
     * @generated
     */
    String getTargetScope();

    /**
     * Sets the value of the '{@link xmei.SourceAndTargetRoleType#getTargetScope <em>Target Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Scope</em>' attribute.
     * @see #isSetTargetScope()
     * @see #unsetTargetScope()
     * @see #getTargetScope()
     * @generated
     */
    void setTargetScope(String value);

    /**
     * Unsets the value of the '{@link xmei.SourceAndTargetRoleType#getTargetScope <em>Target Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetScope()
     * @see #getTargetScope()
     * @see #setTargetScope(String)
     * @generated
     */
    void unsetTargetScope();

    /**
     * Returns whether the value of the '{@link xmei.SourceAndTargetRoleType#getTargetScope <em>Target Scope</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Scope</em>' attribute is set.
     * @see #unsetTargetScope()
     * @see #getTargetScope()
     * @see #setTargetScope(String)
     * @generated
     */
    boolean isSetTargetScope();

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
     * @see xmei.XmeiPackage#getSourceAndTargetRoleType_Visibility()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='visibility'"
     * @generated
     */
    VisibilityType getVisibility();

    /**
     * Sets the value of the '{@link xmei.SourceAndTargetRoleType#getVisibility <em>Visibility</em>}' attribute.
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
     * Unsets the value of the '{@link xmei.SourceAndTargetRoleType#getVisibility <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVisibility()
     * @see #getVisibility()
     * @see #setVisibility(VisibilityType)
     * @generated
     */
    void unsetVisibility();

    /**
     * Returns whether the value of the '{@link xmei.SourceAndTargetRoleType#getVisibility <em>Visibility</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Visibility</em>' attribute is set.
     * @see #unsetVisibility()
     * @see #getVisibility()
     * @see #setVisibility(VisibilityType)
     * @generated
     */
    boolean isSetVisibility();

} // SourceAndTargetRoleType
