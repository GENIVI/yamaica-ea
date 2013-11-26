/**
 */
package xmei.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xmei.ConcreteLinkType;
import xmei.LinksType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Links Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.LinksTypeImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link xmei.impl.LinksTypeImpl#getRealisation <em>Realisation</em>}</li>
 *   <li>{@link xmei.impl.LinksTypeImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link xmei.impl.LinksTypeImpl#getDependency <em>Dependency</em>}</li>
 *   <li>{@link xmei.impl.LinksTypeImpl#getAssociation <em>Association</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinksTypeImpl extends MinimalEObjectImpl.Container implements LinksType
{
    /**
     * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequence()
     * @generated
     * @ordered
     */
    protected EList<ConcreteLinkType> sequence;

    /**
     * The cached value of the '{@link #getRealisation() <em>Realisation</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRealisation()
     * @generated
     * @ordered
     */
    protected EList<ConcreteLinkType> realisation;

    /**
     * The cached value of the '{@link #getGeneralization() <em>Generalization</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeneralization()
     * @generated
     * @ordered
     */
    protected EList<ConcreteLinkType> generalization;

    /**
     * The cached value of the '{@link #getDependency() <em>Dependency</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDependency()
     * @generated
     * @ordered
     */
    protected EList<ConcreteLinkType> dependency;

    /**
     * The cached value of the '{@link #getAssociation() <em>Association</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssociation()
     * @generated
     * @ordered
     */
    protected EList<ConcreteLinkType> association;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LinksTypeImpl()
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
        return XmeiPackage.Literals.LINKS_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConcreteLinkType> getSequence()
    {
        if (sequence == null)
        {
            sequence = new EObjectContainmentEList<ConcreteLinkType>(ConcreteLinkType.class, this, XmeiPackage.LINKS_TYPE__SEQUENCE);
        }
        return sequence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConcreteLinkType> getRealisation()
    {
        if (realisation == null)
        {
            realisation = new EObjectContainmentEList<ConcreteLinkType>(ConcreteLinkType.class, this, XmeiPackage.LINKS_TYPE__REALISATION);
        }
        return realisation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConcreteLinkType> getGeneralization()
    {
        if (generalization == null)
        {
            generalization = new EObjectContainmentEList<ConcreteLinkType>(ConcreteLinkType.class, this, XmeiPackage.LINKS_TYPE__GENERALIZATION);
        }
        return generalization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConcreteLinkType> getDependency()
    {
        if (dependency == null)
        {
            dependency = new EObjectContainmentEList<ConcreteLinkType>(ConcreteLinkType.class, this, XmeiPackage.LINKS_TYPE__DEPENDENCY);
        }
        return dependency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConcreteLinkType> getAssociation()
    {
        if (association == null)
        {
            association = new EObjectContainmentEList<ConcreteLinkType>(ConcreteLinkType.class, this, XmeiPackage.LINKS_TYPE__ASSOCIATION);
        }
        return association;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
    {
        switch (featureID)
        {
            case XmeiPackage.LINKS_TYPE__SEQUENCE:
                return ((InternalEList<?>)getSequence()).basicRemove(otherEnd, msgs);
            case XmeiPackage.LINKS_TYPE__REALISATION:
                return ((InternalEList<?>)getRealisation()).basicRemove(otherEnd, msgs);
            case XmeiPackage.LINKS_TYPE__GENERALIZATION:
                return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
            case XmeiPackage.LINKS_TYPE__DEPENDENCY:
                return ((InternalEList<?>)getDependency()).basicRemove(otherEnd, msgs);
            case XmeiPackage.LINKS_TYPE__ASSOCIATION:
                return ((InternalEList<?>)getAssociation()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
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
            case XmeiPackage.LINKS_TYPE__SEQUENCE:
                return getSequence();
            case XmeiPackage.LINKS_TYPE__REALISATION:
                return getRealisation();
            case XmeiPackage.LINKS_TYPE__GENERALIZATION:
                return getGeneralization();
            case XmeiPackage.LINKS_TYPE__DEPENDENCY:
                return getDependency();
            case XmeiPackage.LINKS_TYPE__ASSOCIATION:
                return getAssociation();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue)
    {
        switch (featureID)
        {
            case XmeiPackage.LINKS_TYPE__SEQUENCE:
                getSequence().clear();
                getSequence().addAll((Collection<? extends ConcreteLinkType>)newValue);
                return;
            case XmeiPackage.LINKS_TYPE__REALISATION:
                getRealisation().clear();
                getRealisation().addAll((Collection<? extends ConcreteLinkType>)newValue);
                return;
            case XmeiPackage.LINKS_TYPE__GENERALIZATION:
                getGeneralization().clear();
                getGeneralization().addAll((Collection<? extends ConcreteLinkType>)newValue);
                return;
            case XmeiPackage.LINKS_TYPE__DEPENDENCY:
                getDependency().clear();
                getDependency().addAll((Collection<? extends ConcreteLinkType>)newValue);
                return;
            case XmeiPackage.LINKS_TYPE__ASSOCIATION:
                getAssociation().clear();
                getAssociation().addAll((Collection<? extends ConcreteLinkType>)newValue);
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
            case XmeiPackage.LINKS_TYPE__SEQUENCE:
                getSequence().clear();
                return;
            case XmeiPackage.LINKS_TYPE__REALISATION:
                getRealisation().clear();
                return;
            case XmeiPackage.LINKS_TYPE__GENERALIZATION:
                getGeneralization().clear();
                return;
            case XmeiPackage.LINKS_TYPE__DEPENDENCY:
                getDependency().clear();
                return;
            case XmeiPackage.LINKS_TYPE__ASSOCIATION:
                getAssociation().clear();
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
            case XmeiPackage.LINKS_TYPE__SEQUENCE:
                return sequence != null && !sequence.isEmpty();
            case XmeiPackage.LINKS_TYPE__REALISATION:
                return realisation != null && !realisation.isEmpty();
            case XmeiPackage.LINKS_TYPE__GENERALIZATION:
                return generalization != null && !generalization.isEmpty();
            case XmeiPackage.LINKS_TYPE__DEPENDENCY:
                return dependency != null && !dependency.isEmpty();
            case XmeiPackage.LINKS_TYPE__ASSOCIATION:
                return association != null && !association.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //LinksTypeImpl
