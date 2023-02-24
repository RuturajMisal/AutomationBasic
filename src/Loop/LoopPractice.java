package Loop;

public class LoopPractice {
	public static void main(String[] args) {
		
		

		// 1. initialization  2. condition 3. increment or decrement .
		//while loop
	//01      To print the number 1 to 10.
		
		int a = 1;
		while(a<=10) {
			System.out.println(a);
			a++;
		}
		System.out.println("====================================================================================================="); 
		
	//02  To print number 1 to 10 in descending order .
		
		int b = 10;
		while( b>=1) {
			System.out.println(b);
			b--;
		}
		System.out.println("=======================================================================================================");
		
	//03 To print number 1 to 100
		
		int c =1;
		while(c<=100) {
			System.out.print(c + " ");
			c++;
		}
		System.out.println("========================================================================================================");
		
	//04  To print Divisible of 2 in 1 to 20.
		
		int d =2;
		while (d <=20) {
			System.out.println(d);
			d = d+2;
		}
		System.out.println("==============================================================================================================");
		
	//05  To print  divisible of 3 in 1 to 40.
		
		int e = 3;
		while (e<=40) {
			System.out.print(e + " ");
			e= e+3;
		}
		    System.out.println("==================================================================================================================");
		
		// do loop.
	//06  To print no. 1 to 10.
		int f = 1;
		do {
		    System.out.println(f);
		f++;
		  } while(f<=10);
		    System.out.println("===============================================================================================================");
		
		    //do while loop.
	//07  To print no. 1 to 20 in descending order.  
		
		int g = 20;
		do {
		    System.out.println(g);
			g--;
		} while (g>=1);
		    System.out.println("===========================================================================================================");
		
	//08  Print a to z using while loop.
	    char h = 'a';
	    while (h<='z') {
		    System.out.print(h + " ");
		    	h++;
		    }
		    System.out.println("=================================================================================================================");
		
	//09 Print A to Z in descending order.	
		
		char j= 'Z';
		while ( j >= 'A') {
			System.out.print(j + " ");
			j--;
		}
		    System.out.println("================================================================================================================");
		
		    // for loop.
	//10 	print 10 to 50 using for loop.
		    
	    int k = 10;
	    for (k=10; k<=50; k++) {
		    	System.out.print(k + " ");
		    } 
		       System.out.println("========================================================================================================");
		
	//11   print the no. 100 to 1 descending order.
	    int l = 100;
	    for( l=100; l>=1; l--) {
		        System.out.print(l + " ");
		         }
		         System.out.println("========================================================================================================");
		
		
	//12  Print table of 5.
		 int num = 5;
		 for(int m = 1; m<=10;  m++) {
			     System.out.println(num + "*"+m+"=" +num*m);
		 }
		        System.out.println("===========================================================================================================");
		
	//13  print table of 6.
		  int n= 6;
		  for( n=6; n<=60; n= n+6)  {
			     System.out.println(n);
		  }
		        System.out.println("===================================================================================");
		
	//15   Print table of 8 in descending order.
		    int p=80;
		    for (p=80; p>=8; p=p-8) {
		    	System.out.print(p +" ");
		    }
		         System.out.println("============================================================================================");
		
		
		
	}

}
