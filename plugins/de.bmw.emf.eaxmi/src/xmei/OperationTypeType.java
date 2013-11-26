/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.OperationTypeType#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link xmei.OperationTypeType#isConst <em>Const</em>}</li>
 *   <li>{@link xmei.OperationTypeType#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link xmei.OperationTypeType#isIsQuery <em>Is Query</em>}</li>
 *   <li>{@link xmei.OperationTypeType#getPure <em>Pure</em>}</li>
 *   <li>{@link xmei.OperationTypeType#getReturnarray <em>Returnarray</em>}</li>
 *   <li>{@link xmei.OperationTypeType#isStatic <em>Static</em>}</li>
 *   <li>{@link xmei.OperationTypeType#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link xmei.OperationTypeType#getSynchronised <em>Synchronised</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getOperationTypeType()
 * @model extendedMetaData="name='operationTypeType' kind='empty'"
 * @generated
 */
public interface OperationTypeType extends EObject
{
    /**
     * Returns the value of the '<em><b>Concurrency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Concurrency</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Concurrency</em>' attribute.
     * @see #setConcurrency(String)
     * @see xmei.XmeiPackage#getOperationTypeType_Concurrency()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='concurrency'"
     * @generated
     */
    String getConcurrency();

    /**
     * Sets the value of the '{@link xmei.OperationTypeType#getConcurrency <em>Concurrency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Concurrency</em>' attribute.
     * @see #getConcurrency()
     * @generated
     */
    void setConcurrency(String value);

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
     * @see xmei.XmeiPackage#getOperationTypeType_Const()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
     *        extendedMetaData="kind='attribute' name='const'"
     * @generated
     */
    boolean isConst();

    /**
     * Sets the value of the '{@link xmei.OperationTypeType#isConst <em>Const</em>}' attribute.
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
     * Unsets the value of the '{@link xmei.OperationTypeType#isConst <em>Const</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConst()
     * @see #isConst()
     * @see #setConst(boolean)
     * @generated
     */
    void unsetConst();

    /**
     * Returns whether the value of the '{@link xmei.OperationTypeType#isConst <em>Const</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Abstract</em>' attribute.
     * @see #isSetIsAbstract()
     * @see #unsetIsAbstract()
     * @see #setIsAbstract(boolean)
     * @see xmei.XmeiPackage#getOperationTypeType_IsAbstract()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
     *        extendedMetaData="kind='attribute' name='isAbstract'"
     * @generated
     */
    boolean isIsAbstract();

    /**
     * Sets the value of the '{@link xmei.OperationTypeType#isIsAbstract <em>Is Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Abstract</em>' attribute.
     * @see #isSetIsAbstract()
     * @see #unsetIsAbstract()
     * @see #isIsAbstract()
     * @generated
     */
    void setIsAbstract(boolean value);

    /**
     * Unsets the value of the '{@link xmei.OperationTypeType#isIsAbstract <em>Is Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsAbstract()
     * @see #isIsAbstract()
     * @see #setIsAbstract(boolean)
     * @generated
     */
    void unsetIsAbstract();

    /**
     * Returns whether the value of the '{@link xmei.OperationTypeType#isIsAbstract <em>Is Abstract</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Abstract</em>' attribute is set.
     * @see #unsetIsAbstract()
     * @see #isIsAbstract()
     * @see #setIsAbstract(boolean)
     * @generated
     */
    boolean isSetIsAbstract();

    /**
     * Returns the value of the '<em><b>Is Query</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Query</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Query</em>' attribute.
     * @see #isSetIsQuery()
     * @see #unsetIsQuery()
     * @see #setIsQuery(boolean)
     * @see xmei.XmeiPackage#getOperationTypeType_IsQuery()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
     *        extendedMetaData="kind='attribute' name='isQuery'"
     * @generated
     */
    boolean isIsQuery();

    /**
     * Sets the value of the '{@link xmei.OperationTypeType#isIsQuery <em>Is Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Query</em>' attribute.
     * @see #isSetIsQuery()
     * @see #unsetIsQuery()
     * @see #isIsQuery()
     * @generated
     */
    void setIsQuery(boolean value);

    /**
     * Unsets the value of the '{@link xmei.OperationTypeType#isIsQuery <em>Is Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsQuery()
     * @see #isIsQuery()
     * @see #setIsQuery(boolean)
     * @generated
     */
    void unsetIsQuery();

    /**
     * Returns whether the value of the '{@link xmei.OperationTypeType#isIsQuery <em>Is Query</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Query</em>' attribute is set.
     * @see #unsetIsQuery()
     * @see #isIsQuery()
     * @see #setIsQuery(boolean)
     * @generated
     */
    boolean isSetIsQuery();

    /**
     * Returns the value of the '<em><b>Pure</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pure</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pure</em>' attribute.
     * @see #isSetPure()
     * @see #unsetPure()
     * @see #setPure(int)
     * @see xmei.XmeiPackage#getOperationTypeType_Pure()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
     *        extendedMetaData="kind='attribute' name='pure'"
     * @generated
     */
    int getPure();

    /**
     * Sets the value of the '{@link xmei.OperationTypeType#getPure <em>Pure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pure</em>' attribute.
     * @see #isSetPure()
     * @see #unsetPure()
     * @see #getPure()
     * @generated
     */
    void setPure(int value);

    /**
     * Unsets the value of the '{@link xmei.OperationTypeType#getPure <em>Pure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPure()
     * @see #getPure()
     * @see #setPure(int)
     * @generated
     */
    void unsetPure();

    /**
     * Returns whether the value of the '{@link xmei.OperationTypeType#getPure <em>Pure</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pure</em>' attribute is set.
     * @see #unsetPure()
     * @see #getPure()
     * @see #setPure(int)
     * @generated
     */
    boolean isSetPure();

    /**
     * Returns the value of the '<em><b>Returnarray</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Returnarray</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Returnarray</em>' attribute.
     * @see #isSetReturnarray()
     * @see #unsetReturnarray()
     * @see #setReturnarray(int)
     * @see xmei.XmeiPackage#getOperationTypeType_Returnarray()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
     *        extendedMetaData="kind='attribute' name='returnarray'"
     * @generated
     */
    int getReturnarray();

    /**
     * Sets the value of the '{@link xmei.OperationTypeType#getReturnarray <em>Returnarray</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Returnarray</em>' attribute.
     * @see #isSetReturnarray()
     * @see #unsetReturnarray()
     * @see #getReturnarray()
     * @generated
     */
    void setReturnarray(int value);

    /**
     * Unsets the value of the '{@link xmei.OperationTypeType#getReturnarray <em>Returnarray</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReturnarray()
     * @see #getReturnarray()
     * @see #setReturnarray(int)
     * @generated
     */
    void unsetReturnarray();

    /**
     * Returns whether the value of the '{@link xmei.OperationTypeType#getReturnarray <em>Returnarray</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Returnarray</em>' attribute is set.
     * @see #unsetReturnarray()
     * @see #getReturnarray()
     * @see #setReturnarray(int)
     * @generated
     */
    boolean isSetReturnarray();

    /**
     * Returns the value of the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Static</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Static</em>' attribute.
     * @see #isSetStatic()
     * @see #unsetStatic()
     * @see #setStatic(boolean)
     * @see xmei.XmeiPackage#getOperationTypeType_Static()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
     *        extendedMetaData="kind='attribute' name='static'"
     * @generated
     */
    boolean isStatic();

    /**
     * Sets the value of the '{@link xmei.OperationTypeType#isStatic <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Static</em>' attribute.
     * @see #isSetStatic()
     * @see #unsetStatic()
     * @see #isStatic()
     * @generated
     */
    void setStatic(boolean value);

    /**
     * Unsets the value of the '{@link xmei.OperationTypeType#isStatic <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStatic()
     * @see #isStatic()
     * @see #setStatic(boolean)
     * @generated
     */
    void unsetStatic();

    /**
     * Returns whether the value of the '{@link xmei.OperationTypeType#isStatic <em>Static</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Static</em>' attribute is set.
     * @see #unsetStatic()
     * @see #isStatic()
     * @see #setStatic(boolean)
     * @generated
     */
    boolean isSetStatic();

    /**
     * Returns the value of the '<em><b>Stereotype</b></em>' attribute.
     * The literals are from the enumeration {@link xmei.StereotypeType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Stereotype</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stereotype</em>' attribute.
     * @see xmei.StereotypeType
     * @see #isSetStereotype()
     * @see #unsetStereotype()
     * @see #setStereotype(StereotypeType)
     * @see xmei.XmeiPackage#getOperationTypeType_Stereotype()
     * @model unsettable="true" required="true"
     *        extendedMetaData="kind='attribute' name='stereotype'"
     * @generated
     */
    StereotypeType getStereotype();

    /**
     * Sets the value of the '{@link xmei.OperationTypeType#getStereotype <em>Stereotype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stereotype</em>' attribute.
     * @see xmei.StereotypeType
     * @see #isSetStereotype()
     * @see #unsetStereotype()
     * @see #getStereotype()
     * @generated
     */
    void setStereotype(StereotypeType value);

    /**
     * Unsets the value of the '{@link xmei.OperationTypeType#getStereotype <em>Stereotype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStereotype()
     * @see #getStereotype()
     * @see #setStereotype(StereotypeType)
     * @generated
     */
    void unsetStereotype();

    /**
     * Returns whether the value of the '{@link xmei.OperationTypeType#getStereotype <em>Stereotype</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Stereotype</em>' attribute is set.
     * @see #unsetStereotype()
     * @see #getStereotype()
     * @see #setStereotype(StereotypeType)
     * @generated
     */
    boolean isSetStereotype();

    /**
     * Returns the value of the '<em><b>Synchronised</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Synchronised</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Synchronised</em>' attribute.
     * @see #isSetSynchronised()
     * @see #unsetSynchronised()
     * @see #setSynchronised(int)
     * @see xmei.XmeiPackage#getOperationTypeType_Synchronised()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
     *        extendedMetaData="kind='attribute' name='synchronised'"
     * @generated
     */
    int getSynchronised();

    /**
     * Sets the value of the '{@link xmei.OperationTypeType#getSynchronised <em>Synchronised</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Synchronised</em>' attribute.
     * @see #isSetSynchronised()
     * @see #unsetSynchronised()
     * @see #getSynchronised()
     * @generated
     */
    void setSynchronised(int value);

    /**
     * Unsets the value of the '{@link xmei.OperationTypeType#getSynchronised <em>Synchronised</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSynchronised()
     * @see #getSynchronised()
     * @see #setSynchronised(int)
     * @generated
     */
    void unsetSynchronised();

    /**
     * Returns whether the value of the '{@link xmei.OperationTypeType#getSynchronised <em>Synchronised</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Synchronised</em>' attribute is set.
     * @see #unsetSynchronised()
     * @see #getSynchronised()
     * @see #setSynchronised(int)
     * @generated
     */
    boolean isSetSynchronised();

} // OperationTypeType
