package practiceBasicsOfJava;

public class VariableAndReturnUsingEg {
	int a=10;
	static String str="Apps";

	public static void main(String[] args) {
		
		VariableAndReturnUsingEg obj= new VariableAndReturnUsingEg();
		obj.Calculator();
		Camera();
		String Pictures = obj.Gallery("photos");
		System.out.println(Pictures);
		whatsapp();
		

	}
	public int Calculator() {
		int b= 50;
		int total = a +b ;
		System.out.println(total);
		return total;
		
	}
	
	public static void Camera() {
		System.out.println("Open camera and take pictures");
	
	}

	public String Gallery(String photos) {
		return photos;
		
	}
	static public void whatsapp() {
		System.out.println("Show messages");
		
	}
}
