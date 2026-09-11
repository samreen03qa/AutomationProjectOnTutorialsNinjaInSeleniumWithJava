package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		//convert physical file to java file
		FileInputStream fis=new FileInputStream("./src/test/resources/Data.xlsx");
		
		//create workbook
		Workbook wb=WorkbookFactory.create(fis);
		
		//fetch the sheet
		Sheet s=wb.getSheet("Data");
		
		//fetch the row
		Row r=s.getRow(1);
		
		//fetch the cell
		Cell c=r.getCell(0);
		
		//fetch the data
		String data=c.getStringCellValue(); //for string type data
		//double num=c.getNumericCellValue(); //for numeric type data
		System.out.println(data);
		}

}
