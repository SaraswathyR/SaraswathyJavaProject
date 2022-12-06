package switchPractice;

//switch(intCondition) {
//case 1:
//	//content
//	//content
//case 2:
//	//diff content
//	//diff content
//case 3: 
//	//another diff content
//	//another diff content 
//
//}

public class SwitchPractice {

	public static void main(String[] args) {
		SwitchPractice obj = new SwitchPractice();
		obj.testSwitchCondtion("20");

		int atmNotes = 201;

		switch (atmNotes) {
		case 100:
			System.out.println("Give 100");
			break;
		case 200:
			System.out.println("Give 200");
			break;
		case 500:
			System.out.println("Give 500");
			break;
		default: 
			System.out.println("Please enter 100 or 200 or 500");
		}
		
		if(atmNotes == 100) {
			
		}
		
		else if(atmNotes == 200) {
			
		}
		else if(atmNotes == 500) {
			
		}
		else {
			
		}
			
	}


	public void testSwitchCondtion(String value) {
		switch (value) {
		case "10":
			method(100);
			break;
		case "50":
			method(500);
			break;
		case "100":
			System.out.println("Go to hotel");
			break;
		default:
			System.out.println("Stay home");

		}
	}

	public static void method(int val) {
		System.out.println(val);
	}

}
