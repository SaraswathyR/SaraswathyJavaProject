package overRiding;

public class OverRidingpractice extends Parent {
	public static void method1() {
		System.out.println("This is method1");
	}
	public int method2(int s){
		System.out.println(s+ "This is method2");
		return 0;
		
	}
	public static void main(String[] args) {
		
		Parent obj1=new Parent();
		method1();
		obj1.method2(150);
		
		OverRidingpractice obj2=new OverRidingpractice();
		method1();
		obj2.method2(200);
		
	Parent obj= new OverRidingpractice();
	method1();
	}

}

class Parent{
	public static void method1() {
		System.out.println("This is method10");
	}
	public int method2(int s){
		System.out.println("this is integer");
		return 0;
	}
	
}