package testcases;



import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Utils.ReadExcel;
import automation.Greenkart.BaseClass;
import testPages.LoginPage;
import testPages.LogoutPage;

public class GreenkartRunner extends BaseClass {
	
	@BeforeSuite()
	public void launchBrowser() throws IOException 
	{
		readPropertyFile();
		browserInitilization();
	}
	
	
	@Test()
	public void loginToSite() throws IOException
	{
		ReadExcel excel=new ReadExcel();
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUsername(excel.readUserID());
		loginPage.clickPassword();
		loginPage.enterPassword(excel.readPassword());
		loginPage.clickLoginBtn();
		takeScreenshot();
		excel.writeData("pass");
		
		
	}
	@Test()
	public void logoutFromSite()
	{
		LogoutPage logoutPage=new LogoutPage(driver);
		logoutPage.clickMenuOption();
		logoutPage.clickLogoutBtn();
	}
	@AfterSuite()
	public void closeBrowser()
	{
		//tearDown();
	}

}
