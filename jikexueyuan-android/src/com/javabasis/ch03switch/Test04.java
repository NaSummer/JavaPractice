package com.javabasis.ch03switch;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input five-grade score: ");
		int score = scanner.nextInt();
		
		switch (score) {
		case 5:
			System.out.println("Perfect");
			break;
		case 4:
			System.out.println("Good");
			break;
		case 3:
			System.out.println("OK");
			break;
		case 2:
		case 1:
		case 0:
			System.out.println("Poor");
			break;
		default:
			System.out.println("Your input is wrong.");
			break;
		}
		
		scanner.close();
	}

}
