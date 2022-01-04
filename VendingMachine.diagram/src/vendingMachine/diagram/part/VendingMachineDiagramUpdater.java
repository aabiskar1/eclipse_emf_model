/*
* 
*/
package vendingMachine.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class VendingMachineDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<vendingMachine.diagram.part.VendingMachineNodeDescriptor> getSemanticChildren(View view) {
		switch (vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getVisualID(view)) {
		case vendingMachine.diagram.edit.parts.VendingMachineEditPart.VISUAL_ID:
			return getVendingMachine_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<vendingMachine.diagram.part.VendingMachineNodeDescriptor> getVendingMachine_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		vendingMachine.VendingMachine modelElement = (vendingMachine.VendingMachine) view.getElement();
		LinkedList<vendingMachine.diagram.part.VendingMachineNodeDescriptor> result = new LinkedList<vendingMachine.diagram.part.VendingMachineNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEvents().iterator(); it.hasNext();) {
			vendingMachine.Event childElement = (vendingMachine.Event) it.next();
			int visualID = vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == vendingMachine.diagram.edit.parts.StateEditPart.VISUAL_ID) {
				result.add(new vendingMachine.diagram.part.VendingMachineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == vendingMachine.diagram.edit.parts.MessageEditPart.VISUAL_ID) {
				result.add(new vendingMachine.diagram.part.VendingMachineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == vendingMachine.diagram.edit.parts.ButtonEditPart.VISUAL_ID) {
				result.add(new vendingMachine.diagram.part.VendingMachineNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == vendingMachine.diagram.edit.parts.UserCoinEditPart.VISUAL_ID) {
				result.add(new vendingMachine.diagram.part.VendingMachineNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getContainedLinks(View view) {
		switch (vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getVisualID(view)) {
		case vendingMachine.diagram.edit.parts.VendingMachineEditPart.VISUAL_ID:
			return getVendingMachine_1000ContainedLinks(view);
		case vendingMachine.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_2001ContainedLinks(view);
		case vendingMachine.diagram.edit.parts.MessageEditPart.VISUAL_ID:
			return getMessage_2002ContainedLinks(view);
		case vendingMachine.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return getButton_2003ContainedLinks(view);
		case vendingMachine.diagram.edit.parts.UserCoinEditPart.VISUAL_ID:
			return getUserCoin_2004ContainedLinks(view);
		case vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getIncomingLinks(View view) {
		switch (vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getVisualID(view)) {
		case vendingMachine.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_2001IncomingLinks(view);
		case vendingMachine.diagram.edit.parts.MessageEditPart.VISUAL_ID:
			return getMessage_2002IncomingLinks(view);
		case vendingMachine.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return getButton_2003IncomingLinks(view);
		case vendingMachine.diagram.edit.parts.UserCoinEditPart.VISUAL_ID:
			return getUserCoin_2004IncomingLinks(view);
		case vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getOutgoingLinks(View view) {
		switch (vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getVisualID(view)) {
		case vendingMachine.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_2001OutgoingLinks(view);
		case vendingMachine.diagram.edit.parts.MessageEditPart.VISUAL_ID:
			return getMessage_2002OutgoingLinks(view);
		case vendingMachine.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return getButton_2003OutgoingLinks(view);
		case vendingMachine.diagram.edit.parts.UserCoinEditPart.VISUAL_ID:
			return getUserCoin_2004OutgoingLinks(view);
		case vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getVendingMachine_1000ContainedLinks(
			View view) {
		vendingMachine.VendingMachine modelElement = (vendingMachine.VendingMachine) view.getElement();
		LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor> result = new LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getState_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getMessage_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getButton_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getUserCoin_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getTransition_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getState_2001IncomingLinks(View view) {
		vendingMachine.State modelElement = (vendingMachine.State) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor> result = new LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getMessage_2002IncomingLinks(
			View view) {
		vendingMachine.Message modelElement = (vendingMachine.Message) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor> result = new LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getButton_2003IncomingLinks(
			View view) {
		vendingMachine.Button modelElement = (vendingMachine.Button) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor> result = new LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getUserCoin_2004IncomingLinks(
			View view) {
		vendingMachine.UserCoin modelElement = (vendingMachine.UserCoin) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor> result = new LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getTransition_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getState_2001OutgoingLinks(View view) {
		vendingMachine.State modelElement = (vendingMachine.State) view.getElement();
		LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor> result = new LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getMessage_2002OutgoingLinks(
			View view) {
		vendingMachine.Message modelElement = (vendingMachine.Message) view.getElement();
		LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor> result = new LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getButton_2003OutgoingLinks(
			View view) {
		vendingMachine.Button modelElement = (vendingMachine.Button) view.getElement();
		LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor> result = new LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getUserCoin_2004OutgoingLinks(
			View view) {
		vendingMachine.UserCoin modelElement = (vendingMachine.UserCoin) view.getElement();
		LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor> result = new LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getTransition_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getContainedTypeModelFacetLinks_Transition_4001(
			vendingMachine.VendingMachine container) {
		LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor> result = new LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof vendingMachine.Transition) {
				continue;
			}
			vendingMachine.Transition link = (vendingMachine.Transition) linkObject;
			if (vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID != vendingMachine.diagram.part.VendingMachineVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			vendingMachine.Event dst = link.getTo();
			vendingMachine.Event src = link.getFrom();
			result.add(new vendingMachine.diagram.part.VendingMachineLinkDescriptor(src, dst, link,
					vendingMachine.diagram.providers.VendingMachineElementTypes.Transition_4001,
					vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getIncomingTypeModelFacetLinks_Transition_4001(
			vendingMachine.Event target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor> result = new LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != vendingMachine.VendingMachinePackage.eINSTANCE.getTransition_To()
					|| false == setting.getEObject() instanceof vendingMachine.Transition) {
				continue;
			}
			vendingMachine.Transition link = (vendingMachine.Transition) setting.getEObject();
			if (vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID != vendingMachine.diagram.part.VendingMachineVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			vendingMachine.Event src = link.getFrom();
			result.add(new vendingMachine.diagram.part.VendingMachineLinkDescriptor(src, target, link,
					vendingMachine.diagram.providers.VendingMachineElementTypes.Transition_4001,
					vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getOutgoingTypeModelFacetLinks_Transition_4001(
			vendingMachine.Event source) {
		vendingMachine.VendingMachine container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof vendingMachine.VendingMachine) {
				container = (vendingMachine.VendingMachine) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor> result = new LinkedList<vendingMachine.diagram.part.VendingMachineLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof vendingMachine.Transition) {
				continue;
			}
			vendingMachine.Transition link = (vendingMachine.Transition) linkObject;
			if (vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID != vendingMachine.diagram.part.VendingMachineVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			vendingMachine.Event dst = link.getTo();
			vendingMachine.Event src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new vendingMachine.diagram.part.VendingMachineLinkDescriptor(src, dst, link,
					vendingMachine.diagram.providers.VendingMachineElementTypes.Transition_4001,
					vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<vendingMachine.diagram.part.VendingMachineNodeDescriptor> getSemanticChildren(View view) {
			return VendingMachineDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getContainedLinks(View view) {
			return VendingMachineDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getIncomingLinks(View view) {
			return VendingMachineDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<vendingMachine.diagram.part.VendingMachineLinkDescriptor> getOutgoingLinks(View view) {
			return VendingMachineDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
