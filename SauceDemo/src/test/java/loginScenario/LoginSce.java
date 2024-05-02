package loginScenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginSce {
	public static WebDriver driver;

	@Test()
	public void emptyUserLogin() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String actual = driver.findElement(By.xpath("//div[contains(@class,'error-message')]")).getText();
		String expected = "Epic sadface: Username is required";
		Assert.assertEquals(actual, expected);

	}

	@Test
	public void invalidUserLogin() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("afrjfosk");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("GRTEH");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String actual = driver.findElement(By.xpath("//div[contains(@class,'error-message')]")).getText();
		String expected = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(actual, expected);

	}

	@Test
	public void validUserLogin() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String actual = driver.findElement(By.xpath("//span[text()='Products']")).getText();
		String expected = "Products";
		Assert.assertEquals(actual, expected);

	}

}
