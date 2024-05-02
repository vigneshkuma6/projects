package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@class='gb_H gb_I']//following-sibling::div")).click();
	}

}
