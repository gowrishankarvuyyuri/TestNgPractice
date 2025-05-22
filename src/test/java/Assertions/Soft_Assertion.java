package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion {
	
	public static SoftAssert sa;
	
	@Test
	void test() {
		
		String name1 = "";
		String name2 = "Gowri";
		String name3 = "123";
		int num = 123;
		String name4 = " Gowri";
		
		sa = new SoftAssert();

		//sa.assertEquals(name1, name2); //fail
		//sa.assertEquals(name2, name4); //pass
		//sa.assertEquals(name3, num);
		sa.assertEquals(num, 123);
		
		
		System.out.println("Gowri Shankar");
		sa.assertAll();
	}
}
