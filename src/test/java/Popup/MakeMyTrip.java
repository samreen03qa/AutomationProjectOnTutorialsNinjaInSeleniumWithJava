package Popup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MakeMyTrip {
	/*@Test
	public void handlingPopupOnMakeMyTrip() throws InterruptedException, IOException {
		// Launch the browser
		WebDriver driver = new EdgeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to an application
		driver.get("https://www.makemytrip.com/flights/");
		Thread.sleep(3000);
		
		//identify FROM TF and enter Text 
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.sendKeys("Hyderabad");
		Thread.sleep(3000);

		//identify TO TF and enter text in it
		WebElement to = driver.findElement(By.id("toCity"));
				to.sendKeys("Goa");		
}*/

    @Test
    public void Hiddendivision() throws InterruptedException {

        // launch browser
        WebDriver driver = new ChromeDriver();

        // maximize window
        driver.manage().window().maximize();

        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // open application
        driver.get("https://www.makemytrip.com/");

        Thread.sleep(7000);

        // close popup
        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

        Thread.sleep(5000);

       //identify FROM City and click

        driver.findElement(By.xpath("//span[text()='From']")).click();

        WebElement from =
                driver.findElement(By.xpath("//input[@placeholder='From']"));

        from.sendKeys("banglore");

        Thread.sleep(5000);

        from.sendKeys(Keys.ENTER);

        // identify  TO CITY

        driver.findElement(By.xpath("//span[text()='To']")).click();

        WebElement to =
                driver.findElement(By.xpath("//input[@placeholder='To']"));

        to.sendKeys("GOA");

        Thread.sleep(2000);

        to.sendKeys(Keys.ENTER);

        // identify  DEPARTURE DATE and set

        driver.findElement(By.xpath("//label[@for='departure']")).click();

        Thread.sleep(2000);

        driver.findElement( By.xpath("//div[@aria-label='Tue May 20 2026']")
        ).click();

        //  identify  RETURN DATe

        driver.findElement(By.xpath("//label[@for='return']")).click();

        Thread.sleep(2000);

        driver.findElement( By.xpath("//div[@aria-label='Mon May 25 2026']")
        ).click();

        Thread.sleep(3000);

        driver.quit();
    }
    @Test
    public void popUpOnRedBus() throws InterruptedException {
    	// launch browser
        WebDriver driver = new ChromeDriver();

        // maximize window
        driver.manage().window().maximize();

        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // open application
        driver.get("https://www.redbus.in/");

        Thread.sleep(3000);
        

    	
    	
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}