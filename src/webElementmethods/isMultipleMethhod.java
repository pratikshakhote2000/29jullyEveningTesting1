package webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isMultipleMethhod {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
Thread.sleep(2000);

 boolean result = driver.findElement(By.name("show-hide")).isDisplayed();
 System.out.println("displayed status is "+result);
 
 driver.findElement(By.name("show-hide")).sendKeys("hii gud morning");
 Thread.sleep(1000);

 driver.findElement(By.id("hide-textbox")).click();
	}

}
