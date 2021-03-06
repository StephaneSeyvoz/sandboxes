package org.ow2.mindEd.ide.ui.navigator;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.ow2.mindEd.ide.model.MindPathEntry;

public class MindEditingDomain extends AdapterFactoryEditingDomain implements EditingDomain {

	public MindEditingDomain(AdapterFactory adapterFactory) {
		super(adapterFactory, new BasicCommandStack());
	}
	
	public boolean canDelete(Object obj) {
		return obj instanceof MindPathEntry;
	}

}
