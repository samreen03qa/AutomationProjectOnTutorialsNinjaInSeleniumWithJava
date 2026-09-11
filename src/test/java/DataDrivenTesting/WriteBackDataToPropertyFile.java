package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteBackDataToPropertyFile {

	public static void main(String[] args) throws IOException {

		//convert physical file to java obj
				FileInputStream fis= new FileInputStream("./src/test/resources/Data.properties");
				
				//create an obj of properties
				Properties prop= new Properties();
				
				//load the data to properties obj from java obj
				prop.load(fis);
				
				//write the data to prop obj
				prop.put("Testing","selenium");
				
				//convert obj to physical file
				FileOutputStream fos=new FileOutputStream("./src/test/resources/Data.properties");
				prop.store(fos,"Updated");
	}

}
