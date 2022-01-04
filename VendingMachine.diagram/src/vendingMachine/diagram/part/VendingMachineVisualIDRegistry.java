/*
* 
*/
package vendingMachine.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class VendingMachineVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "VendingMachine.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (vendingMachine.diagram.edit.parts.VendingMachineEditPart.MODEL_ID.equals(view.getType())) {
				return vendingMachine.diagram.edit.parts.VendingMachineEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				vendingMachine.diagram.part.VendingMachineDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (vendingMachine.VendingMachinePackage.eINSTANCE.getVendingMachine().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((vendingMachine.VendingMachine) domainElement)) {
			return vendingMachine.diagram.edit.parts.VendingMachineEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getModelID(containerView);
		if (!vendingMachine.diagram.edit.parts.VendingMachineEditPart.MODEL_ID.equals(containerModelID)
				&& !"vendingMachine".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (vendingMachine.diagram.edit.parts.VendingMachineEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = vendingMachine.diagram.edit.parts.VendingMachineEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case vendingMachine.diagram.edit.parts.VendingMachineEditPart.VISUAL_ID:
			if (vendingMachine.VendingMachinePackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass())) {
				return vendingMachine.diagram.edit.parts.StateEditPart.VISUAL_ID;
			}
			if (vendingMachine.VendingMachinePackage.eINSTANCE.getMessage().isSuperTypeOf(domainElement.eClass())) {
				return vendingMachine.diagram.edit.parts.MessageEditPart.VISUAL_ID;
			}
			if (vendingMachine.VendingMachinePackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return vendingMachine.diagram.edit.parts.ButtonEditPart.VISUAL_ID;
			}
			if (vendingMachine.VendingMachinePackage.eINSTANCE.getUserCoin().isSuperTypeOf(domainElement.eClass())) {
				return vendingMachine.diagram.edit.parts.UserCoinEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getModelID(containerView);
		if (!vendingMachine.diagram.edit.parts.VendingMachineEditPart.MODEL_ID.equals(containerModelID)
				&& !"vendingMachine".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (vendingMachine.diagram.edit.parts.VendingMachineEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = vendingMachine.diagram.edit.parts.VendingMachineEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case vendingMachine.diagram.edit.parts.VendingMachineEditPart.VISUAL_ID:
			if (vendingMachine.diagram.edit.parts.StateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (vendingMachine.diagram.edit.parts.MessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (vendingMachine.diagram.edit.parts.ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (vendingMachine.diagram.edit.parts.UserCoinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case vendingMachine.diagram.edit.parts.StateEditPart.VISUAL_ID:
			if (vendingMachine.diagram.edit.parts.StateTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case vendingMachine.diagram.edit.parts.MessageEditPart.VISUAL_ID:
			if (vendingMachine.diagram.edit.parts.MessageTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case vendingMachine.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			if (vendingMachine.diagram.edit.parts.ButtonTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case vendingMachine.diagram.edit.parts.UserCoinEditPart.VISUAL_ID:
			if (vendingMachine.diagram.edit.parts.UserCoinTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			if (vendingMachine.diagram.edit.parts.TransitionTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (vendingMachine.VendingMachinePackage.eINSTANCE.getTransition().isSuperTypeOf(domainElement.eClass())) {
			return vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(vendingMachine.VendingMachine element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case vendingMachine.diagram.edit.parts.VendingMachineEditPart.VISUAL_ID:
			return false;
		case vendingMachine.diagram.edit.parts.StateEditPart.VISUAL_ID:
		case vendingMachine.diagram.edit.parts.MessageEditPart.VISUAL_ID:
		case vendingMachine.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
		case vendingMachine.diagram.edit.parts.UserCoinEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return vendingMachine.diagram.part.VendingMachineVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return vendingMachine.diagram.part.VendingMachineVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return vendingMachine.diagram.part.VendingMachineVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
