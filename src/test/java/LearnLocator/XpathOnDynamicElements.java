package LearnLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOnDynamicElements {

	public static void main(String[] args) {
		
		//launch the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an app
		driver.get("https://www.amazon.in/");
		
		//search text field and enter text in it
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		
		//click on search button
		driver.findElement(By.id("nav-search-submit-button")).click();
 	
		//find the dynamic element
		driver.findElement(By.xpath("//span[text()='realme P4x 5G Smartphone, 6GB RAM + 128GB Storage, Matte Silver']/../../../.."));
	}
}
