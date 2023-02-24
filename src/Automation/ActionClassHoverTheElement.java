package Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassHoverTheElement {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcom\\OneDrive\\Desktop\\Cromre Driver\\chromedriver_win32 (108)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.next.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='onetrust-close-btn-container']/button")).click();
		List<WebElement> links = driver.findElements(By.xpath("//ul[@id='snail-trail-container']/li/a"));
		
		 for (int i =0; i<links.size();i++) {
			 WebElement link = links.get(i);
			 Actions action = new Actions(driver);
			 action.moveToElement(link);
			 action.build().perform();
			 System.out.println(link.getAttribute("data-department"));
			 Thread.sleep(1000);
			 
	}

}
}
