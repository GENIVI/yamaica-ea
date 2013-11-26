/**
 */
package xmei.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import xmei.ConnectorLabelsType;
import xmei.XmeiFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Connector Labels Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectorLabelsTypeTest extends TestCase
{

    /**
     * The fixture for this Connector Labels Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectorLabelsType fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(ConnectorLabelsTypeTest.class);
    }

    /**
     * Constructs a new Connector Labels Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorLabelsTypeTest(String name)
    {
        super(name);
    }

    /**
     * Sets the fixture for this Connector Labels Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(ConnectorLabelsType fixture)
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Connector Labels Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectorLabelsType getFixture()
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
        setFixture(XmeiFactory.eINSTANCE.createConnectorLabelsType());
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

} //ConnectorLabelsTypeTest
