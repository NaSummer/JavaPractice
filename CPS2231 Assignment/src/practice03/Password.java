package practice03;

import java.util.Scanner;

class Password {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Password Resquest:\n"
				+ "At least 6 characters, at most 12 characters\n"
				+ "Must contain: uppercase letter, lowercas letter and digits\n"
				+ "Must contain at least 3 digits\n"
				+ "Must end with an exclamatory mark (!)\n");

		System.out.println("Please enter your password: ");
		String pwd = sc.nextLine();
		
		if (isLegal(pwd)) {
			System.out.println("Good Password!");
		} else {
			String YorN = "";
			do {
				if (!isLenghtEnough(pwd)) {
					System.out.println("The lenght of your password must be at least 6 characters and at most 12 characters");
				}
				if (!isContainUppercase(pwd)) {
					System.out.println("Your password must contain at least 1 uppercase letter");
				}
				if (!isContainLowercase(pwd)) {
					System.out.println("Your password must contain at least 1 lowercase letter");
				}
				if (!is3digits(pwd)) {
					System.out.println("Your password must contain at least 3 digits");
				}
				if (!isEndWithExclamatoryMark(pwd)) {
					System.out.println("Your password must end with an exclamatory mark(!)");
				}
				System.out.println("Do you want to try again? (yes/no)");
				YorN = sc.nextLine();
				if (isAgain(YorN)) {
					System.out.println("Please enter your password: ");
					pwd = sc.nextLine();
				} else {
					break;
				}
				
			} while ((!isLegal(pwd)));
			if (isAgain(YorN)) {
				System.out.println("Good Password!");				
			}
		}

		System.out.println("Halt.");
		
	}
	
	private static boolean isLegal(String pwd) {
		if ( (pwd.length()>=6)&&(pwd.length()<=12) ) {
			if (isContainUppercase(pwd)) {
				if (isContainLowercase(pwd)) {
					if (is3digits(pwd)) {
						if (isEndWithExclamatoryMark(pwd)) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	private static boolean isLenghtEnough(String str) {
		if ( (str.length()>=6)&&(str.length()<=12) ) {
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean isContainUppercase(String str) {
		String tmpStr = str.toLowerCase();
		if (str.equals(tmpStr)) {
			return false;
		} else {
			return true;
		}
	}
	
	private static boolean isContainLowercase(String str) {
		String tmpStr = str.toUpperCase();
		if (str.equals(tmpStr)) {
			return false;
		} else {
			return true;
		}
	}
	
	private static boolean is3digits(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if ( (str.charAt(i)>=48) && (str.charAt(i)<=57)) {
				count++;
			}
		}
		if (count >= 3) {
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean isEndWithExclamatoryMark(String str) {
		return str.endsWith("!");
	}
	
	private static boolean isAgain(String str) {
		Scanner sc = new Scanner(System.in);
		boolean isLegal = false;
		do {
			isLegal = false;
			str = str.toLowerCase();
			if ( str.contains("y") ) {
				isLegal = true;
				return true;
			} else if ( str.contains("n") ) {
				isLegal = true;
				return false;
			}
			System.out.println("Your enter is wrong. Please enter again.\n" + "Do you want to try again? (yes/no)");
			str = sc.nextLine();
		} while (!isLegal);
		return false;
	}

}
