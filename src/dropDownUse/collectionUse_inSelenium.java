package dropDownUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class collectionUse_inSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(500);
		
		WebElement dp = driver.findElement(By.id("cars"));
		
		Select s=new Select(dp);
		System.out.println(s.isMultiple());
		
		s.selectByIndex(2);
		Thread.sleep(500);
		s.selectByValue("volvo");
		Thread.sleep(500);
		s.selectByVisibleText("Audi");
		Thread.sleep(500);
		
		System.out.println(s.getFirstSelectedOption().getText());
		
		System.out.println("========================================");
		
		List<WebElement> options = s.getOptions();
		//System.out.println(options);
		for(WebElement o:options)
		{
			System.out.println(o.getText());
		}
		
		
		System.out.println("=======================");
		List<WebElement> so = s.getAllSelectedOptions();
		for(WebElement s1:so)
		{
			System.out.println(s1.getText());
		}
		
		
		
		
		
		
		
	}
}
