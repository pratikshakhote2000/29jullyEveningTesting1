package commonlyUseMethods_study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIUsing_commonlyMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.trivenigroup.com/");

	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Test3_Wait.ImplicitWait(driver, 5);
		WebElement joinUs = driver.findElement(By.xpath("//h4[text()='Join Us']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Test2_scrolling.ScrollintoView(driver, joinUs);

	}

}
