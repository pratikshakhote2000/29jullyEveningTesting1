package listeners_testNg;

import org.testng.annotations.Test;

import coverFoxPom.AddressDEtails_page4;
import coverFoxPom.CoverFoxHealthPlan_page2;
import coverFoxPom.CoverFox_MemberDetailspage3;
import coverFoxPom.CoverFox_homePage;
import coverFoxPom.Result_page5;
import coverFox_Base.BaseClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;



@Listeners(listeners_testNg.Listener_FailedTestCase.class)
public class CF_TC03_Validate_Search_Research_for_healthcare_policies  extends BaseClass{

	CoverFox_homePage home;
	CoverFoxHealthPlan_page2 healthPlan;
	CoverFox_MemberDetailspage3 memberDetails;
	AddressDEtails_page4 addressDetails;
	Result_page5 result;
	

	@BeforeClass
	public void launchBrowser() {
		driver = new ChromeDriver();
		home = new CoverFox_homePage(driver);
		healthPlan = new CoverFoxHealthPlan_page2(driver);
		memberDetails = new CoverFox_MemberDetailspage3(driver);
		addressDetails = new AddressDEtails_page4(driver);
		result = new Result_page5(driver);

		Reporter.log("opening Browser", true);
		driver.get("https://www.coverfox.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	}

	@BeforeMethod
	public void enterMembersDetails() throws InterruptedException {
		Reporter.log("Clicking on gender button", true);
		home.clickOngenderButton();
		Thread.sleep(1000);

		Reporter.log("Clicking on next button", true);
		healthPlan.clickOnNextButton();
		Thread.sleep(1000);

		Reporter.log("Handling age drop down", true);
		memberDetails.dropDownHandle("29");
		Reporter.log("Clicking on next button", true);
		memberDetails.clickOnnextButtonPage3();
		Thread.sleep(1000);

		Reporter.log("Entering Pincode", true);
		addressDetails.enterPinCode("411046");
		Reporter.log("Entering Mob no", true);
		addressDetails.enterMobNo("8787564367");
		Reporter.log("Clicking on next button", true);
		addressDetails.clickOnContinueButton();
		Thread.sleep(1000);

	}

	@Test
	public void validateTestPlansFromTextAndBanners() throws InterruptedException {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable notifications");
		Reporter.log("Fetching number of results from text", true);
		int textResult = result.availablePlanNumberFromText();
		Thread.sleep(9000);

		Reporter.log("Fetching number of results from Banners", true);
		int bannerResult = result.availablePlanNumberFromBanner();
		Thread.sleep(5000);

		Assert.assertNotEquals(textResult, bannerResult, "Text Result are  equal to Banner Result,TC will failed");
		Reporter.log("TC is Passed", true);

	}

	@AfterMethod
	public void closeBrowser() throws InterruptedException {

		Reporter.log("closing browser", true);
		Thread.sleep(7000);
		driver.close();

	}

}
