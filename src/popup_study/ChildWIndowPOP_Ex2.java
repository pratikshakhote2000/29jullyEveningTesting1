package popup_study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWIndowPOP_Ex2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);

		// click on main window element
		driver.findElement(By.name("NewTab")).click();
		Thread.sleep(2000);

		Set<String> allWindowsId = driver.getWindowHandles();

		Iterator<String> it = allWindowsId.iterator();

		String currentTabId = it.next(); // main window id
		String newTabID = it.next(); // new window id

		System.out.println("main tab id is " + currentTabId);
		System.out.println("new tab id is " + newTabID);
		Thread.sleep(2000);

		// change focus current window to new window
		driver.switchTo().window(newTabID);
		Thread.sleep(2000);
		// getting text on new window
		WebElement newPageText = driver.findElement(By.xpath("//h3[contains(text(),'QA tools ')]"));

		System.out.println("new page text is " + newPageText.getText());

		Thread.sleep(2000);

		// change focus new window to current 1st window
		driver.switchTo().window(currentTabId);
		Thread.sleep(2000);

		// driver.findElement(By.xpath("//input[@value='Download']")).click();

		driver.findElement(By.name("home")).click();

	}

}
