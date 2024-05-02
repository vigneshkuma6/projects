package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.GenericMethod;

public class CustomerLogin extends GenericMethod {

	@FindBy(xpath = "//button[text()='Customer Login']")
	WebElement customerLogin;

	@FindBy(xpath = "//select[@id='userSelect']")
	WebElement customerName;

	@FindBy(xpath = "//button[text()='Home']")
	WebElement homeButton;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginBtn;

	@FindBy(xpath = "//button[normalize-space(text())='Deposit']")
	WebElement depositeTile;

	@FindBy(xpath = "//input[@placeholder='amount']")
	WebElement amountTextBox;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitBtn;

	@FindBy(xpath = "//div[text()='Account Number : ']/child::strong[2]")
	WebElement balanceOption;

	@FindBy(xpath = "//button[normalize-space(text())='Withdrawl']")
	WebElement withdrawtile;

	@FindBy(xpath = "//input[@placeholder='amount']")
	WebElement withdrawTextBox;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement withdraw;
	
	@FindBy(xpath = "//span[contains(@class,'error')]")
	WebElement errorMessage;
	
	@FindBy(xpath = "//button[normalize-space(text())='Transactions']")
	WebElement transactionTile;
	
	@FindBy(xpath = "//button[text()='Back']")
	WebElement backBtn;
	
	WebDriver driver;

	public CustomerLogin(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectHomeBtn() {
		click(homeButton);

	}

	public void selectCustomerLogin() {
		click(customerLogin);
	}

	public void selectCustomerName(String name) {
		dropdownWithText(customerName, name);
	}

	public void clickLoginBtn() {
		click(loginBtn);
	}

	public void selectDepositeTile() {
		click(depositeTile);
	}

	public void enterDepositAmount(String text) {
		enterText(amountTextBox, text);
	}

	public void clickDepositButton() {
		click(submitBtn);
	}

	public String getDepositAmout() {
		return balanceOption.getText();
	}

	public void selectWithdrawTile() {

		click(withdrawtile);
	}

	public void enterWithdrawAmount(String text) {
		enterText(withdrawTextBox, text);
	}

	public void clickWithdrawButton() {
		elementToBeClicable(withdraw);
		click(withdraw);
	}
	public String getSuccessMessage()
	{
		return errorMessage.getText();
	}
	public String getBalance()
	{
		return balanceOption.getText();
	}
	public void clicktransactionBtn() {
		click(transactionTile);
	}
	public void clickbbackBtn() {
		click(transactionTile);
	}
}
