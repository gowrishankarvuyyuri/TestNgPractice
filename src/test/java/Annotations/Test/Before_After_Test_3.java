package Annotations.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Before_After_Test_3 {

	@BeforeTest
	void open() {
		System.out.println("Inside Before Test -)");
	}
	
	@AfterTest
	void close() {
		System.out.println("Inside After Test -)");
	}
}
