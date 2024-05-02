package seleniumpractice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.saucedemo.com/");
for(int i=0;i<1000000;i++)
{
	
}
driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
List<WebElement>ele=driver.findElements(By.xpath("//*"));
System.out.println(ele.size());
for(WebElement w:ele)
{
	
	System.out.println(w.getText());
}

	}

}
