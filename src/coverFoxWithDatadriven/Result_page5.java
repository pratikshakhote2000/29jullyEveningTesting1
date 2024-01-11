package coverFoxWithDatadriven;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Result_page5 {
	
	
	@FindBy(xpath = "//div[contains(text(),'Insurance Plans')]") private WebElement gettingText;
	@FindBy(id = "plans-list") private List<WebElement> allPlaneList;
	
	public Result_page5(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void  validPlanList()
	{
		String test = gettingText.getText();   //49 matching health insurance plan
		
	 	 String ar[]=test.split(" ");
	 	 
	 	 String numberOfResultInString = ar[0];    //convert string into integer
	 	 
	 	 int numberOfResultInInt = Integer.parseInt(numberOfResultInString);    //49 string covert into integer
	 	 
	 	 
	int totalNumOfElement = allPlaneList.size();
	System.out.println(totalNumOfElement);
	
	if(totalNumOfElement==numberOfResultInInt)
	{
		System.out.println(" Both result is matching TC will be pass");
	}
	
	else {
		System.out.println("Both result is not matching TC will be fail");
	}
	 	 
	}

}
