package ArrayString;

public class ReversePalindrome {
	public static void main(String[] args) {
		
		

		
		// Reverse String

				String Original="abcdef";
				String reverse="";
				
				System.out.println(Original.length());
				
				for (int i=Original.length()-1;i>=0;i--)
				{
					reverse=reverse+Original.charAt(i);
				}
				
				System.out.println("The Reverse String is "+ reverse);


		// Palindrome String

				String ORIGINAL= "abcba";
				String Reverse="";
				
				for (int i= ORIGINAL.length()-1; i>=0;i--) {
					Reverse=Reverse+ORIGINAL.charAt(i);
				}
				System.out.println(Reverse);
			
				//System.out.println(Original.equals(Reverse)); // true // false
				
				if(ORIGINAL.equals(Reverse)) {
					System.out.println("The entered String is Palindrome");
				}else {
					System.out.println("The entered String is not Palindrome");
				}
		
	}

}
