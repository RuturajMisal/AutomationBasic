package StaticNonStatic;

public class StaticNonStatic {

	// static method.
		// Non-static method.
		
		public static void a1(){
			System.out.println("==============Arithmetic operators===============================================");
			
		}
		
		public static void a2() {
			System.out.println("=============logical operators====================================================");
		}
		
		public void a3() {
			System.out.println("=============Conditional operators=================================================");
		}
		
		public void a4() {
			System.out.println("=============Increment/Decreament operator=========================================");
		}
		public static void main (String[]args) {
			
			//static method
			 StaticNonStatic.a1();
			 StaticNonStatic.a2();
			
			// Non-static method
			//01
			 StaticNonStatic sam= new  StaticNonStatic();
			
			sam.a3();
			sam.a4();
			//02
			 StaticNonStatic sam2= new  StaticNonStatic();
			
			sam2.a3();
			sam2.a4();
			//03
			 StaticNonStatic sam3= new  StaticNonStatic();
			
			sam3.a3();
			sam3.a4();
}
}
