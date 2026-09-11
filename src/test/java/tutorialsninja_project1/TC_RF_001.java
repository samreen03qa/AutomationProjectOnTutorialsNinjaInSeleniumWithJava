package tutorialsninja_project1;

import java.util.Date;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_RF_001 {

	@Test
	public void verifyRegisterWithMandatoryFields() {
		
		// Launch the Browser
		WebDriver driver=new ChromeDriver();
		//Wait statement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
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
		driver.findElement(By.id("input-email")).sendKeys(generateNewEmail());
		//Enter Telephone number in Telephone text field
		driver.findElement(By.id("input-telephone")).sendKeys("8769543886");
		//Enter password in Password text field
		driver.findElement(By.id("input-password")).sendKeys("12345");
		//Enter confirm password in Confirm Password Text Field
		driver.findElement(By.id("input-confirm")).sendKeys("12345");
		//Select the Privacy Policy
		driver.findElement(By.name("agree")).click();
		//Click on Continue Button
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		String expectedHeading = "Your Account Has Been Created!";
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='content']//h1")).getText(),expectedHeading);
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
		//Close the broswer
		driver.close();
	}

	public String generateNewEmail() {
		 return new Date().toString().replaceAll("\\s","").replaceAll("\\:","")+"@gmail.com";
		
	}
	
}
