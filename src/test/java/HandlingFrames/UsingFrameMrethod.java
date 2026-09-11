package HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsingFrameMrethod {
@Test
public void frameEx3e() throws InterruptedException {
	//launch the browser
	
	WebDriver driver=new ChromeDriver();
	
	//maximize the window
	driver.manage().window().maximize();
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//navigate to an application
driver.get("https://www.zomato.com/india");	
	
	//identify login link and click on it
driver.findElement(By.linkText("Log in")).click();
Thread.sleep(3000);

//switch the driver control to the frame
driver.switchTo().frame("auth-login-ui");
Thread.sleep(3000);

//identify phno text field and enter the mobile number
driver.findElement(By.cssSelector("input[type='number']")).sendKeys("0987654321");
Thread.sleep(3000);

//close the frame
driver.findElement(By.cssSelector("i[aria-label=\"close Mobal\"]")).click();
Thread.sleep(3000);

//switch back to main webpage
driver.switchTo().defaultContent();
Thread.sleep(3000);

//identify add restaurant and click on it
driver.findElement(By.linkText("Add restaurant")).click();
Thread.sleep(3000);

//close the 
} 
@Test
public void hiddenDivision() throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.ixigo.com/?utm_source=Brand_Ggl_Search&utm_medium=paid_search_google&utm_campaign");
Thread.sleep(3000);

driver.findElement(By.xpath("//span[.='From']")).click();	
Thread.sleep(3000);

driver.findElement(By.xpath("//label[.='From']/following-sibling::input")).sendKeys("hyder");
Thread.sleep(3000);

driver.findElement(By.xpath("//span[contains(.,'Telangana')]")).click();	
Thread.sleep(3000);

driver.findElement(By.xpath("//label[.='To']/following-sibiling::input")).sendKeys("bang");
Thread.sleep(3000);

driver.findElement(By.xpath("//span[contains(.,'Bangalore')]")).click();
Thread.sleep(3000);



	
	
}



}
