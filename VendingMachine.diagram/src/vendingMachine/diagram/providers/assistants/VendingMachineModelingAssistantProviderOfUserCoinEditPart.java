/*
 * 
 */
package vendingMachine.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class VendingMachineModelingAssistantProviderOfUserCoinEditPart
		extends vendingMachine.diagram.providers.VendingMachineModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((vendingMachine.diagram.edit.parts.UserCoinEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(vendingMachine.diagram.edit.parts.UserCoinEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(vendingMachine.diagram.providers.VendingMachineElementTypes.Transition_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((vendingMachine.diagram.edit.parts.UserCoinEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(vendingMachine.diagram.edit.parts.UserCoinEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof vendingMachine.diagram.edit.parts.StateEditPart) {
			types.add(vendingMachine.diagram.providers.VendingMachineElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof vendingMachine.diagram.edit.parts.MessageEditPart) {
			types.add(vendingMachine.diagram.providers.VendingMachineElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof vendingMachine.diagram.edit.parts.ButtonEditPart) {
			types.add(vendingMachine.diagram.providers.VendingMachineElementTypes.Transition_4001);
		}
		if (targetEditPart instanceof vendingMachine.diagram.edit.parts.UserCoinEditPart) {
			types.add(vendingMachine.diagram.providers.VendingMachineElementTypes.Transition_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((vendingMachine.diagram.edit.parts.UserCoinEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(vendingMachine.diagram.edit.parts.UserCoinEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == vendingMachine.diagram.providers.VendingMachineElementTypes.Transition_4001) {
			types.add(vendingMachine.diagram.providers.VendingMachineElementTypes.State_2001);
			types.add(vendingMachine.diagram.providers.VendingMachineElementTypes.Message_2002);
			types.add(vendingMachine.diagram.providers.VendingMachineElementTypes.Button_2003);
			types.add(vendingMachine.diagram.providers.VendingMachineElementTypes.UserCoin_2004);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((vendingMachine.diagram.edit.parts.UserCoinEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(vendingMachine.diagram.edit.parts.UserCoinEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(vendingMachine.diagram.providers.VendingMachineElementTypes.Transition_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((vendingMachine.diagram.edit.parts.UserCoinEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(vendingMachine.diagram.edit.parts.UserCoinEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == vendingMachine.diagram.providers.VendingMachineElementTypes.Transition_4001) {
			types.add(vendingMachine.diagram.providers.VendingMachineElementTypes.State_2001);
			types.add(vendingMachine.diagram.providers.VendingMachineElementTypes.Message_2002);
			types.add(vendingMachine.diagram.providers.VendingMachineElementTypes.Button_2003);
			types.add(vendingMachine.diagram.providers.VendingMachineElementTypes.UserCoin_2004);
		}
		return types;
	}

}
