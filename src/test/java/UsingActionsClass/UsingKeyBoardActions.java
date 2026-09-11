package UsingActionsClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UsingKeyBoardActions {

	@Test
	public void keyBoardActions() throws InterruptedException {
		// Launch the browser
				WebDriver driver = new ChromeDriver();

				// maximize the window
				driver.manage().window().maximize();

				// Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				// navigate to an application
				driver.get("https://www.google.com/");

				Thread.sleep(3000);

				// identify an el
				Actions act = new Actions(driver);

				//identify search bar
				WebElement search=driver.findElement(By.id("APjfqb"));
				Thread.sleep(3000);
				// mouse hover to search bar
				act.moveToElement(search).perform();
				Thread.sleep(3000);

				//click on search
				act.click(search).perform();
				Thread.sleep(3000);

				//enter text in uppercase
				act.keyDown(Keys.SHIFT).sendKeys("selenium").keyUp(Keys.SHIFT).perform();
				
				Thread.sleep(3000);
				act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
				Thread.sleep(3000);

				}
	@Test
	public void autoSugg() throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to an application
		driver.get("https://www.google.com/");

		Thread.sleep(3000);
//identify search text field
		driver.findElement(By.name("q")).sendKeys("sele");
		Thread.sleep(3000);

		//fetch all the auto sugg
		List<WebElement> autosugg = driver.findElements(By.xpath("//span[text()='sele']"));
		
		for(WebElement ele: autosugg) {
			System.out.println(ele.getText());
		}
		
	}
	@Test
	public void autoSuggUsingIndex() throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to an application
		driver.get("https://www.google.com/");

		Thread.sleep(3000);
		//identify search text field
				driver.findElement(By.name("q")).sendKeys("sele");

		//fetch all the auto sugg
				List<WebElement> autosugg = driver.findElements(By.xpath("//span[text()='sele']"));
		for(WebElement ele: autosugg) {
			System.out.println(ele.getText());
		
		if(ele.getText().contains("selenium"));{
			ele.click();
		}
		}
		
		
		
		
	}	
		
		
		
		
	
}
