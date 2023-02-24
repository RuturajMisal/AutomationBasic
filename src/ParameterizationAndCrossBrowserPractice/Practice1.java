package ParameterizationAndCrossBrowserPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice1 {
	
	WebDriver driver;
	
	@Test(priority = 1)
	public void CrossBrowserTesting(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcom\\OneDrive\\Desktop\\Cromre Driver\\chromedriver_win32 (108)\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty(  "webdriver.gecko.driver", "C:\\Users\\Welcom\\OneDrive\\Desktop\\Cromre Driver\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else {
			System.out.println("User has entered the wrong browser name");
		}
			
		driver.get("https://www.facebook.com/reg/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
    }
	
	@Test (priority=2)
	public void VerifyCurrentUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/reg/");
	}
	
	@Test (priority=3)
	public void VerifyPageTitle() {
		Assert.assertEquals(driver.getTitle(), "Sign up for Facebook | Facebook");
	}
	
	@Test(priority=4)
	public void FirstName() {
	WebElement firstNmame = driver.findElement(By.xpath("//input[@name='firstname']"));
	Assert.assertTrue(firstNmame.isDisplayed());
	firstNmame.sendKeys("Ruturaj");
	}
	
	@Test (priority=5)
	public void  VerifyLastName() {
	WebElement lastName	= driver.findElement(By.xpath("//input[@name='lastname']"));
	Assert.assertTrue(lastName.isDisplayed());
	lastName.sendKeys("Misal");
	}
	
	@Test (priority=6)
	public void EmailMobNoField() {
	WebElement mobileNoField = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	Assert.assertTrue(mobileNoField.isDisplayed());
	mobileNoField.sendKeys("9623327700");
	}
	
	@Test (priority=7)
	public void NewPassword() {
	WebElement password =driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	Assert.assertTrue(password.isDisplayed());
	password.sendKeys("Ruturaj@123");
	}
	
	@Test (priority=8) 
	public void SeletBirthdateField() {
   WebElement birthDate = driver.findElement(By.xpath("//select[@name='birthday_day']"));
    Assert.assertTrue(birthDate.isDisplayed());
    Select s = new Select(birthDate);
    s.selectByValue("6");
	}
	
	@Test (priority=9) 
	public void SeletBirthMonthField()  {
   WebElement birthMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
    Assert.assertTrue(birthMonth.isDisplayed());
    Select s = new Select(birthMonth);
    s.selectByValue("May");
	}
	
	@Test (priority=10) 
	public void SeletBirthYearField() {
   WebElement birthYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
    Assert.assertTrue(birthYear.isDisplayed());
    Select s = new Select(birthYear);
    s.selectByValue("2000");
	}
	
	@Test(priority=11)
	public void SelectGenderRadioButton() {
	WebElement maleBtn=	driver.findElement(By.xpath("//label[text()='Male']"));
	Assert.assertTrue(maleBtn.isDisplayed());
	maleBtn.click();
	}
	
	@Test(priority=12)
	public void ClickSignupBtn() {
	WebElement signupBtn =driver.findElement(By.xpath("//button[@name='websubmit']"));
	Assert.assertTrue(signupBtn.isEnabled());
	signupBtn.click();
	}
	
	
	@Test (priority=13)
	public void Main()  {
		Practice1 p = new Practice1();
		p.CrossBrowserTesting("chrome");
		p.VerifyCurrentUrl();
		p.VerifyPageTitle();
		p.FirstName();
		p.VerifyLastName();
		p.EmailMobNoField();
		p.NewPassword();
		p.SeletBirthdateField();
		p.SeletBirthMonthField();
		p.SeletBirthYearField();
		p.SelectGenderRadioButton();
		p.ClickSignupBtn();
	}
	
}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	