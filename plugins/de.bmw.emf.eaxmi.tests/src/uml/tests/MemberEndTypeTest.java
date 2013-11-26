/**
 */
package uml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uml.MemberEndType;
import uml.UmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Member End Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MemberEndTypeTest extends TestCase
{

    /**
     * The fixture for this Member End Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MemberEndType fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(MemberEndTypeTest.class);
    }

    /**
     * Constructs a new Member End Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MemberEndTypeTest(String name)
    {
        super(name);
    }

    /**
     * Sets the fixture for this Member End Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(MemberEndType fixture)
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Member End Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MemberEndType getFixture()
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
        setFixture(UmlFactory.eINSTANCE.createMemberEndType());
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

} //MemberEndTypeTest
