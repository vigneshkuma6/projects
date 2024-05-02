package chromeOptions;

import java.lang.StackWalker.Option;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SettingChromeOption {
	static HashMap<String, Object> prefs = new HashMap<String, Object>();
	static HashMap<String, Object> profile = new HashMap<String, Object>();
	static HashMap<String, Integer> content = new HashMap<String, Integer>();
	static ChromeOptions option = new ChromeOptions();
	static WebDriver driver;

	static void setChromeOption() {
		profile.put("managed_default_content_settings", content);
		prefs.put("profile", profile);
		option.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(option);
	}

	static void notificationsChromeoption() {
		content.put("notifications", 0);
		setChromeOption();
		driver.get("https://web-push-book.gauntface.com/demos/notification-examples/");
		driver.findElement(By.cssSelector(".c-toggle.js-example-toggle")).click();
	}

	static void WebCamAndMic() {
		content.put("media_stream", 2);
		setChromeOption();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://mictests.com/");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("mic-launcher"))));
		driver.findElement(By.id("mic-launcher")).click();
		driver.get("https://webcamtests.com/");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("webcam-launcher"))));
		driver.findElement(By.id("webcam-launcher")).click();
	}

	static void locationChromeOption() {
		content.put("geolocation", 0);
		setChromeOption();
		driver.get("https://whatmylocation.com/");
		// driver.get("https://www.flipkart.com/");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// notificationsChromeoption();
		WebCamAndMic();
		// locationChromeOption();
	}

}
