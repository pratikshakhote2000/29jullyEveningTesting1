package apoiche_poi_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_ex4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile = new FileInputStream("C:\\Software_T\\MyExcelSheet1.xlsx");
		Workbook mwb = WorkbookFactory.create(myfile);
		Sheet mySheet = mwb.getSheet("Sheet2");
		
		
		int totalNumOfrows = mySheet.getLastRowNum();
		System.out.println(totalNumOfrows);
		
		short totalNumOfCell = mySheet.getRow(0).getLastCellNum();
		System.out.println(totalNumOfCell);
	}

}
