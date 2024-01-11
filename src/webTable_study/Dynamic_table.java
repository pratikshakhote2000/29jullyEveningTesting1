package webTable_study;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_table {

	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000)) ;
		int noOfRows = driver.findElements(By.xpath("driver.findElements(By.xpath(\"//table[@class='dataTable']//tr")).size();
		int noOfheaders = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]/th")).size();

	}

}
