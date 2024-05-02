import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;




public class Day1 {

	public static void main(String[] args) {
	
		    {
		        // TODO Auto-generated method stub

		        System.out.println("Test");

		        //System.setProperty("webdriver.chrome.driver", "C:\\Purushotham\\Automation\\chromedriver_win32\\chromedriver.exe");
		     
		        WebDriver driver ;
		        driver = new ChromeDriver();
		        driver.get("https://www.orangehrm.com/");
		        String getCurrentUrl = driver.getCurrentUrl();
		        System.out.println("Get Current URL-->"+getCurrentUrl);
		 //       Assert.assertEquals(getCurrentUrl,"https://www.orangehrm.com/");
		        String getEmailText = driver.findElement(By.xpath("//input[@id='myText']")).getAttribute("placeholder");
		        System.out.println("Get Email text-->"+getEmailText);
		        driver.close();
		    }

		}
}