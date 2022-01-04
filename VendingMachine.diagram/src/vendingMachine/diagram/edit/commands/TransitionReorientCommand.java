/*
 * 
 */
package vendingMachine.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class TransitionReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public TransitionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof vendingMachine.Transition) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof vendingMachine.Event && newEnd instanceof vendingMachine.Event)) {
			return false;
		}
		vendingMachine.Event target = getLink().getTo();
		if (!(getLink().eContainer() instanceof vendingMachine.VendingMachine)) {
			return false;
		}
		vendingMachine.VendingMachine container = (vendingMachine.VendingMachine) getLink().eContainer();
		return vendingMachine.diagram.edit.policies.VendingMachineBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTransition_4001(container, getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof vendingMachine.Event && newEnd instanceof vendingMachine.Event)) {
			return false;
		}
		vendingMachine.Event source = getLink().getFrom();
		if (!(getLink().eContainer() instanceof vendingMachine.VendingMachine)) {
			return false;
		}
		vendingMachine.VendingMachine container = (vendingMachine.VendingMachine) getLink().eContainer();
		return vendingMachine.diagram.edit.policies.VendingMachineBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTransition_4001(container, getLink(), source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setFrom(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTo(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected vendingMachine.Transition getLink() {
		return (vendingMachine.Transition) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected vendingMachine.Event getOldSource() {
		return (vendingMachine.Event) oldEnd;
	}

	/**
	* @generated
	*/
	protected vendingMachine.Event getNewSource() {
		return (vendingMachine.Event) newEnd;
	}

	/**
	* @generated
	*/
	protected vendingMachine.Event getOldTarget() {
		return (vendingMachine.Event) oldEnd;
	}

	/**
	* @generated
	*/
	protected vendingMachine.Event getNewTarget() {
		return (vendingMachine.Event) newEnd;
	}
}
