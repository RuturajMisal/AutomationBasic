package Loop;

public class Neatedloop {
	public static void main(String[] args) {
		
		// print square pattern.
		
		for(int a=1; a<=4; a++) {
			for( int b=1; b<=4; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		  
		for(int c=1; c<=5; c++) {
			for( int d=1; d<=5; d++) {
				System.out.print("1");
			}
			System.out.println();
		}
		 //To print the vertical rectangle
		
		for(int e= 1; e<=8; e++) {
			for(int f= 1; f<=5; f++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//To print the horizontal rectangle
		
		for(int g=1; g<=4; g++) {
			for(int h=1; h<=8; h++) {
				System.out.print("1");
			}
			System.out.println();
		}
		
		// Print the triangular pattern
		
		for ( int i=1; i<=6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for ( int i=1; i<=6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		for ( int i=1; i<=6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
