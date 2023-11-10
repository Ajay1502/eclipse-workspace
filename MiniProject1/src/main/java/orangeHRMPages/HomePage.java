package orangeHRMPages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{
	
	public HomePage() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@alt='client brand banner']")
	WebElement hrmBrandingElement;
	
	@FindBy(xpath = "//*[@placeholder='Search']")
	WebElement serchBarElement;
	
	@FindBy(xpath = "//*[contains(@href,'php/admin/viewAdminModule')]")
	WebElement adminElement;
	
	@FindBy(xpath = "//*[contains(@href,'php/pim/viewPimModule')]")
	WebElement pimElement;
	
	@FindBy(xpath = "//*[contains(@href,'php/leave/viewLeaveModule')]")
	WebElement leaveElement;
	
	@FindBy(xpath = "//*[contains(@href,'php/time/viewTimeModule')]")
	WebElement viewTimElement;
	
	@FindBy(xpath = "//*[contains(@href,'php/recruitment/viewRecruitmentModule')]")
	WebElement viewRecruitmentElement;
	
	@FindBy(xpath = "//*[contains(@href,'php/performance/viewPerformanceModule')]")
	WebElement viewPerformanceElement;
	
	@FindBy(xpath = "//*[contains(@href,'php/dashboard/index')]")
	WebElement dashboardElement;
	
	@FindBy(xpath = "//*[contains(@href,'php/directory/viewDirectory')]")
	WebElement viewDirectoryElement;
	
	@FindBy(xpath = "//*[contains(@href,'php/maintenance/viewMaintenanceModule')]")
	WebElement viewMaintenance;
	
	@FindBy(xpath = "//*[contains(@href,'php/buzz/viewBuzz')]")
	WebElement viewBuzzElement;
	
	@FindBy(xpath = "//*[@type='button' and @role='none']")
	WebElement slideBTNElement;
	
	@FindBy(xpath = "//*[contains(@class,'bi-chevron-right')]")
	WebElement rightSideSlideBTNElement;
	
	@FindBy(xpath = "//*[contains(@class,'oxd-topbar-header-breadcrumb-module')]")
	WebElement headerDashboardNemElement;
	
	@FindBy(xpath = "//*[contains(text(),'firstMahadev')]")
	WebElement profilesliderElement;
	
	@FindBy(xpath = "//*[contains(text(),'About')]")
	WebElement aboutElement;
	
	@FindBy(xpath = "//*[contains(text(),'Support')]")
	WebElement suppElement;
	
	@FindBy(xpath = "//*[contains(text(),'Change Password')]")
	WebElement changePasswordElement;
	
	@FindBy(xpath = "//*[contains(text(),'Logout')]")
	WebElement logoutElement;
	
	@FindBy(xpath = "//*[contains(@class,'orangehrm-attendance-card-action')]")
	WebElement punchTimeElemnt;
	
	@FindBy(xpath = "//*[contains(@class,'success orangehrm-report-icon')]")
	WebElement leaveRequestElement;
	
	@FindBy(xpath = "//*[contains(@class,'oxd-icon-button--warn')]")
	WebElement timeSheetElement;
	
	@FindBy(xpath = "//*[contains(@class,'danger orangehrm-report-icon')]")
	WebElement pendinfElementSelfRevieWebElement;
	
	@FindBy(xpath = "//*[contains(@class,'info orangehrm-report-icon')]")
	WebElement candidatToInterviewElement;
	
	@FindBy(xpath = "//*[@title='Assign Leave' and @type='button']")
	WebElement assignLeaveElement;
	
	@FindBy(xpath = "//*[@title='Leave List' and @type='button']")
	WebElement leaveListElement;
	
	@FindBy(xpath = "//*[@title='Timesheets' and @type='button']")
	WebElement timeSheetElement2;
	
	@FindBy(xpath = "//*[@title='Apply Leave' and @type='button']")
	WebElement applyLeavElement;
	
	@FindBy(xpath = "//*[@title='My Leave' and @type='button']")
	WebElement myLeavElement;
	
	@FindBy(xpath = "//*[@title='My Timesheet' and @type='button']")
	WebElement myTimeSheetElement;
	
	@FindBy(xpath = "//*[contains(@class,'orangehrm-leave-card-icon')]")
	WebElement employeeLeaveOnDayElement;
	
	public boolean hrmBranding() {
		boolean hrmLogo = hrmBrandingElement.isDisplayed();
		return hrmLogo;
	}
	
	public void searchBtn(String search) {
		serchBarElement.sendKeys(search);
	}
	public void adminTab() {
		adminElement.click();
	}
	public void pimTab() {
		pimElement.click();
	}
	public void leaveTab() {
		leaveElement.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
