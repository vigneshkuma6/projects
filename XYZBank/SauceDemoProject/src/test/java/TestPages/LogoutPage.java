package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenericMethod;

public class LogoutPage extends GenericMethod {
	WebDriver driver;
	@FindBy(css="#react-burger-menu-btn")
	WebElement openMenuButton;
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutButton;
	@FindBy(css="#reset_sidebar_link")
	WebElement appReset;
	@FindBy(css=".shopping_cart_badge")
	WebElement cartIcon;
	
	public LogoutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void loggingOut()
	{
		Click(openMenuButton);
		Click(appReset);
		Click(logoutButton);
		
	}
}
