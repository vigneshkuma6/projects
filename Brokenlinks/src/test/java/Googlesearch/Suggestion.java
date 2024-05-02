package Googlesearch;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Suggestion
{
	private WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		 WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); 
			driver.manage().window().maximize(); 
			driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void searching() 
	{
	WebElement textbox=driver.findElement(By.xpath("//input[@type='text']"));
	textbox.sendKeys("Selenium");
	//WebDriverWait wait = new WebDriverWait(driver,30);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='sbct']/div[1]/div[2]/div[1]/span")));
	List<WebElement> suggestions = driver.findElements(By.xpath("//li[@class='sbct']/div[1]/div[2]/div[1]/span"));
	System.out.println(suggestions.size());

	for (WebElement sug : suggestions)
	{
		System.out.println(sug.getText());	
	}
	}

	@AfterMethod
	public void tearDown() throws Exception 
	{
	driver.quit();
	}
	}


