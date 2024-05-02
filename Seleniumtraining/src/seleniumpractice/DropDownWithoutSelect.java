package seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithoutSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.naukri.com/");
		driver.findElement(By.cssSelector("#expereinceDD")).click();
		List<WebElement>city=driver.findElements(By.xpath("//ul[@class='dropdown ']/li"));
		for(WebElement w:city)
		{
			
			System.out.println(w.getText());
		}
		
		

	}

}
