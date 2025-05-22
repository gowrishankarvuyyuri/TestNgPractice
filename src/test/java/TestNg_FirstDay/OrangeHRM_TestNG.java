package TestNg_FirstDay;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 -) Open the Application
 -) Login to Application
 -) Check Image got Displayed or Not //img[@alt='client brand banner']
 -)	Close the Application
 */

public class OrangeHRM_TestNG {
	
	public static WebDriver driver;
	
	@Test(priority = 0)
	void openApp() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority = 1)
	void loginApp() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority = 2)
	void checkLogo() {
		
		boolean logo = driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
		System.out.println("Is Logo Displayed ?" + logo);
	}
	
	
	@Test(priority = 3)
	void closeApp() {
		
		driver.quit();
	}
	
}
