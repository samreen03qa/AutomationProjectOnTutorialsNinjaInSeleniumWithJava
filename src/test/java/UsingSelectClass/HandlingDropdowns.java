package UsingSelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingDropdowns {

	@Test
	public void waitTest() throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//navigate to an application
		driver.get("https.//www.amazon.in/");
	
		//Identify dropdown element
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
	
		//select the option using index
		Select s=new Select(dropdown);
		s.selectByIndex(7);
		Thread.sleep(2000);
		
		//Select the option using visible text
		s.selectByValue("search-alias=computers");
		Thread.sleep(2000);

		//select the option using visible text
		s.selectByVisibleText("Musical Instruments");
		Thread.sleep(2000);

		//using deselect method on single select dd
		//--->unsupportedOperationException
		s.deSelectByContainsVisibleText("Musical Instruments");
		
		//check weather dd is multi select or single select
		if (s.isMultiple()) {
			System.out.println("Multi select DD");
		} else {
			System.out.println("Single Select DD");
		}
		/*fetch all the options from the dropdown
		List<WebElement> options = s.getOptions();
		for(WebElement ele: options) {
			System.out.println("All options :"+ele.getText());
		}
		//fetch all the select options
				List<WebElement> selOpts = s.getAllSelectedOptions();
				for(WebElement ele: selOpts) {
					System.out.println("selected options :"+ele.getText());
				}
				/fetch the First selected options 
				WebElement opt = s.getFirstSelectedOption();
				for(WebElement ele: options) {
					System.out.println("First select options :"+opt.getText());}*/
				}
	
	
		
					
				
		
		
		
		
		
		
		
		
		
		
		
		
	}

