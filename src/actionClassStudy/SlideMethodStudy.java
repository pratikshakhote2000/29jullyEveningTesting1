package actionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlideMethodStudy {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://testautomationpractice.blogspot.com/");

			Thread.sleep(1000);

			
			WebElement slider = driver.findElement(By.id("slider"));
			
			Actions act=new Actions(driver);
			
			act.moveToElement(slider).dragAndDropBy(slider, 30, 0).build().perform();
	}

}
