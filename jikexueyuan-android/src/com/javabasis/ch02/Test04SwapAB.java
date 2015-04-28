package com.javabasis.ch02;

import java.util.Scanner;

public class Test04SwapAB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input A: ");
		int a = scanner.nextInt();
		System.out.print("Input B: ");
		int b = scanner.nextInt();
		
		System.out.println("A=A+B=" + a + "+" + b + "=" + (a+b));
		a = a + b;
		System.out.println("B=A-B=" + a + "-" + b + "=" + (a-b));
		b = a - b;
		System.out.println("A=A-B=" + a + "-" + b + "=" + (a-b));
		a = a - b;
		
		System.out.println("A=" + a +"\nB=" + b);
		
		scanner.close();
		
	}

}
