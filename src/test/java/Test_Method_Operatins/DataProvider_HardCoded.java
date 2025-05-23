package Test_Method_Operatins;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProvider_HardCoded {
	
	public WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@BeforeMethod
	void launch() throws InterruptedException {
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
	}

	@Test(dataProvider = "LoginTestInput")
	void testLogin(String username, String password) throws InterruptedException {
		
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
	
	@DataProvider(name = "LoginTestInput", indices = {0, 2, 4})
	String[][] testinput() {
		
		String input[][] = {
							{"Divya@123@gmail.com", "Divya"},
							{"Vijaya@123@gmail.com", "Vijaya"},
							{"gowrishankarvuyyuri@outlook.com", "GowriShankar2002"},
							{"Rambabu@123@yahoo.com", "Rambabu"},
							{"Mani@123@gmail.com", "Mani"}
						   };
		return input;
	}
}
