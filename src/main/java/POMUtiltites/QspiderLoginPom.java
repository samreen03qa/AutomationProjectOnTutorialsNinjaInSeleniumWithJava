package POMUtiltites;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QspiderLoginPom {
	
	

		//declare
		@FindBy(xpath="//h1[text()='Login']")
		private WebElement loginheader;
		
		@FindBy(name="email")
		private WebElement emailid;

		@FindBy(name="password")
		private WebElement loginpwd;

		@FindBy(xpath="//button[text()='Loginpwd']")
		private WebElement loginbutton;

		
		//Initialize
		public QspiderLoginPom(WebDriver driver) {
			PageFactory.initElements(driver,this);}
			
			//utilization
			public WebElement getLoginheader() {
				return loginheader;
		}
			public WebElement getName() {
				return name;
			}
			public WebElement getEmailid() {
				return emailid;
		}

			public WebElement getLoginpwd() {
				return loginpwd;
		}
			public WebElement getLoginbutton() {
				return loginbutton;
		}			
		
	}



