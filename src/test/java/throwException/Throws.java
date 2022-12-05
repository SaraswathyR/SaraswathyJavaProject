// * throw keyword we uses to throw an exception voluntarily which we predict during compile time itself
// * Whenever we throw an exception, the method associated needs to have throws keyword followed by respective Exception(eg: IOException)
//		or its super class(Exception).
// * We generally use throw keyword to throw custom created exceptions
// * All other exceptions except Runtime exceptions can be threw during compile time.
//		* means, we can not throw Exception which extends to RunTimeException class. 
//		* RunTimeExceptions need to be dealt with try catch blocks

package throwException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;

public class Throws {

//		public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
	public static void main(String[] args) throws Exception {

//		throw new IOException();

//		throw new ClassNotFoundException();

//		throw new SQLException();

//		throw new ArithmeticException();

//		method1();

		method3();

		Throws obj = new Throws();

		File file = new File("test.txt");
//		FileInputStream fis = new FileInputStream(file);
//		System.out.println(fis.read());

	}

	public static void method1() throws IOException {
		throw new IOException();

//		System.out.println("I am method1");
	}

	public static void method2() throws Exception {
		method1();
	}
	
	public static void method4() {
		try {
		throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void method3() {
		System.out.println("hello");
	}

}
