/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 28 09:09:34 GMT 2020
 */

package com.nju.svcrecommend.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import com.nju.svcrecommend.domain.AuthorVO;
import com.nju.svcrecommend.domain.PaperVO;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class PaperVO_ESTest extends PaperVO_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PaperVO paperVO0 = new PaperVO();
      paperVO0.setYear(19);
      int int0 = paperVO0.getYear();
      assertEquals(19, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PaperVO paperVO0 = new PaperVO();
      paperVO0.setYear((-3757));
      int int0 = paperVO0.getYear();
      assertEquals((-3757), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PaperVO paperVO0 = new PaperVO();
      paperVO0.setTitle("com.nju.svcrecommend.domain.PaperVO");
      String string0 = paperVO0.getTitle();
      assertEquals("com.nju.svcrecommend.domain.PaperVO", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayList<AuthorVO> arrayList0 = new ArrayList<AuthorVO>();
      PaperVO paperVO0 = new PaperVO(0, "", "", "", "", 0, 2167, arrayList0, "");
      paperVO0.getTitle();
      assertEquals(2167, paperVO0.getCitations());
      assertEquals(0, paperVO0.getDocId());
      assertEquals(0, paperVO0.getYear());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PaperVO paperVO0 = new PaperVO();
      paperVO0.setPublication("b4`pV}<>}Zt\"");
      String string0 = paperVO0.getPublication();
      assertEquals("b4`pV}<>}Zt\"", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PaperVO paperVO0 = new PaperVO();
      paperVO0.setKeywords("s'wsSlc}");
      String string0 = paperVO0.getKeywords();
      assertEquals("s'wsSlc}", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayList<AuthorVO> arrayList0 = new ArrayList<AuthorVO>();
      PaperVO paperVO0 = new PaperVO(0, "", "", "", "", 0, 2167, arrayList0, "");
      paperVO0.setDocId(1925);
      int int0 = paperVO0.getDocId();
      assertEquals(1925, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PaperVO paperVO0 = new PaperVO();
      paperVO0.setDocId((-538));
      int int0 = paperVO0.getDocId();
      assertEquals((-538), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayList<AuthorVO> arrayList0 = new ArrayList<AuthorVO>();
      PaperVO paperVO0 = new PaperVO((-1098), "com.nju.svcrecommend.domain.AuthorVO", "com.nju.svcrecommend.domain.AuthorVO", "", "", 918, (-1098), arrayList0, "A~3lrAvcxJI[gc2(");
      String string0 = paperVO0.getDb();
      assertEquals("com.nju.svcrecommend.domain.AuthorVO", paperVO0.getTitle());
      assertEquals("", paperVO0.getPublication());
      assertEquals(918, paperVO0.getYear());
      assertEquals((-1098), paperVO0.getDocId());
      assertEquals("", paperVO0.getAbs());
      assertEquals((-1098), paperVO0.getCitations());
      assertEquals("com.nju.svcrecommend.domain.AuthorVO", string0);
      assertEquals("A~3lrAvcxJI[gc2(", paperVO0.getKeywords());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PaperVO paperVO0 = new PaperVO(1069, "", "", "", "SgG|GLO", 1069, 1069, (ArrayList<AuthorVO>) null, (String) null);
      int int0 = paperVO0.getCitations();
      assertEquals("", paperVO0.getAbs());
      assertEquals(1069, paperVO0.getYear());
      assertEquals("", paperVO0.getDb());
      assertEquals("", paperVO0.getTitle());
      assertEquals(1069, paperVO0.getDocId());
      assertEquals("SgG|GLO", paperVO0.getPublication());
      assertEquals(1069, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayList<AuthorVO> arrayList0 = new ArrayList<AuthorVO>();
      PaperVO paperVO0 = new PaperVO((-1098), "com.nju.svcrecommend.domain.AuthorVO", "com.nju.svcrecommend.domain.AuthorVO", "", "", 918, (-1098), arrayList0, "A~3lrAvcxJI[gc2(");
      int int0 = paperVO0.getCitations();
      assertEquals((-1098), paperVO0.getDocId());
      assertEquals(918, paperVO0.getYear());
      assertEquals("", paperVO0.getPublication());
      assertEquals((-1098), int0);
      assertEquals("", paperVO0.getAbs());
      assertEquals("com.nju.svcrecommend.domain.AuthorVO", paperVO0.getDb());
      assertEquals("com.nju.svcrecommend.domain.AuthorVO", paperVO0.getTitle());
      assertEquals("A~3lrAvcxJI[gc2(", paperVO0.getKeywords());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PaperVO paperVO0 = new PaperVO();
      ArrayList<AuthorVO> arrayList0 = paperVO0.getAuthors();
      assertNull(arrayList0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArrayList<AuthorVO> arrayList0 = new ArrayList<AuthorVO>();
      PaperVO paperVO0 = new PaperVO((-1098), "com.nju.svcrecommend.domain.AuthorVO", "com.nju.svcrecommend.domain.AuthorVO", "", "", 918, (-1098), arrayList0, "A~3lrAvcxJI[gc2(");
      AuthorVO authorVO0 = new AuthorVO();
      arrayList0.add(authorVO0);
      paperVO0.getAuthors();
      assertEquals("A~3lrAvcxJI[gc2(", paperVO0.getKeywords());
      assertEquals("", paperVO0.getAbs());
      assertEquals("", paperVO0.getPublication());
      assertEquals(918, paperVO0.getYear());
      assertEquals((-1098), paperVO0.getDocId());
      assertEquals((-1098), paperVO0.getCitations());
      assertEquals("com.nju.svcrecommend.domain.AuthorVO", paperVO0.getDb());
      assertEquals("com.nju.svcrecommend.domain.AuthorVO", paperVO0.getTitle());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArrayList<AuthorVO> arrayList0 = new ArrayList<AuthorVO>();
      PaperVO paperVO0 = new PaperVO(0, "", "", "", "", 0, 2167, arrayList0, "");
      paperVO0.setAbs("/39,sDvEyJ");
      paperVO0.getAbs();
      assertEquals(2167, paperVO0.getCitations());
      assertEquals(0, paperVO0.getDocId());
      assertEquals(0, paperVO0.getYear());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PaperVO paperVO0 = new PaperVO();
      String string0 = paperVO0.getKeywords();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PaperVO paperVO0 = new PaperVO();
      String string0 = paperVO0.getPublication();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PaperVO paperVO0 = new PaperVO();
      paperVO0.setDb("");
      String string0 = paperVO0.getDb();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PaperVO paperVO0 = new PaperVO();
      String string0 = paperVO0.getDb();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PaperVO paperVO0 = new PaperVO();
      int int0 = paperVO0.getYear();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PaperVO paperVO0 = new PaperVO();
      ArrayList<AuthorVO> arrayList0 = new ArrayList<AuthorVO>();
      paperVO0.setAuthors(arrayList0);
      assertEquals(0, paperVO0.getYear());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PaperVO paperVO0 = new PaperVO();
      paperVO0.setKeywords("");
      String string0 = paperVO0.getKeywords();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PaperVO paperVO0 = new PaperVO();
      String string0 = paperVO0.getTitle();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ArrayList<AuthorVO> arrayList0 = new ArrayList<AuthorVO>();
      PaperVO paperVO0 = new PaperVO(0, "", "", "", "", 0, 0, arrayList0, "");
      paperVO0.setCitations((-1317));
      assertEquals((-1317), paperVO0.getCitations());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ArrayList<AuthorVO> arrayList0 = new ArrayList<AuthorVO>();
      PaperVO paperVO0 = new PaperVO(0, "", "", "", "", 0, 0, arrayList0, "");
      int int0 = paperVO0.getDocId();
      assertEquals(0, paperVO0.getYear());
      assertEquals(0, paperVO0.getCitations());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PaperVO paperVO0 = new PaperVO();
      paperVO0.setAbs("");
      String string0 = paperVO0.getAbs();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PaperVO paperVO0 = new PaperVO();
      String string0 = paperVO0.getAbs();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PaperVO paperVO0 = new PaperVO();
      int int0 = paperVO0.getCitations();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ArrayList<AuthorVO> arrayList0 = new ArrayList<AuthorVO>();
      PaperVO paperVO0 = new PaperVO(0, "", "", "", "", 0, 0, arrayList0, "");
      paperVO0.getAuthors();
      assertEquals(0, paperVO0.getDocId());
      assertEquals(0, paperVO0.getCitations());
      assertEquals(0, paperVO0.getYear());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PaperVO paperVO0 = new PaperVO();
      paperVO0.setPublication("");
      String string0 = paperVO0.getPublication();
      assertEquals("", string0);
  }
}
