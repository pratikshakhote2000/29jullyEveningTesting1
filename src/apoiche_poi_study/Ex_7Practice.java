package apoiche_poi_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.io.FileHandler;

public class Ex_7Practice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		
		FileInputStream myfile=new FileInputStream("C:\\Software_T\\ExcelPractice.xlsx");
		
		CellType myWorkBook = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(2).getCellType();
	System.out.println(myWorkBook);
	
	}

}
