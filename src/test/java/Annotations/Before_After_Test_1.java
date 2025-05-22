package Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class Before_After_Test_1 extends Before_After_Test_3{
	
	

	@Test(priority = 1)
	void login() {
		System.out.println("Inside Login -)");
	}
	
	
}
