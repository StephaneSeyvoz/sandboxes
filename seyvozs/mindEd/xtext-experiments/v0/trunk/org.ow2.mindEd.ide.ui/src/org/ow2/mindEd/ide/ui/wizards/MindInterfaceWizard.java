package org.ow2.mindEd.ide.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.core.MindModel;
import org.ow2.mindEd.ide.core.template.TemplateITF;
import org.ow2.mindEd.ide.model.MindItf;
import org.ow2.mindEd.ide.model.MindPackage;
import org.ow2.mindEd.ide.model.MindRootSrc;
import org.ow2.mindEd.ide.model.MindideFactory;
import org.ow2.mindEd.ide.ui.Activator;

/**
 * 
 * @author Stephane Seyvoz
 * This class is strongly inspired by
 * @see ComponentNewWizard
 */
public class MindInterfaceWizard extends Wizard implements INewWizard {

	private MindInterfaceWizardPage _page;
	private ISelection _selection;
	private MindModel _model;

	/**
	 * Constructor for MindInterfaceWizard
	 */
	public MindInterfaceWizard() {
		super();
		setNeedsProgressMonitor(true);
		_model = MindIdeCore.getModel();
	}

	/**
	 * Adding the page to the wizard.
	 */
	@Override
	public void addPages() {
		_page = new MindInterfaceWizardPage(_model, _selection);
		addPage(_page);
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this._selection = selection;
		setWindowTitle(Messages.MindInterfaceWizard_windows_title);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	@Override
	public boolean performFinish() {
		final String containerName = _page.getSourceFolderName();
		final String packageName = _page.getPackageName();
		final String fileName = _page.getInterfaceName();

		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, packageName, fileName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), Messages.ComponentNewWizard_exception_error, realException.getMessage());
			return false;
		}
		return true;
	}

	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 * @param packageName 
	 * @param kind 
	 */

	private void doFinish(
			String containerName,
			String packageName,
			String interfaceName,
			IProgressMonitor monitor)
					throws CoreException {
		// create a sample file
		monitor.beginTask(NLS.bind(Messages.MindInterfaceWizard_create_itf, packageName+"."+interfaceName), 2); 
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException(NLS.bind(Messages.error_container_does_not_exists , containerName )); 
		}
		MindRootSrc rs = _model.findOrCreateRootSrc((IContainer) resource);
		if (rs == null)
			throwCoreException(NLS.bind(Messages.error_cannot_find_or_create_source_folder, containerName));
		MindPackage p = _model.findOrCreatePackage(rs, packageName);
		if (p == null)
			throwCoreException(NLS.bind(Messages.error_cannot_find_or_create_package, containerName));
		
		MindItf itf = MindideFactory.eINSTANCE.createMindItf();
		IContainer container = MindIdeCore.getResource(p);
		create(container, monitor);
		final IFile file = container.getFile(new Path(interfaceName+".itf")); //$NON-NLS-1$
		itf.setFullpath(file.getFullPath().toPortableString());
		if (packageName.length() != 0)
			itf.setQualifiedName(packageName+"."+interfaceName); //$NON-NLS-1$
		else
			itf.setQualifiedName(interfaceName); 
		itf.setName(interfaceName);
		itf.setPackage(p);
		
		InputStream stream = openContentStream(itf);
		if (file.exists()) {
			//file.setContents(stream, true, true, monitor);
		} else {
			file.create(stream, true, monitor);
		}
		
		// No diagrams anymore
		//Activator.createDiagram(monitor, itf);

		monitor.worked(1);
		monitor.setTaskName(Messages.MindInterfaceWizard_opening_file);
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				Activator.openFile(file);
			}
		});
		monitor.worked(1);
	}

	/**
	 * We will initialize file contents with a sample text.
	 * @param itf
	 */
	private InputStream openContentStream(MindItf itf) {
		
		String contents = ""; //$NON-NLS-1$
		
		contents = new TemplateITF().generate(itf.getQualifiedName());
	
		return new ByteArrayInputStream(contents.getBytes());
	}
	
	private void create(IContainer container, IProgressMonitor monitor) throws CoreException {
		Assert.isNotNull(container);
		if (container.exists()) return;
		create(container.getParent(), monitor);
		Assert.isTrue(container.getType() == IResource.FOLDER);
		((IFolder)container).create(false, true, monitor);
		
	}
	
	private void throwCoreException(String message) throws CoreException {
		IStatus status =
				new Status(IStatus.ERROR, Activator.PLUGIN_ID, IStatus.OK, message, null);
		throw new CoreException(status);
	}

}
