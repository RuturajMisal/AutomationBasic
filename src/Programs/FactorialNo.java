package Programs;

public class FactorialNo {
	public static void main(String[] args) {
		
		int i,fact=1;
		int number =5; // the number we want to check.
		
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of the number  "+ number+"   is "+ fact);
		
		//5*4*3*2*1  ==120
		
	}

}
