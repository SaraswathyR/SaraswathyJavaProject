package overriding;

public class ReturnTypeOverridingDemo2 extends Parent1{

	public static void main(String[] args) {

		Parent1 test1 = new ReturnTypeOverridingDemo2();
		test1.buySoap();
		test1.buyShampoo();
	}
	
	
//	Overrided method
	public int buySoap() {
		System.out.println("Buy Lux soap");
		return 0;
	}
	
	public int buyShampooA() {
		System.out.println("Buy Dove shampoo");
		return 0;
	}
	

}

class Parent1 {
	
//	Overridden method
	public int buySoap() {
		System.out.println("Buy Hamam soap");
		return 10;
	}
	
	public String buyShampoo() {
		System.out.println("Buy chick Shampoo");
		return "Chick";
	}
	
}