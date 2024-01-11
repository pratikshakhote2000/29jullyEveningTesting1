package popup_study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);

		// we click on main page button
		driver.findElement(By.name("NewWindow")).click();

		// if we direct action on child windows
		// driver.findElement(By.id("the7-search")).sendKeys("hii pattu");

		// by default focus is on mainpage change focus to selenium we need to id
		Set<String> allWindowsId = driver.getWindowHandles();

		Iterator<String> it = allWindowsId.iterator();
		String mainPageID = it.next(); // get main page id
		String childwindowId = it.next();// get child page id
		Thread.sleep(2000);

		System.out.println("main page id is " + mainPageID);
		System.out.println("child page id is " + childwindowId);

		// change focus main page to child window

		driver.switchTo().window(childwindowId);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.id("the7-search")).sendKeys("hii pattu");
		//driver.close(); //using this method we close current child window
		//no such window exception
	driver.findElement(By.xpath("//h1[text()='About me']")).getText();

		// again we work on main page
		Thread.sleep(2000);
		// change focus child page to main page
		driver.switchTo().window(mainPageID);
		Thread.sleep(2000);
		// geting text on main page
		WebElement mainPageText2 = driver.findElement(By.xpath("//b[text()='[Dummy Controls]']"));
		System.out.println("main page text is " + mainPageText2.getText());
	}

}
