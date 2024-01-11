package test_NG_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut_keyword {
  @Test
  public void a() {
	  
	  Reporter.log("a is running", true);
  }
  
  @Test(timeOut =3000 )
  public void b() throws InterruptedException {
	  Thread.sleep(5000);
	  Reporter.log("b is running", true);
  }
  

}
