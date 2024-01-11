package testNg_methods;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myclass1 {
  @Test(groups  = "Regression")
  public void a() {
	  Reporter.log("a is running", true);
  }
  @Test(groups = "Sanity")
  public void b() {
	  Reporter.log("a is running", true);
  }
  @Test(groups = "Regression")
  public void c() {
	  Reporter.log("a is running", true);
  }
  @Test(groups ="Regression" )
  public void d() {
	  Reporter.log("a is running", true);
  }

}
