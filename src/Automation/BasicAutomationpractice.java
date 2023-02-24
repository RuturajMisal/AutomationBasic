package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicAutomationpractice {

public static void main(String[] args) {
	
	// Browser launch.
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcom\\OneDrive\\Desktop\\Cromre Driver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new  ChromeDriver();
	driver.get("https://www.hdfcbank.com/");           //Finance Domain.
	driver.get("https://www.facebook.com");
	driver.get("https://www.flipkart.com/");           // E-commerce Domain.
	driver.get("https://www.zomato.com");              // Food Domain
	driver.get("https://www.jio.com/");                // Telecom Domain.
	driver.get("https://health.policybazaar.com/");   // Insurance Domain. 
	driver.get("https://www.gmail.com");
	driver.get("https://www.bookmyshow.com");
	driver.get("https://byjus.com/");                 //Educational Domain.
	
	                                                                     //  BFS (Banking & Financial Sector)                         
	                                                                     
	                                                                     //   Healthcare Software Domain.
	                                                                     //   e-Commerce Domain.
	                                                                     //   ERP Domain.
                                                                         // 	Mobile Application Testing Domain.
	                                                                     //   Insurance Sector Domain.
	                                                                     //   Retail, Travel & Hospitality sector.
	
	
}
}



