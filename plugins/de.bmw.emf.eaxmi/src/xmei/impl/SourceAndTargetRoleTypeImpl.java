/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uml.VisibilityType;

import xmei.SourceAndTargetRoleType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source And Target Role Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.SourceAndTargetRoleTypeImpl#getTargetScope <em>Target Scope</em>}</li>
 *   <li>{@link xmei.impl.SourceAndTargetRoleTypeImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceAndTargetRoleTypeImpl extends MinimalEObjectImpl.Container implements SourceAndTargetRoleType
{
    /**
     * The default value of the '{@link #getTargetScope() <em>Target Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetScope()
     * @generated
     * @ordered
     */
    protected static final String TARGET_SCOPE_EDEFAULT = "instance";

    /**
     * The cached value of the '{@link #getTargetScope() <em>Target Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetScope()
     * @generated
     * @ordered
     */
    protected String targetScope = TARGET_SCOPE_EDEFAULT;

    /**
     * This is true if the Target Scope attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetScopeESet;

    /**
     * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVisibility()
     * @generated
     * @ordered
     */
    protected static final VisibilityType VISIBILITY_EDEFAULT = VisibilityType.PUBLIC;

    /**
     * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVisibility()
     * @generated
     * @ordered
     */
    protected VisibilityType visibility = VISIBILITY_EDEFAULT;

    /**
     * This is true if the Visibility attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean visibilityESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SourceAndTargetRoleTypeImpl()
    {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass()
    {
        return XmeiPackage.Literals.SOURCE_AND_TARGET_ROLE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTargetScope()
    {
        return targetScope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetScope(String newTargetScope)
    {
        String oldTargetScope = targetScope;
        targetScope = newTargetScope;
        boolean oldTargetScopeESet = targetScopeESet;
        targetScopeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_ROLE_TYPE__TARGET_SCOPE, oldTargetScope, targetScope, !oldTargetScopeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTargetScope()
    {
        String oldTargetScope = targetScope;
        boolean oldTargetScopeESet = targetScopeESet;
        targetScope = TARGET_SCOPE_EDEFAULT;
        targetScopeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.SOURCE_AND_TARGET_ROLE_TYPE__TARGET_SCOPE, oldTargetScope, TARGET_SCOPE_EDEFAULT, oldTargetScopeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTargetScope()
    {
        return targetScopeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VisibilityType getVisibility()
    {
        return visibility;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVisibility(VisibilityType newVisibility)
    {
        VisibilityType oldVisibility = visibility;
        visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
        boolean oldVisibilityESet = visibilityESet;
        visibilityESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_ROLE_TYPE__VISIBILITY, oldVisibility, visibility, !oldVisibilityESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetVisibility()
    {
        VisibilityType oldVisibility = visibility;
        boolean oldVisibilityESet = visibilityESet;
        visibility = VISIBILITY_EDEFAULT;
        visibilityESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.SOURCE_AND_TARGET_ROLE_TYPE__VISIBILITY, oldVisibility, VISIBILITY_EDEFAULT, oldVisibilityESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetVisibility()
    {
        return visibilityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType)
    {
        switch (featureID)
        {
            case XmeiPackage.SOURCE_AND_TARGET_ROLE_TYPE__TARGET_SCOPE:
                return getTargetScope();
            case XmeiPackage.SOURCE_AND_TARGET_ROLE_TYPE__VISIBILITY:
                return getVisibility();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue)
    {
        switch (featureID)
        {
            case XmeiPackage.SOURCE_AND_TARGET_ROLE_TYPE__TARGET_SCOPE:
                setTargetScope((String)newValue);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_ROLE_TYPE__VISIBILITY:
                setVisibility((VisibilityType)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID)
    {
        switch (featureID)
        {
            case XmeiPackage.SOURCE_AND_TARGET_ROLE_TYPE__TARGET_SCOPE:
                unsetTargetScope();
                return;
            case XmeiPackage.SOURCE_AND_TARGET_ROLE_TYPE__VISIBILITY:
                unsetVisibility();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID)
    {
        switch (featureID)
        {
            case XmeiPackage.SOURCE_AND_TARGET_ROLE_TYPE__TARGET_SCOPE:
                return isSetTargetScope();
            case XmeiPackage.SOURCE_AND_TARGET_ROLE_TYPE__VISIBILITY:
                return isSetVisibility();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString()
    {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (targetScope: ");
        if (targetScopeESet) result.append(targetScope); else result.append("<unset>");
        result.append(", visibility: ");
        if (visibilityESet) result.append(visibility); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //SourceAndTargetRoleTypeImpl
