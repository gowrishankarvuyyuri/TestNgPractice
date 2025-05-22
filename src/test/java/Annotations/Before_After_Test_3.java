package Annotations;

import org.testng.annotations.*;

public class Before_After_Test_3 {

	@BeforeTest
	void openconfigure() {
		System.out.println("Inside Opening the DataBase Connection -)");
	}
	
	@AfterTest
	void closeconfigure() {
		System.out.println("Inside Closing the DataBase Connection -)");
	}
	
	@AfterClass
	void driverclose() {
		System.out.println("Inside WebDriver Closing Page -)");
	}
	
	@BeforeClass
	void driveropen() {
		System.out.println("Inside WebDriver Opening Page -)");
	}
	
	@BeforeMethod
	void open() {
		System.out.println("Inside Opening the Page -)");
	}
	
	@AfterMethod
	void close() {
		System.out.println("Inside closing the Page -)");
	}
}
