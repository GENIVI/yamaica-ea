/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.ExtendedPropertiesType#getConditional <em>Conditional</em>}</li>
 *   <li>{@link xmei.ExtendedPropertiesType#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link xmei.ExtendedPropertiesType#getPrivatedata1 <em>Privatedata1</em>}</li>
 *   <li>{@link xmei.ExtendedPropertiesType#getPrivatedata2 <em>Privatedata2</em>}</li>
 *   <li>{@link xmei.ExtendedPropertiesType#getPrivatedata3 <em>Privatedata3</em>}</li>
 *   <li>{@link xmei.ExtendedPropertiesType#getPrivatedata4 <em>Privatedata4</em>}</li>
 *   <li>{@link xmei.ExtendedPropertiesType#getPrivatedata5 <em>Privatedata5</em>}</li>
 *   <li>{@link xmei.ExtendedPropertiesType#getSequencePoints <em>Sequence Points</em>}</li>
 *   <li>{@link xmei.ExtendedPropertiesType#getStateflags <em>Stateflags</em>}</li>
 *   <li>{@link xmei.ExtendedPropertiesType#getVirtualInheritance <em>Virtual Inheritance</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getExtendedPropertiesType()
 * @model extendedMetaData="name='extendedPropertiesType' kind='empty'"
 * @generated
 */
public interface ExtendedPropertiesType extends EObject
{
    /**
     * Returns the value of the '<em><b>Conditional</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conditional</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conditional</em>' attribute.
     * @see #setConditional(String)
     * @see xmei.XmeiPackage#getExtendedPropertiesType_Conditional()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='conditional'"
     * @generated
     */
    String getConditional();

    /**
     * Sets the value of the '{@link xmei.ExtendedPropertiesType#getConditional <em>Conditional</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conditional</em>' attribute.
     * @see #getConditional()
     * @generated
     */
    void setConditional(String value);

    /**
     * Returns the value of the '<em><b>Diagram</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagram</em>' attribute.
     * @see #setDiagram(String)
     * @see xmei.XmeiPackage#getExtendedPropertiesType_Diagram()
     * @model dataType="xmei.IdType"
     *        extendedMetaData="kind='attribute' name='diagram'"
     * @generated
     */
    String getDiagram();

    /**
     * Sets the value of the '{@link xmei.ExtendedPropertiesType#getDiagram <em>Diagram</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diagram</em>' attribute.
     * @see #getDiagram()
     * @generated
     */
    void setDiagram(String value);

    /**
     * Returns the value of the '<em><b>Privatedata1</b></em>' attribute.
     * The literals are from the enumeration {@link xmei.AsyncSyncType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Privatedata1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Privatedata1</em>' attribute.
     * @see xmei.AsyncSyncType
     * @see #isSetPrivatedata1()
     * @see #unsetPrivatedata1()
     * @see #setPrivatedata1(AsyncSyncType)
     * @see xmei.XmeiPackage#getExtendedPropertiesType_Privatedata1()
     * @model unsettable="true"
     *        extendedMetaData="kind='attribute' name='privatedata1'"
     * @generated
     */
    AsyncSyncType getPrivatedata1();

    /**
     * Sets the value of the '{@link xmei.ExtendedPropertiesType#getPrivatedata1 <em>Privatedata1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Privatedata1</em>' attribute.
     * @see xmei.AsyncSyncType
     * @see #isSetPrivatedata1()
     * @see #unsetPrivatedata1()
     * @see #getPrivatedata1()
     * @generated
     */
    void setPrivatedata1(AsyncSyncType value);

    /**
     * Unsets the value of the '{@link xmei.ExtendedPropertiesType#getPrivatedata1 <em>Privatedata1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrivatedata1()
     * @see #getPrivatedata1()
     * @see #setPrivatedata1(AsyncSyncType)
     * @generated
     */
    void unsetPrivatedata1();

    /**
     * Returns whether the value of the '{@link xmei.ExtendedPropertiesType#getPrivatedata1 <em>Privatedata1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Privatedata1</em>' attribute is set.
     * @see #unsetPrivatedata1()
     * @see #getPrivatedata1()
     * @see #setPrivatedata1(AsyncSyncType)
     * @generated
     */
    boolean isSetPrivatedata1();

    /**
     * Returns the value of the '<em><b>Privatedata2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Privatedata2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Privatedata2</em>' attribute.
     * @see #setPrivatedata2(String)
     * @see xmei.XmeiPackage#getExtendedPropertiesType_Privatedata2()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='privatedata2'"
     * @generated
     */
    String getPrivatedata2();

    /**
     * Sets the value of the '{@link xmei.ExtendedPropertiesType#getPrivatedata2 <em>Privatedata2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Privatedata2</em>' attribute.
     * @see #getPrivatedata2()
     * @generated
     */
    void setPrivatedata2(String value);

    /**
     * Returns the value of the '<em><b>Privatedata3</b></em>' attribute.
     * The default value is <code>"Call"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Privatedata3</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Privatedata3</em>' attribute.
     * @see #isSetPrivatedata3()
     * @see #unsetPrivatedata3()
     * @see #setPrivatedata3(String)
     * @see xmei.XmeiPackage#getExtendedPropertiesType_Privatedata3()
     * @model default="Call" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='privatedata3'"
     * @generated
     */
    String getPrivatedata3();

    /**
     * Sets the value of the '{@link xmei.ExtendedPropertiesType#getPrivatedata3 <em>Privatedata3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Privatedata3</em>' attribute.
     * @see #isSetPrivatedata3()
     * @see #unsetPrivatedata3()
     * @see #getPrivatedata3()
     * @generated
     */
    void setPrivatedata3(String value);

    /**
     * Unsets the value of the '{@link xmei.ExtendedPropertiesType#getPrivatedata3 <em>Privatedata3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrivatedata3()
     * @see #getPrivatedata3()
     * @see #setPrivatedata3(String)
     * @generated
     */
    void unsetPrivatedata3();

    /**
     * Returns whether the value of the '{@link xmei.ExtendedPropertiesType#getPrivatedata3 <em>Privatedata3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Privatedata3</em>' attribute is set.
     * @see #unsetPrivatedata3()
     * @see #getPrivatedata3()
     * @see #setPrivatedata3(String)
     * @generated
     */
    boolean isSetPrivatedata3();

    /**
     * Returns the value of the '<em><b>Privatedata4</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Privatedata4</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Privatedata4</em>' attribute.
     * @see #isSetPrivatedata4()
     * @see #unsetPrivatedata4()
     * @see #setPrivatedata4(int)
     * @see xmei.XmeiPackage#getExtendedPropertiesType_Privatedata4()
     * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='privatedata4'"
     * @generated
     */
    int getPrivatedata4();

    /**
     * Sets the value of the '{@link xmei.ExtendedPropertiesType#getPrivatedata4 <em>Privatedata4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Privatedata4</em>' attribute.
     * @see #isSetPrivatedata4()
     * @see #unsetPrivatedata4()
     * @see #getPrivatedata4()
     * @generated
     */
    void setPrivatedata4(int value);

    /**
     * Unsets the value of the '{@link xmei.ExtendedPropertiesType#getPrivatedata4 <em>Privatedata4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrivatedata4()
     * @see #getPrivatedata4()
     * @see #setPrivatedata4(int)
     * @generated
     */
    void unsetPrivatedata4();

    /**
     * Returns whether the value of the '{@link xmei.ExtendedPropertiesType#getPrivatedata4 <em>Privatedata4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Privatedata4</em>' attribute is set.
     * @see #unsetPrivatedata4()
     * @see #getPrivatedata4()
     * @see #setPrivatedata4(int)
     * @generated
     */
    boolean isSetPrivatedata4();

    /**
     * Returns the value of the '<em><b>Privatedata5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Privatedata5</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Privatedata5</em>' attribute.
     * @see #setPrivatedata5(String)
     * @see xmei.XmeiPackage#getExtendedPropertiesType_Privatedata5()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='privatedata5'"
     * @generated
     */
    String getPrivatedata5();

    /**
     * Sets the value of the '{@link xmei.ExtendedPropertiesType#getPrivatedata5 <em>Privatedata5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Privatedata5</em>' attribute.
     * @see #getPrivatedata5()
     * @generated
     */
    void setPrivatedata5(String value);

    /**
     * Returns the value of the '<em><b>Sequence Points</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sequence Points</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sequence Points</em>' attribute.
     * @see #setSequencePoints(String)
     * @see xmei.XmeiPackage#getExtendedPropertiesType_SequencePoints()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='sequence_points'"
     * @generated
     */
    String getSequencePoints();

    /**
     * Sets the value of the '{@link xmei.ExtendedPropertiesType#getSequencePoints <em>Sequence Points</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sequence Points</em>' attribute.
     * @see #getSequencePoints()
     * @generated
     */
    void setSequencePoints(String value);

    /**
     * Returns the value of the '<em><b>Stateflags</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stateflags</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stateflags</em>' attribute.
     * @see #setStateflags(String)
     * @see xmei.XmeiPackage#getExtendedPropertiesType_Stateflags()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='stateflags'"
     * @generated
     */
    String getStateflags();

    /**
     * Sets the value of the '{@link xmei.ExtendedPropertiesType#getStateflags <em>Stateflags</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stateflags</em>' attribute.
     * @see #getStateflags()
     * @generated
     */
    void setStateflags(String value);

    /**
     * Returns the value of the '<em><b>Virtual Inheritance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Virtual Inheritance</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Virtual Inheritance</em>' attribute.
     * @see #isSetVirtualInheritance()
     * @see #unsetVirtualInheritance()
     * @see #setVirtualInheritance(int)
     * @see xmei.XmeiPackage#getExtendedPropertiesType_VirtualInheritance()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
     *        extendedMetaData="kind='attribute' name='virtualInheritance'"
     * @generated
     */
    int getVirtualInheritance();

    /**
     * Sets the value of the '{@link xmei.ExtendedPropertiesType#getVirtualInheritance <em>Virtual Inheritance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Virtual Inheritance</em>' attribute.
     * @see #isSetVirtualInheritance()
     * @see #unsetVirtualInheritance()
     * @see #getVirtualInheritance()
     * @generated
     */
    void setVirtualInheritance(int value);

    /**
     * Unsets the value of the '{@link xmei.ExtendedPropertiesType#getVirtualInheritance <em>Virtual Inheritance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVirtualInheritance()
     * @see #getVirtualInheritance()
     * @see #setVirtualInheritance(int)
     * @generated
     */
    void unsetVirtualInheritance();

    /**
     * Returns whether the value of the '{@link xmei.ExtendedPropertiesType#getVirtualInheritance <em>Virtual Inheritance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Virtual Inheritance</em>' attribute is set.
     * @see #unsetVirtualInheritance()
     * @see #getVirtualInheritance()
     * @see #setVirtualInheritance(int)
     * @generated
     */
    boolean isSetVirtualInheritance();

} // ExtendedPropertiesType
