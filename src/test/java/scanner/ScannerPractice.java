package scanner;

import java.io.PrintStream;
import java.util.Scanner;

public class ScannerPractice {
	
	static PrintStream obj;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	}
	
	public void learnScanner() {

//		Scanner scan = new Scanner(InputStream is);
		Scanner scan = new Scanner(System.in);
		
//		System.out.println();
		
//		PrintStream obj = new PrintStream()
//				obj.println();
//		if we calling from different class, ScannerPractice.obj
		
//		System.out
//			out is a PrintStream class's static object variable created in System class
//			by using this object(System.out) we can call all the methods present in PrintStream class
		
		
		System.out.println(true);
		System.out.println('c');
		System.out.println("abc");
		
		System.out.print('c');
		System.out.print("Sathya");
		
		System.out.println("Please enter a number: ");
		int inputFromUser = scan.nextInt();
		System.out.println("You have entered "+inputFromUser);
		System.out.print("Please enter your name: ");
		scan.next();
		
		
		
		System.out.println("Please enter 10 numbers");
//		scan.nextInt();
//		scan.nextInt();
//		scan.nextInt();
//		scan.nextInt();
//		scan.nextInt();
//		scan.nextInt();
//		scan.nextInt();
//		scan.nextInt();
//		scan.nextInt();
		for(int i = 1; i<=10; i++ ) {
			scan.nextInt();
		}
		 

	}

}
