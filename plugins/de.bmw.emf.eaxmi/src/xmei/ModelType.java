/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.ModelType#getEaEleType <em>Ea Ele Type</em>}</li>
 *   <li>{@link xmei.ModelType#getEaLocalid <em>Ea Localid</em>}</li>
 *   <li>{@link xmei.ModelType#getOwner <em>Owner</em>}</li>
 *   <li>{@link xmei.ModelType#getPackage <em>Package</em>}</li>
 *   <li>{@link xmei.ModelType#getPackage2 <em>Package2</em>}</li>
 *   <li>{@link xmei.ModelType#getTpos <em>Tpos</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getModelType()
 * @model extendedMetaData="name='modelType' kind='empty'"
 * @generated
 */
public interface ModelType extends EObject
{
    /**
     * Returns the value of the '<em><b>Ea Ele Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ea Ele Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ea Ele Type</em>' attribute.
     * @see #setEaEleType(String)
     * @see xmei.XmeiPackage#getModelType_EaEleType()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='ea_eleType'"
     * @generated
     */
    String getEaEleType();

    /**
     * Sets the value of the '{@link xmei.ModelType#getEaEleType <em>Ea Ele Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ea Ele Type</em>' attribute.
     * @see #getEaEleType()
     * @generated
     */
    void setEaEleType(String value);

    /**
     * Returns the value of the '<em><b>Ea Localid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ea Localid</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ea Localid</em>' attribute.
     * @see #isSetEaLocalid()
     * @see #unsetEaLocalid()
     * @see #setEaLocalid(int)
     * @see xmei.XmeiPackage#getModelType_EaLocalid()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='ea_localid'"
     * @generated
     */
    int getEaLocalid();

    /**
     * Sets the value of the '{@link xmei.ModelType#getEaLocalid <em>Ea Localid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ea Localid</em>' attribute.
     * @see #isSetEaLocalid()
     * @see #unsetEaLocalid()
     * @see #getEaLocalid()
     * @generated
     */
    void setEaLocalid(int value);

    /**
     * Unsets the value of the '{@link xmei.ModelType#getEaLocalid <em>Ea Localid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEaLocalid()
     * @see #getEaLocalid()
     * @see #setEaLocalid(int)
     * @generated
     */
    void unsetEaLocalid();

    /**
     * Returns whether the value of the '{@link xmei.ModelType#getEaLocalid <em>Ea Localid</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ea Localid</em>' attribute is set.
     * @see #unsetEaLocalid()
     * @see #getEaLocalid()
     * @see #setEaLocalid(int)
     * @generated
     */
    boolean isSetEaLocalid();

    /**
     * Returns the value of the '<em><b>Owner</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owner</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owner</em>' attribute.
     * @see #setOwner(String)
     * @see xmei.XmeiPackage#getModelType_Owner()
     * @model dataType="xmei.IdType"
     *        extendedMetaData="kind='attribute' name='owner'"
     * @generated
     */
    String getOwner();

    /**
     * Sets the value of the '{@link xmei.ModelType#getOwner <em>Owner</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owner</em>' attribute.
     * @see #getOwner()
     * @generated
     */
    void setOwner(String value);

    /**
     * Returns the value of the '<em><b>Package</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package</em>' attribute.
     * @see #setPackage(String)
     * @see xmei.XmeiPackage#getModelType_Package()
     * @model dataType="xmei.IdType"
     *        extendedMetaData="kind='attribute' name='package'"
     * @generated
     */
    String getPackage();

    /**
     * Sets the value of the '{@link xmei.ModelType#getPackage <em>Package</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package</em>' attribute.
     * @see #getPackage()
     * @generated
     */
    void setPackage(String value);

    /**
     * Returns the value of the '<em><b>Package2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package2</em>' attribute.
     * @see #setPackage2(String)
     * @see xmei.XmeiPackage#getModelType_Package2()
     * @model dataType="xmei.IdType"
     *        extendedMetaData="kind='attribute' name='package2'"
     * @generated
     */
    String getPackage2();

    /**
     * Sets the value of the '{@link xmei.ModelType#getPackage2 <em>Package2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package2</em>' attribute.
     * @see #getPackage2()
     * @generated
     */
    void setPackage2(String value);

    /**
     * Returns the value of the '<em><b>Tpos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tpos</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tpos</em>' attribute.
     * @see #isSetTpos()
     * @see #unsetTpos()
     * @see #setTpos(int)
     * @see xmei.XmeiPackage#getModelType_Tpos()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='tpos'"
     * @generated
     */
    int getTpos();

    /**
     * Sets the value of the '{@link xmei.ModelType#getTpos <em>Tpos</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpos</em>' attribute.
     * @see #isSetTpos()
     * @see #unsetTpos()
     * @see #getTpos()
     * @generated
     */
    void setTpos(int value);

    /**
     * Unsets the value of the '{@link xmei.ModelType#getTpos <em>Tpos</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpos()
     * @see #getTpos()
     * @see #setTpos(int)
     * @generated
     */
    void unsetTpos();

    /**
     * Returns whether the value of the '{@link xmei.ModelType#getTpos <em>Tpos</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpos</em>' attribute is set.
     * @see #unsetTpos()
     * @see #getTpos()
     * @see #setTpos(int)
     * @generated
     */
    boolean isSetTpos();

} // ModelType
