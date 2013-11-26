/**
 */
package xmei.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import xmei.XMIType;
import xmei.XmeiFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XMI Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XMITypeTest extends TestCase
{

    /**
     * The fixture for this XMI Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XMIType fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(XMITypeTest.class);
    }

    /**
     * Constructs a new XMI Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XMITypeTest(String name)
    {
        super(name);
    }

    /**
     * Sets the fixture for this XMI Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(XMIType fixture)
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this XMI Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XMIType getFixture()
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
        setFixture(XmeiFactory.eINSTANCE.createXMIType());
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

} //XMITypeTest
