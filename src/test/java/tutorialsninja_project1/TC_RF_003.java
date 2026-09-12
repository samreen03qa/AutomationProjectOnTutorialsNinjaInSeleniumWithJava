package tutorialsninja_project1;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_RF_003 {

	@Test
	public void verifyRegisterWithSubcribe() {
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
		driver.findElement(By.id("input-password")).sendKeys("SNxq5zTh2U@ibk");
		// Enter Confirm Password in Password Confirm text field
		driver.findElement(By.id("input-confirm")).sendKeys("SNxq5zTh2U@ibk");
		// Click on Yes option for Subscribe
		driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
		// Select Privacy Policy option
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		// Click on Continue button
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		String expectedHeading = "Your Account Has Been Created!";
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content']//h1")).getText(), expectedHeading);
		String actualProperDetailsOne = "Congratulations! Your new account has been successfully created!";
		String actualProperDetailsTwo = "You can now take advantage of member privileges to enhance your online shopping experience with us.";
		String actualProperDetailsThree = "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
		String actualProperDetailsFour = "contact us";

		String expectedProperDetails = driver.findElement(By.id("content")).getText();

		Assert.assertTrue(expectedProperDetails.contains(actualProperDetailsOne));
		Assert.assertTrue(expectedProperDetails.contains(actualProperDetailsTwo));
		Assert.assertTrue(expectedProperDetails.contains(actualProperDetailsThree));
		Assert.assertTrue(expectedProperDetails.contains(actualProperDetailsFour));

		driver.findElement(By.linkText("Continue")).click();

		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		// Close the broswer
		driver.close();
	}

	public String generateNewEmail() {
		return new Date().toString().replaceAll("\\s", "").replaceAll("\\:", "") + "@gmail.com";

	}

}
