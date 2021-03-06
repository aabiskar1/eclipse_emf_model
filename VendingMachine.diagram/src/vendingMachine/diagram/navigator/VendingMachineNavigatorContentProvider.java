/*
* 
*/
package vendingMachine.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class VendingMachineNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public VendingMachineNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<vendingMachine.diagram.navigator.VendingMachineNavigatorItem> result = new ArrayList<vendingMachine.diagram.navigator.VendingMachineNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, vendingMachine.diagram.edit.parts.VendingMachineEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof vendingMachine.diagram.navigator.VendingMachineNavigatorGroup) {
			vendingMachine.diagram.navigator.VendingMachineNavigatorGroup group = (vendingMachine.diagram.navigator.VendingMachineNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof vendingMachine.diagram.navigator.VendingMachineNavigatorItem) {
			vendingMachine.diagram.navigator.VendingMachineNavigatorItem navigatorItem = (vendingMachine.diagram.navigator.VendingMachineNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getVisualID(view)) {

		case vendingMachine.diagram.edit.parts.VendingMachineEditPart.VISUAL_ID: {
			LinkedList<vendingMachine.diagram.navigator.VendingMachineAbstractNavigatorItem> result = new LinkedList<vendingMachine.diagram.navigator.VendingMachineAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			vendingMachine.diagram.navigator.VendingMachineNavigatorGroup links = new vendingMachine.diagram.navigator.VendingMachineNavigatorGroup(
					vendingMachine.diagram.part.Messages.NavigatorGroupName_VendingMachine_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					vendingMachine.diagram.part.VendingMachineVisualIDRegistry
							.getType(vendingMachine.diagram.edit.parts.StateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					vendingMachine.diagram.part.VendingMachineVisualIDRegistry
							.getType(vendingMachine.diagram.edit.parts.MessageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					vendingMachine.diagram.part.VendingMachineVisualIDRegistry
							.getType(vendingMachine.diagram.edit.parts.ButtonEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					vendingMachine.diagram.part.VendingMachineVisualIDRegistry
							.getType(vendingMachine.diagram.edit.parts.UserCoinEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					vendingMachine.diagram.part.VendingMachineVisualIDRegistry
							.getType(vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case vendingMachine.diagram.edit.parts.StateEditPart.VISUAL_ID: {
			LinkedList<vendingMachine.diagram.navigator.VendingMachineAbstractNavigatorItem> result = new LinkedList<vendingMachine.diagram.navigator.VendingMachineAbstractNavigatorItem>();
			Node sv = (Node) view;
			vendingMachine.diagram.navigator.VendingMachineNavigatorGroup incominglinks = new vendingMachine.diagram.navigator.VendingMachineNavigatorGroup(
					vendingMachine.diagram.part.Messages.NavigatorGroupName_State_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			vendingMachine.diagram.navigator.VendingMachineNavigatorGroup outgoinglinks = new vendingMachine.diagram.navigator.VendingMachineNavigatorGroup(
					vendingMachine.diagram.part.Messages.NavigatorGroupName_State_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					vendingMachine.diagram.part.VendingMachineVisualIDRegistry
							.getType(vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					vendingMachine.diagram.part.VendingMachineVisualIDRegistry
							.getType(vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case vendingMachine.diagram.edit.parts.MessageEditPart.VISUAL_ID: {
			LinkedList<vendingMachine.diagram.navigator.VendingMachineAbstractNavigatorItem> result = new LinkedList<vendingMachine.diagram.navigator.VendingMachineAbstractNavigatorItem>();
			Node sv = (Node) view;
			vendingMachine.diagram.navigator.VendingMachineNavigatorGroup incominglinks = new vendingMachine.diagram.navigator.VendingMachineNavigatorGroup(
					vendingMachine.diagram.part.Messages.NavigatorGroupName_Message_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			vendingMachine.diagram.navigator.VendingMachineNavigatorGroup outgoinglinks = new vendingMachine.diagram.navigator.VendingMachineNavigatorGroup(
					vendingMachine.diagram.part.Messages.NavigatorGroupName_Message_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					vendingMachine.diagram.part.VendingMachineVisualIDRegistry
							.getType(vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					vendingMachine.diagram.part.VendingMachineVisualIDRegistry
							.getType(vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case vendingMachine.diagram.edit.parts.ButtonEditPart.VISUAL_ID: {
			LinkedList<vendingMachine.diagram.navigator.VendingMachineAbstractNavigatorItem> result = new LinkedList<vendingMachine.diagram.navigator.VendingMachineAbstractNavigatorItem>();
			Node sv = (Node) view;
			vendingMachine.diagram.navigator.VendingMachineNavigatorGroup incominglinks = new vendingMachine.diagram.navigator.VendingMachineNavigatorGroup(
					vendingMachine.diagram.part.Messages.NavigatorGroupName_Button_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			vendingMachine.diagram.navigator.VendingMachineNavigatorGroup outgoinglinks = new vendingMachine.diagram.navigator.VendingMachineNavigatorGroup(
					vendingMachine.diagram.part.Messages.NavigatorGroupName_Button_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					vendingMachine.diagram.part.VendingMachineVisualIDRegistry
							.getType(vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					vendingMachine.diagram.part.VendingMachineVisualIDRegistry
							.getType(vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case vendingMachine.diagram.edit.parts.UserCoinEditPart.VISUAL_ID: {
			LinkedList<vendingMachine.diagram.navigator.VendingMachineAbstractNavigatorItem> result = new LinkedList<vendingMachine.diagram.navigator.VendingMachineAbstractNavigatorItem>();
			Node sv = (Node) view;
			vendingMachine.diagram.navigator.VendingMachineNavigatorGroup incominglinks = new vendingMachine.diagram.navigator.VendingMachineNavigatorGroup(
					vendingMachine.diagram.part.Messages.NavigatorGroupName_UserCoin_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			vendingMachine.diagram.navigator.VendingMachineNavigatorGroup outgoinglinks = new vendingMachine.diagram.navigator.VendingMachineNavigatorGroup(
					vendingMachine.diagram.part.Messages.NavigatorGroupName_UserCoin_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					vendingMachine.diagram.part.VendingMachineVisualIDRegistry
							.getType(vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					vendingMachine.diagram.part.VendingMachineVisualIDRegistry
							.getType(vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case vendingMachine.diagram.edit.parts.TransitionEditPart.VISUAL_ID: {
			LinkedList<vendingMachine.diagram.navigator.VendingMachineAbstractNavigatorItem> result = new LinkedList<vendingMachine.diagram.navigator.VendingMachineAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			vendingMachine.diagram.navigator.VendingMachineNavigatorGroup target = new vendingMachine.diagram.navigator.VendingMachineNavigatorGroup(
					vendingMachine.diagram.part.Messages.NavigatorGroupName_Transition_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			vendingMachine.diagram.navigator.VendingMachineNavigatorGroup source = new vendingMachine.diagram.navigator.VendingMachineNavigatorGroup(
					vendingMachine.diagram.part.Messages.NavigatorGroupName_Transition_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					vendingMachine.diagram.part.VendingMachineVisualIDRegistry
							.getType(vendingMachine.diagram.edit.parts.StateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					vendingMachine.diagram.part.VendingMachineVisualIDRegistry
							.getType(vendingMachine.diagram.edit.parts.MessageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					vendingMachine.diagram.part.VendingMachineVisualIDRegistry
							.getType(vendingMachine.diagram.edit.parts.ButtonEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					vendingMachine.diagram.part.VendingMachineVisualIDRegistry
							.getType(vendingMachine.diagram.edit.parts.UserCoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					vendingMachine.diagram.part.VendingMachineVisualIDRegistry
							.getType(vendingMachine.diagram.edit.parts.StateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					vendingMachine.diagram.part.VendingMachineVisualIDRegistry
							.getType(vendingMachine.diagram.edit.parts.MessageEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					vendingMachine.diagram.part.VendingMachineVisualIDRegistry
							.getType(vendingMachine.diagram.edit.parts.ButtonEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					vendingMachine.diagram.part.VendingMachineVisualIDRegistry
							.getType(vendingMachine.diagram.edit.parts.UserCoinEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return vendingMachine.diagram.edit.parts.VendingMachineEditPart.MODEL_ID
				.equals(vendingMachine.diagram.part.VendingMachineVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<vendingMachine.diagram.navigator.VendingMachineNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<vendingMachine.diagram.navigator.VendingMachineNavigatorItem> result = new ArrayList<vendingMachine.diagram.navigator.VendingMachineNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new vendingMachine.diagram.navigator.VendingMachineNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<vendingMachine.diagram.navigator.VendingMachineNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof vendingMachine.diagram.navigator.VendingMachineAbstractNavigatorItem) {
			vendingMachine.diagram.navigator.VendingMachineAbstractNavigatorItem abstractNavigatorItem = (vendingMachine.diagram.navigator.VendingMachineAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
