/**
 */
package xmei;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Async Sync Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see xmei.XmeiPackage#getAsyncSyncType()
 * @model extendedMetaData="name='asyncSyncType'"
 * @generated
 */
public enum AsyncSyncType implements Enumerator
{
    /**
     * The '<em><b>Synchronous</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SYNCHRONOUS_VALUE
     * @generated
     * @ordered
     */
    SYNCHRONOUS(0, "Synchronous", "Synchronous"),

    /**
     * The '<em><b>Asynchronous</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASYNCHRONOUS_VALUE
     * @generated
     * @ordered
     */
    ASYNCHRONOUS(1, "Asynchronous", "Asynchronous");

    /**
     * The '<em><b>Synchronous</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Synchronous</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SYNCHRONOUS
     * @model name="Synchronous"
     * @generated
     * @ordered
     */
    public static final int SYNCHRONOUS_VALUE = 0;

    /**
     * The '<em><b>Asynchronous</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Asynchronous</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ASYNCHRONOUS
     * @model name="Asynchronous"
     * @generated
     * @ordered
     */
    public static final int ASYNCHRONOUS_VALUE = 1;

    /**
     * An array of all the '<em><b>Async Sync Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AsyncSyncType[] VALUES_ARRAY =
        new AsyncSyncType[]
        {
            SYNCHRONOUS,
            ASYNCHRONOUS,
        };

    /**
     * A public read-only list of all the '<em><b>Async Sync Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<AsyncSyncType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Async Sync Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AsyncSyncType get(String literal)
    {
        for (int i = 0; i < VALUES_ARRAY.length; ++i)
        {
            AsyncSyncType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Async Sync Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AsyncSyncType getByName(String name)
    {
        for (int i = 0; i < VALUES_ARRAY.length; ++i)
        {
            AsyncSyncType result = VALUES_ARRAY[i];
            if (result.getName().equals(name))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Async Sync Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static AsyncSyncType get(int value)
    {
        switch (value)
        {
            case SYNCHRONOUS_VALUE: return SYNCHRONOUS;
            case ASYNCHRONOUS_VALUE: return ASYNCHRONOUS;
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
    private AsyncSyncType(int value, String name, String literal)
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
    
} //AsyncSyncType
