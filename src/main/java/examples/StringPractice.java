package examples;

public class StringPractice {

	public static void main(String[] args) {
		StringPractice SP=new StringPractice();
		SP.StringLengthMethodPractice();
		SP.StringIsEmptyMethodPractice();
		SP.StringCharATMethodPractice();
		SP.StringEqualMethodPractice();
        SP.StringEqualsIgnoreCaseMethodPractice();
		SP.StringContentEqualMethodPractice();
		SP.StringCompareToMethodPractice();
		SP.StringCompareToIgnoreCaseMethodPractice();
		SP.StringStartsWithMethodPractice();
		SP.StringEndsWithMethodPractice();
		SP.StringIndexOfMethodPractice();
		SP.StringLastIndexOfMethodPractice();
		
   
	}
	
	public void StringLengthMethodPractice() {
		String str="Saras";
		System.out.println(str.length());
		
		String str1="";
		System.out.println(str1.length());
		
		String str2=" ";
		System.out.println(str2.length());
		
		String str3="SARAS";
		System.out.println(str3.length());
		
		String str4="SArAS";
		System.out.println(str4.length());
		
		String str5="My name is Mounisha R";
		System.out.println(str5.length());
		
		}

	public void StringIsEmptyMethodPractice() {
		String str="Saras";
		System.out.println(str.isEmpty());
		
		String str1="";
		System.out.println(str1.isEmpty());
		
		String str2=" ";
		System.out.println(str2.isEmpty());
		
		
		}
	public void StringCharATMethodPractice() {
		
		String str="Saras";
		System.out.println(str.charAt(3));
		
//		String str1="";
//		System.out.println(str1.charAt(3));
		
		String str2="My name is Mounisha R";
		System.out.println(str2.charAt(3));
		
		}
	public void StringEqualMethodPractice() {
		
		String str="Saras";
		String st1="SARAS";
		String str1="Saras";
		String st2="SaRas";
		String str2="Raghu";
		
		System.out.println(str.equals(st1));
		System.out.println(str1.equals(st2));
		System.out.println(str2.equals(str));
		System.out.println(str.equals(str1));
		
		}
	
   public void StringEqualsIgnoreCaseMethodPractice() {
		
		String str="Saras";
		String st1="SARAS";
		String str1="Saras";
		String st2="SaRas";
		String str2="Raghu";
		
		System.out.println(str.equalsIgnoreCase(st1));
		System.out.println(str1.equalsIgnoreCase(st2));
		System.out.println(str2.equalsIgnoreCase(str));
		System.out.println(str.equalsIgnoreCase(str1));
		
		}
   public void StringContentEqualMethodPractice() {
		
	   String s1 = "My name is Mounisha";
		String s2 = "my name is Mouni";
		String s3 = "My name is Mounisha R";
		String s4 = "hello My name is Mounisha";
		String s5= "My name is Mounisha";
		
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.contentEquals(s3));
		System.out.println(s3.contentEquals(s1));
		System.out.println(s1.contentEquals(s4));
		System.out.println(s1.contentEquals(s5));
        
       }
   public void StringCompareToMethodPractice() {
		
	   String s1 = "My name is Mounisha";
		String s2 = "my name is Mouni";
		String s5= "My name is Mounisha";
		String s3="";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s5));
		System.out.println(s3.compareTo(s1));
   }
   
   
   public void StringCompareToIgnoreCaseMethodPractice() {
		
	   String s1 = "My name is Mounisha";
		String s2 = "my name is Mounisha";
		String s5= "My name is Mounisha";
		
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.compareToIgnoreCase(s5));
        
   }
   public void StringStartsWithMethodPractice() {
		
	   
	   String a = "My name is Mounisha";
		
		System.out.println(a.startsWith("M"));
		System.out.println(a.startsWith("na"));
		System.out.println(a.startsWith("Mouni"));
        
   }
   
  
   
   public void StringEndsWithMethodPractice() {
	   System.out.println("******************Endswith********************");   
		
	   String s1 = "Automation testing";
		
		System.out.println(s1.endsWith("testing"));
		System.out.println(s1.endsWith("ing"));
		System.out.println(s1.endsWith("g"));
        
   }
   
   public void StringIndexOfMethodPractice() {
	   System.out.println("******************IndexOf********************");   
		
	   String s1 = "Automation testing";
		
		System.out.println(s1.indexOf("A"));
		System.out.println(s1.indexOf("te"));
		System.out.println(s1.indexOf("ing"));
		System.out.println(s1.indexOf("t",4));
		
    }
   public void StringLastIndexOfMethodPractice() {
	   System.out.println("******************LastIndexOf********************");   
		
	   String s1 = "Automation testing";
		
		System.out.println(s1.lastIndexOf("tion"));
		System.out.println(s1.lastIndexOf("te"));
		System.out.println(s1.lastIndexOf("ing"));
		System.out.println(s1.lastIndexOf("t",4));
        
    }
	

}
