package Grouping;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Job_Search {

	//@Test (groups = {"Sanity", "Regression", "Functional"})
	@Test (groups = {"Functional"})
	void clicking() {
		System.out.println("Through Mouse Clicking -)");
		Assert.assertTrue(true);
	}
	
	//@Test (groups = {"Sanity", "Regression", "AdvFunctional"})
	@Test (groups = {"AdvFunctional"})
	void Enter() {
		System.out.println("Through Keyboard Enter -)");
		Assert.assertTrue(true);
	}

}
