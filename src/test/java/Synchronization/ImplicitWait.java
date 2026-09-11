package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWait {
 
	@Test
	public void waitTest() throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an application
		driver.get("https://shopperstack.com/");
		
		//Thread.sleep(50000);
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//identify login button and click on it
		driver.findElement(By.id("loginBtn")).click();
		
		//close the browser
		driver.quit();
}
}