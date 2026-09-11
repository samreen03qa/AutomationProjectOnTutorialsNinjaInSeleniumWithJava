package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//convert physical file to java obj
		FileInputStream fis= new FileInputStream("./src/test/resources/Data.properties");
		
		//create an obj of properties
		Properties prop= new Properties();
		
		//load the data to properties obj from java obj
		prop.load(fis);
		
		//fetch the data from prop obj using key
		String URL = prop.getProperty("url");
		System.out.println(URL);
		
	}

}
