import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_popupalert {
	public WebDriver driver ;
	public void browsersetup() throws InterruptedException
	{
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();  
		Thread.sleep(5000);
	}
	public void closelogin()
	{
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		System.out.println("Login window closed");
	}
	public void clickTravel() throws InterruptedException
	{
		String getText = driver.findElement(By.xpath("(//div[@class='xtXmba'])[8]")).getText();
		System.out.println(getText);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='xtXmba'])[8]")).click();
				
	}
	public void clickLoginbutton() 
	{
		
		Alert simpleAlert = driver.switchTo().alert();
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
	    simpleAlert.accept();
	}
	
	public void closeBrowser()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		Flipkart_popupalert popAlerts = new Flipkart_popupalert();
		popAlerts.browsersetup();
		popAlerts.closelogin();
		popAlerts.clickTravel();
		popAlerts.clickLoginbutton();
		popAlerts.closeBrowser();
		
	}

}
