/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 29 11:11:00 GMT 2020
 */

package com.nju.svcrecommend.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.nju.svcrecommend.controller.SLRController;
import com.nju.svcrecommend.dataMapper.acm.ACMSLRMapper;
import com.nju.svcrecommend.dataMapper.ieee.IEEESLRMapper;
import com.nju.svcrecommend.serviceImp.SLRSvcImp;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class SLRController_ESTest extends SLRController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ACMSLRMapper aCMSLRMapper0 = mock(ACMSLRMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(aCMSLRMapper0).selectPaperVOsByKeyword(anyString() , anyInt() , anyInt());
      IEEESLRMapper iEEESLRMapper0 = mock(IEEESLRMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(iEEESLRMapper0).selectPaperVOsByKeyword(anyString() , anyInt() , anyInt());
      SLRSvcImp sLRSvcImp0 = new SLRSvcImp(aCMSLRMapper0, iEEESLRMapper0);
      SLRController sLRController0 = new SLRController(sLRSvcImp0);
      // Undeclared exception!
      try { 
        sLRController0.getSLRRecommend("6_;U'`YzU3WR.5", 1590, 0, 1, 1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcrecommend.serviceImp.SLRSvcImp", e);
      }
  }
}
