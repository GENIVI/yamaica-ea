/**
 */
package xmei;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Base Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see xmei.XmeiPackage#getTypeBaseType()
 * @model extendedMetaData="name='typeBaseType'"
 * @generated
 */
public enum TypeBaseType implements Enumerator
{
    /**
     * The '<em><b>Uml Association</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_ASSOCIATION_VALUE
     * @generated
     * @ordered
     */
    UML_ASSOCIATION(0, "umlAssociation", "uml:Association"),

    /**
     * The '<em><b>Uml Class</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_CLASS_VALUE
     * @generated
     * @ordered
     */
    UML_CLASS(1, "umlClass", "uml:Class"),

    /**
     * The '<em><b>Uml Collaboration</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_COLLABORATION_VALUE
     * @generated
     * @ordered
     */
    UML_COLLABORATION(2, "umlCollaboration", "uml:Collaboration"),

    /**
     * The '<em><b>Uml Comment</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_COMMENT_VALUE
     * @generated
     * @ordered
     */
    UML_COMMENT(3, "umlComment", "uml:Comment"),

    /**
     * The '<em><b>Uml Component</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_COMPONENT_VALUE
     * @generated
     * @ordered
     */
    UML_COMPONENT(4, "umlComponent", "uml:Component"),

    /**
     * The '<em><b>Uml Dependency</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_DEPENDENCY_VALUE
     * @generated
     * @ordered
     */
    UML_DEPENDENCY(5, "umlDependency", "uml:Dependency"),

    /**
     * The '<em><b>Uml Enumeration</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_ENUMERATION_VALUE
     * @generated
     * @ordered
     */
    UML_ENUMERATION(6, "umlEnumeration", "uml:Enumeration"),

    /**
     * The '<em><b>Uml Enumeration Literal</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_ENUMERATION_LITERAL_VALUE
     * @generated
     * @ordered
     */
    UML_ENUMERATION_LITERAL(7, "umlEnumerationLiteral", "uml:EnumerationLiteral"),

    /**
     * The '<em><b>Uml Extension</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_EXTENSION_VALUE
     * @generated
     * @ordered
     */
    UML_EXTENSION(8, "umlExtension", "uml:Extension"),

    /**
     * The '<em><b>Uml Generalization</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_GENERALIZATION_VALUE
     * @generated
     * @ordered
     */
    UML_GENERALIZATION(9, "umlGeneralization", "uml:Generalization"),

    /**
     * The '<em><b>Uml Instance Specification</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_INSTANCE_SPECIFICATION_VALUE
     * @generated
     * @ordered
     */
    UML_INSTANCE_SPECIFICATION(10, "umlInstanceSpecification", "uml:InstanceSpecification"),

    /**
     * The '<em><b>Uml Interaction</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_INTERACTION_VALUE
     * @generated
     * @ordered
     */
    UML_INTERACTION(11, "umlInteraction", "uml:Interaction"),

    /**
     * The '<em><b>Uml Interface</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_INTERFACE_VALUE
     * @generated
     * @ordered
     */
    UML_INTERFACE(12, "umlInterface", "uml:Interface"),

    /**
     * The '<em><b>Uml Lifeline</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_LIFELINE_VALUE
     * @generated
     * @ordered
     */
    UML_LIFELINE(13, "umlLifeline", "uml:Lifeline"),

    /**
     * The '<em><b>Uml Literal Integer</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_LITERAL_INTEGER_VALUE
     * @generated
     * @ordered
     */
    UML_LITERAL_INTEGER(14, "umlLiteralInteger", "uml:LiteralInteger"),

    /**
     * The '<em><b>Uml Literal String</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_LITERAL_STRING_VALUE
     * @generated
     * @ordered
     */
    UML_LITERAL_STRING(15, "umlLiteralString", "uml:LiteralString"),

    /**
     * The '<em><b>Uml Literal Unlimited Natural</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_LITERAL_UNLIMITED_NATURAL_VALUE
     * @generated
     * @ordered
     */
    UML_LITERAL_UNLIMITED_NATURAL(16, "umlLiteralUnlimitedNatural", "uml:LiteralUnlimitedNatural"),

    /**
     * The '<em><b>Uml Message</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_MESSAGE_VALUE
     * @generated
     * @ordered
     */
    UML_MESSAGE(17, "umlMessage", "uml:Message"),

    /**
     * The '<em><b>Uml Model</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_MODEL_VALUE
     * @generated
     * @ordered
     */
    UML_MODEL(18, "umlModel", "uml:Model"),

    /**
     * The '<em><b>Uml Occurrence Specification</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_OCCURRENCE_SPECIFICATION_VALUE
     * @generated
     * @ordered
     */
    UML_OCCURRENCE_SPECIFICATION(19, "umlOccurrenceSpecification", "uml:OccurrenceSpecification"),

    /**
     * The '<em><b>Uml Package</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_PACKAGE_VALUE
     * @generated
     * @ordered
     */
    UML_PACKAGE(20, "umlPackage", "uml:Package"),

    /**
     * The '<em><b>Uml Package Import</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_PACKAGE_IMPORT_VALUE
     * @generated
     * @ordered
     */
    UML_PACKAGE_IMPORT(21, "umlPackageImport", "uml:PackageImport"),

    /**
     * The '<em><b>Uml Primitive Type</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_PRIMITIVE_TYPE_VALUE
     * @generated
     * @ordered
     */
    UML_PRIMITIVE_TYPE(22, "umlPrimitiveType", "uml:PrimitiveType"),

    /**
     * The '<em><b>Uml Property</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_PROPERTY_VALUE
     * @generated
     * @ordered
     */
    UML_PROPERTY(23, "umlProperty", "uml:Property"),

    /**
     * The '<em><b>Uml Realization</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_REALIZATION_VALUE
     * @generated
     * @ordered
     */
    UML_REALIZATION(24, "umlRealization", "uml:Realization"),

    /**
     * The '<em><b>Uml Stereotype</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_STEREOTYPE_VALUE
     * @generated
     * @ordered
     */
    UML_STEREOTYPE(25, "umlStereotype", "uml:Stereotype   "),

    /**
     * The '<em><b>Uml Usage</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UML_USAGE_VALUE
     * @generated
     * @ordered
     */
    UML_USAGE(26, "umlUsage", "uml:Usage");

    /**
     * The '<em><b>Uml Association</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Association</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_ASSOCIATION
     * @model name="umlAssociation" literal="uml:Association"
     * @generated
     * @ordered
     */
    public static final int UML_ASSOCIATION_VALUE = 0;

    /**
     * The '<em><b>Uml Class</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Class</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_CLASS
     * @model name="umlClass" literal="uml:Class"
     * @generated
     * @ordered
     */
    public static final int UML_CLASS_VALUE = 1;

    /**
     * The '<em><b>Uml Collaboration</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Collaboration</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_COLLABORATION
     * @model name="umlCollaboration" literal="uml:Collaboration"
     * @generated
     * @ordered
     */
    public static final int UML_COLLABORATION_VALUE = 2;

    /**
     * The '<em><b>Uml Comment</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Comment</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_COMMENT
     * @model name="umlComment" literal="uml:Comment"
     * @generated
     * @ordered
     */
    public static final int UML_COMMENT_VALUE = 3;

    /**
     * The '<em><b>Uml Component</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Component</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_COMPONENT
     * @model name="umlComponent" literal="uml:Component"
     * @generated
     * @ordered
     */
    public static final int UML_COMPONENT_VALUE = 4;

    /**
     * The '<em><b>Uml Dependency</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Dependency</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_DEPENDENCY
     * @model name="umlDependency" literal="uml:Dependency"
     * @generated
     * @ordered
     */
    public static final int UML_DEPENDENCY_VALUE = 5;

    /**
     * The '<em><b>Uml Enumeration</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Enumeration</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_ENUMERATION
     * @model name="umlEnumeration" literal="uml:Enumeration"
     * @generated
     * @ordered
     */
    public static final int UML_ENUMERATION_VALUE = 6;

    /**
     * The '<em><b>Uml Enumeration Literal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Enumeration Literal</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_ENUMERATION_LITERAL
     * @model name="umlEnumerationLiteral" literal="uml:EnumerationLiteral"
     * @generated
     * @ordered
     */
    public static final int UML_ENUMERATION_LITERAL_VALUE = 7;

    /**
     * The '<em><b>Uml Extension</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Extension</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_EXTENSION
     * @model name="umlExtension" literal="uml:Extension"
     * @generated
     * @ordered
     */
    public static final int UML_EXTENSION_VALUE = 8;

    /**
     * The '<em><b>Uml Generalization</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Generalization</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_GENERALIZATION
     * @model name="umlGeneralization" literal="uml:Generalization"
     * @generated
     * @ordered
     */
    public static final int UML_GENERALIZATION_VALUE = 9;

    /**
     * The '<em><b>Uml Instance Specification</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Instance Specification</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_INSTANCE_SPECIFICATION
     * @model name="umlInstanceSpecification" literal="uml:InstanceSpecification"
     * @generated
     * @ordered
     */
    public static final int UML_INSTANCE_SPECIFICATION_VALUE = 10;

    /**
     * The '<em><b>Uml Interaction</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Interaction</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_INTERACTION
     * @model name="umlInteraction" literal="uml:Interaction"
     * @generated
     * @ordered
     */
    public static final int UML_INTERACTION_VALUE = 11;

    /**
     * The '<em><b>Uml Interface</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Interface</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_INTERFACE
     * @model name="umlInterface" literal="uml:Interface"
     * @generated
     * @ordered
     */
    public static final int UML_INTERFACE_VALUE = 12;

    /**
     * The '<em><b>Uml Lifeline</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Lifeline</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_LIFELINE
     * @model name="umlLifeline" literal="uml:Lifeline"
     * @generated
     * @ordered
     */
    public static final int UML_LIFELINE_VALUE = 13;

    /**
     * The '<em><b>Uml Literal Integer</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Literal Integer</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_LITERAL_INTEGER
     * @model name="umlLiteralInteger" literal="uml:LiteralInteger"
     * @generated
     * @ordered
     */
    public static final int UML_LITERAL_INTEGER_VALUE = 14;

    /**
     * The '<em><b>Uml Literal String</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Literal String</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_LITERAL_STRING
     * @model name="umlLiteralString" literal="uml:LiteralString"
     * @generated
     * @ordered
     */
    public static final int UML_LITERAL_STRING_VALUE = 15;

    /**
     * The '<em><b>Uml Literal Unlimited Natural</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Literal Unlimited Natural</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_LITERAL_UNLIMITED_NATURAL
     * @model name="umlLiteralUnlimitedNatural" literal="uml:LiteralUnlimitedNatural"
     * @generated
     * @ordered
     */
    public static final int UML_LITERAL_UNLIMITED_NATURAL_VALUE = 16;

    /**
     * The '<em><b>Uml Message</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Message</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_MESSAGE
     * @model name="umlMessage" literal="uml:Message"
     * @generated
     * @ordered
     */
    public static final int UML_MESSAGE_VALUE = 17;

    /**
     * The '<em><b>Uml Model</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Model</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_MODEL
     * @model name="umlModel" literal="uml:Model"
     * @generated
     * @ordered
     */
    public static final int UML_MODEL_VALUE = 18;

    /**
     * The '<em><b>Uml Occurrence Specification</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Occurrence Specification</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_OCCURRENCE_SPECIFICATION
     * @model name="umlOccurrenceSpecification" literal="uml:OccurrenceSpecification"
     * @generated
     * @ordered
     */
    public static final int UML_OCCURRENCE_SPECIFICATION_VALUE = 19;

    /**
     * The '<em><b>Uml Package</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Package</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_PACKAGE
     * @model name="umlPackage" literal="uml:Package"
     * @generated
     * @ordered
     */
    public static final int UML_PACKAGE_VALUE = 20;

    /**
     * The '<em><b>Uml Package Import</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Package Import</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_PACKAGE_IMPORT
     * @model name="umlPackageImport" literal="uml:PackageImport"
     * @generated
     * @ordered
     */
    public static final int UML_PACKAGE_IMPORT_VALUE = 21;

    /**
     * The '<em><b>Uml Primitive Type</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Primitive Type</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_PRIMITIVE_TYPE
     * @model name="umlPrimitiveType" literal="uml:PrimitiveType"
     * @generated
     * @ordered
     */
    public static final int UML_PRIMITIVE_TYPE_VALUE = 22;

    /**
     * The '<em><b>Uml Property</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Property</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_PROPERTY
     * @model name="umlProperty" literal="uml:Property"
     * @generated
     * @ordered
     */
    public static final int UML_PROPERTY_VALUE = 23;

    /**
     * The '<em><b>Uml Realization</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Realization</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_REALIZATION
     * @model name="umlRealization" literal="uml:Realization"
     * @generated
     * @ordered
     */
    public static final int UML_REALIZATION_VALUE = 24;

    /**
     * The '<em><b>Uml Stereotype</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Stereotype</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_STEREOTYPE
     * @model name="umlStereotype" literal="uml:Stereotype   "
     * @generated
     * @ordered
     */
    public static final int UML_STEREOTYPE_VALUE = 25;

    /**
     * The '<em><b>Uml Usage</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Uml Usage</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UML_USAGE
     * @model name="umlUsage" literal="uml:Usage"
     * @generated
     * @ordered
     */
    public static final int UML_USAGE_VALUE = 26;

    /**
     * An array of all the '<em><b>Type Base Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final TypeBaseType[] VALUES_ARRAY =
        new TypeBaseType[]
        {
            UML_ASSOCIATION,
            UML_CLASS,
            UML_COLLABORATION,
            UML_COMMENT,
            UML_COMPONENT,
            UML_DEPENDENCY,
            UML_ENUMERATION,
            UML_ENUMERATION_LITERAL,
            UML_EXTENSION,
            UML_GENERALIZATION,
            UML_INSTANCE_SPECIFICATION,
            UML_INTERACTION,
            UML_INTERFACE,
            UML_LIFELINE,
            UML_LITERAL_INTEGER,
            UML_LITERAL_STRING,
            UML_LITERAL_UNLIMITED_NATURAL,
            UML_MESSAGE,
            UML_MODEL,
            UML_OCCURRENCE_SPECIFICATION,
            UML_PACKAGE,
            UML_PACKAGE_IMPORT,
            UML_PRIMITIVE_TYPE,
            UML_PROPERTY,
            UML_REALIZATION,
            UML_STEREOTYPE,
            UML_USAGE,
        };

    /**
     * A public read-only list of all the '<em><b>Type Base Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<TypeBaseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Type Base Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TypeBaseType get(String literal)
    {
        for (int i = 0; i < VALUES_ARRAY.length; ++i)
        {
            TypeBaseType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Type Base Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TypeBaseType getByName(String name)
    {
        for (int i = 0; i < VALUES_ARRAY.length; ++i)
        {
            TypeBaseType result = VALUES_ARRAY[i];
            if (result.getName().equals(name))
            {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Type Base Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TypeBaseType get(int value)
    {
        switch (value)
        {
            case UML_ASSOCIATION_VALUE: return UML_ASSOCIATION;
            case UML_CLASS_VALUE: return UML_CLASS;
            case UML_COLLABORATION_VALUE: return UML_COLLABORATION;
            case UML_COMMENT_VALUE: return UML_COMMENT;
            case UML_COMPONENT_VALUE: return UML_COMPONENT;
            case UML_DEPENDENCY_VALUE: return UML_DEPENDENCY;
            case UML_ENUMERATION_VALUE: return UML_ENUMERATION;
            case UML_ENUMERATION_LITERAL_VALUE: return UML_ENUMERATION_LITERAL;
            case UML_EXTENSION_VALUE: return UML_EXTENSION;
            case UML_GENERALIZATION_VALUE: return UML_GENERALIZATION;
            case UML_INSTANCE_SPECIFICATION_VALUE: return UML_INSTANCE_SPECIFICATION;
            case UML_INTERACTION_VALUE: return UML_INTERACTION;
            case UML_INTERFACE_VALUE: return UML_INTERFACE;
            case UML_LIFELINE_VALUE: return UML_LIFELINE;
            case UML_LITERAL_INTEGER_VALUE: return UML_LITERAL_INTEGER;
            case UML_LITERAL_STRING_VALUE: return UML_LITERAL_STRING;
            case UML_LITERAL_UNLIMITED_NATURAL_VALUE: return UML_LITERAL_UNLIMITED_NATURAL;
            case UML_MESSAGE_VALUE: return UML_MESSAGE;
            case UML_MODEL_VALUE: return UML_MODEL;
            case UML_OCCURRENCE_SPECIFICATION_VALUE: return UML_OCCURRENCE_SPECIFICATION;
            case UML_PACKAGE_VALUE: return UML_PACKAGE;
            case UML_PACKAGE_IMPORT_VALUE: return UML_PACKAGE_IMPORT;
            case UML_PRIMITIVE_TYPE_VALUE: return UML_PRIMITIVE_TYPE;
            case UML_PROPERTY_VALUE: return UML_PROPERTY;
            case UML_REALIZATION_VALUE: return UML_REALIZATION;
            case UML_STEREOTYPE_VALUE: return UML_STEREOTYPE;
            case UML_USAGE_VALUE: return UML_USAGE;
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
    private TypeBaseType(int value, String name, String literal)
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
    
} //TypeBaseType
