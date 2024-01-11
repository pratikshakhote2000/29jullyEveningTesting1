package dropDownUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Deselected_use {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(500);
		WebElement dropdown = driver.findElement(By.id("cars"));
		
		Select s=new Select(dropdown);
		
		System.out.println(s.isMultiple());
		
		s.selectByValue("volvo");
		Thread.sleep(500);
		s.selectByIndex(2);
		Thread.sleep(100);
		s.selectByVisibleText("Audi");
		Thread.sleep(100);
		
	//	s.deselectAll();
		//System.out.println(s);
		
		s.deselectByVisibleText("Volvo");    //use to deselcted one option
		
		
	}

}
