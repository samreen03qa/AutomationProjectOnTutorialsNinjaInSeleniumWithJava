package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		
		//Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate to application URL
		driver.get("https://www.selenium.dev/");
		
		//capture page title
		String actualtitle=driver.getTitle();
		
		
		//print page title in console
		System.out.println(actualtitle);
		
		//close the browser session
		//driver.quit();		
	}

}

