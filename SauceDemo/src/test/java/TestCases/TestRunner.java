package TestCases;

import java.io.IOException;
import java.util.ArrayList;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import TestPages.Scenario1;
import TestPages.Scenario2;
import TestPages.Scenario3;
import TestPages.Scenario4;
import TestPages.Scenario5;
import utils.ReadExcell;
import TestPages.LoginPage;
import TestPages.LogoutPage;

public class TestRunner extends BaseClass {

	@BeforeMethod(alwaysRun = true)
	public void loginToSite() throws IOException {
		ReadExcell rex = new ReadExcell();
		ArrayList<String> sdata = rex.Readdata("LoginScenario");
		LoginPage lp = new LoginPage(driver);
		lp.userLogin(sdata.get(1), sdata.get(2));
	}

	@AfterMethod(alwaysRun = true)
	public void logOut() {
		LogoutPage lo = new LogoutPage(driver);
		lo.loggingOut();
	}

	@Test(groups = { "smoke" }, invocationCount = 5)
	public void verifyAddProduct() {
		Scenario1 sc1 = new Scenario1(driver);
		sc1.selectProduct();
		sc1.validateTitleOfProduct();
	}

	@Test(groups = { "sanity" })
	public void verifyCartPage() throws InterruptedException, IOException {
		ReadExcell rex = new ReadExcell();
		ArrayList<String> sdata1 = rex.Readdata("LoginScenario");
		Scenario2 sc2 = new Scenario2(driver);
		sc2.selectProduct();
		sc2.validateCart();
		sc2.validateBackToHome(sdata1.get(3));
	}

	@Test(priority = 3)

	public void addingMultipleProduct() throws InterruptedException {
		Scenario3 sc3 = new Scenario3(driver);
		sc3.addMultipleProduct();
		sc3.validateSelectedItemInCart();
		sc3.validateRemovedProductInCart();

	}

	@Test(priority = 4)
	public void placeOrder() throws IOException {
		ReadExcell rex = new ReadExcell();
		ArrayList<String> sdata2 = rex.Readdata("LoginScenario");
		Scenario4 sc4 = new Scenario4(driver);
		sc4.applyFilter();
		sc4.validatePriceFilter();
		sc4.addMultipleProduct();
		sc4.checkoutPage(sdata2.get(4), sdata2.get(5), sdata2.get(6));
		sc4.validatePlaceOrder(sdata2.get(7));
	}

	@Test(priority = 5)
	public void resetAppstate() {
		Scenario5 sc5 = new Scenario5(driver);
		sc5.applyFilter();
		sc5.validateFilter();
		sc5.addMultipleProduct();
		sc5.validateCartIcon();
	}

}
