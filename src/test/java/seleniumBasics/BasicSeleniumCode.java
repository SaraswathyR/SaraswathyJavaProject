package seleniumBasics;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class BasicSeleniumCode {

	public static void main(String[] args) throws Exception {
		
		
	}
	
	public void test123() {
		
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\SaraswathyJavaProject\\drivers\\chromedriver_109.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println(((RemoteWebDriver)driver).getSessionId());
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String loginText = driver.findElement(By.xpath("//h5[text() = 'Login']")).getText();
		
		if(loginText.equals("Login")) {
			System.out.println("We are on login page");
		}
		
		Assert.assertEquals(loginText, "Login");
		
		System.out.println("Testing is continuing");
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		WebElement login_Text = driver.findElement(By.xpath("//h5[text() = 'Login']"));
		
		Assert.assertTrue(login_Text.isDisplayed());
		
		Thread.sleep(5000);
		
//		driver.close();
		driver.quit();
	}
	
	
	
	
	public void testMethod1() {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\SaraswathyJavaProject\\drivers\\chromedriver_107.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(driver.getCurrentUrl());
		
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getPageSource());
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println(parentWindowHandle);
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles);
		
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		
		boolean elementIsDisplayed = driver.findElement(By.xpath("//h5[text() = 'Elements']")).isDisplayed();
		System.out.println(elementIsDisplayed);
		
		driver.close();
		
	
	}
	public void testMethod() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\VinothiniJavaProject\\drivers\\chromedriver_107.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		FirefoxDriver driver1 = new FirefoxDriver();
//		driver = new FirefoxDriver();
		driver.get("https://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(driver.getTitle());
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		System.out.println(driver.getWindowHandle());
//		CDwindow-5F1CA225F06ACB8FC7F1BF3149B579F1
		
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		
		boolean elementIsDisplayed = driver.findElement(By.xpath("//h5[text() = 'Elements']")).isDisplayed();
		System.out.println(elementIsDisplayed);
		
		WebElement element1 = driver.findElement(By.xpath("//h5[text() = 'Elements']"));
//		element1.
		
//		driver.findElement(By.xpath("//h5[text() = 'Elements']")).click();
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//h5[text() = 'Elements']")));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//h5[text() = 'Elements']")).click();
		
		driver.close();
		
		
		
	
	}

}
