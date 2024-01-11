package webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(1000);
		driver.findElement(By.name("mobileNumber")).sendKeys("9579815486");
		boolean result = driver.findElement(By.xpath("//button[text( )='Get OTP']")).isEnabled();
		driver.findElement(By.xpath("//button[text( )='Get OTP']")).click();
		System.out.println("continue button status is "+result);
	}

}