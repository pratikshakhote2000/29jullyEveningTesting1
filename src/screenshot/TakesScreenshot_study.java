package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class TakesScreenshot_study {


	public static void main(String[] args) throws InterruptedException, IOException {
		
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.netflix.com/in/");
	Thread.sleep(500);
	
	
	File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	
	LocalDate ld=LocalDate.now();    //when we want to add current date in my screenshot
	System.out.println(ld);

	
	//String rs = RandomString.make(3);    //when we want to add random number
	//System.out.println(rs);
	
	File dest=new File("D:\\SeleniumSc\\MyScreenshot"+ld+".png");

	FileHandler.copy(source, dest) ;
	
	
	
	
	

	}

}
