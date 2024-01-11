package webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTextREDBUs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("aurangabad");
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("pune");
		
		driver.findElement(By.xpath("//span[text()='Date']")).isSelected();
		
	//	driver.findElement(By.xpath("//span[@class='dateText']")).sendKeys("23/10/2023");
		
		driver.findElement(By.xpath("//button[text()='SEARCH BUSES']")).click();
		
		
		
	}

}
