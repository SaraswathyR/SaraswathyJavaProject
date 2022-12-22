package collectionsPractice;

import java.util.HashSet;

public class HashSetPractice {

	public static void main(String[] args) {
	HashSet<Integer> hs= new HashSet<Integer>();
	HashSet<String> hs1= new HashSet<String>();
	
	System.out.println("Adding values and does not allow duplicate values");
	hs.add(1);
	hs.add(2);
	hs.add(3);
	hs.add(4);
	hs.add(5);
	hs.add(2);
	System.out.println(hs);
	
	System.out.println("Adding values and does not allow duplicate values");
	hs1.add("Saras");
	hs1.add("saras");
	hs1.add("SARAS");
	hs1.add("Raghu");
	hs1.add("Mouni");
	System.out.println(hs1);
	

	}

}
