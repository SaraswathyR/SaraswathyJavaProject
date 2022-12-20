package collectionsPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {

	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(1,0);
	list.add(4);
	list.add(null);
	list.add(null);
	list.add(null);
	list.add(null);
	list.add(5);
	list.add(6);
	list.add(5,7);
	list.add(10,8);
	System.out.println(list.size());
	System.out.println(list.indexOf(8));
	System.out.println(list.indexOf(6));
	System.out.println(list);
		
    HashSet<String> set= new HashSet<String>();
    
    System.out.println("&&&&&&&&& Using For loop &&&&&&&&&&&&");
    for(int i=0;i<list.size();i++) {
    	System.out.println(list.get(i));
    }
    	
    System.out.println("&&&&&&&&&& Using For Each &&&&&&&&&&&");
    for(Integer each:list) {
    	System.out.println(each);
    }
	
    System.out.println("&&&&&&&&&& Using set replace value &&&&&&&&&&&");
    list.set(5, 20);
    System.out.println(list);
	
    System.out.println("&&&&&&&&&& Remove values using index &&&&&&&&&&&");
    list.remove(6);
    System.out.println(list);
    
    System.out.println("&&&&&&&&&& Cloned List &&&&&&&&&&&");
    ArrayList<Integer> list1= (ArrayList<Integer>) list.clone();
    System.out.println(list1);
    
    System.out.println("&&&&&&&&&& Using For Each using lambda expression &&&&&&&&&&&");
   list1.forEach(a-> System.out.println(a));
   list.forEach(a->System.out.println(a));
   
//   System.out.println("&&&&&&&&&& Using Iterator &&&&&&&&&&&");
//   Iterator<Integer> iterator=list.iterator();
//   while(iterator.hasNext()) {
//	    Integer listcount=iterator.next();
//	    System.out.println(listcount);
	    
	System.out.println("&&&&&&&&&&&&& Remove value using index&&&&&&&&&&&&&&");
	System.out.println(list);
	   list.remove(4);
	   a= list.remove(7);
	   System.out.println(a);
	   
	   System.out.println("&&&&&&&&&&&&& Remove all index&&&&&&&&&&&&&&");
		System.out.println(list);
		   list.removeAll(list);
		   System.out.println(list);
   }
   
	}
	
	
	


