package webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://vctcpune.com/");
Thread.sleep(1000);

driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/div/p1[1]")).click();
	}

}
