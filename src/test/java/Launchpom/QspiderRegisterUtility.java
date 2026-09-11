package Launchpom;

import GenericUtility.WebdriverUtility;
import POMUtiltites.QspiderLoginPom;

public class QspiderRegisterUtility {

	public static void main(String[]args) {
		
		WebdriverUtility wutil=new WebdriverUtility();
		//launch the browser
		wutil.launchBrowser();
		
		//maximize the window
		wutil.maximizeTheWindow();
		
		//implicit wait
		wutil.waitForAnElement(10);
		
		//navigate to app
		wutil.navigateToAplnStringUr("https://demoapps.qspiders.com/ui?scenario=1");
		
		//create obj for pom class
		QspiderLoginPom qs=new QspiderLoginPom(wutil.driver);
		qs.getEmailid().sendKeys("sel123@gmail.com");
		qs.getLoginpwd().sendKeys("Sam@973");
		qs.getLoginbutton().click();
	}
}
