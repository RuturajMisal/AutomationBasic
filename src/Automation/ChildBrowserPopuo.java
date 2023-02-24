package Automation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.utils.Sets;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopuo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcom\\OneDrive\\Desktop\\Cromre Driver\\chromedriver_win32 (108)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Set<String>winds;
		Iterator<String>iterate;
		// for the first window.
		winds=driver.getWindowHandles();
		 iterate = winds.iterator();
		
//		 String firstwindow = iterate.next();    // First Window.
//		 System.out.println(firstwindow);
//		 driver.findElement(By.xpath("//a[text()='Meta Pay']")).click();
//		 
//		 // for second window .
//		 winds=driver.getWindowHandles();
//		 iterate =winds.iterator();
//		 iterate.next(); // first window
//		 
//		 String SecondWindow = iterate.next(); // 2 nd window
//		 System.out.println(SecondWindow);
//		 driver.switchTo().window(SecondWindow);
		 driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click();
		 
		 // for the Third window.
		 winds = driver.getWindowHandles();
		 iterate =winds.iterator();
		 iterate.next();  // 1 st window
		 iterate.next();  // 2nd window
		 
		 String thirdwindow = iterate.next();
		 System.out.println(iterate.next());
		 System.out.println(thirdwindow);
		 driver.switchTo().window(thirdwindow);
		 driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		 
		 
	//	 System.out.println(driver.getCurrentUrl());
		 // switch to  1 wimdow
	//	 driver.switchTo().window(firstwindow);
		
		 
		 
		 
		
				
				
		
  		
	}

}
