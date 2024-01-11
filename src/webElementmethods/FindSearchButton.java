package webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindSearchButton {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.hotstar.com/in/explore");
     Thread.sleep(1000);
    // driver.findElement(By.xpath("//span[@class=' ON_IMAGE BUTTON2_SEMIBOLD ']")).click();
     driver.findElement(By.xpath("//input[@id='searchBar']")) . sendKeys("jawan");
	}

}
