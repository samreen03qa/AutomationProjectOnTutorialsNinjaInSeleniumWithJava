package UsingRelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingAboveAndBelowMethods {


	public static void main(String[] args) throws InterruptedException {

		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an app
		driver.get("https://practicetestautomation.com/practice-test-login/");
		 Thread.sleep(3000);

		//identify password text field
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Password123");
		
		//identify username text field
	 driver.findElement(RelativeLocator.with(By.tagName("input")).above(password)).sendKeys("student");
	
	//identify submit button and click on it
	 driver.findElement(RelativeLocator.with(By.tagName("button")).below(password)).click();
	
	 Thread.sleep(3000);
	 
	}
	
	
	

}
