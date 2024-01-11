package policybazzar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v115.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyBazarHomepage {
	
	
	@FindBy(className = "sign-in") private WebElement signInHomePageButton;
	//@FindBy()
	@FindBy(xpath = "(//input[@type='number'])[2]") private WebElement mobNumField;
	@FindBy(xpath = "(//span[text()='Sign in with Password'])[2]") private WebElement signInWithPasswordButton;

	
	//constructer
	
	public PolicyBazarHomepage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	public void clickOnSignInButton()
	{
		signInHomePageButton.click();
	}
	public void enterMobNum()
	{
		mobNumField.sendKeys("9579815486");
	}
	
	public void clickOnSignInMobButton()
	{
		signInWithPasswordButton.click();
	}
	
	
	
}
//https://www.policybazaar.com/