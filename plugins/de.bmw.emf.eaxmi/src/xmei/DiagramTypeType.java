/**
 */
package xmei;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Diagram Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see xmei.XmeiPackage#getDiagramTypeType()
 * @model extendedMetaData="name='diagramTypeType'"
 * @generated
 */
public enum DiagramTypeType implements Enumerator
{
    /**
     * The '<em><b>Component</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COMPONENT_VALUE
     * @generated
     * @ordered
     */
    COMPONENT(0, "Component", "Component"),

    /**
     * The '<em><b>Logical</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOGICAL_VALUE
     * @generated
     * @ordered
     */
    LOGICAL(1, "Logical", "Logical"),

    /**
     * The '<em><b>Sequence</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SEQUENCE_VALUE
     * @generated
     * @ordered
     */
    SEQUENCE(2, "Sequence", "Sequence");

    /**
     * The '<em><b>Component</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Component</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #COMPONENT
     * @model name="Component"
     * @generated
     * @ordered
     */
    public static final int COMPONENT_VALUE = 0;

    /**
     * The '<em><b>Logical</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Logical</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOGICAL
     * @model name="Logical"
     * @generated
     * @ordered
     */
    public static final int LOGICAL_VALUE = 1;

    /**
     * The '<em><b>Sequence</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Sequence</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SEQUENCE
     * @model name="Sequence"
     * @generated
     * @ordered
     */
    public static final int SEQUENCE_VALUE = 2;

    /**
     * An array of all the '<em><b>Diagram Type Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final DiagramTypeType[] VALUES_ARRAY =
        new DiagramTypeType[]
        {
            COMPONENT,
            LOGICAL,
            SEQUENCE,
        };

    /**
     * A public read-only list of all the '<em><b>Diagram Type Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<DiagramTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Diagram Type Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DiagramTypeType get(String literal)
    {
        for (int i = 0; i < VALUES_ARRAY.length; ++i)
        {
            DiagramTypeType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Diagram Type Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DiagramTypeType getByName(String name)
    {
        for (int i = 0; i < VALUES_ARRAY.length; ++i)
        {
            DiagramTypeType result = VALUES_ARRAY[i];
            if (result.getName().equals(name))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Diagram Type Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DiagramTypeType get(int value)
    {
        switch (value)
        {
            case COMPONENT_VALUE: return COMPONENT;
            case LOGICAL_VALUE: return LOGICAL;
            case SEQUENCE_VALUE: return SEQUENCE;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private DiagramTypeType(int value, String name, String literal)
    {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue()
    {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName()
    {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral()
    {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString()
    {
        return literal;
    }
    
} //DiagramTypeType
