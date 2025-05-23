package Annotations.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_After_Method_2 {

	@BeforeMethod
	void open() {
		System.out.println("Inside Before Method -)");
	}
	
	@AfterMethod
	void close() {
		System.out.println("Inside After Method -)");
	}
	
	@Test(priority = 2)
	void search() {
		System.out.println("Inside search -)");
	}
	
}
