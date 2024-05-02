package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.GenericMethods;

public class LoginPage extends GenericMethods{
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement passWord;
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginBtn;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void enterUsername(String userId)
	{
		EnterValue(userName,userId);
	}
	public void clickPassword()
	{
		Click(passWord);
	}
	public void enterPassword(String pass)
	{
		EnterValue(passWord,pass);
	}
	public void clickLoginBtn()
	{
		Click(loginBtn);
	}

}
