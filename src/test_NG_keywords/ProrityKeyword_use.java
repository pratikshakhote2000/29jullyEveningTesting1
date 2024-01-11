package test_NG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProrityKeyword_use {
  @Test
  public void a() {
	  Reporter.log("a method is running", true);
  }
  
  
  @Test(priority = 5)   // this method will run after all method
  public void b() {
	  Reporter.log("b method is running", true);
  }
  @Test
  public void c() {
	  Reporter.log("c method is running", true);
  }
  @Test(priority = -1)   //if we set priority then this method will run first
  public void d() {
	  Reporter.log("d method is running", true);
  }

}
 