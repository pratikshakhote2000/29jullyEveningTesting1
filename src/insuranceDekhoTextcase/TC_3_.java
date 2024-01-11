package insuranceDekhoTextcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonlyUseMethods_study.Test3_Wait;

public class TC_3_ {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.insurancedekho.com/");
		
		Test3_Wait.ImplicitWait(driver, 8);
		
		Homepage page1=new Homepage(driver);
		Thread.sleep(500);
		page1.clickOnHeathInsuranceButton();
		
		Health_InsurancePage2 health=new Health_InsurancePage2(driver);
		health.enterName();
		health.enterMobNum();
		health.validateAllPlans();
	}

}
