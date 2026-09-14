package tutorialsninja_project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_RF_004 {

	@Test
	public void verifyRegisteringAccountWithoutFillFields() {
		// Launch the Browser
		WebDriver driver = new ChromeDriver();
		// Maximize the window
		driver.manage().window().maximize();
		// Wait Statement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Navigate to an Appliction
		driver.get("https://tutorialsninja.com/demo/");
		// Click on My Account module
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		// Click on Register Link
		driver.findElement(By.linkText("Register")).click();
		//Click on Continue button (without filling the form)
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		//Expected Statements
		String expectedFirstNameWarning= "First Name must be between 1 and 32 characters!";
		String expectedLastNameWarning= "Last Name must be between 1 and 32 characters!";
		String expectedEmailWarning="E-Mail Address does not appear to be valid!";
		String expectedTelephoneWarning="Telephone must be between 3 and 32 characters!";
		String expectedPasswordWarning="Password must be between 4 and 20 characters!";
		String expectedPrivacyPolicyWarning="Warning: You must agree to the Privacy Policy!";
		//Actual Statements
		Assert.assertEquals(driver.findElement(By.xpath("//input[@name='firstname']/following-sibling::div")).getText(),expectedFirstNameWarning);
		Assert.assertEquals(driver.findElement(By.xpath("//input[@name='lastname']/following-sibling::div")).getText(), expectedLastNameWarning);
		Assert.assertEquals(driver.findElement(By.xpath("//input[@name='email']/following-sibling::div")).getText(),expectedEmailWarning);
		Assert.assertEquals(driver.findElement(By.xpath("//input[@name='telephone']/following-sibling::div")).getText(),expectedTelephoneWarning );
		Assert.assertEquals(driver.findElement(By.xpath("//input[@name='password']/following-sibling::div")).getText(),expectedPasswordWarning );
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText(),expectedPrivacyPolicyWarning );
		//Quit the browser
		driver.quit();
	}
}