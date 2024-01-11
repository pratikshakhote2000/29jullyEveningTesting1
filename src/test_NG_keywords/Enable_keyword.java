package test_NG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable_keyword {
	@Test(enabled = true)
	public void f() {
		Reporter.log("f method is running", true);

	}

	@Test
	public void a() {
		Reporter.log("a method is running", true);
	}

	@Test(enabled = false) // this keyword is use to disable method..test case will be skipped.. method
							// will not see in cansole only in index html report
	public void b() {
		Reporter.log("b method is running", true);
	}

	@Test
	public void c() {
		Reporter.log("c method is running", true);
	}

	@Test
	public void d() {
		Reporter.log("d method is running", true);
	}

}
