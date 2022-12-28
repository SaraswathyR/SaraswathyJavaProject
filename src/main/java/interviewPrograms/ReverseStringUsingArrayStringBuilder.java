package interviewPrograms;

public class ReverseStringUsingArrayStringBuilder {

	public static void main(String[] args) {
		String str= "My name is Saraswathy";
		System.out.println(str);
		StringBuilder strbul= new StringBuilder();
    	strbul.append(str);
		strbul.reverse();
		System.out.println("Reversed String:" +strbul);
	}

}
  