package quiz01;

import java.util.Scanner;

public class TestPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = "abc12cba";
		System.out.println(testPalindrome(text));
	}
	
	public static boolean testPalindrome(String text) {
//		int middle = text.length() / 2;
		int length = text.length();
		
		for (int i = 0; i <= text.length() / 2; i++) {
			if (text.charAt(i) != text.charAt(length-i-1)) {
				return false;
			} 
		}
		
		return true;
		
	}

}
