/**
 * Copyright (C) 2009 STMicroelectronics
 *
 * This file is part of "Mind Compiler" is free software: you can redistribute
 * it and/or modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact: mind@ow2.org
 *
 * Authors: ali-erdem.ozcan@st.com
 * Contributors:
 */

package org.ow2.mind.doc.adl;

import static org.ow2.mind.adl.ADLLocator.ADL_RESOURCE_KIND;

import org.objectweb.fractal.adl.Loader;
import org.objectweb.fractal.adl.NodeFactory;
import org.objectweb.fractal.adl.merger.NodeMerger;
import org.objectweb.fractal.adl.xml.XMLNodeFactory;
import org.objectweb.fractal.api.control.BindingController;
import org.objectweb.fractal.cecilia.adl.plugin.JavaPluginManager;
import org.objectweb.fractal.cecilia.adl.plugin.PluginManager;
import org.ow2.mind.BasicInputResourceLocator;
import org.ow2.mind.adl.ADLLoader;
import org.ow2.mind.adl.ADLLocator;
import org.ow2.mind.adl.BasicADLLocator;
import org.ow2.mind.adl.BasicDefinitionReferenceResolver;
import org.ow2.mind.adl.BinaryADLLoader;
import org.ow2.mind.adl.CacheLoader;
import org.ow2.mind.adl.CachingDefinitionReferenceResolver;
import org.ow2.mind.adl.DefinitionCache;
import org.ow2.mind.adl.ExtendsLoader;
import org.ow2.mind.adl.InputResourcesDefinitionReferenceResolver;
import org.ow2.mind.adl.STCFNodeMerger;
import org.ow2.mind.adl.SubComponentResolverLoader;
import org.ow2.mind.adl.annotation.ADLLoaderPhase;
import org.ow2.mind.adl.annotation.AnnotationLoader;
import org.ow2.mind.adl.annotation.AnnotationProcessorLoader;
import org.ow2.mind.adl.anonymous.AnonymousDefinitionExtractorImpl;
import org.ow2.mind.adl.anonymous.AnonymousDefinitionLoader;
import org.ow2.mind.adl.anonymous.ImportAnonymousDefinitionExtractor;
import org.ow2.mind.adl.binding.BasicBindingChecker;
import org.ow2.mind.adl.binding.BindingChecker;
import org.ow2.mind.adl.binding.BindingCheckerLoader;
import org.ow2.mind.adl.binding.BindingNormalizerLoader;
import org.ow2.mind.adl.binding.UnboundInterfaceCheckerLoader;
import org.ow2.mind.adl.factory.FactoryLoader;
import org.ow2.mind.adl.factory.FactoryTemplateInstantiator;
import org.ow2.mind.adl.factory.ParametricFactoryTemplateInstantiator;
import org.ow2.mind.adl.generic.CachingTemplateInstantiator;
import org.ow2.mind.adl.generic.ExtendsGenericDefinitionReferenceResolver;
import org.ow2.mind.adl.generic.GenericAnonymousDefinitionExtractor;
import org.ow2.mind.adl.generic.GenericDefinitionLoader;
import org.ow2.mind.adl.generic.GenericDefinitionReferenceResolver;
import org.ow2.mind.adl.generic.NoAnySubComponentLoader;
import org.ow2.mind.adl.generic.NoAnyTypeArgumentDefinitionReferenceResolver;
import org.ow2.mind.adl.generic.TemplateInstanceLoader;
import org.ow2.mind.adl.generic.TemplateInstantiatorImpl;
import org.ow2.mind.adl.idl.BasicInterfaceSignatureResolver;
import org.ow2.mind.adl.idl.InterfaceSignatureLoader;
import org.ow2.mind.adl.idl.InterfaceSignatureResolver;
import org.ow2.mind.adl.implementation.BasicImplementationLocator;
import org.ow2.mind.adl.implementation.ImplementationLoader;
import org.ow2.mind.adl.implementation.ImplementationLocator;
import org.ow2.mind.adl.imports.ADLImportChecker;
import org.ow2.mind.adl.imports.IDLImportChecker;
import org.ow2.mind.adl.imports.ImportChecker;
import org.ow2.mind.adl.imports.ImportCheckerLoader;
import org.ow2.mind.adl.imports.ImportDefinitionReferenceResolver;
import org.ow2.mind.adl.imports.ImportInterfaceSignatureResolver;
import org.ow2.mind.adl.membrane.CompositeInternalInterfaceLoader;
import org.ow2.mind.adl.membrane.MembraneCheckerLoader;
import org.ow2.mind.adl.parameter.ExtendsParametricDefinitionReferenceResolver;
import org.ow2.mind.adl.parameter.ParametricAnonymousDefinitionExtractor;
import org.ow2.mind.adl.parameter.ParametricDefinitionReferenceResolver;
import org.ow2.mind.adl.parameter.ParametricGenericDefinitionReferenceResolver;
import org.ow2.mind.adl.parameter.ParametricTemplateInstantiator;
import org.ow2.mind.annotation.AnnotationChainFactory;
import org.ow2.mind.doc.adl.parser.ADLParser;
import org.ow2.mind.error.ErrorManager;
import org.ow2.mind.idl.IDLLoader;
import org.ow2.mind.idl.IDLLoaderChainFactory;
import org.ow2.mind.idl.IDLLocator;
import org.ow2.mind.plugin.SimpleClassPluginFactory;
import org.ow2.mind.st.STLoaderFactory;
import org.ow2.mind.st.STNodeFactoryImpl;
import org.ow2.mind.st.STNodeMergerImpl;
import org.ow2.mind.st.XMLSTNodeFactoryImpl;

public final class DocumentationFrontendFactory {

  private DocumentationFrontendFactory() {
  }

  public static ADLLocator newLocator() {
    final ADLLocator adlLocator = new BasicADLLocator();

    return adlLocator;
  }

  /**
   * Returns a {@link Loader} interface that can be used to parse and check an
   * ADL Definition.
   *
   * @return a {@link Loader} interface.
   */
  public static Loader newLoader(final ErrorManager errorManager) {

    final BasicInputResourceLocator inputResourceLocator = new BasicInputResourceLocator();
    final ADLLocator adlLocator = newLocator();
    final IDLLocator idlLocator = IDLLoaderChainFactory.newIDLLocator(inputResourceLocator);
    final org.objectweb.fractal.adl.Factory pluginFactory;
    final SimpleClassPluginFactory scpf = new SimpleClassPluginFactory();

    // Configuration of plugin factory components
    pluginFactory = scpf;

    // IDL Loader Chain
    final IDLLoader idlLoader = IDLLoaderChainFactory.newLoader(errorManager, idlLocator,
        inputResourceLocator, pluginFactory).loader;

    return newLoader(errorManager, inputResourceLocator, adlLocator, idlLocator, idlLoader,
        pluginFactory);
  }

  public static Loader newLoader(final ErrorManager errorManager,
      final BasicInputResourceLocator inputResourceLocator,
      final ADLLocator adlLocator, final IDLLocator idlLocator,
      final IDLLoader idlLoader,
      final org.objectweb.fractal.adl.Factory pluginFactory) {

    final ImplementationLocator implementationLocator = new BasicImplementationLocator();

    // plugin manager components
    PluginManager pluginManager;
    final JavaPluginManager jpm = new JavaPluginManager();
    jpm.pluginFactoryItf = pluginFactory;
    pluginManager = jpm;

    // node management components
    final STCFNodeMerger stcfNodeMerger = new STCFNodeMerger();
    final XMLNodeFactory xmlNodeFactory = new XMLSTNodeFactoryImpl();
    final STNodeFactoryImpl nodeFactory = new STNodeFactoryImpl();
    final STNodeMergerImpl nodeMerger = new STNodeMergerImpl();

    inputResourceLocator.genericResourceLocators.put(ADL_RESOURCE_KIND,
        adlLocator);
    inputResourceLocator.genericResourceLocators.put(
        ImplementationLocator.IMPLEMENTATION_RESOURCE_KIND,
        implementationLocator);

    // ADL Loader chain components
    Loader adlLoader;
    final ADLParser ap = new ADLParser();
    final AnnotationLoader anl = new AnnotationLoader();
    final ADLLoader al = new ADLLoader();
    final FactoryLoader fl = new FactoryLoader();
    final AnnotationProcessorLoader apl1 = new AnnotationProcessorLoader();
    final ImportCheckerLoader icl = new ImportCheckerLoader();
    final GenericDefinitionLoader gdl = new GenericDefinitionLoader();
    final AnonymousDefinitionLoader adl = new AnonymousDefinitionLoader();
    final SubComponentResolverLoader scrl = new SubComponentResolverLoader();
    final HTMLDocumentationDecorationLoader hddl = new HTMLDocumentationDecorationLoader();
    final ExtendsLoader el = new ExtendsLoader();
    final NoAnySubComponentLoader nascl = new NoAnySubComponentLoader();
    final AnnotationProcessorLoader apl2 = new AnnotationProcessorLoader();
    final AnnotationProcessorLoader apl3 = new AnnotationProcessorLoader();
    final InterfaceSignatureLoader isl = new InterfaceSignatureLoader();
    final CompositeInternalInterfaceLoader ciil = new CompositeInternalInterfaceLoader();
    final MembraneCheckerLoader mcl = new MembraneCheckerLoader();
    final BindingNormalizerLoader bnl = new BindingNormalizerLoader();
    final BindingCheckerLoader bcl = new BindingCheckerLoader();
    final UnboundInterfaceCheckerLoader uicl = new UnboundInterfaceCheckerLoader();
    final ImplementationLoader il = new ImplementationLoader();
    final AnnotationProcessorLoader apl4 = new AnnotationProcessorLoader();
    final BinaryADLLoader bal = new BinaryADLLoader();
    final TemplateInstanceLoader gidl = new TemplateInstanceLoader();
    final CacheLoader cl = new CacheLoader();

    adlLoader = cl;
    cl.clientLoader = gidl;
    gidl.clientLoader = bal;
    bal.clientLoader = apl4;
    apl4.clientLoader = il;
    il.clientLoader = uicl;
    uicl.clientLoader = bcl;
    bcl.clientLoader = bnl;
    bnl.clientLoader = mcl;
    mcl.clientLoader = ciil;
    ciil.clientLoader = isl;
    isl.clientLoader = apl3;
    apl3.clientLoader = apl2;
    apl2.clientLoader = nascl;
    nascl.clientLoader = el;
    el.clientLoader = hddl;
    hddl.clientLoader = scrl;
    scrl.clientLoader = adl;
    adl.clientLoader = gdl;
    gdl.clientLoader = icl;
    icl.clientLoader = apl1;
    apl1.clientLoader = fl;
    fl.clientLoader = al;
    al.clientLoader = anl;
    anl.clientLoader = ap;

    ap.errorManagerItf = errorManager;
    cl.errorManagerItf = errorManager;
    bal.errorManagerItf = errorManager;
    il.errorManagerItf = errorManager;
    uicl.errorManagerItf = errorManager;
    bcl.errorManagerItf = errorManager;
    bnl.errorManagerItf = errorManager;
    mcl.errorManagerItf = errorManager;
    isl.errorManagerItf = errorManager;
    nascl.errorManagerItf = errorManager;
    el.errorManagerItf = errorManager;
    scrl.errorManagerItf = errorManager;
    adl.errorManagerItf = errorManager;
    gdl.errorManagerItf = errorManager;
    al.errorManagerItf = errorManager;

    bal.adlLocatorItf = adlLocator;
    bal.inputResourceLocatorItf = inputResourceLocator;
    fl.nodeFactoryItf = nodeFactory;

    il.implementationLocatorItf = implementationLocator;

    apl1.setPhase(ADLLoaderPhase.AFTER_PARSING.name());
    apl2.setPhase(ADLLoaderPhase.AFTER_EXTENDS.name());
    apl3.setPhase(ADLLoaderPhase.ON_SUB_COMPONENT.name());
    apl4.setPhase(ADLLoaderPhase.AFTER_CHECKING.name());
    apl1.pluginManagerItf = pluginManager;
    apl2.pluginManagerItf = pluginManager;
    apl3.pluginManagerItf = pluginManager;
    apl4.pluginManagerItf = pluginManager;

    anl.annotationCheckerItf = AnnotationChainFactory.newAnnotationChecker();

    el.nodeMergerItf = stcfNodeMerger;
    ap.adlLocatorItf = adlLocator;
    ap.nodeFactoryItf = xmlNodeFactory;
    ciil.nodeFactoryItf = nodeFactory;
    ciil.nodeMergerItf = nodeMerger;

    gidl.nodeFactoryItf = nodeFactory;

    // Interface signature resolver chain
    InterfaceSignatureResolver interfaceSignatureResolver;
    final BasicInterfaceSignatureResolver bisr = new BasicInterfaceSignatureResolver();
    final ImportInterfaceSignatureResolver iisr = new ImportInterfaceSignatureResolver();

    interfaceSignatureResolver = iisr;
    iisr.clientResolverItf = bisr;
    bisr.idlLoaderItf = idlLoader;

    iisr.idlLocatorItf = idlLocator;

    isl.interfaceSignatureResolverItf = interfaceSignatureResolver;

    // Import checker chain
    ImportChecker importChecker;
    final ADLImportChecker aic = new ADLImportChecker();
    final IDLImportChecker iic = new IDLImportChecker();

    importChecker = aic;
    aic.clientCheckerOptItf = iic;
    aic.adlLocatorItf = adlLocator;

    aic.adlLocatorItf = adlLocator;
    iic.idlLocatorItf = idlLocator;

    icl.importCheckerItf = importChecker;

    // binding checker
    final BindingChecker bindingChecker;
    final BasicBindingChecker bbc = new BasicBindingChecker();
    bindingChecker = bbc;
    bcl.bindingCheckerItf = bbc;

    uicl.recursiveLoaderItf = adlLoader;

    // definition reference resolver chain
    final BasicDefinitionReferenceResolver bdrr = new BasicDefinitionReferenceResolver();
    final InputResourcesDefinitionReferenceResolver irdrr = new InputResourcesDefinitionReferenceResolver();
    final ParametricDefinitionReferenceResolver pdrr = new ParametricDefinitionReferenceResolver();
    final GenericDefinitionReferenceResolver gdrr = new GenericDefinitionReferenceResolver();
    final ParametricGenericDefinitionReferenceResolver pgdrr = new ParametricGenericDefinitionReferenceResolver();
    final ImportDefinitionReferenceResolver idrr = new ImportDefinitionReferenceResolver();
    final CachingDefinitionReferenceResolver cdrr = new CachingDefinitionReferenceResolver();

    cdrr.clientResolverItf = idrr;
    idrr.clientResolverItf = pgdrr;
    pgdrr.clientResolverItf = gdrr;
    gdrr.clientResolverItf = pdrr;
    gdrr.recursiveResolverItf = cdrr;
    pdrr.clientResolverItf = irdrr;
    irdrr.clientResolverItf = bdrr;
    bdrr.loaderItf = adlLoader;
    cdrr.loaderItf = adlLoader;

    idrr.adlLocatorItf = adlLocator;
    gdrr.bindingCheckerItf = bindingChecker;

    final NoAnyTypeArgumentDefinitionReferenceResolver natadrr = new NoAnyTypeArgumentDefinitionReferenceResolver();

    natadrr.clientResolverItf = cdrr;
    scrl.definitionReferenceResolverItf = natadrr;

    final ExtendsGenericDefinitionReferenceResolver egdrr = new ExtendsGenericDefinitionReferenceResolver();
    final ExtendsParametricDefinitionReferenceResolver epdrr = new ExtendsParametricDefinitionReferenceResolver();

    egdrr.clientResolverItf = epdrr;
    epdrr.clientResolverItf = cdrr;
    el.definitionReferenceResolverItf = egdrr;
    hddl.definitionReferenceResolverItf = egdrr;

    gdl.definitionReferenceResolverItf = cdrr;

    // template instantiator chain
    final TemplateInstantiatorImpl ti = new TemplateInstantiatorImpl();
    final FactoryTemplateInstantiator fti = new FactoryTemplateInstantiator();
    final ParametricTemplateInstantiator pti = new ParametricTemplateInstantiator();
    final ParametricFactoryTemplateInstantiator pfti = new ParametricFactoryTemplateInstantiator();
    final CachingTemplateInstantiator cti = new CachingTemplateInstantiator();

    cti.clientInstantiatorItf = pfti;
    pfti.clientInstantiatorItf = pti;
    pti.clientInstantiatorItf = fti;
    fti.clientInstantiatorItf = ti;

    cti.definitionCacheItf = cl;
    cti.definitionReferenceResolverItf = cdrr;
    pti.definitionReferenceResolverItf = cdrr;
    fti.definitionReferenceResolverItf = cdrr;
    ti.definitionReferenceResolverItf = cdrr;
    gidl.definitionReferenceResolverItf = cdrr;

    gdrr.templateInstantiatorItf = cti;

    pti.nodeFactoryItf = nodeFactory;
    pti.nodeMergerItf = nodeMerger;
    pfti.nodeFactoryItf = nodeFactory;
    pfti.nodeMergerItf = nodeMerger;

    // anonymous definition resolver chain
    final AnonymousDefinitionExtractorImpl adr = new AnonymousDefinitionExtractorImpl();
    final ImportAnonymousDefinitionExtractor iadr = new ImportAnonymousDefinitionExtractor();
    final GenericAnonymousDefinitionExtractor gadr = new GenericAnonymousDefinitionExtractor();
    final ParametricAnonymousDefinitionExtractor padr = new ParametricAnonymousDefinitionExtractor();

    padr.clientExtractorItf = gadr;
    gadr.clientExtractorItf = iadr;
    iadr.clientExtractorItf = adr;

    adl.anonymousDefinitionExtractorItf = padr;

    adr.nodeFactoryItf = nodeFactory;

    iadr.nodeFactoryItf = nodeFactory;
    iadr.nodeMergerItf = nodeMerger;

    gadr.nodeFactoryItf = nodeFactory;
    gadr.nodeMergerItf = nodeMerger;

    padr.nodeFactoryItf = nodeFactory;
    padr.nodeMergerItf = nodeMerger;

    // configuration of plugin-manager
    try {
      ((BindingController) pluginManager).bindFc(NodeFactory.ITF_NAME,
          nodeFactory);
      ((BindingController) pluginManager).bindFc(NodeMerger.ITF_NAME,
          nodeMerger);
      ((BindingController) pluginManager).bindFc(DefinitionCache.ITF_NAME, cl);
      ((BindingController) pluginManager).bindFc("loader", adlLoader);
      ((BindingController) pluginManager).bindFc(IDLLoader.ITF_NAME, idlLoader);
      ((BindingController) pluginManager).bindFc("template-loader",
          STLoaderFactory.newSTLoader());
    } catch (final Exception e) {
    }

    // additional components
    return adlLoader;
  }

}
