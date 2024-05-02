package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	public static ExtentReports extentReportConfig()
	{
		String path=System.getProperty("user.dir")+"//report//index.html";
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setReportName("Automation Report");
		report.config().setDocumentTitle("sauce");
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("tester", "name");
		return extent;
	}

}
