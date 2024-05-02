package loginscenario;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class Login {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>userName=new ArrayList<String>();
		userName.add("");
		userName.add("qkewh");
		userName.add("standard_user");
		ArrayList<String>passWord=new ArrayList<String>();
		passWord.add("");
		passWord.add("123");
		passWord.add("secret_sauce");
		ArrayList<String>errorMessage=new ArrayList<String>();
		errorMessage.add("Epic sadface: Username and password do not match any user in this service");
		errorMessage.add("Epic sadface: Username is required");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for(int i=0;i<=1;i++)
		{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(userName.get(i));
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(passWord.get(i));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String actual=driver.findElement(By.xpath("//div[contains(@class,'error-message')]")).getText();
		String expected=errorMessage.get(i);
		
		
	}
	}
}
