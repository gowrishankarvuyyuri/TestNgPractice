package Annotations.Suite;

import org.testng.annotations.*;

public class Before_After_Suite_3 {

	@Test
	void logout() {
		System.out.println("Inside Logout -)");
	} 
	
	@BeforeMethod
	void open() {
		System.out.println("Inside Before Method -)");
	}
	
	@AfterMethod
	void close() {
		System.out.println("Inside After Method -)");
	}
	
	@AfterSuite
	void aftersuite() {
		System.out.println("Inside After Suite -)");
	}
}
