package actionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ScrollMethodStudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		Thread.sleep(1000);

		
		WebElement sunday = driver.findElement(By.id("sunday"));
		WebElement monday = driver.findElement(By.id("monday"));
		WebElement tuesday = driver.findElement(By.id("tuesday"));
		
		WebElement wed = driver.findElement(By.id("wednesday"));
		
		WebElement dropdown = driver.findElement(By.id("country"));
				Select s=new Select(dropdown);
				
				s.selectByValue("usa");
		
		 Actions act=new Actions(driver);
		 
		 //act.scrollToElement(sunday).perform();
			Thread.sleep(1000);
			act.scrollToElement(dropdown);
			

		sunday.click();
		Thread.sleep(1000);

		monday.click();
		Thread.sleep(1000);

		tuesday.click();
		Thread.sleep(1000);

		wed.click();
		
	}

}
