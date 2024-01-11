package webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUtube {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("tere vaaste");
		
		driver.findElement(By.xpath("//buttont[@id='search-icon-legacy']")).click();
		
	

	}

}
