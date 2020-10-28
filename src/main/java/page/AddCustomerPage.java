package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage {
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customers')]")
	WebElement CUSTOMERS_NAV_LOCATOR;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Customer')]")
	WebElement ADD_CUSTOMER_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULL_NAME_FIELD;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']")
	WebElement COMPANY_DROPDOWN;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='state']")
	WebElement STATE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='zip']")
	WebElement ZIP_FIELD;
	@FindBy(how = How.XPATH, using = "//select[@id='country']")
	WebElement COUNTRY_DROPDOWN;
	@FindBy(how = How.XPATH, using = "//select[@name='group']")
	WebElement GROUP_DROPDOWN;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement SAVE_BUTTON;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']")
	WebElement LIST_CUSTOMER_LOCATOR;

	// Interactive Methods

	public void clickOnCustomersNav() {

		CUSTOMERS_NAV_LOCATOR.click();
	}

	public void clickOnAddCustomersButton() {

		ADD_CUSTOMER_LOCATOR.click();
	}

	public void enterFullName(String fullName) {
		waitForElement(driver, 30, FULL_NAME_FIELD);
		FULL_NAME_FIELD.sendKeys(fullName + randomGenerator());
	}
	
	public void selectCompany(String companyName) {
		selectDropDown(COMPANY_DROPDOWN, companyName);
	}

	public void enterEmailAddress(String email) {
		EMAIL_FIELD.sendKeys(randomGenerator() + email);
	}

	public void enterPhoneNumber(String phoneNumber) {
		PHONE_FIELD.sendKeys(phoneNumber + randomGenerator());
	}

	public void enterAddress(String address) {
		ADDRESS_FIELD.sendKeys(address);
	}

	public void enterCity(String city) {
		CITY_FIELD.sendKeys(city);
	}

	public void enterState(String state) {
		STATE_FIELD.sendKeys(state);
	}

	public void enterZip(String zip) {
		ZIP_FIELD.sendKeys(zip);
	}

	public void selectCountry(String country) {
		selectDropDown(COUNTRY_DROPDOWN, country);
	}

	public void selectGroup(String group) {
		selectDropDown(GROUP_DROPDOWN, group);
	}

	public void clickOnSavesButton() {
		waitForElement(driver, 5, SAVE_BUTTON);
		SAVE_BUTTON.click();
	}

}
