package orangehrmtests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import orangeHRMPages.HomePage;
import orangeHRMPages.LoginPage;

public class HomePageTest extends TestBase {
		
	LoginPage loginPage1;
	HomePage homePage;
	
	
	@BeforeMethod
	public void initialization() {
		init();
		loginPage1 = new LoginPage();
		
		homePage = loginPage1.login(prop.getProperty("userneme"), prop.getProperty("password"));
		
	}
	
	@Test
	public void validateBrandigHRMTest() {
		boolean isdisplyed = homePage.hrmBranding();
		assertEquals(isdisplyed, true);
	}
	
	@AfterMethod
	public void closeResorses() {
		driver.close();
	}
}
