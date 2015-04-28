package labexam01;

import java.util.Scanner;

public class LowercaseToUppercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		System.out.println("Revised String: \n" + lowercaseToUppercase(sc.nextLine()));
	}

	private static String lowercaseToUppercase(String str) {
		int numOfLowercase = 0;
		for (int i = 0; i < str.length(); i++) {
			if ( (str.charAt(i)>=97) && (str.charAt(i)<=122) ) {
				numOfLowercase++;
			}
		}
		if (numOfLowercase>1) {
			System.out.println("There are " + numOfLowercase + " lowercase charactors.");
		} else if (numOfLowercase==1) {
			System.out.println("There is " + numOfLowercase + " lowercase charactor.");
		} else {
			System.out.println("There is no lowercase charactor.");
		}
		
		return str.toUpperCase();
	}
	
}
