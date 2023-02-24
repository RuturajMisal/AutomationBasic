package Automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		// Way for the answering for the interview.
		
		// TO launch the browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcom\\OneDrive\\Desktop\\Cromre Driver\\chromedriver_win32 (108)\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				// Launch the URL.
			 driver.get("https://www.facebook.com/");
		     driver.manage().window().maximize();
		     
		     File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		     FileUtils.copyFile(src, new File("C:\\Users\\Welcom\\OneDrive\\Desktop\\Screenshot\\fbscreenshot.jpg"));
		
		
		
		
		
	}
	
}


