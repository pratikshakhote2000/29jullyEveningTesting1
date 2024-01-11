package popup_study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPoP_ex {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);

		driver.findElement(By.name("submit")).click();
		// handling alert popup

		// change selenium focus mainpage to alert popup
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);

		// using this method we click on cancel button
		alt.dismiss();
		Thread.sleep(2000);

		driver.findElement(By.name("cusid")).sendKeys("323232");
		Thread.sleep(2000);

		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);

		// if we want to click on ok button use this method
		alt.accept();
		Thread.sleep(2000);

		// using this method we get text on alert popup
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
	}

}
