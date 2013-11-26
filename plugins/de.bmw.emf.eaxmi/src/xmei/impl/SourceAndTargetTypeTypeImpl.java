/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xmei.SourceAndTargetTypeType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source And Target Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.SourceAndTargetTypeTypeImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link xmei.impl.SourceAndTargetTypeTypeImpl#getContainment <em>Containment</em>}</li>
 *   <li>{@link xmei.impl.SourceAndTargetTypeTypeImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceAndTargetTypeTypeImpl extends MinimalEObjectImpl.Container implements SourceAndTargetTypeType
{
    /**
     * The default value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregation()
     * @generated
     * @ordered
     */
    protected static final String AGGREGATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregation()
     * @generated
     * @ordered
     */
    protected String aggregation = AGGREGATION_EDEFAULT;

    /**
     * The default value of the '{@link #getContainment() <em>Containment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainment()
     * @generated
     * @ordered
     */
    protected static final String CONTAINMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getContainment() <em>Containment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainment()
     * @generated
     * @ordered
     */
    protected String containment = CONTAINMENT_EDEFAULT;

    /**
     * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMultiplicity()
     * @generated
     * @ordered
     */
    protected static final String MULTIPLICITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMultiplicity()
     * @generated
     * @ordered
     */
    protected String multiplicity = MULTIPLICITY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SourceAndTargetTypeTypeImpl()
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
        return XmeiPackage.Literals.SOURCE_AND_TARGET_TYPE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAggregation()
    {
        return aggregation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAggregation(String newAggregation)
    {
        String oldAggregation = aggregation;
        aggregation = newAggregation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_TYPE_TYPE__AGGREGATION, oldAggregation, aggregation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getContainment()
    {
        return containment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainment(String newContainment)
    {
        String oldContainment = containment;
        containment = newContainment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_TYPE_TYPE__CONTAINMENT, oldContainment, containment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMultiplicity()
    {
        return multiplicity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMultiplicity(String newMultiplicity)
    {
        String oldMultiplicity = multiplicity;
        multiplicity = newMultiplicity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_TYPE_TYPE__MULTIPLICITY, oldMultiplicity, multiplicity));
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
            case XmeiPackage.SOURCE_AND_TARGET_TYPE_TYPE__AGGREGATION:
                return getAggregation();
            case XmeiPackage.SOURCE_AND_TARGET_TYPE_TYPE__CONTAINMENT:
                return getContainment();
            case XmeiPackage.SOURCE_AND_TARGET_TYPE_TYPE__MULTIPLICITY:
                return getMultiplicity();
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
            case XmeiPackage.SOURCE_AND_TARGET_TYPE_TYPE__AGGREGATION:
                setAggregation((String)newValue);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE_TYPE__CONTAINMENT:
                setContainment((String)newValue);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE_TYPE__MULTIPLICITY:
                setMultiplicity((String)newValue);
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
            case XmeiPackage.SOURCE_AND_TARGET_TYPE_TYPE__AGGREGATION:
                setAggregation(AGGREGATION_EDEFAULT);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE_TYPE__CONTAINMENT:
                setContainment(CONTAINMENT_EDEFAULT);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE_TYPE__MULTIPLICITY:
                setMultiplicity(MULTIPLICITY_EDEFAULT);
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
            case XmeiPackage.SOURCE_AND_TARGET_TYPE_TYPE__AGGREGATION:
                return AGGREGATION_EDEFAULT == null ? aggregation != null : !AGGREGATION_EDEFAULT.equals(aggregation);
            case XmeiPackage.SOURCE_AND_TARGET_TYPE_TYPE__CONTAINMENT:
                return CONTAINMENT_EDEFAULT == null ? containment != null : !CONTAINMENT_EDEFAULT.equals(containment);
            case XmeiPackage.SOURCE_AND_TARGET_TYPE_TYPE__MULTIPLICITY:
                return MULTIPLICITY_EDEFAULT == null ? multiplicity != null : !MULTIPLICITY_EDEFAULT.equals(multiplicity);
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
        result.append(" (aggregation: ");
        result.append(aggregation);
        result.append(", containment: ");
        result.append(containment);
        result.append(", multiplicity: ");
        result.append(multiplicity);
        result.append(')');
        return result.toString();
    }

} //SourceAndTargetTypeTypeImpl
