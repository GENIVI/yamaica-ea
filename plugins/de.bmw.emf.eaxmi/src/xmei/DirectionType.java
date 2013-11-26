/**
 */
package xmei;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Direction Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see xmei.XmeiPackage#getDirectionType()
 * @model extendedMetaData="name='directionType'"
 * @generated
 */
public enum DirectionType implements Enumerator
{
    /**
     * The '<em><b>Destination Source</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DESTINATION_SOURCE_VALUE
     * @generated
     * @ordered
     */
    DESTINATION_SOURCE(0, "DestinationSource", "Destination -> Source"),

    /**
     * The '<em><b>Source Destination</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SOURCE_DESTINATION_VALUE
     * @generated
     * @ordered
     */
    SOURCE_DESTINATION(1, "SourceDestination", "Source -> Destination"),

    /**
     * The '<em><b>Unspecified</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNSPECIFIED_VALUE
     * @generated
     * @ordered
     */
    UNSPECIFIED(2, "Unspecified", "Unspecified");

    /**
     * The '<em><b>Destination Source</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Destination Source</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DESTINATION_SOURCE
     * @model name="DestinationSource" literal="Destination -> Source"
     * @generated
     * @ordered
     */
    public static final int DESTINATION_SOURCE_VALUE = 0;

    /**
     * The '<em><b>Source Destination</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Source Destination</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SOURCE_DESTINATION
     * @model name="SourceDestination" literal="Source -> Destination"
     * @generated
     * @ordered
     */
    public static final int SOURCE_DESTINATION_VALUE = 1;

    /**
     * The '<em><b>Unspecified</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Unspecified</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNSPECIFIED
     * @model name="Unspecified"
     * @generated
     * @ordered
     */
    public static final int UNSPECIFIED_VALUE = 2;

    /**
     * An array of all the '<em><b>Direction Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final DirectionType[] VALUES_ARRAY =
        new DirectionType[]
        {
            DESTINATION_SOURCE,
            SOURCE_DESTINATION,
            UNSPECIFIED,
        };

    /**
     * A public read-only list of all the '<em><b>Direction Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<DirectionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Direction Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DirectionType get(String literal)
    {
        for (int i = 0; i < VALUES_ARRAY.length; ++i)
        {
            DirectionType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Direction Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DirectionType getByName(String name)
    {
        for (int i = 0; i < VALUES_ARRAY.length; ++i)
        {
            DirectionType result = VALUES_ARRAY[i];
            if (result.getName().equals(name))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Direction Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DirectionType get(int value)
    {
        switch (value)
        {
            case DESTINATION_SOURCE_VALUE: return DESTINATION_SOURCE;
            case SOURCE_DESTINATION_VALUE: return SOURCE_DESTINATION;
            case UNSPECIFIED_VALUE: return UNSPECIFIED;
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
    private DirectionType(int value, String name, String literal)
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
    
} //DirectionType
