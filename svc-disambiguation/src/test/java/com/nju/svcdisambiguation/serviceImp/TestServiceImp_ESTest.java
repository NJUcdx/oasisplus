/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 31 13:28:11 GMT 2020
 */

package com.nju.svcdisambiguation.serviceImp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.nju.svcdisambiguation.dataMapper.acm.ACMMapper;
import com.nju.svcdisambiguation.dataMapper.ieee.IEEEMapper;
import com.nju.svcdisambiguation.serviceImp.TestServiceImp;
import com.nju.svcdisambiguation.vo.ResponseVO;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class TestServiceImp_ESTest extends TestServiceImp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IEEEMapper iEEEMapper0 = mock(IEEEMapper.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(iEEEMapper0).selectEmp();
      ACMMapper aCMMapper0 = mock(ACMMapper.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(aCMMapper0).selectEmp();
      TestServiceImp testServiceImp0 = new TestServiceImp(iEEEMapper0, aCMMapper0);
      ResponseVO responseVO0 = testServiceImp0.getEmpName();
      assertNull(responseVO0.getMessage());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ACMMapper aCMMapper0 = mock(ACMMapper.class, new ViolatedAssumptionAnswer());
      TestServiceImp testServiceImp0 = new TestServiceImp((IEEEMapper) null, aCMMapper0);
      // Undeclared exception!
      try { 
        testServiceImp0.getEmpName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.TestServiceImp", e);
      }
  }
}
