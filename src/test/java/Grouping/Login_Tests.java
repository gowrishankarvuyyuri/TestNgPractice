package Grouping;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_Tests {

	@Test(groups = {"Sanity"})
	void username() {
		System.out.println("Inside Username -)");
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"Sanity"})
	void email() {
		System.out.println("Inside Email -)");
		Assert.assertTrue(true);
	}
	
	@Test 
	void phonenumber() {
		System.out.println("Inside PhoneNumber -)");
		Assert.assertTrue(true);
	}
}
