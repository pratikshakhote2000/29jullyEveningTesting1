package coverfoxTextcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFox_HealthPlanpage2 {
	
	@FindBy(className = "next-btn") private WebElement nextButton;

	
	
	
	public CoverFox_HealthPlanpage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
	public void  clickOnNextButton()
	{
		nextButton.click();
	}
}
