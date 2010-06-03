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

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.ow2.mind.compilation.CompilerContextHelper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynloadTest extends AbstractFunctionalTest {

  protected CompilerRunner dynloadRunner;
  protected File           tester;

  @Override
  @BeforeMethod(alwaysRun = true)
  protected void setup() throws Exception {
    // this test is not supported on windows.
    if (isRunningOnWindows()) return;

    super.setup();
    initSourcePath(runner, "common", "functional", "dynload");

    dynloadRunner = new CompilerRunner();
    final List<String> cFlags = new ArrayList<String>(
        CompilerContextHelper.getCFlags(dynloadRunner.context));
    cFlags.add("-fpic");
    CompilerContextHelper.setCFlags(dynloadRunner.context, cFlags);

    final List<String> ldFlags = new ArrayList<String>(
        CompilerContextHelper.getLDFlags(dynloadRunner.context));
    ldFlags.add("--shared");
    CompilerContextHelper.setLDFlags(dynloadRunner.context, ldFlags);
    initSourcePath(dynloadRunner, "common", "functional", "dynload");

    tester = new File(runner.buildDir, "dynloadTester");
    if (!tester.exists()) {
      tester = runner.compile("GenericApplication<DynloadTester>",
          "dynloadTester");
    }

  }

  @Test(groups = {"functional"})
  public void testPrimitiveSingleton() throws Exception {
    // this test is not supported on windows.
    if (isRunningOnWindows()) return;

    runTester(dynloadRunner.compile("EmptySingletonPrimitive"), false, false,
        false);
  }

  @Test(groups = {"functional"})
  public void testPrimitiveMulti() throws Exception {
    // this test is not supported on windows.
    if (isRunningOnWindows()) return;

    runTester(dynloadRunner.compile("EmptyMultiPrimitive"), false, false, false);
  }

  @Test(groups = {"functional"})
  public void testControlledPrimitiveSingleton() throws Exception {
    // this test is not supported on windows.
    if (isRunningOnWindows()) return;

    runTester(dynloadRunner.compile("EmptyControlledSingletonPrimitive"), true,
        false, false);
  }

  @Test(groups = {"functional"})
  public void testControlledPrimitiveMulti() throws Exception {
    // this test is not supported on windows.
    if (isRunningOnWindows()) return;

    runTester(dynloadRunner.compile("EmptyControlledMultiPrimitive"), true,
        false, false);
  }

  @Test(groups = {"functional"})
  public void testFactoryPrimitiveMulti() throws Exception {
    // this test is not supported on windows.
    if (isRunningOnWindows()) return;

    runTester(dynloadRunner.compile("Factory<EmptyMultiPrimitive>"), false,
        true, false);
  }

  @Test(groups = {"functional"})
  public void testFactoryControlledPrimitiveMulti() throws Exception {
    // this test is not supported on windows.
    if (isRunningOnWindows()) return;

    runTester(dynloadRunner.compile("Factory<EmptyControlledMultiPrimitive>"),
        false, true, true);
  }

  @Test(groups = {"functional"})
  public void testControlledFactoryPrimitiveMulti() throws Exception {
    // this test is not supported on windows.
    if (isRunningOnWindows()) return;

    runTester(dynloadRunner.compile("FactoryWithCtrl<EmptyMultiPrimitive>"),
        true, true, false);
  }

  @Test(groups = {"functional"})
  public void testControlledFactoryControlledPrimitiveMulti() throws Exception {
    // this test is not supported on windows.
    if (isRunningOnWindows()) return;

    runTester(
        dynloadRunner.compile("FactoryWithCtrl<EmptyControlledMultiPrimitive>"),
        true, true, true);
  }

  protected void runTester(final File lib, final boolean controlled,
      final boolean factory, final boolean factoryOfControlled)
      throws Exception {
    final List<String> params = new ArrayList<String>();
    if (controlled) params.add("--controlled");
    if (factory) params.add("--factory");
    if (factoryOfControlled) params.add("--factoryOfControlled");
    params.add(lib.getAbsolutePath());
    assertEquals(runner.run(tester, params.toArray(new String[0])), 0,
        "Invalid return value for tester.");
  }
}
