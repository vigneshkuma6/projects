package links;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AuthenticationPopup {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
		String actual=driver.findElement(By.xpath("//h3[text()='Basic Auth']/following::p")).getText();
		String expected="Congratulations! You must have the proper credentials.";
		Assert.assertEquals(actual, expected);
		System.out.println("Assertion passed");
		
		
	
	}

}
