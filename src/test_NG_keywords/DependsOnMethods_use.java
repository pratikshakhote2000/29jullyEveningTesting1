package test_NG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods_use {
  @Test(dependsOnMethods = {"o","p"})
  public void m() {
		Reporter.log("m method is running", true);

  }
  @Test
  public void n() {
		Reporter.log("n method is running", true);

}
  @Test
  public void o() {
		Reporter.log("o method is running", true);

}
  @Test
  public void p() {
		Reporter.log("p method is running", true);

}

}
