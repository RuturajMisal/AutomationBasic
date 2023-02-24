package Automation2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAutomation1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcom\\OneDrive\\Desktop\\Cromre Driver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver	= new ChromeDriver();
        // webdriver is the interface used to perform action on the browsers.
        //Chrome driver is  class in the java.
        
        driver.get("https://www.facebook.com/");  // This method used to enter URL in the Browser.
		
	//	driver.close();  // This method used to close the running tab in the browser.
	//	driver.quit();   // This method used to close all the tabs running in the browser.
		
		// getCurrentUrl(); ==> This method is used to get url of the webpage as output.
        
//        String Url = driver.getCurrentUrl();
//        System.out.println(Url);
        
          
        // getTitle (); ==> This method is used to get title of the Webpage as an output. 
        
        String Title = driver.getTitle();
        System.out.println(Title);
        
//        String expectedtitle = Title;
//        String ActualTitle = "Facebook � log in or sign up";
        
//        if(expectedtitle.equalsIgnoreCase(ActualTitle)) {
//        	System.out.println("The Title is match");
//        }else {
//        	System.out.println("THE TITLE IS DOES NOT MATCH");
//        }
        
        // Maximize(); ==> This method is used to maximize the browser. 
 //       driver.manage().window().maximize();
        
        // Navigate(); ==> This method is used to enter the url in the browser as well as to move forward and backward or to refresh the browser.
        
//        driver.navigate().to("https://www.facebook.com/");
//        driver.navigate().to("https://www.hdfcbank.com/");
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();
        
        //SetSize (); ==> This method is used to change the size of the browser which takes dimensions as argument.
//        Dimension d = new Dimension(100,300);
 //       driver.manage().window().setSize(d);
        
        // setPosition(); ==> This method is used to change position of the browser which takes point as an arguments.
//         Point p = new Point(200,800);
//         driver.manage().window().setPosition(p);
//        
//        ====================================================LOCATORS================================================================================
        
        
      //1. id
      		//driver.findElement(By.id("id value from the  website"));
  //      driver.findElement(By.id("passContainer"));
        
      //2. name
      		//driver.findElement(By.name("the value for the name attribute"));
        
 //       driver.findElement(By.id("login"));
        
      //3. linked text. (links==> a)
      		//driver.findElement(By.linkText("full link text data"));
 //       driver.findElement(By.linkText("Forgotten password?"));
        
      //4. partial link text.  (links/images => a/img)       partial text of the link that should be unique.
//        driver.findElement(By.partialLinkText("https://static.xx.fbcdn.net/rsrc.php/y8/r/dF5SId3UHWd.svg"));
        
     // 5. classname.
     		//driver.findElement(By.className("the value for  the attribute  class from the  website"));
        driver.findElement(By.className("_9vtf"));
        
      //6.tagname (when find out multiple elements with a common tag or the unique element available on webpage)
		
      		//driver.findElement(By.tagName("tag name from the website"));
//        driver.findElement(By.tagName("_s0 _4ooo _1x2_ _1ve7 _1gax img"));
//        driver.findElements(By.tagName("img"));
        
      //===============================================X-PATH=============================================================================
        
        //absolute X-PATH
        
        driver.findElement(By.xpath("/html/head/meta[2]"));
        
        // relative X-Path
        driver.findElement(By.xpath("//*[@id=\"facebook\"]/head/meta[5]"));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
	}

}
