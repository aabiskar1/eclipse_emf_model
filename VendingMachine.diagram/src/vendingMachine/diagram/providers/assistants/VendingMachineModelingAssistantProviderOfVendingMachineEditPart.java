/*
 * 
 */
package vendingMachine.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class VendingMachineModelingAssistantProviderOfVendingMachineEditPart
		extends vendingMachine.diagram.providers.VendingMachineModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(vendingMachine.diagram.providers.VendingMachineElementTypes.State_2001);
		types.add(vendingMachine.diagram.providers.VendingMachineElementTypes.Message_2002);
		types.add(vendingMachine.diagram.providers.VendingMachineElementTypes.Button_2003);
		types.add(vendingMachine.diagram.providers.VendingMachineElementTypes.UserCoin_2004);
		return types;
	}

}
