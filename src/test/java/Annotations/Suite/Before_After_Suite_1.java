package Annotations.Suite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_After_Suite_1 {
	
	@AfterTest
	void aftertest() {
		System.out.println("Inside After Test -)");
	}
	
	@BeforeClass
	void beforeclass() {
		System.out.println("Inside Before Class -)");
	}
	
	@BeforeMethod
	void beforemethod() {
		System.out.println("Inside Before Method -)");
	}
	
	@AfterMethod
	void aftermethod() {
		System.out.println("Inside After Method -)");
	}
	
	@Test(priority = 1)
	void login() {
		System.out.println("Inside Login -)");
	}
}
