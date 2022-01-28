/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 28 09:00:30 GMT 2020
 */

package com.nju.svcrecommend.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import com.nju.svcrecommend.domain.AuthorVO;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class AuthorVO_ESTest extends AuthorVO_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AuthorVO authorVO0 = new AuthorVO();
      authorVO0.setName("eRxHu/<.xV@qU9@>");
      String string0 = authorVO0.getName();
      assertEquals("eRxHu/<.xV@qU9@>", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AuthorVO authorVO0 = new AuthorVO();
      authorVO0.setName("");
      String string0 = authorVO0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AuthorVO authorVO0 = new AuthorVO();
      String string0 = authorVO0.getInstitution();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AuthorVO authorVO0 = new AuthorVO();
      authorVO0.setId((-1));
      int int0 = authorVO0.getId();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AuthorVO authorVO0 = new AuthorVO();
      String string0 = authorVO0.getDb();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AuthorVO authorVO0 = new AuthorVO(0, "mE86f", "Eqm)B-6Md{kMl", "Eqm)B-6Md{kMl");
      String string0 = authorVO0.getDb();
      assertEquals("mE86f", authorVO0.getName());
      assertEquals("Eqm)B-6Md{kMl", authorVO0.getInstitution());
      assertEquals(0, authorVO0.getId());
      assertEquals("Eqm)B-6Md{kMl", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AuthorVO authorVO0 = new AuthorVO(0, "mE86f", "Eqm)B-6Md{kMl", "Eqm)B-6Md{kMl");
      String string0 = authorVO0.getInstitution();
      assertEquals("Eqm)B-6Md{kMl", string0);
      assertEquals("Eqm)B-6Md{kMl", authorVO0.getDb());
      assertEquals(0, authorVO0.getId());
      assertEquals("mE86f", authorVO0.getName());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AuthorVO authorVO0 = new AuthorVO();
      authorVO0.setId(3394);
      int int0 = authorVO0.getId();
      assertEquals(3394, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AuthorVO authorVO0 = new AuthorVO();
      authorVO0.setDb("");
      String string0 = authorVO0.getDb();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AuthorVO authorVO0 = new AuthorVO();
      int int0 = authorVO0.getId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AuthorVO authorVO0 = new AuthorVO();
      authorVO0.setInstitution("");
      String string0 = authorVO0.getInstitution();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AuthorVO authorVO0 = new AuthorVO();
      String string0 = authorVO0.getName();
      assertNull(string0);
  }
}
