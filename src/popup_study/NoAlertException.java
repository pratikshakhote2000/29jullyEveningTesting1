package popup_study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoAlertException {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);

// this exception will come when there is no alert popup and we already use syntax to handle
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

}
