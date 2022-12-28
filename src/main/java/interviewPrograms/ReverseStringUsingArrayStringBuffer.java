package interviewPrograms;

public class ReverseStringUsingArrayStringBuffer {

	public static void main(String[] args) {
		String str= "Saraswathy R";
		StringBuffer sbuff= new StringBuffer(str);
		sbuff.reverse();
		System.out.println(sbuff);

	}

}
