
package org.ow2.mind.adl.annotations;

import static org.objectweb.fractal.adl.NodeUtil.castNodeError;
import static org.ow2.mind.BCImplChecker.checkBCImplementation;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import java.util.Collection;
import java.util.HashMap;

import org.objectweb.fractal.adl.ADLException;
import org.objectweb.fractal.adl.Definition;
import org.objectweb.fractal.adl.Loader;
import org.objectweb.fractal.adl.error.Error;
import org.ow2.mind.BasicInputResourceLocator;
import org.ow2.mind.adl.ADLLocator;
import org.ow2.mind.adl.ErrorLoader;
import org.ow2.mind.adl.Factory;
import org.ow2.mind.adl.annotation.AnnotationLoader;
import org.ow2.mind.adl.ast.ImplementationContainer;
import org.ow2.mind.adl.ast.Source;
import org.ow2.mind.adl.implementation.ImplementationLocator;
import org.ow2.mind.annotation.AnnotationErrors;
import org.ow2.mind.annotation.AnnotationHelper;
import org.ow2.mind.annotation.BasicPathLocator;
import org.ow2.mind.error.ErrorCollection;
import org.ow2.mind.error.ErrorManager;
import org.ow2.mind.error.ErrorManagerFactory;
import org.ow2.mind.idl.IDLLoaderChainFactory;
import org.ow2.mind.idl.IDLLoaderChainFactory.IDLFrontend;
import org.ow2.mind.idl.IDLLocator;
import org.ow2.mind.plugin.SimpleClassPluginFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAnnotations {
  private Loader loader;

  @BeforeMethod(alwaysRun = true)
  public void setUp() {
    final ErrorManager errorManager = ErrorManagerFactory
        .newSimpleErrorManager();

    // input locators
    final BasicInputResourceLocator inputResourceLocator = new BasicInputResourceLocator();
    final BasicPathLocator pathLocator = new BasicPathLocator();
    final IDLLocator idlLocator = IDLLoaderChainFactory
        .newIDLLocator(inputResourceLocator);
    final ADLLocator adlLocator = Factory.newADLLocator(inputResourceLocator);
    final ImplementationLocator implementationLocator = Factory
        .newImplementationLocator(inputResourceLocator);

    // Plugin Manager Components
    final org.objectweb.fractal.adl.Factory pluginFactory = new SimpleClassPluginFactory();

    // loader chains
    final IDLFrontend idlFrontend = IDLLoaderChainFactory.newLoader(
        errorManager, idlLocator, inputResourceLocator, pluginFactory);
    final Loader adlLoader = Factory.newLoader(errorManager,
        inputResourceLocator, pathLocator, adlLocator, idlLocator,
        implementationLocator, idlFrontend.cache, idlFrontend.loader,
        idlFrontend.includeResolver, pluginFactory);
    final ErrorLoader errorLoader = new ErrorLoader();
    errorLoader.clientLoader = adlLoader;
    errorLoader.errorManagerItf = errorManager;
    loader = errorLoader;
  }

  @Test(groups = {"functional", "checkin"})
  public void testAnnotationLoaderBC() throws Exception {
    checkBCImplementation(new AnnotationLoader());
  }

  @Test(groups = {"functional"})
  public void test1() throws Exception {
    final Definition definition = loader.load("pkg1.annotations.SourceFlag",
        new HashMap<Object, Object>());
    final Source[] sources = castNodeError(definition,
        ImplementationContainer.class).getSources();
    for (final Source source : sources) {
      final Flag flag = AnnotationHelper.getAnnotation(source, Flag.class);
      assertEquals(flag.value, "-DFOO");
    }
  }

  @Test(groups = {"functional"})
  public void test2() throws Exception {
    final Definition definition = loader.load(
        "pkg1.annotations.PathAnnotation1", new HashMap<Object, Object>());
    final Source[] sources = castNodeError(definition,
        ImplementationContainer.class).getSources();
    for (final Source source : sources) {
      final PathAnnotation path = AnnotationHelper.getAnnotation(source,
          PathAnnotation.class);
      assertEquals(path.value, "/tmp/mind.exe");
    }
  }

  @Test(groups = {"functional"})
  public void test3() throws Exception {
    final Definition definition = loader.load(
        "pkg1.annotations.PathAnnotation2", new HashMap<Object, Object>());
    final Source[] sources = castNodeError(definition,
        ImplementationContainer.class).getSources();
    for (final Source source : sources) {
      final PathAnnotation path = AnnotationHelper.getAnnotation(source,
          PathAnnotation.class);
      assertEquals(path.value, "/tmp/mind");
    }
  }

  @Test(groups = {"functional"})
  public void test4() throws Exception {
    final Definition definition = loader.load(
        "pkg1.annotations.PathAnnotation3", new HashMap<Object, Object>());
    final Source[] sources = castNodeError(definition,
        ImplementationContainer.class).getSources();
    for (final Source source : sources) {
      final PathAnnotation path = AnnotationHelper.getAnnotation(source,
          PathAnnotation.class);
      assertEquals(
          path.url.getFile().substring(path.url.getFile().lastIndexOf('/') + 1),
          "foo.c");
    }
  }

  @Test(groups = {"functional"})
  public void test5() throws Exception {
    try {
      loader.load("pkg1.annotations.PathAnnotation4",
          new HashMap<Object, Object>());
    } catch (final ADLException e) {
      assertTrue(e.getError() instanceof ErrorCollection);
      final Collection<Error> errors = ((ErrorCollection) e.getError())
          .getErrors();
      assertEquals(errors.size(), 1);
      final Error err = errors.iterator().next();
      assertSame(err.getTemplate(), AnnotationErrors.INVALID_ANNOTATION);
    }
  }

  @Test(groups = {"functional"})
  public void test6() throws Exception {
    final Definition definition = loader.load(
        "pkg1.annotations.PathAnnotation5", new HashMap<Object, Object>());
    final Source[] sources = castNodeError(definition,
        ImplementationContainer.class).getSources();
    for (final Source source : sources) {
      final PathAnnotation path = AnnotationHelper.getAnnotation(source,
          PathAnnotation.class);
      assertEquals(
          path.url.getFile().substring(path.url.getFile().lastIndexOf('/') + 1),
          "foo.c");
    }
  }

}
