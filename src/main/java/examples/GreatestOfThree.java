package examples;

public class GreatestOfThree implements PracticeInterface {
	

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;

		if(a>b && a>c) {
			
			System.out.println(a + "is bigger number");
		}
		else
			if(b>c && b>a) {
				System.out.println(b + "is bigger number");
			}
			else 
				if(c>a && c>b) {
					System.out.println(c + "is bigger number");
				}
		
	}

	@Override
	public void method100() {
		// TODO Auto-generated method stub
		
	}

}
