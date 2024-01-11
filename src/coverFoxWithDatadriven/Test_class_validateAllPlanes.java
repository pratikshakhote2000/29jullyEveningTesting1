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

public class Test_class_validateAllPlanes {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream myfile=new FileInputStream("C:\\Software_T\\MyExcelSheet1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("coverFoxData");
		String ageData = mySheet.getRow(0).getCell(0).getStringCellValue();
		String pinCodeDta = mySheet.getRow(0).getCell(1).getStringCellValue();
		String mobData = mySheet.getRow(0).getCell(2).getStringCellValue();


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
		home3.dropDownHandle(ageData);
		Thread.sleep(1000);

		home3.clickOnnextButtonPage3();
		Thread.sleep(1000);

		
		AddressDEtails_page4 ad=new AddressDEtails_page4(driver);
		ad.enterPinCode(pinCodeDta);
		Thread.sleep(1000);
		ad.enterMobNo(mobData);
		Thread.sleep(1000);

		ad.clickOnContinueButton();
		
		Result_page5 result1=new Result_page5(driver);
		Thread.sleep(1000);

		Thread.sleep(7000);
		result1.validPlanList();
		
		driver.close();
		

	}

}
