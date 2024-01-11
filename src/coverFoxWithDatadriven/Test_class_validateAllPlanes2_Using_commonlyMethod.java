package coverFoxWithDatadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonlyUseMethods_study.Test5_CoverFox;

public class Test_class_validateAllPlanes2_Using_commonlyMethod {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.coverfox.com/");
		
		CoverFox_homePage home=new CoverFox_homePage(driver);
		Thread.sleep(1000);

		home.clickOngenderButton();
		
		
		CoverFoxHealthPlan_page2 home2=new CoverFoxHealthPlan_page2(driver);
		Thread.sleep(1000);

		home2.clickOnNextButton();
		
		
		CoverFox_MemberDetailspage3 home3=new CoverFox_MemberDetailspage3(driver);
		home3.dropDownHandle(Test5_CoverFox.ReadExcelSheet("coverFoxData", 0, 0));
		Thread.sleep(1000);

		home3.clickOnnextButtonPage3();
		Thread.sleep(1000);

		
		AddressDEtails_page4 ad=new AddressDEtails_page4(driver);
		ad.enterPinCode(Test5_CoverFox.ReadExcelSheet("coverFoxData", 0, 1));
		Thread.sleep(1000);
		ad.enterMobNo(Test5_CoverFox.ReadExcelSheet("coverFoxData", 0, 2));
		Thread.sleep(1000);

		ad.clickOnContinueButton();
		
		Result_page5 result1=new Result_page5(driver);

		Thread.sleep(7000);
		result1.validPlanList();
		Thread.sleep(7000);
		
		driver.close();
		

	}

}
