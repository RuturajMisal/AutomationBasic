package StaticNonStatic;

public class SampleMain {
	public static void main(String[] args) {
		
		
		
		// Main Class
		
			
				
				// static methods :- classname.methodname();
				
				Sample.m1();
				Sample.m2();
				
				// non static methods :- objectname.methodname();
				
				Sample s = new Sample();  // object creation
				s.m3();
				s.m4();
	}

}
