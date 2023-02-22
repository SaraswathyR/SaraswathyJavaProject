package testNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CommonPagesInOrangeHRM {
	
	private WebDriver driver;
	
	public CommonPagesInOrangeHRM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement text_Search;
	
	@FindBy(xpath="//span[text()='Admin']")
	WebElement text_Admin;
	
	@FindBy(xpath="//span[text()='PIM']")
	WebElement text_PIM;
	
	@FindBy(xpath="//span[text()='Leave']")
	WebElement text_Leave;
	
	@FindBy(xpath="//span[text()='Time']")
	WebElement text_Time;
	
	@FindBy(xpath="//span[text()='Recruitment']")
	WebElement text_Recruitment;

	@FindBy(xpath="//span[text()='My Info']")
	WebElement text_MyInfo;
	
	@FindBy(xpath="//span[text()='Performance']")
	WebElement text_Performance;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	WebElement text_Dashboard;
	
	@FindBy(xpath="//span[text()='Directory']")
	WebElement text_Directory;
	
	@FindBy(xpath="//span[text()='Maintenance']")
	WebElement text_Maintenance;
	
	@FindBy(xpath="//span[text()='Buzz']")
	WebElement text_Buzz;
	
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	WebElement text_NameDropdown;
	
	@FindBy(xpath="//a[text()='About']")
	WebElement text_About;
	
	@FindBy(xpath="//a[text()='Support']")
	WebElement text_Support;
	
	@FindBy(xpath="//a[text()='Change Password']")
	WebElement text_ChangePassword;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement text_Logout;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-chevron-left']")
	WebElement class_maximize;
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement text_LandingPageTitle;
	
	@FindBy(xpath="//h6[text()='Administrator Access']")
	WebElement text_AdministratorAccess;
	
	
	
	public void validateLandingPage() {
		Assert.assertEquals(text_LandingPageTitle.getText(), "Dashboard");
	}
	
	public void ValidateAdmintab() {
		text_Admin.click();
		Assert.assertEquals(text_Admin.getText(), "Admin\r\n"+ "User Management");
	}
	
	public void ValidatePIMtab() {
		text_PIM.click();
		Assert.assertEquals(text_PIM.getText(), "PIM");
	}
	
	public void ValidateLeavetab() {
		text_Leave.click();
		Assert.assertEquals(text_Leave.getText(), "Leave");
	}
	
	public void ValidateTimetab() {
		text_Time.click();
		Assert.assertEquals(text_Leave.getText(), "Time\r\n"+ "Timesheets");
	}
	
	
	public void ValidateRecruitmenttab() {
		text_Recruitment.click();
		Assert.assertEquals(text_Recruitment.getText(), "Recruitment");
	}
	
	
	public void ValidateMyInfotab() {
		text_MyInfo.click();
		Assert.assertEquals(text_MyInfo.getText(), "PIM");
	}
	
	
	public void ValidatePerformancetab() {
		text_Performance.click();
		Assert.assertEquals(text_Performance.getText(), "Performance\r\n"+ "Manage Reviews");
	}
	
	
	public void ValidateDashboardtab() {
		text_Dashboard.click();
		Assert.assertEquals(text_Dashboard.getText(), "Dashboard");
	}
	
	
	public void ValidateDirectorytab() {
		text_Directory.click();
		Assert.assertEquals(text_Directory.getText(), "Directory");
	}
	
	public void ValidateMaintenancetab() {
		text_Maintenance.click();
		Assert.assertEquals(text_Maintenance.getText(), text_AdministratorAccess.getText());
	}
	
	public void ValidateBuzztab() {
		text_Buzz.click();
		Assert.assertEquals(text_Buzz.getText(), "Buzz");
	}
	
	
	public static void main(String[] args) {
		
		

	}

}
