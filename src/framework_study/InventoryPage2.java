package framework_study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage2 {
	
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")   private WebElement backpackAddToCartButton;
     
	@FindBy(name = "add-to-cart-sauce-labs-bike-light")    private WebElement BikeLightAddToCartButton;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")   private WebElement cartButtons;
	
	
	
	
	//constructor

	public InventoryPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	public void addTocartBackpack()
	{
		backpackAddToCartButton.click();
	}
	
	public void addToCartBikeLight()
	{
		BikeLightAddToCartButton.click();
	}
	
	public void ClickOnCartButton()
	{
		cartButtons.click();
	}
}
