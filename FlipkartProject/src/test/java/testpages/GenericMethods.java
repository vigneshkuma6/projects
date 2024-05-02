package testpages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods 
{
	static WebDriver driver;

	// Creating constructor for actions
	public GenericMethods(WebDriver driver)
	{
		this.driver=driver;
	}

	// Method to click a element
	public static void Click(WebElement element)
	{
		element.click();
	}

	//Method to enter value in text box
	public static void EnterValue (WebElement element, String text)
	{
		element.sendKeys(text);
	}
	
	// Method for explicit wait(visibility of element) 
	public static void VisibilityOfElement(WebElement element)
	{
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(element));
		//	wait.until(ExpectedConditions.stalenessOf(element));
	}

	// Method for explicit wait(element to be clickable) 
	public static void ClicableElement(WebElement element)
	{
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}

	// Method to take screenshot
	public static void TakeScreenshot() 
	{
		Date Currentdate = new Date();
		String Screenshotfilename = Currentdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(Screenshotfilename);
		File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try 
		{
			FileUtils.copyFile(Screenshot, new File(".//Screenshot//"+Screenshotfilename+".png"));
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	// Method to get size of the list
	public static void SizeOfList(List<WebElement> element)
	{
		List<WebElement> products =  element; 
		System.out.println(products.size());
		for (WebElement product : products)
		{
			System.out.println(product.getText());
			System.out.println("<======================================>");
		}

	}

	//Method to select a element using javascript executer 
	public static void SelectUsingJsExecuter(WebElement element)
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}

	//Method to scroll to  a element using javascript executer 
	public static void ScrollToElementUsingJsExecuter(WebElement element)
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		
		ChromeOptions op=new ChromeOptions();
		
	}

	//Method to scroll using javascript executer 
	public static void ScrollUsingJsExecuter()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
	}

	//Method for Implicit wait
	public static void ImplicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	//Method for explicit wait(staleness of element)
	public static void stalenessOfElement(WebElement element)
	{
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.stalenessOf(element));
	}
}
