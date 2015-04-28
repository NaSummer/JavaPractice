package chapter08.lab;

import java.util.Scanner;

public class TestLineraEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter a: ");
		double a = sc.nextDouble();
		System.out.print("Please Enter b: ");
		double b = sc.nextDouble();
		System.out.print("Please Enter c: ");
		double c = sc.nextDouble();
		System.out.print("Please Enter d: ");
		double d = sc.nextDouble();
		System.out.print("Please Enter e: ");
		double e = sc.nextDouble();
		System.out.print("Please Enter f: ");
		double f = sc.nextDouble();
		
		LineraEquation lineraEquation = new LineraEquation(a, b, c, d, e, f);
		if (lineraEquation.isSolvable()) {
			System.out.println("X is " + lineraEquation.getX());
			System.out.println("Y is " + lineraEquation.getY());
		} else {
			System.out.println("THe equation has no solution.");
		}
		
	}

}
