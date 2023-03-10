package Patterns;

public class Patterns {

	public static void main(String[] args) {
		

//		 Program :- Pattern 1
		
				for (int i=1;i<=4;i++) {
					for (int j=1;j<=4;j++) {
						System.out.print("*");
					}
					System.out.println("");
				}
//		Output:-	
//		****
//		****
//		****
//		****
System.out.println("==============================================================================================================");
		// Program :- Pattern 2	

				for (int i=1;i<=5;i++) {
					for (int j=1;j<=i;j++) {
						System.out.print("*");
					}
					System.out.println();
				}

//		Output:-
//		*
//		**
//		***
//		****
//		*****
System.out.println("===========================================================================================================");
		// Program:- Pattern 3

				for (int i=1;i<=5;i++) {
					for (int j=5;j>=i;j--) {
						System.out.print("*");
					}
					System.out.println();
				}

//		Output:-
//		*****
//		****
//		***
//		**
//		*

System.out.println("===============================================================================================================");
		// Program:- Pattern 4

				for (int i=1;i<=5;i++) {
					for (int j=1;j<=i;j++) {
						System.out.print("*");
					}
					System.out.println();
				}  // This Loop is to generate upper Triangle

				for (int i=1;i<=5;i++) {
					for (int j=4;j>=i;j--) {
						System.out.print("*");
					}
					System.out.println();
				} 


//		Output:-
//
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*

System.out.println("=======================================================================================================");
		// Program:- Pattern 5

			// This for  loop is for row increment
				for (int i=1;i<=5;i++) {
					for (int j=4;j>=i;j--) {
						System.out.print(" ");
					} // This for loop is to print spaces
					for (int k=1;k<=i;k++) {
						System.out.print("*");
					} // This for loop is to print *
					System.out.println();
				}

//		Output:-
//		     *
//		    **
//		   ***
//		  ****
//		 *****

System.out.println("=========================================================================================================");

		// Program:- Pattern 6
			// This for  loop is for row increment
			for (int i=1;i<=5;i++) {
				for (int j=1;j<=i;j++) {
					System.out.print(" ");
				} // This for loop is to print spaces
				for (int k=5;k>=i;k--) {
					System.out.print("*");
				} // This for loop is to print *
				System.out.println();
			}
//
//		Output:-
//		 *****
//		  ****
//		   ***
//		    **
//		     * 


			System.out.println("=====================================================================================================");
		// Program:- Pattern 7
			// This Code is for Upper Triangle
				for (int i=1;i<=5;i++) {
					for (int j=4;j>=i;j--) {
						System.out.print(" ");
					} // This for loop is to print spaces
					for (int k=1;k<=i;k++) {
						System.out.print("*");
					} // This for loop is to print *
					System.out.println();
				} 
			// This Code is for Lower Triangle
				for (int i=1;i<=4;i++) {
					for (int j=1;j<=i;j++) {
						System.out.print(" ");
					} // This for loop is to print spaces
					for (int k=4;k>=i;k--) {
						System.out.print("*");
					} // This for loop is to print *
				   System.out.println();
				}
//		Output:-
//
//		    *
//		   **
//		  ***
//		 ****
//		*****
//		 ****
//		  ***
//		   **
//		    *

				
System.out.println("==========================================================================================================");
		// Program:- Pattern 8

					// This for  loop is for row increment
						for (int i=1;i<=5;i++) {
							for (int j=4;j>=i;j--) {
								System.out.print(" ");
							} // This for loop is to print spaces
							for (int k=1;k<=i;k++) {
								System.out.print("* ");
							} // This for loop is to print *
							System.out.println();
						}
//
//		Output:-
//
//		    * 
//		   * * 
//		  * * * 
//		 * * * * 
//		* * * * * 

System.out.println("=============================================================================================================");
		// Program:- Pattern 9


				for (int i=1;i<=5;i++) {
					for (int j=1;j<=5;j++) {
						System.out.print(i);
					}
					System.out.println("");
				}

//		Output:-
//
//		11111
//		22222
//		33333
//		44444
//		55555

System.out.println("==============================================================================================================");

		// Program:- Pattern 10

				for (int i=1;i<=5;i++) {
					for (int j=1;j<=5;j++) {
						System.out.print(j);
					}
					System.out.println("");
				}

//		Output:-
//
//		12345
//		12345
//		12345
//		12345
//		12345

System.out.println("============================================================================================================");
		// Program:- Pattern 11

				for (int i=1;i<=5;i++) {
					for (int j=1;j<=i;j++) {
						System.out.print(i);
					}
					System.out.println();
				}

//		Output:-
//
//		1
//		22
//		333
//		4444
//		55555

				System.out.println("===============================================================================================");

		// Program:- Pattern 12

				for (int i=1;i<=5;i++) {
					for (int j=5;j>=i;j--) {
						System.out.print(i);
					}
					System.out.println();
				}

//		Output:-
//
//		11111
//		2222
//		333
//		44
//		5

System.out.println("============================================================================================================");				
		// Program:- Pattern 13

				for (int i=1;i<=5;i++) {
					for (int j=5;j>=i;j--) {
						System.out.print(j);
					}
					System.out.println();
				}

//		Output:-
//
//		54321
//		5432
//		543
//		54
//		5

System.out.println("==============================================================================================================");				
		// Program:- Pattern 14

				// This for  loop is for row increment
						for (int i=1;i<=5;i++) {
							for (int j=4;j>=i;j--) {
								System.out.print(" ");
							} // This for loop is to print spaces
							for (int k=1;k<=i;k++) {
								System.out.print(i);
							} // This for loop is to print Number
							System.out.println();
						}
				
//		Output:-
//
//		    1
//		   22
//		  333
//		 4444
//		55555

System.out.println("============================================================================================================");
		// Program:- Pattern 15

				// This for  loop is for row increment
						for (int i=1;i<=5;i++) {
							for (int j=4;j>=i;j--) {
								System.out.print(" ");
							} // This for loop is to print spaces
							for (int k=1;k<=i;k++) {
								System.out.print(k);
							} // This for loop is to print Number
							System.out.println();
						}
				
//		Output:-
//
//		    1
//		   12
//		  123
//		 1234
//		12345

System.out.println("=============================================================================================================");						
		// Program:- Pattern 16

				// This for  loop is for row increment
				for (int i=1;i<=5;i++) {
					for (int j=1;j<=i;j++) {
						System.out.print(" ");
					} // This for loop is to print spaces
					for (int k=5;k>=i;k--) {
						System.out.print(i);
					} // This for loop is to print Number
					System.out.println();
				}


//		Output:-
//
//		 11111
//		  2222
//		   333
//		    44
//		     5


System.out.println("===========================================================================================================");				
		// Program:- Pattern 17

		// This for  loop is for row increment
				for (int i=1;i<=5;i++) {
					for (int j=1;j<=i;j++) {
						System.out.print(" ");
					} // This for loop is to print spaces
					for (int k=5;k>=i;k--) {
						System.out.print(k);
					} // This for loop is to print Number
					System.out.println();
				}
//		Output:-
//
//		 54321
//		  5432
//		   543
//		    54
//		     5

				
System.out.println("==============================================================================================================");		
		// Program:- Pattern 18

		// This for  loop is for row increment
				for (int i=1;i<=5;i++) {
					for (int j=4;j>=i;j--) {
						System.out.print(" ");
					} // This for loop is to print spaces
					for (int k=1;k<=i;k++) {
						System.out.print(i+" ");
					} // This for loop is to print Number
					System.out.println();
				}

//		Output:-
//
//		    1 
//		   2 2 
//		  3 3 3 
//		 4 4 4 4 
//		5 5 5 5 5 

System.out.println("===============================================================================================================");
		// Program:- Pattern 19

				for (int i=1;i<=5;i++) {
					for (int j=4;j>=i;j--) {
						System.out.print(" ");
					} // This for loop is to print spaces
					for (int k=1;k<=i;k++) {
						System.out.print(k+" ");
					} // This for loop is to print Number
					System.out.println();
				}


//		Output:-
//
//		    1 
//		   1 2 
//		  1 2 3 
//		 1 2 3 4 
//		1 2 3 4 5 


System.out.println("=============================================================================================================");				
		// Program:- Pattern 20

				int count=0;
				for (int i=1;i<=4;i++) {
					for (int j=1;j<=i;j++) {
						count= count+1;
						System.out.print(count+ " ");
					}
					System.out.println();
				}


//		Output:-
//
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 

				
System.out.println("=============================================================================================================");				
		// Program:- Pattern 21

				for (int i=1;i<=5;i++) {
					for (int j=i;j>=1;j--) {
						System.out.print(j+ " ");
					}
					System.out.println();
				}

//		Output:-
//
//		1 
//		2 1 
//		3 2 1 
//		4 3 2 1 
//		5 4 3 2 1 

	}
}
