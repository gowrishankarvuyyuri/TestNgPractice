package Annotations.Class;

import org.testng.annotations.*;

public class Before_After_Class_2 {
	
	@BeforeClass
	void beforeclass() {
		System.out.println("Inside Before Class -)");
	}
	
	@BeforeMethod
	void open() {
		System.out.println("Inside Before Method -)");
	}
	
	@AfterMethod
	void close() {
		System.out.println("Inside After Method -)");
	}
	
	@Test
	void logout() {
		System.out.println("Inside Logout -)");
	}
	

}
