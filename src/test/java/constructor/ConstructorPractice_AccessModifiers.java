package constructor;

public class ConstructorPractice_AccessModifiers {
	
//	Constructor using access modifier
//		* if we put constructor as private, we can not create object for that class in any other class or sub class
//		* if we put constructor as protected or default or public, we can create object in any class
	
	private ConstructorPractice_AccessModifiers() {
		
	}
	
	protected ConstructorPractice_AccessModifiers(int a) {
		
	}
	
	public void method1() {
		System.out.println("I am a simple method from ConstructorPractice2 class");
	}

	public static void main(String[] args) {
		ConstructorPractice_AccessModifiers obj = new ConstructorPractice_AccessModifiers();
		

	}

}

class dummyClass {
	public void method2() {
		ConstructorPractice_AccessModifiers obj = new ConstructorPractice_AccessModifiers(10);
//		ConstructorPractice_AccessModifiers obj1 = new ConstructorPractice_AccessModifiers();
		obj.method1();
	}
}

class child1 extends ConstructorPractice_AccessModifiers {
	public void method3() {
		method1();
	}
}


