package Programs;

public class ReverseNo {
	

	public static void main(String[] args) {
		
		// Using While Loop.
		
//   int no = 500;
//   int reverse =0;
//   int remainder;
//		
//		while(no!=0) {
//			 remainder = no %10;
//			reverse = reverse * 10 + remainder;     // 1
//			no = no/10;
//		}
//		System.out.println("The Reverse of the given no is =" + reverse);	
	
	
//	   // REcurssion
//		
//		public static void RevNo(int number) {
//			if(number<10) {
//				System.out.println(number);
//				return;
//			}else {
//				System.out.print(number%10);
//				RevNo(number/10);
//			}
//		}
//			public static void main(String[]args) {
//			RevNo(154);
//			System.out.println("========================================");
//			RevNo(012);  // java consider 001 as 1 so output is 1.
//			System.out.println("========================================");
//			
//
//		}
//		
		
		
		int num=456;
		int rev=0;
		while(num!=0) {
			int remainder = num % 10;  //456%10 = 45   reminder = 6        // 45  // we get only get remainder  456/10 = 45.6
			rev = rev * 10 + remainder;  //6 // 5//            6 = first no.==> 5 second no.==>4 third no. ==> 654 is the answser.
			num = num/10;//456/10 = 45  // 45/10 = 4
			
			             
		}
		System.out.println("The reverse of the given number is: " + rev);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
