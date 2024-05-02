package TestPages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenericMethod;

public class Scenario3 extends GenericMethod {
	WebDriver driver;
	ArrayList<String> addedProduct = new ArrayList<String>();
	ArrayList<String> cartProduct = new ArrayList<String>();
	public int cartSize;
	public int removedCartSize;
	@FindBy(xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")
	WebElement selectThirdProduct;
	@FindBy(xpath = "//button[text()='Add to cart']")
	WebElement addToCartBtn;
	@FindBy(css = "#back-to-products")
	WebElement backBtn;
	@FindBy(css = "#item_4_title_link")
	WebElement selectFirstProduct;
	@FindBy(css = ".shopping_cart_link")
	WebElement cartBtn;
	@FindBy(css = "#remove-sauce-labs-backpack")
	WebElement removeBtn;
	@FindBy(css = ".inventory_item_name")
	List<WebElement> cartList;
	@FindBy(css = ".shopping_cart_badge")
	WebElement cartIcon;

	public Scenario3(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void addMultipleProduct() throws InterruptedException {
		addedProduct.add(selectThirdProduct.getText());
		Click(selectThirdProduct);
		Click(addToCartBtn);
		Click(backBtn);
		addedProduct.add(selectFirstProduct.getText());
		Click(selectFirstProduct);
		Click(addToCartBtn);
		Click(cartBtn);
		cartSize = cartList.size();

	}

	public void validateSelectedItemInCart() {
		for (WebElement w : cartList) {
			cartProduct.add(w.getText());
		}
		if (cartProduct.containsAll(addedProduct)) {
			System.out.println("Both the products are added to cart");
		} else {
			System.out.println("Both the products are not added to cart");
		}
	}

	public void validateRemovedProductInCart() {

		Click(removeBtn);
		removedCartSize = cartList.size();
		if (cartSize != removedCartSize) {
			System.out.println("Second Product is removed from cart");
		} else {
			System.out.println("Second product is not removed from cart");
		}

	}
}
