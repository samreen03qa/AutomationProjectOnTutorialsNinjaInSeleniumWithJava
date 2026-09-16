package tutorialsninja_project1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_RF_007 {

	@Test
	public void verifyNavigatingToRegisterAccountUsingMultipleWay() {
		//Launch the Browser
		WebDriver driver=new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Wait Statement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Navigate to an Appliction
		driver.get("https://tutorialsninja.com/demo/");
		
		//Click on My Account option
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		//Select Register option
		driver.findElement(By.linkText("Register")).click();
		//Verify Register Page
		Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Register']")).isDisplayed());
		
		//Click on My Account option
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		//Click on Login option
		driver.findElement(By.linkText("Login")).click();
		//Click on Continue button in "New Customer"
		driver.findElement(By.linkText("Continue")).click();
		//Verify Register Page
		Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Register']")).isDisplayed());
		
		//Click on My Account option
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		//Click on Login option
		driver.findElement(By.linkText("Login")).click();
		//click on "Register" from right given list
		driver.findElement(By.xpath("//aside[@id='column-right']//a[text()='Register']")).click();
		//Verify Register Page
		Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Register']")).isDisplayed());
		
		//Quit the browser
		driver.quit();
		}
	}
