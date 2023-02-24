package TestNgBasics;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass2 {
	
	private static final String Invocation = null;

	@BeforeClass
	public void login(){
		System.out.println("******* Login *******");
		
	}
	
	@AfterClass
	public void logout(){
		System.out.println("******* Logout *******");
	}
	
	@Test (priority=1)
	public void HomeElement(){
		System.out.println("Checking the HomePage Url");
		
	}
	
	@Test(invocationCount=1)
	public void ProfileCheck() {
		System.out.println("Checking the ProfilePage Url");
		
	}
	
	@Test(priority=3)
	public void NotificationCheck() {
		System.out.println("Checking the NotificationPage Url");
		
	}

}
