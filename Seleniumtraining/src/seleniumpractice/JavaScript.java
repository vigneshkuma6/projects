package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		js.executeScript("arguments[0].value='standard_user';",username);
		}

}
