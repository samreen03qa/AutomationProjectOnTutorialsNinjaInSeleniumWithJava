package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {

	public static void main(String[] args) {
		
		//open the browser
		WebDriver driver= new ChromeDriver();
		
		//navigate to application 
		driver.get("https://www.selenium.dev/");
		
		//close the browser
		driver.close();

	}
	

}
