package data_provider_use;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FB_AccoountForm {
  @Test(dataProvider = "FBregression",dataProviderClass = Fb_Data_provider.class)
  public void FbDataSet(String firstName,String lastName,String MobNum ) throws InterruptedException {
	  
	  
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(1000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	  driver.findElement(By.linkText("Create new account")).click();
	  Thread.sleep(4000);

	  driver.findElement(By.name("firstname")).sendKeys(firstName);
	  Thread.sleep(2000);
	  driver.findElement(By.name("lastname")).sendKeys(lastName);
	  Thread.sleep(2000);

	  driver.findElement(By.name("reg_email__")).sendKeys(MobNum);

  }
}
