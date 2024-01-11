package commonlyUseMethods_study;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commonlymethod_screenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.trivenigroup.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Test1_use.takesScreenshot(driver, "psk");


	}

}
