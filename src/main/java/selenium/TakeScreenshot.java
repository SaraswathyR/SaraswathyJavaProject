package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\git\\SaraswathyJavaProject\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakeScreenshot screenshot= ((TakeScreenshot)driver);
		File Image= screenshot.getScreenshotAs(OutputType.FILE);
		
		File file= new File("C:/Test.png");
		FileUtils.copyFile(Image, file);
		

	}

	
}
