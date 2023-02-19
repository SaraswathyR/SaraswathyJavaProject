package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class LoginUsingSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\git\\SaraswathyJavaProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Login")).click();
		
		WebElement email=driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("saraswathir881@gmail.com");
		
		
		WebElement pswd = driver.findElement(By.id("password"));
		pswd.clear();
		pswd.sendKeys("Mango285");
		
		driver.findElement(By.id("login-button")).click();
		
		String Title= "Log in";
		String ActualTitle= driver.getTitle();
		System.out.println("We are on login page");
		
		Assert.assertEquals(ActualTitle, Title);
	    System.out.println("Page title has been successfully verified");

	}

}
