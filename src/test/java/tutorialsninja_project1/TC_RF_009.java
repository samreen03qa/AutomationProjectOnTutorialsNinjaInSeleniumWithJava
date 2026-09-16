package tutorialsninja_project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_RF_009 {
	@Test
	public void verifyRegistringAccountUsingExistingEmail() {
		
		// Launch the Browser
		WebDriver driver=new ChromeDriver();
		//Wait statement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Maximize the window
		driver.manage().window().maximize();
		//Navigate to an Appliction
		driver.get("https://tutorialsninja.com/demo/");
		//Click on "My Account"
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		//Select Register option
		driver.findElement(By.linkText("Register")).click();
		//Enter text in First Name Field
		driver.findElement(By.id("input-firstname")).sendKeys("Samreen");
		//Enter text in Last Name Field
		driver.findElement(By.id("input-lastname")).sendKeys("Begum");
		//Enter EmailID in Email text field
		driver.findElement(By.id("input-email")).sendKeys("samsam@gmail.com");
		//Enter Telephone number in Telephone text field
		driver.findElement(By.id("input-telephone")).sendKeys("8769543886");
		//Enter password in Password text field
		driver.findElement(By.id("input-password")).sendKeys("55555");
		//Enter confirm password in Confirm Password Text Field
		driver.findElement(By.id("input-confirm")).sendKeys("55555");
		// Click on Yes option for Subscribe
		driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
		// Select Privacy Policy option
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		// Click on Continue button
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		//Expected Result
		String expectedWarningMessage= "Warning: E-Mail Address is already registered!";
		//Actual Result
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText(), expectedWarningMessage);
		//Quit the browser
		driver.quit();
	}
	}		
