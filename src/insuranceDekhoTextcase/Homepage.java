package insuranceDekhoTextcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(xpath = "(//div[@class='tabName'])[1]")private WebElement healthInsurance_icon;
	
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, healthInsurance_icon);
	}

	public void clickOnHeathInsuranceButton()
	{
		healthInsurance_icon.click();
	}
	
}
