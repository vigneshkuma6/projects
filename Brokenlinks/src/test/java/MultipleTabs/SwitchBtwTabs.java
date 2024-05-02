package MultipleTabs;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchBtwTabs
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
	public void mutlitipletabs() 
	{
		Actions action=new Actions(driver);
		WebElement gmail= driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
		action.moveToElement(gmail).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow= iterator.next();
		String childwindow= iterator.next();
		driver.switchTo().window(childwindow);
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		action.keyDown(Keys.ALT).keyDown(Keys.SHIFT).sendKeys("d").build().perform();
	}

	@AfterMethod
	public void tearDown() throws Exception 
	{
		driver.quit();
	}
}


