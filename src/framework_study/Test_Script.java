package framework_study;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.ssl.SslClientHelloHandler;

public class Test_Script {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

		driver.get("https://www.saucedemo.com/");

		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement logInButton = driver.findElement(By.name("login-button"));

		userName.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		logInButton.click();

		WebElement item1 = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
		WebElement item2 = driver.findElement(By.name("add-to-cart-sauce-labs-onesie"));
		item1.click();
		item2.click();

		WebElement addToCartButton = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		addToCartButton.click();

		List<WebElement> cartItems = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

		System.out.println("selected item is " + cartItems.size());

		for (WebElement ci : cartItems) {
			System.out.println("cart items is " + ci.getText());
		}

		Iterator<WebElement> it = cartItems.iterator();
		WebElement itemName1 = it.next();
		WebElement itemNum3 = it.next();

		if (itemName1.getText().equals("Test.allTheThings() T-Shirt (Red)")) {
			System.out.println("Selected items is correct ................=Test.allTheThings() T-Shirt (Red)");
			driver.findElement(By.name("checkout")).click();

		}

		else {
			System.out.println("selected items is not current");
		}

		WebElement FirstName = driver.findElement(By.name("firstName"));
		WebElement lastname1 = driver.findElement(By.name("lastName"));
		WebElement postalCodee = driver.findElement(By.name("postalCode"));

		WebElement continueButton = driver.findElement(By.id("continue"));

		FirstName.sendKeys("pratiksha");
		lastname1.sendKeys("khote");
		postalCodee.sendKeys("431124");

		continueButton.click();

		WebElement finishButton = driver.findElement(By.id("finish"));
		finishButton.click();

		WebElement thankFulMsg = driver.findElement(By.xpath("//h2[text()='Thank you for your order!']"));

		if (thankFulMsg.getText().equals("Thank you for your order!")) {
			System.out.println("Thank you for your order!.......................logging out");
			Thread.sleep(1000);
			driver.findElement(By.id("react-burger-menu-btn")).click();
			driver.findElement(By.id("logout_sidebar_link")).click();
		}

		else {
			System.out.println("thank u msg not displayed.....plarase");
		}

	}

}
