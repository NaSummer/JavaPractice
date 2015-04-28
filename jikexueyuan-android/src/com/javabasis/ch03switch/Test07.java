package com.javabasis.ch03switch;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input the month: ");
		int month = scanner.nextInt();
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("There are 30 days in that month.");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("There are 31 days in that month.");
			break;
		case 2:
			System.out.println("There are 28 days in that month.");
			break;
		default:
			System.out.println("Your input is wrong.");
			break;
		}
		
		scanner.close();
		
	}

}
