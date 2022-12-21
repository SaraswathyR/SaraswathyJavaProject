package collectionsPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<Character> all= new ArrayList<Character>();
		all.add('a');
		all.add('b');
		all.add('c');
		all.add('a');
		all.add(null);
		all.add('f');
		System.out.println(all);
		
		Iterator itr=all.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	

	}

}
