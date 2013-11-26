/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Modifiers Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.ConnectorModifiersType#getChangeable <em>Changeable</em>}</li>
 *   <li>{@link xmei.ConnectorModifiersType#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link xmei.ConnectorModifiersType#isIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link xmei.ConnectorModifiersType#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link xmei.ConnectorModifiersType#isIsRoot <em>Is Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getConnectorModifiersType()
 * @model extendedMetaData="name='connectorModifiersType' kind='empty'"
 * @generated
 */
public interface ConnectorModifiersType extends EObject
{
    /**
     * Returns the value of the '<em><b>Changeable</b></em>' attribute.
     * The default value is <code>"none"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Changeable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Changeable</em>' attribute.
     * @see #isSetChangeable()
     * @see #unsetChangeable()
     * @see #setChangeable(String)
     * @see xmei.XmeiPackage#getConnectorModifiersType_Changeable()
     * @model default="none" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='changeable'"
     * @generated
     */
    String getChangeable();

    /**
     * Sets the value of the '{@link xmei.ConnectorModifiersType#getChangeable <em>Changeable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Changeable</em>' attribute.
     * @see #isSetChangeable()
     * @see #unsetChangeable()
     * @see #getChangeable()
     * @generated
     */
    void setChangeable(String value);

    /**
     * Unsets the value of the '{@link xmei.ConnectorModifiersType#getChangeable <em>Changeable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetChangeable()
     * @see #getChangeable()
     * @see #setChangeable(String)
     * @generated
     */
    void unsetChangeable();

    /**
     * Returns whether the value of the '{@link xmei.ConnectorModifiersType#getChangeable <em>Changeable</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Changeable</em>' attribute is set.
     * @see #unsetChangeable()
     * @see #getChangeable()
     * @see #setChangeable(String)
     * @generated
     */
    boolean isSetChangeable();

    /**
     * Returns the value of the '<em><b>Is Leaf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Leaf</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Leaf</em>' attribute.
     * @see #isSetIsLeaf()
     * @see #unsetIsLeaf()
     * @see #setIsLeaf(boolean)
     * @see xmei.XmeiPackage#getConnectorModifiersType_IsLeaf()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isLeaf'"
     * @generated
     */
    boolean isIsLeaf();

    /**
     * Sets the value of the '{@link xmei.ConnectorModifiersType#isIsLeaf <em>Is Leaf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Leaf</em>' attribute.
     * @see #isSetIsLeaf()
     * @see #unsetIsLeaf()
     * @see #isIsLeaf()
     * @generated
     */
    void setIsLeaf(boolean value);

    /**
     * Unsets the value of the '{@link xmei.ConnectorModifiersType#isIsLeaf <em>Is Leaf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsLeaf()
     * @see #isIsLeaf()
     * @see #setIsLeaf(boolean)
     * @generated
     */
    void unsetIsLeaf();

    /**
     * Returns whether the value of the '{@link xmei.ConnectorModifiersType#isIsLeaf <em>Is Leaf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Leaf</em>' attribute is set.
     * @see #unsetIsLeaf()
     * @see #isIsLeaf()
     * @see #setIsLeaf(boolean)
     * @generated
     */
    boolean isSetIsLeaf();

    /**
     * Returns the value of the '<em><b>Is Navigable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Navigable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Navigable</em>' attribute.
     * @see #isSetIsNavigable()
     * @see #unsetIsNavigable()
     * @see #setIsNavigable(boolean)
     * @see xmei.XmeiPackage#getConnectorModifiersType_IsNavigable()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isNavigable'"
     * @generated
     */
    boolean isIsNavigable();

    /**
     * Sets the value of the '{@link xmei.ConnectorModifiersType#isIsNavigable <em>Is Navigable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Navigable</em>' attribute.
     * @see #isSetIsNavigable()
     * @see #unsetIsNavigable()
     * @see #isIsNavigable()
     * @generated
     */
    void setIsNavigable(boolean value);

    /**
     * Unsets the value of the '{@link xmei.ConnectorModifiersType#isIsNavigable <em>Is Navigable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsNavigable()
     * @see #isIsNavigable()
     * @see #setIsNavigable(boolean)
     * @generated
     */
    void unsetIsNavigable();

    /**
     * Returns whether the value of the '{@link xmei.ConnectorModifiersType#isIsNavigable <em>Is Navigable</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Navigable</em>' attribute is set.
     * @see #unsetIsNavigable()
     * @see #isIsNavigable()
     * @see #setIsNavigable(boolean)
     * @generated
     */
    boolean isSetIsNavigable();

    /**
     * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Ordered</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Ordered</em>' attribute.
     * @see #isSetIsOrdered()
     * @see #unsetIsOrdered()
     * @see #setIsOrdered(boolean)
     * @see xmei.XmeiPackage#getConnectorModifiersType_IsOrdered()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isOrdered'"
     * @generated
     */
    boolean isIsOrdered();

    /**
     * Sets the value of the '{@link xmei.ConnectorModifiersType#isIsOrdered <em>Is Ordered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Ordered</em>' attribute.
     * @see #isSetIsOrdered()
     * @see #unsetIsOrdered()
     * @see #isIsOrdered()
     * @generated
     */
    void setIsOrdered(boolean value);

    /**
     * Unsets the value of the '{@link xmei.ConnectorModifiersType#isIsOrdered <em>Is Ordered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsOrdered()
     * @see #isIsOrdered()
     * @see #setIsOrdered(boolean)
     * @generated
     */
    void unsetIsOrdered();

    /**
     * Returns whether the value of the '{@link xmei.ConnectorModifiersType#isIsOrdered <em>Is Ordered</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Ordered</em>' attribute is set.
     * @see #unsetIsOrdered()
     * @see #isIsOrdered()
     * @see #setIsOrdered(boolean)
     * @generated
     */
    boolean isSetIsOrdered();

    /**
     * Returns the value of the '<em><b>Is Root</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Root</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Root</em>' attribute.
     * @see #isSetIsRoot()
     * @see #unsetIsRoot()
     * @see #setIsRoot(boolean)
     * @see xmei.XmeiPackage#getConnectorModifiersType_IsRoot()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='isRoot'"
     * @generated
     */
    boolean isIsRoot();

    /**
     * Sets the value of the '{@link xmei.ConnectorModifiersType#isIsRoot <em>Is Root</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Root</em>' attribute.
     * @see #isSetIsRoot()
     * @see #unsetIsRoot()
     * @see #isIsRoot()
     * @generated
     */
    void setIsRoot(boolean value);

    /**
     * Unsets the value of the '{@link xmei.ConnectorModifiersType#isIsRoot <em>Is Root</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsRoot()
     * @see #isIsRoot()
     * @see #setIsRoot(boolean)
     * @generated
     */
    void unsetIsRoot();

    /**
     * Returns whether the value of the '{@link xmei.ConnectorModifiersType#isIsRoot <em>Is Root</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Root</em>' attribute is set.
     * @see #unsetIsRoot()
     * @see #isIsRoot()
     * @see #setIsRoot(boolean)
     * @generated
     */
    boolean isSetIsRoot();

} // ConnectorModifiersType
