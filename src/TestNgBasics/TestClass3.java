package TestNgBasics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass3 {
	
	@BeforeTest
	public void openDB() {
		System.out.println("DB is opened.");
	}
	
	@AfterTest
	public void closeDB() {
		System.out.println("DB is closed");
	}
	
	@Test (priority=1)
	public void m1() {
		System.out.println("This is m1 method");
	}
	
	@Test (priority=2)
	public void m2() {
		System.out.println("This is m2 method");
	}
	
	@Test (priority=3)
	public void m3() {
		System.out.println("This is m3 method");
	}
	

}
