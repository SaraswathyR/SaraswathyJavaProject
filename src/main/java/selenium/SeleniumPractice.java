package selenium;

import java.time.Duration;
import java.util.Set;
 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class SeleniumPractice {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\git\\SaraswathyJavaProject\\Drivers\\chromedriver.exe");
		SeleniumPractice SePa = new SeleniumPractice();
		SePa.launchChromeBrowser();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		String ParentWindowHandle=driver.getWindowHandle();
		System.out.println(ParentWindowHandle);
		Set<String> AllWindowHandles=driver.getWindowHandles();
		System.out.println(AllWindowHandles);
		
	}		
		
		
		                                                                                                                                                                                                                                                                                 
public void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\git\\SaraswathyJavaProject\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		
	}
	public void launchFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\git\\SaraswathyJavaProject\\Drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
		
	}
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void getCurrentUrl() {
		String currentUrl= driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public void getTitle() {
		String title= driver.getTitle();
		System.out.println(title);
	}
	
	
	
	

}
