package LearnLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_xpath_by_multiple_attribute {

	public static void main(String[] args) {

		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to application
		driver.get("https://www.youtube.com/");
		
		//xPath by multiple attributes
		driver.findElement(By.xpath("//input[@class='ytSearchboxComponentInput yt-searchbox-input title' and @name='search_query']")).sendKeys("unstoppable");
		WebElement searchicov= driver.findElement(By.xpath("//button[@title='Search']"));
	searchicov.click();
	}
}
