package constructor;

public class ConstructorPractice_Use {
	
	int a ; 
	int x; 
	final int b = 20;
	final int c; 
	
	public ConstructorPractice_Use() {
		a = 5;
		c = 20;
	}
	
	public ConstructorPractice_Use(int x) {
		a = x;
		this.x = x;
//		b = x;
		c = 25;
	}
	
	public void method1() {
		System.out.println(a);
		System.out.println(x);
		System.out.println(x = 30);
//		System.out.println(b = 25);
		System.out.println(c);
	}
	
	public void method2() {
		System.out.println(a);
		System.out.println(x);
		System.out.println(c);
	}

	public static void main(String[] args) {
		ConstructorPractice_Use obj = new ConstructorPractice_Use(); 
		obj.method1();
		
		ConstructorPractice_Use obj1 = new ConstructorPractice_Use(10);
		obj1.method2();
	}

}
