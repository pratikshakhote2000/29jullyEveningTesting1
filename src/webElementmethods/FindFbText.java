package webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindFbText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("khote");
		

	}

}
