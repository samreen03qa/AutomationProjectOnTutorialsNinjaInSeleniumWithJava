package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURl {

	public static void main(String[] args) {

		//launch the chrome browser
		WebDriver driver= new ChromeDriver();
		
		//navigate to application
		driver.get("https://www.selenium.dev/");
		
		//get current URL
		String currentURL = driver.getCurrentUrl();
		
		//print current URL
		System.out.println("Current URL is: "+currentURL);
		
		//close browser
			driver.quit();
		
		
		
	
	}

}
