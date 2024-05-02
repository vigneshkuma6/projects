package seleniumpractice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Windowhandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set<String> windows= driver.getWindowHandles();
		Iterator<String>it = windows.iterator();
		String parentwindow= it.next();
		String Childwindow=it.next();
		driver.switchTo().window(Childwindow);
		
		
		
		System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());
		String emailid= driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	driver.switchTo().window(parentwindow);
		driver.findElement(By.id("username")).sendKeys(emailid);
	}

}
