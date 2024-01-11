package serialANDparallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipcart {
	@Test
	  public void flipcartTest() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	  }
}
