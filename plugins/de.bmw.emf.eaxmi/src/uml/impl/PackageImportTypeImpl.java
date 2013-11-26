/**
 */
package uml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml.PackageImportType;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Import Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.PackageImportTypeImpl#getImportedPackage <em>Imported Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImportTypeImpl extends PackagedElementBaseTypeImpl implements PackageImportType
{
    /**
     * The default value of the '{@link #getImportedPackage() <em>Imported Package</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImportedPackage()
     * @generated
     * @ordered
     */
    protected static final String IMPORTED_PACKAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getImportedPackage() <em>Imported Package</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImportedPackage()
     * @generated
     * @ordered
     */
    protected String importedPackage = IMPORTED_PACKAGE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PackageImportTypeImpl()
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
        return UmlPackage.Literals.PACKAGE_IMPORT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getImportedPackage()
    {
        return importedPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImportedPackage(String newImportedPackage)
    {
        String oldImportedPackage = importedPackage;
        importedPackage = newImportedPackage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGE_IMPORT_TYPE__IMPORTED_PACKAGE, oldImportedPackage, importedPackage));
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
            case UmlPackage.PACKAGE_IMPORT_TYPE__IMPORTED_PACKAGE:
                return getImportedPackage();
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
            case UmlPackage.PACKAGE_IMPORT_TYPE__IMPORTED_PACKAGE:
                setImportedPackage((String)newValue);
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
            case UmlPackage.PACKAGE_IMPORT_TYPE__IMPORTED_PACKAGE:
                setImportedPackage(IMPORTED_PACKAGE_EDEFAULT);
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
            case UmlPackage.PACKAGE_IMPORT_TYPE__IMPORTED_PACKAGE:
                return IMPORTED_PACKAGE_EDEFAULT == null ? importedPackage != null : !IMPORTED_PACKAGE_EDEFAULT.equals(importedPackage);
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
        result.append(" (importedPackage: ");
        result.append(importedPackage);
        result.append(')');
        return result.toString();
    }

} //PackageImportTypeImpl
