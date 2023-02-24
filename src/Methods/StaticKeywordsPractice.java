package Methods;

public class StaticKeywordsPractice {
	
		
		

		int empId;
		String empName;
		static int dept =10;
		static int project =01;
		
		public void display() {
			System.out.println(empId);
			System.out.println(empName);
			System.out.println(dept);
			System.out.println(project);
			
		}
		
		public static void main(String[] args) {
			StaticKeywordsPractice name1 = new StaticKeywordsPractice ();  //object creation.
			System.out.println("=========================================01=========================================");
			name1.empId =101;
			name1.empName ="ABC";
			name1.display();
			
			System.out.println("==============================================02=====================================");
			
	        StaticKeywordsPractice name2 = new StaticKeywordsPractice ();  //object creation.
			project=2;
			name2.empId =102;
			name2.empName ="DEF";
			name2.display();
			
			System.out.println("============================================03========================================");
			
	        StaticKeywordsPractice name3 = new StaticKeywordsPractice ();  //object creation.
			
			name3.empId =103;
			name3.empName ="GHI";
			name3.display();
			
			System.out.println("===========================================04====================================");
			
			 StaticKeywordsPractice  name4 = new  StaticKeywordsPractice  ();  //object creation.
			project=02;
			name4.empId =104;
			name4.empName ="JKL";
			name4.display();
			
			System.out.println("=========================================05======================================");
			
			 StaticKeywordsPractice  name5 = new  StaticKeywordsPractice  ();  //object creation.
			
			name5.empId =105;
			name5.empName ="MNO";
			name5.display();
			
			System.out.println("=======================================06===========================================");
			
			 StaticKeywordsPractice  name6= new  StaticKeywordsPractice  ();  //object creation.
			dept=6;
			name6.empId =106;
			name6.empName ="PQR";
			name6.display();
			
			System.out.println("======================================07============================================");
			
			 StaticKeywordsPractice  name7= new  StaticKeywordsPractice  ();  //object creation.
			
			name7.empId =107;
			name7.empName ="STU";
			name7.display();
			
			System.out.println("====================================08===================================");
			
			 StaticKeywordsPractice  name8 = new StaticKeywordsPractice  ();  //object creation.
			
			name8.empId =108;
			name8.empName ="vwx";
			name8.display();
			
			System.out.println("==================================09========================================");
			
			 StaticKeywordsPractice  name9 = new  StaticKeywordsPractice  ();  //object creation.
			
			name9.empId =109;
			name9.empName ="zzz";
			name9.display();
			
			System.out.println("====================================10==========================================");
			
			 StaticKeywordsPractice  name10 = new  StaticKeywordsPractice  ();  //object creation.
			
			name10.empId =110;
			name10.empName ="ABd";
			name10.display();
			
			System.out.println("===================================================================================");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
