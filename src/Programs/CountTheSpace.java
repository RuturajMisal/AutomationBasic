package Programs;

public class CountTheSpace {
	public static void main(String[] args) {
		
		// To count the space in the given string.
		
		String a= "I N D I A";
		int space = 0;
		
		// Appling the for loop.
		
		for(int i=0;i<a.length();i++) {
			char c =a.charAt(i);
			if( c==' ' ) {
				space++;
			}
			
		}
		System.out.println(space);
	}

}
