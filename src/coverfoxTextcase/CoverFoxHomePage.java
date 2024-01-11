package coverfoxTextcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePage {
	
@FindBy(xpath = "//div[text()='Female']") private WebElement genderButton;
	
	@FindBy(className = "next-btn") private WebElement nextButton;
	
	
	//constructor
	
	public CoverFoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//methods
	
	public void clickOngenderButton()
	{
		genderButton.click();
	}


}
