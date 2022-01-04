/*
 * 
 */
package vendingMachine.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class VendingMachineParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser stateText_5001Parser;

	/**
	* @generated
	*/
	private IParser getStateText_5001Parser() {
		if (stateText_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { vendingMachine.VendingMachinePackage.eINSTANCE.getEvent_Text() };
			vendingMachine.diagram.parsers.MessageFormatParser parser = new vendingMachine.diagram.parsers.MessageFormatParser(
					features);
			stateText_5001Parser = parser;
		}
		return stateText_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser messageText_5002Parser;

	/**
	* @generated
	*/
	private IParser getMessageText_5002Parser() {
		if (messageText_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { vendingMachine.VendingMachinePackage.eINSTANCE.getEvent_Text() };
			vendingMachine.diagram.parsers.MessageFormatParser parser = new vendingMachine.diagram.parsers.MessageFormatParser(
					features);
			messageText_5002Parser = parser;
		}
		return messageText_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonText_5003Parser;

	/**
	* @generated
	*/
	private IParser getButtonText_5003Parser() {
		if (buttonText_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { vendingMachine.VendingMachinePackage.eINSTANCE.getEvent_Text() };
			vendingMachine.diagram.parsers.MessageFormatParser parser = new vendingMachine.diagram.parsers.MessageFormatParser(
					features);
			buttonText_5003Parser = parser;
		}
		return buttonText_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser userCoinText_5004Parser;

	/**
	* @generated
	*/
	private IParser getUserCoinText_5004Parser() {
		if (userCoinText_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { vendingMachine.VendingMachinePackage.eINSTANCE.getEvent_Text() };
			vendingMachine.diagram.parsers.MessageFormatParser parser = new vendingMachine.diagram.parsers.MessageFormatParser(
					features);
			userCoinText_5004Parser = parser;
		}
		return userCoinText_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser transitionText_6001Parser;

	/**
	* @generated
	*/
	private IParser getTransitionText_6001Parser() {
		if (transitionText_6001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					vendingMachine.VendingMachinePackage.eINSTANCE.getTransition_Text() };
			vendingMachine.diagram.parsers.MessageFormatParser parser = new vendingMachine.diagram.parsers.MessageFormatParser(
					features);
			transitionText_6001Parser = parser;
		}
		return transitionText_6001Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case vendingMachine.diagram.edit.parts.StateTextEditPart.VISUAL_ID:
			return getStateText_5001Parser();
		case vendingMachine.diagram.edit.parts.MessageTextEditPart.VISUAL_ID:
			return getMessageText_5002Parser();
		case vendingMachine.diagram.edit.parts.ButtonTextEditPart.VISUAL_ID:
			return getButtonText_5003Parser();
		case vendingMachine.diagram.edit.parts.UserCoinTextEditPart.VISUAL_ID:
			return getUserCoinText_5004Parser();
		case vendingMachine.diagram.edit.parts.TransitionTextEditPart.VISUAL_ID:
			return getTransitionText_6001Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (vendingMachine.diagram.providers.VendingMachineElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
