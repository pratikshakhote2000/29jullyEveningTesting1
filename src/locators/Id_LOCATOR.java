package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_LOCATOR {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pattukhote2000");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pattu2000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.className("_6ltg")).click();

	}

}
