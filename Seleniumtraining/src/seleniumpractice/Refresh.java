package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		driver.navigate().refresh();
		userName.sendKeys("standard_user");
		
		
	}

}
