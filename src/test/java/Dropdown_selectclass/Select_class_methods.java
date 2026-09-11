package Dropdown_selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_class_methods {

	public static void main(String[] args) {

		  //launch the Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
	
		//navigate to 
		driver.get("https://www.selenium.dev/selenium/web/selectPage.html");
		
		//locate the dropdown using select tag
		WebElement dropdown1 = driver.findElement(By.id("selectWithMultipleEqualsMultiple"));
		
		//use select by class
		Select sel=new Select(dropdown1);
		
		//select by index
		//sel.selectByIndex(2);
		
		//check the dropdown is single or multiselect
		//System.out.println(sel.isMultiple());
		
		//select by visible
		//sel.selectByVisibleText("cheddar");
		
		//deselect visible text
		//sel.deselectAll();	
		
		//first selected option
		//System.out.println(sel.getFirstSelectedOption().getText());
		
		List<WebElement> allSelected = sel.getAllSelectedOptions();
		
		for (WebElement ref : allSelected) 
		
	{
	System.out.println(ref.getText());		
		}
		
		List<WebElement> allOpthions = sel.getOptions();
		
		for (WebElement webElement : allOpthions) {
			System.out.println(" "+webElement.getText());
			
		}
		
		}

}
