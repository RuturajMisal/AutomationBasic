package Automation;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExceptionHandeling {
	public static void main(String[] args) {
		
		
//		// HOw to handle the exception.
//				int a =100;
//				String Count = "1254";
//			  
//
//				try {
//					// risky code
//					System.out.println(a/2);
//					int i = Integer.parseInt(Count);
//				    System.out.println(i);
//				}catch(ArithmeticException e) {
//					e.printStackTrace();
//					System.out.println("Wrong input provided by the user");
//				}catch(Exception e1) {
//					e1.printStackTrace();
//					System.out.println("Generic catch block");
//				}finally {                                           //1. exception will occur and it is handlled by catch block 
//					System.out.println("Executing finally block");   //2.exception will occur and it is not handlled by catch block 3. if exception does not occur
//					System.out.println("Executing finally block");
//				}
//				
//				
//				System.out.println("Program Finished");
		
		
		
		
		
		
		
		
		
		
		// checked Exception.
		
				// Example 1
				try {   
					 // we will write the risky code.
					Thread.sleep(2000);
				} catch (Exception e) {  // what error is occured. and we can also provide the aleternative solution if possible.
					e.printStackTrace();
				}
				
				// Example 2
					try {
						FileInputStream file = new FileInputStream("C:\\Users\\Welcom\\OneDrive\\Desktop\\Excel input data file.xlsx");
						String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
						System.out.println(data);
					}catch (Exception e) {  
						e.printStackTrace();
		
		
		
		
		
		
		
		
	}
	}
}
