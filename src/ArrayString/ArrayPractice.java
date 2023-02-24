package ArrayString;

public class ArrayPractice {

	public static void main(String[] args) {
		
		

		//Write a java program to calculate sum of values in array.
		int a[ ] = new int [5];
		
		    a[0] = 10;
		    a[1] = 20;
		    a[2] = 30; 
		    a[3] = 40;
		    a[4] = 50;
		    
		System.out.println(" Sum of the numbers :="   + (a[0]+a[1]+a[2]+a[3]+a[4]));
		
		int sum = 0;
		for (int i = 0; i< a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println( "The sum of the values := " +sum);
		
		//Write a java program to search a special number in array.
		
		

		System.out.println( " To find the special character :-" +a [2] );
			
		// Define an array with some String values write a java program to search 
			// special String in an array.
		
		String aa [] = new String [3];
		
		 aa[0] = " Raj ";
		 aa[1] = " Karan";
		 aa[2] = " Priya";
		 
		

		 String aa1 = " Priya";
				 
		 for (int i = 0; i< aa.length; i++ ) {
			  if (aa[i] == aa1 )
		 
			 System.out.println(aa[i]);
		 }
		 //
		// 3. Define an array with some string values write a java program to search specific string in array.
				String s []= { "Mumbai","Nashik","Pune","Aurangabad"};
				System.out.println("The size of an array is:"+s.length);
				String s1="Nashik";// Searching Key(Specific String)
				  for(int k=0;k<s.length;k++) {
					  if(s[k]==s1)
					  System.out.println(s[k]);
		 
				  }
		 
		 
	}
}
