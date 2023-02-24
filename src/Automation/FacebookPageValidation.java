package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import com.sun.org.apache.xml.internal.utils.AttList;

public class FacebookPageValidation {
	public static void main(String[] args) throws InterruptedException {
		
		// TO launch the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcom\\OneDrive\\Desktop\\Cromre Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// Launch the URL.
		driver.get("https://www.facebook.com/reg/");
		// Validate the URL.
		System.out.println(driver.getCurrentUrl());
		 String ActualURL =driver.getCurrentUrl();
		 String ExpectedURL = "https://www.facebook.com/reg/";
		 
		 if(ActualURL.equalsIgnoreCase(ExpectedURL)) {
			 System.out.println("Link Validate Succesfully");
		 }else {
			 System.out.println("Link is not Validate Succesfully");
		 }
		 
		 // Window functions.
		 driver.manage().window().maximize();
		 
		 // Facebook Logo verification.
		 //isDisplayed()- This method is used to check weather an element is displayed on WebPage or not. It will return boolean value.
		WebElement fblogo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		 System.out.println(fblogo.isDisplayed());
		 
		 if(fblogo.isDisplayed()==true) {
			 System.out.println("Facebook Logo Is Displayed");
		 }else {
			 System.out.println("Facebook Logo Is  Not Displayed");
		 }
		 Thread.sleep(2000);
		
		 //TagName verification.
		WebElement text= driver.findElement(By.xpath("//div[text()='Create a new account']"));
		 
		 System.out.println(text.isDisplayed());
		 
		 if(text.isDisplayed()==true) {
			 System.out.println("Text field is dispayed");
		 }else {
			 System.out.println("Text field is not dispayed");
		 }
		 System.out.println("========================================================================================");
		 
		 // Enter first name.
		WebElement firstname= driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		 firstname.sendKeys("Ruturaj");
		 
		 System.out.println("===================================================================================");
		 //Enter Surname.
		WebElement lastname= driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
		lastname.sendKeys("Misal");
		System.out.println("=================================================================================");
		
		//Enter EmailId.
		WebElement Email =driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
		Email.sendKeys("ruturajmisal12345@gmail.com");
		System.out.println("===========================================================================================");
		
		//re enter mail
		WebElement reentermail=driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']"));
		reentermail.sendKeys("ruturajmisal12345@gmail.com");
		System.out.println("==============================================================================");
		
		//Enter Passward.
		 WebElement Passward =driver.findElement(By.xpath("//input[@id=\"password_step_input\"]"));
		 Passward.sendKeys("Rutu12345");
		 System.out.println("==============================================================================================");
	    
		 //  Adding values in Day Field.
	 
		 WebElement selectday=driver.findElement(By.xpath("//select[@title=\"Day\"]"));
		 
	    //Create the object of the class and perform further ACTION.
		  Select d= new Select(selectday);
		  d.selectByValue("19");    // Select the option by Value.
		  
		 //All the element present in the perticular list box.
		  List<WebElement> dates = d.getOptions();
		  System.out.println("Toatl days present in the list ==>"+ dates.size());
		  
		  for(int i=0;i<dates.size();i++) {
			  String Date = dates.get(i).getText();
			  System.out.println(Date);
		  }
		  
		  System.out.println("===================================================================================================");
		  Thread.sleep(1500);
		 // Adding values in month Field.
		  
		  WebElement month= driver.findElement(By.xpath("//select[@aria-label=\"Month\"]"));
		  Select m =new Select(month);
		  m.selectByVisibleText("May");       // Select the option by Value.
		  
		  //All the element present in the perticular list box.
		  List<WebElement> Months = m.getOptions();
		  System.out.println("Total Months in the list==> " + Months.size());
		  
		  for(int i = 0; i< Months.size();i++) {
			  String months = Months.get(i).getText();
			  System.out.println(months);		  
		  }
		  System.out.println("===============================================================================================================");
		  Thread.sleep(1500);
		  // Adding values in Year Field.
		 WebElement Year= driver.findElement(By.xpath("//select[@aria-label=\"Year\"]"));
		 Select Y =new Select(Year);
		 Y.selectByValue("1997");               // Select the option by Value.
		 
		  //All the element present in the perticular list box.
		  List<WebElement> Years = Y.getOptions();
		  System.out.println("Total Months in the list==> " + Years.size());
		  
		  for(int i=0;i< Years.size();i++) {
			  String years=Years.get(i).getText();
			  System.out.println(years);
		  }
		  
		     System.out.println("=================================================================================================================");
		  Thread.sleep(1500);
		  // Select Gender    (Radio Button).
		     
		   WebElement Maleoption =  driver.findElement(By.xpath("//input[@value=\"2\"]"));
		   Maleoption.click();
		   
		   if(Maleoption.isSelected()==true) {
			   System.out.println("Male Gender option is Selected");
		   }else {
			   System.out.println("Please select the gender option");
		   }
		   
		   System.out.println("=================================================================================================================");
		   Thread.sleep(1500);
		   //Click on signUp Button.
		   
		   WebElement SignUp= driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
		    if(SignUp.isEnabled()==true) {
		    	SignUp.click();
		    	System.out.println("SignUp ");
		    }else {
		    	System.out.println("Account  is not Signup");
		    }
		   
		  
		  
		  
		  List<WebElement>footerlinks =driver.findElements(By.xpath("//div[@id=\"pageFooterChildren\"]"));
		  System.out.println(footerlinks.size());
		  
		  for(int i =0;i<footerlinks.size();i++) {
			   WebElement IndividualFooterlink = footerlinks.get(i);
			   String linkname =IndividualFooterlink.getText();
			  // System.out.println(i + " =="+ linkname);
			   String links = IndividualFooterlink.getAttribute("href");
			   System.out.println(i+" ==>"+linkname +"==>"+ links);
			   
		  }
		  
		  
		 
		 
	}
}

		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


