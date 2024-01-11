package testNG_Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Use {
  @Test
  public void f() {
	  
	  String a="pattu";
	  String b="sujju";
	  
	  SoftAssert s1 =new SoftAssert();
	  s1.assertEquals(a, b," a and b are not equal test case will fail");
	  s1.assertNull(a, "a is null test case will fail");
	  s1.assertAll();   // if we forgot to written this method test ng will pass all test cases 
  }
  @Test
  public void m() 
  {
	  
	  String a=null;
	  SoftAssert s2 =new SoftAssert();
	  s2.assertNull(a, "a is not null tc will fail");
	  s2.assertAll();
 
	  
  }
  }
  

