
/*
 * 
 */
package vendingMachine.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class VendingMachinePaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(vendingMachine.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createButton1CreationTool());
		paletteContainer.add(createMessage2CreationTool());
		paletteContainer.add(createState3CreationTool());
		paletteContainer.add(createUserCoin4CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				vendingMachine.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createTransition1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createButton1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				vendingMachine.diagram.part.Messages.Button1CreationTool_title,
				vendingMachine.diagram.part.Messages.Button1CreationTool_desc,
				Collections.singletonList(vendingMachine.diagram.providers.VendingMachineElementTypes.Button_2003));
		entry.setId("createButton1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(vendingMachine.diagram.providers.VendingMachineElementTypes
				.getImageDescriptor(vendingMachine.diagram.providers.VendingMachineElementTypes.Button_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMessage2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				vendingMachine.diagram.part.Messages.Message2CreationTool_title,
				vendingMachine.diagram.part.Messages.Message2CreationTool_desc,
				Collections.singletonList(vendingMachine.diagram.providers.VendingMachineElementTypes.Message_2002));
		entry.setId("createMessage2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(vendingMachine.diagram.providers.VendingMachineElementTypes
				.getImageDescriptor(vendingMachine.diagram.providers.VendingMachineElementTypes.Message_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createState3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				vendingMachine.diagram.part.Messages.State3CreationTool_title,
				vendingMachine.diagram.part.Messages.State3CreationTool_desc,
				Collections.singletonList(vendingMachine.diagram.providers.VendingMachineElementTypes.State_2001));
		entry.setId("createState3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(vendingMachine.diagram.providers.VendingMachineElementTypes
				.getImageDescriptor(vendingMachine.diagram.providers.VendingMachineElementTypes.State_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserCoin4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				vendingMachine.diagram.part.Messages.UserCoin4CreationTool_title,
				vendingMachine.diagram.part.Messages.UserCoin4CreationTool_desc,
				Collections.singletonList(vendingMachine.diagram.providers.VendingMachineElementTypes.UserCoin_2004));
		entry.setId("createUserCoin4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(vendingMachine.diagram.providers.VendingMachineElementTypes
				.getImageDescriptor(vendingMachine.diagram.providers.VendingMachineElementTypes.UserCoin_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTransition1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				vendingMachine.diagram.part.Messages.Transition1CreationTool_title,
				vendingMachine.diagram.part.Messages.Transition1CreationTool_desc,
				Collections.singletonList(vendingMachine.diagram.providers.VendingMachineElementTypes.Transition_4001));
		entry.setId("createTransition1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(vendingMachine.diagram.providers.VendingMachineElementTypes
				.getImageDescriptor(vendingMachine.diagram.providers.VendingMachineElementTypes.Transition_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
