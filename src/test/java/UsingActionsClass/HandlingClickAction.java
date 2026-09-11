package UsingActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingClickAction {
	@Test
	public void waitTest() throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//identify right click button and perform right click action
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions(driver);
		act.contextClick(rightclick).perform();
		
		Thread.sleep(3000);
		
		//refresh
		driver.navigate().refresh();
		Thread.sleep(3000);

		//identify double click button and perform double click action
			WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(doubleclick).perform();
		Thread.sleep(3000);

			
		
		
		
	
}
}