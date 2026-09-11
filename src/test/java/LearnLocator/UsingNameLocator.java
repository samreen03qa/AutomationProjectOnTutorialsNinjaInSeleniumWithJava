package LearnLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNameLocator {

	public static void main(String[] args) throws InterruptedException {

		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an app
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(10000);
		
		//identify EmailId text field and enter text in it
		driver.findElement(By.name("email")).sendKeys("Sam@333.com");
		
		//identify password text field and enter text in it
		driver.findElement(By.name("pass")).sendKeys("Sammy123");
		
		Thread.sleep(5000);
		
		//quick the browser
		driver.quit();
	}

}
