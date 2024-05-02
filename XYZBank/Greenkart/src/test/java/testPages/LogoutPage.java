package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.GenericMethods;

public class LogoutPage extends GenericMethods{
	@FindBy(xpath="//button[text()='Open Menu']")
	WebElement menuOption;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutBtn;
	
	public LogoutPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void clickMenuOption()
	{
		Click(menuOption);
	}
	public void clickLogoutBtn()
	{
		Click(logoutBtn);
	}

}
