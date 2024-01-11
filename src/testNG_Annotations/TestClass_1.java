package testNG_Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestClass_1 {
  @Test
  public void TC_01() {
	  
	  Reporter.log("Tc_01 is running", true);
  }
  
  @Test
  public void TC_02() {
	  
	  Reporter.log("Tc_02 is running", true);
  }

  
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("before method is running", true);

  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("after method is running", true);

  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("before class is running", true);

  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("after class is running", true);

  }

}
