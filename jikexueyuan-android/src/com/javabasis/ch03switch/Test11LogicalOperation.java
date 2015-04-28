package com.javabasis.ch03switch;

import java.util.Scanner;

public class Test11LogicalOperation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please input an five-grade score: ");
		int score = scanner.nextInt();
		boolean isFiveGrade = !(score<0 || score>5);
		System.out.println(score + " is an five-grade score: " + isFiveGrade);
		
		scanner.close();
		
	}

}
