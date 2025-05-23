package Grouping;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Profile_Tests {

	@Test (groups = {"Regression"})
	void updatename() {
		System.out.println("Inside Update Name -)");
		Assert.assertTrue(true);
	}
	
	@Test (groups = {"Regression"})
	void updatepic() {
		System.out.println("Inside Update Picture -)");
		Assert.assertTrue(true);
	}
	
	@Test 
	void updatephone() {
		System.out.println("Inside Update PhoneNumber -)");
		Assert.assertTrue(true);
	}
}
