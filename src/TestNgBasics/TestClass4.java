package TestNgBasics;

import org.testng.annotations.Test;

public class TestClass4 {
	

	@Test  (priority=1)
	public void m4() {
		System.out.println("This is m4 method");
	}
	
	
	@Test (priority=2)
	public void m5() {
		System.out.println("This is m5 method");
	}
	
	@Test (priority=3)
	public void m6() {
		System.out.println("This is m6 method");
	}

}
