package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_case_1_pratice {

	public static void main(String[] args) {

		//launch the Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to flipkart
		driver.get("https://www.flipkart.com/");
		
		//locate the search box using id locator
		WebElement searchbox = driver.findElement(By.name("q"));
				
		
		//search of mobile phones
		searchbox.sendKeys("mobile",Keys.ENTER);
		
		//click on 3rd mobile phone
		driver.findElement(By.xpath("(//div[@class='RG5Slk']/child::div)[4]")).click();
	}

}
