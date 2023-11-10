package orangeHRMPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {
	public LoginPage() {
		PageFactory.initElements(driver,this );
	}
	
	@FindBy(xpath="//*[@alt='company-branding'][1]")
	WebElement companyBrandingElement;
	
	@FindBy(xpath="//*[@name='username']")
	WebElement userNameElement;
	
	@FindBy(xpath="//*[@name='password']")
	WebElement passWordElement;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement loginBTNelElement;
	
	@FindBy(xpath="//*[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	WebElement forgetPasswordElement;
	
	public HomePage login(String username,String password) {
		userNameElement.sendKeys(username);
		passWordElement.sendKeys(password);
		loginBTNelElement.click();
		return new HomePage();
	}
	public boolean branding() {
		boolean status = companyBrandingElement.isDisplayed();
		return status;
	}
	public void forgetPassword() {
		forgetPasswordElement.click();
	}
}
