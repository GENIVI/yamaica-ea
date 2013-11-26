/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source And Target Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.SourceAndTargetModelType#getEaLocalid <em>Ea Localid</em>}</li>
 *   <li>{@link xmei.SourceAndTargetModelType#getName <em>Name</em>}</li>
 *   <li>{@link xmei.SourceAndTargetModelType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getSourceAndTargetModelType()
 * @model extendedMetaData="name='sourceAndTargetModelType' kind='empty'"
 * @generated
 */
public interface SourceAndTargetModelType extends EObject
{
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
     * @see xmei.XmeiPackage#getSourceAndTargetModelType_EaLocalid()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
     *        extendedMetaData="kind='attribute' name='ea_localid'"
     * @generated
     */
    int getEaLocalid();

    /**
     * Sets the value of the '{@link xmei.SourceAndTargetModelType#getEaLocalid <em>Ea Localid</em>}' attribute.
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
     * Unsets the value of the '{@link xmei.SourceAndTargetModelType#getEaLocalid <em>Ea Localid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEaLocalid()
     * @see #getEaLocalid()
     * @see #setEaLocalid(int)
     * @generated
     */
    void unsetEaLocalid();

    /**
     * Returns whether the value of the '{@link xmei.SourceAndTargetModelType#getEaLocalid <em>Ea Localid</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see xmei.XmeiPackage#getSourceAndTargetModelType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link xmei.SourceAndTargetModelType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link xmei.STypeType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see xmei.STypeType
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(STypeType)
     * @see xmei.XmeiPackage#getSourceAndTargetModelType_Type()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    STypeType getType();

    /**
     * Sets the value of the '{@link xmei.SourceAndTargetModelType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see xmei.STypeType
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType(STypeType value);

    /**
     * Unsets the value of the '{@link xmei.SourceAndTargetModelType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(STypeType)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link xmei.SourceAndTargetModelType#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(STypeType)
     * @generated
     */
    boolean isSetType();

} // SourceAndTargetModelType
