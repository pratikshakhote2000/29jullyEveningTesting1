package test_NG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MixAllKeyword {
	@Test(dependsOnMethods = { "q" })
	public void m() {
		Reporter.log("m is running", true);
	}

	@Test(invocationCount = 2)
	public void n() {
		Reporter.log("n is running", true);
	}

	@Test//(enabled = false)
	public void o() {
		Reporter.log("o is running", true);
	}

	@Test // (timeOut = 3000)
	public void p() throws InterruptedException {
		// Thread.sleep(4000);
		Reporter.log("p is running", true);
	}

	@Test
	public void q() {
		Reporter.log("q is running", true);
	}

}
