package apoiche_poi_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import commonlyUseMethods_study.Test4_excelsheet;

public class Excel_ex2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile = new FileInputStream("C:\\Software_T\\MyExcelSheet1.xlsx");
		
		Workbook myWorkBook = WorkbookFactory.create(myfile);
		
       Sheet mySheet = myWorkBook.getSheet("Sheet1");
      // how to read whole 1 row data
        for (int i=0;i<=2;i++)
        {
        	String value = mySheet.getRow(0).getCell(i).getStringCellValue();  
        	System.out.println(value);
        }
        
        System.out.println();
      System.out.println("==================================");  
        //how to read whole  1 cell data
        
       for (int i = 0; i<=3; i++) {
    	  String cellvalue = mySheet.getRow(i).getCell(3).getStringCellValue();
    	  System.out.println(cellvalue);

			
		} 
       
	}
}


