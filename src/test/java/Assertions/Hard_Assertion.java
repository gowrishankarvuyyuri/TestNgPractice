package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 through conditional statements we cannot pass or fail statements to the report generation
 if the assertion validation got falied then rest statements will not execute
 */

public class Hard_Assertion {

	@Test
	void Assertion() {
		
		int a = 1;
		int b = 1;
		
		String name = "Gowri";
		String name1 = "Gowri";
		
		//int
		/*
		Assert.assertEquals(a,b); //pass
		Assert.assertTrue(a==b); //pass
		
		if(a==b) 
			Assert.assertTrue(true);
		else 
			Assert.assertTrue(false);
		
		Assert.assertNotEquals(a,b); //fail 
		Assert.assertFalse(a==b); //fail 
		*/
		
		//string
		/*
		Assert.assertEquals(name, name1); //fail
		Assert.assertNotEquals(name, name1); //pass
		
		if(name == name1)
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
		*/
		
		/*
		if(name.equals(name1)) {
			System.out.println("Test Case Failed");
		}
		else
			System.out.println("Test Case Passed");
		*/
		
		System.out.println("Hello Gowri Shankar");
	}
}
