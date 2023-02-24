package ArrayString;

public class ReverseNumber {
	public static void main(String[] args) {
		
		
		int no1 = 12345, reverse = 0;
		
		while(no1 !=0) {
			int remainder = no1 %10;
			reverse = reverse * 10 + remainder;
			no1 = no1/10;
		}
		System.out.println("The Reverse of the given no is =" + reverse);
		
		
		
	}

}
