package GroupingInTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {
	
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
	public void Test4() {
		System.out.println("Test4");
	}
	
	
	@Test(groups="Functional")
	public void Test5() {
		System.out.println("Test5");
	}
	
	@Test(groups= {"Functional","Regression"})
	public void Test6() {
		System.out.println("Test6");
	}

}
