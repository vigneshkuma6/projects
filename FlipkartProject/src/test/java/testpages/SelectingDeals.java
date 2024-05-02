package testpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectingDeals extends GenericMethods
{

	WebDriver driver;
	@FindBy(xpath="(//a[@class='_6WQwDJ'])[3]")
	WebElement third_deal;
	@FindBy(xpath="//div[@data-id]")
	List<WebElement> no_of_product;

	// Creating constructor for Selectingdeals  class
	public SelectingDeals (WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Method to select third product
	public void selectproduct()
	{
		Click(third_deal);						
	}

	// Method to count the total number of items in third product
	public void count_deals()
	{
		SizeOfList(no_of_product);
		TakeScreenshot();
	}

}

