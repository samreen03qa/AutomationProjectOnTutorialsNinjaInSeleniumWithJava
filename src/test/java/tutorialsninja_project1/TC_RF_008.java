package tutorialsninja_project1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_RF_008 {

	@Test
	public void verifyRegisteringAccountByProvidingMismatchingPasswords() {
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
		// Enter First Name in First Name text field
		driver.findElement(By.id("input-firstname")).sendKeys("Samreen");
		// Enter last Name in last Name text field
		driver.findElement(By.id("input-lastname")).sendKeys("Begum");
		// Enter E-Mail id in E-Mail text field
		driver.findElement(By.id("input-email")).sendKeys(generateNewEmail());
		// Enter Telephone Number in Telephone text field
		driver.findElement(By.id("input-telephone")).sendKeys("6985741523");
		// Enter Password in Password text field
		driver.findElement(By.id("input-password")).sendKeys("12345");
		// Enter Confirm Password in Password Confirm text field
		driver.findElement(By.id("input-confirm")).sendKeys("abcde");
		// Click on Yes option for Subscribe
		driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
		// Select Privacy Policy option
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		// Click on Continue button
		driver.findElement(By.xpath("//input[@value='Continue']")).click();

		// Expected Result
		String expectedWarningMessage = "Password confirmation does not match password!";
		// Actual Result
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='col-sm-10']//div[text()='Password confirmation does not match password!']")).getText(), expectedWarningMessage);
		//Quit browser
		driver.quit();
	}

	public String generateNewEmail() {
		return new Date().toString().replaceAll("\\s", "").replaceAll("\\:", "") + "@gmail.com";

}
}
