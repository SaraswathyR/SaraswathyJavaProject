package interviewPrograms;

public class OccuranceOfSpecificChar {
	
	public static int occurance(String str, char c) {
		int temp=0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==c)
				temp++;
		}
		return temp;
	}

	public static void main(String[] args) {
		String str= "Saraswathy";
		char c='a';
		System.out.println(occurance(str,c));
		

	}

}
 