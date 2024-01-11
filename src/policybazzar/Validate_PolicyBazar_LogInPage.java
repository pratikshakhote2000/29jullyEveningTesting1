package policybazzar;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_PolicyBazar_LogInPage {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		PolicyBazarHomepage home=new PolicyBazarHomepage(driver);
		home.clickOnSignInButton();
		home.enterMobNum();
		home.clickOnSignInMobButton();

	}

}
