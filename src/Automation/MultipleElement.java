package Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultipleElement {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcom\\OneDrive\\Desktop\\Cromre Driver\\chromedriver_win32 (108)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.facebook.com/");
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Implicit wait
		
		List<WebElement> footerlinks = driver.findElements(By.xpath("//ul[contains(@class,'uiList pageFooterLinkList')]/li/a"));
	     System.out.println(footerlinks.size());
	     
	     for(int i=0; i<footerlinks.size();i++) {
	    	 String footerlink =footerlinks.get(i).getAttribute("href");
	    	 System.out.println(i+" "+footerlink);
	     }
	     
	     
	    driver.quit();
		
		
	}
	

}
