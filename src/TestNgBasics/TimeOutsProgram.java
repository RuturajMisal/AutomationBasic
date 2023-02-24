package TestNgBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeOutsProgram {
	
	
	  @BeforeMethod
	    public void login() {
		System.out.println("Login the function");
	}
	  @AfterMethod
	   public void logout() {
	System.out.println("Login the function");
	}

	  @BeforeClass
		public void LaunchBrowser() {
			System.out.println("Browser Launched");
		}
		
		@AfterClass
		public void CloseBrowser() {
			System.out.println("Browser closed");
		}
		
		@Test(priority =2, invocationCount=5 , timeOut =5000)
		public void HomePage() throws InterruptedException {
			System.out.println("HomePage");
			Thread.sleep(6000);
		}
		
		@Test (priority=1 )
		public void Profilepage()  {
			System.out.println("ProfilePage");
		}
		
		@Test (priority=3 )
		public void Signuppage()  {
			System.out.println("Signuppage");
		}


}
