package Automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newd {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcom\\OneDrive\\Desktop\\Cromre Driver\\chromedriver_win32\\chromedriver.exe");
	
	  WebDriver    driver  = new ChromeDriver();
	  driver.get("https://www.icicibank.com/");
	//  driver.manage().window().maximize();
	  
	  Dimension d = new Dimension(400, 400);
	 driver.manage().window().setSize(d);
	  
	
	
	
	}	

}
