/**
 */
package xmei.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import xmei.DiagramType;
import xmei.XmeiFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Diagram Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramTypeTest extends TestCase
{

    /**
     * The fixture for this Diagram Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiagramType fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(DiagramTypeTest.class);
    }

    /**
     * Constructs a new Diagram Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramTypeTest(String name)
    {
        super(name);
    }

    /**
     * Sets the fixture for this Diagram Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(DiagramType fixture)
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Diagram Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiagramType getFixture()
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
        setFixture(XmeiFactory.eINSTANCE.createDiagramType());
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

} //DiagramTypeTest
