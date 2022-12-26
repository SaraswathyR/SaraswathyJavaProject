package collectionsPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPractise {

	public static void main(String[] args) {

		HashMap <Integer, String> studentdata=new HashMap <Integer, String> ();
		studentdata.put(001,"Saras");
		studentdata.put(002,"Saras");
		studentdata.put(null, "SARAS");
		studentdata.put(003,"Mouni");
		studentdata.put(004,"Raghu");
		studentdata.put(005,null);
		studentdata.put(006,"Vijay");
		studentdata.put(007,"Madhu");
		studentdata.put(null, "Ashwin");
		studentdata.put(006,"Sudha");
//		studentdata.put(008,"Saku");
		System.out.println(studentdata);
		
		
		//Using keySet() to return Key values
	
	Set <String> key = studentdata.keySet();
	for(String customerid :key) {
	System.out.println(customerid);
	}

	//Using Values() to return value
	Collection<String> value = studentdata.values();
	for(String bankname :value) {
	System.out.println(bankname);
	}
	
	HashSet<String> hs= new HashSet<String>();
	Collection<String> cs=studentdata.values();
	System.out.println(cs);
	for(String dupvalues:cs) {
		hs.add(dupvalues);
	}
	System.out.println("***After removing duplicates using HashSet***");
	System.out.println(hs);

	
	
	HashMap <Integer, String> hs1 = new HashMap <Integer, String> ();
	System.out.println("***Put all is to add values to another map***");
	hs1 .putAll(studentdata);
	System.out.println(hs);
	


	
	System.out.println("********* Iterating keys alone ********");
	Iterator <String>  bankDetailsIterator = studentdata.keySet().iterator();
	while(bankDetailsIterator.hasNext()) {
		System.out.println(bankDetailsIterator.next());
	}
	
	System.out.println("********* Iterating Map values alone ********");
	Iterator <String>  bankDetailsValueIterator = studentdata.values().iterator();
	while(bankDetailsValueIterator.hasNext()) {
		System.out.println(bankDetailsValueIterator.next());
	}
	
	System.out.println("********entrySet() method ******");
	Iterator<Map.Entry<String, String>> entrySetIterator = studentdata.entrySet().iterator();
	while(entrySetIterator.hasNext()) {
		System.out.println(entrySetIterator.next());
	}



	}}
