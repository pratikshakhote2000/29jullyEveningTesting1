package cross_browser_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CB_test {
	@Parameters("bName")
  @Test
  public void f(String browserName) throws InterruptedException {
	  WebDriver driver=null;
	  if(browserName.equals("chrome"))
	  {
		  driver= new ChromeDriver();
  
	  }
	  else if (browserName.equals("firefox")) {
		   driver= new FirefoxDriver();

		
	}
	 // WebDriver driver= new ChromeDriver();

	  driver.get("https://www.facebook.com/");
	  Thread.sleep(1000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	  driver.findElement(By.linkText("Create new account")).click();
	  Thread.sleep(4000);

	  driver.findElement(By.name("firstname")).sendKeys("pratikshaa");
	  Thread.sleep(2000);
	  driver.findElement(By.name("lastname")).sendKeys("khote");
	  Thread.sleep(2000);

	  driver.findElement(By.name("reg_email__")).sendKeys("9579815486");


  }
}
