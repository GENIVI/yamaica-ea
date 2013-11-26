/**
 */
package xmei;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ea Types Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see xmei.XmeiPackage#getEaTypesType()
 * @model extendedMetaData="name='eaTypesType'"
 * @generated
 */
public enum EaTypesType implements Enumerator
{
    /**
     * The '<em><b>Association</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSOCIATION_VALUE
     * @generated
     * @ordered
     */
    ASSOCIATION(0, "Association", "Association"),

    /**
     * The '<em><b>Dependency</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEPENDENCY_VALUE
     * @generated
     * @ordered
     */
    DEPENDENCY(1, "Dependency", "Dependency"),

    /**
     * The '<em><b>Generalization</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GENERALIZATION_VALUE
     * @generated
     * @ordered
     */
    GENERALIZATION(2, "Generalization", "Generalization"),

    /**
     * The '<em><b>Package</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PACKAGE_VALUE
     * @generated
     * @ordered
     */
    PACKAGE(3, "Package", "Package"),

    /**
     * The '<em><b>Sequence</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SEQUENCE_VALUE
     * @generated
     * @ordered
     */
    SEQUENCE(4, "Sequence", "Sequence"),

    /**
     * The '<em><b>Realisation</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REALISATION_VALUE
     * @generated
     * @ordered
     */
    REALISATION(5, "Realisation", "Realisation");

    /**
     * The '<em><b>Association</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Association</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ASSOCIATION
     * @model name="Association"
     * @generated
     * @ordered
     */
    public static final int ASSOCIATION_VALUE = 0;

    /**
     * The '<em><b>Dependency</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Dependency</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEPENDENCY
     * @model name="Dependency"
     * @generated
     * @ordered
     */
    public static final int DEPENDENCY_VALUE = 1;

    /**
     * The '<em><b>Generalization</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Generalization</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #GENERALIZATION
     * @model name="Generalization"
     * @generated
     * @ordered
     */
    public static final int GENERALIZATION_VALUE = 2;

    /**
     * The '<em><b>Package</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Package</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PACKAGE
     * @model name="Package"
     * @generated
     * @ordered
     */
    public static final int PACKAGE_VALUE = 3;

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
    public static final int SEQUENCE_VALUE = 4;

    /**
     * The '<em><b>Realisation</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Realisation</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #REALISATION
     * @model name="Realisation"
     * @generated
     * @ordered
     */
    public static final int REALISATION_VALUE = 5;

    /**
     * An array of all the '<em><b>Ea Types Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final EaTypesType[] VALUES_ARRAY =
        new EaTypesType[]
        {
            ASSOCIATION,
            DEPENDENCY,
            GENERALIZATION,
            PACKAGE,
            SEQUENCE,
            REALISATION,
        };

    /**
     * A public read-only list of all the '<em><b>Ea Types Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<EaTypesType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Ea Types Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EaTypesType get(String literal)
    {
        for (int i = 0; i < VALUES_ARRAY.length; ++i)
        {
            EaTypesType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Ea Types Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EaTypesType getByName(String name)
    {
        for (int i = 0; i < VALUES_ARRAY.length; ++i)
        {
            EaTypesType result = VALUES_ARRAY[i];
            if (result.getName().equals(name))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Ea Types Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EaTypesType get(int value)
    {
        switch (value)
        {
            case ASSOCIATION_VALUE: return ASSOCIATION;
            case DEPENDENCY_VALUE: return DEPENDENCY;
            case GENERALIZATION_VALUE: return GENERALIZATION;
            case PACKAGE_VALUE: return PACKAGE;
            case SEQUENCE_VALUE: return SEQUENCE;
            case REALISATION_VALUE: return REALISATION;
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
    private EaTypesType(int value, String name, String literal)
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
    
} //EaTypesType
