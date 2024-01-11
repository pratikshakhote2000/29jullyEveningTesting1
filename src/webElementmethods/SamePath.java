package webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamePath {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		//driver.findElement(By.xpath("//h2[contains(text( )='Facebook helps ')]")).click();
		
	//	driver.findElement(By.xpath("//input[@type='text']").s
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pune");
	}

}
