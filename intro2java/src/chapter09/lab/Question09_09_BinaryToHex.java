package chapter09.lab;

import java.util.Scanner;

public class Question09_09_BinaryToHex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a binary number:");
		String binary = sc.nextLine();
		System.out.println("The corresponding hexadecimal value:\n"+binaryToHex(binary));
		
	}
	
	public static String binaryToHex(String binaryValue) {
		int decimalism = 0;
		for (int i = binaryValue.length()-1; i >= 0; i--) {
			if (binaryValue.charAt(i)=='1') {
				decimalism += Math.pow(2, binaryValue.length()-1-i);
			}
		}
		int factor = decimalism;
		int remainder = 0;
		String hex = "";
		while (factor > 0) {
			remainder = factor % 16;
			switch (remainder) {
			case 10:
				hex = "A" + hex;
				break;
			case 11:
				hex = "B" + hex;
				break;
			case 12:
				hex = "C" + hex;
				break;
			case 13:
				hex = "D" + hex;
				break;
			case 14:
				hex = "E" + hex;
				break;
			case 15:
				hex = "F" + hex;
				break;

			default:
				hex = remainder + hex;
				break;
			}
			factor = factor / 16;
		}
		return hex;
	}

}
