package testNg_methods;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Exclude_methods {
  @Test
  public void tc_5() {
	  Reporter.log("tc 5 is running", true);
  }
  @Test
  public void tc_6() {
	  Reporter.log("tc 6 is running", true);
  }
  @Test
  public void tc_7() {
	  Reporter.log("tc 7 is running", true);
  }
  @Test
  public void tc_8() {
	  Reporter.log("tc 8 is running", true);
  }

}
