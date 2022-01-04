/*
 * 
 */
package vendingMachine.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = vendingMachine.diagram.part.VendingMachineDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			vendingMachine.diagram.part.VendingMachineDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
