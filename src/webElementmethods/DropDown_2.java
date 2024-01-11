package webElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.jeevansathi.com/m0/register/customreg/15?source=Desk_Shad&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Shaadi_Desktop_Ethinos&utm_adgroup=Mix_matchtypes&utm_term=shadi%20com&gclid=Cj0KCQjwhL6pBhDjARIsAGx8D5_VoSiLyPcqVf-miDU5FKw40gkQ8o6dHyftMgbI40F93fDfU9N0nUoaAlhrEALw_wcB");
	Thread.sleep(1000);
		WebElement date = driver.findElement(By.id("reg_dtofbirth_day"));
	Select s=new Select(date);
	s.selectByValue("7");
	
	WebElement month = driver.findElement(By.id("reg_dtofbirth_month"));
Select s1=new Select(month);
s1.selectByValue("6");

WebElement year = driver.findElement(By.id("reg_dtofbirth_year"));
Select s2=new Select(year);
s2.selectByValue("2000");
	}
}