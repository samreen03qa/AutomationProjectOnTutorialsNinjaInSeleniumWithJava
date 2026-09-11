package Autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestion {

	private static WebElement ref;

	public static void main(String[] args) throws InterruptedException {

		//launch the Chrome Browser
				WebDriver driver = new ChromeDriver();
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//navigate to flipkart
				driver.get("https://www.flipkart.com/");
				
				Thread.sleep(5000);
				
				driver.findElement(By.name("q")).sendKeys("watch");
				
				Thread.sleep(3000);
				
				List<WebElement> autoSuggetions = driver.findElements(By.xpath("//li[@class=\"Swx5kP\"]"));
				
				for (WebElement webElement : autoSuggetions) {
				
					System.out.println(ref.getText());
					
				}
				
				
				
	}

}
