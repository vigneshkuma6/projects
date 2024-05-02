package testCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import testPages.BankManagerPage;
import utils.ReadExcell;

public class ManagerLoginTest extends BaseClass{
	
	ReadExcell readExcell=new ReadExcell();
	BankManagerPage bankManagerPage;
	
@BeforeSuite()
	public void initiateBrowser()
	{
		launchBrowser();
	}
	
//	@AfterSuite()
//	public void closeBrowser()
//	{
//		quitBrowser();
//	}
	
	
	@Test(priority=0)
	public void addCustomer() throws IOException
	{
		
		bankManagerPage=new BankManagerPage(driver);
		bankManagerPage.clickBankmanagertile();
		bankManagerPage.addCustomer();
		bankManagerPage.enterFirstName(readExcell.getFirstName());
		bankManagerPage.enterLastName(readExcell.getLastName());
		bankManagerPage.enterPostalCode(readExcell.getPostalCode());
		bankManagerPage.clickAddCustomer();
		String actualMessage=bankManagerPage.getAlertMessage();
		System.out.println(actualMessage);
		String expectedMessage="Customer added successfully with customer id :6";
		Assert.assertEquals(actualMessage, expectedMessage);
		String customerId=actualMessage.split(":")[1];
		readExcell.writeDataInExcel(Integer.parseInt(customerId));
		bankManagerPage.alertBox();
		
		
		
		}
	
	
	@Test(priority=1)
	public void accountNumberCreation() throws IOException
	{
		bankManagerPage=new BankManagerPage(driver);
		String userName=readExcell.getFirstName()+" "+readExcell.getLastName();
		bankManagerPage.selectOpenAccountOption();
		bankManagerPage.selectCustomerFromDropdown(userName);
		bankManagerPage.selectCurrencyFromDropdown(readExcell.getCurrency());
		bankManagerPage.clickprocess();
		String actual=bankManagerPage.getAlertMessage();
		System.out.println(actual);
		String expected="Account created successfully with account Number :1016";
		Assert.assertEquals(actual, expected);
		String accountNumber=actual.split(":")[1];
		readExcell.writeAccountNumberinExcel(Integer.parseInt(accountNumber));
		bankManagerPage.alertBox();
		bankManagerPage.selectCustomerOption();
		bankManagerPage.enterAccountNumber(readExcell.getAccountNumber());
		String actualAccountNumber=bankManagerPage.getAccountNumber();
		String expectedAccountNumber=readExcell.getAccountNumber();
		Assert.assertEquals(actualAccountNumber, expectedAccountNumber);
		getScreenshot();
	//	bankManagerPage.selectHomeBtn();
		
	}

}
