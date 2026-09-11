package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get();
		driver.findElement(By.xpath(null));
		driver.switchTo().alert().dismiss();
		String res=driver.findElement(By.id("result")).getText();
		System.out.println(res);
		
	}

}
