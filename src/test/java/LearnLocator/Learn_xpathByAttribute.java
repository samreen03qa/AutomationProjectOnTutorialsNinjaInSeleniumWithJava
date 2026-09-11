package LearnLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_xpathByAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open the browser
				WebDriver driver=new ChromeDriver();
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//navigate to application
				driver.get("https://www.youtube.com/");
				
				//xPath by attributes
				driver.findElement(By.xpath("//input[@name='search_query']")).click();

	}

}
