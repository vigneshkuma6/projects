package Testcases;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass 
{
	Properties properties; 
	Logger logger = Logger.getLogger(Baseclass.class);
	public static WebDriver driver;
	String propertyFilePath= "src//main//resources//FKdata.properties";

	//  Method to launch Browser  
	@BeforeSuite
	public void initialize() 
	{    	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		logger.info("Chrome browser is launched");
		driver.manage().window().maximize();
		logger.info("Window is maximized");
		driver.manage().deleteAllCookies(); 
		logger.info("cookies deleted");
		// To open Flipkart site
		readproperty();
		driver.get(properties.getProperty("URL"));
		//driver.get("https://www.flipkart.com/");
		logger.info("Flipkart site is opened");
	}

	// Method to close Browser
	@AfterSuite
	public void TeardownTest() 
	{
		driver.quit();
		logger.info("Browser is closed");
	}

	// Method to Read property file
	@ BeforeMethod
	@Parameters("property")
	public void readproperty()

	{
		BufferedReader reader;
		try
		{
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try
			{
				properties.load(reader);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
}




