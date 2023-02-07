package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\git\\SaraswathyJavaProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		System.out.println(((RemoteWebDriver)driver).getSessionId());
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.name("submit")).click();
		
		try {
			driver.findElement(By.name("cusid")).clear();
			driver.switchTo().alert().accept();
			
		}
		catch(UnhandledAlertException e){
			System.out.println(e.getMessage());
			
		}
		

	}

}
