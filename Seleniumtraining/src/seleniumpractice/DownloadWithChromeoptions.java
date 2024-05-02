package seleniumpractice;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadWithChromeoptions {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		String location="C:\\Users\\VIGNKUMA\\Documents\\";
//		ChromeOptions options=new ChromeOptions();
//		Map<String,Object>prefs=new HashMap<String,Object>();
//		prefs.put("download.default_directory", location);
//		options.setExperimentalOption("Prefs", prefs);
//driver=new ChromeDriver(options);
		driver=new ChromeDriver();
		
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.browserstack.com/test-on-the-right-mobile-devices");
Thread.sleep(3000);
WebElement S = driver.findElement(By.xpath("//div[contains(@class,' startingup-statistics')]//child::a[text() = 'CSV']"));

JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", S);



	}

}
