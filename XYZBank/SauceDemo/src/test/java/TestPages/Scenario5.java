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

public class Scenario5 extends GenericMethod {
	WebDriver driver;
	public String actualProductsCount;
	public String expectedProductCount;
	ArrayList<String> beforeTitle = new ArrayList<String>();
	ArrayList<String> afterTitle = new ArrayList<String>();
	ArrayList<String> cartProduct = new ArrayList<String>();
	@FindBy(css = ".product_sort_container")
	WebElement filterOption;
	@FindBy(css = ".inventory_item_name ")
	List<WebElement> title;
	@FindBy(xpath = "//div[text()='Sauce Labs Onesie']")
	WebElement firstProduct;
	@FindBy(xpath = "//button[text()='Add to cart']")
	WebElement addToCartBtn;
	@FindBy(css = "#back-to-products")
	WebElement BackBtn;
	@FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")
	WebElement secondProduct;
	@FindBy(css = ".shopping_cart_badge")
	WebElement cartBtn;
	@FindBy(css = "#react-burger-menu-btn")
	WebElement menuOption;
	@FindBy(css = "#reset_sidebar_link")
	WebElement appReset;
	@FindBy(xpath = "//button[text()='Back Home']")
	WebElement backHomeBtn;

	public Scenario5(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void applyFilter() {

		for (WebElement we : title) {
			beforeTitle.add(we.getText());
		}
		Collections.sort(beforeTitle);
		Collections.reverse(beforeTitle);

		selectDropDown(filterOption, 1);
	}

	public void validateFilter() {

		for (WebElement p : title) {
			afterTitle.add(p.getText());
		}

		Assert.assertEquals(beforeTitle, afterTitle);

	}

	public void addMultipleProduct() {
		cartProduct.add(firstProduct.getText());
		Click(firstProduct);
		Click(addToCartBtn);
		Click(BackBtn);
		cartProduct.add(secondProduct.getText());
		Click(secondProduct);
		Click(addToCartBtn);
	}

	public void validateCartIcon() {
		actualProductsCount = cartBtn.getText();
		expectedProductCount = Integer.toString(cartProduct.size());
		Assert.assertEquals(actualProductsCount, expectedProductCount);

	}

}
