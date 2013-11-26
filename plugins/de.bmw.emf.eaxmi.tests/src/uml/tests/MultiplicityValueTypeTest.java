/**
 */
package uml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uml.MultiplicityValueType;
import uml.UmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Multiplicity Value Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MultiplicityValueTypeTest extends TestCase
{

    /**
     * The fixture for this Multiplicity Value Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MultiplicityValueType fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(MultiplicityValueTypeTest.class);
    }

    /**
     * Constructs a new Multiplicity Value Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiplicityValueTypeTest(String name)
    {
        super(name);
    }

    /**
     * Sets the fixture for this Multiplicity Value Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(MultiplicityValueType fixture)
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Multiplicity Value Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MultiplicityValueType getFixture()
    {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception
    {
        setFixture(UmlFactory.eINSTANCE.createMultiplicityValueType());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception
    {
        setFixture(null);
    }

} //MultiplicityValueTypeTest
