package UsingTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {

	/* @Test
	public void demot est()
	{
		System.out.println("Demotest");
		Reporter.log("Demotest",true);
	} */
	@Test(priority=2,dependsOnMethods="register")
	public void login() {
		Reporter.log("LoginTest",true);
	}
	@Test(priority=1)
	public void register() {
		Reporter.log("RegisterTest",true);
	}
	@Test(priority=3)
	public void create() {
		Reporter.log("CreateTest",true);
	}
}
