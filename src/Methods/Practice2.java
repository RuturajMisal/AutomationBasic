package Methods;

public class Practice2 {
	public static void main(String[] args) {
		
		
		
			
			// To find Addition of 2 numbers.
			// Case 1
			System.out.println("=========Addition two Numbers==============");
			Practice1 add = new Practice1();
			add.sum();
			
	       //		Case 2
			Practice1 add1= new Practice1();
			int output =add1.sum2();
			System.out.println(output);
			//System.out.println(add.sum());
			
			// Case 3
			Practice1 add2= new Practice1();
			add2.sum3(100, 200);
			add2.sum3(10, 20);
		
		
	     	// case 4 
		
			Practice1 add3= new Practice1();
			System.out.println(add3.sum4(50, 500));
			
			// To find the Subtraction of two numbers.
			//case 1
			System.out.println("===============Substraction==================");
			Practice1 subs = new Practice1();
			subs.sub();
			
			//case 2.
			int q = subs.sub2();
			System.out.println(q);
			
			//case 3.
			subs.sub3(50,55);
			
			// case 4.
			int p =subs.sub4(25, 45);
			System.out.println(p);
			
			//To find the Multiplication of two Numbers.
			//case 1.
			System.out.println("==================Multiplcation=================");
			Practice1 multipli =new Practice1();
			
	        multipli.multi();
	       
	        
	        //case 2.
	      float w=  multipli.multi2();
	      System.out.println(w);
	 
			
	        //case 3.
	       multipli.multi3(23, 85);
	     
	       
	        //case 4.
	        multipli.multi4(10, 30);
			
			// To find the Division of two Numbers.
	        
	        
	        System.out.println("=================Division=============");
	        //case 1.
	        
	        Practice1 divi = new Practice1();
	        
	       divi.div();
	        
	        //case 2.
	        
	        divi.div2();
	        
	        //case 3.
	        
			divi.div3(200, 56);
			
			//case 4.
			
			float s=divi.div4(45, 85);
			
			System.out.println(s);
	}

}
