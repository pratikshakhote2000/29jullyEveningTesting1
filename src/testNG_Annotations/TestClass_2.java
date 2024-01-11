package testNG_Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass_2 {
	@Test
	public void Tc_03() {
		Reporter.log("Tc_03 is running", true);

	}

	@Test
	public void TC_04() {

		Reporter.log("Tc_04 is running", true);
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
