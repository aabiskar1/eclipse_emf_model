/*
* 
*/
package vendingMachine.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class VendingMachineItemSemanticEditPolicy
		extends vendingMachine.diagram.edit.policies.VendingMachineBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public VendingMachineItemSemanticEditPolicy() {
		super(vendingMachine.diagram.providers.VendingMachineElementTypes.VendingMachine_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (vendingMachine.diagram.providers.VendingMachineElementTypes.State_2001 == req.getElementType()) {
			return getGEFWrapper(new vendingMachine.diagram.edit.commands.StateCreateCommand(req));
		}
		if (vendingMachine.diagram.providers.VendingMachineElementTypes.Message_2002 == req.getElementType()) {
			return getGEFWrapper(new vendingMachine.diagram.edit.commands.MessageCreateCommand(req));
		}
		if (vendingMachine.diagram.providers.VendingMachineElementTypes.Button_2003 == req.getElementType()) {
			return getGEFWrapper(new vendingMachine.diagram.edit.commands.ButtonCreateCommand(req));
		}
		if (vendingMachine.diagram.providers.VendingMachineElementTypes.UserCoin_2004 == req.getElementType()) {
			return getGEFWrapper(new vendingMachine.diagram.edit.commands.UserCoinCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
