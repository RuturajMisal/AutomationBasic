package ArrayString;

public class ReverseNoProgram {
	
		
		
		// Reverse No Using Recursion.
		public static void RevNo(int number) {
			if(number<10) {
				System.out.println(number);
				return;
			}else {
				System.out.print(number%10);
				RevNo(number/10);
			}
		}
		
		public static void main(String[]args) {
			RevNo(100);
			System.out.println("========================================");
			RevNo(001);  // java consider 001 as 1 so output is 1.
			System.out.println("========================================");
			RevNo(0205616);
		}
		
		
		
		
		
		
		
		
		
		
		
	}


