/**
 */
package vendingMachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Coin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vendingMachine.UserCoin#getCoin <em>Coin</em>}</li>
 * </ul>
 *
 * @see vendingMachine.VendingMachinePackage#getUserCoin()
 * @model
 * @generated
 */
public interface UserCoin extends Event {
	/**
	 * Returns the value of the '<em><b>Coin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coin</em>' attribute.
	 * @see #setCoin(int)
	 * @see vendingMachine.VendingMachinePackage#getUserCoin_Coin()
	 * @model
	 * @generated
	 */
	int getCoin();

	/**
	 * Sets the value of the '{@link vendingMachine.UserCoin#getCoin <em>Coin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coin</em>' attribute.
	 * @see #getCoin()
	 * @generated
	 */
	void setCoin(int value);

} // UserCoin
