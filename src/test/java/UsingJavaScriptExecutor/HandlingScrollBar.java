package UsingJavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingScrollBar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		
		//navigate to an application
		driver.get("");
		Thread.sleep(3000);
		
		//handle the scroll bar
		//->1. Hardcoded coordinates
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,700)");
		Thread.sleep(3000);
		
		//->2. Element Reference
		WebElement mobile= driver.findElement(By.xpath(""));
		js.executeScript("argument[0].scrollIntView(true)",mobile);
		
		//->3.Element coordinates
		int x=mobile.getLocation().getX();
		int y=mobile.getLocation().getY();
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		//->4.Scroll till top
		js.executeScript("window.scrollBy(0,document.body.scrollHight)");
		Thread.sleep(3000);
		
		//->5.scroll till bottom
		js.executeScript("window.scrollBy(0,document.body.scrollHight)");
		
		//Navigate to another webpage
		String url="";
		js.executeScript("window.location=arguments[0]",url);
		
		//disabled elements -->text field and button
		driver.findElement(By.xpath("")).click();
		Thread.sleep(3000);
		
		//handling disabled tf and enabled tf
		WebElement disabledTF = driver.findElement(By.id("name"));
		js.executeScript("arguments[0].value=argument[1]", disabledTF,"selenium");
		
		//click on button section
		driver.findElement(By.xpath("")).click();
		
		
		//again click on disabled link
				driver.findElement(By.linkText("Disabled")).click();
				Thread.sleep(3000);
				
		//identify yes button and click on it
				WebDriver yes=driver.findElement(By.id("btn_abc"));
				Thread.sleep(3000);
				
		//identify disabled checkbox and click on it
				WebDriver discheckbox=driver.findElement(By.id("submit"));
				js.executeScript("arguments[0].removeAt", args)
	
		
	}
}
