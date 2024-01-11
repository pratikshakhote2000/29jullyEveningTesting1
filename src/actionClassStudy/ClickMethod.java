package actionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		Thread.sleep(1000);

		// 1.we have to find locator where we perform action and store in one refreence
		// variable
		WebElement loginButton = driver.findElement(By.name("login"));

		// 2.create object of actions class and pass driver as a parameter
		Actions act = new Actions(driver);
		Thread.sleep(1000);

		// using object call methods

		// there is two way to perform click action
		act.moveToElement(loginButton).click().build().perform();
		// move to element method is use to move cursor random location to target
		// location
		// build method is use to combine all method together
		// perform method use to perform action on that element
		act.click(loginButton).perform();
	}

}
