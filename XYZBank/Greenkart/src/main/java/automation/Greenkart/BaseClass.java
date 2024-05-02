package automation.Greenkart;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass  {
	
	public  WebDriver driver;
	Properties properties;
	String path="src//test//resource//Testdata.properties";
	
	public void browserInitilization() throws IOException
	{

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//readPropertyFile();
		driver.get(properties.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
	}
	public void tearDown()
	{
		driver.quit();
	}
	public void readPropertyFile() throws IOException
	{
		properties=new Properties();
		 FileInputStream fis=new FileInputStream(path);
		 properties.load(fis);
	}
	public void takeScreenshot() throws IOException
	{
		Date currentDate=new Date();
		String fileName=currentDate.toString().replaceAll(" ", "-").replaceAll(":", "-");
		System.out.println(fileName);
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//Screenshot//"+fileName+".png"));	
	}
	

}
