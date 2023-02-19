package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\git\\SaraswathyJavaProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
	
		
			
		String ParentWindowHandle= driver.getWindowHandle();
		System.out.println(ParentWindowHandle);
		
		Set<String> AllWindowHandle= driver.getWindowHandles();
		System.out.println(AllWindowHandle);
		
		driver.close();
	}

}
