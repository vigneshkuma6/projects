package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.GenericMethod;

public class BankManagerPage extends GenericMethod {
	
	@FindBy(xpath="//button[text()='Bank Manager Login']")
	WebElement managerLoginBtn;
	
	@FindBy(xpath="//button[normalize-space(text())='Add Customer']")
	WebElement addCustomerTile;

	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement firstName;

	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lastName;

	@FindBy(xpath="//input[@placeholder='Post Code']")
	WebElement postalCode;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement addCustomerBtn;
	
	@FindBy(xpath="//select[@id='userSelect']")
	WebElement customerDropdown;
	
	@FindBy(xpath="//select[@id='currency']")
	WebElement currencyDropdown;
	
	@FindBy(xpath="//button[normalize-space(text())='Open Account']")
	WebElement openAccountTile;
	
	@FindBy(xpath="//button[text()='Process']")
	WebElement processBtn;
	
	@FindBy(xpath="//button[normalize-space(text())='Customers']")
	WebElement customerTile;
	
	@FindBy(xpath="//input[@placeholder='Search Customer']")
	WebElement customerSearchTxtBox;
	
	@FindBy(xpath="//tr[@class='ng-scope']/td[4]/span")
	WebElement accountNumber;
	
	@FindBy(xpath="//select[@id='userSelect']")
	WebElement homeButton;


	WebDriver driver;
	public BankManagerPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickBankmanagertile()
	{
		click(managerLoginBtn);
	}
	public void addCustomer()
	{
		click(addCustomerTile);
	}
	public void enterFirstName(String fname)
	{
		enterText(firstName,fname);
	}
	public void enterLastName(String Lname)
	{
		enterText(lastName,Lname);
	}
	public void enterPostalCode(String pincode)
	{
		enterText(postalCode,pincode);
	}
	public void clickAddCustomer()
	{
		click(addCustomerBtn);
	}
	public String getAlertMessage()
	{
		String message=alertText();
		return message;
	}
	public void selectCustomerFromDropdown(String text)
	{
		dropdownWithText(customerDropdown,text);
	}
	public void selectOpenAccountOption()
	{
		click(openAccountTile);
	}
	public void selectCurrencyFromDropdown(String text)
	{
		dropdownWithText(currencyDropdown,text);
	}
	public void clickprocess()
	{
		click(processBtn);
		
	}
public void acceptAlert()
{
	alertBox();
}
public void selectCustomerOption()
{
	click(customerTile);
	
}
public void enterAccountNumber(String accountNo)
{
	enterText(customerSearchTxtBox,accountNo);
}
public String getAccountNumber()
{
	return accountNumber.getText();
}
//public void selectHomeBtn()
//{
//	visibilityOfElement(homeButton);
//	click(homeButton);
//}
}
