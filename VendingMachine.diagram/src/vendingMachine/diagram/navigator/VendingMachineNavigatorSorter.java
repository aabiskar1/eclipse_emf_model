/*
* 
*/
package vendingMachine.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class VendingMachineNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4003;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 4002;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof vendingMachine.diagram.navigator.VendingMachineNavigatorItem) {
			vendingMachine.diagram.navigator.VendingMachineNavigatorItem item = (vendingMachine.diagram.navigator.VendingMachineNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
