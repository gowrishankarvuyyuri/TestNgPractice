package Annotations.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_After_Method_1 {

	@BeforeMethod
	void open() {
		System.out.println("Inside Before Method -)");
	}
	
	@AfterMethod
	void close() {
		System.out.println("Inside After Method -)");
	}
	
	@Test(priority = 1)
	void logout() {
		System.out.println("Inside Logout -)");
	}
	
	@Test(priority = 3)
	void login() {
		System.out.println("Inside Login  -)");
	}
}
