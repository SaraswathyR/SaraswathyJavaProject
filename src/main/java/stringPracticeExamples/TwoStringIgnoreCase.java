package stringPracticeExamples;

public class TwoStringIgnoreCase {

	public static void main(String[] args) {
		String str1= "My name is Saraswathy";
		String str2= "My NAME is SARASWATHY";
		
		System.out.println("check using equal() method: " +str1.equals(str2) );
		System.out.println("check using equalIgnoreCase() method: " +str1.equalsIgnoreCase(str2));

	}

}
