package test_NG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_count_keyword {
  
  @Test
  public void a() {
	  Reporter.log("a method is running", true);
  }
  
  
  @Test   
  public void b() {
	  Reporter.log("b method is running", true);
  }
  @Test(invocationCount = 3)     //this method will run 3 times
  public void c() {
	  Reporter.log("c method is running", true);
  }
  @Test 
  public void d() {
	  Reporter.log("d method is running", true);
  }

}
