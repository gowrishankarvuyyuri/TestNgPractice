package Annotations.Test;

import org.testng.annotations.*;

public class Before_After_Test_1 {
	
	
	@AfterTest
	void aftertest() {
		System.out.println("Inside After Test -)");
	}
	
	@BeforeClass
	void beforeclass() {
		System.out.println("Inside Before Class -)");
	}
	
	@AfterClass
	void afterclass() {
		System.out.println("Inside After Class -)");
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
	void login() {
		System.out.println("Inside Login -)");
	}
	
}
