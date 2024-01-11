package webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h1[contains( text( ),'India's No. 1 ')]")).click();
		
		
	}
	}//h1[contains( text( ),'India's No. 1 ')]