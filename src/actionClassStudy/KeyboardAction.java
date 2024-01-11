package actionClassStudy;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		Thread.sleep(1000);

      driver.findElement(By.linkText("Create new account")).click();
      Thread.sleep(1000);

      
		WebElement day = driver.findElement(By.id("day"));
		Thread.sleep(1000);

		Actions act=new Actions(driver);
		//act.click(day).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
//		act.click(day).sendKeys(Keys.ARROW_DOWN).build().perform();
//		Thread.sleep(500);
//
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(500);
//
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(500);
//
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//		Thread.sleep(500);
//
//		act.sendKeys(Keys.ENTER).perform();
//		
//		//we reverse 
//		act.click(day).perform();
//			for (int i = 0; i <=15 ;i++) {
//				act.sendKeys(Keys.ARROW_UP).perform();
//				Thread.sleep(1000);
//				
//			}
			act.sendKeys(Keys.ENTER).perform();
			
			WebElement firstname = driver.findElement(By.name("firstname"));
			//act.sendKeys(firstname, "PRATIKSHA").perform();
			
			act.keyDown(firstname, Keys.SHIFT).sendKeys("pratiksha").build().perform();
		//	act.sendKeys(firstname, Keys.SHIFT).sendKeys("P").keyUp(Keys.SHIFT).sendKeys("ratiksha").build().perform();
		//act.keyDown(firstname, Keys.SHIFT).sendKeys("P").keyUp(Keys.SHIFT).sendKeys("ratiksha").build().perform();
	}

	}
                 

