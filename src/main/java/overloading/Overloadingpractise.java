package overloading;

public class Overloadingpractise {
 
	int a;
	String str;
	
	public String buySoap12() {
		System.out.println("Buy soap");
		return null;
		}
	public void buySoap(String soapName) {
		System.out.println("Buy " + soapName + " soap");
	}

	public String buySoap(int soapAmount) {
		System.out.println("Buy soap for " + soapAmount);
		return "";
	}
	public static void main(String[] args) {

		Overloadingpractise od = new Overloadingpractise();

		System.out.println(od.a);
		System.out.println(od.str);
	}
}
	

	