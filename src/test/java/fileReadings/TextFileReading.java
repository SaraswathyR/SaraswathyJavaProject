package fileReadings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReading {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\LENOVO\\git\\SaraswathyJavaProject\\src\\test\\resources\\MyTextFile.txt");
		
		FileReader reader = new FileReader(file);
		
		BufferedReader bf = new BufferedReader(reader);
		
//		System.out.println(bf.readLine());
		
		while(bf.readLine() != null) {
			System.out.println(bf.readLine());
		}
		
//		bf.close();
		
	}

}
