package Annotations.Test_Method;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Method_Dependency {

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
	
	@Test (priority = 4, dependsOnMethods = {"search"})
	void apply() {
		Assert.assertTrue(false);
	}
	
	@Test (priority = 5, dependsOnMethods = {"login"})
	void logout() {
		Assert.assertTrue(true);
	}
}
