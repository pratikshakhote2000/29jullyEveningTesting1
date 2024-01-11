package testNG_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_equalsAndnotEqual {
  @Test
  public void f() {
	  
	  String a="pattu";
	  String b="pattu";
	  String c="sujju";
	  
	  //it is use to compare two value
	  
	  //TC= Verify a and b are equal
	// Assert.assertEquals(a, b , " A and B value is not matching Tc will be fail");
	 
	 
	  
	  // verify B and C not equal
	 Assert.assertNotSame(b, c,"B and C value is matching Tc will failed ");
  }
}
