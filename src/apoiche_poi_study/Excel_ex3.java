package apoiche_poi_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_ex3 {


	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile = new FileInputStream("C:\\Software_T\\MyExcelSheet1.xlsx");
		
		Workbook myWorkBook = WorkbookFactory.create(myfile);
		
		Sheet mySheet = myWorkBook.getSheet("Sheet2");
		//read whole excel data
		
		//outer for loop-----> for rows
		
		for(int i=0;i<=1;i++)
		{
			//inner for loop ---->for cells
			for(int j=0;j<=3;j++)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
		

	}

}
