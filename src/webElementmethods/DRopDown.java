package webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DRopDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jainmilap.com/registration");
		Thread.sleep(1000);
		WebElement MotherTongue = driver.findElement(By.id("mother_tongue"));
		Select s = new Select(MotherTongue);
		s.selectByValue("Marathi");
		
		

	}

}
