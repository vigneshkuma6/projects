package seleniumpractice;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get("https://www.browserstack.com/test-on-the-right-mobile-devices");
		Thread.sleep(3000);
		WebElement S = driver.findElement(By.xpath("//div[contains(@class,' startingup-statistics')]//child::a[text() = 'CSV']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;;
		js.executeScript("arguments[0].click();", S);
		Thread.sleep(5000);
		verifyExcelIsDownloadedAndMoveToProjectLocation("BrowserStack");
		Thread.sleep(5000);

		driver.quit();
	}
		public static String verifyExcelIsDownloadedAndMoveToProjectLocation(String fileName) throws IOException {
			String downloadedExcelName = "";
			String fileLocationPathInProject = "";
			try {
				String userName = System.getProperty("user.name");
				System.out.println(userName.toUpperCase());
				String currentDirLocation = System.getProperty("user.dir");
				System.out.println(currentDirLocation);
				String defaultpath = "C:\\Users\\"+ userName.toUpperCase() +"\\Downloads";
				System.out.println(defaultpath);
				downloadedExcelName = getNameOfDownLoadedExcelFile(defaultpath, fileName);
				System.out.println(downloadedExcelName);
			//	String LocationPath = currentDirLocation + "\\src\\test\\java";
				String LocationPath = currentDirLocation + "\\src\\report";
				System.out.println(LocationPath);
				String DefaultLocationPath = defaultpath + "\\" + downloadedExcelName;
				System.out.println(DefaultLocationPath);
				File file2 = new File(LocationPath);
				File[] file1 = file2.listFiles();
				String projectReportLocationPath = "";
				for (File file : file1) {
					projectReportLocationPath = file.getAbsolutePath();
					System.out.println(projectReportLocationPath);
					break;
				}
				fileLocationPathInProject = projectReportLocationPath + "\\" + downloadedExcelName;
				System.out.println(fileLocationPathInProject);
				moveFileToRequiredLocation(DefaultLocationPath, fileLocationPathInProject);
				System.out.println("File Moved Successfully");
			} catch (Exception e) {
			}
			return fileLocationPathInProject;
		}
		public static String getNameOfDownLoadedExcelFile(String downloadFolderFilepath, String fileName) {
			String downloadedExcelName = "";
			try {
				File file = new File(downloadFolderFilepath);
				File[] files = file.listFiles();
				for (int i = 0; i < files.length; i++) {
					if (files[i].getName().startsWith(fileName)) {
						downloadedExcelName = files[i].getName();
						System.out.println(downloadedExcelName);
						break;
					}
				}
			} catch (Exception e) {
			}
			return downloadedExcelName;
		}
		public static boolean moveFileToRequiredLocation(String downLoadLocation, String projectLocation) throws IOException {
			boolean status = false;
			try {
				Thread.sleep(5000);
				Path temp = Files.move(Paths.get(downLoadLocation), Paths.get(projectLocation));
				Thread.sleep(5000);
				if (temp != null) {
					status = true;
				} else {
					status = false;
				}
			} catch (Exception e) {
			}
			return status;
		}

	
 
	}
 