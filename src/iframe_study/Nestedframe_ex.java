package iframe_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Nestedframe_ex {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		Thread.sleep(500);

		String mainpagetext = driver.findElement(By.xpath("//h1[contains(text(),'Frames Examples ')]")).getText();

		System.out.println("text on main page is " + mainpagetext);

		// switch focus main page to outer frame

		driver.switchTo().frame("frame1"); // change focus main page to outer frame

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("practice on selenium");
		Thread.sleep(1000);

		// switch focus outer frame to inner frame
		driver.switchTo().frame("frame3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		//clearing text from  frame1(parent frame)
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type='text']")).clear();

		// switch to focus inner frame to main frame
		driver.switchTo().defaultContent();
		String mainpagetext2 = driver.findElement(By.xpath("//span[text( )='Not a Friendly Topic']")).getText();
		System.out.println("text on main page is " + mainpagetext2);
		// switch to focus main page to second frame
		driver.switchTo().frame("frame2");

		// driver.findElement(By.id("frame2"));

		WebElement animaldropdownframe2 = driver.findElement(By.id("animals"));

		Select s = new Select(animaldropdownframe2);
		s.selectByIndex(2);

	}

}
