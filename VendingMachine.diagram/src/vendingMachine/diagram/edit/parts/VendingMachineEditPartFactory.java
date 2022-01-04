/*
 * 
 */
package vendingMachine.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class VendingMachineEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getVisualID(view)) {

			case vendingMachine.diagram.edit.parts.VendingMachineEditPart.VISUAL_ID:
				return new vendingMachine.diagram.edit.parts.VendingMachineEditPart(view);

			case vendingMachine.diagram.edit.parts.StateEditPart.VISUAL_ID:
				return new vendingMachine.diagram.edit.parts.StateEditPart(view);

			case vendingMachine.diagram.edit.parts.StateTextEditPart.VISUAL_ID:
				return new vendingMachine.diagram.edit.parts.StateTextEditPart(view);

			case vendingMachine.diagram.edit.parts.MessageEditPart.VISUAL_ID:
				return new vendingMachine.diagram.edit.parts.MessageEditPart(view);

			case vendingMachine.diagram.edit.parts.MessageTextEditPart.VISUAL_ID:
				return new vendingMachine.diagram.edit.parts.MessageTextEditPart(view);

			case vendingMachine.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
				return new vendingMachine.diagram.edit.parts.ButtonEditPart(view);

			case vendingMachine.diagram.edit.parts.ButtonTextEditPart.VISUAL_ID:
				return new vendingMachine.diagram.edit.parts.ButtonTextEditPart(view);

			case vendingMachine.diagram.edit.parts.UserCoinEditPart.VISUAL_ID:
				return new vendingMachine.diagram.edit.parts.UserCoinEditPart(view);

			case vendingMachine.diagram.edit.parts.UserCoinTextEditPart.VISUAL_ID:
				return new vendingMachine.diagram.edit.parts.UserCoinTextEditPart(view);

			case vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
				return new vendingMachine.diagram.edit.parts.TransitionEditPart(view);

			case vendingMachine.diagram.edit.parts.TransitionTextEditPart.VISUAL_ID:
				return new vendingMachine.diagram.edit.parts.TransitionTextEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
