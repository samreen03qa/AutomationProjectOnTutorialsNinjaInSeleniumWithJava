package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize_getlocation_getrectMethods {

	public static void main(String[] args) {

		        //launch the Chrome Browser
				WebDriver driver = new ChromeDriver();
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//navigate to 
				driver.get("https://demowebshop.tricentis.com/");
				
				WebElement subButton=driver.findElement(By.id(""));
				
				//get the size of the webelement
				System.out.println(subButton.getSize());
				
				//get the location of the webelement
				System.out.println(subButton.getLocation());
				
				//get the size and location of the webelement
				System.out.println(subButton.getRect().getX());
	}

}
