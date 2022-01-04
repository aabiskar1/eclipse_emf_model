/*
 * 
 */
package vendingMachine.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class VendingMachineCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected vendingMachine.diagram.part.VendingMachineCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected vendingMachine.diagram.part.VendingMachineCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(vendingMachine.diagram.part.Messages.VendingMachineCreationWizardTitle);
		setDefaultPageImageDescriptor(vendingMachine.diagram.part.VendingMachineDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewVendingMachineWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new vendingMachine.diagram.part.VendingMachineCreationWizardPage("DiagramModelFile", //$NON-NLS-1$
				getSelection(), "vendingmachine_diagram"); //$NON-NLS-1$
		diagramModelFilePage
				.setTitle(vendingMachine.diagram.part.Messages.VendingMachineCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				vendingMachine.diagram.part.Messages.VendingMachineCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new vendingMachine.diagram.part.VendingMachineCreationWizardPage("DomainModelFile", //$NON-NLS-1$
				getSelection(), "vendingmachine") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".vendingmachine_diagram".length()); //$NON-NLS-1$
					setFileName(vendingMachine.diagram.part.VendingMachineDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "vendingmachine")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(vendingMachine.diagram.part.Messages.VendingMachineCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				vendingMachine.diagram.part.Messages.VendingMachineCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = vendingMachine.diagram.part.VendingMachineDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						vendingMachine.diagram.part.VendingMachineDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								vendingMachine.diagram.part.Messages.VendingMachineCreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						vendingMachine.diagram.part.Messages.VendingMachineCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				vendingMachine.diagram.part.VendingMachineDiagramEditorPlugin.getInstance()
						.logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
