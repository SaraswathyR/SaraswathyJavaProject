package practiceBasicsOfJava;

public class ReturnTypeUsingClassVariable {
	
	static int returnamount;

	public static void main(String[] args) {
		ReturnTypeUsingClassVariable obj = new ReturnTypeUsingClassVariable();
		obj.buySoap();
		obj.method();
		obj.methodWithClassVariableReturnType();
		obj.changeClassVariableValue();


	}

	public int buySoap() {
		int a =60;
		return a;
				
	}
	public int method() {
		return returnamount;
	}
	
	int amount;
	public void methodWithClassVariableReturnType() {
		System.out.println(amount);//0
		amount = buySoap();
		System.out.println(amount);//50
   	}
	
	public void changeClassVariableValue() {
		System.out.println(amount); //50
		amount = 51;
		System.out.println(amount);
	}
}

