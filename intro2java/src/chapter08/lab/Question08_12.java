package chapter08.lab;

import java.util.Scanner;

public class Question08_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the endpoints of the first line segment: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		System.out.print("Enter the endpoints of the second line segment: ");
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		double x4 = sc.nextDouble();
		double y4 = sc.nextDouble();
		
		LineraEquation lineraEquation = new LineraEquation(y2-y1, x1-x2, y4-y3, x3-x4, x1*y2-x2*y1, x3*y4-x4*y3);
		
		if (lineraEquation.isSolvable()) {
			System.out.println("The intersecting point is: (" + lineraEquation.getX() + ", " + lineraEquation.getY() + ")");
		} else {
			System.out.println("Two lines don't have the intersecting point.");
		}
		
	}

}
