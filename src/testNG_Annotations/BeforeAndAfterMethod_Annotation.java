package testNG_Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class BeforeAndAfterMethod_Annotation {
	
	@BeforeMethod
	  public void logIn() {
		Reporter.log("log in successed", true);
		
		
	  }

  @Test
  public void TC_1() {
		Reporter.log("Tc1 is running", true);

	  
  }

  @AfterMethod
  public void logOut() {
	  
		Reporter.log("logOut will done", true);

  }

}
