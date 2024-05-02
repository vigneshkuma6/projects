package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ElementIsPresent {
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option =new ChromeOptions();
		option.addArguments("headless");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		WebElement button = driver.findElement(By.cssSelector("#login-button"));
		System.out.println(button.isDisplayed());
		
		
	}

}
