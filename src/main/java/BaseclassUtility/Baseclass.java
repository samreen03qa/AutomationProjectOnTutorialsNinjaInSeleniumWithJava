package BaseclassUtility;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {

	@BeforeSuite
	public void bs()
	{
		Reporter.log("bs-connect to DB", true);
	}
	
	@AfterSuite
	public void as()
	{
		Reporter.log("as-disconnect to DB", true);
	}
	@BeforeTest
	public void bt("")
	{
		Reporter.log();
	}
	@AfterTest
	public void at()
	{
		Reporter.log();
	}
	@BeforeClass
	public void bc()
	{
		Reporter.log();
	}
	@AfterClass
	public void ac()
	{
		Reporter.log();
	}
}
