package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Facebookexample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\git\\SaraswathyJavaProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getClass());
		System.out.println(driver.getWindowHandles());
		
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("saraswathi544@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("saras1234");
		driver.findElement(By.name("login")).click();
		driver.close();
		
		
		
		

	}

}
