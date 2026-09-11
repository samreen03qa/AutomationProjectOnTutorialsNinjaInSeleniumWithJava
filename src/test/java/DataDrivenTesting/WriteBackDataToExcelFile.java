package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteBackDataToExcelFile {

	public static void main(String[] args)  throws IOException 
	{

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
				
	}

}
