package Programs;

public class DuplicateElementInArray {
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,1,2,2,3,9};
		System.out.println("To print the duplicate Element in the Array");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[ i] == arr [j])
				System.out.println(arr[j]);
			}
		}
		
		
		
	}

}
