package UsingListners;

import org.testng.Reporter;
import org.testng.annotations.Test;

import BaseclassUtility.Baseclass;

public class ListenersTest extends Baseclass{

	@Test
	public void demotest() {
		Reporter.log("Test Scenario Execution",true);
	}
	
	@Test
	public void failedTest() {
		Reporter.log("Test Scenario Execution to fail",true);
	}
	
	@Test(dependsOnMethods = "failedTest")
	public void skippedTest() {
		Reporter.log("Test Scenario Execution to skip",true);
	}
}
