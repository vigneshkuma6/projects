package seleniumpractice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
	//	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		//clicking round trip radio button
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		//driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();	
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("it is enabled");
		//	Assert.ass
		}
		else
		{
		//	Assert.assertTrue(false);
			
		}
		//selecting departure city
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//Thread.sleep(10000);
	
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	//	driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_destinationStation1']/option[@value='MAA']")).click();
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	}

}
