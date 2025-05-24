package TestNG_Listners.ExtentReports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;

    @BeforeSuite
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterSuite
    void teardown() {
        driver.quit();
    }
	
	@Test(priority = 3)
	void logout() throws InterruptedException {
		driver.findElement(By.xpath("//img[@alt='naukri user profile img']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		Thread.sleep(2000);
		
		boolean logo = driver.findElement(By.xpath("//a[@class='nI-gNb-header__logo nI-gNb-company-logo']//img[@alt='Naukri Logo']")).isDisplayed();
		Assert.assertEquals(true, logo);
	}
	@Test(priority = 1)
	void login() throws InterruptedException {
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();		
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("gowrishankarvuyyuri@outlook.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("GowriShankar2002");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(1000);
		
		String logo = driver.findElement(By.xpath("//div[@class = 'name-wrapper']/div")).getText();
		System.out.println(logo);
		Assert.assertEquals(logo, "Gowri Shankar Vuyyuri");
	}
	
	@Test(priority = 2)
	void profile() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[normalize-space()='View profile']")).click();
		Thread.sleep(1000);
		
		String name = driver.findElement(By.xpath("//div/span[@class='fullname']")).getText();
		System.out.println(name);
		Assert.assertEquals(name, true);
	}

}
