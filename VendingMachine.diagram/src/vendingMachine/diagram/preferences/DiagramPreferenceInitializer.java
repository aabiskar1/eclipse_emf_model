/*
 * 
 */
package vendingMachine.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		vendingMachine.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		vendingMachine.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		vendingMachine.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		vendingMachine.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		vendingMachine.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return vendingMachine.diagram.part.VendingMachineDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
