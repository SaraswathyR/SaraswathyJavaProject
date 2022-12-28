package interviewPrograms;

import java.util.ArrayList;

public class ReverseStringUsingArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(4);
		al.add(9);
		al.add(5);
		al.add(3);
		System.out.println(al);
		
		for(int i=al.size()-1; i >= 0; i--) {
			System.out.println(al.get(i));
		}
		

	}

}
