package stringPracticeExamples;

public class ReverseStringPractice {

	public static void main(String[] args) {
		String name="Mounisha";
		String reverseString="";
		
		for(int i=name.length()-1;i>=0;i--) {
			reverseString=reverseString+ name.charAt(i);
		}
		System.out.print("The reversed the string: '" + name +"'is:" );
		System.out.println(reverseString);

	}

}
