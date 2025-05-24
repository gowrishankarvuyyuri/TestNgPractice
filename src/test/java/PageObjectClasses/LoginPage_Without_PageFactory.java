package PageObjectClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_Without_PageFactory {
	
	WebDriver driver;
	public LoginPage_Without_PageFactory(WebDriver driver) {
		this.driver = driver;
	}
	

	By login_click1 = By.xpath("//a[@id='login_Layer']");
	By username = By.xpath("//input[@placeholder='Enter your active Email ID / Username']");
	By password = By.xpath("//input[@placeholder='Enter your password']");
	By login_click2 = By.xpath("//button[normalize-space()='Login']");
	
	
	public void init_login() {
		driver.findElement(login_click1).click();
	}
	
	public void username_field(String user) {
		driver.findElement(username).sendKeys(user);
	}
	
	public void password_field(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void after_login() {
		driver.findElement(login_click2).click();
	}
}
