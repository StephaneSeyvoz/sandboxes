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
 * Authors: Matthieu Leclercq
 * Contributors: 
 */

package org.ow2.mind;

import static org.ow2.mind.PathHelper.fullyQualifiedNameToPath;
import static org.ow2.mind.PathHelper.isRelative;
import static org.ow2.mind.compilation.DirectiveHelper.splitOptionString;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.stringtemplate.StringTemplateGroupLoader;
import org.objectweb.fractal.adl.ADLException;
import org.objectweb.fractal.adl.Definition;
import org.objectweb.fractal.adl.Loader;
import org.objectweb.fractal.adl.error.Error;
import org.ow2.mind.adl.ADLBackendFactory;
import org.ow2.mind.adl.ADLLocator;
import org.ow2.mind.adl.DefinitionCompiler;
import org.ow2.mind.adl.DefinitionSourceGenerator;
import org.ow2.mind.adl.Factory;
import org.ow2.mind.adl.GraphCompiler;
import org.ow2.mind.adl.OutputBinaryADLLocator;
import org.ow2.mind.adl.graph.ComponentGraph;
import org.ow2.mind.adl.graph.Instantiator;
import org.ow2.mind.adl.implementation.BasicImplementationLocator;
import org.ow2.mind.adl.implementation.ImplementationLocator;
import org.ow2.mind.annotation.AnnotationLocatorHelper;
import org.ow2.mind.annotation.PredefinedAnnotationsHelper;
import org.ow2.mind.compilation.CompilationCommand;
import org.ow2.mind.compilation.CompilationCommandExecutor;
import org.ow2.mind.compilation.CompilerCommand;
import org.ow2.mind.compilation.CompilerContextHelper;
import org.ow2.mind.compilation.CompilerWrapper;
import org.ow2.mind.compilation.gcc.GccCompilerWrapper;
import org.ow2.mind.error.ErrorCollection;
import org.ow2.mind.error.ErrorManager;
import org.ow2.mind.error.ErrorManagerFactory;
import org.ow2.mind.idl.IDLBackendFactory;
import org.ow2.mind.idl.IDLLoader;
import org.ow2.mind.idl.IDLLoaderChainFactory;
import org.ow2.mind.idl.IDLLoaderChainFactory.IDLFrontend;
import org.ow2.mind.idl.IDLLocator;
import org.ow2.mind.idl.IDLVisitor;
import org.ow2.mind.idl.OutputBinaryIDLLocator;
import org.ow2.mind.io.BasicOutputFileLocator;
import org.ow2.mind.io.OutputFileLocator;
import org.ow2.mind.plugin.BasicPluginManager;
import org.ow2.mind.plugin.PluginManager;
import org.ow2.mind.plugin.SimpleClassPluginFactory;
import org.ow2.mind.preproc.BasicMPPWrapper;
import org.ow2.mind.st.STLoaderFactory;
import org.ow2.mind.st.STNodeFactoryImpl;
import org.testng.Assert;

public class CompilerRunner {

  public static final String        DEFAULT_CFLAGS    = "-g -Wall -Werror -Wredundant-decls -Wunreachable-code -Wstrict-prototypes -Wwrite-strings";
  public static final String        CFLAGS_PROPERTY   = "mind.test.cflags";

  public static final String        COMPILER_PROPERTY = "mind.test.compiler";

  public ErrorManager               errorManager;
  public Loader                     adlLoader;
  public IDLLoader                  idlLoader;

  public Instantiator               graphInstantiator;

  private final OutputFileLocator   outputFileLocator;
  public DefinitionCompiler         definitionCompiler;
  public GraphCompiler              graphCompiler;

  public CompilationCommandExecutor executor;

  final PluginManager               pluginManager;

  public File                       buildDir;
  public Map<Object, Object>        context;

  public CompilerRunner() throws ADLException {
    errorManager = ErrorManagerFactory.newStreamErrorManager();

    // input locators
    final BasicInputResourceLocator inputResourceLocator = new BasicInputResourceLocator();
    final OutputBinaryIDLLocator obil = new OutputBinaryIDLLocator();
    obil.clientLocatorItf = IDLLoaderChainFactory
        .newIDLLocator(inputResourceLocator);
    final IDLLocator idlLocator = obil;
    final ImplementationLocator implementationLocator = new BasicImplementationLocator();

    final OutputBinaryADLLocator obal = new OutputBinaryADLLocator();
    obal.clientLocatorItf = Factory.newADLLocator(inputResourceLocator);
    final ADLLocator adlLocator = obal;

    // NodeFactory Component
    final STNodeFactoryImpl stNodeFactory = new STNodeFactoryImpl();

    // Plugin Manager Components
    final org.objectweb.fractal.adl.Factory pluginFactory = new SimpleClassPluginFactory();
    final BasicPluginManager bpm = new BasicPluginManager();
    bpm.nodeFactoryItf = stNodeFactory;
    pluginManager = bpm;

    outputFileLocator = new BasicOutputFileLocator();
    obal.outputFileLocatorItf = outputFileLocator;
    obil.outputFileLocatorItf = outputFileLocator;

    // compiler wrapper
    final GccCompilerWrapper gcw = new GccCompilerWrapper();
    gcw.outputFileLocatorItf = outputFileLocator;
    final CompilerWrapper compilerWrapper = gcw;
    final BasicMPPWrapper mppWrapper = new BasicMPPWrapper();
    mppWrapper.pluginManagerItf = pluginManager;

    gcw.errorManagerItf = errorManager;
    mppWrapper.errorManagerItf = errorManager;

    // String Template Component Loaders
    final StringTemplateGroupLoader stcLoader = STLoaderFactory.newSTLoader();

    // loader chains
    final IDLFrontend idlFrontend = IDLLoaderChainFactory.newLoader(
        errorManager, idlLocator, inputResourceLocator, pluginFactory);

    idlLoader = idlFrontend.loader;

    adlLoader = Factory.newLoader(errorManager, inputResourceLocator,
        adlLocator, idlLocator, implementationLocator, idlFrontend.cache,
        idlFrontend.loader, pluginFactory);

    // instantiator chain
    graphInstantiator = Factory.newInstantiator(errorManager, adlLoader);

    // Backend
    final IDLVisitor idlCompiler = IDLBackendFactory.newIDLCompiler(idlLoader,
        inputResourceLocator, outputFileLocator, stcLoader);
    final DefinitionSourceGenerator definitionSourceGenerator = ADLBackendFactory
        .newDefinitionSourceGenerator(inputResourceLocator, outputFileLocator,
            implementationLocator, idlLoader, idlCompiler, stcLoader,
            pluginManager, context);
    definitionCompiler = ADLBackendFactory.newDefinitionCompiler(
        definitionSourceGenerator, implementationLocator, outputFileLocator,
        compilerWrapper, mppWrapper);
    graphCompiler = ADLBackendFactory.newGraphCompiler(inputResourceLocator,
        implementationLocator, outputFileLocator, compilerWrapper, mppWrapper,
        definitionCompiler, adlLoader, stcLoader, pluginManager, context);

    // compilation executor
    executor = ADLBackendFactory.newCompilationCommandExecutor(errorManager);

    // init context
    initContext();

  }

  public void initContext() throws ADLException {
    context = new HashMap<Object, Object>();
    buildDir = new File("target/build");
    if (!buildDir.exists()) {
      buildDir.mkdirs();
    }
    context.put(BasicOutputFileLocator.OUTPUT_DIR_CONTEXT_KEY, buildDir);
    AnnotationLocatorHelper.addDefaultAnnotationPackage(
        "org.ow2.mind.adl.annotation.predefined", context);

    final String cFlags = System.getProperty(CFLAGS_PROPERTY, DEFAULT_CFLAGS);
    CompilerContextHelper.setCFlags(context, splitOptionString(cFlags));

    final String compiler = System.getProperty(COMPILER_PROPERTY);
    if (compiler != null) {
      CompilerContextHelper.setCompilerCommand(context, compiler);
      CompilerContextHelper.setLinkerCommand(context, compiler);
    }

    // Add additional predefined annotation packages
    for (final String annotationPackage : PredefinedAnnotationsHelper
        .getPredefinedAnnotations(pluginManager, context)) {
      AnnotationLocatorHelper.addDefaultAnnotationPackage(annotationPackage,
          context);
    }

  }

  public Definition load(final String adlName) throws ADLException {
    errorManager.clear();
    final Definition d = adlLoader.load(adlName, context);
    final List<Error> errors = errorManager.getErrors();
    if (!errors.isEmpty()) {
      throw new ADLException(new ErrorCollection(errors));
    }
    return d;
  }

  public Collection<File> compileDefinition(final String adlName)
      throws ADLException, InterruptedException {
    final Definition d = load(adlName);
    final Collection<CompilationCommand> c = definitionCompiler.visit(d,
        context);
    executor.exec(c, context);
    final List<File> result = new ArrayList<File>();
    for (final CompilationCommand command : c) {
      if (command instanceof CompilerCommand)
        result.addAll(command.getOutputFiles());
    }
    return result;
  }

  public File compile(final String adlName) throws ADLException,
      InterruptedException {
    return compile(adlName, null);
  }

  public File compile(final String adlName, final String executableName)
      throws ADLException, InterruptedException {
    String outputPath;
    if (executableName != null) {
      context.put("executable-name", executableName);
      outputPath = executableName;
      if (isRelative(outputPath)) {
        outputPath = "/" + outputPath;
      }
    } else {
      outputPath = fullyQualifiedNameToPath(adlName, null);
    }
    final File outputFile = outputFileLocator.getCExecutableOutputFile(
        outputPath, context);

    errorManager.clear();
    final Definition d = adlLoader.load(adlName, context);
    List<Error> errors = errorManager.getErrors();
    if (!errors.isEmpty()) {
      throw new ADLException(new ErrorCollection(errors));
    }
    final ComponentGraph componentGraph = graphInstantiator.instantiate(d,
        context);
    errors = errorManager.getErrors();
    if (!errors.isEmpty()) {
      throw new ADLException(new ErrorCollection(errors));
    }

    final Collection<CompilationCommand> commands = graphCompiler.visit(
        componentGraph, context);
    final boolean execOK = executor.exec(commands, context);

    errors = errorManager.getErrors();
    if (!errors.isEmpty()) {
      throw new ADLException(new ErrorCollection(errors));
    }

    assertTrue(
        execOK,
        "Execution of compilation commands returns false, but no error has been logged in error manager ");

    return outputFile;
  }

  public int run(final File executable, final String... params)
      throws Exception {
    final Process p;
    if (params != null && params.length > 0) {
      final List<String> args = new ArrayList<String>(params.length + 1);
      args.add(executable.getAbsolutePath());
      for (final String param : params) {
        args.add(param);
      }
      p = new ProcessBuilder(args).redirectErrorStream(true).start();
    } else {
      p = new ProcessBuilder(executable.getAbsolutePath()).redirectErrorStream(
          true).start();
    }
    final Thread readerThread = new Thread() {
      @Override
      public void run() {
        // output output and error stream on the logger.
        final BufferedReader reader = new BufferedReader(new InputStreamReader(
            p.getInputStream()));
        try {
          String line = reader.readLine();
          while (line != null) {
            System.out.println(line);
            line = reader.readLine();
          }
          reader.close();
        } catch (final IOException e) {
          throw new java.lang.Error("Can't read error stream of process", e);
        }
      }
    };
    readerThread.start();
    final int rValue = p.waitFor();
    readerThread.join();

    return rValue;
  }

  public int compileAndRun(final String adlName, final String executableName,
      final String... params) throws Exception {
    final File executable = compile(adlName, executableName);
    assertNotNull(executable);
    return run(executable, params);
  }

  public void compileRunAndCheck(final String adlName,
      final String executableName, final String... params) throws Exception {
    Assert.assertEquals(compileAndRun(adlName, executableName, params), 0,
        "Unexpected result returned by test");
  }

  public void compileRunAndCheck(final String adlName) throws Exception {
    compileRunAndCheck(adlName, null);
  }

}
