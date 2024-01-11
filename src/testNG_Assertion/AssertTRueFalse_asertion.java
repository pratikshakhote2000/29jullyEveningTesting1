package testNG_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTRueFalse_asertion {
  @Test
  public void f() {
	  
	  
	  boolean a= true;
	  boolean b= false;
	  
	  
	  //Verify a is true
	 // Assert.assertTrue(a, " a value is false Tc is failed");
	  
	  //Verify b is false
	  Assert.assertFalse(b, " b value is true tc is failed");
  }
}
