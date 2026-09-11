package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandingAlertPopup {

	@Test
	public void alertPopup() throws InterruptedException {
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the windows
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//navigate an application
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//identify JSAlert button and click on it//NoAlertPresentException:
		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		Thread.sleep(3000);
		//handle the alert popup//UnhandledAlertException
		//Alert al=driver.switchTo().alert();
		//System.out.println(al.getText());
		//al.accept();
	//	al.dismiss();
		Thread.sleep(3000);
		//identify result and print
		WebElement result = driver.findElement(By.id("result"));
		System.out.println(result.getText());
		//close the browser
		
		
	}
	@Test
	public void confirmationPopup() throws InterruptedException {
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the windows
		driver.manage().window().maximize();
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//navigate an application
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//identify JSAlert button and click on it//NoAlertPresentException:
		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		Thread.sleep(3000);
		//handle the alert popup//UnhandledAlertException
		//Alert al=driver.switchTo().alert();
		//System.out.println(al.getText());
		//al.accept();
	//	al.dismiss();
		Thread.sleep(3000);
		//identify result and print
		WebElement result = driver.findElement(By.id("result"));
		System.out.println(result.getText());
		//close the browser
		
		
	

}
