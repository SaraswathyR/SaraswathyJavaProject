package fileReadings;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	String pathForMyFile = "C:\\Users\\LENOVO\\git\\SaraswathyJavaProject\\src\\test\\resources\\MyPropertyFile.properties";

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileReader reader = new FileReader("C:\\Users\\LENOVO\\git\\SaraswathyJavaProject\\src\\test\\resources\\MyPropertyFile.properties");
		
		prop.load(reader);
		
		System.out.println(prop.getProperty("name"));
		
		String userAge = prop.getProperty("age");
		
		
		PropertyReader propReader = new PropertyReader();
		propReader.readAProperty("C:\\Users\\LENOVO\\git\\SaraswathyJavaProject\\src\\test\\resources\\MyPropertyFile.properties", "age");
	}
	
	public void readAProperty(String filePath, String propName) throws IOException {
		Properties prop = new Properties();
		FileReader reader = new FileReader(filePath);
		
		prop.load(reader);
		System.out.println(prop.getProperty(propName));
	}
	
	public String readAProperty(String propName) throws IOException {
		Properties prop = new Properties();
		FileReader reader = new FileReader("C:\\Users\\LENOVO\\git\\SaraswathyJavaProject\\src\\test\\resources\\MyPropertyFile.properties");
		
		prop.load(reader);
		return prop.getProperty(propName);
	}

}
