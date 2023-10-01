package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//select the file that we want to work
	
		Workbook wb = WorkbookFactory.create(fis);//to make the file ready to read
		
		Sheet sheet = wb.getSheet("IPL");//to access the sheet
		
		Row row = sheet.getRow(2);//get into the desired row
		
		Cell cell = row.getCell(0);//get into desired cell or column
		
		String data = cell.getStringCellValue();//it will read the value in sheet
		
		System.out.println(data);
	}
}