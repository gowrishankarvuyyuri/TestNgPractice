package TestNg_FirstDay;

import org.testng.annotations.Test;

/*
 -) Open the Application
 -)	Login to Application
 -) Logout from Application
 -) Close the Application
 */

public class Basic_Test_Practice {

	
	@Test(priority = 3)
	void loginApp() {
		System.out.println("Login Success !!");
	}
	
	@Test(priority = 3)
	void logoutApp() {
		System.out.println("Logout Sucess !!");
	}
	
	@Test(priority = -1)
	void openApp() {
		System.out.println("Application Opened !!");
	}
	
	@Test(priority = 7)
	void closeApp() {
		System.out.println("Application Closed !!");
	}
}
