package TestNG_Sceenarios;

import org.testng.Reporter;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class UsingTNG {
@Test (dependsOnMethods = "register")
public void login() {
	Reporter.log("login",true);
	
}
@Test (priority=1,enabled=true)
public void register() {
	Reporter.log("register",true);
	
}
@Test (priority=3)
public void create() { 
	Reporter.log("create",true);
}
 
	@Test (priority=3,invocationCount=5,threadPoolSize=5)
	public void update() {
		Reporter.log("update",true);

	
	
}

}
