package Methods;

public class Practice1 {
	int x= 60;
	int y= 30;
	//  To find the addition 
	// Case -1 Method will not accept parameter and will  not return any value.
	
   	public void sum() {
		System.out.println(x+y);
 	}
	
	// Case 2  method will  not accept parameter but return the value.

	public int sum2() {
		return( x+y);
	}
	
	// Case 3 - method will accept parameter but not return the value.
	
	public void sum3(int x ,int y) {
		System.out.println(x+y);
	}
	
	
	// Case 4 - Method will accept parameters and return the value.
	
	public int sum4(int x, int y) {
		return ( x+y);
	}
	
	// To find the Subtraction of two number.
	// Case -1 Method will not accept parameter and will  not return any value.

    int a= 75;
    int b= 85;
    
    public void sub() {
        System.out.println(b-a);
    }
    
	// Case 2  method will  not accept parameter but return the value.
    
    public int sub2() {
    	return (b-a);
    }
    
	// Case 3 - method will accept parameter but not return the value.
 
    public void sub3(int a,int b) {
    	System.out.println(b-a);
    	
    }
    
    // Case 4 - Method will accept parameters and return the value.
    
   public int sub4(int a, int b) {
	   return (b-a);
   }
    
    // Multiplication of two numbers.
   
   // Case -1 Method will not accept parameter and will  not return any value.
   
   public void multi() {
	   System.out.println(x*y);
   }
   // Case 2  method will  not accept parameter but return the value.
   
   public float multi2 () {
	   return (a*b);
   }
   // Case 3 - method will accept parameter but not return the value.
   
   public void multi3(float x, float y) {
	   System.out.println(x*y);
   }
   // Case 4 - Method will accept parameters and return the value.

    public float multi4 ( float x, float y) {
    	return (x*y);
    }
    
    // Division of two numbers.
    // Case -1 Method will not accept parameter and will  not return any value.
    
    int g= 75;
    int h= 15;
    
    public void div() {
    	System.out.println(g/h);
    }
    // Case 2  method will  not accept parameter but return the value.
    
    public float div2() {
    	return(g/h);
    }
    
    // Case 3 - method will accept parameter but not return the value.
    
    public void div3(float i ,float j) {
    	System.out.println(i/j);
    }
    // Case 4 - Method will accept parameters and return the value.

    public float div4(float k ,float l) {
    	return(k/l);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

}
