package Test_Method_Operatins;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Ignoring_TestCase {

	@Test (priority = 1)
	void login() {
		Assert.assertTrue(true);
	}
	
	@Test (priority = 2, dependsOnMethods = {"login"})
	void profile() {
		Assert.assertTrue(true);
	}
	
	@Test (priority = 3, dependsOnMethods = {"profile"})
	void search() {
		Assert.assertTrue(true);
	}
	
	@Test (priority = 4, dependsOnMethods = {"search"}, enabled = false)
	void apply() {
		Assert.assertTrue(true);
	}
	
	@Test (priority = 5, dependsOnMethods = {"login"})
	void logout() {
		Assert.assertTrue(true);
	}
}
