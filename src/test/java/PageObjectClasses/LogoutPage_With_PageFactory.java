package PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage_With_PageFactory {

	WebDriver driver;
	public LogoutPage_With_PageFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@alt='naukri user profile img']") WebElement profile_logo;
	@FindBy(how=How.XPATH, using = "//a[normalize-space()='Logout']") WebElement logout_btn;
	
	public void logout_click() {
		profile_logo.click();
	}
	
	public void logout() {
		logout_btn.click();
	}
	
}
