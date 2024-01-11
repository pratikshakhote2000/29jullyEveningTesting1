package dropDownUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FillUPForm {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jainmilap.com/registration");
		Thread.sleep(1000);

		driver.findElement(By.id("fullname")).sendKeys("pratiksha Rohidas khote");
		WebElement date = driver.findElement(By.id("dobDay"));
		Select s = new Select(date);
		s.selectByValue("7");

		Thread.sleep(1000);

		WebElement month = driver.findElement(By.name("dobMonth"));
		Select s2 = new Select(month);
		s2.selectByIndex(5);

		Thread.sleep(1000);

		WebElement year = driver.findElement(By.id("dobYear"));
		Select s3 = new Select(year);
		s3.selectByVisibleText("2000");

		Thread.sleep(1000);

		WebElement femaleGender = driver.findElement(By.id("female"));

		boolean result = femaleGender.isSelected();
		System.out.println("status of gender is " + result);
		Thread.sleep(500);

		femaleGender.click();
		boolean result1 = femaleGender.isSelected();
		System.out.println("status of femalegender is " + result1);

		WebElement status = driver.findElement(By.name("marital_status"));
		status.click();
		boolean result3 = status.isSelected();
		System.out.println("marital status is " + result3);
		Thread.sleep(1000);

		WebElement cast = driver.findElement(By.name("caste"));
		Select s4 = new Select(cast);
		s4.selectByVisibleText("Others");
		Thread.sleep(500);

		driver.findElement(By.id("Subcaste")).sendKeys("open");
		Thread.sleep(500);

		WebElement motherTongue = driver.findElement(By.name("mother_tongue"));
		Select s6 = new Select(motherTongue);
		s6.selectByVisibleText("Marathi");
		Thread.sleep(1000);

		WebElement height = driver.findElement(By.name("Height"));
		Select h1 = new Select(height);
		h1.selectByVisibleText("5ft 2in ( 157cm )");
		Thread.sleep(1000);

		WebElement Myreligion = driver.findElement(By.id("religion"));
		Select r1 = new Select(Myreligion);
		r1.selectByVisibleText("Jain");
		Thread.sleep(1000);

		driver.findElement(By.name("phone")).sendKeys("9579815486");
		driver.findElement(By.id("altphone")).sendKeys("9404211921");
		driver.findElement(By.name("email")).sendKeys("pratikshakhote111@g.com");
		driver.findElement(By.id("password")).sendKeys("justdoit");
		driver.findElement(By.name("conpassword")).sendKeys("justdoit");

		Thread.sleep(1000);

		WebElement profileC = driver.findElement(By.name("createdby"));
		Select pc = new Select(profileC);
		pc.selectByVisibleText("Parents");

		Thread.sleep(500);

		WebElement education = driver.findElement(By.id("qualification"));
		Select ed = new Select(education);
		ed.selectByValue("Masters/Post-Graduation");
		Thread.sleep(500);
		WebElement qualification = driver.findElement(By.name("education"));
		Select qn = new Select(qualification);
		qn.selectByVisibleText("Select");

		WebElement workStatus = driver.findElement(By.id("emplyed"));
		Select ws = new Select(workStatus);
		ws.selectByValue("Not Employed in");
		Thread.sleep(500);
		WebElement profession = driver.findElement(By.id("occupation"));
		Select ps = new Select(profession);
		ps.selectByValue("Student");

		driver.findElement(By.name("occupation_detail")).sendKeys("MCA 2nd year");

		WebElement yrIncome = driver.findElement(By.id("income"));
		Select yt = new Select(yrIncome);
		yt.selectByVisibleText("No Income");
		Thread.sleep(500);
		
		driver.findElement(By.id("address")).sendKeys("gulmohar colony n5 cidko aurangabad");


		driver.findElement(By.id("select2-country-container")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("india");
		  driver.findElement(By.id("select2-country-result-t96s-India")).click();
		  
		  

	}

}
