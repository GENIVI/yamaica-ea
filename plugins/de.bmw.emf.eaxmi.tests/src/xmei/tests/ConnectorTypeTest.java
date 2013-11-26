/**
 */
package xmei.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import xmei.ConnectorType;
import xmei.XmeiFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectorTypeTest extends TestCase
{

    /**
     * The fixture for this Connector Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectorType fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(ConnectorTypeTest.class);
    }

    /**
     * Constructs a new Connector Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorTypeTest(String name)
    {
        super(name);
    }

    /**
     * Sets the fixture for this Connector Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(ConnectorType fixture)
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Connector Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectorType getFixture()
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
        setFixture(XmeiFactory.eINSTANCE.createConnectorType());
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

} //ConnectorTypeTest
