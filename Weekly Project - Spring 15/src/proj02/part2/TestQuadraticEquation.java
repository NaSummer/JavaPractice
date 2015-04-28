package proj02.part2;

import java.util.Scanner;

class TestQuadraticEquation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		printResult(new QuadraticEquation());
		printResult(new QuadraticEquation(4, -4, -3));
		printResult(new QuadraticEquation(4, 4, 3));
		
		System.out.print("Would you like to solve new Quadratic Equation ax^2+bx+c=0 (Y/N)?");
		String yn = scanner.next();
		while ( ((yn.indexOf("Y")!=-1) || (yn.indexOf("y")!=-1)) ) {
			System.out.print("Please input \"a\":");
			int a = scanner.nextInt();
			System.out.print("Please input \"b\":");
			int b = scanner.nextInt();
			System.out.print("Please input \"c\":");
			printResult(new QuadraticEquation(a,b,scanner.nextInt()));
			
			System.out.print("Would you like to solve new Quadratic Equation ax^2+bx+c=0 (Y/N)?");
			yn = scanner.next();
		}
		
		System.out.println("Halt.");
	}

	public static void printResult(QuadraticEquation equation) {
		double discriminant = equation.getDiscriminant();
		double a = equation.getA();
//		double b = equation.getB();
//		double c = equation.getC();
		int decimal = 4;
		
		if (a == 0) {
			System.err.println("\"a\" can not be 0 in a quadratic equation.");
		} else {
			System.out.println("The Discriminant of the default equation: " + discriminant);
			
			if (discriminant > 0) {
				System.out.println("The equation \"" + equation.printEquation() + "\" has 2 roots: " + (Math.round( equation.getRoot1() * ( (int)Math.pow(10, decimal) ) / ( (int)Math.pow(10, decimal) ) ) ) + ", " + (Math.round( equation.getRoot2() * ( (int)Math.pow(10, decimal) ) / ( (int)Math.pow(10, decimal) ) ) ));
			} else if (discriminant == 0){
				System.out.println("The equation \"" + equation.printEquation() + "\" has 1 root: " + (Math.round( equation.getRoot1() * ( (int)Math.pow(10, decimal) ) / ( (int)Math.pow(10, decimal) ) )) );
			} else {
				System.out.println("The equation \"" + equation.printEquation() + "\" has no roots.");
			}
			
		}
		
	}

	
}
