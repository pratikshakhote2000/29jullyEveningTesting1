package test_Ng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exam_3 {
	
  @Test
  public void fbLaunch() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
  }
  
  @Test
  public void instaLaunch() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.instagram.com/");
  }

  
  @Test
  public void Launch() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://twitter.com/");
  }

}
