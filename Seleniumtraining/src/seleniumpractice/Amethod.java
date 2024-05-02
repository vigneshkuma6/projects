package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amethod {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoqa.com/automation-practice-form");
		Actions ac = new Actions(driver);
		WebElement name=driver.findElement(By.cssSelector("#firstName"));
		WebElement lastname=driver.findElement(By.cssSelector("#lastName"));
		ac.moveToElement(name).click().sendKeys("vignesh").build().perform();
		ac.moveToElement(lastname).click().keyDown(Keys.SHIFT).sendKeys("kumar").build().perform();
		
	}

}
