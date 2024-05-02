package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.TAB);
		String url="https://www.browserstack.com/";
		driver.navigate().to(url);
	}

}
