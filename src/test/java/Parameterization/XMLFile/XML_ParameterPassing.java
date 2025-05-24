package Parameterization.XMLFile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XML_ParameterPassing {
	
	public WebDriver driver;
	
	@BeforeClass
	void setup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications", "--disable-popup-blocking");
		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@BeforeMethod
	void launch() throws InterruptedException {
		
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
	}

	@Test
	@Parameters({"username", "password"})
	void testlogin(String username, String password) throws InterruptedException {
		driver.findElement(By.cssSelector("[placeholder='Enter your active Email ID / Username']")).sendKeys(username);
		driver.findElement(By.cssSelector("[placeholder='Enter your password']")).sendKeys(password);
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
	
	@AfterClass
	void teardown() {
		driver.close();
	}
}
