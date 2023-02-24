package StaticNonStatic;

public class StaticNonstaticMain {
	public static void main(String[] args) {
		
		
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
