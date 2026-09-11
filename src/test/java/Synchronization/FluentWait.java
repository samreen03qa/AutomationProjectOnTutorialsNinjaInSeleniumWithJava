package Synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class FluentWait {

	@Test
	public void waitTest() {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an application
		driver.get("https://shopperstack.com/");
		
		//fluent wait-->wait until title is visible on the webpage
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
	
		//Duration to wait
		wait.withTimeout(Duration.ofSeconds(10));
		
		//Customize polling period
		wait.pollingEvery(Duration.ofSeconds(1));
		
		//Ignore the exception in given duration
		wait.ignoring(Exception.class);
		
		wait.until(ExpectedConditions.titleContains("ShopperStack | login"));
	
	}
}
