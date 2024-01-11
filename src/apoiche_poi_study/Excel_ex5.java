package apoiche_poi_study;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_ex5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile = new FileInputStream("C:\\Software_T\\MyExcelSheet1.xlsx");
		Workbook mwb = WorkbookFactory.create(myfile);
		Sheet mySheet = mwb.getSheet("Sheet2");

		int lastRows = mySheet.getLastRowNum();
		int totalNumOfrow = lastRows;

		short lastCell = mySheet.getRow(0).getLastCellNum();
		// bydefault java is count from 0 but excel is count from 1 thats why we add -1

		int totalNumOfCell = lastCell - 1;    
											

		for (int i = 0; i <= totalNumOfrow; i++) // for rows
		{
			for (int j = 0; j <= totalNumOfCell; j++) // for cell
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}

}
