package LearnLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Learn_id {

	public static void main(String[] args)throws InterruptedException {
		
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to application
		driver.get("https://www.amazon.in/");
		
		//java wait statement
		Thread.sleep(5000);
		
		//locate the search box using id locator
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		
		//enter the data
		searchbox.sendKeys("hp");


	}

}
