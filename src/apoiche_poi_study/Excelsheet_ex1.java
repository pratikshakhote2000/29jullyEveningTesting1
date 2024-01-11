package apoiche_poi_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet_ex1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile = new FileInputStream("C:\\Software_T\\MyExcelSheet1.xlsx");
	// String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	//  System.out.println(value);
	  
	  //in this way we know return type of all method
	  Workbook myworkBook= WorkbookFactory.create(myfile);
	  
	  Sheet mySheet = myworkBook.getSheet("Sheet1");
	  
	 Row myRows = mySheet.getRow(0);
	 
	 Cell myCell = myRows.getCell(0);
	 
	CellType mycelldatatype = myCell.getCellType();
	System.out.println(mycelldatatype);   //we get cell data type
	  ;
	  
	  
	  
	  
		
	}

}
