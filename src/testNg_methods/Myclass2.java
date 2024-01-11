package testNg_methods;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myclass2 {
  @Test(groups = "Sanity")
  public void e() {
	  Reporter.log("e  tc is running", true);
  }
  @Test(groups = "Regression")
  public void f() {
	  Reporter.log("f  tc is running", true);
  }
  @Test(groups = {"Sanity","Regression"})
  public void g() {
	  Reporter.log("g  tc is running", true);
  }
  @Test(groups = "Sanity")
  public void h() {
	  Reporter.log("h tc is running", true);
  }

}
