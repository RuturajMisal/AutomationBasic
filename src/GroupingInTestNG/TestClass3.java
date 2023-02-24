package GroupingInTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass3 {

	
	@BeforeTest(alwaysRun=true)
	public void OpenDB() {
		System.out.println("Before Test:- Open Data Base");
	}
	
	@AfterTest(alwaysRun=true)
	public void CloseDB() {
		System.out.println("After Test:- Close Data Base");
	}
	
	
	@BeforeClass(alwaysRun=true)
	public void LaunchBrowser() {
		System.out.println("Browser Launched");
	}
	
	
	@AfterClass(alwaysRun=true)
	public void CloseBrowser() {
		System.out.println("Browser Closed");
	}
	
	@Test(groups="Smoke")
	public void Test7() {
		System.out.println("Test7");
	}
	
	
	@Test(groups="Functional")
	public void Test8() {
		System.out.println("Test8");
	}
	
	@Test(groups= {"Functional","Regression"})
	public void Test9() {
		System.out.println("Test9");
	}
}
