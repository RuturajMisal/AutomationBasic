package Automation2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationCUstomizeXpath {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcom\\OneDrive\\Desktop\\Cromre Driver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver ();	
	driver.get("https://www.facebook.com/");

	// customized X-paths.==>
	// 1. basic X-path.
	// 2. text()
	// 3. contains()
	// 4. starts-with
	// 5. logical operators.
	
	// 1.basic xpath.
	//tagname[@ attribute='value']
//	driver.findElement(By.xpath("//div[@id='otp_retrieve_desc_container']"));
//	driver.findElement(By.xpath("//input[@class=\'_56bg _4u9z _27z2 _8qtm\']"));
	
	// 2. text() :- this will allow you to locate the element based on inner text.
			//tagname[text()='value']
//	driver.findElement(By.xpath("//span[text()='SHOW']"));
	
	// 3. contains()
			//tagname[contains(@ attribute,'value')]   ==> the value should not be full. shot form / part of attribute value.
	
//	driver.findElement(By.xpath("//a[contains(@data-sigil, 'password-plain-text-toggle')]"));
	
	// 4. starts-with()   ==> if your attribute value is too long then you can take starting string.(first part)
			//tagname[starts-with(@ attribute,'value')]
	
//	 driver.findElement(By.xpath("//div[starts-with(@data-sigil,'context-layer')]"));
	 
	// 5. logical operators.  ==> 1. and 2. or
			// 1. and=> if both are true
			// if both the attributes for the element are present then you can use and operator
			//tagname[@attribute1='value1' and @attribute2= 'value2']
//			driver.findElement(By.xpath("//input[@type='email' and @name='email']"));
			
			// 2. or ==> any one is true
					// if atleast one attribute out of two is present.
					//tagname[@attribute1='value1' or @attribute2= 'value2']
//					driver.findElement(By.xpath("//input[@id='email' or @name='email']"));
					
//================================================CSS SELECTOR======================================================================================
					
					// Element Location by CSS Selectors.==>
	                 //1. tag and id
	                 //2. tag and  class
	                 //3. tag and attribute
	                 //4. tag class and attribute
					
					//1. tag and id
					//css=> tag#id
					
//					driver.findElement(By.cssSelector("input#email")).sendKeys("9730659700");
					
					//2. tag and  class
					// css=> tag.class
//					driver.findElement(By.cssSelector("input.inputtext _55r1 inputtext _1kbt _9ay4 inputtext _1kbt")).click();
					
					//3. tag and atrribute
					//css=> tagname[attribute=value]
					
//					driver.findElement(By.cssSelector("input[name='pass']"));
					
					//4. tag class and attribute
					// css==> tag.class[attribute='value']
					
//					driver.findElement(By.cssSelector("div._xku[id=\"header_block\"]"));

//======================================================================================================================================================
					

//					// 1. sendkeys():- you can send the data to the text fields.
//					
//					WebElement Emailid = driver.findElement(By.xpath("// input[@name='email']"));
//					Emailid.sendKeys("paresh@gmail.com");
//					
//					WebElement Password = driver.findElement(By.xpath("// input[@name='pass']"));
//					Password.sendKeys("Paresh@65789");
//					
//					//2. click():-  will click on any type of button.  (regular/radio button/ check box)
//					
//					WebElement CreateNewAccBtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
//					CreateNewAccBtn.click();
//					
//					// 3. is enabled():-  this will check if your element is availble to intract.
//					
//					WebElement Emailid1 = driver.findElement(By.xpath("// input[@name='email']"));
//				//	System.out.println(Emailid1.isEnabled());  // boolean value. // true //false.
//				
//					if(Emailid1.isEnabled()==true) {
//						Emailid1.sendKeys("paresh@gmail.com");
//					}else {
//						System.out.println("The element is not intractable");
//					}
					
				 //  4. is dispayed.
					
//					WebElement Emailid2 = driver.findElement(By.xpath("// input[@name='email']"));
//				System.out.println("Email id status "+ Emailid2.isDisplayed());
		
				
			//  5. is selected.
				
//				WebElement CreateNewAccBtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
//				CreateNewAccBtn.click();
			
//				WebElement FemaleOptbtn = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
//				System.out.println("Female option status "+ FemaleOptbtn.isSelected());  // false 
//				//FemaleOptbtn.click();
				//System.out.println("Female option status "+ FemaleOptbtn.isSelected());   // true
					
					
					
					
				// get text() :- to get the text of any element. (for single)
//				
//				 String actualtext = driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).getText();
//				 String expectedtext="Sign Up";
//				 
//				 if(actualtext.equals(expectedtext)) {
//					 System.out.println("Test Case pass for sign up text verification");
//				 }else {
//					 System.out.println("Test Case fail for sign up text verification");
//				 }
					
				// get attribute.
					
//					String attributeid = driver.findElement(By.xpath("//input[@name='email']")).getAttribute("id");
//					System.out.println(attributeid);
						
					// multiple elements.
					
					List<WebElement> footerlinks = driver.findElements(By.xpath("//ul[contains(@class,'uiList pageFooterLinkList')]/li/a"));
					System.out.println(footerlinks.size());
					
					for (int i=0; i<footerlinks.size();i++) {
						String footerlink = footerlinks.get(i).getAttribute("href");
						System.out.println(i+" "+footerlink);
					}
					
					
					
					
					
					
					
			
					
					
					
					
					
					
					
					
					
					
					


					
	
					
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
