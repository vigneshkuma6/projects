package TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	 static WebDriver driver;

	String Filepath = "src//test//resource//stestdata.properties";
	Properties properties;

	@BeforeSuite(alwaysRun = true)
	public void launchBrowser() throws IOException {
		properties = new Properties();
		FileInputStream fis = new FileInputStream(Filepath);
		properties.load(fis);
		// WebDriverManager.chromedriver().create();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(properties.getProperty("url"));

	}

	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		driver.quit();

	}

}
