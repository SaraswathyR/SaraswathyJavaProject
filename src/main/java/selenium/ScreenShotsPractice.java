package selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShotsPractice {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\git\\SaraswathyJavaProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakesScreenshot screenshot= ((TakesScreenshot)driver);
		File outputimage=screenshot.getScreenshotAs(OutputType.FILE);
		
		File file= new File("C:/Users/ADMIN/Desktop/Screenshot1");
		FileUtils.copyFile(outputimage, file);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}

