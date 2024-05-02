package seleniumpractice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Ecom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int j = 0;
		String[] items = { "Brocolli ", "Cucumber " };
	//	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(5000);
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String Formatedname = name[0].trim();
			List itemlist = Arrays.asList(items);

			if (itemlist.contains(Formatedname)) {
				j++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				if (j == items.length) {
					break;
				}
			}

		}
	}
}
