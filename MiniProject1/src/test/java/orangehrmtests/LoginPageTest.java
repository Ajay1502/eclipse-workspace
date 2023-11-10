package orangehrmtests;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import orangeHRMPages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	@BeforeMethod
	public void initialization() {
		init();
		loginpage = new LoginPage();
	}
	@Test
	public void validateLoginTest() {
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	@Test
	public void validateForgetBTNTest() {
		loginpage.forgetPassword();
	}
	@Test
	public void validateComBrandingTest() {
		boolean isDisplyed = loginpage.branding();
		Assert.assertEquals(isDisplyed, true);
	}
	@AfterMethod
	public void closeResorses() {
		driver.close();
	}
}
