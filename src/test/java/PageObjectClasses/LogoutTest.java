package PageObjectClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutTest{
	
	WebDriver driver;
	@BeforeMethod
	void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.naukri.com/");
		
		LoginPage_Without_PageFactory wpf = new LoginPage_Without_PageFactory(driver);
		wpf.init_login();
		wpf.username_field("gowrishankarvuyyuri@outlook.com");
		wpf.password_field("GowriShankar2002");
		wpf.after_login();
	}
	
	@Test (dependsOnGroups = {"login"})
	void logoutfromAppl() throws InterruptedException {
		Thread.sleep(3000);
		LogoutPage_With_PageFactory pf = new LogoutPage_With_PageFactory(driver);
		
		
		pf.logout_click();
		pf.logout();
		Thread.sleep(3000);
		
		Assert.assertEquals("https://www.naukri.com/", driver.getCurrentUrl());
	}
	
	@AfterMethod
	void teardown() {
		driver.quit();
	}
	
}
