package seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolsQaform {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("vignesh");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("vignesh@gmail.com");
		WebElement gender=driver.findElement(By.xpath("//label[text()='Male']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", gender);
		gender.click();
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("0123456789");
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		Select month=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		month.selectByVisibleText("December");
		Select year=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
		year.selectByVisibleText("1996");
		driver.findElement(By.xpath("//div[text()='21']")).click();
		WebElement subject=driver.findElement(By.xpath("//div[starts-with(@class,'subjects-auto-complete__value')]"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(subject));
		subject.sendKeys("computer");
		driver.findElement(By.xpath("//label[text()='Sports']")).click();
	}

}
