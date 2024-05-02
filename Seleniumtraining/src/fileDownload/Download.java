package fileDownload;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Download {
public static WebDriver driver;

public static File downloadedFileName()
{
	String userName=System.getProperty("user.name");
	System.out.println(userName);
	File file=new File("C:\\Users\\"+userName.toUpperCase()+"\\Downloads");
	File downloadedFile = null;
	File[] files=file.listFiles();
	for (int i = 0; i < files.length; i++) {
		if (files[i].getName().startsWith("BrowserStack")) {
			String downloadedExcelName = files[i].getName();
			 downloadedFile=files[i].getAbsoluteFile();
			System.out.println(downloadedFile);
			System.out.println(downloadedExcelName);
			break;
		}
	}
	return downloadedFile;
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/test-on-the-right-mobile-devices");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String userName=System.getProperty("user.name");
		WebElement dowloadFile=driver.findElement(By.xpath("//div[contains(@class,' startingup-statistics')]//child::a[text() = 'CSV']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", dowloadFile);
		Thread.sleep(10000);
		String sorceFolder=downloadedFileName().toString();
		System.out.println(sorceFolder);
		String target="C:\\Users\\"+userName.toUpperCase()+"\\OneDrive - Capgemini\\Documents\\dummy\\BrowserStack - List of devices to test on.csv";
		Path result=null;
		try {
			result=Files.move(Paths.get(sorceFolder), Paths.get(target));
		}
		catch(IOException ex)
		{
			System.out.println("Exception while moving file");
			System.out.println(ex);
			ex.printStackTrace();
		}
		if(result!=null)
		{
			System.out.println("File moved successfully");
		}
		else	{
			System.out.println("File not moved");
		}
		
	}

}
