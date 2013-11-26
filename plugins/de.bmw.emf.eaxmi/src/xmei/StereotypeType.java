/**
 */
package xmei;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Stereotype Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see xmei.XmeiPackage#getStereotypeType()
 * @model extendedMetaData="name='stereotypeType'"
 * @generated
 */
public enum StereotypeType implements Enumerator
{
    /**
     * The '<em><b>Array</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ARRAY_VALUE
     * @generated
     * @ordered
     */
    ARRAY(0, "array", "array"),

    /**
     * The '<em><b>Array Of</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ARRAY_OF_VALUE
     * @generated
     * @ordered
     */
    ARRAY_OF(1, "arrayOf", "arrayOf"),

    /**
     * The '<em><b>Attribute</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ATTRIBUTE_VALUE
     * @generated
     * @ordered
     */
    ATTRIBUTE(2, "attribute", "attribute"),

    /**
     * The '<em><b>Attribute Nosubscriptions</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ATTRIBUTE_NOSUBSCRIPTIONS_VALUE
     * @generated
     * @ordered
     */
    ATTRIBUTE_NOSUBSCRIPTIONS(3, "attributeNosubscriptions", "attribute nosubscriptions"),

    /**
     * The '<em><b>Attribute Readonly</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ATTRIBUTE_READONLY_VALUE
     * @generated
     * @ordered
     */
    ATTRIBUTE_READONLY(4, "attributeReadonly", "attribute readonly"),

    /**
     * The '<em><b>Attribute Readonly Nosubscriptions</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ATTRIBUTE_READONLY_NOSUBSCRIPTIONS_VALUE
     * @generated
     * @ordered
     */
    ATTRIBUTE_READONLY_NOSUBSCRIPTIONS(5, "attributeReadonlyNosubscriptions", "attribute readonly nosubscriptions"),

    /**
     * The '<em><b>Broadcast</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BROADCAST_VALUE
     * @generated
     * @ordered
     */
    BROADCAST(6, "broadcast", "broadcast"),

    /**
     * The '<em><b>Broadcast Selective</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #BROADCAST_SELECTIVE_VALUE
     * @generated
     * @ordered
     */
    BROADCAST_SELECTIVE(7, "broadcastSelective", "broadcast selective"),

    /**
     * The '<em><b>Enumeration</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ENUMERATION_VALUE
     * @generated
     * @ordered
     */
    ENUMERATION(8, "enumeration", "enumeration"),

    /**
     * The '<em><b>Extends</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EXTENDS_VALUE
     * @generated
     * @ordered
     */
    EXTENDS(9, "extends", "extends"),

    /**
     * The '<em><b>Fidl</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FIDL_VALUE
     * @generated
     * @ordered
     */
    FIDL(10, "fidl", "fidl"),

    /**
     * The '<em><b>Franca Client Interface</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FRANCA_CLIENT_INTERFACE_VALUE
     * @generated
     * @ordered
     */
    FRANCA_CLIENT_INTERFACE(11, "FrancaClientInterface", "FrancaClientInterface"),

    /**
     * The '<em><b>Franca Enum</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FRANCA_ENUM_VALUE
     * @generated
     * @ordered
     */
    FRANCA_ENUM(12, "FrancaEnum", "FrancaEnum"),

    /**
     * The '<em><b>Franca Interface</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FRANCA_INTERFACE_VALUE
     * @generated
     * @ordered
     */
    FRANCA_INTERFACE(13, "FrancaInterface", "FrancaInterface"),

    /**
     * The '<em><b>Franca Service Interface</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FRANCA_SERVICE_INTERFACE_VALUE
     * @generated
     * @ordered
     */
    FRANCA_SERVICE_INTERFACE(14, "FrancaServiceInterface", "FrancaServiceInterface"),

    /**
     * The '<em><b>Import</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMPORT_VALUE
     * @generated
     * @ordered
     */
    IMPORT(15, "import", "import"),

    /**
     * The '<em><b>Key</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #KEY_VALUE
     * @generated
     * @ordered
     */
    KEY(16, "key", "key"),

    /**
     * The '<em><b>Map</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MAP_VALUE
     * @generated
     * @ordered
     */
    MAP(17, "map", "map"),

    /**
     * The '<em><b>Method</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #METHOD_VALUE
     * @generated
     * @ordered
     */
    METHOD(18, "method", "method"),

    /**
     * The '<em><b>Method Fireandforget</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #METHOD_FIREANDFORGET_VALUE
     * @generated
     * @ordered
     */
    METHOD_FIREANDFORGET(19, "methodFireandforget", "method fireandforget"),

    /**
     * The '<em><b>Root</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROOT_VALUE
     * @generated
     * @ordered
     */
    ROOT(20, "root", "root"),

    /**
     * The '<em><b>Struct</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STRUCT_VALUE
     * @generated
     * @ordered
     */
    STRUCT(21, "struct", "struct"),

    /**
     * The '<em><b>Typedef</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TYPEDEF_VALUE
     * @generated
     * @ordered
     */
    TYPEDEF(22, "typedef", "typedef"),

    /**
     * The '<em><b>Union</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNION_VALUE
     * @generated
     * @ordered
     */
    UNION(23, "union", "union"),

    /**
     * The '<em><b>Use</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #USE_VALUE
     * @generated
     * @ordered
     */
    USE(24, "use", "use"),

    /**
     * The '<em><b>Value</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #VALUE_VALUE
     * @generated
     * @ordered
     */
    VALUE(25, "value", "value");

    /**
     * The '<em><b>Array</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Array</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ARRAY
     * @model name="array"
     * @generated
     * @ordered
     */
    public static final int ARRAY_VALUE = 0;

    /**
     * The '<em><b>Array Of</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Array Of</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ARRAY_OF
     * @model name="arrayOf"
     * @generated
     * @ordered
     */
    public static final int ARRAY_OF_VALUE = 1;

    /**
     * The '<em><b>Attribute</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Attribute</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ATTRIBUTE
     * @model name="attribute"
     * @generated
     * @ordered
     */
    public static final int ATTRIBUTE_VALUE = 2;

    /**
     * The '<em><b>Attribute Nosubscriptions</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Attribute Nosubscriptions</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ATTRIBUTE_NOSUBSCRIPTIONS
     * @model name="attributeNosubscriptions" literal="attribute nosubscriptions"
     * @generated
     * @ordered
     */
    public static final int ATTRIBUTE_NOSUBSCRIPTIONS_VALUE = 3;

    /**
     * The '<em><b>Attribute Readonly</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Attribute Readonly</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ATTRIBUTE_READONLY
     * @model name="attributeReadonly" literal="attribute readonly"
     * @generated
     * @ordered
     */
    public static final int ATTRIBUTE_READONLY_VALUE = 4;

    /**
     * The '<em><b>Attribute Readonly Nosubscriptions</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Attribute Readonly Nosubscriptions</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ATTRIBUTE_READONLY_NOSUBSCRIPTIONS
     * @model name="attributeReadonlyNosubscriptions" literal="attribute readonly nosubscriptions"
     * @generated
     * @ordered
     */
    public static final int ATTRIBUTE_READONLY_NOSUBSCRIPTIONS_VALUE = 5;

    /**
     * The '<em><b>Broadcast</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Broadcast</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BROADCAST
     * @model name="broadcast"
     * @generated
     * @ordered
     */
    public static final int BROADCAST_VALUE = 6;

    /**
     * The '<em><b>Broadcast Selective</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Broadcast Selective</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #BROADCAST_SELECTIVE
     * @model name="broadcastSelective" literal="broadcast selective"
     * @generated
     * @ordered
     */
    public static final int BROADCAST_SELECTIVE_VALUE = 7;

    /**
     * The '<em><b>Enumeration</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Enumeration</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ENUMERATION
     * @model name="enumeration"
     * @generated
     * @ordered
     */
    public static final int ENUMERATION_VALUE = 8;

    /**
     * The '<em><b>Extends</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Extends</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #EXTENDS
     * @model name="extends"
     * @generated
     * @ordered
     */
    public static final int EXTENDS_VALUE = 9;

    /**
     * The '<em><b>Fidl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Fidl</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FIDL
     * @model name="fidl"
     * @generated
     * @ordered
     */
    public static final int FIDL_VALUE = 10;

    /**
     * The '<em><b>Franca Client Interface</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Franca Client Interface</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FRANCA_CLIENT_INTERFACE
     * @model name="FrancaClientInterface"
     * @generated
     * @ordered
     */
    public static final int FRANCA_CLIENT_INTERFACE_VALUE = 11;

    /**
     * The '<em><b>Franca Enum</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Franca Enum</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FRANCA_ENUM
     * @model name="FrancaEnum"
     * @generated
     * @ordered
     */
    public static final int FRANCA_ENUM_VALUE = 12;

    /**
     * The '<em><b>Franca Interface</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Franca Interface</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FRANCA_INTERFACE
     * @model name="FrancaInterface"
     * @generated
     * @ordered
     */
    public static final int FRANCA_INTERFACE_VALUE = 13;

    /**
     * The '<em><b>Franca Service Interface</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Franca Service Interface</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FRANCA_SERVICE_INTERFACE
     * @model name="FrancaServiceInterface"
     * @generated
     * @ordered
     */
    public static final int FRANCA_SERVICE_INTERFACE_VALUE = 14;

    /**
     * The '<em><b>Import</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Import</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #IMPORT
     * @model name="import"
     * @generated
     * @ordered
     */
    public static final int IMPORT_VALUE = 15;

    /**
     * The '<em><b>Key</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Key</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #KEY
     * @model name="key"
     * @generated
     * @ordered
     */
    public static final int KEY_VALUE = 16;

    /**
     * The '<em><b>Map</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Map</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MAP
     * @model name="map"
     * @generated
     * @ordered
     */
    public static final int MAP_VALUE = 17;

    /**
     * The '<em><b>Method</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Method</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #METHOD
     * @model name="method"
     * @generated
     * @ordered
     */
    public static final int METHOD_VALUE = 18;

    /**
     * The '<em><b>Method Fireandforget</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Method Fireandforget</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #METHOD_FIREANDFORGET
     * @model name="methodFireandforget" literal="method fireandforget"
     * @generated
     * @ordered
     */
    public static final int METHOD_FIREANDFORGET_VALUE = 19;

    /**
     * The '<em><b>Root</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Root</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #ROOT
     * @model name="root"
     * @generated
     * @ordered
     */
    public static final int ROOT_VALUE = 20;

    /**
     * The '<em><b>Struct</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Struct</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STRUCT
     * @model name="struct"
     * @generated
     * @ordered
     */
    public static final int STRUCT_VALUE = 21;

    /**
     * The '<em><b>Typedef</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Typedef</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TYPEDEF
     * @model name="typedef"
     * @generated
     * @ordered
     */
    public static final int TYPEDEF_VALUE = 22;

    /**
     * The '<em><b>Union</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Union</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNION
     * @model name="union"
     * @generated
     * @ordered
     */
    public static final int UNION_VALUE = 23;

    /**
     * The '<em><b>Use</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Use</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #USE
     * @model name="use"
     * @generated
     * @ordered
     */
    public static final int USE_VALUE = 24;

    /**
     * The '<em><b>Value</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Value</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #VALUE
     * @model name="value"
     * @generated
     * @ordered
     */
    public static final int VALUE_VALUE = 25;

    /**
     * An array of all the '<em><b>Stereotype Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final StereotypeType[] VALUES_ARRAY =
        new StereotypeType[]
        {
            ARRAY,
            ARRAY_OF,
            ATTRIBUTE,
            ATTRIBUTE_NOSUBSCRIPTIONS,
            ATTRIBUTE_READONLY,
            ATTRIBUTE_READONLY_NOSUBSCRIPTIONS,
            BROADCAST,
            BROADCAST_SELECTIVE,
            ENUMERATION,
            EXTENDS,
            FIDL,
            FRANCA_CLIENT_INTERFACE,
            FRANCA_ENUM,
            FRANCA_INTERFACE,
            FRANCA_SERVICE_INTERFACE,
            IMPORT,
            KEY,
            MAP,
            METHOD,
            METHOD_FIREANDFORGET,
            ROOT,
            STRUCT,
            TYPEDEF,
            UNION,
            USE,
            VALUE,
        };

    /**
     * A public read-only list of all the '<em><b>Stereotype Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<StereotypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Stereotype Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static StereotypeType get(String literal)
    {
        for (int i = 0; i < VALUES_ARRAY.length; ++i)
        {
            StereotypeType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Stereotype Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static StereotypeType getByName(String name)
    {
        for (int i = 0; i < VALUES_ARRAY.length; ++i)
        {
            StereotypeType result = VALUES_ARRAY[i];
            if (result.getName().equals(name))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Stereotype Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static StereotypeType get(int value)
    {
        switch (value)
        {
            case ARRAY_VALUE: return ARRAY;
            case ARRAY_OF_VALUE: return ARRAY_OF;
            case ATTRIBUTE_VALUE: return ATTRIBUTE;
            case ATTRIBUTE_NOSUBSCRIPTIONS_VALUE: return ATTRIBUTE_NOSUBSCRIPTIONS;
            case ATTRIBUTE_READONLY_VALUE: return ATTRIBUTE_READONLY;
            case ATTRIBUTE_READONLY_NOSUBSCRIPTIONS_VALUE: return ATTRIBUTE_READONLY_NOSUBSCRIPTIONS;
            case BROADCAST_VALUE: return BROADCAST;
            case BROADCAST_SELECTIVE_VALUE: return BROADCAST_SELECTIVE;
            case ENUMERATION_VALUE: return ENUMERATION;
            case EXTENDS_VALUE: return EXTENDS;
            case FIDL_VALUE: return FIDL;
            case FRANCA_CLIENT_INTERFACE_VALUE: return FRANCA_CLIENT_INTERFACE;
            case FRANCA_ENUM_VALUE: return FRANCA_ENUM;
            case FRANCA_INTERFACE_VALUE: return FRANCA_INTERFACE;
            case FRANCA_SERVICE_INTERFACE_VALUE: return FRANCA_SERVICE_INTERFACE;
            case IMPORT_VALUE: return IMPORT;
            case KEY_VALUE: return KEY;
            case MAP_VALUE: return MAP;
            case METHOD_VALUE: return METHOD;
            case METHOD_FIREANDFORGET_VALUE: return METHOD_FIREANDFORGET;
            case ROOT_VALUE: return ROOT;
            case STRUCT_VALUE: return STRUCT;
            case TYPEDEF_VALUE: return TYPEDEF;
            case UNION_VALUE: return UNION;
            case USE_VALUE: return USE;
            case VALUE_VALUE: return VALUE;
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
    private StereotypeType(int value, String name, String literal)
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
    
} //StereotypeType
