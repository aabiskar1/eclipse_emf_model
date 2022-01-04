/*
* 
*/
package vendingMachine.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class VendingMachineNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		vendingMachine.diagram.part.VendingMachineDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		vendingMachine.diagram.part.VendingMachineDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof vendingMachine.diagram.navigator.VendingMachineNavigatorItem
				&& !isOwnView(((vendingMachine.diagram.navigator.VendingMachineNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof vendingMachine.diagram.navigator.VendingMachineNavigatorGroup) {
			vendingMachine.diagram.navigator.VendingMachineNavigatorGroup group = (vendingMachine.diagram.navigator.VendingMachineNavigatorGroup) element;
			return vendingMachine.diagram.part.VendingMachineDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof vendingMachine.diagram.navigator.VendingMachineNavigatorItem) {
			vendingMachine.diagram.navigator.VendingMachineNavigatorItem navigatorItem = (vendingMachine.diagram.navigator.VendingMachineNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getVisualID(view)) {
		case vendingMachine.diagram.edit.parts.VendingMachineEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?Y3901924?VendingMachine", //$NON-NLS-1$
					vendingMachine.diagram.providers.VendingMachineElementTypes.VendingMachine_1000);
		case vendingMachine.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?Y3901924?State", //$NON-NLS-1$
					vendingMachine.diagram.providers.VendingMachineElementTypes.State_2001);
		case vendingMachine.diagram.edit.parts.MessageEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?Y3901924?Message", //$NON-NLS-1$
					vendingMachine.diagram.providers.VendingMachineElementTypes.Message_2002);
		case vendingMachine.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?Y3901924?Button", //$NON-NLS-1$
					vendingMachine.diagram.providers.VendingMachineElementTypes.Button_2003);
		case vendingMachine.diagram.edit.parts.UserCoinEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?Y3901924?UserCoin", //$NON-NLS-1$
					vendingMachine.diagram.providers.VendingMachineElementTypes.UserCoin_2004);
		case vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?Y3901924?Transition", //$NON-NLS-1$
					vendingMachine.diagram.providers.VendingMachineElementTypes.Transition_4001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = vendingMachine.diagram.part.VendingMachineDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& vendingMachine.diagram.providers.VendingMachineElementTypes.isKnownElementType(elementType)) {
			image = vendingMachine.diagram.providers.VendingMachineElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof vendingMachine.diagram.navigator.VendingMachineNavigatorGroup) {
			vendingMachine.diagram.navigator.VendingMachineNavigatorGroup group = (vendingMachine.diagram.navigator.VendingMachineNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof vendingMachine.diagram.navigator.VendingMachineNavigatorItem) {
			vendingMachine.diagram.navigator.VendingMachineNavigatorItem navigatorItem = (vendingMachine.diagram.navigator.VendingMachineNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getVisualID(view)) {
		case vendingMachine.diagram.edit.parts.VendingMachineEditPart.VISUAL_ID:
			return getVendingMachine_1000Text(view);
		case vendingMachine.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_2001Text(view);
		case vendingMachine.diagram.edit.parts.MessageEditPart.VISUAL_ID:
			return getMessage_2002Text(view);
		case vendingMachine.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return getButton_2003Text(view);
		case vendingMachine.diagram.edit.parts.UserCoinEditPart.VISUAL_ID:
			return getUserCoin_2004Text(view);
		case vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getVendingMachine_1000Text(View view) {
		vendingMachine.VendingMachine domainModelElement = (vendingMachine.VendingMachine) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			vendingMachine.diagram.part.VendingMachineDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getState_2001Text(View view) {
		IParser parser = vendingMachine.diagram.providers.VendingMachineParserProvider.getParser(
				vendingMachine.diagram.providers.VendingMachineElementTypes.State_2001,
				view.getElement() != null ? view.getElement() : view,
				vendingMachine.diagram.part.VendingMachineVisualIDRegistry
						.getType(vendingMachine.diagram.edit.parts.StateTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			vendingMachine.diagram.part.VendingMachineDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMessage_2002Text(View view) {
		IParser parser = vendingMachine.diagram.providers.VendingMachineParserProvider.getParser(
				vendingMachine.diagram.providers.VendingMachineElementTypes.Message_2002,
				view.getElement() != null ? view.getElement() : view,
				vendingMachine.diagram.part.VendingMachineVisualIDRegistry
						.getType(vendingMachine.diagram.edit.parts.MessageTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			vendingMachine.diagram.part.VendingMachineDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getButton_2003Text(View view) {
		IParser parser = vendingMachine.diagram.providers.VendingMachineParserProvider.getParser(
				vendingMachine.diagram.providers.VendingMachineElementTypes.Button_2003,
				view.getElement() != null ? view.getElement() : view,
				vendingMachine.diagram.part.VendingMachineVisualIDRegistry
						.getType(vendingMachine.diagram.edit.parts.ButtonTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			vendingMachine.diagram.part.VendingMachineDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUserCoin_2004Text(View view) {
		IParser parser = vendingMachine.diagram.providers.VendingMachineParserProvider.getParser(
				vendingMachine.diagram.providers.VendingMachineElementTypes.UserCoin_2004,
				view.getElement() != null ? view.getElement() : view,
				vendingMachine.diagram.part.VendingMachineVisualIDRegistry
						.getType(vendingMachine.diagram.edit.parts.UserCoinTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			vendingMachine.diagram.part.VendingMachineDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTransition_4001Text(View view) {
		IParser parser = vendingMachine.diagram.providers.VendingMachineParserProvider.getParser(
				vendingMachine.diagram.providers.VendingMachineElementTypes.Transition_4001,
				view.getElement() != null ? view.getElement() : view,
				vendingMachine.diagram.part.VendingMachineVisualIDRegistry
						.getType(vendingMachine.diagram.edit.parts.TransitionTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			vendingMachine.diagram.part.VendingMachineDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return vendingMachine.diagram.edit.parts.VendingMachineEditPart.MODEL_ID
				.equals(vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getModelID(view));
	}

}
