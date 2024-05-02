package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demosite {
WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.findElement(By.cssSelector("#vfb-5")).sendKeys("vignesh");
		driver.findElement(By.id("vfb-7")).sendKeys("kumar");
		driver.findElement(By.name("vfb-31")).click();
		driver.findElement(By.cssSelector("#vfb-13-address")).sendKeys("vivek street");
		driver.findElement(By.name("vfb-13[address-2]")).sendKeys("kolathur");
		driver.findElement(By.xpath("//input[@name='vfb-13[city]']")).sendKeys("no.6");
		driver.findElement(By.xpath("//input[@id='vfb-13-state']")).sendKeys("Tamilnadu");
		driver.findElement(By.id("vfb-13-zip")).sendKeys("chennai-99");
		driver.findElement(By.cssSelector("#vfb-14")).sendKeys("vicky@gmail.com");
//	WebElement ele=driver.findElement(By.xpath("(//span[@class='selection'])[1]"));
	WebElement ele=driver.findElement(By.xpath("//span[contains(@aria-labelledby,'select2-vfb-13-country-container')]"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(ele).click().sendKeys("India").sendKeys(Keys.ENTER).build().perform();
		WebElement date=driver.findElement(By.cssSelector("#vfb-18"));
		ac.moveToElement(date).click().sendKeys("30-11-2023").sendKeys(Keys.ENTER).build().perform();
		WebElement hour=driver.findElement(By.xpath("//span[contains(@aria-labelledby,'select2-vfb-16-hour-container')]"));
	//	WebElement hour=driver.findElement(By.cssSelector("#select2-vfb-16-hour-container"));	
		ac.moveToElement(hour).click().sendKeys("1").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		WebElement minutes =driver.findElement(By.cssSelector("#select2-vfb-16-min-container"));
		ac.moveToElement(minutes).click().sendKeys("3").sendKeys(Keys.ENTER).build().perform();
		
	}

}
