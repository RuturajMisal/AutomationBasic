package Loop;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		
		
		
//01		If user age is equals to or above 17 then user is able to join the Meeting .
		
		int age = 18;
		
		if(age>=17) {
			System.out.println("The user is allow to join the Metting.");
		}
		else {
			System.out.println(" The user is mot allow to join the Metting.");
		}
		
		 System.out.println("===================================================================================================================");
		 
// 02    The speed of the car  at 1st gear is 10 to 20 , on 2  gear is 21 to 30 , 3 gear is up to 31 to 40 ,4 gear 41 to 50  , and 5 gear 51 to ...res.
		// Find the gear with respective of its speed.
		
		int  a = 55;
		
		if(a>=0 && a<=20 ) {
			System.out.println(" Car is in first gear");
		}
		else if(a>=21 && a<=30) {
			System.out.println("Car is in Second Gear");
		}
		else if( a>=31 && a<=40) {
			System.out.println(" Car is in the Third gear");
		}
		else if(a>=41 && a<=50) {
			System.out.println(" car is in the Forth gear");
		}
		else { 
			System.out.println(" car is in the Fifth gear");
		}
		
		 System.out.println("===================================================================================================================");
		 
// 03  Find the given no. is odd or Even.
		
		int b = 24;
		
		if(b%2==0) {
			System.out.println(" The given no is even .");
		}
		else {
			System.out.println(" The given no is odd.");
		}
		
		 System.out.println("===================================================================================================================");
		 
//04   To check the no. is positive or negative.
		
		int number = 85;
				
		if (number>0 && number!=0) {
			System.out.println(" The given no. is positive no.");
		}
		else {
			System.out.println(" The given no is negative no.");
		}
	        System.out.println("===============================================================================================================");
			
//05   Java and Python  are easy  language other language are difficult.
		
		
		String Lang ="Java";
		
		if ( Lang == "Java" ||  Lang =="Python") {
			System.out.println( " The Language is easy.");
		}
		else {
			System.out.println("The Language is Difficult.");
		}
		
		    System.out.println("===================================================================================================================");
		 
//06    To check the value is Greater than , Less than , or Equal to .
		
		 
		int c = 20;
		int d = 50;
		
		if ( c > d) { 
			System.out.println(" The value of C is greater");
		}
		else if (c<d) {
			System.out.println("The value of D is greater ");
		}
		else if (c==d) {
			System.out.println("The value of C & D are equal");
		}
		else {
			System.out.println(" The no. is invalid");
		}
	
		 System.out.println("===================================================================================================================");
		 
//07   Days of the week on the no. of the day.
		 
		 int day = 1;
		 
		 if ( day ==1) {
			 System.out.println(" Monday");
		 }
		 else if( day==2) {
			 System.out.println("Tuesday");
		 }
		 else if(day ==3) {
			 System.out.println("Wednesday");
		 }
		 else if(day==4) {
			 System.out.println("Thursday");
		 }
		 else if(day==5) {
			 System.out.println("Friday");
		 }
		 else if ( day==6) {
			 System.out.println("saturday");
		 }
		 else if(day==7) {
			 System.out.println("Sunday");
		 }
		 else {
			 System.out.println(" The entry is invalid");
		 }
		
		 System.out.println("===================================================================================================================");
		
//08    To check the student is eligible or not.		
		 
		 int marks = 45;
		 
		 if ( marks>=35) { 
			 System.out.println(" The student is eligible .");
		 }
		 else {
			 System.out.println("The student is not eligible.");
		 }
		 
		     System.out.println("===================================================================================================================");
		 
//09    Mathematics is easy subject other subject are difficult.
		     
		     String e = "math";
		     
		     if (e == "math") {
		    	 System.out.println(" It is easy subject");
		     }
		     else { 
		    	 System.out.println("It is Difficult subject");
		     }
		     
		     System.out.println("===================================================================================================================");
		 
//10      To check the movie is good or bad.
		     
		     String Movie = " Good";
		     
		     if (Movie == "Good") {
		    	 System.out.println(" The movei is Good");
		     }
		     else { 
		    	 System.out.println("The movei is Bad");
		     }
		 
		     System.out.println("===================================================================================================================");
		 
		    
//11        Company give bonus of 10% for employees whose service  over greater than 5 years .
		     
		     int service = 6;
		     
		     if (service >=5) { 
		    	 System.out.println(" employee gets Bonus");
		     }
		     else { 
		    	 System.out.println(" employee not get bonus");
		     }
		     
		     System.out.println("===================================================================================================================");
		     
//12     Find the younger one 
		     
		     int f= 52;
		     int g =36;
		     int h =40;
		     
		     if ((f<g) && (g<h)) { 
		    	 System.out.println(" f is younger :-" +f);
		     }
		     else if ((g<h) && (h<f)) { 
		    	 System.out.println(" g is younger:-" +g);
		     }
		     else if (( h<f) && ( f<g)) { 
		    	 System.out.println(" his yunger:-" +h);
		     }
		     else {
		    	 System.out.println(" The gven entry is invalid");
		     }
		 
		         System.out.println("===================================================================================================================");
		 
//13        Whether the no. is divisible by 3 & 6.
		     
		     int i = 60;
		     
		     if (i%3==0 && i%6==0) {
		    	 System.out.println(" The given no. is divisible of 3 & 6 ");
		     }
		     else if (i %3==0) {
		    	 System.out.println(" The given no. is only divisible of 3");
		     }
		     else if ( i%6==0) { 
		    	 System.out.println(" The given no is only divisible of 6");
		     }
		     else {
		    	 System.out.println(" The given no. is not divisible of 3 & 6");
		     }
		     
		         System.out.println("===================================================================================================================");
		 
//14             Find the largest no.
		         
		         float j = 223.65f;
		         float k = 235.852f;
		         
		         if (j>k) {
		        	 System.out.println(" j is largest no :-" +j);
		         }
		         else  if ( k>j) { 
		        	 System.out.println(" k is largest no :-" +k);
		         }
		         else { 
		        	 System.out.println(" The entry is invalid");
		         }
		 
		         System.out.println("===================================================================================================================");		 
		 
//15        students differ with respective their age .
		         // 1 group = 0 to 10 , 2 group = 11 to 20, 3 group = 21to ....
		         
		         int l = 25;
		         
		         if(l>=0 && l<=10) {
		        	 System.out.println(" The given student comes in first group");
		         }
		         else if( l>=11 && l <= 20) {
		        	 System.out.println(" The given student comes in second group");
		         }
		         else if ( l>=21 ) {
		        	 System.out.println(" Th given student comes in third group");
		         }
		         else { 
		        	 System.out.println(" The given entry is invalid");
		         }
		             System.out.println("===================================================================================================================");
		 
		 
		 
		 
		 
		 
	}
}
