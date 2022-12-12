package examples;

public class Constructor {

	public Constructor() {
		System.out.println("Default Constructor");
	}
	protected Constructor(int a) {
		System.out.println("Paramterized Constructor with one int paramater");
	}
	private Constructor(int a, String b) {
		System.out.println("Paramterized Constructor with two paramater");
	}
	Constructor(String b) {
		System.out.println("Paramterized Constructor with one String paramater");
	}
	public void method1() {
		System.out.println("Default method");
	}
	public void method2(int a) {
		System.out.println("Method with one int paramater");
	}
	public void method3(int a, String b) {
		System.out.println("Method with two paramater");
	}
	public void method4(String b) {
		System.out.println("Method with one String paramater");
	}
	public static void main(String[] args) {
//		Constructor cons = new Constructor();
//		cons.method1();
//		cons.method2(0);
//		cons.method3(0, null);
//		cons.method4(null);
		Constructor cons = new Constructor(10,"SARAS");
		cons.method1();
		cons.method2(0);
		cons.method3(0, null);
		cons.method4(null);
		

	}
	
		
	

}
class Dummy1{
	public void method10() {
		Constructor obj =new Constructor();
		Constructor obj1=new Constructor(0);
		Constructor obj2=new Constructor(null);
		Constructor obj3=new 
		
		
	}
}
