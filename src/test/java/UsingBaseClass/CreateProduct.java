package UsingBaseClass;

import org.testng.Reporter;
import org.testng.annotations.Test;

import BaseclassUtility.Baseclass;

public class CreateProduct extends Baseclass {

	@Test
	public void mobile()
	{
		Reporter.log("Mobile",true);
	}
	@Test
	public void toy()
	{
		Reporter.log("Toy",true);
	}
	
	
	
}
