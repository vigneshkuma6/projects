package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Updateddropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	//			WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				driver.findElement(By.id("divpaxinfo")).click();
				Thread.sleep(2000);
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
				int i=1;
				while(i<5)
				{
					driver.findElement(By.id("hrefIncAdt")).click();
					i++;
				}
				
				driver.findElement(By.id("btnclosepaxoption")).click();
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
