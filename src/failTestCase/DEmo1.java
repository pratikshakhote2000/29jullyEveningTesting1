package failTestCase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DEmo1 {
  @Test
  public void Test_1() {
	  Reporter.log("Test 1 is running", true);
  }
  @Test
  public void Test_2() {
	//  Assert.fail();
	  Reporter.log("Test 2 is running", true);
  }
  @Test
  public void Test_3() {
	  Assert.fail();

	  Reporter.log("Test 3 is running", true);
  }
  @Test
  public void Test_4() {
	  //Assert.fail();

	  Reporter.log("Test 4 is running", true);
  }
  @Test
  public void Test_5() {
	  Reporter.log("Test 5 is running", true);
  }

}
