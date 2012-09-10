/*
* generated by Xtext
*/
package org.ow2.mindEd.idt.editor.textual.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.ow2.mindEd.idt.editor.textual.fractalIdt.ConstantDefinitionBegin;
//import org.ow2.mindEd.idt.editor.textual.fractalIdt.ConstantDefinitionEnd;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantDefinition;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class FractalIdtLabelProvider extends DefaultEObjectLabelProvider {


	@Inject
	public FractalIdtLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	public String image(ConstantDefinitionBegin obj) {
		return "define_obj.gif";
	}
	
//	public String image(ConstantDefinitionEnd obj) {
//		return "define_obj.gif";
//	}
	
	public String image(ConstantDefinition obj) {
		return "define_obj.gif";

	}
}
