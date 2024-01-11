package javaScriptExecuter_use;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.trivenigroup.com/");
		Thread.sleep(2000);
		
		WebElement joinUstext = driver.findElement(By.xpath("//h4[text()='Join Us']"));
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].scrollIntoView();",joinUstext);
		Thread.sleep(2000);


		driver.findElement(By.xpath("//h4[text()='Join Us']")).getText();
		System.out.println(driver.findElement(By.xpath("//h4[text()='Join Us']")).getText());


	}

}
