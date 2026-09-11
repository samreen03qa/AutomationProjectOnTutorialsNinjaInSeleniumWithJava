package LearnLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_linktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open the browser
				WebDriver driver=new ChromeDriver();
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//navigate to application
				driver.get("https://demowebshop.tricentis.com/");
				
				//
				driver.findElement(By.linkText("Facebook")).click();
				
	}

}
