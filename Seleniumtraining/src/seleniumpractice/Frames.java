package seleniumpractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
	//	driver.findElement(By.id("draggable")).click();
		Actions ac = new Actions(driver);
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement Target= driver.findElement(By.id("droppable"));
		ac.dragAndDrop(source, Target).build().perform();
		
		
		
		
	}

}
