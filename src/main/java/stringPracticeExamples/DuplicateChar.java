package stringPracticeExamples;

import java.util.ArrayList;

public class DuplicateChar {

	public static void main(String[] args) {
		String input= "This is Saraswathy Raghuvaran Mounisha";
		int count=0;
		
		ArrayList<Character> charList = new ArrayList<>();
		
		for(int i=0; i< input.length(); i++) {
			char ch=input.charAt(i);
			for(int j=0; j< input.length(); j++) {
				if(input.charAt(j)!= ch) {
					continue;
				}
				count++;
			}
			if(!charList.contains(ch)) {
				if(count >1 && ch != ' ') {
					System.out.println("Char: "+ ch + ",count: "+ count + "times");
					charList.add(ch);
				}
			}
			count=0;
		}
		
		
	

}
}