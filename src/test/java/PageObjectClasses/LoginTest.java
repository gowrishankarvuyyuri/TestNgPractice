package PageObjectClasses;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;

	@BeforeMethod
	void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.naukri.com/");
	}
	
	@Test (groups = {"login"})
	void logintoAppl() throws InterruptedException {
		LoginPage_Without_PageFactory wpf = new LoginPage_Without_PageFactory(driver);
		
		wpf.init_login();
		wpf.username_field("gowrishankarvuyyuri@outlook.com");
		wpf.password_field("GowriShankar2002");
		wpf.after_login();
		Thread.sleep(2000);
		
		Assert.assertEquals("https://www.naukri.com/mnjuser/homepage", driver.getCurrentUrl());
	}
	
	@AfterMethod
	void teardown() {
		driver.quit();
	}
}
