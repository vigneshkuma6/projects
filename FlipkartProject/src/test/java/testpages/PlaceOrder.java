package testpages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Testcases.Baseclass;



public class PlaceOrder extends GenericMethods
{

	WebDriver driver;

	@FindBy(xpath="//span[contains(text(),'Place Order')]")
	WebElement Placeorder;
	@FindBy(xpath="//input[@type='text']")
	WebElement Enter_deatils;
	@FindBy(xpath="//span[contains(text(),'CONTINUE')]")
	WebElement Click_sbmit;
	@FindBy(xpath="//span[contains(text(),'Please enter valid Email ID/Mobile number')]")
	WebElement errormsg;

	// Creating constructor for Placeorder class
	public PlaceOrder (WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Method to click place order button
	public void palce_order()
	{
		Click(Placeorder);
		TakeScreenshot();
	}

	//Method to enter login details
	public void Enter_details() throws IOException
	{
		ReadExcellData ex = new ReadExcellData();
		Double UserID = ex.get_User_ID();
		String ID = String.valueOf(UserID);
		EnterValue(Enter_deatils, ID);
		TakeScreenshot();

	}
	// Method to click submit button
	public void Click_sbmit()
	{
		Click(Click_sbmit);
		TakeScreenshot();
	}

	// Method to verify error message
	public void verifying_error_msg() throws IOException
	{
		String actual = errormsg.getText();
		System.out.println(actual);
		ReadExcellData ex2 = new ReadExcellData();
		String Expected=ex2.get_assertstring();
		System.out.println(Expected);
		Assert.assertEquals(Expected, actual);
		TakeScreenshot();
	}

}



