package testNG_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullAndNotNull_assertion {
  @Test
  public void f() {
	  
	  
	  String c="hii";
	  String d=null;
	  
	  //Verify C is not null
	  
	  Assert.assertNotNull(c," C is null Tc is failed");
	  
	  
	  
	  //VErify D is null
	  Assert.assertNull(d, "D is not null Tc is failed");
  }
}
