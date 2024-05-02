package MultipleTabs;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile 
{
	private WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.6.1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void mutlitipletabs() 
	{	
		WebElement link= driver.findElement(By.xpath("//span[contains(text(),' (965 KB)')]"));
		link.click();
	}

	@AfterMethod
	public void tearDown() throws Exception 
	{
		driver.quit();
	}
}


