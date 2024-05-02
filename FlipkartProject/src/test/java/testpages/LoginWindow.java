package testpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWindow extends GenericMethods
{
	WebDriver driver;

	@FindBy(xpath="//button[contains(text(),'✕')]")
	WebElement close_login;
	@FindBy(xpath="//*[text()='Deals of the Day']")
	WebElement deals_of_the_day;
	@FindBy(xpath="//a[@class='_6WQwDJ']")
	List<WebElement> daily_deals;
	@FindBy(xpath="//a[@class='_2KpZ6l _3dESVI']")
	WebElement viewall;
	@FindBy(xpath="//span[@class='hDTmm5'][contains(.,'Help Center')]")
	WebElement helpcenter;

	// Creating constructor for Loginwindow class
	public LoginWindow(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Method to close login Popup
	public void closeloginbtn()
	{
		Click(close_login);
		ImplicitWait(driver);
		TakeScreenshot();
	}

	// Method to click view all button
	public void view_all_option()
	{
		Click( viewall );
		VisibilityOfElement(helpcenter);
		TakeScreenshot();
	}
	// Method to count number of products in deals of the day
	public void count_no_of_deals()
	{
		SizeOfList(daily_deals);
	}

}
