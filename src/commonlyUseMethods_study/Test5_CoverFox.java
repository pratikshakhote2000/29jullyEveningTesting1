package commonlyUseMethods_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test5_CoverFox {

	public static String ReadExcelSheet(String sheetName, int row, int cell)			throws EncryptedDocumentException, IOException {

		FileInputStream myfile = new FileInputStream("C:\\Software_T\\MyExcelSheet1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet(sheetName);
		String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
		System.out.println(value);
		return value;
	}

}
