package Programs;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParameterizationExcelProgram {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	// Browser launch.
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcom\\OneDrive\\Desktop\\Cromre Driver\\chromedriver_win32 (108)\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	
	//Hit the URL.
	driver.get("https://www.facebook.com/reg/");
	//maximize the window.
	driver.manage().window().maximize();
	
	//Parameterization Process.
	
	FileInputStream  file1 = new FileInputStream ("C:\\Users\\Welcom\\OneDrive\\Desktop\\Excel input data file.xlsx");
	 String value1 = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	      System.out.println(value1);
	
	   WebElement firstname = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
	   firstname.sendKeys(value1);
	
	   
	   // Lastname Add by Using Parameterization
		 
		 FileInputStream file2 =new
		FileInputStream("C:\\Users\\Welcom\\OneDrive\\Desktop\\Excel input data file.xlsx");
		 String
		value2=WorkbookFactory.create(file2).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		 
    System.out.println(value2);
   WebElement lastname = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
   lastname.sendKeys(value2);
   
   
   // Mobile number Add by Using Parameterization
	 
		 FileInputStream file3 =new
		FileInputStream("C:\\Users\\Welcom\\OneDrive\\Desktop\\Excel input data file.xlsx");
		 String
		value3=WorkbookFactory.create(file3).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		 
      System.out.println(value3);
     WebElement mobNo = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
     mobNo.sendKeys(value3);
   
     
  // Mobile number Add by Using Parameterization
	 
		 FileInputStream file4 =new
		FileInputStream("C:\\Users\\Welcom\\OneDrive\\Desktop\\Excel input data file.xlsx");
		 String
		value4=WorkbookFactory.create(file4).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		 
    System.out.println(value4);
   WebElement passward = driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]"));
   passward.sendKeys(value4);
	
	
}
}
