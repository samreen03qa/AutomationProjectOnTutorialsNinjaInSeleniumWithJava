package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getterMethods {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window 
		driver.manage().window().maximize();
		
		//navigate to an application
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		WebElement reg = driver.findElement(By.linkText("Register"));
		
		//fetch the text
		System.out.println("Text : "+reg.getText());
		
		//fetch the attribute value 
		System.out.println("Attribute : "+reg.getAttribute("href"));
		
		//fetch the tagname
		System.out.println("Tagname : "+reg.getTagName());
		
		//fetch the size
		System.out.println("ele size : "+reg.getSize());
		
		//fetch the location
		System.out.println("ele location : "+reg.getLocation());
		
		//fetch the width and y axis
		Rectangle rec = reg.getRect();
		
		System.out.println("width : "+rec.getWidth());
		System.out.println("width : "+rec.getY());
		
		//c;ose the browser 
		driver.close();
		
	}
}
