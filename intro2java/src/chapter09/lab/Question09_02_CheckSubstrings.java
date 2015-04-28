package chapter09.lab;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Question09_02_CheckSubstrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("This program will check whether the first string is a substring of the secound.");
		System.out.print("Please Enter the First String:");
		String str1 = scanner.nextLine();
		System.out.print("Please Enter the Secound String:");
		String str2 = scanner.nextLine();
		if (isSubstring(str1, str2)) {
			System.out.println("The first string is the substring of the secound.");
//			int indexOfStrat = str2.indexOf(str1);
//			for (int i = 0; i < indexOfStrat; i++) {
//				System.out.print(str2.charAt(i));
//			}
//			System.err.print(str1);
//			for (int i = (indexOfStrat+str1.length()) ; i < str2.length(); i++) {
//				System.out.print(str2.charAt(i));
//			}
//			System.out.println();
		} else {
			System.out.println("The first string isn't the substring of the secound.");
		}
		System.out.println("Halt.");
	}
	
	private static boolean isSubstring(String str1, String str2) {
		if (str2.indexOf(str1)!=-1) {
			return true;
		}else {
			return false;
		}
	}
	
}