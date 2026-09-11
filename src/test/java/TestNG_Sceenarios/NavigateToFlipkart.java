package TestNG_Sceenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NavigateToFlipkart {
	@Parameters("browser")
	@Test
	public void flipkart(String browser)throws InterruptedException{

	//launch the browser
		WebDriver driver=null;
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(browser.equals("edge")) {
			
		}else {
			driver =new ChromeDriver(); 
		}


	//maximize the window
	driver.manage().window().maximize();

	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	//navigate to an app
	driver.get("https://www.flipkart.com");
	Thread.sleep(3000);

	Reporter.log("Flipkart",true);
	}
}
