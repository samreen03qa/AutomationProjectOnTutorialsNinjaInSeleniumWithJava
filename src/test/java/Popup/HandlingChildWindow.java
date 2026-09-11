package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingChildWindow {
@Test
public void childWindow() throws InterruptedException {
	
	// launch browser
    WebDriver driver = new ChromeDriver();

    // maximize window
    driver.manage().window().maximize();

    // implicit wait
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    // open application
    driver.get("https://www.flipkart.com");

    Thread.sleep(3000);

    //close login popup
    driver.findElement(By.xpath("//span[text()='X']")).click();

	//identify search TF and pass text in it
    driver.findElement(By.name("q")).sendKeys("toys");
    
    //identify search icon and click on it
    driver.findElement(By.xpath("//*[name()='svg'][@width='24']")).click();
    
    //identify the product name and click on it
    driver.findElement(By.linkText("parmi Portable Karaoke Bluetooth Speace")))
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	
	
	
	
}
}
