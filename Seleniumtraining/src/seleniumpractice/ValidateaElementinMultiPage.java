package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidateaElementinMultiPage {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://webscraper.io/test-sites/e-commerce/static/computers/laptops?page=1");
		WebElement targetWebelemt = driver.findElement(By.cssSelector(".page-header"));
		WebElement targetWebelemt1 = driver.findElement(By.cssSelector(".page-header"));
		WebElement toggleBTn = driver.findElement(By.xpath("//a[text()='›']"));
		WebElement toggleBTn1 = driver.findElement(By.xpath("//a[text()='›']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollIntoView(true);", toggleBTn);
		// toggleBTn.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.stalenessOf(toggleBTn));
		for (int i = 1; i < 20; i++) {
			if (targetWebelemt.isDisplayed()) {
				count++;
				try {

					// driver.navigate().refresh();
					js.executeScript("arguments[0].scrollIntoView(true);", toggleBTn);
					toggleBTn.click();
				} catch (Exception e) {
					js.executeScript("arguments[0].scrollIntoView(true);", toggleBTn1);
					toggleBTn.click();
					System.out.println(e);
				}
			} else {
				js.executeScript("arguments[0].scrollIntoView(true);", toggleBTn);
				toggleBTn.click();

			}
		}
		System.out.println(count);
		driver.quit();
	}

}
