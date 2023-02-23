package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	
    @BeforeSuite
	public void beforeSuite() {
		System.out.println("I am beforesuite");
	}
	
    @BeforeTest
	public void beforeTest() {
		System.out.println("I am beforeTest");
	}
	
    @BeforeClass
	public void beforeclass() {
		System.out.println("I am beforeclass");
	}
	
    @BeforeGroups
	public void beforegroup() {
		System.out.println("I am beforegroup");
	}
	
    @BeforeMethod
	public void beforemethod() {
		System.out.println("I am beforemethod");
	}
	
    @AfterSuite
	public void afterSuite() {
		System.out.println("I am aftersuite");
	}
	
    @AfterTest
	public void afterTest() {
		System.out.println("I am afterTest");
	}
	
    @AfterClass
	public void afterclass() {
		System.out.println("I am afterclass");
	}
	
    @AfterGroups
	public void aftergroup() {
		System.out.println("I am aftergroup");
	}
	
    @AfterMethod
	public void aftermethod() {
		System.out.println("I am aftermethod");
	}
    
    public void AnnotationsBasedOnPriority1() {
		System.out.println("I am Priority1");
	}
    
    public void AnnotationsBasedOnPriority2() {
		System.out.println("I am Priority2");
	}
    

    public void AnnotationsBasedOnPriorityminus1() {
		System.out.println("I am Priority-1");
	}
    
    public void AnnotationsBasedOnPriority0() {
		System.out.println("I am Priority0");
	}
    
    
    public static void main(String[] args) {
		
	}
    
    
    
    

}
