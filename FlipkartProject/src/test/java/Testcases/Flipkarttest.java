package Testcases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import testpages.LoginWindow;
import testpages.PlaceOrder;
import testpages.Quantity;
import testpages.SelectingDeals;
import testpages.SelectingProduct;



public class Flipkarttest extends Baseclass
{
	Logger logger = Logger.getLogger(Flipkarttest.class.getName());

	@Test
	public void Test1 () 
	{
		// Creating object for Loginwindow class
		LoginWindow fk = new LoginWindow(driver);
		fk.closeloginbtn(); 
		logger.info("Login window is closed");
		logger.info("Screenshot is taken");
		fk.view_all_option();
		logger.info("View all option is clicked");
		logger.info("Screenshot is taken");
		fk.count_no_of_deals();	
		logger.info("Test1 is executed successfully");
		
	}

	@Test
	public void Test2 () 
	{
		// Creating object for Selectingdeals class
		SelectingDeals deal =new SelectingDeals(driver);		
		deal.selectproduct();	
		logger.info("Third product is selected");
		logger.info("Screenshot is taken");
		deal.count_deals();
		logger.info("Test2 is executed successfully");
	}

	@Test
	public void Test3() throws IOException 
	{

		// Creating object for  Selectingproduct  class
		SelectingProduct product = new SelectingProduct(driver);   
		product.select11product();
		logger.info("Screenshot is taken");
		logger.info("Test3 is executed successfully");
	}

	@Test

	public void Test4() 
	{
		// Creating object for  Quantity  class
		Quantity qt= new Quantity(driver);    
		qt.Incrbuttton(); 
		logger.info("Increase button is clicked");
		logger.info("Screenshot is taken");
		qt.Decrbuttton();
		logger.info("Decrease button is clicked");
		logger.info("Screenshot is taken");
		logger.info("Test4 is executed successfully");
	}

	@Test
	public void Test5() throws IOException 
	{
		// Creating object for Placeorderclass
		PlaceOrder  po = new PlaceOrder (driver);
		po.palce_order();   
		logger.info("Place order button is clicked");
		logger.info("Screenshot is taken");
		po.Enter_details();     
		logger.info("Entered login details");
		logger.info("Screenshot is taken");
		po.Click_sbmit();
		logger.info("Submit button is clicked");
		logger.info("Screenshot is taken");
		po.verifying_error_msg();
		logger.warn("Please enter valid Email ID/Mobile number");
		logger.info("Screenshot is taken");
		logger.info("Test5 is executed successfully");
	}

}