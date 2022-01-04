/**
 */
package vendingMachine.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import vendingMachine.VendingMachine;
import vendingMachine.VendingMachineFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Vending Machine</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VendingMachineTest extends TestCase {

	/**
	 * The fixture for this Vending Machine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VendingMachine fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VendingMachineTest.class);
	}

	/**
	 * Constructs a new Vending Machine test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendingMachineTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Vending Machine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(VendingMachine fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Vending Machine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VendingMachine getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VendingMachineFactory.eINSTANCE.createVendingMachine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //VendingMachineTest
