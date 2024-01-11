package javaScriptExecuter_use;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.trivenigroup.com/");
		Thread.sleep(2000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		//downword direction
		jse.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);

		jse.executeScript("window.scrollBy(0,2500)");

		Thread.sleep(2000);
        //upward direction
		jse.executeScript("window.scrollBy(0,-700)");
		Thread.sleep(2000);

	}

}
