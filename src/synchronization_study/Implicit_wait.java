package synchronization_study;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(10000);  //22 seconds 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		

	}

}
