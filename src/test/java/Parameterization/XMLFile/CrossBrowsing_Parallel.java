package Parameterization.XMLFile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsing_Parallel {

	public WebDriver driver;
	@BeforeMethod
	@Parameters({"browser"})
	void setup(String browser) {
		
		switch(browser) {
			case "chrome" : driver = new ChromeDriver();
							break;
							
			case "edge" : driver = new EdgeDriver();
							break;
					
			case "firefox" : driver = new FirefoxDriver();
							break;
							 
			default : System.out.println("Invalid Browser Name");
					  return;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Test
	void testLogin() throws InterruptedException {
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		
		driver.findElement(By.cssSelector("[placeholder='Enter your active Email ID / Username']")).sendKeys("gowrishankarvuyyuri@outlook.com");
		driver.findElement(By.cssSelector("[placeholder='Enter your password']")).sendKeys("GowriShankar2002");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(2000);
		
		boolean profile = driver.findElement(By.xpath("//a[@class='nI-gNb-header__logo nI-gNb-company-logo']//img[@alt='Naukri Logo']")).isDisplayed();
	
		if (profile) {
			
			driver.findElement(By.xpath("//img[@alt='naukri user profile img']")).click();
			driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
			Thread.sleep(2000);
			Assert.assertTrue(profile);
		}
		else 
			Assert.fail();
		
	}
	
	@AfterMethod
	void teardown() throws InterruptedException {
		 if (driver != null) {
		        driver.close();
		        Thread.sleep(2000);
		    } else {
		        System.out.println("Driver was not initialized, skipping teardown.");
		 }
	}
}
