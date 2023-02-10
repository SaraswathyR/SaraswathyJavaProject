package stringPracticeExamples;

import java.util.Arrays;

public class TwoStringIsAnagram {

	public static void main(String[] args) {
		String str1="Army";
		String str2="mary";
		
		System.out.println("Check whether two strings are anagram:" +isAnagram(str1,str2));

	}

	public static boolean isAnagram(String str1, String str2) {
		char[] str1charArray= str1.toLowerCase().toCharArray();
		char[] str2charArray= str2.toLowerCase().toCharArray();
		Arrays.sort(str1charArray);
		Arrays.sort(str2charArray);
		return Arrays.equals(str1charArray, str2charArray);
	}

}
