package PraticeSelenium;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BasicSeleium {

		private static final String WebDriverManager = null;

		public static void main(String[] args) throws InterruptedException, MalformedURLException {
//	        //Configure the Browser
//			WebDriverManager.Chromedriver().setup();
			//Launch the browser			
			WebDriver driver=new ChromeDriver();
			//Navigate to the application
			driver.get("https://www.zomato.com/");
			Thread.sleep(3000);
			//Navigate to the application
			driver.get("https://www.myntra.com/");
			Thread.sleep(3000);
			//Navigate to the application
			driver.navigate().to(new URL("https://www.flipkart.com/"));
			Thread.sleep(3000);
			//Navigate to the application
			driver.navigate().back();
			Thread.sleep(3000);
			//Navigate to the application
			driver.navigate().forward();
			Thread.sleep(3000);
			//Navigate to the application
			driver.navigate().refresh();
			//Close the window
			driver.close();
			
			

			

			
			
		}

}
