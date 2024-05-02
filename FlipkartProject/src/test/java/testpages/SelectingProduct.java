package testpages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectingProduct extends GenericMethods
{

	WebDriver driver;

	Logger logger = Logger.getLogger(SelectingProduct.class);
	//@FindBy(xpath="//div[@class='_1AtVbE col-12-12'][1]/div[1]/div[3]")
	//WebElement selectproduct;
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[4]/div/div/div/a/div[2]/div[1]/div[1]")
	WebElement selectproduct;
	@FindBy(xpath="//img[@class='_396cs4 _2amPTt _3qGmMb  _3exPp9']")
	WebElement product;
	@FindBy(xpath="//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")
	WebElement click_cart;
	@FindBy(xpath="//span[contains(text(), 'Please select a Size- UK/India to proceed')]")
	WebElement error_msg;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement enter_pincode;
	@FindBy(xpath="//span[contains(text(),'Check')]")
	WebElement check_btn;
	@FindBy(xpath="(//a[contains(.,'M')])[3]")
	WebElement Select_size;
	@FindBy(xpath="//img[@class='xhPPpX']")
	WebElement change_pincode;


	// Creating constructor for Selectingproduct  class
	public SelectingProduct (WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Method to select the 11th product
	public void select11product() throws IOException 
	{		
		//ScrollUsingJsExecuter();
		ScrollToElementUsingJsExecuter(selectproduct);
		SelectUsingJsExecuter(selectproduct);
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow= iterator.next();
		String childwindow= iterator.next();
		driver.switchTo().window(childwindow);
		logger.info("User is switched to placeorder window");
		TakeScreenshot();
		System.out.println(driver.getTitle());	
		//	Click(change_pincode);
		ReadExcellData ex1 = new ReadExcellData();
		Double pincode= ex1.get_pincode();
		String s=String.valueOf(pincode);  
		EnterValue(enter_pincode, s);	
		TakeScreenshot();
			Click(check_btn);
		//stalenessOfElement(click_cart);
		driver.navigate().refresh();
		Click(click_cart);
		TakeScreenshot();
	}



}