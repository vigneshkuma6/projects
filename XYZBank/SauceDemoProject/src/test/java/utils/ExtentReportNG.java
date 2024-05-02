package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	

	public static ExtentReports config()
	{
		String path=System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setReportName("Automation Results");
		report.config().setDocumentTitle("SauceDemo");
		
		ExtentReports extent =new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Vignesh");
		return extent;
	}

}
