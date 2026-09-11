package TestNG_Sceenarios;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class NavigateToFacebook {
@org.testng.annotations.Parameters("broswer")
@Test
public void facebook(String browser) throws InterruptedException{

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
driver.get("https://www.facebook.com");
Thread.sleep(3000);

Reporter.log("Facebook",true);
}
}