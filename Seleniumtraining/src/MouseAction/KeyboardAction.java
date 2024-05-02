package MouseAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions action=new Actions(driver);
		WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		action.keyDown(firstName, Keys.SHIFT).sendKeys("vignesh").keyUp(Keys.SHIFT).build().perform();
		action.contextClick(firstName).keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
	}

}
