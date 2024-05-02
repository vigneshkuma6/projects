package seleniumpractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

//import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List <WebElement>links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link:links)
		{
			String url= link.getAttribute("href");
			HttpURLConnection con= (HttpURLConnection) new URL(url).openConnection();
			con.setRequestMethod("HEAD");
			con.connect();
			int responsecode= con.getResponseCode();
			if(responsecode>400)
			{
				System.out.println("the link with Text  "+ link.getText()+"is broken with code"+responsecode);
			//	Assert.assertTrue(false);
			}
		}
		
	}

}
