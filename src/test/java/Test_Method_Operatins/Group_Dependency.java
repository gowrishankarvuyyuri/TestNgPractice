package Test_Method_Operatins;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Group_Dependency {

	@Test (priority = 1, groups = {"sanity"})
	void login() {
		Assert.assertTrue(true);
	}
	
	@Test (priority = 2, groups = {"sanity"})
	void profile() {
		Assert.assertTrue(true);
	}
	
	@Test (priority = 3, dependsOnGroups = {"sanity"}, groups = {"functional"})
	void search() {
		Assert.assertTrue(false);
	}
	
	@Test (priority = 4, dependsOnGroups = {"sanity"}, groups = {"advfunctional"})
	void advsearch() {
		Assert.assertTrue(true);
	}
	
	@Test (priority = 5, dependsOnMethods = {"advsearch"})
	void apply() {
		Assert.assertTrue(true);
	}
	
	@Test (priority = 6, dependsOnMethods = {"login"})
	void logout() {
		Assert.assertTrue(true);
	}
}
