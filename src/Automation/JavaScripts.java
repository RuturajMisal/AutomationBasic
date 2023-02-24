package Automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jdk.javadoc.internal.doclets.toolkit.util.JavaScriptScanner;

public class JavaScripts {
	
	public static void main(String[] args)  {
		// Browser  setup.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcom\\OneDrive\\Desktop\\Cromre Driver\\chromedriver_win32 (108)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
	    WebElement   TryitButton =driver.findElement(By.xpath("//button[text() ='Try it']"));
	    JavascriptExecutor js = (( JavascriptExecutor)driver);
	    js.executeScript("arguments[0].style.border='3px solid red'", TryitButton);
	    Object TryitBtn;
	  
	    
		
		
	
	}
}
