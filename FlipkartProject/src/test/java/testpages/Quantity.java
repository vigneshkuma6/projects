package testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quantity extends GenericMethods
{

	WebDriver driver;

	@FindBy(xpath="//button[@class='_23FHuj'][2]")
	WebElement Increase;
	@FindBy(xpath="//button[@class='_23FHuj'][1]")
	WebElement decrease;
	@FindBy(xpath="//span[contains(text(),'Place Order')]")
	WebElement Placeorder;

	// Creating constructor for Quantity class
	public Quantity(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	// Method to click Increase button
	public void Incrbuttton()
	{
		ClicableElement(Placeorder);
		SelectUsingJsExecuter(Increase);	
		TakeScreenshot();		
	}

	// Method to click decrease button
	public void Decrbuttton()
	{  	
		ClicableElement(decrease);
		SelectUsingJsExecuter(decrease);	
		TakeScreenshot();		
	}

}
