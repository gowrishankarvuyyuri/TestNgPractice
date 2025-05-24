package Annotations.Test_Method;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority_Level {

	@Test (priority = -200)
	void test1() {
		Assert.assertTrue(true);
	}
	
	@Test (priority = 0)
	void test2() {
		Assert.assertTrue(true);
	}
	
	@Test (priority = 200)
	void test3() {
		Assert.assertTrue(true);
	}
 }
