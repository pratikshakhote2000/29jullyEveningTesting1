package xml_data_use;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FbAccountForm_UsingXML_data {
	@Parameters({"fName","lName","MNum"})
  @Test
  public void f(String firstName,String lastname,String mobNum ) throws InterruptedException {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(1000);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	  driver.findElement(By.linkText("Create new account")).click();
	  Thread.sleep(4000);

	  driver.findElement(By.name("firstname")).sendKeys(firstName);
	  Thread.sleep(2000);
	  driver.findElement(By.name("lastname")).sendKeys(lastname);
	  Thread.sleep(2000);

	  driver.findElement(By.name("reg_email__")).sendKeys(mobNum);



  }
}
