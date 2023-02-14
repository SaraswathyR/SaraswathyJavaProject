package stringPracticeExamples;

public class CountCharacter {

	public static void main(String[] args) {
		String input="Selenium";
		 char ch='e';
		 int count=0;
		 
		 for(int i=0;i<input.length()-1;i++) {
			 if(input.charAt(i)==ch) {
				 count++;
			 }
		 }
		 
		System.out.println();		
				
	}

}
