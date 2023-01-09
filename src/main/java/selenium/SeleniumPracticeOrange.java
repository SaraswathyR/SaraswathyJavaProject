package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumPracticeOrange {
	
	static WebDriver driver;

	public static void main(String[] args) {
		SeleniumPracticeOrange SP= new SeleniumPracticeOrange();
		SP.launchbrowser();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//h5[text()='Login']"));
		
		driver.findElement(By.name("username"));
		
		driver.findElement(By.name("password"));
		
		driver.findElement(By.xpath("//label[text()='Password']"));
		
		driver.findElement(By.xpath("//label[text()='Username']"));
		
		driver.findElement(By.name("username"));
		
		driver.findElement(By.name("password"));
		
		driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
		
		
		
		
		
		
		
		
		
		
	
		
		
		

	}
	
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\git\\SaraswathyJavaProject\\Drivers\\chromedriver.exe");
	    driver =new ChromeDriver();
	
	}

}
