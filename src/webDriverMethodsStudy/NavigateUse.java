package webDriverMethodsStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.manage().window().minimize();
		//Thread.sleep(200000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		
		

		


		
		
		
		
		

	}

}
