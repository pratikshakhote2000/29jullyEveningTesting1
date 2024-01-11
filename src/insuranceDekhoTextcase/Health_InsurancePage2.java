package insuranceDekhoTextcase;

import java.nio.file.WatchEvent;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Health_InsurancePage2 {
	
	
	@FindBy(name = "name")private WebElement nameField;
	@FindBy(name = "mobile") private WebElement mobileFild;
	
	@FindBy(className = "card") private List<WebElement> allPlans;
	
	public Health_InsurancePage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterName()
	{
		nameField.sendKeys("pratiksha khote");
	}

	
	public void enterMobNum()
	{
		mobileFild.sendKeys("8055967918");
	}
	
	public void validateAllPlans()
	{
		int totalNumOfplans = allPlans.size();
		System.out.println(totalNumOfplans);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
