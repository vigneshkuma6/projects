import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Differentlocators {

	public static void main(String[] args) throws InterruptedException {
		// WebDriverManager.chromedriver().setup();
	        WebDriver driver ;
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();  
	        driver.get("https://www.amazon.in/");
	        Thread.sleep(5000);
	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
	        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	        driver.findElement(By.linkText("Electronics")).click();
	       // driver.findElement(By.xpath("(//span[@class='nav-line-2'])[2]")).click();
	}

}
