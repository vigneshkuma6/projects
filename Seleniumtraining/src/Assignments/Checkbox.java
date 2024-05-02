package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	//	driver.findElement(By.cssSelector(".form-control.ng-pristine.ng-invalid.ng-touched")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("rahul@gmail.com");
		driver.findElement(By.cssSelector("input#exampleInputPassword1")).sendKeys("password");
		driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();
		WebElement gender= driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		Select option = new Select(gender);
		option.selectByValue("Male");
		driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("05-06-2023");
	}

}
