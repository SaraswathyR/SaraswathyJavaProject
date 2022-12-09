package examples;

public class GreatestOfThree {

	public static void main(String[] args) {
		int a = 40;
		int b = 50;
		int c = 30;

		if (a > b && a > c) {
			System.out.println(a + "is bigger number");
		} else if (b > c) {
			System.out.println(b + "is bigger number");
		}
//		if (c > a && c > b) {
		else {
			System.out.println(c + "is bigger number");
		}
	}
}
