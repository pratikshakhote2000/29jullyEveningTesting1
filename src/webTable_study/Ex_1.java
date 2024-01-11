package webTable_study;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		// identify the table
		WebElement booktable = driver.findElement(By.name("BookTable"));

		// how many rows in table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']"));
		int totalNoOfRows = rows.size();
		System.out.println("total no of rows in table " + totalNoOfRows);

		// how many colomns in table
		List<WebElement> header = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th"));

		int numOfColomns = header.size();
		System.out.println("total no of colomns in table " + numOfColomns);
		
		// how many table data in table
		List<WebElement> tabledata = driver.findElements(By.xpath("//table[@name='BookTable']//tr/td"));

		int totalnumOftabledata = tabledata.size();
		System.out.println("total no of table data " + totalnumOftabledata);
		
		System.out.println("====================================================");
		
		for(WebElement td:tabledata)
		{
			System.out.println(td.getText()+" ");
		}
		System.out.println();
       System.out.println("====================================================");
       
       driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/td"));
       
       
	}

}
