/*
 * generated by Xtext
 */

package org.ow2.mind.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.AbstractEObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.ow2.mind.AdlModelHelper;
import org.ow2.mind.adl.Binding;
import org.ow2.mind.adl.Definition;
import org.ow2.mind.adl.Interface;
import org.ow2.mind.adl.SubComponent;

/**
 * This class contains custom scoping description. see :
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping on how
 * and when to use it
 */
public class AdlScopeProvider extends AbstractDeclarativeScopeProvider {

  protected IScope scope_Binding_fromItf(Binding binding, EReference ref) {
    final List<Interface> fromItfs = new ArrayList<Interface>();
    SubComponent fromSubComp = binding.getFromSubComp();
    if (fromSubComp == null) {
      // from 'this'
      Definition d = (Definition) binding.eContainer();
      fromItfs.addAll(AdlModelHelper.getAllServerInterfaces(d, true));
      fromItfs.addAll(AdlModelHelper.getAllInputInterfaces(d, true));
    } else {
      fromItfs.addAll(AdlModelHelper.getAllClientInterfaces(fromSubComp, true));
      fromItfs.addAll(AdlModelHelper.getAllOutputInterfaces(fromSubComp, true));
    }

    return new BindingItfScope(fromItfs);
  }

  protected IScope scope_Binding_toItf(Binding binding, EReference ref) {
    final List<Interface> toItfs = new ArrayList<Interface>();
    SubComponent toSubComp = binding.getToSubComp();
    if (toSubComp == null) {
      // from 'this'
      Definition d = (Definition) binding.eContainer();
      toItfs.addAll(AdlModelHelper.getAllClientInterfaces(d, true));
      toItfs.addAll(AdlModelHelper.getAllOutputInterfaces(d, true));
    } else {
      toItfs.addAll(AdlModelHelper.getAllServerInterfaces(toSubComp, true));
      toItfs.addAll(AdlModelHelper.getAllInputInterfaces(toSubComp, true));
    }

    return new BindingItfScope(toItfs);
  }

  protected static class BindingItfScope extends AbstractScope {

    protected final List<Interface> toItfs;

    protected BindingItfScope(List<Interface> toItfs) {
      this.toItfs = toItfs;
    }

    public IScope getOuterScope() {
      return NULLSCOPE;
    }

    @Override
    protected Iterable<IEObjectDescription> internalGetContents() {
      List<IEObjectDescription> itfList = new ArrayList<IEObjectDescription>(
          toItfs.size());
      for (Interface itf : toItfs) {
        itfList.add(new ItfEObjectDescription(itf));
      }
      return itfList;
    }
  }

  private static final class ItfEObjectDescription
      extends
        AbstractEObjectDescription {
    private final Interface itf;

    private ItfEObjectDescription(Interface itf) {
      this.itf = itf;
    }

    public String getQualifiedName() {
      return itf.getName();
    }

    public String getName() {
      return getQualifiedName();
    }

    public URI getEObjectURI() {
      Resource eResource = itf.eResource();
      return eResource.getURI().appendFragment(eResource.getURIFragment(itf));
    }

    public EObject getEObjectOrProxy() {
      return itf;
    }

    public EClass getEClass() {
      return itf.eClass();
    }
  }

  protected IScope scope_Binding_fromSubComp(Binding binding, EReference ref) {
    final List<SubComponent> subComps = new ArrayList<SubComponent>();
    Definition d = (Definition) binding.eContainer();
    subComps.addAll(AdlModelHelper.getAllSubComponents(d, true));
    return new BindingSubCompScope(subComps);
  }

  protected IScope scope_Binding_toSubComp(Binding binding, EReference ref) {
    final List<SubComponent> subComps = new ArrayList<SubComponent>();
    Definition d = (Definition) binding.eContainer();
    subComps.addAll(AdlModelHelper.getAllSubComponents(d, true));
    return new BindingSubCompScope(subComps);
  }

  protected static class BindingSubCompScope extends AbstractScope {

    protected final List<SubComponent> subComps;

    protected BindingSubCompScope(List<SubComponent> subComps) {
      this.subComps = subComps;
    }

    public IScope getOuterScope() {
      return NULLSCOPE;
    }

    @Override
    protected Iterable<IEObjectDescription> internalGetContents() {
      List<IEObjectDescription> itfList = new ArrayList<IEObjectDescription>(
          subComps.size());
      for (SubComponent subComp : subComps) {
        itfList.add(new SubCompEObjectDescription(subComp));
      }
      return itfList;
    }
  }

  private static final class SubCompEObjectDescription
      extends
        AbstractEObjectDescription {
    private final SubComponent subComp;

    private SubCompEObjectDescription(SubComponent subComp) {
      this.subComp = subComp;
    }

    public String getQualifiedName() {
      return subComp.getName();
    }

    public String getName() {
      return getQualifiedName();
    }

    public URI getEObjectURI() {
      Resource eResource = subComp.eResource();
      return eResource.getURI().appendFragment(eResource.getURIFragment(subComp));
    }

    public EObject getEObjectOrProxy() {
      return subComp;
    }

    public EClass getEClass() {
      return subComp.eClass();
    }
  }
}
