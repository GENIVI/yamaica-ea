/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xmei.DiagramElementType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.DiagramElementTypeImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link xmei.impl.DiagramElementTypeImpl#getSeqno <em>Seqno</em>}</li>
 *   <li>{@link xmei.impl.DiagramElementTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link xmei.impl.DiagramElementTypeImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramElementTypeImpl extends MinimalEObjectImpl.Container implements DiagramElementType
{
    /**
     * The default value of the '{@link #getGeometry() <em>Geometry</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeometry()
     * @generated
     * @ordered
     */
    protected static final String GEOMETRY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeometry()
     * @generated
     * @ordered
     */
    protected String geometry = GEOMETRY_EDEFAULT;

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
     * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStyle()
     * @generated
     * @ordered
     */
    protected static final String STYLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStyle()
     * @generated
     * @ordered
     */
    protected String style = STYLE_EDEFAULT;

    /**
     * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubject()
     * @generated
     * @ordered
     */
    protected static final String SUBJECT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubject()
     * @generated
     * @ordered
     */
    protected String subject = SUBJECT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiagramElementTypeImpl()
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
        return XmeiPackage.Literals.DIAGRAM_ELEMENT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getGeometry()
    {
        return geometry;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGeometry(String newGeometry)
    {
        String oldGeometry = geometry;
        geometry = newGeometry;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_ELEMENT_TYPE__GEOMETRY, oldGeometry, geometry));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_ELEMENT_TYPE__SEQNO, oldSeqno, seqno, !oldSeqnoESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.DIAGRAM_ELEMENT_TYPE__SEQNO, oldSeqno, SEQNO_EDEFAULT, oldSeqnoESet));
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
    public String getStyle()
    {
        return style;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStyle(String newStyle)
    {
        String oldStyle = style;
        style = newStyle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_ELEMENT_TYPE__STYLE, oldStyle, style));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSubject()
    {
        return subject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSubject(String newSubject)
    {
        String oldSubject = subject;
        subject = newSubject;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_ELEMENT_TYPE__SUBJECT, oldSubject, subject));
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
            case XmeiPackage.DIAGRAM_ELEMENT_TYPE__GEOMETRY:
                return getGeometry();
            case XmeiPackage.DIAGRAM_ELEMENT_TYPE__SEQNO:
                return getSeqno();
            case XmeiPackage.DIAGRAM_ELEMENT_TYPE__STYLE:
                return getStyle();
            case XmeiPackage.DIAGRAM_ELEMENT_TYPE__SUBJECT:
                return getSubject();
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
            case XmeiPackage.DIAGRAM_ELEMENT_TYPE__GEOMETRY:
                setGeometry((String)newValue);
                return;
            case XmeiPackage.DIAGRAM_ELEMENT_TYPE__SEQNO:
                setSeqno((Integer)newValue);
                return;
            case XmeiPackage.DIAGRAM_ELEMENT_TYPE__STYLE:
                setStyle((String)newValue);
                return;
            case XmeiPackage.DIAGRAM_ELEMENT_TYPE__SUBJECT:
                setSubject((String)newValue);
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
            case XmeiPackage.DIAGRAM_ELEMENT_TYPE__GEOMETRY:
                setGeometry(GEOMETRY_EDEFAULT);
                return;
            case XmeiPackage.DIAGRAM_ELEMENT_TYPE__SEQNO:
                unsetSeqno();
                return;
            case XmeiPackage.DIAGRAM_ELEMENT_TYPE__STYLE:
                setStyle(STYLE_EDEFAULT);
                return;
            case XmeiPackage.DIAGRAM_ELEMENT_TYPE__SUBJECT:
                setSubject(SUBJECT_EDEFAULT);
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
            case XmeiPackage.DIAGRAM_ELEMENT_TYPE__GEOMETRY:
                return GEOMETRY_EDEFAULT == null ? geometry != null : !GEOMETRY_EDEFAULT.equals(geometry);
            case XmeiPackage.DIAGRAM_ELEMENT_TYPE__SEQNO:
                return isSetSeqno();
            case XmeiPackage.DIAGRAM_ELEMENT_TYPE__STYLE:
                return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
            case XmeiPackage.DIAGRAM_ELEMENT_TYPE__SUBJECT:
                return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
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
        result.append(" (geometry: ");
        result.append(geometry);
        result.append(", seqno: ");
        if (seqnoESet) result.append(seqno); else result.append("<unset>");
        result.append(", style: ");
        result.append(style);
        result.append(", subject: ");
        result.append(subject);
        result.append(')');
        return result.toString();
    }

} //DiagramElementTypeImpl
