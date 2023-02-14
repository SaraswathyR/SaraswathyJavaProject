package seleniumBasics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class ScreenShotsInSelenium {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\git\\SaraswathyJavaProject\\drivers\\chromedriver_109.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/uploadAFile.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		TakesScreenshot screenShot = ((TakesScreenshot)driver);
		File screenshotImage = screenShot.getScreenshotAs(OutputType.FILE);
		
		File file = new File("C:/Users/LENOVO/Desktop/Screenshot");
		FileUtils.copyFile(screenshotImage, file);
		
	}

}
