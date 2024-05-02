package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {
	public static WebDriver driver;

	String Filepath = "src//test//resource//stestdata.properties";
	Properties properties;
	ExtentReports extent = new ExtentReports();

	@BeforeSuite
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

	@AfterSuite
	public void tearDown() {
		driver.quit();

	}

	@BeforeTest
	public void config() {
		String path = System.getProperty("user.dir") + "//reports//index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("Automation Results");
		report.config().setDocumentTitle("SauceDemo");

		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Vignesh");

	}

	public String getscreenshot(String testcasename) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(System.getProperty("user.dir") + "//Screenshot//" + testcasename + ".png");
		FileUtils.copyFile(SrcFile, DestFile);
		return System.getProperty("user.dir") + "//Screenshot//" + testcasename + ".png";
	}

}
