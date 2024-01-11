package testNG_Assertion;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_use {
  @Test
  public void f() {
	  
	  
	  String s="bye";
	  String p="hii";
	  
	  
	  Assert.assertEquals(s,p, "s and p is not equal tc will fail");  //this validation is fail next validation will not execute 
	  Assert.assertNull(p, "p is not null Tc will fail");
	 
	  //our excution will reach out on next method
  }
  @Test
  public void p() {
	  
	  
	  boolean s=true;
	  boolean p=false;
	  
	  Assert.assertTrue(s, " s is false tc will fail");
	  

  }
}
