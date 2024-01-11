package popup_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivPop_ex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);

        //popup handle
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("watch");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
