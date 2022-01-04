/**
 */
package vendingMachine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vendingMachine.Transition#getText <em>Text</em>}</li>
 *   <li>{@link vendingMachine.Transition#getFrom <em>From</em>}</li>
 *   <li>{@link vendingMachine.Transition#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see vendingMachine.VendingMachinePackage#getTransition()
 * @model annotation="gmf.link source='from' target='to' label='text' target.decoration='arrow'"
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see vendingMachine.VendingMachinePackage#getTransition_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link vendingMachine.Transition#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vendingMachine.Event#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Event)
	 * @see vendingMachine.VendingMachinePackage#getTransition_From()
	 * @see vendingMachine.Event#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
	Event getFrom();

	/**
	 * Sets the value of the '{@link vendingMachine.Transition#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Event value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vendingMachine.Event#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Event)
	 * @see vendingMachine.VendingMachinePackage#getTransition_To()
	 * @see vendingMachine.Event#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	Event getTo();

	/**
	 * Sets the value of the '{@link vendingMachine.Transition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Event value);

} // Transition
