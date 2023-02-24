package Operators;

public class Operators {
	public static void main(String[] args) {
		
		
		//Arithmetic Operators      +,-,*,/,%. 
				int x = 50;
				int y = 20;
				System.out.println("==============Arithmetic operators===============================================");
				System.out.println( "Sum of x & y is =" +(x+y));
				System.out.println("Diff of x & y is =" +(x-y));
				System.out.println("Mul of x & y is =" +(x*y));
				System.out.println("Div of x & y is =" +(x/y));
				System.out.println("Mod Div/ Remainder of x & y is =" +(x%y));
				//Relational Operators    <,>,<=,>=,!=,==.
				System.out.println("================Relational Operators ===============================================");
				System.out.println( x<y);//F
				System.out.println(x<y);//F
				System.out.println(x<=y);//F
				System.out.println(x>=y);//T
				System.out.println(x!=y);//T
				System.out.println(x==y);//F
				//Logical operators    &&,||,!.
				boolean a = true;
				boolean b = false;
				System.out.println("=================Logical Operators ===================================================");
				System.out.println(a&&b);
				System.out.println(a||b);
				System.out.println(!b);
				System.out.println(!a);
				//Increment / Decrement operators   ++, --.
				System.out.println("==================increment / Decrement Operators=========================================");
				x = 50;                     	                    
				x++;		//x=x+1;        
				System.out.println(x++);
				y = 20;
				y++;        //y=y+1;
				System.out.println(y++);
				x =50;
				x--;         //x=x-1;
				System.out.println(x--);
				y = 20;
				y--;         // y = y-1;
				System.out.println(y--);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
