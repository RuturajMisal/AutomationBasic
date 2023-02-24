package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcom\\OneDrive\\Desktop\\Cromre Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com/");
		// 1. Regular locator.
		// ID ==>
		//driver.findElement(By. id ("copy the unique id from the website");
		driver.findElements(By.id("password_step_input"));
		//2. Name.
		// driver.findelement(By.name("copy the unique name id from the website"));
		//driver.findElement(By.name("lgnjs"));
		// 3. classname
	    // driver.findelement(By.classname("pass the unique classname from the website"));
	  // driver.findElement(By.className("inputtext _55r1 inputtext _9npi inputtext _9npi"));
				
	   // 4. tagname
	   // driver.findelement(By.tagname("unique tagname from the website"));
		//driver.findElement(By.tagName("firstname"));
		
		//5. LinkText.
		//driver.findelement(By.linktext("link text copies from the websites"));
	// driver.findElement(By.linkText("/help/637205020878504"));
		// 6. Partial LinkText
				// driver.findelement(By.partiallinktext(" portion of the Link text copied from the website"));
			//	driver.findElement(By.partialLinkText("password?"));
			//  Regular Xpath :- 1. absolute xpath      2. relative xpath
				// 1. Basic Xpath :- 
				
				   // tagname[@attribute='value']
					driver.findElement(By.xpath("//input[@id='email']"));
					// 2. xpath by text function
					//tagname[text()='value']
					driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
				
				    // 3 .xpath by contains()
					//tagname[contains(@attribute,'value')]
					driver.findElement(By.xpath("//label[contains(@for,'u_0_4')]"));
					driver.findElement(By.xpath("//a[contains(@data-label,' Loose Fit Super Soft Jogger ')]"));
				 
					// 4. xpath by starts-with
				    //tagname[starts-with(@attribute,'value')]
				    driver.findElement(By.xpath("//label[starts-with(@for,'u_0_4')]"));
					
				    // 5. Logical operators [and ==> both conditions are true or ==> if any one of two is true]
				    
				    // tagname[@attribute1='value' and @attribute='value']
				    driver.findElement(By.xpath("//input[@id='email' and @aria-label='Email address or phone number']"));
				    
				   // tagname[@attribute1='value' or @attribute='value']
				    driver.findElement(By.xpath("//input[@value='1' or @id='u_0_4_oL']"));
					

}}