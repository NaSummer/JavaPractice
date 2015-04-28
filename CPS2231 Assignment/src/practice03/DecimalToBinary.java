package practice03;

import java.util.Scanner;

class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal number:");
		StringBuilder decStr = new StringBuilder(sc.nextLine());
		int dec = stringToInt(decStr);
		String bin = decimalToBinary(dec);
		System.out.print("Binary: " + bin);
	}
	
	public static String decimalToBinary(int dec) {
		String binStr = "";
		while (dec > 0) {
			binStr = (dec % 2) + binStr;
			dec = dec / 2;
		}
		return binStr;
	}
	
	public static int stringToInt(StringBuilder decStr) {
		int dec = 0;
		for (int i = decStr.length()-1; i >= 0; i--) {
			switch (decStr.charAt(i)) {
			case '1':
				dec += (int) Math.pow(10, decStr.length()-1-i)*1;
				break;
			case '2':
				dec += (int) Math.pow(10, decStr.length()-1-i)*2;
				break;
			case '3':
				dec += (int) Math.pow(10, decStr.length()-1-i)*3;
				break;
			case '4':
				dec += (int) Math.pow(10, decStr.length()-1-i)*4;
				break;
			case '5':
				dec += (int) Math.pow(10, decStr.length()-1-i)*5;
				break;
			case '6':
				dec += (int) Math.pow(10, decStr.length()-1-i)*6;
				break;
			case '7':
				dec += (int) Math.pow(10, decStr.length()-1-i)*7;
				break;
			case '8':
				dec += (int) Math.pow(10, decStr.length()-1-i)*8;
				break;
			case '9':
				dec += (int) Math.pow(10, decStr.length()-1-i)*9;
				break;
				
			default:
				break;
			}
		}
		return dec;
	}
	
}
