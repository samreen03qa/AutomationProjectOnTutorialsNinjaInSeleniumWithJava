package UsingActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandlingScrollBar {
	@Test
	public void waitTest() throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to an application
		driver.get("https://demoapps.qspiders.com/");

		Thread.sleep(3000);

		// identify an el
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 700).perform();
	}

	@Test
	public void MouseHoverAndClick() throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to an application
		driver.get("https://www.flipkart.com/");

		// find x and click on it
		driver.findElement(By.className("b3wTlE")).click();
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		Actions act = new Actions(driver);
		act.moveToElement(login).click(login).perform();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement more = driver.findElement(By.xpath("//span[text()='More']"));
		act.moveToElement(more).click(more).perform();
		Thread.sleep(3000);

	}

	@Test
	public void dragAndDrop() throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to an application
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);

		// drag and drop element using actions class
		Actions act = new Actions(driver);

		// identify dragable elements
		WebElement drag1 = driver.findElement(By.id("credit2"));

		// identify dropable locations
		WebElement drop1 = driver.findElement(By.id("bank"));

		// identify dragable elements
		WebElement drag2 = driver.findElement(By.id("fourth"));

		// identify dropable locations
		WebElement drop2 = driver.findElement(By.id("amt7"));

		// identify dragable elements
		WebElement drag3 = driver.findElement(By.id("credit1"));

		// identify dropable locations
		WebElement drop3 = driver.findElement(By.id("loan"));

		// identify dragable elements
		WebElement drag4 = driver.findElement(By.id("fourth"));

		// identify dropable locations
		WebElement drop4 = driver.findElement(By.id("amt8"));

		act.dragAndDrop(drag1, drop1).perform();
		Thread.sleep(3000);

		act.dragAndDrop(drag2, drop2).perform();
		Thread.sleep(3000);

		act.dragAndDrop(drag3, drop3).perform();

		Thread.sleep(3000);

		act.dragAndDrop(drag4, drop4).perform();
		Thread.sleep(3000);

		WebElement perfect=driver.findElement(By.id("equal"));
		if(perfect.isDisplayed()) {
			System.out.println(perfect.getText()+" pass");
		}else {
			System.out.println(perfect.getText()+" failed");
		}
	}
	@Test
	public void clickAndHold() throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to an application
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		Thread.sleep(3000);
		
		// drag and drop element using actions class
				Actions act = new Actions(driver);

		//identify holdable element
				WebElement hold = driver.findElement(By.id("circle"));
				act.clickAndHold(hold).perform();
				Thread.sleep(3000);
//to release the element
				act.release(hold).perform();
				Thread.sleep(3000);
	}
	
	
		
}
