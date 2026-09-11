package LearnLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingClassNameLocator {

	public static void main(String[] args) throws InterruptedException {

		// launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// navigate to an app
		driver.get("https://practicetestautomation.com/practice-test-login/");

		Thread.sleep(3000);


		// identify EmailId text field and enter text in it
		driver.findElement(By.id("username")).sendKeys("student");

		// identify password text field and enter text in it
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		//identify submit button and click on it
		driver.findElement(By.className("btn")).click();

		Thread.sleep(5000);

		// quick the browser
	//	driver.quit();

	}

}
