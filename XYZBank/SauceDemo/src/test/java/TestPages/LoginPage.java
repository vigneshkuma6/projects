package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenericMethod;

public class LoginPage extends GenericMethod {
	@FindBy(css = "#user-name")
	WebElement userName;
	@FindBy(css = "#password")
	WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginButton;
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void userLogin(String userID, String userPassword) {
		EnterValue(userName, userID);
		EnterValue(password, userPassword);
		Click(loginButton);

	}
}
