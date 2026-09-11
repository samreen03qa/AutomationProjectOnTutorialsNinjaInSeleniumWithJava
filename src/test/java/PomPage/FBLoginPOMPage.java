package PomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPOMPage {

	//Declare
	@FindBy(name="email")
	private WebElement emailTF;
	@FindBy(name="pass")
	private WebElement passwordTF;
	@FindBy(xpath="//span[text()='Log in']")
	private WebElement loginBTN;
	
	//initialize
	public FBLoginPOMPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilize 
	public void getEmailTF(String email) {
		emailTF.sendKeys(email);
	}
public void getPasswordTF(String pswd) {
	passwordTF.sendKeys(pswd);
}
}
