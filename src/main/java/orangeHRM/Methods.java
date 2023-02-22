package orangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	
	static WebDriver driver;
	
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\git\\SaraswathyJavaProject\\Drivers\\chromedriver.exe");
	    driver =new ChromeDriver();
	
	}
	
	public void maximizeBrowserWindow() {
		driver.manage().window().maximize();
	}
	
	public void launchApplication(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void loginOrangeHRM(String userName, String password) {
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}
	

	public void adminTab() {
		driver.findElement(By.partialLinkText("/web/index.php/admin/viewAdminModule"));
	}

	public static void main(String[] args) {
		Methods Meth = new Methods();
		Meth.launchbrowser();
		Meth.maximizeBrowserWindow();
		Meth.launchApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Meth.adminTab();
	}
}
