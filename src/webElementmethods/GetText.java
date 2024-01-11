package webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://discoveryplus.in/home");
		String result = driver.findElement(By.xpath("//h5[text()='Newly Added Seasons']")).getText();
		System.out.println("get text result is "+result);
	}

}
