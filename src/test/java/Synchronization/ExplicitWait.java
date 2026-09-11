package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {

	@Test
	public void waitTest() {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an application
		driver.get("https://shopperstack.com/");
		
		//exp wait--> wait until title is visible on the webpage
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("ShopperssStack | Login"));
		
		//Identify login button
		WebElement login = driver.findElement(By.id("loginBtn"));
		
		//exp wait-->wait until element is visible on the webpage
		wait.until(ExpectedConditions.visibilityOf(login));
		
		//exp wait--> wait until element is clickable on the webpage
		wait.until(ExpectedConditions.elementToBeClickable(login));
		
		login.click();
		
		
		
	}
		
	
}
