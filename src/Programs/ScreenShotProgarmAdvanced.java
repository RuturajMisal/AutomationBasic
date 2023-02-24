package Programs;

import java.io.File;
import java.io.IOException;
import java.util.Date;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotProgarmAdvanced {
	public static WebDriver driver;

	
	public static void screenshot() throws IOException {
		
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   // Method for Screenshot
	Date d = new Date();        // To display the date
	System.out.println(d);

	String filename ="FBloginpage_"+d.toString().replace(" ","_").replace(":", "_")+ ".jpg"; // Removing space and symbol from the date.
	System.out.println(filename);
	
	File  dest  = new File("C:\\Users\\Welcom\\OneDrive\\Desktop\\Screenshot\\"+ filename);   // Giving Destination.
	
	FileUtils.copyFile(src, dest);
	 
	}	
	// Calling MAin Method.
	
	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcom\\OneDrive\\Desktop\\Cromre Driver\\chromedriver_win32 (108)\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");    // Hit the URL
    driver.manage().window().maximize();        // Maximize the Window
    
    ScreenShotProgarmAdvanced.screenshot();     // calling the method.
		
   WebElement signUp=driver.findElement(By.xpath("//a[@href=\"/reg/\"]"));
   signUp.click();
   screenshot();
   
		
	}
	
}	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	


