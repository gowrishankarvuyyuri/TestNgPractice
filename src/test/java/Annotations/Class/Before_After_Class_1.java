package Annotations.Class;

import org.testng.annotations.*;

public class Before_After_Class_1 {
	
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
	void login() {
		System.out.println("Inside Login -)");
	}
}
