package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddCustomerTest {
	
	

	WebDriver driver;
	
	ExcelReader exlRead = new ExcelReader("TestData\\DataDriven_TestData.xlsx");
	String userName = exlRead.getCellData("SignInData", "UserName", 2);
	String password = exlRead.getCellData("SignInData", "Password", 2);
	String fullName = exlRead.getCellData("AddContactData", "FullName", 2);
	String companyName = exlRead.getCellData("AddContactData", "Company Name", 2);
	String email = exlRead.getCellData("AddContactData", "Email", 2);
	String phoneNumber = exlRead.getCellData("AddContactData", "Phone", 2);
	String address = exlRead.getCellData("AddContactData", "Address", 2);
	String city = exlRead.getCellData("AddContactData", "City", 2);
	String state = exlRead.getCellData("AddContactData", "State", 2);
	String zip = exlRead.getCellData("AddContactData", "Zip", 2);
	String country = exlRead.getCellData("AddContactData", "Country", 2);
	String group = exlRead.getCellData("AddContactData", "Group", 2);
	
	
	@Test
	public void validUserShouldBeAbleToAddCustomer() throws InterruptedException {
		driver = BrowserFactory.init();

		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.enterUserName(userName);
		loginpage.enterPassword(password);
		loginpage.clickSigninButton();
		
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.validateDashboardPage();
		
		AddCustomerPage addCustomer = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomer.clickOnCustomersNav();
		Thread.sleep(3000);
		addCustomer.clickOnAddCustomersButton();
		Thread.sleep(3000);
		addCustomer.enterFullName(fullName);
		addCustomer.selectCompany(companyName);
		addCustomer.enterEmailAddress(email);
		addCustomer.enterPhoneNumber(phoneNumber);
		addCustomer.enterAddress(address);
		Thread.sleep(3000);
		addCustomer.enterCity(city);
		Thread.sleep(3000);
		addCustomer.enterState(state);
		addCustomer.enterZip(zip);
		addCustomer.selectCountry(country);
		addCustomer.selectGroup(group);
		addCustomer.clickOnSavesButton();
		
		BrowserFactory.tearDown();
		

	}
	

}
