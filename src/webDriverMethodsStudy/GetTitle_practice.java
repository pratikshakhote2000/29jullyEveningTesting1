package webDriverMethodsStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_practice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		String expected_title="Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
		
				
		
		String title = driver.getTitle();
		System.out.println(" the title is "+title);
		
		if (expected_title.equals(title)) {
			System.out.println(" both title is matching then TC will be pass");
			
		}
		else {
			System.out.println("both title is not matching then TC will be fail ");
		}

	}

}
