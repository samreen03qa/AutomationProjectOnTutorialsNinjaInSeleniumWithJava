package UsingTakesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenShot {
	@Test
	public void autoSuggUsingIndex() throws InterruptedException, IOException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to an application
		driver.get("https://www.amazon.in/");

		Thread.sleep(3000);
//Take the webpage screenshot 
		//step 01:downcast takescreenshot with
		//webdriver ref variable [browser driver address]

	TakesScreenshot ts=(TakesScreenshot)driver;
	
	//step2: take the screenshot and it will be stored in the src(temp file)
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	//step3:create an empty file [pf]
File dest=new File("./samsamsam/amazon.png");

//step4: copy screenshot from strc to dest
//FileHandler.copy(scr.dest);
	
	FileUtils.copyFile(src, dest);
	}
	
	
}