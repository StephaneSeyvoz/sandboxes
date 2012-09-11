/*
 * generated by Xtext
 */
package org.ow2.mindEd.adl.textual.scoping;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition;
import org.ow2.mindEd.adl.textual.fractal.BindingDefinition;
import org.ow2.mindEd.adl.textual.fractal.CompositeDefinition;
import org.ow2.mindEd.adl.textual.fractal.CompositeElement;
import org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveElement;
import org.ow2.mindEd.adl.textual.fractal.ProvidedInterfaceDefinition;
import org.ow2.mindEd.adl.textual.fractal.RequiredInterfaceDefinition;
import org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition;
import org.ow2.mindEd.adl.textual.fractal.TypeDefinition;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class FractalScopeProvider extends AbstractDeclarativeScopeProvider {

	
	// Heaviest methods ever: will need further optimization, not sure how to improve templated ELists behavior.
	public IScope scope_BindingDefinition_sourceInterface(final BindingDefinition bindingDef, final EReference ref) {

		ArchitectureDefinition sourceComponentArchDef = null;

		// If the source parent is a subcomponent
		if (!bindingDef.isIsSrcParentThis())
			sourceComponentArchDef = bindingDef.getSourceParent().getType();
		else  {
			// if the source parent is "this"
			EObject container = bindingDef.eContainer();
			// Find the parent host definition
			while (!(container instanceof CompositeDefinition))
				container = container.eContainer();
			sourceComponentArchDef = (ArchitectureDefinition) container;
		}

		if (sourceComponentArchDef instanceof TypeDefinition) {
			// Get all the elements
			EList<HostedInterfaceDefinition> elements = ((TypeDefinition) sourceComponentArchDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			if (!bindingDef.isIsSrcParentThis()) {
				EList<RequiredInterfaceDefinition> reqItfList = new BasicEList<RequiredInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof RequiredInterfaceDefinition) {
						reqItfList.add((RequiredInterfaceDefinition) currentEObject);
					}
				}
				// We also want all required interfaces coming from Super Types
				reqItfList.addAll(listAllRequiredInterfacesFromArchDefSuperTypes(sourceComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(reqItfList);
			} else {
				EList<ProvidedInterfaceDefinition> pvdItfList = new BasicEList<ProvidedInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof ProvidedInterfaceDefinition) {
						pvdItfList.add((ProvidedInterfaceDefinition) currentEObject);
					}
				}
				// We also want all provided interfaces coming from Super Types
				pvdItfList.addAll(listAllProvidedInterfacesFromArchDefSuperTypes(sourceComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(pvdItfList);
			}
		} else if (sourceComponentArchDef instanceof CompositeDefinition) {
			// Get all the elements
			EList<CompositeElement> elements = ((CompositeDefinition) sourceComponentArchDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			if (!bindingDef.isIsSrcParentThis()) {
				EList<RequiredInterfaceDefinition> reqItfList = new BasicEList<RequiredInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof RequiredInterfaceDefinition) {
						reqItfList.add((RequiredInterfaceDefinition) currentEObject);
					}
				}
				// We also want all required interfaces coming from Super Types
				reqItfList.addAll(listAllRequiredInterfacesFromArchDefSuperTypes(sourceComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(reqItfList);
			} else {
				EList<ProvidedInterfaceDefinition> pvdItfList = new BasicEList<ProvidedInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof ProvidedInterfaceDefinition) {
						pvdItfList.add((ProvidedInterfaceDefinition) currentEObject);
					}
				}
				// We also want all provided interfaces coming from Super Types
				pvdItfList.addAll(listAllProvidedInterfacesFromArchDefSuperTypes(sourceComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(pvdItfList);
			}
		} else if (sourceComponentArchDef instanceof PrimitiveDefinition) {
			// Get all the elements
			EList<PrimitiveElement> elements = ((PrimitiveDefinition) sourceComponentArchDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			if (!bindingDef.isIsSrcParentThis()) {
				EList<RequiredInterfaceDefinition> reqItfList = new BasicEList<RequiredInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof RequiredInterfaceDefinition) {
						reqItfList.add((RequiredInterfaceDefinition) currentEObject);
					}
				}
				// We also want all required interfaces coming from Super Types
				reqItfList.addAll(listAllRequiredInterfacesFromArchDefSuperTypes(sourceComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(reqItfList);
			} else {
				EList<ProvidedInterfaceDefinition> pvdItfList = new BasicEList<ProvidedInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof ProvidedInterfaceDefinition) {
						pvdItfList.add((ProvidedInterfaceDefinition) currentEObject);
					}
				}
				// We also want all provided interfaces coming from Super Types
				pvdItfList.addAll(listAllProvidedInterfacesFromArchDefSuperTypes(sourceComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(pvdItfList);
			}
		} else {
			// error case
			return IScope.NULLSCOPE;
		}
	}

	public IScope scope_BindingDefinition_targetInterface(final BindingDefinition bindingDef, final EReference ref) {

		ArchitectureDefinition targetComponentArchDef = null;

		// If the source parent isn't a sub-component but "this"
		if (!bindingDef.isIsTgtParentThis())
			targetComponentArchDef = bindingDef.getTargetParent().getType();
		else  {
			EObject container = bindingDef.eContainer();
			// Find the parent host definition
			while (!(container instanceof CompositeDefinition))
				container = container.eContainer();
			targetComponentArchDef = (ArchitectureDefinition) container;
		}

		if (targetComponentArchDef instanceof TypeDefinition) {
			// Get all the elements
			EList<HostedInterfaceDefinition> elements = ((TypeDefinition) targetComponentArchDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			if (!bindingDef.isIsTgtParentThis()) {
				EList<ProvidedInterfaceDefinition> pvdItfList = new BasicEList<ProvidedInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof ProvidedInterfaceDefinition) {
						pvdItfList.add((ProvidedInterfaceDefinition) currentEObject);
					}
				}
				// We also want all provided interfaces coming from Super Types
				pvdItfList.addAll(listAllProvidedInterfacesFromArchDefSuperTypes(targetComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(pvdItfList);
			} else {
				EList<RequiredInterfaceDefinition> reqItfList = new BasicEList<RequiredInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof RequiredInterfaceDefinition) {
						reqItfList.add((RequiredInterfaceDefinition) currentEObject);
					}
				}
				// We also want all required interfaces coming from Super Types
				reqItfList.addAll(listAllRequiredInterfacesFromArchDefSuperTypes(targetComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(reqItfList);
			}
		} else if (targetComponentArchDef instanceof CompositeDefinition) {
			// Get all the elements
			EList<CompositeElement> elements = ((CompositeDefinition) targetComponentArchDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			if (!bindingDef.isIsTgtParentThis()) {
				EList<ProvidedInterfaceDefinition> pvdItfList = new BasicEList<ProvidedInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof ProvidedInterfaceDefinition) {
						pvdItfList.add((ProvidedInterfaceDefinition) currentEObject);
					}
				}
				// We also want all provided interfaces coming from Super Types
				pvdItfList.addAll(listAllProvidedInterfacesFromArchDefSuperTypes(targetComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(pvdItfList);
			} else {
				EList<RequiredInterfaceDefinition> reqItfList = new BasicEList<RequiredInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof RequiredInterfaceDefinition) {
						reqItfList.add((RequiredInterfaceDefinition) currentEObject);
					}
				}
				// We also want all required interfaces coming from Super Types
				reqItfList.addAll(listAllRequiredInterfacesFromArchDefSuperTypes(targetComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(reqItfList);
			}
		} else if (targetComponentArchDef instanceof PrimitiveDefinition) {
			// Get all the elements
			EList<PrimitiveElement> elements = ((PrimitiveDefinition) targetComponentArchDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			if (!bindingDef.isIsTgtParentThis()) {
				EList<ProvidedInterfaceDefinition> pvdItfList = new BasicEList<ProvidedInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof ProvidedInterfaceDefinition) {
						pvdItfList.add((ProvidedInterfaceDefinition) currentEObject);
					}
				}
				// We also want all provided interfaces coming from Super Types
				pvdItfList.addAll(listAllProvidedInterfacesFromArchDefSuperTypes(targetComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(pvdItfList);
			} else {
				EList<RequiredInterfaceDefinition> reqItfList = new BasicEList<RequiredInterfaceDefinition>();
				for (EObject currentEObject : elements) {
					if (currentEObject instanceof RequiredInterfaceDefinition) {
						reqItfList.add((RequiredInterfaceDefinition) currentEObject);
					}
				}
				// We also want all required interfaces coming from Super Types
				reqItfList.addAll(listAllRequiredInterfacesFromArchDefSuperTypes(targetComponentArchDef));
				// Obtain and return a scope according to the computed list
				return Scopes.scopeFor(reqItfList);
			}
		} else {
			// error case
			return IScope.NULLSCOPE;
		}
	}

	private EList<RequiredInterfaceDefinition> listAllRequiredInterfacesFromArchDefSuperTypes(ArchitectureDefinition archDef){
		EList<ArchitectureDefinition> superTypes = archDef.getSuperTypes();
		
		EList<RequiredInterfaceDefinition> reqItfList = new BasicEList<RequiredInterfaceDefinition>();
		
		for (ArchitectureDefinition currSuperArchDef : superTypes) {
			reqItfList.addAll(getAllArchDefRequiredInterfaces(currSuperArchDef));
			// we need a recursion in all supertypes
			listAllRequiredInterfacesFromArchDefSuperTypes(currSuperArchDef);
		}
		
		return reqItfList;
	}

	private EList<RequiredInterfaceDefinition> getAllArchDefRequiredInterfaces(ArchitectureDefinition archDef) {
		EList<RequiredInterfaceDefinition> reqItfList = new BasicEList<RequiredInterfaceDefinition>();
		
		if (archDef instanceof TypeDefinition) {
			// Get all the elements
			EList<HostedInterfaceDefinition> elements = ((TypeDefinition) archDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)
			
			for (EObject currentEObject : elements) {
				if (currentEObject instanceof RequiredInterfaceDefinition) {
					reqItfList.add((RequiredInterfaceDefinition) currentEObject);
				}
			}
		} else if (archDef instanceof CompositeDefinition) {
			// Get all the elements
			EList<CompositeElement> elements = ((CompositeDefinition) archDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			for (EObject currentEObject : elements) {
				if (currentEObject instanceof RequiredInterfaceDefinition) {
					reqItfList.add((RequiredInterfaceDefinition) currentEObject);
				}
			}
		} else if (archDef instanceof PrimitiveDefinition) {
			// Get all the elements
			EList<PrimitiveElement> elements = ((PrimitiveDefinition) archDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			for (EObject currentEObject : elements) {
				if (currentEObject instanceof RequiredInterfaceDefinition) {
					reqItfList.add((RequiredInterfaceDefinition) currentEObject);
				}
			}
		}
		return reqItfList;
	}
	
	private EList<ProvidedInterfaceDefinition> listAllProvidedInterfacesFromArchDefSuperTypes(ArchitectureDefinition archDef){
		EList<ArchitectureDefinition> superTypes = archDef.getSuperTypes();
		
		EList<ProvidedInterfaceDefinition> reqItfList = new BasicEList<ProvidedInterfaceDefinition>();
		
		for (ArchitectureDefinition currSuperArchDef : superTypes) {
			reqItfList.addAll(getAllArchDefProvidedInterfaces(currSuperArchDef));
			// we need a recursion in all supertypes
			listAllProvidedInterfacesFromArchDefSuperTypes(currSuperArchDef);
		}
		
		return reqItfList;
	}

	private EList<ProvidedInterfaceDefinition> getAllArchDefProvidedInterfaces(ArchitectureDefinition archDef) {
		EList<ProvidedInterfaceDefinition> reqItfList = new BasicEList<ProvidedInterfaceDefinition>();
		
		if (archDef instanceof TypeDefinition) {
			// Get all the elements
			EList<HostedInterfaceDefinition> elements = ((TypeDefinition) archDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)
			
			for (EObject currentEObject : elements) {
				if (currentEObject instanceof ProvidedInterfaceDefinition) {
					reqItfList.add((ProvidedInterfaceDefinition) currentEObject);
				}
			}
		} else if (archDef instanceof CompositeDefinition) {
			// Get all the elements
			EList<CompositeElement> elements = ((CompositeDefinition) archDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			for (EObject currentEObject : elements) {
				if (currentEObject instanceof ProvidedInterfaceDefinition) {
					reqItfList.add((ProvidedInterfaceDefinition) currentEObject);
				}
			}
		} else if (archDef instanceof PrimitiveDefinition) {
			// Get all the elements
			EList<PrimitiveElement> elements = ((PrimitiveDefinition) archDef).getElements();
			// Then filter for RequiredInterfaceDefinition(s)

			for (EObject currentEObject : elements) {
				if (currentEObject instanceof ProvidedInterfaceDefinition) {
					reqItfList.add((ProvidedInterfaceDefinition) currentEObject);
				}
			}
		}
		return reqItfList;
	}

	//	public IScope getScope(SubComponentDefinition subCompDef, EReference ref){
	//		return null;
	//		
	//	}

	//	@Override
	//	public IScope getScope(EObject context, EReference reference){
	//		System.out.println(
	//				"scope_" + reference.getEContainingClass().getName()
	//				+ "_" + reference.getName()
	//				+ "(" + context.eClass().getName() + ", ..)"
	//				);
	//		return super.getScope(context, reference);
	//	}

	/* A tentative to filter binding source components (parent) for auto-completion to suggest only components bearing client interfaces.
	 * The result of the method is good but the scoping doesnt seem to b used by the ProposalProvider, it only says there's an error when you chose a
	 * wrong component... I decided to deal with the problem at the ProposalProvider level instead. 
		public IScope scope_BindingDefinition_sourceParent(BindingDefinition bindingDef, EReference ref) {
			// Early check
			assert (bindingDef.eContainer() instanceof CompositeDefinition); 
			CompositeDefinition hostCompDef = (CompositeDefinition) bindingDef.eContainer();
			EList<CompositeElement> elements = hostCompDef.getElements();

			// Let's fill a list with all SubComponent instances that have at list 1 client interface
			EList<SubComponentDefinition> subCompList = new BasicEList<SubComponentDefinition>();

			// For all the possible SubComponents we need to check in their Type if they have RequiredInterfaces
			for (CompositeElement element : elements) {
				if (element instanceof SubComponentDefinition) {
					SubComponentDefinition currentCompDef = (SubComponentDefinition) element;
					ArchitectureDefinition currentArchDef = currentCompDef.getType();
					if (currentArchDef instanceof TypeDefinition) {
						TypeDefinition currentTypeDef = (TypeDefinition) currentArchDef; 
						EList<HostedInterfaceDefinition> interfaces = currentTypeDef.getElements();

						// Check if a client interface exists : then add the component to the list
						for (HostedInterfaceDefinition currentInterface : interfaces) {
							if (currentInterface instanceof RequiredInterfaceDefinition) {
								subCompList.add(currentCompDef);
								break;
							}
						}
					} else if (currentArchDef instanceof CompositeDefinition) {
						CompositeDefinition currentCompositeDef = (CompositeDefinition) currentArchDef; 
						EList<CompositeElement> compositeElements = currentCompositeDef.getElements();

						for (CompositeElement compositeElement : compositeElements){
							// Check if a client interface exists : then add the component to the list
							if (compositeElement instanceof RequiredInterfaceDefinition) {
								subCompList.add(currentCompDef);
								break;
							}
						}
					} else if (currentArchDef instanceof PrimitiveDefinition) {
						PrimitiveDefinition currentPrimitiveDef = (PrimitiveDefinition) currentArchDef; 
						EList<PrimitiveElement> primitiveElements = currentPrimitiveDef.getElements();

						for (PrimitiveElement primitiveElement : primitiveElements){
							// Check if a client interface exists : then add the component to the list
							if (primitiveElement instanceof RequiredInterfaceDefinition) {
								subCompList.add(currentCompDef);
								break;
							}
						}
					} // else just do nothing
				}
			}

			return Scopes.scopeFor(subCompList);
		}
	 */

}
