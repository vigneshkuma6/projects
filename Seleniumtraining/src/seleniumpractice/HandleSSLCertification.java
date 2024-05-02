package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandleSSLCertification {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("incognito");
		options.addArguments("headless");
		DesiredCapabilities dc=new DesiredCapabilities(options);
		
	 driver=new ChromeDriver(options);
	 driver.manage().window().maximize();
	 driver.get("https://www.saucedemo.com/");
	 System.out.println(driver.getTitle());
	// driver.quit();
	}

}
