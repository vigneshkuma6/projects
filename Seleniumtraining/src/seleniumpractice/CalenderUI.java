package seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// WebElement
		// calender=driver.findElement(By.xpath("//label[@for='departure']"));
		Thread.sleep(3000);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		WebElement calender = driver.findElement(By.xpath("//span[contains(text(),'Departure')]"));
		wait.until(ExpectedConditions.visibilityOf(calender));
		calender.click();
		List<WebElement> month = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div"));
		List<WebElement> date = driver.findElements(By.xpath("//div[@class='dateInnerCell']/p[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for(WebElement m:month)	
		{
			if(m.getText().equalsIgnoreCase("February 2024"))
			{
				for(WebElement ele:date)
				{
					if(ele.getText().equalsIgnoreCase("28"))
					{
						wait.until(ExpectedConditions.elementToBeClickable(ele));
						js.executeScript("arguments[0].click();", ele);
						break;
					}
					break;
				}
			}
			else
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				//wait.until(ExpectedConditions.stalenessOf(m));
			}
		}
			}
}
