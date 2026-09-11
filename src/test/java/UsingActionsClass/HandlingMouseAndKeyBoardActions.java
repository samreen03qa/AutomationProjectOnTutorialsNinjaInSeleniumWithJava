package UsingActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingMouseAndKeyBoardActions {
	@Test
	public void autoSuggUsingIndex() throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to an application
		driver.get("https://www.flipkart.com/");

		Thread.sleep(3000);
		
		//find the x and click on it
		driver.findElement(By.className("b3wTIE")).click();
		Thread.sleep(3000);

		//call actions class
		Actions action=new Actions(driver);
		
		//find text field and enter toys
driver.findElement(By.name("q")).sendKeys("Toy");

//find search icon and click on it
driver.findElement(By.xpath("//button[@class='XFwMiH'and @type='submit']")).click();
Thread.sleep(3000);

//find baby and toys and mouse hover
WebElement mousehover = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));

//find puzzels and click on it
action.moveToElement(mousehover).perform();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()='Puzzles']")).click();

//find min price dropdown and select an element
WebElement minprice = driver.findElement(By.xpath("//select[@class='hbnjE2'][1]"));
Select s=new Select(minprice);

//TO check its multi select or single select
if(s.isMultiple()) {
	System.out.println("It is a Multi Select");}

	else {
System.out.println("It is a Single Select");}

s.selectByVisibleText("1000");
Thread.sleep(3000);
//find max price dropdown and select any element
WebElement maxprice = driver.findElement(By.xpath("//select[@class='hbnjE2'][2]"));
Select s1=new Select(maxprice);
s1.selectByVisibleText("5000");

//find newset first element and click on it
driver.findElement(By.xpath("//div[text()='Newest First']")).click();

//scroll till the end element
action.scrollByAmount(0, 4000).perform();

//find the last element and fetch the price
WebElement indiEle = driver.findElement(By.xpath("//a[contains(text(),'BrainyB')]/../a[@class='fb4uj3']/div/div"));

System.out.println(indiEle.getText());
Thread.sleep(3000);
		
		
	}
}
