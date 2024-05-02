package seleniumpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {
public static WebDriver driver;
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/upload/");
		WebElement file=driver.findElement(By.cssSelector(".upload_txt"));
		Actions ac=new Actions(driver);
		ac.moveToElement(file).click().build().perform();
		Robot ro=new Robot();
		StringSelection ss=new StringSelection("C:\\Users\\VIGNKUMA\\Downloads\\file.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.delay(2000);
		ro.keyPress(KeyEvent.VK_V);
		ro.delay(2000);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.delay(2000);	
		ro.keyRelease(KeyEvent.VK_V);
		ro.delay(2000);
		ro.delay(2000);
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		ro.delay(2000);
	}

}
