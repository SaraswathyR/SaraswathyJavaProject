package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPractice {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				".\\src\\test\\resources\\drivers\\chromedriver_114.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		JavascriptExecutor je = (JavascriptExecutor) driver;
//		je.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//h1[contains(text(), 'HTML Dropdowns')]")));
		
		driver.findElement(By.id("iFrame")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("s")).sendKeys("Hello");
//		driver.findElement(By.name("s")).click();;
//		driver.findElement(By.name("s")).sendKeys("Hello");
//		driver.switchTo().frame("globalSqa");
//		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.name("globalSqa")));
		driver.findElement(By.name("s")).click();;
		driver.findElement(By.name("s")).sendKeys("Hello");
////		System.out.println(driver.findElement(By.xpath("//div[text() = '+91-9910979218' and @class = 'header_phone']")).getText());
		driver.switchTo().defaultContent();
		driver.findElement(By.id("Open New Window")).click();
	}

}
