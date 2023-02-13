package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPractice {

	static WebDriver driver;

	public static void main(String[] args) {
		ActionClassPractice ACP = new ActionClassPractice();
		ACP.launchBrowser("chrome");
		ACP.launchApplication("Crocs", 30);
		WebElement shopByStyle = driver.findElement(By.xpath("//h3[text() = 'Shop by Style']"));
		ACP.scrollToAnElementUsingActions(shopByStyle);
	}

	public void test() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\git\\SaraswathyJavaProject\\drivers\\chromedriver_109.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.crocs.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement womenTab = driver
				.findElement(By.xpath("//span[text() = 'Women' and @class = 'menuLink-title-J7d']"));

		Actions actions = new Actions(driver);
//		actions.moveToElement(womenTab).build().perform();

//		actions.contextClick(womenTab).build().perform();

//		actions.contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

		actions.moveToElement(womenTab).contextClick().pause(5000).keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN)
				.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();

	}

	public void scrollToAnElementUsingActions(WebElement element) {
		Actions actions = new Actions(driver);
		actions.scrollToElement(element).build().perform();
	}

	public void launchBrowser(String browserName) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\git\\SaraswathyJavaProject\\drivers\\chromedriver_109.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void launchApplication(String appName, long implicitWaitSeconds) {
		switch (appName) {
		case "Crocs":
			driver.get("https://www.crocs.in/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWaitSeconds));
		}
	}

	public void clickAnElementUsingActions(WebElement ele) {
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).build().perform();
	}

	public void pressAKeyUsingActionsClass(String keyName) {
		Actions actions = new Actions(driver);
		switch (keyName) {
		case "a":
//			actions.keyDown(Keys.)
		}
	}

}
