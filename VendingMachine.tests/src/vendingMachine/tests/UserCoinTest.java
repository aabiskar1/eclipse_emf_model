/**
 */
package vendingMachine.tests;

import junit.textui.TestRunner;

import vendingMachine.UserCoin;
import vendingMachine.VendingMachineFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>User Coin</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserCoinTest extends EventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UserCoinTest.class);
	}

	/**
	 * Constructs a new User Coin test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserCoinTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this User Coin test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UserCoin getFixture() {
		return (UserCoin)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(VendingMachineFactory.eINSTANCE.createUserCoin());
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

} //UserCoinTest
