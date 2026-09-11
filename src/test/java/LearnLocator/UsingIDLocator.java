package LearnLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIDLocator {

	public static void main(String[] args) throws InterruptedException {

		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an app
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Thread.sleep(10000);
		
		//identify name text field and enter text in it
		driver.findElement(By.id("name")).sendKeys("Samreen");
		
		//identify EmailId text field and enter text in it
		driver.findElement(By.id("email")).sendKeys("Sam@333.com");
		
		//identify password text field and enter text in it
		driver.findElement(By.id("password")).sendKeys("Sammy123");
		
		Thread.sleep(5000);
		
		//quick the browser
		//driver.quit();
		
	
		
		}

}
