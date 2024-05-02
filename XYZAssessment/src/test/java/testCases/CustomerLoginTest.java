package testCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import junit.framework.Assert;
import testPages.CustomerLogin;
import utils.ReadExcell;

public class CustomerLoginTest extends BaseClass {
	ReadExcell readExcell = new ReadExcell();
	CustomerLogin customerLogin;

	@Test(priority = 2)
	public void customerLogin() throws IOException {

		customerLogin = new CustomerLogin(driver);
		customerLogin.selectHomeBtn();
		customerLogin.selectCustomerLogin();
		String userName = readExcell.getFirstName() + " " + readExcell.getLastName();
		customerLogin.selectCustomerName(userName);
		customerLogin.clickLoginBtn();
		customerLogin.selectDepositeTile();
		String amoutBeforedeposit = customerLogin.getDepositAmout();
		customerLogin.enterDepositAmount(readExcell.getDepositAmount());
		customerLogin.clickDepositButton();
		String amoutAfterDeposit = customerLogin.getDepositAmout();
		int expectedAmount = Integer.parseInt(amoutBeforedeposit) + Integer.parseInt(readExcell.getDepositAmount());
		Assert.assertEquals(Integer.parseInt(amoutAfterDeposit), expectedAmount);
	}

	@Test(priority = 3)
	public void amountWithdrawal() throws IOException, InterruptedException {

		customerLogin = new CustomerLogin(driver);
		customerLogin.selectWithdrawTile();
		int balanceBeforeWithdraw= Integer.parseInt(customerLogin.getBalance());
		waitFor(3000);
		customerLogin.enterWithdrawAmount(readExcell.getWithdrawAmount());
		waitFor(3000);
		customerLogin.clickWithdrawButton();
		int balanceAfterWithdraw=Integer.parseInt(customerLogin.getBalance());
		int expectedbalance=balanceBeforeWithdraw-Integer.parseInt(readExcell.getWithdrawAmount());
		String actual=customerLogin.getSuccessMessage();
		String expected="Transaction successful";
		Assert.assertEquals(actual, expected);
		Assert.assertEquals(balanceAfterWithdraw, expectedbalance);
		waitFor(3000);
		customerLogin.clicktransactionBtn();
		waitFor(3000);
		getScreenshot();
		
	}
}
