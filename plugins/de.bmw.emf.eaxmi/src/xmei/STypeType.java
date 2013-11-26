/**
 */
package xmei;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SType Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see xmei.XmeiPackage#getSTypeType()
 * @model extendedMetaData="name='sTypeType'"
 * @generated
 */
public enum STypeType implements Enumerator
{
    /**
     * The '<em><b>Class</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CLASS_VALUE
     * @generated
     * @ordered
     */
    CLASS(0, "Class", "Class"),

    /**
     * The '<em><b>Component</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COMPONENT_VALUE
     * @generated
     * @ordered
     */
    COMPONENT(1, "Component", "Component"),

    /**
     * The '<em><b>Interface</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INTERFACE_VALUE
     * @generated
     * @ordered
     */
    INTERFACE(2, "Interface", "Interface"),

    /**
     * The '<em><b>Package</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PACKAGE_VALUE
     * @generated
     * @ordered
     */
    PACKAGE(3, "Package", "Package");

    /**
     * The '<em><b>Class</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Class</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #CLASS
     * @model name="Class"
     * @generated
     * @ordered
     */
    public static final int CLASS_VALUE = 0;

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
    public static final int COMPONENT_VALUE = 1;

    /**
     * The '<em><b>Interface</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Interface</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INTERFACE
     * @model name="Interface"
     * @generated
     * @ordered
     */
    public static final int INTERFACE_VALUE = 2;

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
     * An array of all the '<em><b>SType Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final STypeType[] VALUES_ARRAY =
        new STypeType[]
        {
            CLASS,
            COMPONENT,
            INTERFACE,
            PACKAGE,
        };

    /**
     * A public read-only list of all the '<em><b>SType Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<STypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>SType Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static STypeType get(String literal)
    {
        for (int i = 0; i < VALUES_ARRAY.length; ++i)
        {
            STypeType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>SType Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static STypeType getByName(String name)
    {
        for (int i = 0; i < VALUES_ARRAY.length; ++i)
        {
            STypeType result = VALUES_ARRAY[i];
            if (result.getName().equals(name))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>SType Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static STypeType get(int value)
    {
        switch (value)
        {
            case CLASS_VALUE: return CLASS;
            case COMPONENT_VALUE: return COMPONENT;
            case INTERFACE_VALUE: return INTERFACE;
            case PACKAGE_VALUE: return PACKAGE;
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
    private STypeType(int value, String name, String literal)
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
    
} //STypeType
