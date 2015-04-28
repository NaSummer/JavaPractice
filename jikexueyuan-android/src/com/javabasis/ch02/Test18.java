package com.javabasis.ch02;

import java.util.Scanner;

public class Test18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Name:");
		String name = scanner.next();
		
		System.out.print("Gender:");
		String gender = scanner.next();
		
		System.out.print("Age:");
		int age = scanner.nextInt();
		
		System.out.print("Height:");
		double height = scanner.nextDouble();
		
		System.out.print("Character:");
		String character = scanner.next();
		
		System.out.println("Hi, everybody! My name is " + name + ". " 
				+ "I'm " + age + " years old and " + height + " meters tall. "
				+ "I'm a " + character + " " + gender + ".");
		
		scanner.close();
		
	}

}
