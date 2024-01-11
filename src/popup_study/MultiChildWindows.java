package popup_study;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiChildWindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);

		
		driver.findElement(By.xpath("//span[text()='Remote']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='MNC']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Banking & Finance']")).click();
		Thread.sleep(1000);


		Set<String> allWindowId = driver.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<>(allWindowId);
		for(int i=0;i<al.size();i++)
		{
			driver.switchTo().window(al.get(i));
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
			System.out.println("thw url is "+driver.getCurrentUrl());
			Thread.sleep(1000);
 
		}

	}

}
