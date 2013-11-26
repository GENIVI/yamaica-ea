/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.ParameterPropertiesType#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link xmei.ParameterPropertiesType#isConst <em>Const</em>}</li>
 *   <li>{@link xmei.ParameterPropertiesType#getEaGuid <em>Ea Guid</em>}</li>
 *   <li>{@link xmei.ParameterPropertiesType#getPos <em>Pos</em>}</li>
 *   <li>{@link xmei.ParameterPropertiesType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getParameterPropertiesType()
 * @model extendedMetaData="name='parameterPropertiesType' kind='empty'"
 * @generated
 */
public interface ParameterPropertiesType extends EObject
{
    /**
     * Returns the value of the '<em><b>Classifier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Classifier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Classifier</em>' attribute.
     * @see #setClassifier(String)
     * @see xmei.XmeiPackage#getParameterPropertiesType_Classifier()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='classifier'"
     * @generated
     */
    String getClassifier();

    /**
     * Sets the value of the '{@link xmei.ParameterPropertiesType#getClassifier <em>Classifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Classifier</em>' attribute.
     * @see #getClassifier()
     * @generated
     */
    void setClassifier(String value);

    /**
     * Returns the value of the '<em><b>Const</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Const</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Const</em>' attribute.
     * @see #isSetConst()
     * @see #unsetConst()
     * @see #setConst(boolean)
     * @see xmei.XmeiPackage#getParameterPropertiesType_Const()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
     *        extendedMetaData="kind='attribute' name='const'"
     * @generated
     */
    boolean isConst();

    /**
     * Sets the value of the '{@link xmei.ParameterPropertiesType#isConst <em>Const</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Const</em>' attribute.
     * @see #isSetConst()
     * @see #unsetConst()
     * @see #isConst()
     * @generated
     */
    void setConst(boolean value);

    /**
     * Unsets the value of the '{@link xmei.ParameterPropertiesType#isConst <em>Const</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConst()
     * @see #isConst()
     * @see #setConst(boolean)
     * @generated
     */
    void unsetConst();

    /**
     * Returns whether the value of the '{@link xmei.ParameterPropertiesType#isConst <em>Const</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Const</em>' attribute is set.
     * @see #unsetConst()
     * @see #isConst()
     * @see #setConst(boolean)
     * @generated
     */
    boolean isSetConst();

    /**
     * Returns the value of the '<em><b>Ea Guid</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ea Guid</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ea Guid</em>' attribute.
     * @see #setEaGuid(String)
     * @see xmei.XmeiPackage#getParameterPropertiesType_EaGuid()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='ea_guid'"
     * @generated
     */
    String getEaGuid();

    /**
     * Sets the value of the '{@link xmei.ParameterPropertiesType#getEaGuid <em>Ea Guid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ea Guid</em>' attribute.
     * @see #getEaGuid()
     * @generated
     */
    void setEaGuid(String value);

    /**
     * Returns the value of the '<em><b>Pos</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pos</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pos</em>' attribute.
     * @see #isSetPos()
     * @see #unsetPos()
     * @see #setPos(int)
     * @see xmei.XmeiPackage#getParameterPropertiesType_Pos()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
     *        extendedMetaData="kind='attribute' name='pos'"
     * @generated
     */
    int getPos();

    /**
     * Sets the value of the '{@link xmei.ParameterPropertiesType#getPos <em>Pos</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pos</em>' attribute.
     * @see #isSetPos()
     * @see #unsetPos()
     * @see #getPos()
     * @generated
     */
    void setPos(int value);

    /**
     * Unsets the value of the '{@link xmei.ParameterPropertiesType#getPos <em>Pos</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPos()
     * @see #getPos()
     * @see #setPos(int)
     * @generated
     */
    void unsetPos();

    /**
     * Returns whether the value of the '{@link xmei.ParameterPropertiesType#getPos <em>Pos</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pos</em>' attribute is set.
     * @see #unsetPos()
     * @see #getPos()
     * @see #setPos(int)
     * @generated
     */
    boolean isSetPos();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see xmei.XmeiPackage#getParameterPropertiesType_Type()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link xmei.ParameterPropertiesType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

} // ParameterPropertiesType
