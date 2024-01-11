package testNG_Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Insta_TestNG_practice {
	
	WebDriver driver=new ChromeDriver();

	@BeforeClass
	  public void beforeClass() {
		
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		Reporter.log("url is launching", true);
	  }

	
	@BeforeMethod
	  public void beforeMethod() {
		driver.findElement(By.xpath("//span[contains(text(),'Phone number' )]")).sendKeys("pratiksha khote");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9579815486");
		Reporter.log("url is launching", true);

	  }

//  @Test
//  public void f() {
//  }
//
//  @AfterMethod
//  public void afterMethod() {
//  }
//
//
//  @AfterClass
//  public void afterClass() {
//  }
//
}
