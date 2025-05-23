package Annotations.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Before_After_Test_2 {

	@BeforeClass
	void beforeclass() {
		System.out.println("Inside Before Class -)");
	}
	
	@AfterClass
	void afterclass() {
		System.out.println("Inside After Class -)");
	}
	
	@Test
	void logout() {
		System.out.println("Inside Logout -)");
	}
	
	@BeforeTest
	void beforetest() {
		System.out.println("Inside Before Test -)");
	}
}
