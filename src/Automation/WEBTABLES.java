package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WEBTABLES {
	public static void main(String[] args) {
		
		// Browser lounch
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcom\\OneDrive\\Desktop\\Cromre Driver\\chromedriver_win32 (108)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		int rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		System.out.println(rows);
		
		int cols=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
		System.out.println(cols);
		
		        // rows==> external loop   //tr
				// cols==> internal loop   //td & headings = th
		 
		for(int i =1;i<=rows;i++) {
			for(int j=1;j<=cols;j++) {
				String value = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print("==>"+ value);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	} 

}
