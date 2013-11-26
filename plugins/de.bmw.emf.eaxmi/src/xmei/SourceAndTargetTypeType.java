/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source And Target Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.SourceAndTargetTypeType#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link xmei.SourceAndTargetTypeType#getContainment <em>Containment</em>}</li>
 *   <li>{@link xmei.SourceAndTargetTypeType#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getSourceAndTargetTypeType()
 * @model extendedMetaData="name='sourceAndTargetTypeType' kind='empty'"
 * @generated
 */
public interface SourceAndTargetTypeType extends EObject
{
    /**
     * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Aggregation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Aggregation</em>' attribute.
     * @see #setAggregation(String)
     * @see xmei.XmeiPackage#getSourceAndTargetTypeType_Aggregation()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='aggregation'"
     * @generated
     */
    String getAggregation();

    /**
     * Sets the value of the '{@link xmei.SourceAndTargetTypeType#getAggregation <em>Aggregation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Aggregation</em>' attribute.
     * @see #getAggregation()
     * @generated
     */
    void setAggregation(String value);

    /**
     * Returns the value of the '<em><b>Containment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Containment</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Containment</em>' attribute.
     * @see #setContainment(String)
     * @see xmei.XmeiPackage#getSourceAndTargetTypeType_Containment()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='containment'"
     * @generated
     */
    String getContainment();

    /**
     * Sets the value of the '{@link xmei.SourceAndTargetTypeType#getContainment <em>Containment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Containment</em>' attribute.
     * @see #getContainment()
     * @generated
     */
    void setContainment(String value);

    /**
     * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Multiplicity</em>' attribute.
     * @see #setMultiplicity(String)
     * @see xmei.XmeiPackage#getSourceAndTargetTypeType_Multiplicity()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='multiplicity'"
     * @generated
     */
    String getMultiplicity();

    /**
     * Sets the value of the '{@link xmei.SourceAndTargetTypeType#getMultiplicity <em>Multiplicity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Multiplicity</em>' attribute.
     * @see #getMultiplicity()
     * @generated
     */
    void setMultiplicity(String value);

} // SourceAndTargetTypeType
