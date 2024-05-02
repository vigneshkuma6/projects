package seleniumpractice;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;



public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("");
		JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(3000);
		js.executeScript("document.querySelector('div.tableFixHead').scrollBy(0,500)");
		List<WebElement> values = driver.findElements(By.cssSelector("div.tableFixHead td:nth-child(4)"));
int sum=0;
		for(int i =0;i<values.size();i++)
{
	
	
	sum= sum + Integer.parseInt(values.get(i).getText());
}
		System.out.println(sum);
	
		int Expectedvalue =Integer.parseInt(driver.findElement(By.cssSelector("div.totalAmount")).getText().split(":")[1].trim());
	System.out.println(Expectedvalue);
	//Assert.assertEquals(sum, Expectedvalue);
	}

}
