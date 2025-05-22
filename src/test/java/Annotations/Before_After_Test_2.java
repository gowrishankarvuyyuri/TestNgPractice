package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Before_After_Test_2 extends Before_After_Test_3{
	

	@Test(priority = 2)
	void search() {
		System.out.println("Inside Search -)");
	}
	
}
