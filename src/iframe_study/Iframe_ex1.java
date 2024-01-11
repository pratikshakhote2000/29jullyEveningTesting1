package iframe_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_ex1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		// Bydefault focus is on main page t

		// String myText = driver.findElement(By.xpath("//h5[text()='iFrame
		// Demo')")).getText();
		// System.out.println("the text is "+myText);

		// we need to chnge focus  main page to iframe
		driver.switchTo().frame("singleframe");
		String myText = driver.findElement(By.xpath("//h5[text()='iFrame Demo']")).getText();
		System.out.println("the text is " + myText);

		// switch to focus iframe to main page

		driver.switchTo().defaultContent();
		boolean dp = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).isDisplayed();
		System.out.println("the button status is " + dp);
		
		

	}

}
