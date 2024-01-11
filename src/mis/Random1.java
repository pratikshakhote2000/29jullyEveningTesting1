package mis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Random1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(1000);

		List<WebElement> search = driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]/ul/li"));

		for (WebElement options : search) {
			System.out.println(options.getText());
		}

		String EXp_result = "honda elevate";

		for (WebElement opt : search) {
			String act_result = opt.getText();
			if (EXp_result.equals(act_result)) {
				Thread.sleep(1000);

				opt.click();
				//break;

			}
		}
		Thread.sleep(2000);

		//driver.findElement(By.xpath("(//a[@jsname='ONH4Gc'])[1]")).click();
		//driver.findElement(By.linkText("(//span[@class='rQEFy NZmxZe'])[1]")).click();
		driver.findElement(By.xpath("(//h3[contains(text(),'Honda Elevate')])[1]")).click();
	}
}
