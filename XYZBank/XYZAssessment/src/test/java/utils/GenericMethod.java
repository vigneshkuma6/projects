package utils;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethod {

	WebDriver driver;

	public GenericMethod(WebDriver driver) {
		this.driver = driver;
	}

	public void click(WebElement element) {
		element.click();
	}

	public void enterText(WebElement element, String text) {
		element.sendKeys(text);

	}

	public String alertText() {
		String text = driver.switchTo().alert().getText();
		return text;
	}

	public void dropdownWithText(WebElement element, String text) {
		Select se = new Select(element);
		se.selectByVisibleText(text);
	}

	public void alertBox() {
		driver.switchTo().alert().accept();
	}

	public void elementToBeClicable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
