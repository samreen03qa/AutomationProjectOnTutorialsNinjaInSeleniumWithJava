package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_2_registerlink {

	public static void main(String[] args) {

		//launch the Chrome Browser
				WebDriver driver = new ChromeDriver();
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//navigate to 
				driver.get("https://demowebshop.tricentis.com/");
				
				driver.findElement(By.linkText("Register")).click();

				//
				driver.findElement(By.id("gender-female")).click();

				driver.findElement(By.id("FirstName")).sendKeys("Samreen");
				
				driver.findElement(By.id("LastName")).sendKeys("Begum");

				driver.findElement(By.id("Email")).sendKeys("begum333@gmail.com");
				
				driver.findElement(By.id("Password")).sendKeys("sammi03");
				
				driver.findElement(By.id("ConfirmPassword")).sendKeys("sammi03");
				
				driver.findElement(By.id("register-button")).submit();




				
	}

}
