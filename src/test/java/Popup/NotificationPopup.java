package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NotificationPopup {
@Test
	public void handlingNotificationPopup() throws InterruptedException{
		//ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("--disable-notifications");
	//	opt.addArguments("--disable-geoloction");
		
		//// launch browser
        WebDriver driver = new ChromeDriver();

        // maximize window
        driver.manage().window().maximize();

        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // open application
        driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");

        Thread.sleep(3000);
// identify notifaction and click on it
        driver.findElement(By.id("browNotButton")).click();
		
	}

}
