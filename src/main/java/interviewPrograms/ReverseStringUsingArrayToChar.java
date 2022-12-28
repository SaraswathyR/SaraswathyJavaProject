package interviewPrograms;

public class ReverseStringUsingArrayToChar {
	

	public static void main(String[] args) {
		String str= "Saraswathy";
		System.out.println(str);
		char[] rev=str.toCharArray();
		
		for(int i=rev.length-1; i >= 0; i--){
		System.out.println(rev[i]);
		}
		

	}

}
