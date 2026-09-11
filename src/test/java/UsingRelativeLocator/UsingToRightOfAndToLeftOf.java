package UsingRelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingToRightOfAndToLeftOf {

	public static void main(String[] args) throws InterruptedException {

		//Launch the browser
				WebDriver driver=new ChromeDriver();
				
				//maximize the window
				driver.manage().window().maximize();
				
				//navigate to an app
				driver.get("https://www.google.com/");
				 Thread.sleep(3000);

				//identify password text field
				 https://www.google.com/;
				
				//identify username text field
			 driver.findElement(RelativeLocator.with(By.tagName("input")).above(password)).sendKeys("student");
			

	}

}
