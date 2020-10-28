package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	// Element library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USER_NAME_LOCATE;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_LOCATE;
	@FindBy(how = How.NAME, using = "login")
	WebElement SIGNIN_LOCATE;

	// Interactive method

	public void enterUserName(String userName) {
		USER_NAME_LOCATE.sendKeys(userName);
	}

	public void enterPassword(String password) {
		PASSWORD_LOCATE.sendKeys(password);
	}

	public void clickSigninButton() {
		SIGNIN_LOCATE.click();
	}

}
