package Annotations.Suite;

import org.testng.annotations.*;

public class Before_After_Suite_2 {
	
	@BeforeTest
	void aftertest() {
		System.out.println("Inside Before Test -)");
	}
	
	@AfterClass
	void beforeclass() {
		System.out.println("Inside After Class -)");
	}
	
	@Test
	void search() {
		System.out.println("Inside search -)");
	}
	
	@BeforeMethod
	void open() {
		System.out.println("Inside Before Method -)");
	}
	
	@AfterMethod
	void close() {
		System.out.println("Inside After Method -)");
	}
	
	@BeforeSuite
	void beforesuite() {
		System.out.println("Inside Before Suite -)");
	}
}
