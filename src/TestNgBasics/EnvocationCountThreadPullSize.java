package TestNgBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnvocationCountThreadPullSize {
	
	
	@Test (invocationCount = 5, threadPoolSize =5)
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcom\\OneDrive\\Desktop\\Cromre Driver\\chromedriver_win32 (108)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();   
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
	}

}
