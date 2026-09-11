package UsingJavaScriptExecutor;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingScrollBar2 {
	@Test
	public void javaScriptExe() throws InterruptedException, IOException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to an application
		driver.get("https://www.amazon.in/");

		Thread.sleep(3000);
//scroll the webpage using JSE
		// hardcoded coordinates
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);

		// scroll using element reference
		WebElement backtotop = driver.findElement(By.id("navBackToTop"));
		js.executeScript("argument[0].scrollIntoView(true)", backtotop);
		Thread.sleep(3000);

		// close the browser
	}

	@Test
	public void scrollElementRef() throws InterruptedException, IOException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to an application
		driver.get("https://www.amazon.in/");

		Thread.sleep(3000);
//scroll the webpage using JSE
		// hardcoded coordinates
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);

		// scroll using element reference
		WebElement backtotop = driver.findElement(By.id("navBackToTop"));

		Thread.sleep(3000);
		// scroll the element coordinates
		int xaxis = backtotop.getLocation().getX();
		int yaxis = backtotop.getLocation().getY();
		js.executeScript("window.scrollby(" + xaxis + "," + yaxis + ")");
		// scroll till bottom of the webpage

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);

		// scroll till top of the webpage
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);

	}

	@Test
	public void scrollElementRefWithValue() throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to an application
		driver.get("https://demoapps.qspiders.com/ui");

		Thread.sleep(3000);

		// click on disbled link
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();

		// identify disabled tf
		WebElement dis_nameTF = driver.findElement(By.id("name"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=arguments[1]", dis_nameTF, "Selenium");
		Thread.sleep(3000);
	}

	@Test
	public void handlingDisableButton() throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to an application
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDisabled?sublist=4");

		Thread.sleep(3000);

		// identify disabled checkbox
		WebElement disCB = driver.findElement(By.id("submit"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('disabled')", disCB);
		Thread.sleep(3000);
		disCB.click();

		Thread.sleep(3000);

	}

	@Test
	public void handlingRegUsingJSE() throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// navigate to an application
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");

		Thread.sleep(3000);

		// identifying name tf
		WebElement r_name = driver.findElement(By.id("name"));
		//identifying emailid tf
		WebElement r_email_id = driver.findElement(By.id("email"));
		//identify register button
		WebElement reg_button = driver.findElement(By.xpath("//button[text()='Register']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=arguments[1]", r_name, "Samreen");
		js.executeScript("arguments[0].value=arguments[1]", r_email_id, "samsamreenhyd@gmail.com");
		js.executeScript("arguments[0].click()",reg_button);

	}
	@Test
	public void getURL() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//navigate to an application using JSE
		String url="";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location=arguments[0]", url);
		Thread.sleep(3000);

		//fetch the title
		System.out.println(js.executeScript("return document.title"));
		
		//fetch the url
		System.out.println(js.executeScript("return document.URL"));
		Thread.sleep(3000);

		//refresh the webpage
		js.executeScript("history.go(0)");
		Thread.sleep(3000);

	}

	

}