package commonlyUseMethods_study;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String mydata = Test4_excelsheet.ExcelSheet(1, 2);
		System.out.println(mydata);
		
//		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		Test3_Wait.ImplicitWait(driver, 5);
//		
//		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
//		
//		WebElement fullName = driver.findElement(By.id("name"));
//		WebElement emailId = driver.findElement(By.name("email"));
//		WebElement passWord = driver.findElement(By.id("password"));
//		WebElement mobileNo = driver.findElement(By.id("mobile"));
//		
//		
////		fullName.sendKeys("pratiksha khote");
////		emailId.sendKeys("pattukk@gmail.com");
////		passWord.sendKeys("2000");
////		mobileNo.sendKeys("9579815486");
//		
//		fullName.sendKeys(Test4_excelsheet.ExcelSheet(4, 0));
//		emailId.sendKeys(Test4_excelsheet.ExcelSheet(4, 1));
//		passWord.sendKeys(Test4_excelsheet.ExcelSheet(4, 2));
//		
//		mobileNo.sendKeys(Test4_excelsheet.ExcelSheet(4, 3));
//		
//
//		
//
		

	}

}
