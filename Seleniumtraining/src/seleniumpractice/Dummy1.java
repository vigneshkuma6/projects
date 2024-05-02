package seleniumpractice;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dummy1 {
//public  WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//To store the download file location in a variable
		 WebDriver driver;
				String location= "C:\\Users\\VIPERUMA\\Documents\\";
				
				//Creating an object for chromeoptions
				ChromeOptions options= new ChromeOptions();
				//setting download preferences
				Map<String, Object> prefs= new HashMap<>();
				prefs.put("download.default_directory", location);
				options.setExperimentalOption("prefs", prefs);
				
				//Initiating chromebrowser
				driver= new ChromeDriver(options);
				
		//driver=new ChromeDriver();
				driver.get("https://the-internet.herokuapp.com/download");
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//clicking the download file
				driver.findElement(By.xpath("//a[contains(text(), 'test1.png')]")).click();
				
				Thread.sleep(3000);
				

	}

}
