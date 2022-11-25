package constructor;

public class ConstructorSchoolDemo1 {

	public String rollNo, name, age;
	public String standard = "I std";

	public ConstructorSchoolDemo1() {

	}

	public ConstructorSchoolDemo1(String rollNo, String name, String age, String standard) {

		System.out.println(rollNo + "   " + name + "   " + age + "   " + standard);
	}

	public ConstructorSchoolDemo1(String rollNo, String name, String age) {

		System.out.println(rollNo + "   " + name + "   " + age + "   " + standard);
	}

	public static void main(String[] args) {

		ConstructorSchoolDemo1 student1 = new ConstructorSchoolDemo1();
		student1.rollNo = "1";
		student1.name = "A";
		student1.age = "10";
//		student1.standard = "LKG";
		System.out
				.println(student1.rollNo + "   " + student1.name + "   " + student1.age + "     " + student1.standard);

		ConstructorSchoolDemo1 student2 = new ConstructorSchoolDemo1();
		student2.rollNo = "2";
		student2.name = "B";
		student2.age = "10";
//		student2.standard = "LKG";
		System.out
				.println(student2.rollNo + "   " + student2.name + "   " + student2.age + "     " + student2.standard);

		ConstructorSchoolDemo1 student3 = new ConstructorSchoolDemo1("3", "C", "11", "I std");
		ConstructorSchoolDemo1 student4 = new ConstructorSchoolDemo1("4", "D", "10");

	}

}
