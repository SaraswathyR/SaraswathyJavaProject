package interviewPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseStringUsingCollections {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		list.add(30);
		list.add(2);
		list.add(200);
		list.add(100);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		

	}

}
