package Programs;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.collections4.FactoryUtils;
import org.apache.commons.io.FileUtils;
import org.bouncycastle.util.test.FixedSecureRandom.Data;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotProgarm {

	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Welcom\\\\OneDrive\\\\Desktop\\\\Cromre Driver\\\\chromedriver_win32 (108)\\\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
    	driver.manage().window().maximize();
    	
    	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

    	Date d = new Date();
    	System.out.println(d);

    	
    	String filename ="FBloginpage_"+d.toString().replace(" ","_").replace(":", "_")+ ".jpg";
    	System.out.println(filename);
 
	    File  dest  = new File("C:\\\\Users\\\\Welcom\\\\OneDrive\\\\Desktop\\\\Screenshot\\"+ filename);
	
	 FileUtils.copyFile(src, dest);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
