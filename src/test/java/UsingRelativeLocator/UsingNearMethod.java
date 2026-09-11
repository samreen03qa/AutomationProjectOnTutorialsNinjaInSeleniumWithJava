package UsingRelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingNearMethod {

	public static void main(String[] args) throws InterruptedException {

		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an app
		driver.get("https://www.google.com/");
		 Thread.sleep(3000);
		 
		//identify RelativeLocator 
		 WebElement fi = driver.findElement(By.linkText(""));
		 Thread.sleep(3000);

		 driver.findElement(RelativeLocator.with(By.tagName("a")).near(fi)).click();
		 

	}

}
