/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xmei.ConnectorAppearanceType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Appearance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.ConnectorAppearanceTypeImpl#getHeadStyle <em>Head Style</em>}</li>
 *   <li>{@link xmei.impl.ConnectorAppearanceTypeImpl#getLinecolor <em>Linecolor</em>}</li>
 *   <li>{@link xmei.impl.ConnectorAppearanceTypeImpl#getLinemode <em>Linemode</em>}</li>
 *   <li>{@link xmei.impl.ConnectorAppearanceTypeImpl#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link xmei.impl.ConnectorAppearanceTypeImpl#getLinewidth <em>Linewidth</em>}</li>
 *   <li>{@link xmei.impl.ConnectorAppearanceTypeImpl#getSeqno <em>Seqno</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorAppearanceTypeImpl extends MinimalEObjectImpl.Container implements ConnectorAppearanceType
{
    /**
     * The default value of the '{@link #getHeadStyle() <em>Head Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeadStyle()
     * @generated
     * @ordered
     */
    protected static final int HEAD_STYLE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getHeadStyle() <em>Head Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHeadStyle()
     * @generated
     * @ordered
     */
    protected int headStyle = HEAD_STYLE_EDEFAULT;

    /**
     * This is true if the Head Style attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean headStyleESet;

    /**
     * The default value of the '{@link #getLinecolor() <em>Linecolor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLinecolor()
     * @generated
     * @ordered
     */
    protected static final int LINECOLOR_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getLinecolor() <em>Linecolor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLinecolor()
     * @generated
     * @ordered
     */
    protected int linecolor = LINECOLOR_EDEFAULT;

    /**
     * This is true if the Linecolor attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean linecolorESet;

    /**
     * The default value of the '{@link #getLinemode() <em>Linemode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLinemode()
     * @generated
     * @ordered
     */
    protected static final int LINEMODE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getLinemode() <em>Linemode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLinemode()
     * @generated
     * @ordered
     */
    protected int linemode = LINEMODE_EDEFAULT;

    /**
     * This is true if the Linemode attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean linemodeESet;

    /**
     * The default value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLineStyle()
     * @generated
     * @ordered
     */
    protected static final int LINE_STYLE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLineStyle()
     * @generated
     * @ordered
     */
    protected int lineStyle = LINE_STYLE_EDEFAULT;

    /**
     * This is true if the Line Style attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lineStyleESet;

    /**
     * The default value of the '{@link #getLinewidth() <em>Linewidth</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLinewidth()
     * @generated
     * @ordered
     */
    protected static final int LINEWIDTH_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getLinewidth() <em>Linewidth</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLinewidth()
     * @generated
     * @ordered
     */
    protected int linewidth = LINEWIDTH_EDEFAULT;

    /**
     * This is true if the Linewidth attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean linewidthESet;

    /**
     * The default value of the '{@link #getSeqno() <em>Seqno</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeqno()
     * @generated
     * @ordered
     */
    protected static final int SEQNO_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getSeqno() <em>Seqno</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeqno()
     * @generated
     * @ordered
     */
    protected int seqno = SEQNO_EDEFAULT;

    /**
     * This is true if the Seqno attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean seqnoESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectorAppearanceTypeImpl()
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
        return XmeiPackage.Literals.CONNECTOR_APPEARANCE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getHeadStyle()
    {
        return headStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setHeadStyle(int newHeadStyle)
    {
        int oldHeadStyle = headStyle;
        headStyle = newHeadStyle;
        boolean oldHeadStyleESet = headStyleESet;
        headStyleESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_APPEARANCE_TYPE__HEAD_STYLE, oldHeadStyle, headStyle, !oldHeadStyleESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetHeadStyle()
    {
        int oldHeadStyle = headStyle;
        boolean oldHeadStyleESet = headStyleESet;
        headStyle = HEAD_STYLE_EDEFAULT;
        headStyleESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.CONNECTOR_APPEARANCE_TYPE__HEAD_STYLE, oldHeadStyle, HEAD_STYLE_EDEFAULT, oldHeadStyleESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetHeadStyle()
    {
        return headStyleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLinecolor()
    {
        return linecolor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLinecolor(int newLinecolor)
    {
        int oldLinecolor = linecolor;
        linecolor = newLinecolor;
        boolean oldLinecolorESet = linecolorESet;
        linecolorESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINECOLOR, oldLinecolor, linecolor, !oldLinecolorESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetLinecolor()
    {
        int oldLinecolor = linecolor;
        boolean oldLinecolorESet = linecolorESet;
        linecolor = LINECOLOR_EDEFAULT;
        linecolorESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINECOLOR, oldLinecolor, LINECOLOR_EDEFAULT, oldLinecolorESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLinecolor()
    {
        return linecolorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLinemode()
    {
        return linemode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLinemode(int newLinemode)
    {
        int oldLinemode = linemode;
        linemode = newLinemode;
        boolean oldLinemodeESet = linemodeESet;
        linemodeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINEMODE, oldLinemode, linemode, !oldLinemodeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetLinemode()
    {
        int oldLinemode = linemode;
        boolean oldLinemodeESet = linemodeESet;
        linemode = LINEMODE_EDEFAULT;
        linemodeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINEMODE, oldLinemode, LINEMODE_EDEFAULT, oldLinemodeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLinemode()
    {
        return linemodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLineStyle()
    {
        return lineStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLineStyle(int newLineStyle)
    {
        int oldLineStyle = lineStyle;
        lineStyle = newLineStyle;
        boolean oldLineStyleESet = lineStyleESet;
        lineStyleESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINE_STYLE, oldLineStyle, lineStyle, !oldLineStyleESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetLineStyle()
    {
        int oldLineStyle = lineStyle;
        boolean oldLineStyleESet = lineStyleESet;
        lineStyle = LINE_STYLE_EDEFAULT;
        lineStyleESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINE_STYLE, oldLineStyle, LINE_STYLE_EDEFAULT, oldLineStyleESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLineStyle()
    {
        return lineStyleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLinewidth()
    {
        return linewidth;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLinewidth(int newLinewidth)
    {
        int oldLinewidth = linewidth;
        linewidth = newLinewidth;
        boolean oldLinewidthESet = linewidthESet;
        linewidthESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINEWIDTH, oldLinewidth, linewidth, !oldLinewidthESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetLinewidth()
    {
        int oldLinewidth = linewidth;
        boolean oldLinewidthESet = linewidthESet;
        linewidth = LINEWIDTH_EDEFAULT;
        linewidthESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINEWIDTH, oldLinewidth, LINEWIDTH_EDEFAULT, oldLinewidthESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLinewidth()
    {
        return linewidthESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getSeqno()
    {
        return seqno;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSeqno(int newSeqno)
    {
        int oldSeqno = seqno;
        seqno = newSeqno;
        boolean oldSeqnoESet = seqnoESet;
        seqnoESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_APPEARANCE_TYPE__SEQNO, oldSeqno, seqno, !oldSeqnoESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSeqno()
    {
        int oldSeqno = seqno;
        boolean oldSeqnoESet = seqnoESet;
        seqno = SEQNO_EDEFAULT;
        seqnoESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.CONNECTOR_APPEARANCE_TYPE__SEQNO, oldSeqno, SEQNO_EDEFAULT, oldSeqnoESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSeqno()
    {
        return seqnoESet;
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
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__HEAD_STYLE:
                return getHeadStyle();
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINECOLOR:
                return getLinecolor();
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINEMODE:
                return getLinemode();
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINE_STYLE:
                return getLineStyle();
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINEWIDTH:
                return getLinewidth();
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__SEQNO:
                return getSeqno();
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
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__HEAD_STYLE:
                setHeadStyle((Integer)newValue);
                return;
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINECOLOR:
                setLinecolor((Integer)newValue);
                return;
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINEMODE:
                setLinemode((Integer)newValue);
                return;
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINE_STYLE:
                setLineStyle((Integer)newValue);
                return;
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINEWIDTH:
                setLinewidth((Integer)newValue);
                return;
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__SEQNO:
                setSeqno((Integer)newValue);
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
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__HEAD_STYLE:
                unsetHeadStyle();
                return;
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINECOLOR:
                unsetLinecolor();
                return;
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINEMODE:
                unsetLinemode();
                return;
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINE_STYLE:
                unsetLineStyle();
                return;
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINEWIDTH:
                unsetLinewidth();
                return;
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__SEQNO:
                unsetSeqno();
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
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__HEAD_STYLE:
                return isSetHeadStyle();
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINECOLOR:
                return isSetLinecolor();
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINEMODE:
                return isSetLinemode();
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINE_STYLE:
                return isSetLineStyle();
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__LINEWIDTH:
                return isSetLinewidth();
            case XmeiPackage.CONNECTOR_APPEARANCE_TYPE__SEQNO:
                return isSetSeqno();
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
        result.append(" (headStyle: ");
        if (headStyleESet) result.append(headStyle); else result.append("<unset>");
        result.append(", linecolor: ");
        if (linecolorESet) result.append(linecolor); else result.append("<unset>");
        result.append(", linemode: ");
        if (linemodeESet) result.append(linemode); else result.append("<unset>");
        result.append(", lineStyle: ");
        if (lineStyleESet) result.append(lineStyle); else result.append("<unset>");
        result.append(", linewidth: ");
        if (linewidthESet) result.append(linewidth); else result.append("<unset>");
        result.append(", seqno: ");
        if (seqnoESet) result.append(seqno); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ConnectorAppearanceTypeImpl
