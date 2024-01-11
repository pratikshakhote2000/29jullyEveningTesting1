package popup_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleChildWindowUsingIterator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='ntc__chip-label']")).click();
		driver.findElement(By.xpath("//span[@title='MNC']")).click();
		driver.findElement(By.xpath("//span[text()='Banking & Finance']")).click();


	}

}
