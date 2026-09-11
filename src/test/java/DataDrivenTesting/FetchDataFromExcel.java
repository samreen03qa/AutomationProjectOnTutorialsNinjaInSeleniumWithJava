package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class FetchDataFromExcel {
@Test
public void excelData() throws EncryptedDocumentException, IOException {
	//convert physical file to java file
			FileInputStream fis=new FileInputStream("./src/test/java/DataDrivenTesting/ExcelFile.java");
			
			//create workbook
			Workbook wb=WorkbookFactory.create(fis);
			
			//fetch the sheet
			Sheet s=wb.getSheet("test data");
			
			//fetch the row
			Row r=s.getRow(3);
			
			//fetch the cell
			Cell c=r.getCell(2);
			Cell c1=r.getCell(1);
			//fetch the data
			String data=c.getStringCellValue(); //for string type data
			double num=c.getNumericCellValue(); //for numeric type data
			String num1 = c.toString();
			System.out.println(data);
			System.out.println(data+":"+num1);

	
	
	
}
@Test
public void writeBackData() throws EncryptedDocumentException, IOException {
	
	//convert physical file to object
	FileInputStream fis =  new FileInputStream("./src/test/java/DataDrivenTesting/ExcelFile.java");
	//create workbook
	Workbook wb = WorkbookFactory.create(fis);
	//fetch the sheet
	Sheet sh = wb.getSheet("test data");
	//fetch the row
	Row r = sh.getRow(2);
	//create the cell
	Cell c = r.createCell(4);
	//write the data
	c.setCellValue("selenium");
	FileInputStream fos=new FileInputStream("./src/test/java/DataDrivenTesting/ExcelFile.java");
	wb.write(fos);
	//close the excel 
	wb.close();
}





























}
