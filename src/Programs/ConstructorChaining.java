package Programs;

public class ConstructorChaining {
	
ConstructorChaining(int a){
		
	}
	
	
	ConstructorChaining(int b,int c){
		
		this(5);
		System.out.println(5);
	}

	
	ConstructorChaining(){
		this(10,15);
		System.out.println("10 "+"15");
	}
	
	public static void main(String[] args) {
		
		ConstructorChaining c  = new ConstructorChaining();

}
}