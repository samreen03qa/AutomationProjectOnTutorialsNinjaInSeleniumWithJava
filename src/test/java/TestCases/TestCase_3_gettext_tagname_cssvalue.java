package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_3_gettext_tagname_cssvalue {

	public static void main(String[] args) {

		//launch the Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to 
		driver.get("https://demowebshop.tricentis.com/");
		
		//getText()
		WebElement msg= driver.findElement(By.xpath("//strong[text()='Featured products']"));
		
		 String textMessage = msg.getText();
		 
		 System.out.println(textMessage);
		 
		 //getTagName()
		 System.out.println(msg.getTagName());
		 
		 //getCssValue()
		 WebElement addtocart = driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")); 
		 
		 String color = addtocart.getCssValue("background");
		 
		 System.out.println(color);
		 
		 
		 
	}

}
