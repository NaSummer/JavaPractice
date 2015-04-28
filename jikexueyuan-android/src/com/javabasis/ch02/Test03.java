package com.javabasis.ch02;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Name:");
		String name = scanner.next();
		
		System.out.println("Your name is " + name + ".");
		
		scanner.close();
	}

}
