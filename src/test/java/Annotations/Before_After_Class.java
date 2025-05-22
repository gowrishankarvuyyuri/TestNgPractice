package Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class Before_After_Class {
	
	@BeforeClass
	void driveropen() {
		System.out.println("Inside WebDriver Opening Page -)");
	}

	@BeforeMethod
	void open() {
		System.out.println("Inside Opening the Page -)");
	}

	@Test(priority = 1)
	void login() {
		System.out.println("Inside Login -)");
	}
	
	@Test(priority = 2)
	void search() {
		System.out.println("Inside Search -)");
	}
	
	@Test(priority = 3)
	void logout() {
		System.out.println("Inside Logout -)");
	}
	
	@AfterMethod
	void close() {
		System.out.println("Inside closing the Page -)");
	}
	
	@AfterClass
	void driverclose() {
		System.out.println("Inside WebDriver Opening Page -)");
	}
}
