package LearnLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_classname {

	public static void main(String[] args) {

		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//navigate to application
		driver.get("https://pistahouse.in/");
				
		//locate the search box using id locator
		driver.findElement(By.className("newsletter_input"));
				
				
				
	
	}

}
