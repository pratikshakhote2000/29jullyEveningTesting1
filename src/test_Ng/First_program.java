package test_Ng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class First_program {
  @Test
  public void f() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
  }
}
