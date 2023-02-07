package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\git\\SaraswathyJavaProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.crocs.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement womentab= driver.findElement(By.xpath("//span[text()='Women' and @class='menuLink-title-J7d']"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(womentab).contextClick().pause(5000).
		keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).
		keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		
		
		

	}

}
