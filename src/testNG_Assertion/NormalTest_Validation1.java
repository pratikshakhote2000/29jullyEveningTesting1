package testNG_Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NormalTest_Validation1 {
  @Test
  public void validateFBGenderButton() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
	  driver.findElement(By.linkText("Create new account")).click();
	  
	  Thread.sleep(2000);
	  
	 //if female radio button is selected then tc will pass else Tc will failed
	  
	 boolean radioButton = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
	 System.out.println("radio button is selceted  "+radioButton);
	 
	 Assert.assertTrue(radioButton, "button is not selected Tc will fail");
	 
//	 if (radioButton) {
//		 System.out.println("radio button is selected TC will pass");
//		
//	}
//	 
//	 else {
//		 System.out.println("radio button is not selected TC will fail");
//
//	}
  }
}

