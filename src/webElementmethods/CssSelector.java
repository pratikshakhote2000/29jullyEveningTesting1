package webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		// Tag and class
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("pratikshakhote111");
		// tag and id
		driver.findElement(By.cssSelector("input#pass")).sendKeys("7jun2000");

		// tag and attribute
		driver.findElement(By.cssSelector("button[name=login]")).click();
		driver.findElement(By.cssSelector("input[type=text")).sendKeys("kolpesujit3232@gmail.com");
		driver.findElement(By.cssSelector("input[name=pass")).sendKeys("9579815486");
		// driver.findElement(By.xpath("")
		driver.findElement(By.cssSelector("a._97w4")).click();

	}

}
