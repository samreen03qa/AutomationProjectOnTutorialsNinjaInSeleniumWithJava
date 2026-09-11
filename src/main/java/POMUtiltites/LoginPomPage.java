package POMUtiltites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPomPage {

	//declare
	@FindBy(xpath="//h1[text()='Login']")
	private WebElement header;
	
	@FindBy(name="email")
	private WebElement username;

	@FindBy(name="pass")
	private WebElement password;

	@FindBy(xpath="//span[text()='log in']")
	private WebElement login;

	@FindBy(xpath="//span[text()='Forgotten password?']")
	private WebElement forgotpassword;

	//Initialize
	public LoginPomPage(WebDriver driver) {
		
	}
	
}
