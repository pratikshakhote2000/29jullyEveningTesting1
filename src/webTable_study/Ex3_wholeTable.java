package webTable_study;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_wholeTable {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		System.out.println("=============================================================");

		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if (i==1) {
	WebElement header = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]/th"));
				System.out.print(header.getText()+" ");

					
				}
				else {
		 WebElement tabledata = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]/td["+j+"]"));
					 System.out.print(tabledata.getText()+" ");

					
					
				}
			}
			System.out.println();
			System.out.println("=============================================================");

		}
	}

}
