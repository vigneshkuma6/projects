package TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import junit.framework.Assert;
import utils.GenericMethod;

public class Scenario1 extends GenericMethod {
	WebDriver driver;
	public String productTitle;
	@FindBy(css = "#item_3_title_link")
	WebElement selectLastProduct;
	@FindBy(xpath = "//button[text()='Add to cart']")
	WebElement addToCartButton;
	@FindBy(css = ".shopping_cart_link")
	WebElement cartButton;
	@FindBy(xpath = "//div[text()='Test.allTheThings() T-Shirt (Red)']")
	WebElement cartProduct;

	public Scenario1(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectProduct() {
		productTitle = selectLastProduct.getText();
		ScrollToElementUsingJsExecuter(selectLastProduct);
		Click(selectLastProduct);
		VisibilityOfElement(addToCartButton);
		Click(addToCartButton);
		VisibilityOfElement(cartButton);
		Click(cartButton);

	}

	public void validateTitleOfProduct() {
		if (selectLastProduct.isDisplayed()) {
			System.out.println("Selected product is added to cart");
		}
		String cartProductTitle = cartProduct.getText();
		Assert.assertEquals(productTitle, cartProductTitle);

	}
}
