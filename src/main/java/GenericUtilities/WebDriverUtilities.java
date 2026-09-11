package GenericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtilities {

		public WebDriver driver = null;
		
		//launch the browser
		public void launchTheBrowser()
		{
			driver= new ChromeDriver();
		}
		//maximize the browser
		public void maximizeTheWindow()
		{
			driver.manage().window().maximize();
		}
		//navigate to an application
		public void navigateToAnAppIn(String url)
		{
			driver.get(url);
		}
		//fetch the title
		public String fetchTheTitle()
		{
			String title= driver.getCurrentUrl();
			return title;
		}
		// fetch the current url
		public String getCurrentUrl()
		{
			return driver.getCurrentUrl();
		}
		
		
	}


