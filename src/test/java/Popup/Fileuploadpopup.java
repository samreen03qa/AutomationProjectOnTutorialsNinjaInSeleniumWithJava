package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fileuploadpopup {
@Test
	public void fileupload() throws InterruptedException {

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://the-internet.herokuapp.com/upload");
	driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Admin\\OneDrive\\Desktop\\Data.xlsx");
	Thread.sleep(3000);
	driver.quit();

}
@Test
public void () throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://the-internet.herokuapp.com/upload");
driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Admin\\OneDrive\\Desktop\\Data.xlsx");
Thread.sleep(3000);
driver.quit();

}