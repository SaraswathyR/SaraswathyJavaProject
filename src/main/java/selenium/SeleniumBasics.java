package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\git\\SaraswathyJavaProject\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_3c01r1321r_e&"
				+ "adgrpid=60612964962&hvpone=&hvptwo=&hvadid=486380734071&hvpos=&hvnetw=g&hvrand=11926727330304515897"
				+ "&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061898&hvtargid=kwd"
				+ "-32679660&hydadcr=14454_2154375&gclid=CjwKCAiA8OmdBhAgEiwAShr401kpvcerTLGgDsCEe_pRiDzFt4FwUFKf23JlabK"
				+ "_Njs_S-otlkCZmhoCzRIQAvD_BwE");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getCurrentUrl());
		
		String title=driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getPageSource());
		
		String ParentWindowHandle= driver.getWindowHandle();
		System.out.println(ParentWindowHandle);
		
		Set<String> AllWindowHandle= driver.getWindowHandles();
		System.out.println(AllWindowHandle);
		
		driver.close();
	}

}
