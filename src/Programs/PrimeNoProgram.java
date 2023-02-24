package Programs;

import com.sun.tools.javac.launcher.Main;

public class PrimeNoProgram {
	
		
		static void ckeckprime(int n) {
			int i,m=0, flag=0;
			m=n/2;
			
			if(n==0||n==1) {
				System.out.println(n+"   Is not prime no.");
				
			}else {
				for(i=2;i<=m;i++) {
					if(n%1==0) {
						System.out.println(n+"   Is not prime No.");
						flag=1;
						break;
					}
				}
				if(flag==0) {
					System.out.println(n+"    is prime no.");
				}
			}	
			
		}
		public static void main(String[] args) {
			
			ckeckprime(5);
			ckeckprime(20);
			ckeckprime(3);
			ckeckprime(7);
		}
		
		
		
		
		
		
		
		
		
		
		
  

		
		
		
		
		
	}		



