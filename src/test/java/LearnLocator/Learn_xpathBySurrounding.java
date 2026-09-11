package LearnLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_xpathBySurrounding {

	public static void main(String[] args) {


		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to application
		driver.get("https://demowebshop.tricentis.com/");
		
		//xPath by surrounding
		driver.findElement(By.xpath("//a[text()='14.1-in]")).click();

	}

}
