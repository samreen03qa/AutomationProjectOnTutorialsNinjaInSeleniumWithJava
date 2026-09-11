package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import GenericUtility.WebdriverUtility;

public class UsingValidation {

	public static void main(String[] args) throws InterruptedException {
	
		WebdriverUtility wtil=new WebdriverUtility();
		//launch the browser
		wtil.launchBrowser();
		
		//maximize window
		wtil.maximizeTheWindow();
		
		//navigate to app
		wtil.navigateToAplnStringUr("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		//identify signup text field validate weather it is dispalyed 
		WebElement signup = wtil.driver.findElement(By.name("NewsletterEmail"));
		
		if (signup.isDisplayed()) {
			signup.sendKeys("mobiles");
		} else {
			System.out.println("is not displayed");
		}
		Thread.sleep(3000);

		
	}
}
