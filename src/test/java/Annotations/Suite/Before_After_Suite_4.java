package Annotations.Suite;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Before_After_Suite_4 {
	
	@AfterSuite
	void aftersuite() {
		System.out.println("Inside After Suite2 -)");
	} 
	
	@Test
	void test() {
		System.out.println("Some test case");
		Assert.assertTrue(true);
	}
	
	@BeforeSuite
	void beforesuite() {
		System.out.println("Inside Before Suite2 -)");
	}
	
}
