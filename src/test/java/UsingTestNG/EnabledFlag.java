package UsingTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFlag {

	@Test(priority=2)
	public void login() {
		Reporter.log("LoginTest",true);
	}
	@Test(priority=1)
	public void register() {
		Reporter.log("RegisterTest",true);
	}
	@Test(priority=3,enabled=false)
	public void create() {
		Reporter.log("CreateTest",true);
	}
}
