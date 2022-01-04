/*
 * 
 */
package vendingMachine.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class VendingMachineElementTypes {

	/**
	* @generated
	*/
	private VendingMachineElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			vendingMachine.diagram.part.VendingMachineDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType VendingMachine_1000 = getElementType("VendingMachine.diagram.VendingMachine_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType State_2001 = getElementType("VendingMachine.diagram.State_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Message_2002 = getElementType("VendingMachine.diagram.Message_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Button_2003 = getElementType("VendingMachine.diagram.Button_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UserCoin_2004 = getElementType("VendingMachine.diagram.UserCoin_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Transition_4001 = getElementType("VendingMachine.diagram.Transition_4001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(VendingMachine_1000, vendingMachine.VendingMachinePackage.eINSTANCE.getVendingMachine());

			elements.put(State_2001, vendingMachine.VendingMachinePackage.eINSTANCE.getState());

			elements.put(Message_2002, vendingMachine.VendingMachinePackage.eINSTANCE.getMessage());

			elements.put(Button_2003, vendingMachine.VendingMachinePackage.eINSTANCE.getButton());

			elements.put(UserCoin_2004, vendingMachine.VendingMachinePackage.eINSTANCE.getUserCoin());

			elements.put(Transition_4001, vendingMachine.VendingMachinePackage.eINSTANCE.getTransition());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(VendingMachine_1000);
			KNOWN_ELEMENT_TYPES.add(State_2001);
			KNOWN_ELEMENT_TYPES.add(Message_2002);
			KNOWN_ELEMENT_TYPES.add(Button_2003);
			KNOWN_ELEMENT_TYPES.add(UserCoin_2004);
			KNOWN_ELEMENT_TYPES.add(Transition_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case vendingMachine.diagram.edit.parts.VendingMachineEditPart.VISUAL_ID:
			return VendingMachine_1000;
		case vendingMachine.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return State_2001;
		case vendingMachine.diagram.edit.parts.MessageEditPart.VISUAL_ID:
			return Message_2002;
		case vendingMachine.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return Button_2003;
		case vendingMachine.diagram.edit.parts.UserCoinEditPart.VISUAL_ID:
			return UserCoin_2004;
		case vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return Transition_4001;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return vendingMachine.diagram.providers.VendingMachineElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return vendingMachine.diagram.providers.VendingMachineElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return vendingMachine.diagram.providers.VendingMachineElementTypes.getElement(elementTypeAdapter);
		}
	};

}
