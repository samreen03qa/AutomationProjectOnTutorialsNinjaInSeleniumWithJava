package GenericUtility;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtility {

	public WebDriver driver = null;

	// 01
	public void launchBrowser() {
		driver = new ChromeDriver();
	}

	// 02
	public void maximizeTheWindow() {
		driver.manage().window().minimize();
	}

	// 03
	public void minimizeTheWindow() {
		driver.manage().window().minimize();
	}

	// 04
	public void fullScreenTheWindow() {
		driver.manage().window().fullscreen();
	}

	// 05
	public void setSizeOfThe_Window(int width, int height)

	{
		Dimension dim = new Dimension(width, height);
		driver.manage().window().setSize(dim);
	}

	// 06
	public void setPositionOfThe_Window(int x, int y) {
		Point p = new Point(x, y);
		driver.manage().window().setPosition(p);
	}

	// 07
	public Dimension getTheWindowSize() {
		Dimension dim = driver.manage().window().getSize();
		return dim;
	}

	// 08
	public Point getTheWindowPostion() {
		return driver.manage().window().getPosition();
	}

	// 09
	public void nsvigateToApln(String url) {
		driver.get(url);
	}

	// 10
	public void navigateToAplnStringUr(String url) {
		driver.navigate().to(url);
	}
	// 11

	// url_url here we give our url62
	public void navigateToApplnUsingurl_url(String url) throws MalformedURLException {
		driver.navigate().to(new URL(url));
	}

	// 12
	public String fetchTheGetTitle() {
		String title = driver.getTitle();
		return title;
	}

	// 13
	public String fetchTheGetCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	// 14
	public String fetchThePageSource() {
		String sc = driver.getPageSource();
		return sc;
	}

	// 15
	public void navigateToPreviousWp() {
		driver.navigate().back();
	}

	// 16
	public void navigateToNextWp() {
		driver.navigate().forward();
	}

	// 17
	public void refreshTheWindow() {
		driver.navigate().refresh();
	}

	// 18
	// it fetch the windowid
	public String fetchTheWindowID() {
		String wid = driver.getWindowHandle();
		return wid;
	}

	// 19
	// fetch the all the windowids
	// ids are unique thats why we use set<string>
	public Set<String> fetchTheWindowAIIIDS() {
		Set<String> wids = driver.getWindowHandles();
		return wids;
	}

	// 20
	public void waitForAnElement(long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

	// 21
	public void waitForElementVisibility(long time, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	// 23
	public void waitForElementToBeVisible(long time, String title) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.titleContains(title));
	}

	// 24
	public void switchToWindow(String wid) {
		driver.switchTo().window(wid);
	}

	// 25
	public void switchToFrame_Index(int index) {
		driver.switchTo().frame(index);
	}

	// 26
	public void switchToFrame_IdName(String idname) {
		driver.switchTo().frame(idname);
	}

	// 27
	public void switchToFrame_Webelement(String webelement) {
		driver.switchTo().frame(webelement);
	}

	// 28
	public void quitTheBrowser() {
		driver.quit();
	}

	// 29
	public void closeTheBrowser() {
		driver.close();
	}

	// 30
	public void waitForEleToBeVisible_FW(long time, long polligtime, WebElement ele) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(time));
		wait.pollingEvery(Duration.ofSeconds(polligtime));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(ele));

	}

}
