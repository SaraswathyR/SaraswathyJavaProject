package collectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.stream.Stream;

public class ArrayListForAllMethods {

	static boolean present;
	static Integer i;
	static int in;
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		System.out.println(a);
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(1);
		b.add(2);
		b.add(3);
		System.out.println(b);
		ArrayList<Integer> d = new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println(al);
		
		System.out.println("Adding anaoter array");
		ArrayList<Integer> al1= new ArrayList<Integer>();
		al1.add(5);
		al1.add(8);
		System.out.println(al1);
		
		System.out.println("Add element in specific index in AL1");
		al1.add(1,6);
		al1.add(2,7);
		System.out.println(al1);
		
		System.out.println("Add 2 arrays to 1");
		al.addAll(al1);
		System.out.println(al);
		System.out.println(al1);
		
		System.out.println("Contains specific element and returns boolean value as output");
		present =al.contains(4);
		System.out.println(present);
		
		System.out.println(al.contains(9));
		
		System.out.println("find all emelements in both array and return boolean");
		present = al.containsAll(al1);
		System.out.println(present);
		
		System.out.println(al1.containsAll(al));
		
		System.out.println("Creating second collection");
		ArrayList<Integer> al2= new ArrayList<Integer>(); 
		al2.add(1);
		al2.add(2);
		al2.add(3);
		al2.add(4);
		al2.add(5);
		ArrayListPractice alp = new ArrayListPractice();
		alp.printAnArrayListUsingForEach(al2);
		System.out.println(al2);
		
		System.out.println("Checking presence of collection elements in other");
		present= al.containsAll(al2);
		System.out.println(present);
		
		System.out.println("To check false conditions");
		al2.add(9);
		al2.add(10);
		System.out.println(al2.containsAll(al));
		
		System.out.println("To increase capacity");
		al2.add(11);
		al2.add(12);
		al2.add(13);
		al2.add(14);
		al2.add(15);
		al2.ensureCapacity(1000);
		System.out.println(al2.size());
		al2.trimToSize();
		System.out.println(al2.size());
		System.out.println(al2);
		
		System.out.println("Find 2 arrays equal");
		present= al.equals(al2);
		System.out.println(present);
		
		System.out.println(a.equals(b));
		
		System.out.println("Fetch element using index");
		i=al.get(4);
		System.out.println(i);
		
		System.out.println("Add list of collection elements into other");
		al2.addAll(a);
		System.out.println(al2);
		
		System.out.println("Return runtime class ");
		Class c= al2.getClass();
		System.out.println(c);
		
		System.out.println("Returns hashcode for arraylist");
		System.out.println(al2.hashCode());
		
		System.out.println("Return index of first occurance of array");
		System.out.println(al1.indexOf(1));
		
		System.out.println("Returns true is vlue present, false value not present");
		present=al.isEmpty();
		System.out.println(present);
		
		present=d.isEmpty();
		System.out.println(present);
		
		System.out.println("Iterator");
		
		 Iterator<Integer> itr = al.iterator();
//		 i=itr.next();
//		 System.out.println(i);
//		 i=itr.next();
//		 System.out.println(i);
//		 i=itr.next();
//		 System.out.println(i);
		 
		 Iterator<Integer> itr1 = al.iterator();
		 
		 System.out.println("HasNext send boolean value true if value is present");
		 present= itr.hasNext();
		 System.out.println(present);
		
		 System.out.println("HasNext send boolean value false if value is nt present");
		 present= itr1.hasNext();
		 System.out.println(present);
		
	
		 System.out.println("To get the lastIndex in an ArrayList");
		 System.out.println("++++"+al2);
		 in=al2.lastIndexOf(3);
		 System.out.println(in);
		 
		 System.out.println("List Iterator");
		 ListIterator<Integer> li=al.listIterator();
//		 ListIterator<Integer> li2=al2.listIterator();
		 
		 System.out.println(al);
		 System.out.println("Forward direction");
		 while(li.hasNext()) {
			 System.out.println(li.next());
		 }
			 
		 System.out.println("Backward direction");
		 while(li.hasPrevious()) {
			 System.out.println(li.previous());
		 }
		 
		 System.out.println("Replace an array value using set");
		 System.out.println(al2);
		 al2.set(1, 3);
		 System.out.println(al2);
		 
		 System.out.println("Returning stream of data in sequential order");
		 Stream<Integer> s= al.parallelStream();
		 System.out.println(s);
		 
		 System.out.println(" Returning stream of data in sequential order from al2");
			Stream s2=al2.parallelStream();
			System.out.println(al2);
			
			System.out.println("Remove index 3");
			System.out.println(al);
			al.remove(3);
			System.out.println(al);
			
//			System.out.println("Remove all index");
//			System.out.println(al);
//			al.removeAll(al);
//			System.out.println(al);
			
			System.out.println("Retaining all elements compares al AL with al2");
			System.out.println("Before retaining elements");
			System.out.println(al);
			System.out.println(al2);
			present=al.retainAll(al2);
			System.out.println(present);
			
			System.out.println("After retaining elements in arraylist");
			System.out.println(al);
			System.out.println(al2);
			
			System.out.println("Returning size of an AL");
			in=al.size();
			System.out.println(in);
			in=al2.size();
			System.out.println(in);
			in=a.size();
			System.out.println(in);
			
			System.out.println("Before soting an elements");
			System.out.println(al);
			System.out.println(al2);
			Collections.sort(al);
			Collections.sort(al2);
			
			System.out.println("After soting an elements");
			System.out.println(al);
			System.out.println(al2);
			
			System.out.println("Before reverse an elements");
			System.out.println(al);
			System.out.println(al2);
			Collections.reverse(al);
			Collections.reverse(al2);
			
			System.out.println("After reversing an elements");
			System.out.println(al);
			System.out.println(al2);
			
			
			System.out.println("Trim to size");
			al2.trimToSize();
			System.out.println(al2);
			
			ArrayListForAllMethods alf = new ArrayListForAllMethods();
			alf.checkAnArrayListHasTheGivenValue(al2, 10);
			alf.checkAnArrayListHasTheGivenValue(al2, 11);
	}
	
	public void checkAnArrayListHasTheGivenValue(ArrayList<Integer> al, Integer a) {
		System.out.println(al.contains(a));
	}
	
	
}
