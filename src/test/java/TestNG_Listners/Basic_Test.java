package TestNG_Listners;

import org.testng.Assert;
import org.testng.annotations.*;

//@Listeners(TestNG_Listners.Basic_Listener.class)
public class Basic_Test {

	@Test (priority = 1)
	void login() {
		Assert.assertTrue(true);
	}
	
	@Test (priority = 1)
	void search() {
		Assert.assertTrue(false);
	}
	
	@Test(priority = 3, dependsOnMethods = {"search"})
	void apply() {
		Assert.assertTrue(true);
	}
	
	@Test (priority = 4)
	void logout() {
		Assert.assertTrue(true);
	}
}
