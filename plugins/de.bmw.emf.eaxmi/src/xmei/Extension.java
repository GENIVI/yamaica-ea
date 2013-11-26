/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.Extension#getElements <em>Elements</em>}</li>
 *   <li>{@link xmei.Extension#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link xmei.Extension#getPrimitivetypes <em>Primitivetypes</em>}</li>
 *   <li>{@link xmei.Extension#getProfiles <em>Profiles</em>}</li>
 *   <li>{@link xmei.Extension#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link xmei.Extension#getExtender <em>Extender</em>}</li>
 *   <li>{@link xmei.Extension#getExtenderID <em>Extender ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getExtension()
 * @model extendedMetaData="name='Extension' kind='elementOnly'"
 * @generated
 */
public interface Extension extends EObject
{
    /**
     * Returns the value of the '<em><b>Elements</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Elements</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elements</em>' containment reference.
     * @see #setElements(ElementsType)
     * @see xmei.XmeiPackage#getExtension_Elements()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='elements'"
     * @generated
     */
    ElementsType getElements();

    /**
     * Sets the value of the '{@link xmei.Extension#getElements <em>Elements</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Elements</em>' containment reference.
     * @see #getElements()
     * @generated
     */
    void setElements(ElementsType value);

    /**
     * Returns the value of the '<em><b>Connectors</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connectors</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connectors</em>' containment reference.
     * @see #setConnectors(ConnectorsType)
     * @see xmei.XmeiPackage#getExtension_Connectors()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='connectors'"
     * @generated
     */
    ConnectorsType getConnectors();

    /**
     * Sets the value of the '{@link xmei.Extension#getConnectors <em>Connectors</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connectors</em>' containment reference.
     * @see #getConnectors()
     * @generated
     */
    void setConnectors(ConnectorsType value);

    /**
     * Returns the value of the '<em><b>Primitivetypes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Primitivetypes</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Primitivetypes</em>' containment reference.
     * @see #setPrimitivetypes(PrimitiveTypesType)
     * @see xmei.XmeiPackage#getExtension_Primitivetypes()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='primitivetypes'"
     * @generated
     */
    PrimitiveTypesType getPrimitivetypes();

    /**
     * Sets the value of the '{@link xmei.Extension#getPrimitivetypes <em>Primitivetypes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Primitivetypes</em>' containment reference.
     * @see #getPrimitivetypes()
     * @generated
     */
    void setPrimitivetypes(PrimitiveTypesType value);

    /**
     * Returns the value of the '<em><b>Profiles</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Profiles</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Profiles</em>' attribute.
     * @see #setProfiles(String)
     * @see xmei.XmeiPackage#getExtension_Profiles()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='element' name='profiles'"
     * @generated
     */
    String getProfiles();

    /**
     * Sets the value of the '{@link xmei.Extension#getProfiles <em>Profiles</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Profiles</em>' attribute.
     * @see #getProfiles()
     * @generated
     */
    void setProfiles(String value);

    /**
     * Returns the value of the '<em><b>Diagrams</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagrams</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagrams</em>' containment reference.
     * @see #setDiagrams(DiagramsType)
     * @see xmei.XmeiPackage#getExtension_Diagrams()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='diagrams'"
     * @generated
     */
    DiagramsType getDiagrams();

    /**
     * Sets the value of the '{@link xmei.Extension#getDiagrams <em>Diagrams</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diagrams</em>' containment reference.
     * @see #getDiagrams()
     * @generated
     */
    void setDiagrams(DiagramsType value);

    /**
     * Returns the value of the '<em><b>Extender</b></em>' attribute.
     * The default value is <code>"Enterprise Architect"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extender</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extender</em>' attribute.
     * @see #isSetExtender()
     * @see #unsetExtender()
     * @see #setExtender(String)
     * @see xmei.XmeiPackage#getExtension_Extender()
     * @model default="Enterprise Architect" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='extender'"
     * @generated
     */
    String getExtender();

    /**
     * Sets the value of the '{@link xmei.Extension#getExtender <em>Extender</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Extender</em>' attribute.
     * @see #isSetExtender()
     * @see #unsetExtender()
     * @see #getExtender()
     * @generated
     */
    void setExtender(String value);

    /**
     * Unsets the value of the '{@link xmei.Extension#getExtender <em>Extender</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExtender()
     * @see #getExtender()
     * @see #setExtender(String)
     * @generated
     */
    void unsetExtender();

    /**
     * Returns whether the value of the '{@link xmei.Extension#getExtender <em>Extender</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Extender</em>' attribute is set.
     * @see #unsetExtender()
     * @see #getExtender()
     * @see #setExtender(String)
     * @generated
     */
    boolean isSetExtender();

    /**
     * Returns the value of the '<em><b>Extender ID</b></em>' attribute.
     * The default value is <code>"6.5"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extender ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extender ID</em>' attribute.
     * @see #isSetExtenderID()
     * @see #unsetExtenderID()
     * @see #setExtenderID(String)
     * @see xmei.XmeiPackage#getExtension_ExtenderID()
     * @model default="6.5" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='extenderID'"
     * @generated
     */
    String getExtenderID();

    /**
     * Sets the value of the '{@link xmei.Extension#getExtenderID <em>Extender ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Extender ID</em>' attribute.
     * @see #isSetExtenderID()
     * @see #unsetExtenderID()
     * @see #getExtenderID()
     * @generated
     */
    void setExtenderID(String value);

    /**
     * Unsets the value of the '{@link xmei.Extension#getExtenderID <em>Extender ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExtenderID()
     * @see #getExtenderID()
     * @see #setExtenderID(String)
     * @generated
     */
    void unsetExtenderID();

    /**
     * Returns whether the value of the '{@link xmei.Extension#getExtenderID <em>Extender ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Extender ID</em>' attribute is set.
     * @see #unsetExtenderID()
     * @see #getExtenderID()
     * @see #setExtenderID(String)
     * @generated
     */
    boolean isSetExtenderID();

} // Extension
