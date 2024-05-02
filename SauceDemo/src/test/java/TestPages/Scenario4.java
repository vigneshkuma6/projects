package TestPages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.GenericMethod;

public class Scenario4 extends GenericMethod {
	WebDriver driver;
	public String actual;
	ArrayList<Double> beforeprice = new ArrayList<Double>();
	ArrayList<Double> afterPrice = new ArrayList<Double>();
	@FindBy(css = ".product_sort_container")
	WebElement filterOption;
	@FindBy(css = ".inventory_item_price")
	List<WebElement> price;
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
	WebElement firstProduct;
	@FindBy(xpath = "//button[text()='Add to cart']")
	WebElement addToCartBtn;
	@FindBy(css = "#back-to-products")
	WebElement BackBtn;
	@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")
	WebElement secondProduct;
	@FindBy(css = ".shopping_cart_link")
	WebElement cartBtn;
	@FindBy(xpath = "//button[text()='Checkout']")
	WebElement checkOutBtn;
	@FindBy(id = "first-name")
	WebElement firstName;
	@FindBy(name = "lastName")
	WebElement lastName;
	@FindBy(xpath = "//input[@placeholder='Zip/Postal Code']")
	WebElement zipCode;
	@FindBy(css = "#continue")
	WebElement continueBtn;
	@FindBy(xpath = "//button[text()='Finish']")
	WebElement finishBtn;
	@FindBy(css = ".complete-header")
	WebElement orderPlacedMsg;
	@FindBy(xpath = "//button[text()='Back Home']")
	WebElement backHomeBtn;

	public Scenario4(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void applyFilter() {

		for (WebElement we : price) {
			beforeprice.add(Double.valueOf(we.getText().replace("$", "")));
		}
		Collections.sort(beforeprice);

		selectDropDown(filterOption, 2);

	}

	public void validatePriceFilter() {
		// ArrayList<Double>afterPrice=new ArrayList<Double>();
		for (WebElement p : price) {
			afterPrice.add(Double.valueOf(p.getText().replace("$", "")));
		}

		Assert.assertEquals(beforeprice, afterPrice);

	}

	public void addMultipleProduct() {
		Click(firstProduct);
		Click(addToCartBtn);
		Click(BackBtn);
		Click(secondProduct);
		Click(addToCartBtn);
		Click(BackBtn);
		Click(cartBtn);
	}

	public void checkoutPage(String fname, String lname, String pincode) {
		Click(checkOutBtn);
		EnterValue(firstName, fname);
		EnterValue(lastName, lname);
		EnterValue(zipCode, pincode);
		Click(continueBtn);
		ScrollToElementUsingJsExecuter(finishBtn);
		Click(finishBtn);

	}

	public void validatePlaceOrder(String expected) {
		actual = orderPlacedMsg.getText();
		Assert.assertEquals(actual, expected);
		Click(backHomeBtn);
	}
}
