package framework_study;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01_loginPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	
	
	//calling  swaglogInpage class
	SwagLogINPage swag=new SwagLogINPage(driver);
	swag.enteruserName();
	swag.EnterPassword();
	swag.clickOnLoginButton();
	
	
	Thread.sleep(2000);
	//calling Inventory class methods
	
	InventoryPage2 In=new InventoryPage2(driver);
	In.addTocartBackpack();
	In.addToCartBikeLight();
	In.ClickOnCartButton();
	
			

	}

}
