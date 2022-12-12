package array;

public class TestingArray {

	public static void main(String[] args) {
		int ar[] = {10, 50, 30, 20, 40};	
	}
	
	public void reverseAnArray() {

		int ar[] = {10, 50, 30, 20, 40};
		
		for(int i = ar.length-1; i>=0; i--) {
			System.out.println(ar[i]);
		}
	
	}

}
