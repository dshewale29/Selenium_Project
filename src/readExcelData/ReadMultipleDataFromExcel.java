package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//read multiple values from "IPL" sheet
		for(int i = 1; i <= 7; i++) {
			FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//select the file that we want to work
			
		    Workbook wb = WorkbookFactory.create(fis);//to make the file ready to read
		    
		    Sheet sheet = wb.getSheet("IPL"); //to access the sheet
		    
		    Row row = sheet.getRow(i); //get into the desired row
		    
		    Cell cell = row.getCell(1);//get into desired cell or column
		    
		    String data = cell.getStringCellValue();//it will read the value in sheet
		    
		    Thread.sleep(2000);
		    System.out.println(data);
		}
	}
}