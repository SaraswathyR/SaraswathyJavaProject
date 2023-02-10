package stringPracticeExamples;

public class ReverseString {

	public static void main(String[] args) {
		String name= "My name is Saraswathy";
		String reverseString="";
		
		for(int i= name.length()-1; i>=0; i--) {
			reverseString= reverseString + name.charAt(i);
		}
		System.out.print("The reverse string of '" + name + "'is:");
		System.out.println(reverseString);
		

	}

}
