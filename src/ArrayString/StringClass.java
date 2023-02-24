package ArrayString;

public class StringClass {
	public static void main(String[] args) {
		
		

		

		String s= "Velocity";
		String s1= "Velociity";
		String s2= " Welcome to Home ";
		
		// To caluclte the length.
		System.out.println("The Length is "+ s.length());
		
		// Uppercase ==> To convert string in uppercase.
		System.out.println("The Uppercase is "+ s.toUpperCase());
		
		// Lowercase
		System.out.println("The Lowercase is "+ s.toLowerCase());
		
		// char at ==> the character at specific index.
		System.out.println("The character at 3rd index " +s.charAt(3));
		
		// indexof ==> it will return index of secific character.
		System.out.println("The index of i is "+ s.indexOf("i"));
		
		// lastindexof
		System.out.println("The last index of i is "+ s1.lastIndexOf("i"));
		
		// trim 
		System.out.println("The String s2 before trimming "+ s2);
		System.out.println(" The String s2 after triming "+ s2.trim());
		



	//Program String Comparision

		String S="Velocity";
		String S1 ="VELOCITY";
		String S2= "Veloc";
		
		// equals. // its a case sensitive.  // True /false.
		System.out.println(S.equals(S1));
		
		// equalsingnorecase:- 
		System.out.println(S1.equalsIgnoreCase(S));
		
		// contains.
		System.out.println(S.contains(S2));
		
		// isempty();
		System.out.println("Checking the emptyness "+ S.isEmpty());

		String S4= "abc";
		String S5= "xyz";
		// concats.
		System.out.println("The Concatinated string is "+ S4.concat(S5));
		
		// stratswith
		System.out.println("The Strats with Method "+ S2.startsWith("ab"));
		
		// endswith
		System.out.println("The ends with Method "+ S4.endsWith("bc"));
		
		String S6= "Welcome to Java";

		// replace
		System.out.println("The Replace "+ S6.replace("Java", "Python"));
		
		
		// substring
		System.out.println("The Substring with start index only "+ S.substring(3));
		System.out.println("The Suv=bstring with Start and end index "+ S.substring(3, 6));
		

	String[] words=S6.split(" ");
		for (int i=0; i<words.length;i++) {
			System.out.println(words[i]);
		}
	}

}
