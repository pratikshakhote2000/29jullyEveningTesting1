package test_Ng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test_ngEx_2 {
  @Test
  public void f() {
	  
	  System.out.println("hii this is printing statment");
	  Reporter.log("Hii this is Reporter log without boolean");//this will not showing in consoleReporter.log("Hii this is Repoter log with boolena", true);//if we give parameter as a true so it will show in console
  }
  
  
  
}
