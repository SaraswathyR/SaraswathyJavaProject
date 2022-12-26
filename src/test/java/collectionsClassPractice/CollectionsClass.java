package collectionsClassPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);

		System.out.println(list);

		System.out.println("Reverse an ArrayList");
		for (int i = list.size()-1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		
		System.out.println(Collections.max(list));
		
		
		System.out.println("Reverse an ArrayList using Collections Utility Class");
		Collections.reverse(list);
		System.out.println(list);
		
		
	}

}
