package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import junit.framework.Assert;
import utils.GenericMethod;

public class Scenario2 extends GenericMethod {
	WebDriver driver;
	public String productprice;
	public String actualPrice;
	public String expectedTitle;
	public String actualTitle;
	@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")
	WebElement selectFouthProduct;
	@FindBy(xpath = "//button[text()='Add to cart']")
	WebElement addToCartBtn;
	@FindBy(css = ".shopping_cart_link")
	WebElement cartBtn;
	@FindBy(css = ".inventory_details_price")
	WebElement price;
	@FindBy(css = ".inventory_item_price")
	WebElement cartPrice;
	@FindBy(id = "continue-shopping")
	WebElement ContinueShopingBtn;

	public Scenario2(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectProduct() throws InterruptedException {

		Click(selectFouthProduct);
		productprice = price.getText();
		Click(addToCartBtn);
		Click(cartBtn);
	}

	public void validateCart() throws InterruptedException {
		if (selectFouthProduct.isDisplayed()) {
			System.out.println("The product is added to cart");
		}
		actualPrice = cartPrice.getText();
		Thread.sleep(3000);
		Assert.assertEquals(productprice, actualPrice);
	}

	public void validateBackToHome(String pageTitle) {
		Click(ContinueShopingBtn);
		expectedTitle = pageTitle;
		actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

}
