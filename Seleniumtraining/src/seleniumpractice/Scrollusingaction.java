package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrollusingaction {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/guide/exceptions-in-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.xpath("//h3[@id='toc4']"));
		Actions ac=new Actions(driver);
		Thread.sleep(5000);
		ac.moveToElement(ele).build().perform();
	}

}
