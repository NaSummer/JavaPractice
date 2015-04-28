package com.javabasis.ch03switch;

import java.util.Scanner;

public class Test15If {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a five-grade score: ");
		int score = scanner.nextInt();
		if (score==5){
			System.out.println("Perfect");
		}else if (score==4) {
			System.out.println("Good");
		}else if (score==3) {
			System.out.println("OK");
		}else if (score<=2&&score>=0) {
			System.err.println("Poor");
		}else {
			System.err.println("Your input is wrong.");
		}
		
		scanner.close();
		
	}

}
