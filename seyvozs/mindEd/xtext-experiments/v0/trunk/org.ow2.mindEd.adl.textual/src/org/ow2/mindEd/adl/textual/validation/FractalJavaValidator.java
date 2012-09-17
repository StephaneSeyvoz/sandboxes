package org.ow2.mindEd.adl.textual.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.ow2.mindEd.adl.textual.fractal.CompositeDefinition;
import org.ow2.mindEd.adl.textual.fractal.CompositeElement;
import org.ow2.mindEd.adl.textual.fractal.FractalPackage;
import org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveElement;
import org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition;
import org.ow2.mindEd.adl.textual.fractal.TypeDefinition;


public class FractalJavaValidator extends AbstractFractalJavaValidator {

	// Quick fix codes
	public static final String UNKNOWN_IMPORT = "org.ow2.fractal.mind.xtext.validation.unknown_import";
	public static final String UNKNOWN_TEMPLATE_SPECIFIER_TYPE = "org.ow2.fractal.mind.xtext.validation.unknown_template_specifier_type";
	public static final String DUPLICATE_COMPONENT_NAME = "org.ow2.fractal.mind.xtext.validation.duplicate_component_name";
	public static final String DUPLICATE_FORMAL_ARGUMENT_NAME = "org.ow2.fractal.mind.xtext.validation.duplicate_formal_argument_name";
	public static final String DUPLICATE_TEMPLATE_SPECIFIER_NAME = "org.ow2.fractal.mind.xtext.validation.duplicate_template_specifier_name";
	public static final String DUPLICATE_INTERFACE_NAME = "org.ow2.fractal.mind.xtext.validation.duplicate_interface_name";
	public static final String UNKNOWN_INTERFACE = "org.ow2.fractal.mind.xtext.validation.unknown_interface";
	public static final String UNKNOWN_SOURCE_FILE = "org.ow2.fractal.mind.xtext.validation.unknown_source";

	@Check
	public void checkSubComponentNameIsUnique(SubComponentDefinition subCompDef) {
		CompositeDefinition parentCompositeDef = (CompositeDefinition) subCompDef.eContainer();

		// TODO: handle super types and inheritance !
		EList<CompositeElement> elements = parentCompositeDef.getElements();
		for(CompositeElement element: elements) {
			if ((element != subCompDef) && (element instanceof SubComponentDefinition))
				if (subCompDef.getName().equals(((SubComponentDefinition) element).getName())) {
					error("Sub-component names have to be unique",
							FractalPackage.Literals.SUB_COMPONENT_DEFINITION__NAME);
					return;
				}
		}
	}

	@Check
	public void checkHostedInterfaceIsUnique(HostedInterfaceDefinition itfDef) {

		EObject container = itfDef.eContainer();

		if (container instanceof PrimitiveDefinition)
			checkHostedInterfaceIsUniqueInPrimitive((PrimitiveDefinition) container, itfDef);
		else if (container instanceof CompositeDefinition)
			checkHostedInterfaceIsUniqueInComposite((CompositeDefinition) container, itfDef);
		else if (container instanceof TypeDefinition)
			checkHostedInterfaceIsUniqueInType((TypeDefinition) container, itfDef);
		// else... nothing
	}

	private void checkHostedInterfaceIsUniqueInPrimitive(PrimitiveDefinition compDef, HostedInterfaceDefinition itfDef) {
		// TODO: handle super types and inheritance !
		EList<PrimitiveElement> elements = compDef.getElements();
		for(PrimitiveElement element: elements) {
			if ((element != itfDef) && (element instanceof HostedInterfaceDefinition))
				if (itfDef.getName().equals(((HostedInterfaceDefinition) element).getName())) {
					error("Interface names have to be unique",
							FractalPackage.Literals.HOSTED_INTERFACE_DEFINITION__NAME);
					return;
				}
		}
	}

	private void checkHostedInterfaceIsUniqueInComposite(CompositeDefinition compDef, HostedInterfaceDefinition itfDef) {
		// TODO: handle super types and inheritance !
		EList<CompositeElement> elements = compDef.getElements();
		for(CompositeElement element: elements) {
			if ((element != itfDef) && (element instanceof HostedInterfaceDefinition))
				if (itfDef.getName().equals(((HostedInterfaceDefinition) element).getName())) {
					error("Interface names have to be unique",
							FractalPackage.Literals.HOSTED_INTERFACE_DEFINITION__NAME);
					return;
				}
		}
	}

	private void checkHostedInterfaceIsUniqueInType(TypeDefinition compDef, HostedInterfaceDefinition itfDef) {
		// TODO: handle super types and inheritance !
		EList<HostedInterfaceDefinition> elements = compDef.getElements();
		for(HostedInterfaceDefinition element: elements) {
			if (element != itfDef)
				if (itfDef.getName().equals(element.getName())) {
					error("Interface names have to be unique",
							FractalPackage.Literals.HOSTED_INTERFACE_DEFINITION__NAME);
					return;
				}
		}
	}


}
