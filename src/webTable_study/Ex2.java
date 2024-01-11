package webTable_study;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
       //read  single header row
		WebElement headers = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[1]/th[3]"));
		System.out.println(headers.getText());
		
		System.out.println("========================================================");
		//read all headers
		
		
		List<WebElement> allheaders = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr[1]"));
		for( WebElement rh:allheaders)
		{
			System.out.print(rh.getText()+" ");

		}
		System.out.println();
		System.out.println("========================================================");

		
		//how to read complte row data
 List<WebElement> row4 = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr[4]/td"));
		
			for( WebElement rd:row4)
			{
				System.out.print(rd.getText()+" ");

			}
			System.out.println();
			System.out.println("========================================================");
			
			//read single colomn data

			//WebElement colomn = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[1]/td"));
			for (int i = 2; i<=7; i++) {
				WebElement colomndata = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[" +i+"]/td[4]"));
				System.out.println(colomndata.getText());
			
				
			}
			
		}
	}


