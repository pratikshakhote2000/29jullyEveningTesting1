package testNg_methods;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Include_Methods {
  @Test
  public void tc_1() {
	  Reporter.log("tc 1 is running", false);
  }
  @Test
  public void tc_2() {
	  Reporter.log("tc 2 is running", false);
  }
  @Test
  public void tc_3() {
	  Reporter.log("tc 3 is running", false);
  }
  @Test
  public void tc_4() {
	  Reporter.log("tc 4 is running", false);
  }

}
