package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation3 {
	public static void main(String[] args) {
		// browser launch.
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcom\\OneDrive\\Desktop\\Cromre Driver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
	          
	          WebElement username= driver.findElement(By.xpath("//input[@id=\"email\"]"));
	           username.sendKeys("fshbmncb ");
				
				
				
				
				  
				
}
}