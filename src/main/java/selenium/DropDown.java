package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\git\\SaraswathyJavaProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement CourseDropdown=driver.findElement(By.id("course"));
		CourseDropdown.click();
		
		driver.findElement(By.xpath("//option[text()='Javascript']")).click();
		
		Select select= new Select(CourseDropdown);
		System.out.println(select);
		
		System.out.println(select.isMultiple());
		
		select.selectByIndex(3);
		Thread.sleep(5000);
		
		select.selectByValue("net");
		Thread.sleep(5000);
		
		select.selectByVisibleText("Java");
		Thread.sleep(5000);
		
		
		
		
		
	}

}
