package StaticNonStatic;

public class Sample02 {
	
public static void main(String[] args) {
		
		// Static Method:-classname.methodname();
		
		Sample01.m1();
		Sample01.m2();
		
		
		// Non-static Method:- objectname.methodname();
		
		Sample01 s = new Sample01();
		
		s.m3();
		s.m4();

}
}