package framework_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLogINPage {
	
	//Variables
	
	@FindBy(id = "user-name")   private WebElement UserNmaeField;
	@FindBy(id="password")   private  WebElement password;
	@FindBy(name = "login-button")  private  WebElement loginButton;
	
	
	//constructor
	public SwagLogINPage(WebDriver driver)     //user Define constructor
	{
		PageFactory.initElements(driver, this);
		
		
	}
	
	//methods
	
	public void enteruserName()
	{
		UserNmaeField.sendKeys("standard_user");
		
	}
	
	public void EnterPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
		
		
		
		
		
		
		
	}
	
	

}
