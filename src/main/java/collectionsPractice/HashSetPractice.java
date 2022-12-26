package collectionsPractice;

import java.util.HashSet;

public class HashSetPractice {
	static boolean b;

	public static void main(String[] args) {
	HashSet<Integer> hs= new HashSet<Integer>();
	HashSet<String> hs1= new HashSet<String>();
	HashSet<Integer> hs2 = new HashSet<Integer>();
	
	System.out.println("Adding values and does not allow duplicate values");
	hs.add(1);
	hs.add(2);
	hs.add(3);
	hs.add(4);
	hs.add(5);
	hs.add(2);
	hs.add(null);
	
	System.out.println(hs);
	
	hs2.add(10);
	hs2.add(2);
	hs2.add(3);
	hs2.add(4);
	hs2.add(5);
	
	
	System.out.println(hs);
	
	System.out.println("Adding values and does not allow duplicate values");
	hs1.add("Saras");
	hs1.add("saras");
	hs1.add("SARAS");
	hs1.add("Raghu");
	hs1.add("Mouni");
	System.out.println(hs1);
	
	System.out.println("Add all into one set");
	b= hs.addAll(hs2);
	System.out.println(b);
	
	System.out.println("Before clear");
	System.out.println(hs1);
	hs1.clear();
	System.out.println("After clearing");
	System.out.println(hs1);
	
	System.out.println("Cloning");
	 Object o=hs.clone();
	 System.out.println(o);
	 
	 System.out.println();
	
	
	

	}

}
