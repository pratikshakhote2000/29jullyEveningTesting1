package testNG_Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeAndAfterClass {

	@BeforeClass
	public void beforeClass() {
		Reporter.log("open browser", true);
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("logIn successfully", true);

	}

	@Test
	public void Tc_02() {
		Reporter.log("Tc_02 is running", true);

	}
	@Test
	public void Tc_03() {
		Reporter.log("Tc_03 is running", true);

	}


	@AfterMethod
	public void afterMethod() {
		Reporter.log("logOut is done", true);

	}

	@AfterClass
	public void afterClass() {
		Reporter.log("close browser", true);

	}

}
