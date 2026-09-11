package WebElementMethods;

import org.apache.poi.xwpf.usermodel.BreakClear;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionMetods {

	public static void main(String[] args) throws InterruptedException {

		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an application
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		//navigate to search text field 
		WebElement searchtextfield = driver.findElement(By.name("q"));
		Thread.sleep(3000);

		//enter text in it
		searchtextfield.sendKeys("desktop");
		Thread.sleep(3000);

		//clear text
		searchtextfield.clear();
		Thread.sleep(3000);

		//enter new text
		searchtextfield.sendKeys("mobile");
		
		//click on search button
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		//click on advance search
		driver.findElement(By.id("As")).click();
		
		Thread.sleep(3000);
		//close the browser
		driver.quit();
	}

}
